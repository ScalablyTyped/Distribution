package typings.vscodeLanguageserverProtocol.protocolMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SignatureHelpRegistrationOptions
  extends SignatureHelpOptions
     with TextDocumentRegistrationOptions

object SignatureHelpRegistrationOptions {
  @scala.inline
  def apply(
    documentSelector: DocumentSelector = null,
    retriggerCharacters: js.Array[String] = null,
    triggerCharacters: js.Array[String] = null,
    workDoneProgress: js.UndefOr[Boolean] = js.undefined
  ): SignatureHelpRegistrationOptions = {
    val __obj = js.Dynamic.literal(documentSelector = documentSelector.asInstanceOf[js.Any])
    if (retriggerCharacters != null) __obj.updateDynamic("retriggerCharacters")(retriggerCharacters.asInstanceOf[js.Any])
    if (triggerCharacters != null) __obj.updateDynamic("triggerCharacters")(triggerCharacters.asInstanceOf[js.Any])
    if (!js.isUndefined(workDoneProgress)) __obj.updateDynamic("workDoneProgress")(workDoneProgress.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SignatureHelpRegistrationOptions]
  }
}

