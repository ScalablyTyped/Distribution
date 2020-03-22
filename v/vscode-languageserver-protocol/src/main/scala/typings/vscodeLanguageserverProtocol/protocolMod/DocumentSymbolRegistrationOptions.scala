package typings.vscodeLanguageserverProtocol.protocolMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DocumentSymbolRegistrationOptions
  extends TextDocumentRegistrationOptions
     with WorkDoneProgressOptions

object DocumentSymbolRegistrationOptions {
  @scala.inline
  def apply(documentSelector: DocumentSelector = null, workDoneProgress: js.UndefOr[Boolean] = js.undefined): DocumentSymbolRegistrationOptions = {
    val __obj = js.Dynamic.literal()
    if (documentSelector != null) __obj.updateDynamic("documentSelector")(documentSelector.asInstanceOf[js.Any])
    if (!js.isUndefined(workDoneProgress)) __obj.updateDynamic("workDoneProgress")(workDoneProgress.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentSymbolRegistrationOptions]
  }
}

