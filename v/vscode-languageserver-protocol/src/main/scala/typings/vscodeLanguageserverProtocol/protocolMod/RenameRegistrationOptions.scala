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
    val __obj = js.Dynamic.literal(documentSelector = documentSelector.asInstanceOf[js.Any])
    if (!js.isUndefined(prepareProvider)) __obj.updateDynamic("prepareProvider")(prepareProvider.get.asInstanceOf[js.Any])
    if (!js.isUndefined(workDoneProgress)) __obj.updateDynamic("workDoneProgress")(workDoneProgress.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[RenameRegistrationOptions]
  }
}

