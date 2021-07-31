package typings.typescript.mod

import typings.typescript.typescriptStrings.`non-relative`
import typings.typescript.typescriptStrings.auto
import typings.typescript.typescriptStrings.double
import typings.typescript.typescriptStrings.index
import typings.typescript.typescriptStrings.js_
import typings.typescript.typescriptStrings.minimal
import typings.typescript.typescriptStrings.off
import typings.typescript.typescriptStrings.on
import typings.typescript.typescriptStrings.relative
import typings.typescript.typescriptStrings.single
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UserPreferences extends StObject {
  
  val allowTextChangesInNewFiles: js.UndefOr[Boolean] = js.undefined
  
  val disableSuggestions: js.UndefOr[Boolean] = js.undefined
  
  /** Determines whether we import `foo/index.ts` as "foo", "foo/index", or "foo/index.js" */
  val importModuleSpecifierEnding: js.UndefOr[auto | minimal | index | js_] = js.undefined
  
  val importModuleSpecifierPreference: js.UndefOr[auto | relative | `non-relative`] = js.undefined
  
  val includeAutomaticOptionalChainCompletions: js.UndefOr[Boolean] = js.undefined
  
  val includeCompletionsForModuleExports: js.UndefOr[Boolean] = js.undefined
  
  val includeCompletionsWithInsertText: js.UndefOr[Boolean] = js.undefined
  
  val includePackageJsonAutoImports: js.UndefOr[auto | on | off] = js.undefined
  
  val providePrefixAndSuffixTextForRename: js.UndefOr[Boolean] = js.undefined
  
  val provideRefactorNotApplicableReason: js.UndefOr[Boolean] = js.undefined
  
  val quotePreference: js.UndefOr[auto | double | single] = js.undefined
}
object UserPreferences {
  
  @scala.inline
  def apply(): UserPreferences = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserPreferences]
  }
  
  @scala.inline
  implicit class UserPreferencesMutableBuilder[Self <: UserPreferences] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowTextChangesInNewFiles(value: Boolean): Self = StObject.set(x, "allowTextChangesInNewFiles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowTextChangesInNewFilesUndefined: Self = StObject.set(x, "allowTextChangesInNewFiles", js.undefined)
    
    @scala.inline
    def setDisableSuggestions(value: Boolean): Self = StObject.set(x, "disableSuggestions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableSuggestionsUndefined: Self = StObject.set(x, "disableSuggestions", js.undefined)
    
    @scala.inline
    def setImportModuleSpecifierEnding(value: auto | minimal | index | js_): Self = StObject.set(x, "importModuleSpecifierEnding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImportModuleSpecifierEndingUndefined: Self = StObject.set(x, "importModuleSpecifierEnding", js.undefined)
    
    @scala.inline
    def setImportModuleSpecifierPreference(value: auto | relative | `non-relative`): Self = StObject.set(x, "importModuleSpecifierPreference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImportModuleSpecifierPreferenceUndefined: Self = StObject.set(x, "importModuleSpecifierPreference", js.undefined)
    
    @scala.inline
    def setIncludeAutomaticOptionalChainCompletions(value: Boolean): Self = StObject.set(x, "includeAutomaticOptionalChainCompletions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeAutomaticOptionalChainCompletionsUndefined: Self = StObject.set(x, "includeAutomaticOptionalChainCompletions", js.undefined)
    
    @scala.inline
    def setIncludeCompletionsForModuleExports(value: Boolean): Self = StObject.set(x, "includeCompletionsForModuleExports", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeCompletionsForModuleExportsUndefined: Self = StObject.set(x, "includeCompletionsForModuleExports", js.undefined)
    
    @scala.inline
    def setIncludeCompletionsWithInsertText(value: Boolean): Self = StObject.set(x, "includeCompletionsWithInsertText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeCompletionsWithInsertTextUndefined: Self = StObject.set(x, "includeCompletionsWithInsertText", js.undefined)
    
    @scala.inline
    def setIncludePackageJsonAutoImports(value: auto | on | off): Self = StObject.set(x, "includePackageJsonAutoImports", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludePackageJsonAutoImportsUndefined: Self = StObject.set(x, "includePackageJsonAutoImports", js.undefined)
    
    @scala.inline
    def setProvidePrefixAndSuffixTextForRename(value: Boolean): Self = StObject.set(x, "providePrefixAndSuffixTextForRename", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProvidePrefixAndSuffixTextForRenameUndefined: Self = StObject.set(x, "providePrefixAndSuffixTextForRename", js.undefined)
    
    @scala.inline
    def setProvideRefactorNotApplicableReason(value: Boolean): Self = StObject.set(x, "provideRefactorNotApplicableReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProvideRefactorNotApplicableReasonUndefined: Self = StObject.set(x, "provideRefactorNotApplicableReason", js.undefined)
    
    @scala.inline
    def setQuotePreference(value: auto | double | single): Self = StObject.set(x, "quotePreference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuotePreferenceUndefined: Self = StObject.set(x, "quotePreference", js.undefined)
  }
}
