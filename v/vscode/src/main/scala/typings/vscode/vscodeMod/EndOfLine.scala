package typings.vscode.vscodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EndOfLine extends js.Object

@JSImport("vscode", "EndOfLine")
@js.native
object EndOfLine extends js.Object {
  /**
  		 * The carriage return line feed `\r\n` sequence.
  		 */
  @js.native
  sealed trait CRLF extends EndOfLine
  
  /**
  		 * The line feed `\n` character.
  		 */
  @js.native
  sealed trait LF extends EndOfLine
  
  /* 2 */ val CRLF: typings.vscode.vscodeMod.EndOfLine.CRLF with Double = js.native
  /* 1 */ val LF: typings.vscode.vscodeMod.EndOfLine.LF with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EndOfLine with Double] = js.native
}

