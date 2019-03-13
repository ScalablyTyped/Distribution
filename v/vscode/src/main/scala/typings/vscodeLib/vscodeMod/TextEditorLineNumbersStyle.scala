package typings
package vscodeLib.vscodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TextEditorLineNumbersStyle extends js.Object

@JSImport("vscode", "TextEditorLineNumbersStyle")
@js.native
object TextEditorLineNumbersStyle extends js.Object {
  /**
  		 * Do not render the line numbers.
  		 */
  @js.native
  sealed trait Off
    extends vscodeLib.vscodeMod.TextEditorLineNumbersStyle
  
  /**
  		 * Render the line numbers.
  		 */
  @js.native
  sealed trait On
    extends vscodeLib.vscodeMod.TextEditorLineNumbersStyle
  
  /**
  		 * Render the line numbers with values relative to the primary cursor location.
  		 */
  @js.native
  sealed trait Relative
    extends vscodeLib.vscodeMod.TextEditorLineNumbersStyle
  
  /* 0 */ val Off: Off with scala.Double = js.native
  /* 1 */ val On: On with scala.Double = js.native
  /* 2 */ val Relative: Relative with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[vscodeLib.vscodeMod.TextEditorLineNumbersStyle with scala.Double] = js.native
}

