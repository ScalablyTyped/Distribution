package typings.vscodeLanguageserverProtocol.protocolMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DocumentLinkRegistrationOptions
  extends TextDocumentRegistrationOptions
     with DocumentLinkOptions

object DocumentLinkRegistrationOptions {
  @scala.inline
  def apply(documentSelector: DocumentSelector = null, resolveProvider: js.UndefOr[Boolean] = js.undefined): DocumentLinkRegistrationOptions = {
    val __obj = js.Dynamic.literal()
    if (documentSelector != null) __obj.updateDynamic("documentSelector")(documentSelector.asInstanceOf[js.Any])
    if (!js.isUndefined(resolveProvider)) __obj.updateDynamic("resolveProvider")(resolveProvider.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentLinkRegistrationOptions]
  }
}

