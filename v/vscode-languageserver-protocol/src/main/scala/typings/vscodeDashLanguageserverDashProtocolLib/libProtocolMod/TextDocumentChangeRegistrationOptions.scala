package typings
package vscodeDashLanguageserverDashProtocolLib.libProtocolMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextDocumentChangeRegistrationOptions extends TextDocumentRegistrationOptions {
  /**
    * How documents are synced to the server.
    */
  var syncKind: TextDocumentSyncKind
}

object TextDocumentChangeRegistrationOptions {
  @scala.inline
  def apply(syncKind: TextDocumentSyncKind, documentSelector: DocumentSelector = null): TextDocumentChangeRegistrationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("syncKind")(syncKind)
    if (documentSelector != null) __obj.updateDynamic("documentSelector")(documentSelector)
    __obj.asInstanceOf[TextDocumentChangeRegistrationOptions]
  }
}

