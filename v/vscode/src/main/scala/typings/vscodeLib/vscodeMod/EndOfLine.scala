package typings
package vscodeLib.vscodeMod

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
  sealed trait CRLF
    extends vscodeLib.vscodeMod.EndOfLine
  
  /**
  		 * The line feed `\n` character.
  		 */
  @js.native
  sealed trait LF
    extends vscodeLib.vscodeMod.EndOfLine
  
  /* 2 */ val CRLF: CRLF with scala.Double = js.native
  /* 1 */ val LF: LF with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[vscodeLib.vscodeMod.EndOfLine with scala.Double] = js.native
}

