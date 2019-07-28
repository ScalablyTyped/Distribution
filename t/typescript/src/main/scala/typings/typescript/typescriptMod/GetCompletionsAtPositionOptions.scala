package typings.typescript.typescriptMod

import typings.typescript.typescriptStrings.JS
import typings.typescript.typescriptStrings.`non-relative`
import typings.typescript.typescriptStrings.auto
import typings.typescript.typescriptStrings.double
import typings.typescript.typescriptStrings.index
import typings.typescript.typescriptStrings.minimal
import typings.typescript.typescriptStrings.relative
import typings.typescript.typescriptStrings.single
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetCompletionsAtPositionOptions extends UserPreferences {
  /** @deprecated Use includeCompletionsForModuleExports */
  var includeExternalModuleExports: js.UndefOr[Boolean] = js.undefined
  /** @deprecated Use includeCompletionsWithInsertText */
  var includeInsertTextCompletions: js.UndefOr[Boolean] = js.undefined
  /**
    * If the editor is asking for completions because a certain character was typed
    * (as opposed to when the user explicitly requested them) this should be set.
    */
  var triggerCharacter: js.UndefOr[CompletionsTriggerCharacter] = js.undefined
}

object GetCompletionsAtPositionOptions {
  @scala.inline
  def apply(
    allowTextChangesInNewFiles: js.UndefOr[Boolean] = js.undefined,
    disableSuggestions: js.UndefOr[Boolean] = js.undefined,
    importModuleSpecifierEnding: minimal | index | JS = null,
    importModuleSpecifierPreference: relative | `non-relative` = null,
    includeCompletionsForModuleExports: js.UndefOr[Boolean] = js.undefined,
    includeCompletionsWithInsertText: js.UndefOr[Boolean] = js.undefined,
    includeExternalModuleExports: js.UndefOr[Boolean] = js.undefined,
    includeInsertTextCompletions: js.UndefOr[Boolean] = js.undefined,
    providePrefixAndSuffixTextForRename: js.UndefOr[Boolean] = js.undefined,
    quotePreference: auto | double | single = null,
    triggerCharacter: CompletionsTriggerCharacter = null
  ): GetCompletionsAtPositionOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowTextChangesInNewFiles)) __obj.updateDynamic("allowTextChangesInNewFiles")(allowTextChangesInNewFiles)
    if (!js.isUndefined(disableSuggestions)) __obj.updateDynamic("disableSuggestions")(disableSuggestions)
    if (importModuleSpecifierEnding != null) __obj.updateDynamic("importModuleSpecifierEnding")(importModuleSpecifierEnding.asInstanceOf[js.Any])
    if (importModuleSpecifierPreference != null) __obj.updateDynamic("importModuleSpecifierPreference")(importModuleSpecifierPreference.asInstanceOf[js.Any])
    if (!js.isUndefined(includeCompletionsForModuleExports)) __obj.updateDynamic("includeCompletionsForModuleExports")(includeCompletionsForModuleExports)
    if (!js.isUndefined(includeCompletionsWithInsertText)) __obj.updateDynamic("includeCompletionsWithInsertText")(includeCompletionsWithInsertText)
    if (!js.isUndefined(includeExternalModuleExports)) __obj.updateDynamic("includeExternalModuleExports")(includeExternalModuleExports)
    if (!js.isUndefined(includeInsertTextCompletions)) __obj.updateDynamic("includeInsertTextCompletions")(includeInsertTextCompletions)
    if (!js.isUndefined(providePrefixAndSuffixTextForRename)) __obj.updateDynamic("providePrefixAndSuffixTextForRename")(providePrefixAndSuffixTextForRename)
    if (quotePreference != null) __obj.updateDynamic("quotePreference")(quotePreference.asInstanceOf[js.Any])
    if (triggerCharacter != null) __obj.updateDynamic("triggerCharacter")(triggerCharacter)
    __obj.asInstanceOf[GetCompletionsAtPositionOptions]
  }
}

