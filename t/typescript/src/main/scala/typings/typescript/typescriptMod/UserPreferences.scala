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

trait UserPreferences extends js.Object {
  val allowTextChangesInNewFiles: js.UndefOr[Boolean] = js.undefined
  val disableSuggestions: js.UndefOr[Boolean] = js.undefined
  /** Determines whether we import `foo/index.ts` as "foo", "foo/index", or "foo/index.js" */
  val importModuleSpecifierEnding: js.UndefOr[minimal | index | JS] = js.undefined
  val importModuleSpecifierPreference: js.UndefOr[relative | `non-relative`] = js.undefined
  val includeAutomaticOptionalChainCompletions: js.UndefOr[Boolean] = js.undefined
  val includeCompletionsForModuleExports: js.UndefOr[Boolean] = js.undefined
  val includeCompletionsWithInsertText: js.UndefOr[Boolean] = js.undefined
  val providePrefixAndSuffixTextForRename: js.UndefOr[Boolean] = js.undefined
  val quotePreference: js.UndefOr[auto | double | single] = js.undefined
}

object UserPreferences {
  @scala.inline
  def apply(
    allowTextChangesInNewFiles: js.UndefOr[Boolean] = js.undefined,
    disableSuggestions: js.UndefOr[Boolean] = js.undefined,
    importModuleSpecifierEnding: minimal | index | JS = null,
    importModuleSpecifierPreference: relative | `non-relative` = null,
    includeAutomaticOptionalChainCompletions: js.UndefOr[Boolean] = js.undefined,
    includeCompletionsForModuleExports: js.UndefOr[Boolean] = js.undefined,
    includeCompletionsWithInsertText: js.UndefOr[Boolean] = js.undefined,
    providePrefixAndSuffixTextForRename: js.UndefOr[Boolean] = js.undefined,
    quotePreference: auto | double | single = null
  ): UserPreferences = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowTextChangesInNewFiles)) __obj.updateDynamic("allowTextChangesInNewFiles")(allowTextChangesInNewFiles.asInstanceOf[js.Any])
    if (!js.isUndefined(disableSuggestions)) __obj.updateDynamic("disableSuggestions")(disableSuggestions.asInstanceOf[js.Any])
    if (importModuleSpecifierEnding != null) __obj.updateDynamic("importModuleSpecifierEnding")(importModuleSpecifierEnding.asInstanceOf[js.Any])
    if (importModuleSpecifierPreference != null) __obj.updateDynamic("importModuleSpecifierPreference")(importModuleSpecifierPreference.asInstanceOf[js.Any])
    if (!js.isUndefined(includeAutomaticOptionalChainCompletions)) __obj.updateDynamic("includeAutomaticOptionalChainCompletions")(includeAutomaticOptionalChainCompletions.asInstanceOf[js.Any])
    if (!js.isUndefined(includeCompletionsForModuleExports)) __obj.updateDynamic("includeCompletionsForModuleExports")(includeCompletionsForModuleExports.asInstanceOf[js.Any])
    if (!js.isUndefined(includeCompletionsWithInsertText)) __obj.updateDynamic("includeCompletionsWithInsertText")(includeCompletionsWithInsertText.asInstanceOf[js.Any])
    if (!js.isUndefined(providePrefixAndSuffixTextForRename)) __obj.updateDynamic("providePrefixAndSuffixTextForRename")(providePrefixAndSuffixTextForRename.asInstanceOf[js.Any])
    if (quotePreference != null) __obj.updateDynamic("quotePreference")(quotePreference.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserPreferences]
  }
}

