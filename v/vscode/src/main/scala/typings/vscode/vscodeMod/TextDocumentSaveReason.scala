package typings.vscode.vscodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TextDocumentSaveReason extends js.Object

@JSImport("vscode", "TextDocumentSaveReason")
@js.native
object TextDocumentSaveReason extends js.Object {
  /**
  		 * Automatic after a delay.
  		 */
  @js.native
  sealed trait AfterDelay extends TextDocumentSaveReason
  
  /**
  		 * When the editor lost focus.
  		 */
  @js.native
  sealed trait FocusOut extends TextDocumentSaveReason
  
  /**
  		 * Manually triggered, e.g. by the user pressing save, by starting debugging,
  		 * or by an API call.
  		 */
  @js.native
  sealed trait Manual extends TextDocumentSaveReason
  
  /* 2 */ val AfterDelay: typings.vscode.vscodeMod.TextDocumentSaveReason.AfterDelay with Double = js.native
  /* 3 */ val FocusOut: typings.vscode.vscodeMod.TextDocumentSaveReason.FocusOut with Double = js.native
  /* 1 */ val Manual: typings.vscode.vscodeMod.TextDocumentSaveReason.Manual with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TextDocumentSaveReason with Double] = js.native
}

