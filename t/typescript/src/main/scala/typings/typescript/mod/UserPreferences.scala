package typings.typescript.mod

import typings.typescript.typescriptStrings.`non-relative`
import typings.typescript.typescriptStrings.auto
import typings.typescript.typescriptStrings.double
import typings.typescript.typescriptStrings.index
import typings.typescript.typescriptStrings.js_
import typings.typescript.typescriptStrings.minimal
import typings.typescript.typescriptStrings.relative
import typings.typescript.typescriptStrings.single
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UserPreferences extends js.Object {
  val allowTextChangesInNewFiles: js.UndefOr[Boolean] = js.native
  val disableSuggestions: js.UndefOr[Boolean] = js.native
  /** Determines whether we import `foo/index.ts` as "foo", "foo/index", or "foo/index.js" */
  val importModuleSpecifierEnding: js.UndefOr[auto | minimal | index | js_] = js.native
  val importModuleSpecifierPreference: js.UndefOr[auto | relative | `non-relative`] = js.native
  val includeAutomaticOptionalChainCompletions: js.UndefOr[Boolean] = js.native
  val includeCompletionsForModuleExports: js.UndefOr[Boolean] = js.native
  val includeCompletionsWithInsertText: js.UndefOr[Boolean] = js.native
  val providePrefixAndSuffixTextForRename: js.UndefOr[Boolean] = js.native
  val quotePreference: js.UndefOr[auto | double | single] = js.native
}

object UserPreferences {
  @scala.inline
  def apply(): UserPreferences = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserPreferences]
  }
  @scala.inline
  implicit class UserPreferencesOps[Self <: UserPreferences] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAllowTextChangesInNewFiles(value: Boolean): Self = this.set("allowTextChangesInNewFiles", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowTextChangesInNewFiles: Self = this.set("allowTextChangesInNewFiles", js.undefined)
    @scala.inline
    def setDisableSuggestions(value: Boolean): Self = this.set("disableSuggestions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisableSuggestions: Self = this.set("disableSuggestions", js.undefined)
    @scala.inline
    def setImportModuleSpecifierEnding(value: auto | minimal | index | js_): Self = this.set("importModuleSpecifierEnding", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImportModuleSpecifierEnding: Self = this.set("importModuleSpecifierEnding", js.undefined)
    @scala.inline
    def setImportModuleSpecifierPreference(value: auto | relative | `non-relative`): Self = this.set("importModuleSpecifierPreference", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImportModuleSpecifierPreference: Self = this.set("importModuleSpecifierPreference", js.undefined)
    @scala.inline
    def setIncludeAutomaticOptionalChainCompletions(value: Boolean): Self = this.set("includeAutomaticOptionalChainCompletions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIncludeAutomaticOptionalChainCompletions: Self = this.set("includeAutomaticOptionalChainCompletions", js.undefined)
    @scala.inline
    def setIncludeCompletionsForModuleExports(value: Boolean): Self = this.set("includeCompletionsForModuleExports", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIncludeCompletionsForModuleExports: Self = this.set("includeCompletionsForModuleExports", js.undefined)
    @scala.inline
    def setIncludeCompletionsWithInsertText(value: Boolean): Self = this.set("includeCompletionsWithInsertText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIncludeCompletionsWithInsertText: Self = this.set("includeCompletionsWithInsertText", js.undefined)
    @scala.inline
    def setProvidePrefixAndSuffixTextForRename(value: Boolean): Self = this.set("providePrefixAndSuffixTextForRename", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProvidePrefixAndSuffixTextForRename: Self = this.set("providePrefixAndSuffixTextForRename", js.undefined)
    @scala.inline
    def setQuotePreference(value: auto | double | single): Self = this.set("quotePreference", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQuotePreference: Self = this.set("quotePreference", js.undefined)
  }
  
}

