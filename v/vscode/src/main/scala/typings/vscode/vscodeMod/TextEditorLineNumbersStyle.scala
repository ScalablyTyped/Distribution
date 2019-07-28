package typings.vscode.vscodeMod

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
  sealed trait Off extends TextEditorLineNumbersStyle
  
  /**
  		 * Render the line numbers.
  		 */
  @js.native
  sealed trait On extends TextEditorLineNumbersStyle
  
  /**
  		 * Render the line numbers with values relative to the primary cursor location.
  		 */
  @js.native
  sealed trait Relative extends TextEditorLineNumbersStyle
  
  /* 0 */ val Off: typings.vscode.vscodeMod.TextEditorLineNumbersStyle.Off with Double = js.native
  /* 1 */ val On: typings.vscode.vscodeMod.TextEditorLineNumbersStyle.On with Double = js.native
  /* 2 */ val Relative: typings.vscode.vscodeMod.TextEditorLineNumbersStyle.Relative with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TextEditorLineNumbersStyle with Double] = js.native
}

