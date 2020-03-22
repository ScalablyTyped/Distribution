package typings.vscodeLanguageserverProtocol.protocolMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CompletionOptions extends WorkDoneProgressOptions {
  /**
    * The list of all possible characters that commit a completion. This field can be used
    * if clients don't support individual commmit characters per completion item. See
    * `ClientCapabilities.textDocument.completion.completionItem.commitCharactersSupport`
    *
    * If a server provides both `allCommitCharacters` and commit characters on an individual
    * completion item the ones on the completion item win.
    *
    * @since 3.2.0
    */
  var allCommitCharacters: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * The server provides support to resolve additional
    * information for a completion item.
    */
  var resolveProvider: js.UndefOr[Boolean] = js.undefined
  /**
    * Most tools trigger completion request automatically without explicitly requesting
    * it using a keyboard shortcut (e.g. Ctrl+Space). Typically they do so when the user
    * starts to type an identifier. For example if the user types `c` in a JavaScript file
    * code complete will automatically pop up present `console` besides others as a
    * completion item. Characters that make up identifiers don't need to be listed here.
    *
    * If code complete should automatically be trigger on characters not being valid inside
    * an identifier (for example `.` in JavaScript) list them in `triggerCharacters`.
    */
  var triggerCharacters: js.UndefOr[js.Array[String]] = js.undefined
}

object CompletionOptions {
  @scala.inline
  def apply(
    allCommitCharacters: js.Array[String] = null,
    resolveProvider: js.UndefOr[Boolean] = js.undefined,
    triggerCharacters: js.Array[String] = null,
    workDoneProgress: js.UndefOr[Boolean] = js.undefined
  ): CompletionOptions = {
    val __obj = js.Dynamic.literal()
    if (allCommitCharacters != null) __obj.updateDynamic("allCommitCharacters")(allCommitCharacters.asInstanceOf[js.Any])
    if (!js.isUndefined(resolveProvider)) __obj.updateDynamic("resolveProvider")(resolveProvider.asInstanceOf[js.Any])
    if (triggerCharacters != null) __obj.updateDynamic("triggerCharacters")(triggerCharacters.asInstanceOf[js.Any])
    if (!js.isUndefined(workDoneProgress)) __obj.updateDynamic("workDoneProgress")(workDoneProgress.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompletionOptions]
  }
}

