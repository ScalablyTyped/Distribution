package typings.vscodeLanguageserverProtocol.protocolSematicTokensProposedMod

import typings.vscodeLanguageserverProtocol.AnonEdits
import typings.vscodeLanguageserverProtocol.protocolMod.DocumentSelector
import typings.vscodeLanguageserverProtocol.protocolMod.StaticRegistrationOptions
import typings.vscodeLanguageserverProtocol.protocolMod.TextDocumentRegistrationOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SemanticTokensRegistrationOptions
  extends SemanticTokensOptions
     with TextDocumentRegistrationOptions
     with StaticRegistrationOptions

object SemanticTokensRegistrationOptions {
  @scala.inline
  def apply(
    legend: SemanticTokensLegend,
    documentProvider: Boolean | AnonEdits = null,
    documentSelector: DocumentSelector = null,
    id: String = null,
    rangeProvider: js.UndefOr[Boolean] = js.undefined,
    workDoneProgress: js.UndefOr[Boolean] = js.undefined
  ): SemanticTokensRegistrationOptions = {
    val __obj = js.Dynamic.literal(legend = legend.asInstanceOf[js.Any])
    if (documentProvider != null) __obj.updateDynamic("documentProvider")(documentProvider.asInstanceOf[js.Any])
    if (documentSelector != null) __obj.updateDynamic("documentSelector")(documentSelector.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (!js.isUndefined(rangeProvider)) __obj.updateDynamic("rangeProvider")(rangeProvider.asInstanceOf[js.Any])
    if (!js.isUndefined(workDoneProgress)) __obj.updateDynamic("workDoneProgress")(workDoneProgress.asInstanceOf[js.Any])
    __obj.asInstanceOf[SemanticTokensRegistrationOptions]
  }
}

