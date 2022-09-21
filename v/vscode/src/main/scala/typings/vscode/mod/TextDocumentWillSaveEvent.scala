package typings.vscode.mod

import typings.vscode.Thenable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TextDocumentWillSaveEvent extends StObject {
  
  /**
    * The document that will be saved.
    */
  val document: TextDocument = js.native
  
  /**
    * The reason why save was triggered.
    */
  val reason: TextDocumentSaveReason = js.native
  
  /**
    * Allows to pause the event loop and to apply {@link TextEdit pre-save-edits}.
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
    * @param thenable A thenable that resolves to {@link TextEdit pre-save-edits}.
    */
  /**
    * Allows to pause the event loop until the provided thenable resolved.
    *
    * *Note:* This function can only be called during event dispatch.
    *
    * @param thenable A thenable that delays saving.
    */
  def waitUntil(thenable: Thenable[Any | js.Array[TextEdit]]): Unit = js.native
}
