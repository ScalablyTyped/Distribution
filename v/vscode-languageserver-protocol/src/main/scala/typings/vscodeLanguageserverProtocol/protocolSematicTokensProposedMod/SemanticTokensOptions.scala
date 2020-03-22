package typings.vscodeLanguageserverProtocol.protocolSematicTokensProposedMod

import typings.vscodeLanguageserverProtocol.AnonEdits
import typings.vscodeLanguageserverProtocol.protocolMod.WorkDoneProgressOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SemanticTokensOptions extends WorkDoneProgressOptions {
  /**
    * Server supports providing semantic tokens for a full document.
    */
  var documentProvider: js.UndefOr[Boolean | AnonEdits] = js.undefined
  /**
    * The legend used by the server
    */
  var legend: SemanticTokensLegend
  /**
    * Server supports providing semantic tokens for a sepcific range
    * of a document.
    */
  var rangeProvider: js.UndefOr[Boolean] = js.undefined
}

object SemanticTokensOptions {
  @scala.inline
  def apply(
    legend: SemanticTokensLegend,
    documentProvider: Boolean | AnonEdits = null,
    rangeProvider: js.UndefOr[Boolean] = js.undefined,
    workDoneProgress: js.UndefOr[Boolean] = js.undefined
  ): SemanticTokensOptions = {
    val __obj = js.Dynamic.literal(legend = legend.asInstanceOf[js.Any])
    if (documentProvider != null) __obj.updateDynamic("documentProvider")(documentProvider.asInstanceOf[js.Any])
    if (!js.isUndefined(rangeProvider)) __obj.updateDynamic("rangeProvider")(rangeProvider.asInstanceOf[js.Any])
    if (!js.isUndefined(workDoneProgress)) __obj.updateDynamic("workDoneProgress")(workDoneProgress.asInstanceOf[js.Any])
    __obj.asInstanceOf[SemanticTokensOptions]
  }
}

