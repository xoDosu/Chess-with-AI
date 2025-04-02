import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;

public class Board {

    /*array of buttons for each position on the chess board*/
    private final JButton[][] arrayofbuttons = new JButton[9][9];
    /*a map that stores the name of the areas of the chess board and their relative positions*/
    private Map<String, Position> positions = new HashMap<>();
    private Map<Position, JButton[][]> positionbuttons = new HashMap<>();

    public Board() {
        //initialization of components
        JFrame chess = new JFrame();
        JPanel panel = new JPanel();
        initializePositions();

        //board
        chess.setTitle("Chess");
        chess.setSize(800, 800);
        chess.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //panel
        panel.setLayout(new GridLayout(9, 9));
        panel.setBackground(Color.BLACK);
        panel.setBorder(BorderFactory.createLineBorder(Color.BLACK));

        //chess board buttons
        for (int rows = 1; rows < 9; rows++) {
            for (int colms = 1; colms < 9; colms++) {
                arrayofbuttons[rows][colms] = new JButton();

                /*alternating background colors*/
                Color bgColor = (rows + colms) % 2 == 0 ? Color.WHITE : new Color(139, 69, 19);

                arrayofbuttons[rows][colms].setBackground(bgColor);
                arrayofbuttons[rows][colms].setOpaque(true);
                arrayofbuttons[rows][colms].setBorderPainted(false);
                panel.add(arrayofbuttons[rows][colms]);
                arrayofbuttons[rows][colms].addActionListener(e -> {});
            }
        }
        chess.add(panel, BorderLayout.CENTER);
        chess.setVisible(true);
        setPieces();
    }

    public void getButton(){
        //gets the icon of a button

    }

    private void initializePositions() {
        // Map specific positions to their names
        positions.put("a1", new Position(1, 1));
        positions.put("a2", new Position(2, 1));
        positions.put("a3", new Position(3, 1));
        positions.put("a4", new Position(4, 1));
        positions.put("a5", new Position(5, 1));
        positions.put("a6", new Position(6, 1));
        positions.put("a7", new Position(7, 1));
        positions.put("a8", new Position(8, 1));

        positions.put("b1", new Position(1, 2));
        positions.put("b2", new Position(2, 2));
        positions.put("b3", new Position(3, 2));
        positions.put("b4", new Position(4, 2));
        positions.put("b5", new Position(5, 2));
        positions.put("b6", new Position(6, 2));
        positions.put("b7", new Position(7, 2));
        positions.put("b8", new Position(8, 2));

        positions.put("c1", new Position(1, 3));
        positions.put("c2", new Position(2, 3));
        positions.put("c3", new Position(3, 3));
        positions.put("c4", new Position(4, 3));
        positions.put("c5", new Position(5, 3));
        positions.put("c6", new Position(6, 3));
        positions.put("c7", new Position(7, 3));
        positions.put("c8", new Position(8, 3));

        positions.put("d1", new Position(1, 4));
        positions.put("d2", new Position(2, 4));
        positions.put("d3", new Position(3, 4));
        positions.put("d4", new Position(4, 4));
        positions.put("d5", new Position(5, 4));
        positions.put("d6", new Position(6, 4));
        positions.put("d7", new Position(7, 4));
        positions.put("d8", new Position(8, 4));

        positions.put("e1", new Position(1, 5));
        positions.put("e2", new Position(2, 5));
        positions.put("e3", new Position(3, 5));
        positions.put("e4", new Position(4, 5));
        positions.put("e5", new Position(5, 5));
        positions.put("e6", new Position(6, 5));
        positions.put("e7", new Position(7, 5));
        positions.put("e8", new Position(8, 5));

        positions.put("f1", new Position(1, 6));
        positions.put("f2", new Position(2, 6));
        positions.put("f3", new Position(3, 6));
        positions.put("f4", new Position(4, 6));
        positions.put("f5", new Position(5, 6));
        positions.put("f6", new Position(6, 6));
        positions.put("f7", new Position(7, 6));
        positions.put("f8", new Position(8, 6));

        positions.put("g1", new Position(1, 7));
        positions.put("g2", new Position(2, 7));
        positions.put("g3", new Position(3, 7));
        positions.put("g4", new Position(4, 7));
        positions.put("g5", new Position(5, 7));
        positions.put("g6", new Position(6, 7));
        positions.put("g7", new Position(7, 7));
        positions.put("g8", new Position(8, 7));

        positions.put("h1", new Position(1, 8));
        positions.put("h2", new Position(2, 8));
        positions.put("h3", new Position(3, 8));
        positions.put("h4", new Position(4, 8));
        positions.put("h5", new Position(5, 8));
        positions.put("h6", new Position(6, 8));
        positions.put("h7", new Position(7, 8));
        positions.put("h8", new Position(8, 8));
        // Add more positions as needed
    }

    private String getPositionName(int row, int col) {
        for (Map.Entry<String, Position> entry : positions.entrySet()) {
            Position pos = entry.getValue();
            if (pos.row == row && pos.col == col) {
                return entry.getKey();
            }
        }
        return null;
    }

    public void move(int row, int col) {}

    public void setPieces(){
        //this will set as the original state of the board

        /*back black pieces*/
        arrayofbuttons[1][1].setIcon(new ImageIcon(("C:/Users/samue/Documents/chess/chess/src/brook.png")));
        arrayofbuttons[1][2].setIcon(new ImageIcon(("C:/Users/samue/Documents/chess/chess/src/bbishop.png")));
        arrayofbuttons[1][3].setIcon(new ImageIcon(("C:/Users/samue/Documents/chess/chess/src/bknight.png")));
        arrayofbuttons[1][4].setIcon(new ImageIcon(("C:/Users/samue/Documents/chess/chess/src/bqueen.png")));
        arrayofbuttons[1][5].setIcon(new ImageIcon(("C:/Users/samue/Documents/chess/chess/src/bking.png")));
        arrayofbuttons[1][6].setIcon(new ImageIcon(("C:/Users/samue/Documents/chess/chess/src/bknight.png")));
        arrayofbuttons[1][7].setIcon(new ImageIcon(("C:/Users/samue/Documents/chess/chess/src/bbishop.png")));
        arrayofbuttons[1][8].setIcon(new ImageIcon(("C:/Users/samue/Documents/chess/chess/src/brook.png")));

        /*black pawns*/
        arrayofbuttons[2][1].setIcon(new ImageIcon(("C:/Users/samue/Documents/chess/chess/src/bpawn.png")));
        arrayofbuttons[2][2].setIcon(new ImageIcon(("C:/Users/samue/Documents/chess/chess/src/bpawn.png")));
        arrayofbuttons[2][3].setIcon(new ImageIcon(("C:/Users/samue/Documents/chess/chess/src/bpawn.png")));
        arrayofbuttons[2][4].setIcon(new ImageIcon(("C:/Users/samue/Documents/chess/chess/src/bpawn.png")));
        arrayofbuttons[2][5].setIcon(new ImageIcon(("C:/Users/samue/Documents/chess/chess/src/bpawn.png")));
        arrayofbuttons[2][6].setIcon(new ImageIcon(("C:/Users/samue/Documents/chess/chess/src/bpawn.png")));
        arrayofbuttons[2][7].setIcon(new ImageIcon(("C:/Users/samue/Documents/chess/chess/src/bpawn.png")));
        arrayofbuttons[2][8].setIcon(new ImageIcon(("C:/Users/samue/Documents/chess/chess/src/bpawn.png")));

        /*white pieces*/
        arrayofbuttons[7][1].setIcon(new ImageIcon(("C:/Users/samue/Documents/chess/chess/src/wpawn.png")));
        arrayofbuttons[7][2].setIcon(new ImageIcon(("C:/Users/samue/Documents/chess/chess/src/wpawn.png")));
        arrayofbuttons[7][3].setIcon(new ImageIcon(("C:/Users/samue/Documents/chess/chess/src/wpawn.png")));
        arrayofbuttons[7][4].setIcon(new ImageIcon(("C:/Users/samue/Documents/chess/chess/src/wpawn.png")));
        arrayofbuttons[7][5].setIcon(new ImageIcon(("C:/Users/samue/Documents/chess/chess/src/wpawn.png")));
        arrayofbuttons[7][6].setIcon(new ImageIcon(("C:/Users/samue/Documents/chess/chess/src/wpawn.png")));
        arrayofbuttons[7][7].setIcon(new ImageIcon(("C:/Users/samue/Documents/chess/chess/src/wpawn.png")));
        arrayofbuttons[7][8].setIcon(new ImageIcon(("C:/Users/samue/Documents/chess/chess/src/wpawn.png")));

        arrayofbuttons[8][1].setIcon(new ImageIcon(("C:/Users/samue/Documents/chess/chess/src/wrook.png")));
        arrayofbuttons[8][2].setIcon(new ImageIcon(("C:/Users/samue/Documents/chess/chess/src/wbishop.png")));
        arrayofbuttons[8][3].setIcon(new ImageIcon(("C:/Users/samue/Documents/chess/chess/src/wknight.png")));
        arrayofbuttons[8][4].setIcon(new ImageIcon(("C:/Users/samue/Documents/chess/chess/src/wqueen.png")));
        arrayofbuttons[8][5].setIcon(new ImageIcon(("C:/Users/samue/Documents/chess/chess/src/wking.png")));
        arrayofbuttons[8][6].setIcon(new ImageIcon(("C:/Users/samue/Documents/chess/chess/src/wknight.png")));
        arrayofbuttons[8][7].setIcon(new ImageIcon(("C:/Users/samue/Documents/chess/chess/src/wbishop.png")));
        arrayofbuttons[8][8].setIcon(new ImageIcon(("C:/Users/samue/Documents/chess/chess/src/wrook.png")));
    }

    public void turn(){
        /*this would return whose turn it is 1 for the AI and -1 for the human*/

    }

    public Map<Position, JButton[][]> getPositionbuttons() {
        return positionbuttons;
    }

    public void setPositionbuttons(Map<Position, JButton[][]> positionbuttons) {
        this.positionbuttons = positionbuttons;
    }


    class Pieces implements ActionListener{

        public Pieces(){


        }

        public void King(){}
        public void Queen(){}
        public void Knight(){}
        public void Bishop(){}
        public void Rook(){}
        public void Pawn(){}

        @Override
        public void actionPerformed(ActionEvent e) {
            /*checks what piece it is then calls the appropriate function to display the possible moves*/
        }
    }


     class Position {
        /*stores the position on the position on the board that a piece is on*/

        int row;
        int col;

        public Position(int row, int col) {
            this.col = col;
            this.row = row;
        }
    }

}
