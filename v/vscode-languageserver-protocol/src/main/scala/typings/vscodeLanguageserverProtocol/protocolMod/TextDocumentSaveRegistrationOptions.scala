package typings.vscodeLanguageserverProtocol.protocolMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextDocumentSaveRegistrationOptions
  extends TextDocumentRegistrationOptions
     with SaveOptions

object TextDocumentSaveRegistrationOptions {
  @scala.inline
  def apply(documentSelector: DocumentSelector = null, includeText: js.UndefOr[Boolean] = js.undefined): TextDocumentSaveRegistrationOptions = {
    val __obj = js.Dynamic.literal()
    if (documentSelector != null) __obj.updateDynamic("documentSelector")(documentSelector.asInstanceOf[js.Any])
    if (!js.isUndefined(includeText)) __obj.updateDynamic("includeText")(includeText.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextDocumentSaveRegistrationOptions]
  }
}

