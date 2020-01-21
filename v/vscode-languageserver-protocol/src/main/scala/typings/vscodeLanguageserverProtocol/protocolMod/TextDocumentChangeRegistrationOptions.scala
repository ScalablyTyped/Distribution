package typings.vscodeLanguageserverProtocol.protocolMod

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
    val __obj = js.Dynamic.literal(syncKind = syncKind.asInstanceOf[js.Any])
    if (documentSelector != null) __obj.updateDynamic("documentSelector")(documentSelector.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextDocumentChangeRegistrationOptions]
  }
}

