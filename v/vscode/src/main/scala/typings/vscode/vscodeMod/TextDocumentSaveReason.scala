package typings.vscode.vscodeMod

import org.scalablytyped.runtime.TopLevel
import typings.vscode.vscodeMod.TextDocumentSaveReason.AfterDelay
import typings.vscode.vscodeMod.TextDocumentSaveReason.FocusOut
import typings.vscode.vscodeMod.TextDocumentSaveReason.Manual
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TextDocumentSaveReason with Double] = js.native
  /* 2 */ @js.native
  object AfterDelay extends TopLevel[AfterDelay with Double]
  
  /* 3 */ @js.native
  object FocusOut extends TopLevel[FocusOut with Double]
  
  /* 1 */ @js.native
  object Manual extends TopLevel[Manual with Double]
  
}

