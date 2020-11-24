package typings.tictactoejs

import typings.tictactoejs.tictactoejsStrings.O
import typings.tictactoejs.tictactoejsStrings.X
import typings.tictactoejs.tictactoejsStrings.`in progress`
import typings.tictactoejs.tictactoejsStrings.draw
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tictactoejs", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  @js.native
  /**
    * The game's constructor
    */
  class TicTacToe () extends js.Object {
    def this(requestSize: Double) = this()
    
    /**
      * Get the current board
      * @returns the current board as ascii
      */
    def ascii(): String = js.native
    
    /**
      * Get the current board
      * @returns the current board as ascii (alternative style)
      */
    def ascii2(): String = js.native
    
    /**
      * Check whether the provided coordinates exist on the current board
      * @returns whether the current coordinates exist
      */
    def exists(x: Double, y: Double): Boolean = js.native
    
    /**
      * Check whether the game is over
      * @returns the game state
      */
    def gameOver(): Boolean = js.native
    
    /**
      * Check which player occupies the provided coordinates
      * @returns the player occupying these coordinates
      */
    def get(x: Double, y: Double): X | O | Null = js.native
    
    /**
      * Get the current game's size
      * @returns the game size
      */
    def getSize(): Double = js.native
    
    /**
      * Check whether the game ended in a draw
      * @returns the game state
      */
    def isDraw(): Boolean = js.native
    
    /**
      * Check the valid moves (all unoccupied coordinates)
      * @returns an array of objects with the x and y values
      */
    def legalMoves(): js.Array[typings.tictactoejs.anon.X] = js.native
    
    /**
      * Does a move (bottom left is 1|1, bottom right is 3|1)
      * @returns whether the move was successful
      */
    def move(x: Double, y: Double): Boolean = js.native
    
    /**
      * Do a move with array style coordinates (top left is 0|0, top right is 0|2)
      * @returns whether the move was successful
      */
    def moveArray(row: Double, col: Double): Boolean = js.native
    
    /**
      * Do a random move (no logic or AI involved, this is completely random)
      * @returns an object with the x and y value of the random move
      */
    def randomMove(): typings.tictactoejs.anon.X = js.native
    
    /**
      * Restart the game
      */
    def reset(): Unit = js.native
    def reset(requestSize: Double): Unit = js.native
    
    /**
      * Check the game's current state
      * @returns the game state
      */
    def status(): X | O | draw | (`in progress`) = js.native
    
    /**
      * Check, whether it's X' turn or O's
      * @returns whose turn it is
      */
    def turn(): X | O = js.native
  }
}
