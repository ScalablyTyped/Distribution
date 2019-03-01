package typings
package typescriptLib.typescriptMod.tsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserPreferences extends js.Object {
  val allowTextChangesInNewFiles: js.UndefOr[scala.Boolean] = js.undefined
  val disableSuggestions: js.UndefOr[scala.Boolean] = js.undefined
  /** Determines whether we import `foo/index.ts` as "foo", "foo/index", or "foo/index.js" */
  val importModuleSpecifierEnding: js.UndefOr[
    typescriptLib.typescriptLibStrings.minimal | typescriptLib.typescriptLibStrings.index | typescriptLib.typescriptLibStrings.JS
  ] = js.undefined
  val importModuleSpecifierPreference: js.UndefOr[
    typescriptLib.typescriptLibStrings.relative | typescriptLib.typescriptLibStrings.`non-relative`
  ] = js.undefined
  val includeCompletionsForModuleExports: js.UndefOr[scala.Boolean] = js.undefined
  val includeCompletionsWithInsertText: js.UndefOr[scala.Boolean] = js.undefined
  val providePrefixAndSuffixTextForRename: js.UndefOr[scala.Boolean] = js.undefined
  val quotePreference: js.UndefOr[
    typescriptLib.typescriptLibStrings.auto | typescriptLib.typescriptLibStrings.double | typescriptLib.typescriptLibStrings.single
  ] = js.undefined
}

object UserPreferences {
  @scala.inline
  def apply(
    allowTextChangesInNewFiles: js.UndefOr[scala.Boolean] = js.undefined,
    disableSuggestions: js.UndefOr[scala.Boolean] = js.undefined,
    importModuleSpecifierEnding: typescriptLib.typescriptLibStrings.minimal | typescriptLib.typescriptLibStrings.index | typescriptLib.typescriptLibStrings.JS = null,
    importModuleSpecifierPreference: typescriptLib.typescriptLibStrings.relative | typescriptLib.typescriptLibStrings.`non-relative` = null,
    includeCompletionsForModuleExports: js.UndefOr[scala.Boolean] = js.undefined,
    includeCompletionsWithInsertText: js.UndefOr[scala.Boolean] = js.undefined,
    providePrefixAndSuffixTextForRename: js.UndefOr[scala.Boolean] = js.undefined,
    quotePreference: typescriptLib.typescriptLibStrings.auto | typescriptLib.typescriptLibStrings.double | typescriptLib.typescriptLibStrings.single = null
  ): UserPreferences = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowTextChangesInNewFiles)) __obj.updateDynamic("allowTextChangesInNewFiles")(allowTextChangesInNewFiles)
    if (!js.isUndefined(disableSuggestions)) __obj.updateDynamic("disableSuggestions")(disableSuggestions)
    if (importModuleSpecifierEnding != null) __obj.updateDynamic("importModuleSpecifierEnding")(importModuleSpecifierEnding.asInstanceOf[js.Any])
    if (importModuleSpecifierPreference != null) __obj.updateDynamic("importModuleSpecifierPreference")(importModuleSpecifierPreference.asInstanceOf[js.Any])
    if (!js.isUndefined(includeCompletionsForModuleExports)) __obj.updateDynamic("includeCompletionsForModuleExports")(includeCompletionsForModuleExports)
    if (!js.isUndefined(includeCompletionsWithInsertText)) __obj.updateDynamic("includeCompletionsWithInsertText")(includeCompletionsWithInsertText)
    if (!js.isUndefined(providePrefixAndSuffixTextForRename)) __obj.updateDynamic("providePrefixAndSuffixTextForRename")(providePrefixAndSuffixTextForRename)
    if (quotePreference != null) __obj.updateDynamic("quotePreference")(quotePreference.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserPreferences]
  }
}

