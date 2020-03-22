package typings.vscodeLanguageserverProtocol.protocolColorProviderMod

import typings.vscodeLanguageserverProtocol.protocolMod.DocumentSelector
import typings.vscodeLanguageserverProtocol.protocolMod.StaticRegistrationOptions
import typings.vscodeLanguageserverProtocol.protocolMod.TextDocumentRegistrationOptions
import typings.vscodeLanguageserverProtocol.protocolMod.WorkDoneProgressOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DocumentColorRegistrationOptions
  extends TextDocumentRegistrationOptions
     with StaticRegistrationOptions
     with WorkDoneProgressOptions

object DocumentColorRegistrationOptions {
  @scala.inline
  def apply(
    documentSelector: DocumentSelector = null,
    id: String = null,
    workDoneProgress: js.UndefOr[Boolean] = js.undefined
  ): DocumentColorRegistrationOptions = {
    val __obj = js.Dynamic.literal()
    if (documentSelector != null) __obj.updateDynamic("documentSelector")(documentSelector.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (!js.isUndefined(workDoneProgress)) __obj.updateDynamic("workDoneProgress")(workDoneProgress.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentColorRegistrationOptions]
  }
}

