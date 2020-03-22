package typings.vscodeLanguageserverProtocol.protocolMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RenameRegistrationOptions
  extends RenameOptions
     with TextDocumentRegistrationOptions

object RenameRegistrationOptions {
  @scala.inline
  def apply(
    documentSelector: DocumentSelector = null,
    prepareProvider: js.UndefOr[Boolean] = js.undefined,
    workDoneProgress: js.UndefOr[Boolean] = js.undefined
  ): RenameRegistrationOptions = {
    val __obj = js.Dynamic.literal()
    if (documentSelector != null) __obj.updateDynamic("documentSelector")(documentSelector.asInstanceOf[js.Any])
    if (!js.isUndefined(prepareProvider)) __obj.updateDynamic("prepareProvider")(prepareProvider.asInstanceOf[js.Any])
    if (!js.isUndefined(workDoneProgress)) __obj.updateDynamic("workDoneProgress")(workDoneProgress.asInstanceOf[js.Any])
    __obj.asInstanceOf[RenameRegistrationOptions]
  }
}

