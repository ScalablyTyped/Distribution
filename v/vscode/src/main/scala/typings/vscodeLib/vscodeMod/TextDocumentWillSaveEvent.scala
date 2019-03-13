package typings
package vscodeLib.vscodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TextDocumentWillSaveEvent extends js.Object {
  /**
  		 * The document that will be saved.
  		 */
  var document: TextDocument = js.native
  /**
  		 * The reason why save was triggered.
  		 */
  var reason: TextDocumentSaveReason = js.native
  /**
  		 * Allows to pause the event loop and to apply [pre-save-edits](#TextEdit).
  		 * Edits of subsequent calls to this function will be applied in order. The
  		 * edits will be *ignored* if concurrent modifications of the document happened.
  		 *
  		 * *Note:* This function can only be called during event dispatch and not
  		 * in an asynchronous manner:
  		 *
  		 * ```ts
  		 * workspace.onWillSaveTextDocument(event => {
  		 * 	// async, will *throw* an error
  		 * 	setTimeout(() => event.waitUntil(promise));
  		 *
  		 * 	// sync, OK
  		 * 	event.waitUntil(promise);
  		 * })
  		 * ```
  		 *
  		 * @param thenable A thenable that resolves to [pre-save-edits](#TextEdit).
  		 */
  /**
  		 * Allows to pause the event loop until the provided thenable resolved.
  		 *
  		 * *Note:* This function can only be called during event dispatch.
  		 *
  		 * @param thenable A thenable that delays saving.
  		 */
  def waitUntil(thenable: vscodeLib.Thenable[_ | js.Array[TextEdit]]): scala.Unit = js.native
}

