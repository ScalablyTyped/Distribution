package typings.typedoc.anon

import typings.shiki.mod.Theme
import typings.std.Partial
import typings.std.Record
import typings.typedoc.optionsDeclarationMod.ManuallyValidatedOption
import typings.typedoc.optionsDeclarationMod.ValidationOptions
import typings.typedoc.sortMod.SortStrategy
import typings.typedoc.typedocStrings.ClassMember
import typings.typedoc.typedocStrings.ClassOrInterface
import typings.typedoc.typedocStrings.ContainsCallSignatures
import typings.typedoc.typedocStrings.ExportContainer
import typings.typedoc.typedocStrings.FunctionOrMethod
import typings.typedoc.typedocStrings.Inheritable
import typings.typedoc.typedocStrings.SignatureContainer
import typings.typedoc.typedocStrings.SomeExport
import typings.typedoc.typedocStrings.SomeMember
import typings.typedoc.typedocStrings.SomeModule
import typings.typedoc.typedocStrings.SomeSignature
import typings.typedoc.typedocStrings.SomeType
import typings.typedoc.typedocStrings.SomeValue
import typings.typedoc.typedocStrings.VariableOrProperty
import typings.typedoc.typedocStrings.`@$LeftcurlybracketstringRightcurlybracket`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<typedoc.typedoc/dist/lib/utils/options/declaration.TypeDocOptions> */
trait PartialTypeDocOptions extends StObject {
  
  var basePath: js.UndefOr[
    Any | (/* import warning: importer.ImportType#apply Failed type conversion: string[any | undefined] */ js.Any) | Partial[String] | Boolean | String
  ] = js.undefined
  
  var blockTags: js.UndefOr[
    Any | (/* import warning: importer.ImportType#apply Failed type conversion: std.Array<'@${string}'>[any | undefined] */ js.Any) | PartialArraystring | Boolean | js.Array[`@$LeftcurlybracketstringRightcurlybracket`]
  ] = js.undefined
  
  var categorizeByGroup: js.UndefOr[
    Any | (/* import warning: importer.ImportType#apply Failed type conversion: boolean[any | undefined] */ js.Any) | Partial[Boolean] | Boolean
  ] = js.undefined
  
  var categoryOrder: js.UndefOr[
    Any | (/* import warning: importer.ImportType#apply Failed type conversion: std.Array<string>[any | undefined] */ js.Any) | PartialArraystringAt | Boolean | js.Array[String]
  ] = js.undefined
  
  var cleanOutputDir: js.UndefOr[
    Any | (/* import warning: importer.ImportType#apply Failed type conversion: boolean[any | undefined] */ js.Any) | Partial[Boolean] | Boolean
  ] = js.undefined
  
  var cname: js.UndefOr[
    Any | (/* import warning: importer.ImportType#apply Failed type conversion: string[any | undefined] */ js.Any) | Partial[String] | Boolean | String
  ] = js.undefined
  
  var commentStyle: js.UndefOr[
    Any | (/* import warning: importer.ImportType#apply Failed type conversion: typedoc.anon.All[any | undefined] */ js.Any) | PartialreadonlyJSDocjsdoc | Boolean | All
  ] = js.undefined
  
  var compilerOptions: js.UndefOr[
    Any | (/* import warning: importer.ImportType#apply Failed type conversion: unknown[any | undefined] */ js.Any) | Partial[Any] | Boolean
  ] = js.undefined
  
  var customCss: js.UndefOr[
    Any | (/* import warning: importer.ImportType#apply Failed type conversion: string[any | undefined] */ js.Any) | Partial[String] | Boolean | String
  ] = js.undefined
  
  var darkHighlightTheme: js.UndefOr[
    Any | (/* import warning: importer.ImportType#apply Failed type conversion: shiki.shiki.Theme[any | undefined] */ js.Any) | Partial[Theme] | Boolean | Theme
  ] = js.undefined
  
  var defaultCategory: js.UndefOr[
    Any | (/* import warning: importer.ImportType#apply Failed type conversion: string[any | undefined] */ js.Any) | Partial[String] | Boolean | String
  ] = js.undefined
  
  var disableSources: js.UndefOr[
    Any | (/* import warning: importer.ImportType#apply Failed type conversion: boolean[any | undefined] */ js.Any) | Partial[Boolean] | Boolean
  ] = js.undefined
  
  var emit: js.UndefOr[
    Any | (/* import warning: importer.ImportType#apply Failed type conversion: typedoc.anon.Both[any | undefined] */ js.Any) | Partialreadonlybothbothre | Boolean | Both
  ] = js.undefined
  
  var entryPointStrategy: js.UndefOr[
    Any | (/* import warning: importer.ImportType#apply Failed type conversion: typedoc.anon.Expand[any | undefined] */ js.Any) | PartialreadonlyResolveres | Boolean | Expand
  ] = js.undefined
  
  var entryPoints: js.UndefOr[
    Any | (/* import warning: importer.ImportType#apply Failed type conversion: std.Array<string>[any | undefined] */ js.Any) | PartialArraystringAt | Boolean | js.Array[String]
  ] = js.undefined
  
  var exclude: js.UndefOr[
    Any | (/* import warning: importer.ImportType#apply Failed type conversion: std.Array<string>[any | undefined] */ js.Any) | PartialArraystringAt | Boolean | js.Array[String]
  ] = js.undefined
  
  var excludeExternals: js.UndefOr[
    Any | (/* import warning: importer.ImportType#apply Failed type conversion: boolean[any | undefined] */ js.Any) | Partial[Boolean] | Boolean
  ] = js.undefined
  
  var excludeInternal: js.UndefOr[
    Any | (/* import warning: importer.ImportType#apply Failed type conversion: boolean[any | undefined] */ js.Any) | Partial[Boolean] | Boolean
  ] = js.undefined
  
  var excludeNotDocumented: js.UndefOr[
    Any | (/* import warning: importer.ImportType#apply Failed type conversion: boolean[any | undefined] */ js.Any) | Partial[Boolean] | Boolean
  ] = js.undefined
  
  var excludePrivate: js.UndefOr[
    Any | (/* import warning: importer.ImportType#apply Failed type conversion: boolean[any | undefined] */ js.Any) | Partial[Boolean] | Boolean
  ] = js.undefined
  
  var excludeProtected: js.UndefOr[
    Any | (/* import warning: importer.ImportType#apply Failed type conversion: boolean[any | undefined] */ js.Any) | Partial[Boolean] | Boolean
  ] = js.undefined
  
  var excludeTags: js.UndefOr[
    Any | (/* import warning: importer.ImportType#apply Failed type conversion: std.Array<'@${string}'>[any | undefined] */ js.Any) | PartialArraystring | Boolean | js.Array[`@$LeftcurlybracketstringRightcurlybracket`]
  ] = js.undefined
  
  var externalPattern: js.UndefOr[
    Any | (/* import warning: importer.ImportType#apply Failed type conversion: std.Array<string>[any | undefined] */ js.Any) | PartialArraystringAt | Boolean | js.Array[String]
  ] = js.undefined
  
  var externalSymbolLinkMappings: js.UndefOr[
    Any | (/* import warning: importer.ImportType#apply Failed type conversion: typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<std.Record<string, std.Record<string, string>>>[any | undefined] */ js.Any) | PartialManuallyValidatedO0 | Boolean | (ManuallyValidatedOption[Record[String, Record[String, String]]])
  ] = js.undefined
  
  var gaID: js.UndefOr[
    Any | (/* import warning: importer.ImportType#apply Failed type conversion: string[any | undefined] */ js.Any) | Partial[String] | Boolean | String
  ] = js.undefined
  
  var gitRemote: js.UndefOr[
    Any | (/* import warning: importer.ImportType#apply Failed type conversion: string[any | undefined] */ js.Any) | Partial[String] | Boolean | String
  ] = js.undefined
  
  var gitRevision: js.UndefOr[
    Any | (/* import warning: importer.ImportType#apply Failed type conversion: string[any | undefined] */ js.Any) | Partial[String] | Boolean | String
  ] = js.undefined
  
  var githubPages: js.UndefOr[
    Any | (/* import warning: importer.ImportType#apply Failed type conversion: boolean[any | undefined] */ js.Any) | Partial[Boolean] | Boolean
  ] = js.undefined
  
  var help: js.UndefOr[
    Any | (/* import warning: importer.ImportType#apply Failed type conversion: boolean[any | undefined] */ js.Any) | Partial[Boolean] | Boolean
  ] = js.undefined
  
  var hideGenerator: js.UndefOr[
    Any | (/* import warning: importer.ImportType#apply Failed type conversion: boolean[any | undefined] */ js.Any) | Partial[Boolean] | Boolean
  ] = js.undefined
  
  var htmlLang: js.UndefOr[
    Any | (/* import warning: importer.ImportType#apply Failed type conversion: string[any | undefined] */ js.Any) | Partial[String] | Boolean | String
  ] = js.undefined
  
  var includeVersion: js.UndefOr[
    Any | (/* import warning: importer.ImportType#apply Failed type conversion: boolean[any | undefined] */ js.Any) | Partial[Boolean] | Boolean
  ] = js.undefined
  
  var includes: js.UndefOr[
    Any | (/* import warning: importer.ImportType#apply Failed type conversion: string[any | undefined] */ js.Any) | Partial[String] | Boolean | String
  ] = js.undefined
  
  var inlineTags: js.UndefOr[
    Any | (/* import warning: importer.ImportType#apply Failed type conversion: std.Array<'@${string}'>[any | undefined] */ js.Any) | PartialArraystring | Boolean | js.Array[`@$LeftcurlybracketstringRightcurlybracket`]
  ] = js.undefined
  
  var intentionallyNotExported: js.UndefOr[
    Any | (/* import warning: importer.ImportType#apply Failed type conversion: std.Array<string>[any | undefined] */ js.Any) | PartialArraystringAt | Boolean | js.Array[String]
  ] = js.undefined
  
  var json: js.UndefOr[
    Any | (/* import warning: importer.ImportType#apply Failed type conversion: string[any | undefined] */ js.Any) | Partial[String] | Boolean | String
  ] = js.undefined
  
  var lightHighlightTheme: js.UndefOr[
    Any | (/* import warning: importer.ImportType#apply Failed type conversion: shiki.shiki.Theme[any | undefined] */ js.Any) | Partial[Theme] | Boolean | Theme
  ] = js.undefined
  
  var logLevel: js.UndefOr[
    Any | (/* import warning: importer.ImportType#apply Failed type conversion: / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof LogLevel * / any[any | undefined] */ js.Any) | (Partial[
      /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof LogLevel */ Any
    ]) | Boolean
  ] = js.undefined
  
  var logger: js.UndefOr[
    Any | (/* import warning: importer.ImportType#apply Failed type conversion: unknown[any | undefined] */ js.Any) | Partial[Any] | Boolean
  ] = js.undefined
  
  var markedOptions: js.UndefOr[
    Any | (/* import warning: importer.ImportType#apply Failed type conversion: unknown[any | undefined] */ js.Any) | Partial[Any] | Boolean
  ] = js.undefined
  
  var media: js.UndefOr[
    Any | (/* import warning: importer.ImportType#apply Failed type conversion: string[any | undefined] */ js.Any) | Partial[String] | Boolean | String
  ] = js.undefined
  
  var modifierTags: js.UndefOr[
    Any | (/* import warning: importer.ImportType#apply Failed type conversion: std.Array<'@${string}'>[any | undefined] */ js.Any) | PartialArraystring | Boolean | js.Array[`@$LeftcurlybracketstringRightcurlybracket`]
  ] = js.undefined
  
  var name: js.UndefOr[
    Any | (/* import warning: importer.ImportType#apply Failed type conversion: string[any | undefined] */ js.Any) | Partial[String] | Boolean | String
  ] = js.undefined
  
  var options: js.UndefOr[
    Any | (/* import warning: importer.ImportType#apply Failed type conversion: string[any | undefined] */ js.Any) | Partial[String] | Boolean | String
  ] = js.undefined
  
  var out: js.UndefOr[
    Any | (/* import warning: importer.ImportType#apply Failed type conversion: string[any | undefined] */ js.Any) | Partial[String] | Boolean | String
  ] = js.undefined
  
  var plugin: js.UndefOr[
    Any | (/* import warning: importer.ImportType#apply Failed type conversion: std.Array<string>[any | undefined] */ js.Any) | PartialArraystringAt | Boolean | js.Array[String]
  ] = js.undefined
  
  var preserveWatchOutput: js.UndefOr[
    Any | (/* import warning: importer.ImportType#apply Failed type conversion: boolean[any | undefined] */ js.Any) | Partial[Boolean] | Boolean
  ] = js.undefined
  
  var pretty: js.UndefOr[
    Any | (/* import warning: importer.ImportType#apply Failed type conversion: boolean[any | undefined] */ js.Any) | Partial[Boolean] | Boolean
  ] = js.undefined
  
  var readme: js.UndefOr[
    Any | (/* import warning: importer.ImportType#apply Failed type conversion: string[any | undefined] */ js.Any) | Partial[String] | Boolean | String
  ] = js.undefined
  
  var requiredToBeDocumented: js.UndefOr[
    Any | (/* import warning: importer.ImportType#apply Failed type conversion: std.Array<keyof typedoc.anon.TypeofReflectionKind>[any | undefined] */ js.Any) | PartialArraykeyofreadonly | Boolean | (js.Array[
      /* keyof typedoc.anon.TypeofReflectionKind */ typings.typedoc.typedocStrings.All | ClassOrInterface | VariableOrProperty | FunctionOrMethod | ClassMember | SomeSignature | SomeModule | SomeType | SomeValue | SomeMember | SomeExport | ExportContainer | Inheritable | ContainsCallSignatures | SignatureContainer
    ])
  ] = js.undefined
  
  var searchCategoryBoosts: js.UndefOr[
    Any | (/* import warning: importer.ImportType#apply Failed type conversion: typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<std.Record<string, number>>[any | undefined] */ js.Any) | PartialManuallyValidatedO | Boolean | (ManuallyValidatedOption[Record[String, Double]])
  ] = js.undefined
  
  var searchGroupBoosts: js.UndefOr[
    Any | (/* import warning: importer.ImportType#apply Failed type conversion: typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<std.Record<string, number>>[any | undefined] */ js.Any) | PartialManuallyValidatedO | Boolean | (ManuallyValidatedOption[Record[String, Double]])
  ] = js.undefined
  
  var searchInComments: js.UndefOr[
    Any | (/* import warning: importer.ImportType#apply Failed type conversion: boolean[any | undefined] */ js.Any) | Partial[Boolean] | Boolean
  ] = js.undefined
  
  var showConfig: js.UndefOr[
    Any | (/* import warning: importer.ImportType#apply Failed type conversion: boolean[any | undefined] */ js.Any) | Partial[Boolean] | Boolean
  ] = js.undefined
  
  var skipErrorChecking: js.UndefOr[
    Any | (/* import warning: importer.ImportType#apply Failed type conversion: boolean[any | undefined] */ js.Any) | Partial[Boolean] | Boolean
  ] = js.undefined
  
  var sort: js.UndefOr[
    Any | (/* import warning: importer.ImportType#apply Failed type conversion: std.Array<typedoc.typedoc/dist/lib/utils/sort.SortStrategy>[any | undefined] */ js.Any) | PartialArraySortStrategy | Boolean | js.Array[SortStrategy]
  ] = js.undefined
  
  var theme: js.UndefOr[
    Any | (/* import warning: importer.ImportType#apply Failed type conversion: string[any | undefined] */ js.Any) | Partial[String] | Boolean | String
  ] = js.undefined
  
  var treatWarningsAsErrors: js.UndefOr[
    Any | (/* import warning: importer.ImportType#apply Failed type conversion: boolean[any | undefined] */ js.Any) | Partial[Boolean] | Boolean
  ] = js.undefined
  
  var tsconfig: js.UndefOr[
    Any | (/* import warning: importer.ImportType#apply Failed type conversion: string[any | undefined] */ js.Any) | Partial[String] | Boolean | String
  ] = js.undefined
  
  var validation: js.UndefOr[
    Any | (/* import warning: importer.ImportType#apply Failed type conversion: typedoc.typedoc/dist/lib/utils/options/declaration.ValidationOptions[any | undefined] */ js.Any) | PartialValidationOptions | Boolean | ValidationOptions
  ] = js.undefined
  
  var version: js.UndefOr[
    Any | (/* import warning: importer.ImportType#apply Failed type conversion: boolean[any | undefined] */ js.Any) | Partial[Boolean] | Boolean
  ] = js.undefined
  
  var visibilityFilters: js.UndefOr[
    Any | (/* import warning: importer.ImportType#apply Failed type conversion: typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<typedoc.anon.Dicttag>[any | undefined] */ js.Any) | PartialManuallyValidatedOValidated | Boolean | ManuallyValidatedOption[Dicttag]
  ] = js.undefined
  
  var watch: js.UndefOr[
    Any | (/* import warning: importer.ImportType#apply Failed type conversion: boolean[any | undefined] */ js.Any) | Partial[Boolean] | Boolean
  ] = js.undefined
}
object PartialTypeDocOptions {
  
  inline def apply(): PartialTypeDocOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialTypeDocOptions]
  }
  
  extension [Self <: PartialTypeDocOptions](x: Self) {
    
    inline def setBasePath(
      value: Any | (/* import warning: importer.ImportType#apply Failed type conversion: string[any | undefined] */ js.Any) | Partial[String] | Boolean | String
    ): Self = StObject.set(x, "basePath", value.asInstanceOf[js.Any])
    
    inline def setBasePathUndefined: Self = StObject.set(x, "basePath", js.undefined)
    
    inline def setBlockTags(
      value: Any | (/* import warning: importer.ImportType#apply Failed type conversion: std.Array<'@${string}'>[any | undefined] */ js.Any) | PartialArraystring | Boolean | js.Array[`@$LeftcurlybracketstringRightcurlybracket`]
    ): Self = StObject.set(x, "blockTags", value.asInstanceOf[js.Any])
    
    inline def setBlockTagsUndefined: Self = StObject.set(x, "blockTags", js.undefined)
    
    inline def setBlockTagsVarargs(value: `@$LeftcurlybracketstringRightcurlybracket`*): Self = StObject.set(x, "blockTags", js.Array(value*))
    
    inline def setCategorizeByGroup(
      value: Any | (/* import warning: importer.ImportType#apply Failed type conversion: boolean[any | undefined] */ js.Any) | Partial[Boolean] | Boolean
    ): Self = StObject.set(x, "categorizeByGroup", value.asInstanceOf[js.Any])
    
    inline def setCategorizeByGroupUndefined: Self = StObject.set(x, "categorizeByGroup", js.undefined)
    
    inline def setCategoryOrder(
      value: Any | (/* import warning: importer.ImportType#apply Failed type conversion: std.Array<string>[any | undefined] */ js.Any) | PartialArraystringAt | Boolean | js.Array[String]
    ): Self = StObject.set(x, "categoryOrder", value.asInstanceOf[js.Any])
    
    inline def setCategoryOrderUndefined: Self = StObject.set(x, "categoryOrder", js.undefined)
    
    inline def setCategoryOrderVarargs(value: String*): Self = StObject.set(x, "categoryOrder", js.Array(value*))
    
    inline def setCleanOutputDir(
      value: Any | (/* import warning: importer.ImportType#apply Failed type conversion: boolean[any | undefined] */ js.Any) | Partial[Boolean] | Boolean
    ): Self = StObject.set(x, "cleanOutputDir", value.asInstanceOf[js.Any])
    
    inline def setCleanOutputDirUndefined: Self = StObject.set(x, "cleanOutputDir", js.undefined)
    
    inline def setCname(
      value: Any | (/* import warning: importer.ImportType#apply Failed type conversion: string[any | undefined] */ js.Any) | Partial[String] | Boolean | String
    ): Self = StObject.set(x, "cname", value.asInstanceOf[js.Any])
    
    inline def setCnameUndefined: Self = StObject.set(x, "cname", js.undefined)
    
    inline def setCommentStyle(
      value: Any | (/* import warning: importer.ImportType#apply Failed type conversion: typedoc.anon.All[any | undefined] */ js.Any) | PartialreadonlyJSDocjsdoc | Boolean | All
    ): Self = StObject.set(x, "commentStyle", value.asInstanceOf[js.Any])
    
    inline def setCommentStyleUndefined: Self = StObject.set(x, "commentStyle", js.undefined)
    
    inline def setCompilerOptions(
      value: Any | (/* import warning: importer.ImportType#apply Failed type conversion: unknown[any | undefined] */ js.Any) | Partial[Any] | Boolean
    ): Self = StObject.set(x, "compilerOptions", value.asInstanceOf[js.Any])
    
    inline def setCompilerOptionsUndefined: Self = StObject.set(x, "compilerOptions", js.undefined)
    
    inline def setCustomCss(
      value: Any | (/* import warning: importer.ImportType#apply Failed type conversion: string[any | undefined] */ js.Any) | Partial[String] | Boolean | String
    ): Self = StObject.set(x, "customCss", value.asInstanceOf[js.Any])
    
    inline def setCustomCssUndefined: Self = StObject.set(x, "customCss", js.undefined)
    
    inline def setDarkHighlightTheme(
      value: Any | (/* import warning: importer.ImportType#apply Failed type conversion: shiki.shiki.Theme[any | undefined] */ js.Any) | Partial[Theme] | Boolean | Theme
    ): Self = StObject.set(x, "darkHighlightTheme", value.asInstanceOf[js.Any])
    
    inline def setDarkHighlightThemeUndefined: Self = StObject.set(x, "darkHighlightTheme", js.undefined)
    
    inline def setDefaultCategory(
      value: Any | (/* import warning: importer.ImportType#apply Failed type conversion: string[any | undefined] */ js.Any) | Partial[String] | Boolean | String
    ): Self = StObject.set(x, "defaultCategory", value.asInstanceOf[js.Any])
    
    inline def setDefaultCategoryUndefined: Self = StObject.set(x, "defaultCategory", js.undefined)
    
    inline def setDisableSources(
      value: Any | (/* import warning: importer.ImportType#apply Failed type conversion: boolean[any | undefined] */ js.Any) | Partial[Boolean] | Boolean
    ): Self = StObject.set(x, "disableSources", value.asInstanceOf[js.Any])
    
    inline def setDisableSourcesUndefined: Self = StObject.set(x, "disableSources", js.undefined)
    
    inline def setEmit(
      value: Any | (/* import warning: importer.ImportType#apply Failed type conversion: typedoc.anon.Both[any | undefined] */ js.Any) | Partialreadonlybothbothre | Boolean | Both
    ): Self = StObject.set(x, "emit", value.asInstanceOf[js.Any])
    
    inline def setEmitUndefined: Self = StObject.set(x, "emit", js.undefined)
    
    inline def setEntryPointStrategy(
      value: Any | (/* import warning: importer.ImportType#apply Failed type conversion: typedoc.anon.Expand[any | undefined] */ js.Any) | PartialreadonlyResolveres | Boolean | Expand
    ): Self = StObject.set(x, "entryPointStrategy", value.asInstanceOf[js.Any])
    
    inline def setEntryPointStrategyUndefined: Self = StObject.set(x, "entryPointStrategy", js.undefined)
    
    inline def setEntryPoints(
      value: Any | (/* import warning: importer.ImportType#apply Failed type conversion: std.Array<string>[any | undefined] */ js.Any) | PartialArraystringAt | Boolean | js.Array[String]
    ): Self = StObject.set(x, "entryPoints", value.asInstanceOf[js.Any])
    
    inline def setEntryPointsUndefined: Self = StObject.set(x, "entryPoints", js.undefined)
    
    inline def setEntryPointsVarargs(value: String*): Self = StObject.set(x, "entryPoints", js.Array(value*))
    
    inline def setExclude(
      value: Any | (/* import warning: importer.ImportType#apply Failed type conversion: std.Array<string>[any | undefined] */ js.Any) | PartialArraystringAt | Boolean | js.Array[String]
    ): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
    
    inline def setExcludeExternals(
      value: Any | (/* import warning: importer.ImportType#apply Failed type conversion: boolean[any | undefined] */ js.Any) | Partial[Boolean] | Boolean
    ): Self = StObject.set(x, "excludeExternals", value.asInstanceOf[js.Any])
    
    inline def setExcludeExternalsUndefined: Self = StObject.set(x, "excludeExternals", js.undefined)
    
    inline def setExcludeInternal(
      value: Any | (/* import warning: importer.ImportType#apply Failed type conversion: boolean[any | undefined] */ js.Any) | Partial[Boolean] | Boolean
    ): Self = StObject.set(x, "excludeInternal", value.asInstanceOf[js.Any])
    
    inline def setExcludeInternalUndefined: Self = StObject.set(x, "excludeInternal", js.undefined)
    
    inline def setExcludeNotDocumented(
      value: Any | (/* import warning: importer.ImportType#apply Failed type conversion: boolean[any | undefined] */ js.Any) | Partial[Boolean] | Boolean
    ): Self = StObject.set(x, "excludeNotDocumented", value.asInstanceOf[js.Any])
    
    inline def setExcludeNotDocumentedUndefined: Self = StObject.set(x, "excludeNotDocumented", js.undefined)
    
    inline def setExcludePrivate(
      value: Any | (/* import warning: importer.ImportType#apply Failed type conversion: boolean[any | undefined] */ js.Any) | Partial[Boolean] | Boolean
    ): Self = StObject.set(x, "excludePrivate", value.asInstanceOf[js.Any])
    
    inline def setExcludePrivateUndefined: Self = StObject.set(x, "excludePrivate", js.undefined)
    
    inline def setExcludeProtected(
      value: Any | (/* import warning: importer.ImportType#apply Failed type conversion: boolean[any | undefined] */ js.Any) | Partial[Boolean] | Boolean
    ): Self = StObject.set(x, "excludeProtected", value.asInstanceOf[js.Any])
    
    inline def setExcludeProtectedUndefined: Self = StObject.set(x, "excludeProtected", js.undefined)
    
    inline def setExcludeTags(
      value: Any | (/* import warning: importer.ImportType#apply Failed type conversion: std.Array<'@${string}'>[any | undefined] */ js.Any) | PartialArraystring | Boolean | js.Array[`@$LeftcurlybracketstringRightcurlybracket`]
    ): Self = StObject.set(x, "excludeTags", value.asInstanceOf[js.Any])
    
    inline def setExcludeTagsUndefined: Self = StObject.set(x, "excludeTags", js.undefined)
    
    inline def setExcludeTagsVarargs(value: `@$LeftcurlybracketstringRightcurlybracket`*): Self = StObject.set(x, "excludeTags", js.Array(value*))
    
    inline def setExcludeUndefined: Self = StObject.set(x, "exclude", js.undefined)
    
    inline def setExcludeVarargs(value: String*): Self = StObject.set(x, "exclude", js.Array(value*))
    
    inline def setExternalPattern(
      value: Any | (/* import warning: importer.ImportType#apply Failed type conversion: std.Array<string>[any | undefined] */ js.Any) | PartialArraystringAt | Boolean | js.Array[String]
    ): Self = StObject.set(x, "externalPattern", value.asInstanceOf[js.Any])
    
    inline def setExternalPatternUndefined: Self = StObject.set(x, "externalPattern", js.undefined)
    
    inline def setExternalPatternVarargs(value: String*): Self = StObject.set(x, "externalPattern", js.Array(value*))
    
    inline def setExternalSymbolLinkMappings(
      value: Any | (/* import warning: importer.ImportType#apply Failed type conversion: typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<std.Record<string, std.Record<string, string>>>[any | undefined] */ js.Any) | PartialManuallyValidatedO0 | Boolean | (ManuallyValidatedOption[Record[String, Record[String, String]]])
    ): Self = StObject.set(x, "externalSymbolLinkMappings", value.asInstanceOf[js.Any])
    
    inline def setExternalSymbolLinkMappingsUndefined: Self = StObject.set(x, "externalSymbolLinkMappings", js.undefined)
    
    inline def setGaID(
      value: Any | (/* import warning: importer.ImportType#apply Failed type conversion: string[any | undefined] */ js.Any) | Partial[String] | Boolean | String
    ): Self = StObject.set(x, "gaID", value.asInstanceOf[js.Any])
    
    inline def setGaIDUndefined: Self = StObject.set(x, "gaID", js.undefined)
    
    inline def setGitRemote(
      value: Any | (/* import warning: importer.ImportType#apply Failed type conversion: string[any | undefined] */ js.Any) | Partial[String] | Boolean | String
    ): Self = StObject.set(x, "gitRemote", value.asInstanceOf[js.Any])
    
    inline def setGitRemoteUndefined: Self = StObject.set(x, "gitRemote", js.undefined)
    
    inline def setGitRevision(
      value: Any | (/* import warning: importer.ImportType#apply Failed type conversion: string[any | undefined] */ js.Any) | Partial[String] | Boolean | String
    ): Self = StObject.set(x, "gitRevision", value.asInstanceOf[js.Any])
    
    inline def setGitRevisionUndefined: Self = StObject.set(x, "gitRevision", js.undefined)
    
    inline def setGithubPages(
      value: Any | (/* import warning: importer.ImportType#apply Failed type conversion: boolean[any | undefined] */ js.Any) | Partial[Boolean] | Boolean
    ): Self = StObject.set(x, "githubPages", value.asInstanceOf[js.Any])
    
    inline def setGithubPagesUndefined: Self = StObject.set(x, "githubPages", js.undefined)
    
    inline def setHelp(
      value: Any | (/* import warning: importer.ImportType#apply Failed type conversion: boolean[any | undefined] */ js.Any) | Partial[Boolean] | Boolean
    ): Self = StObject.set(x, "help", value.asInstanceOf[js.Any])
    
    inline def setHelpUndefined: Self = StObject.set(x, "help", js.undefined)
    
    inline def setHideGenerator(
      value: Any | (/* import warning: importer.ImportType#apply Failed type conversion: boolean[any | undefined] */ js.Any) | Partial[Boolean] | Boolean
    ): Self = StObject.set(x, "hideGenerator", value.asInstanceOf[js.Any])
    
    inline def setHideGeneratorUndefined: Self = StObject.set(x, "hideGenerator", js.undefined)
    
    inline def setHtmlLang(
      value: Any | (/* import warning: importer.ImportType#apply Failed type conversion: string[any | undefined] */ js.Any) | Partial[String] | Boolean | String
    ): Self = StObject.set(x, "htmlLang", value.asInstanceOf[js.Any])
    
    inline def setHtmlLangUndefined: Self = StObject.set(x, "htmlLang", js.undefined)
    
    inline def setIncludeVersion(
      value: Any | (/* import warning: importer.ImportType#apply Failed type conversion: boolean[any | undefined] */ js.Any) | Partial[Boolean] | Boolean
    ): Self = StObject.set(x, "includeVersion", value.asInstanceOf[js.Any])
    
    inline def setIncludeVersionUndefined: Self = StObject.set(x, "includeVersion", js.undefined)
    
    inline def setIncludes(
      value: Any | (/* import warning: importer.ImportType#apply Failed type conversion: string[any | undefined] */ js.Any) | Partial[String] | Boolean | String
    ): Self = StObject.set(x, "includes", value.asInstanceOf[js.Any])
    
    inline def setIncludesUndefined: Self = StObject.set(x, "includes", js.undefined)
    
    inline def setInlineTags(
      value: Any | (/* import warning: importer.ImportType#apply Failed type conversion: std.Array<'@${string}'>[any | undefined] */ js.Any) | PartialArraystring | Boolean | js.Array[`@$LeftcurlybracketstringRightcurlybracket`]
    ): Self = StObject.set(x, "inlineTags", value.asInstanceOf[js.Any])
    
    inline def setInlineTagsUndefined: Self = StObject.set(x, "inlineTags", js.undefined)
    
    inline def setInlineTagsVarargs(value: `@$LeftcurlybracketstringRightcurlybracket`*): Self = StObject.set(x, "inlineTags", js.Array(value*))
    
    inline def setIntentionallyNotExported(
      value: Any | (/* import warning: importer.ImportType#apply Failed type conversion: std.Array<string>[any | undefined] */ js.Any) | PartialArraystringAt | Boolean | js.Array[String]
    ): Self = StObject.set(x, "intentionallyNotExported", value.asInstanceOf[js.Any])
    
    inline def setIntentionallyNotExportedUndefined: Self = StObject.set(x, "intentionallyNotExported", js.undefined)
    
    inline def setIntentionallyNotExportedVarargs(value: String*): Self = StObject.set(x, "intentionallyNotExported", js.Array(value*))
    
    inline def setJson(
      value: Any | (/* import warning: importer.ImportType#apply Failed type conversion: string[any | undefined] */ js.Any) | Partial[String] | Boolean | String
    ): Self = StObject.set(x, "json", value.asInstanceOf[js.Any])
    
    inline def setJsonUndefined: Self = StObject.set(x, "json", js.undefined)
    
    inline def setLightHighlightTheme(
      value: Any | (/* import warning: importer.ImportType#apply Failed type conversion: shiki.shiki.Theme[any | undefined] */ js.Any) | Partial[Theme] | Boolean | Theme
    ): Self = StObject.set(x, "lightHighlightTheme", value.asInstanceOf[js.Any])
    
    inline def setLightHighlightThemeUndefined: Self = StObject.set(x, "lightHighlightTheme", js.undefined)
    
    inline def setLogLevel(
      value: Any | (/* import warning: importer.ImportType#apply Failed type conversion: / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof LogLevel * / any[any | undefined] */ js.Any) | (Partial[
          /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof LogLevel */ Any
        ]) | Boolean
    ): Self = StObject.set(x, "logLevel", value.asInstanceOf[js.Any])
    
    inline def setLogLevelUndefined: Self = StObject.set(x, "logLevel", js.undefined)
    
    inline def setLogger(
      value: Any | (/* import warning: importer.ImportType#apply Failed type conversion: unknown[any | undefined] */ js.Any) | Partial[Any] | Boolean
    ): Self = StObject.set(x, "logger", value.asInstanceOf[js.Any])
    
    inline def setLoggerUndefined: Self = StObject.set(x, "logger", js.undefined)
    
    inline def setMarkedOptions(
      value: Any | (/* import warning: importer.ImportType#apply Failed type conversion: unknown[any | undefined] */ js.Any) | Partial[Any] | Boolean
    ): Self = StObject.set(x, "markedOptions", value.asInstanceOf[js.Any])
    
    inline def setMarkedOptionsUndefined: Self = StObject.set(x, "markedOptions", js.undefined)
    
    inline def setMedia(
      value: Any | (/* import warning: importer.ImportType#apply Failed type conversion: string[any | undefined] */ js.Any) | Partial[String] | Boolean | String
    ): Self = StObject.set(x, "media", value.asInstanceOf[js.Any])
    
    inline def setMediaUndefined: Self = StObject.set(x, "media", js.undefined)
    
    inline def setModifierTags(
      value: Any | (/* import warning: importer.ImportType#apply Failed type conversion: std.Array<'@${string}'>[any | undefined] */ js.Any) | PartialArraystring | Boolean | js.Array[`@$LeftcurlybracketstringRightcurlybracket`]
    ): Self = StObject.set(x, "modifierTags", value.asInstanceOf[js.Any])
    
    inline def setModifierTagsUndefined: Self = StObject.set(x, "modifierTags", js.undefined)
    
    inline def setModifierTagsVarargs(value: `@$LeftcurlybracketstringRightcurlybracket`*): Self = StObject.set(x, "modifierTags", js.Array(value*))
    
    inline def setName(
      value: Any | (/* import warning: importer.ImportType#apply Failed type conversion: string[any | undefined] */ js.Any) | Partial[String] | Boolean | String
    ): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOptions(
      value: Any | (/* import warning: importer.ImportType#apply Failed type conversion: string[any | undefined] */ js.Any) | Partial[String] | Boolean | String
    ): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    inline def setOut(
      value: Any | (/* import warning: importer.ImportType#apply Failed type conversion: string[any | undefined] */ js.Any) | Partial[String] | Boolean | String
    ): Self = StObject.set(x, "out", value.asInstanceOf[js.Any])
    
    inline def setOutUndefined: Self = StObject.set(x, "out", js.undefined)
    
    inline def setPlugin(
      value: Any | (/* import warning: importer.ImportType#apply Failed type conversion: std.Array<string>[any | undefined] */ js.Any) | PartialArraystringAt | Boolean | js.Array[String]
    ): Self = StObject.set(x, "plugin", value.asInstanceOf[js.Any])
    
    inline def setPluginUndefined: Self = StObject.set(x, "plugin", js.undefined)
    
    inline def setPluginVarargs(value: String*): Self = StObject.set(x, "plugin", js.Array(value*))
    
    inline def setPreserveWatchOutput(
      value: Any | (/* import warning: importer.ImportType#apply Failed type conversion: boolean[any | undefined] */ js.Any) | Partial[Boolean] | Boolean
    ): Self = StObject.set(x, "preserveWatchOutput", value.asInstanceOf[js.Any])
    
    inline def setPreserveWatchOutputUndefined: Self = StObject.set(x, "preserveWatchOutput", js.undefined)
    
    inline def setPretty(
      value: Any | (/* import warning: importer.ImportType#apply Failed type conversion: boolean[any | undefined] */ js.Any) | Partial[Boolean] | Boolean
    ): Self = StObject.set(x, "pretty", value.asInstanceOf[js.Any])
    
    inline def setPrettyUndefined: Self = StObject.set(x, "pretty", js.undefined)
    
    inline def setReadme(
      value: Any | (/* import warning: importer.ImportType#apply Failed type conversion: string[any | undefined] */ js.Any) | Partial[String] | Boolean | String
    ): Self = StObject.set(x, "readme", value.asInstanceOf[js.Any])
    
    inline def setReadmeUndefined: Self = StObject.set(x, "readme", js.undefined)
    
    inline def setRequiredToBeDocumented(
      value: Any | (/* import warning: importer.ImportType#apply Failed type conversion: std.Array<keyof typedoc.anon.TypeofReflectionKind>[any | undefined] */ js.Any) | PartialArraykeyofreadonly | Boolean | (js.Array[
          /* keyof typedoc.anon.TypeofReflectionKind */ typings.typedoc.typedocStrings.All | ClassOrInterface | VariableOrProperty | FunctionOrMethod | ClassMember | SomeSignature | SomeModule | SomeType | SomeValue | SomeMember | SomeExport | ExportContainer | Inheritable | ContainsCallSignatures | SignatureContainer
        ])
    ): Self = StObject.set(x, "requiredToBeDocumented", value.asInstanceOf[js.Any])
    
    inline def setRequiredToBeDocumentedUndefined: Self = StObject.set(x, "requiredToBeDocumented", js.undefined)
    
    inline def setRequiredToBeDocumentedVarargs(
      value: (/* keyof typedoc.anon.TypeofReflectionKind */ typings.typedoc.typedocStrings.All | ClassOrInterface | VariableOrProperty | FunctionOrMethod | ClassMember | SomeSignature | SomeModule | SomeType | SomeValue | SomeMember | SomeExport | ExportContainer | Inheritable | ContainsCallSignatures | SignatureContainer)*
    ): Self = StObject.set(x, "requiredToBeDocumented", js.Array(value*))
    
    inline def setSearchCategoryBoosts(
      value: Any | (/* import warning: importer.ImportType#apply Failed type conversion: typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<std.Record<string, number>>[any | undefined] */ js.Any) | PartialManuallyValidatedO | Boolean | (ManuallyValidatedOption[Record[String, Double]])
    ): Self = StObject.set(x, "searchCategoryBoosts", value.asInstanceOf[js.Any])
    
    inline def setSearchCategoryBoostsUndefined: Self = StObject.set(x, "searchCategoryBoosts", js.undefined)
    
    inline def setSearchGroupBoosts(
      value: Any | (/* import warning: importer.ImportType#apply Failed type conversion: typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<std.Record<string, number>>[any | undefined] */ js.Any) | PartialManuallyValidatedO | Boolean | (ManuallyValidatedOption[Record[String, Double]])
    ): Self = StObject.set(x, "searchGroupBoosts", value.asInstanceOf[js.Any])
    
    inline def setSearchGroupBoostsUndefined: Self = StObject.set(x, "searchGroupBoosts", js.undefined)
    
    inline def setSearchInComments(
      value: Any | (/* import warning: importer.ImportType#apply Failed type conversion: boolean[any | undefined] */ js.Any) | Partial[Boolean] | Boolean
    ): Self = StObject.set(x, "searchInComments", value.asInstanceOf[js.Any])
    
    inline def setSearchInCommentsUndefined: Self = StObject.set(x, "searchInComments", js.undefined)
    
    inline def setShowConfig(
      value: Any | (/* import warning: importer.ImportType#apply Failed type conversion: boolean[any | undefined] */ js.Any) | Partial[Boolean] | Boolean
    ): Self = StObject.set(x, "showConfig", value.asInstanceOf[js.Any])
    
    inline def setShowConfigUndefined: Self = StObject.set(x, "showConfig", js.undefined)
    
    inline def setSkipErrorChecking(
      value: Any | (/* import warning: importer.ImportType#apply Failed type conversion: boolean[any | undefined] */ js.Any) | Partial[Boolean] | Boolean
    ): Self = StObject.set(x, "skipErrorChecking", value.asInstanceOf[js.Any])
    
    inline def setSkipErrorCheckingUndefined: Self = StObject.set(x, "skipErrorChecking", js.undefined)
    
    inline def setSort(
      value: Any | (/* import warning: importer.ImportType#apply Failed type conversion: std.Array<typedoc.typedoc/dist/lib/utils/sort.SortStrategy>[any | undefined] */ js.Any) | PartialArraySortStrategy | Boolean | js.Array[SortStrategy]
    ): Self = StObject.set(x, "sort", value.asInstanceOf[js.Any])
    
    inline def setSortUndefined: Self = StObject.set(x, "sort", js.undefined)
    
    inline def setSortVarargs(value: SortStrategy*): Self = StObject.set(x, "sort", js.Array(value*))
    
    inline def setTheme(
      value: Any | (/* import warning: importer.ImportType#apply Failed type conversion: string[any | undefined] */ js.Any) | Partial[String] | Boolean | String
    ): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    
    inline def setTreatWarningsAsErrors(
      value: Any | (/* import warning: importer.ImportType#apply Failed type conversion: boolean[any | undefined] */ js.Any) | Partial[Boolean] | Boolean
    ): Self = StObject.set(x, "treatWarningsAsErrors", value.asInstanceOf[js.Any])
    
    inline def setTreatWarningsAsErrorsUndefined: Self = StObject.set(x, "treatWarningsAsErrors", js.undefined)
    
    inline def setTsconfig(
      value: Any | (/* import warning: importer.ImportType#apply Failed type conversion: string[any | undefined] */ js.Any) | Partial[String] | Boolean | String
    ): Self = StObject.set(x, "tsconfig", value.asInstanceOf[js.Any])
    
    inline def setTsconfigUndefined: Self = StObject.set(x, "tsconfig", js.undefined)
    
    inline def setValidation(
      value: Any | (/* import warning: importer.ImportType#apply Failed type conversion: typedoc.typedoc/dist/lib/utils/options/declaration.ValidationOptions[any | undefined] */ js.Any) | PartialValidationOptions | Boolean | ValidationOptions
    ): Self = StObject.set(x, "validation", value.asInstanceOf[js.Any])
    
    inline def setValidationUndefined: Self = StObject.set(x, "validation", js.undefined)
    
    inline def setVersion(
      value: Any | (/* import warning: importer.ImportType#apply Failed type conversion: boolean[any | undefined] */ js.Any) | Partial[Boolean] | Boolean
    ): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    
    inline def setVisibilityFilters(
      value: Any | (/* import warning: importer.ImportType#apply Failed type conversion: typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<typedoc.anon.Dicttag>[any | undefined] */ js.Any) | PartialManuallyValidatedOValidated | Boolean | ManuallyValidatedOption[Dicttag]
    ): Self = StObject.set(x, "visibilityFilters", value.asInstanceOf[js.Any])
    
    inline def setVisibilityFiltersUndefined: Self = StObject.set(x, "visibilityFilters", js.undefined)
    
    inline def setWatch(
      value: Any | (/* import warning: importer.ImportType#apply Failed type conversion: boolean[any | undefined] */ js.Any) | Partial[Boolean] | Boolean
    ): Self = StObject.set(x, "watch", value.asInstanceOf[js.Any])
    
    inline def setWatchUndefined: Self = StObject.set(x, "watch", js.undefined)
  }
}
