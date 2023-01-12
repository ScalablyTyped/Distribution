package typings.typescript.mod

import typings.typescript.typescriptStrings.`non-relative`
import typings.typescript.typescriptStrings.`project-relative`
import typings.typescript.typescriptStrings.all
import typings.typescript.typescriptStrings.auto
import typings.typescript.typescriptStrings.braces
import typings.typescript.typescriptStrings.double
import typings.typescript.typescriptStrings.index
import typings.typescript.typescriptStrings.js_
import typings.typescript.typescriptStrings.literals
import typings.typescript.typescriptStrings.minimal
import typings.typescript.typescriptStrings.none
import typings.typescript.typescriptStrings.off
import typings.typescript.typescriptStrings.on
import typings.typescript.typescriptStrings.relative
import typings.typescript.typescriptStrings.shortest
import typings.typescript.typescriptStrings.single
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UserPreferences extends StObject {
  
  val allowIncompleteCompletions: js.UndefOr[Boolean] = js.undefined
  
  val allowRenameOfImportPath: js.UndefOr[Boolean] = js.undefined
  
  val allowTextChangesInNewFiles: js.UndefOr[Boolean] = js.undefined
  
  val autoImportFileExcludePatterns: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  
  val disableSuggestions: js.UndefOr[Boolean] = js.undefined
  
  /** Determines whether we import `foo/index.ts` as "foo", "foo/index", or "foo/index.js" */
  val importModuleSpecifierEnding: js.UndefOr[auto | minimal | index | js_] = js.undefined
  
  val importModuleSpecifierPreference: js.UndefOr[shortest | `project-relative` | relative | `non-relative`] = js.undefined
  
  val includeAutomaticOptionalChainCompletions: js.UndefOr[Boolean] = js.undefined
  
  val includeCompletionsForImportStatements: js.UndefOr[Boolean] = js.undefined
  
  val includeCompletionsForModuleExports: js.UndefOr[Boolean] = js.undefined
  
  val includeCompletionsWithClassMemberSnippets: js.UndefOr[Boolean] = js.undefined
  
  val includeCompletionsWithInsertText: js.UndefOr[Boolean] = js.undefined
  
  val includeCompletionsWithObjectLiteralMethodSnippets: js.UndefOr[Boolean] = js.undefined
  
  val includeCompletionsWithSnippetText: js.UndefOr[Boolean] = js.undefined
  
  val includeInlayEnumMemberValueHints: js.UndefOr[Boolean] = js.undefined
  
  val includeInlayFunctionLikeReturnTypeHints: js.UndefOr[Boolean] = js.undefined
  
  val includeInlayFunctionParameterTypeHints: js.UndefOr[Boolean] = js.undefined
  
  val includeInlayParameterNameHints: js.UndefOr[none | literals | all] = js.undefined
  
  val includeInlayParameterNameHintsWhenArgumentMatchesName: js.UndefOr[Boolean] = js.undefined
  
  val includeInlayPropertyDeclarationTypeHints: js.UndefOr[Boolean] = js.undefined
  
  val includeInlayVariableTypeHints: js.UndefOr[Boolean] = js.undefined
  
  val includeInlayVariableTypeHintsWhenTypeMatchesName: js.UndefOr[Boolean] = js.undefined
  
  val includePackageJsonAutoImports: js.UndefOr[auto | on | off] = js.undefined
  
  val jsxAttributeCompletionStyle: js.UndefOr[auto | braces | none] = js.undefined
  
  val providePrefixAndSuffixTextForRename: js.UndefOr[Boolean] = js.undefined
  
  val provideRefactorNotApplicableReason: js.UndefOr[Boolean] = js.undefined
  
  val quotePreference: js.UndefOr[auto | double | single] = js.undefined
  
  val useLabelDetailsInCompletionEntries: js.UndefOr[Boolean] = js.undefined
}
object UserPreferences {
  
  inline def apply(): UserPreferences = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserPreferences]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UserPreferences] (val x: Self) extends AnyVal {
    
    inline def setAllowIncompleteCompletions(value: Boolean): Self = StObject.set(x, "allowIncompleteCompletions", value.asInstanceOf[js.Any])
    
    inline def setAllowIncompleteCompletionsUndefined: Self = StObject.set(x, "allowIncompleteCompletions", js.undefined)
    
    inline def setAllowRenameOfImportPath(value: Boolean): Self = StObject.set(x, "allowRenameOfImportPath", value.asInstanceOf[js.Any])
    
    inline def setAllowRenameOfImportPathUndefined: Self = StObject.set(x, "allowRenameOfImportPath", js.undefined)
    
    inline def setAllowTextChangesInNewFiles(value: Boolean): Self = StObject.set(x, "allowTextChangesInNewFiles", value.asInstanceOf[js.Any])
    
    inline def setAllowTextChangesInNewFilesUndefined: Self = StObject.set(x, "allowTextChangesInNewFiles", js.undefined)
    
    inline def setAutoImportFileExcludePatterns(value: js.Array[java.lang.String]): Self = StObject.set(x, "autoImportFileExcludePatterns", value.asInstanceOf[js.Any])
    
    inline def setAutoImportFileExcludePatternsUndefined: Self = StObject.set(x, "autoImportFileExcludePatterns", js.undefined)
    
    inline def setAutoImportFileExcludePatternsVarargs(value: java.lang.String*): Self = StObject.set(x, "autoImportFileExcludePatterns", js.Array(value*))
    
    inline def setDisableSuggestions(value: Boolean): Self = StObject.set(x, "disableSuggestions", value.asInstanceOf[js.Any])
    
    inline def setDisableSuggestionsUndefined: Self = StObject.set(x, "disableSuggestions", js.undefined)
    
    inline def setImportModuleSpecifierEnding(value: auto | minimal | index | js_): Self = StObject.set(x, "importModuleSpecifierEnding", value.asInstanceOf[js.Any])
    
    inline def setImportModuleSpecifierEndingUndefined: Self = StObject.set(x, "importModuleSpecifierEnding", js.undefined)
    
    inline def setImportModuleSpecifierPreference(value: shortest | `project-relative` | relative | `non-relative`): Self = StObject.set(x, "importModuleSpecifierPreference", value.asInstanceOf[js.Any])
    
    inline def setImportModuleSpecifierPreferenceUndefined: Self = StObject.set(x, "importModuleSpecifierPreference", js.undefined)
    
    inline def setIncludeAutomaticOptionalChainCompletions(value: Boolean): Self = StObject.set(x, "includeAutomaticOptionalChainCompletions", value.asInstanceOf[js.Any])
    
    inline def setIncludeAutomaticOptionalChainCompletionsUndefined: Self = StObject.set(x, "includeAutomaticOptionalChainCompletions", js.undefined)
    
    inline def setIncludeCompletionsForImportStatements(value: Boolean): Self = StObject.set(x, "includeCompletionsForImportStatements", value.asInstanceOf[js.Any])
    
    inline def setIncludeCompletionsForImportStatementsUndefined: Self = StObject.set(x, "includeCompletionsForImportStatements", js.undefined)
    
    inline def setIncludeCompletionsForModuleExports(value: Boolean): Self = StObject.set(x, "includeCompletionsForModuleExports", value.asInstanceOf[js.Any])
    
    inline def setIncludeCompletionsForModuleExportsUndefined: Self = StObject.set(x, "includeCompletionsForModuleExports", js.undefined)
    
    inline def setIncludeCompletionsWithClassMemberSnippets(value: Boolean): Self = StObject.set(x, "includeCompletionsWithClassMemberSnippets", value.asInstanceOf[js.Any])
    
    inline def setIncludeCompletionsWithClassMemberSnippetsUndefined: Self = StObject.set(x, "includeCompletionsWithClassMemberSnippets", js.undefined)
    
    inline def setIncludeCompletionsWithInsertText(value: Boolean): Self = StObject.set(x, "includeCompletionsWithInsertText", value.asInstanceOf[js.Any])
    
    inline def setIncludeCompletionsWithInsertTextUndefined: Self = StObject.set(x, "includeCompletionsWithInsertText", js.undefined)
    
    inline def setIncludeCompletionsWithObjectLiteralMethodSnippets(value: Boolean): Self = StObject.set(x, "includeCompletionsWithObjectLiteralMethodSnippets", value.asInstanceOf[js.Any])
    
    inline def setIncludeCompletionsWithObjectLiteralMethodSnippetsUndefined: Self = StObject.set(x, "includeCompletionsWithObjectLiteralMethodSnippets", js.undefined)
    
    inline def setIncludeCompletionsWithSnippetText(value: Boolean): Self = StObject.set(x, "includeCompletionsWithSnippetText", value.asInstanceOf[js.Any])
    
    inline def setIncludeCompletionsWithSnippetTextUndefined: Self = StObject.set(x, "includeCompletionsWithSnippetText", js.undefined)
    
    inline def setIncludeInlayEnumMemberValueHints(value: Boolean): Self = StObject.set(x, "includeInlayEnumMemberValueHints", value.asInstanceOf[js.Any])
    
    inline def setIncludeInlayEnumMemberValueHintsUndefined: Self = StObject.set(x, "includeInlayEnumMemberValueHints", js.undefined)
    
    inline def setIncludeInlayFunctionLikeReturnTypeHints(value: Boolean): Self = StObject.set(x, "includeInlayFunctionLikeReturnTypeHints", value.asInstanceOf[js.Any])
    
    inline def setIncludeInlayFunctionLikeReturnTypeHintsUndefined: Self = StObject.set(x, "includeInlayFunctionLikeReturnTypeHints", js.undefined)
    
    inline def setIncludeInlayFunctionParameterTypeHints(value: Boolean): Self = StObject.set(x, "includeInlayFunctionParameterTypeHints", value.asInstanceOf[js.Any])
    
    inline def setIncludeInlayFunctionParameterTypeHintsUndefined: Self = StObject.set(x, "includeInlayFunctionParameterTypeHints", js.undefined)
    
    inline def setIncludeInlayParameterNameHints(value: none | literals | all): Self = StObject.set(x, "includeInlayParameterNameHints", value.asInstanceOf[js.Any])
    
    inline def setIncludeInlayParameterNameHintsUndefined: Self = StObject.set(x, "includeInlayParameterNameHints", js.undefined)
    
    inline def setIncludeInlayParameterNameHintsWhenArgumentMatchesName(value: Boolean): Self = StObject.set(x, "includeInlayParameterNameHintsWhenArgumentMatchesName", value.asInstanceOf[js.Any])
    
    inline def setIncludeInlayParameterNameHintsWhenArgumentMatchesNameUndefined: Self = StObject.set(x, "includeInlayParameterNameHintsWhenArgumentMatchesName", js.undefined)
    
    inline def setIncludeInlayPropertyDeclarationTypeHints(value: Boolean): Self = StObject.set(x, "includeInlayPropertyDeclarationTypeHints", value.asInstanceOf[js.Any])
    
    inline def setIncludeInlayPropertyDeclarationTypeHintsUndefined: Self = StObject.set(x, "includeInlayPropertyDeclarationTypeHints", js.undefined)
    
    inline def setIncludeInlayVariableTypeHints(value: Boolean): Self = StObject.set(x, "includeInlayVariableTypeHints", value.asInstanceOf[js.Any])
    
    inline def setIncludeInlayVariableTypeHintsUndefined: Self = StObject.set(x, "includeInlayVariableTypeHints", js.undefined)
    
    inline def setIncludeInlayVariableTypeHintsWhenTypeMatchesName(value: Boolean): Self = StObject.set(x, "includeInlayVariableTypeHintsWhenTypeMatchesName", value.asInstanceOf[js.Any])
    
    inline def setIncludeInlayVariableTypeHintsWhenTypeMatchesNameUndefined: Self = StObject.set(x, "includeInlayVariableTypeHintsWhenTypeMatchesName", js.undefined)
    
    inline def setIncludePackageJsonAutoImports(value: auto | on | off): Self = StObject.set(x, "includePackageJsonAutoImports", value.asInstanceOf[js.Any])
    
    inline def setIncludePackageJsonAutoImportsUndefined: Self = StObject.set(x, "includePackageJsonAutoImports", js.undefined)
    
    inline def setJsxAttributeCompletionStyle(value: auto | braces | none): Self = StObject.set(x, "jsxAttributeCompletionStyle", value.asInstanceOf[js.Any])
    
    inline def setJsxAttributeCompletionStyleUndefined: Self = StObject.set(x, "jsxAttributeCompletionStyle", js.undefined)
    
    inline def setProvidePrefixAndSuffixTextForRename(value: Boolean): Self = StObject.set(x, "providePrefixAndSuffixTextForRename", value.asInstanceOf[js.Any])
    
    inline def setProvidePrefixAndSuffixTextForRenameUndefined: Self = StObject.set(x, "providePrefixAndSuffixTextForRename", js.undefined)
    
    inline def setProvideRefactorNotApplicableReason(value: Boolean): Self = StObject.set(x, "provideRefactorNotApplicableReason", value.asInstanceOf[js.Any])
    
    inline def setProvideRefactorNotApplicableReasonUndefined: Self = StObject.set(x, "provideRefactorNotApplicableReason", js.undefined)
    
    inline def setQuotePreference(value: auto | double | single): Self = StObject.set(x, "quotePreference", value.asInstanceOf[js.Any])
    
    inline def setQuotePreferenceUndefined: Self = StObject.set(x, "quotePreference", js.undefined)
    
    inline def setUseLabelDetailsInCompletionEntries(value: Boolean): Self = StObject.set(x, "useLabelDetailsInCompletionEntries", value.asInstanceOf[js.Any])
    
    inline def setUseLabelDetailsInCompletionEntriesUndefined: Self = StObject.set(x, "useLabelDetailsInCompletionEntries", js.undefined)
  }
}
