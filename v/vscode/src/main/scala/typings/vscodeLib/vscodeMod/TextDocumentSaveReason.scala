package typings
package vscodeLib.vscodeMod

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
  sealed trait AfterDelay
    extends vscodeLib.vscodeMod.TextDocumentSaveReason
  
  /**
  		 * When the editor lost focus.
  		 */
  @js.native
  sealed trait FocusOut
    extends vscodeLib.vscodeMod.TextDocumentSaveReason
  
  /**
  		 * Manually triggered, e.g. by the user pressing save, by starting debugging,
  		 * or by an API call.
  		 */
  @js.native
  sealed trait Manual
    extends vscodeLib.vscodeMod.TextDocumentSaveReason
  
  /* 2 */ val AfterDelay: AfterDelay with scala.Double = js.native
  /* 3 */ val FocusOut: FocusOut with scala.Double = js.native
  /* 1 */ val Manual: Manual with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[vscodeLib.vscodeMod.TextDocumentSaveReason with scala.Double] = js.native
}

