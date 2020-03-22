package typings.vscodeLanguageserverProtocol.protocolMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CompletionRegistrationOptions
  extends CompletionOptions
     with TextDocumentRegistrationOptions

object CompletionRegistrationOptions {
  @scala.inline
  def apply(
    allCommitCharacters: js.Array[String] = null,
    documentSelector: DocumentSelector = null,
    resolveProvider: js.UndefOr[Boolean] = js.undefined,
    triggerCharacters: js.Array[String] = null,
    workDoneProgress: js.UndefOr[Boolean] = js.undefined
  ): CompletionRegistrationOptions = {
    val __obj = js.Dynamic.literal()
    if (allCommitCharacters != null) __obj.updateDynamic("allCommitCharacters")(allCommitCharacters.asInstanceOf[js.Any])
    if (documentSelector != null) __obj.updateDynamic("documentSelector")(documentSelector.asInstanceOf[js.Any])
    if (!js.isUndefined(resolveProvider)) __obj.updateDynamic("resolveProvider")(resolveProvider.asInstanceOf[js.Any])
    if (triggerCharacters != null) __obj.updateDynamic("triggerCharacters")(triggerCharacters.asInstanceOf[js.Any])
    if (!js.isUndefined(workDoneProgress)) __obj.updateDynamic("workDoneProgress")(workDoneProgress.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompletionRegistrationOptions]
  }
}

