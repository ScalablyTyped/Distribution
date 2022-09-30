package typings.typedoc.optionsDeclarationMod

import typings.shiki.mod.Theme
import typings.std.Record
import typings.typedoc.anon.All
import typings.typedoc.anon.Both
import typings.typedoc.anon.Dicttag
import typings.typedoc.anon.Expand
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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {[ K in keyof typedoc.typedoc/dist/lib/utils/options/declaration.TypeDocOptionMap ]: unknown extends typedoc.typedoc/dist/lib/utils/options/declaration.TypeDocOptionMap[K]? unknown : typedoc.typedoc/dist/lib/utils/options/declaration.TypeDocOptionMap[K] extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : typedoc.typedoc/dist/lib/utils/options/declaration.TypeDocOptionMap[K] extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? typedoc.typedoc/dist/lib/utils/options/declaration.TypeDocOptionMap[K] : typedoc.typedoc/dist/lib/utils/options/declaration.TypeDocOptionMap[K][keyof typedoc.typedoc/dist/lib/utils/options/declaration.TypeDocOptionMap[K]]} */
trait TypeDocOptionValues extends StObject {
  
  var basePath: (/* import warning: importer.ImportType#apply Failed type conversion: string[any | undefined] */ js.Any) | String | Any
  
  var blockTags: (/* import warning: importer.ImportType#apply Failed type conversion: std.Array</ * template literal string: @${string} * / string>[any | undefined] */ js.Any) | (js.Array[/* template literal string: @${string} */ String]) | Any
  
  var categorizeByGroup: (/* import warning: importer.ImportType#apply Failed type conversion: boolean[any | undefined] */ js.Any) | Boolean | Any
  
  var categoryOrder: (/* import warning: importer.ImportType#apply Failed type conversion: std.Array<string>[any | undefined] */ js.Any) | js.Array[String] | Any
  
  var cleanOutputDir: (/* import warning: importer.ImportType#apply Failed type conversion: boolean[any | undefined] */ js.Any) | Boolean | Any
  
  var cname: (/* import warning: importer.ImportType#apply Failed type conversion: string[any | undefined] */ js.Any) | String | Any
  
  var commentStyle: (/* import warning: importer.ImportType#apply Failed type conversion: typedoc.anon.All[any | undefined] */ js.Any) | All | Any
  
  var compilerOptions: (/* import warning: importer.ImportType#apply Failed type conversion: unknown[any | undefined] */ js.Any) | Any
  
  var customCss: (/* import warning: importer.ImportType#apply Failed type conversion: string[any | undefined] */ js.Any) | String | Any
  
  var darkHighlightTheme: (/* import warning: importer.ImportType#apply Failed type conversion: shiki.shiki.Theme[any | undefined] */ js.Any) | Theme | Any
  
  var defaultCategory: (/* import warning: importer.ImportType#apply Failed type conversion: string[any | undefined] */ js.Any) | String | Any
  
  var disableSources: (/* import warning: importer.ImportType#apply Failed type conversion: boolean[any | undefined] */ js.Any) | Boolean | Any
  
  var emit: (/* import warning: importer.ImportType#apply Failed type conversion: typedoc.anon.Both[any | undefined] */ js.Any) | Both | Any
  
  var entryPointStrategy: (/* import warning: importer.ImportType#apply Failed type conversion: typedoc.anon.Expand[any | undefined] */ js.Any) | Expand | Any
  
  var entryPoints: (/* import warning: importer.ImportType#apply Failed type conversion: std.Array<string>[any | undefined] */ js.Any) | js.Array[String] | Any
  
  var exclude: (/* import warning: importer.ImportType#apply Failed type conversion: std.Array<string>[any | undefined] */ js.Any) | js.Array[String] | Any
  
  var excludeExternals: (/* import warning: importer.ImportType#apply Failed type conversion: boolean[any | undefined] */ js.Any) | Boolean | Any
  
  var excludeInternal: (/* import warning: importer.ImportType#apply Failed type conversion: boolean[any | undefined] */ js.Any) | Boolean | Any
  
  var excludeNotDocumented: (/* import warning: importer.ImportType#apply Failed type conversion: boolean[any | undefined] */ js.Any) | Boolean | Any
  
  var excludePrivate: (/* import warning: importer.ImportType#apply Failed type conversion: boolean[any | undefined] */ js.Any) | Boolean | Any
  
  var excludeProtected: (/* import warning: importer.ImportType#apply Failed type conversion: boolean[any | undefined] */ js.Any) | Boolean | Any
  
  var excludeTags: (/* import warning: importer.ImportType#apply Failed type conversion: std.Array</ * template literal string: @${string} * / string>[any | undefined] */ js.Any) | (js.Array[/* template literal string: @${string} */ String]) | Any
  
  var externalPattern: (/* import warning: importer.ImportType#apply Failed type conversion: std.Array<string>[any | undefined] */ js.Any) | js.Array[String] | Any
  
  var externalSymbolLinkMappings: (/* import warning: importer.ImportType#apply Failed type conversion: typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<std.Record<string, std.Record<string, string>>>[any | undefined] */ js.Any) | (ManuallyValidatedOption[Record[String, Record[String, String]]]) | Any
  
  var gaID: (/* import warning: importer.ImportType#apply Failed type conversion: string[any | undefined] */ js.Any) | String | Any
  
  var gitRemote: (/* import warning: importer.ImportType#apply Failed type conversion: string[any | undefined] */ js.Any) | String | Any
  
  var gitRevision: (/* import warning: importer.ImportType#apply Failed type conversion: string[any | undefined] */ js.Any) | String | Any
  
  var githubPages: (/* import warning: importer.ImportType#apply Failed type conversion: boolean[any | undefined] */ js.Any) | Boolean | Any
  
  var help: (/* import warning: importer.ImportType#apply Failed type conversion: boolean[any | undefined] */ js.Any) | Boolean | Any
  
  var hideGenerator: (/* import warning: importer.ImportType#apply Failed type conversion: boolean[any | undefined] */ js.Any) | Boolean | Any
  
  var htmlLang: (/* import warning: importer.ImportType#apply Failed type conversion: string[any | undefined] */ js.Any) | String | Any
  
  var includeVersion: (/* import warning: importer.ImportType#apply Failed type conversion: boolean[any | undefined] */ js.Any) | Boolean | Any
  
  var includes: (/* import warning: importer.ImportType#apply Failed type conversion: string[any | undefined] */ js.Any) | String | Any
  
  var inlineTags: (/* import warning: importer.ImportType#apply Failed type conversion: std.Array</ * template literal string: @${string} * / string>[any | undefined] */ js.Any) | (js.Array[/* template literal string: @${string} */ String]) | Any
  
  var intentionallyNotExported: (/* import warning: importer.ImportType#apply Failed type conversion: std.Array<string>[any | undefined] */ js.Any) | js.Array[String] | Any
  
  var json: (/* import warning: importer.ImportType#apply Failed type conversion: string[any | undefined] */ js.Any) | String | Any
  
  var lightHighlightTheme: (/* import warning: importer.ImportType#apply Failed type conversion: shiki.shiki.Theme[any | undefined] */ js.Any) | Theme | Any
  
  var logLevel: (/* import warning: importer.ImportType#apply Failed type conversion: / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof LogLevel * / any[any | undefined] */ js.Any) | Any
  
  var logger: (/* import warning: importer.ImportType#apply Failed type conversion: unknown[any | undefined] */ js.Any) | Any
  
  var markedOptions: (/* import warning: importer.ImportType#apply Failed type conversion: unknown[any | undefined] */ js.Any) | Any
  
  var media: (/* import warning: importer.ImportType#apply Failed type conversion: string[any | undefined] */ js.Any) | String | Any
  
  var modifierTags: (/* import warning: importer.ImportType#apply Failed type conversion: std.Array</ * template literal string: @${string} * / string>[any | undefined] */ js.Any) | (js.Array[/* template literal string: @${string} */ String]) | Any
  
  var name: (/* import warning: importer.ImportType#apply Failed type conversion: string[any | undefined] */ js.Any) | String | Any
  
  var options: (/* import warning: importer.ImportType#apply Failed type conversion: string[any | undefined] */ js.Any) | String | Any
  
  var out: (/* import warning: importer.ImportType#apply Failed type conversion: string[any | undefined] */ js.Any) | String | Any
  
  var plugin: (/* import warning: importer.ImportType#apply Failed type conversion: std.Array<string>[any | undefined] */ js.Any) | js.Array[String] | Any
  
  var preserveWatchOutput: (/* import warning: importer.ImportType#apply Failed type conversion: boolean[any | undefined] */ js.Any) | Boolean | Any
  
  var pretty: (/* import warning: importer.ImportType#apply Failed type conversion: boolean[any | undefined] */ js.Any) | Boolean | Any
  
  var readme: (/* import warning: importer.ImportType#apply Failed type conversion: string[any | undefined] */ js.Any) | String | Any
  
  var requiredToBeDocumented: (/* import warning: importer.ImportType#apply Failed type conversion: std.Array<keyof typedoc.anon.TypeofReflectionKind>[any | undefined] */ js.Any) | (js.Array[
    /* keyof typedoc.anon.TypeofReflectionKind */ typings.typedoc.typedocStrings.All | ClassOrInterface | VariableOrProperty | FunctionOrMethod | ClassMember | SomeSignature | SomeModule | SomeType | SomeValue | SomeMember | SomeExport | ExportContainer | Inheritable | ContainsCallSignatures | SignatureContainer
  ]) | Any
  
  var searchCategoryBoosts: (/* import warning: importer.ImportType#apply Failed type conversion: typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<std.Record<string, number>>[any | undefined] */ js.Any) | (ManuallyValidatedOption[Record[String, Double]]) | Any
  
  var searchGroupBoosts: (/* import warning: importer.ImportType#apply Failed type conversion: typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<std.Record<string, number>>[any | undefined] */ js.Any) | (ManuallyValidatedOption[Record[String, Double]]) | Any
  
  var searchInComments: (/* import warning: importer.ImportType#apply Failed type conversion: boolean[any | undefined] */ js.Any) | Boolean | Any
  
  var showConfig: (/* import warning: importer.ImportType#apply Failed type conversion: boolean[any | undefined] */ js.Any) | Boolean | Any
  
  var skipErrorChecking: (/* import warning: importer.ImportType#apply Failed type conversion: boolean[any | undefined] */ js.Any) | Boolean | Any
  
  var sort: (/* import warning: importer.ImportType#apply Failed type conversion: std.Array<typedoc.typedoc/dist/lib/utils/sort.SortStrategy>[any | undefined] */ js.Any) | js.Array[SortStrategy] | Any
  
  var theme: (/* import warning: importer.ImportType#apply Failed type conversion: string[any | undefined] */ js.Any) | String | Any
  
  var treatWarningsAsErrors: (/* import warning: importer.ImportType#apply Failed type conversion: boolean[any | undefined] */ js.Any) | Boolean | Any
  
  var tsconfig: (/* import warning: importer.ImportType#apply Failed type conversion: string[any | undefined] */ js.Any) | String | Any
  
  var validation: (/* import warning: importer.ImportType#apply Failed type conversion: typedoc.typedoc/dist/lib/utils/options/declaration.ValidationOptions[any | undefined] */ js.Any) | ValidationOptions | Any
  
  var version: (/* import warning: importer.ImportType#apply Failed type conversion: boolean[any | undefined] */ js.Any) | Boolean | Any
  
  var visibilityFilters: (/* import warning: importer.ImportType#apply Failed type conversion: typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<typedoc.anon.Dicttag>[any | undefined] */ js.Any) | ManuallyValidatedOption[Dicttag] | Any
  
  var watch: (/* import warning: importer.ImportType#apply Failed type conversion: boolean[any | undefined] */ js.Any) | Boolean | Any
}
object TypeDocOptionValues {
  
  inline def apply(
    basePath: (/* import warning: importer.ImportType#apply Failed type conversion: string[any | undefined] */ js.Any) | String | Any,
    blockTags: (/* import warning: importer.ImportType#apply Failed type conversion: std.Array</ * template literal string: @${string} * / string>[any | undefined] */ js.Any) | (js.Array[/* template literal string: @${string} */ String]) | Any,
    categorizeByGroup: (/* import warning: importer.ImportType#apply Failed type conversion: boolean[any | undefined] */ js.Any) | Boolean | Any,
    categoryOrder: (/* import warning: importer.ImportType#apply Failed type conversion: std.Array<string>[any | undefined] */ js.Any) | js.Array[String] | Any,
    cleanOutputDir: (/* import warning: importer.ImportType#apply Failed type conversion: boolean[any | undefined] */ js.Any) | Boolean | Any,
    cname: (/* import warning: importer.ImportType#apply Failed type conversion: string[any | undefined] */ js.Any) | String | Any,
    commentStyle: (/* import warning: importer.ImportType#apply Failed type conversion: typedoc.anon.All[any | undefined] */ js.Any) | All | Any,
    compilerOptions: (/* import warning: importer.ImportType#apply Failed type conversion: unknown[any | undefined] */ js.Any) | Any,
    customCss: (/* import warning: importer.ImportType#apply Failed type conversion: string[any | undefined] */ js.Any) | String | Any,
    darkHighlightTheme: (/* import warning: importer.ImportType#apply Failed type conversion: shiki.shiki.Theme[any | undefined] */ js.Any) | Theme | Any,
    defaultCategory: (/* import warning: importer.ImportType#apply Failed type conversion: string[any | undefined] */ js.Any) | String | Any,
    disableSources: (/* import warning: importer.ImportType#apply Failed type conversion: boolean[any | undefined] */ js.Any) | Boolean | Any,
    emit: (/* import warning: importer.ImportType#apply Failed type conversion: typedoc.anon.Both[any | undefined] */ js.Any) | Both | Any,
    entryPointStrategy: (/* import warning: importer.ImportType#apply Failed type conversion: typedoc.anon.Expand[any | undefined] */ js.Any) | Expand | Any,
    entryPoints: (/* import warning: importer.ImportType#apply Failed type conversion: std.Array<string>[any | undefined] */ js.Any) | js.Array[String] | Any,
    exclude: (/* import warning: importer.ImportType#apply Failed type conversion: std.Array<string>[any | undefined] */ js.Any) | js.Array[String] | Any,
    excludeExternals: (/* import warning: importer.ImportType#apply Failed type conversion: boolean[any | undefined] */ js.Any) | Boolean | Any,
    excludeInternal: (/* import warning: importer.ImportType#apply Failed type conversion: boolean[any | undefined] */ js.Any) | Boolean | Any,
    excludeNotDocumented: (/* import warning: importer.ImportType#apply Failed type conversion: boolean[any | undefined] */ js.Any) | Boolean | Any,
    excludePrivate: (/* import warning: importer.ImportType#apply Failed type conversion: boolean[any | undefined] */ js.Any) | Boolean | Any,
    excludeProtected: (/* import warning: importer.ImportType#apply Failed type conversion: boolean[any | undefined] */ js.Any) | Boolean | Any,
    excludeTags: (/* import warning: importer.ImportType#apply Failed type conversion: std.Array</ * template literal string: @${string} * / string>[any | undefined] */ js.Any) | (js.Array[/* template literal string: @${string} */ String]) | Any,
    externalPattern: (/* import warning: importer.ImportType#apply Failed type conversion: std.Array<string>[any | undefined] */ js.Any) | js.Array[String] | Any,
    externalSymbolLinkMappings: (/* import warning: importer.ImportType#apply Failed type conversion: typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<std.Record<string, std.Record<string, string>>>[any | undefined] */ js.Any) | (ManuallyValidatedOption[Record[String, Record[String, String]]]) | Any,
    gaID: (/* import warning: importer.ImportType#apply Failed type conversion: string[any | undefined] */ js.Any) | String | Any,
    gitRemote: (/* import warning: importer.ImportType#apply Failed type conversion: string[any | undefined] */ js.Any) | String | Any,
    gitRevision: (/* import warning: importer.ImportType#apply Failed type conversion: string[any | undefined] */ js.Any) | String | Any,
    githubPages: (/* import warning: importer.ImportType#apply Failed type conversion: boolean[any | undefined] */ js.Any) | Boolean | Any,
    help: (/* import warning: importer.ImportType#apply Failed type conversion: boolean[any | undefined] */ js.Any) | Boolean | Any,
    hideGenerator: (/* import warning: importer.ImportType#apply Failed type conversion: boolean[any | undefined] */ js.Any) | Boolean | Any,
    htmlLang: (/* import warning: importer.ImportType#apply Failed type conversion: string[any | undefined] */ js.Any) | String | Any,
    includeVersion: (/* import warning: importer.ImportType#apply Failed type conversion: boolean[any | undefined] */ js.Any) | Boolean | Any,
    includes: (/* import warning: importer.ImportType#apply Failed type conversion: string[any | undefined] */ js.Any) | String | Any,
    inlineTags: (/* import warning: importer.ImportType#apply Failed type conversion: std.Array</ * template literal string: @${string} * / string>[any | undefined] */ js.Any) | (js.Array[/* template literal string: @${string} */ String]) | Any,
    intentionallyNotExported: (/* import warning: importer.ImportType#apply Failed type conversion: std.Array<string>[any | undefined] */ js.Any) | js.Array[String] | Any,
    json: (/* import warning: importer.ImportType#apply Failed type conversion: string[any | undefined] */ js.Any) | String | Any,
    lightHighlightTheme: (/* import warning: importer.ImportType#apply Failed type conversion: shiki.shiki.Theme[any | undefined] */ js.Any) | Theme | Any,
    logLevel: (/* import warning: importer.ImportType#apply Failed type conversion: / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof LogLevel * / any[any | undefined] */ js.Any) | Any,
    logger: (/* import warning: importer.ImportType#apply Failed type conversion: unknown[any | undefined] */ js.Any) | Any,
    markedOptions: (/* import warning: importer.ImportType#apply Failed type conversion: unknown[any | undefined] */ js.Any) | Any,
    media: (/* import warning: importer.ImportType#apply Failed type conversion: string[any | undefined] */ js.Any) | String | Any,
    modifierTags: (/* import warning: importer.ImportType#apply Failed type conversion: std.Array</ * template literal string: @${string} * / string>[any | undefined] */ js.Any) | (js.Array[/* template literal string: @${string} */ String]) | Any,
    name: (/* import warning: importer.ImportType#apply Failed type conversion: string[any | undefined] */ js.Any) | String | Any,
    options: (/* import warning: importer.ImportType#apply Failed type conversion: string[any | undefined] */ js.Any) | String | Any,
    out: (/* import warning: importer.ImportType#apply Failed type conversion: string[any | undefined] */ js.Any) | String | Any,
    plugin: (/* import warning: importer.ImportType#apply Failed type conversion: std.Array<string>[any | undefined] */ js.Any) | js.Array[String] | Any,
    preserveWatchOutput: (/* import warning: importer.ImportType#apply Failed type conversion: boolean[any | undefined] */ js.Any) | Boolean | Any,
    pretty: (/* import warning: importer.ImportType#apply Failed type conversion: boolean[any | undefined] */ js.Any) | Boolean | Any,
    readme: (/* import warning: importer.ImportType#apply Failed type conversion: string[any | undefined] */ js.Any) | String | Any,
    requiredToBeDocumented: (/* import warning: importer.ImportType#apply Failed type conversion: std.Array<keyof typedoc.anon.TypeofReflectionKind>[any | undefined] */ js.Any) | (js.Array[
      /* keyof typedoc.anon.TypeofReflectionKind */ typings.typedoc.typedocStrings.All | ClassOrInterface | VariableOrProperty | FunctionOrMethod | ClassMember | SomeSignature | SomeModule | SomeType | SomeValue | SomeMember | SomeExport | ExportContainer | Inheritable | ContainsCallSignatures | SignatureContainer
    ]) | Any,
    searchCategoryBoosts: (/* import warning: importer.ImportType#apply Failed type conversion: typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<std.Record<string, number>>[any | undefined] */ js.Any) | (ManuallyValidatedOption[Record[String, Double]]) | Any,
    searchGroupBoosts: (/* import warning: importer.ImportType#apply Failed type conversion: typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<std.Record<string, number>>[any | undefined] */ js.Any) | (ManuallyValidatedOption[Record[String, Double]]) | Any,
    searchInComments: (/* import warning: importer.ImportType#apply Failed type conversion: boolean[any | undefined] */ js.Any) | Boolean | Any,
    showConfig: (/* import warning: importer.ImportType#apply Failed type conversion: boolean[any | undefined] */ js.Any) | Boolean | Any,
    skipErrorChecking: (/* import warning: importer.ImportType#apply Failed type conversion: boolean[any | undefined] */ js.Any) | Boolean | Any,
    sort: (/* import warning: importer.ImportType#apply Failed type conversion: std.Array<typedoc.typedoc/dist/lib/utils/sort.SortStrategy>[any | undefined] */ js.Any) | js.Array[SortStrategy] | Any,
    theme: (/* import warning: importer.ImportType#apply Failed type conversion: string[any | undefined] */ js.Any) | String | Any,
    treatWarningsAsErrors: (/* import warning: importer.ImportType#apply Failed type conversion: boolean[any | undefined] */ js.Any) | Boolean | Any,
    tsconfig: (/* import warning: importer.ImportType#apply Failed type conversion: string[any | undefined] */ js.Any) | String | Any,
    validation: (/* import warning: importer.ImportType#apply Failed type conversion: typedoc.typedoc/dist/lib/utils/options/declaration.ValidationOptions[any | undefined] */ js.Any) | ValidationOptions | Any,
    version: (/* import warning: importer.ImportType#apply Failed type conversion: boolean[any | undefined] */ js.Any) | Boolean | Any,
    visibilityFilters: (/* import warning: importer.ImportType#apply Failed type conversion: typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<typedoc.anon.Dicttag>[any | undefined] */ js.Any) | ManuallyValidatedOption[Dicttag] | Any,
    watch: (/* import warning: importer.ImportType#apply Failed type conversion: boolean[any | undefined] */ js.Any) | Boolean | Any
  ): TypeDocOptionValues = {
    val __obj = js.Dynamic.literal(basePath = basePath.asInstanceOf[js.Any], blockTags = blockTags.asInstanceOf[js.Any], categorizeByGroup = categorizeByGroup.asInstanceOf[js.Any], categoryOrder = categoryOrder.asInstanceOf[js.Any], cleanOutputDir = cleanOutputDir.asInstanceOf[js.Any], cname = cname.asInstanceOf[js.Any], commentStyle = commentStyle.asInstanceOf[js.Any], compilerOptions = compilerOptions.asInstanceOf[js.Any], customCss = customCss.asInstanceOf[js.Any], darkHighlightTheme = darkHighlightTheme.asInstanceOf[js.Any], defaultCategory = defaultCategory.asInstanceOf[js.Any], disableSources = disableSources.asInstanceOf[js.Any], emit = emit.asInstanceOf[js.Any], entryPointStrategy = entryPointStrategy.asInstanceOf[js.Any], entryPoints = entryPoints.asInstanceOf[js.Any], exclude = exclude.asInstanceOf[js.Any], excludeExternals = excludeExternals.asInstanceOf[js.Any], excludeInternal = excludeInternal.asInstanceOf[js.Any], excludeNotDocumented = excludeNotDocumented.asInstanceOf[js.Any], excludePrivate = excludePrivate.asInstanceOf[js.Any], excludeProtected = excludeProtected.asInstanceOf[js.Any], excludeTags = excludeTags.asInstanceOf[js.Any], externalPattern = externalPattern.asInstanceOf[js.Any], externalSymbolLinkMappings = externalSymbolLinkMappings.asInstanceOf[js.Any], gaID = gaID.asInstanceOf[js.Any], gitRemote = gitRemote.asInstanceOf[js.Any], gitRevision = gitRevision.asInstanceOf[js.Any], githubPages = githubPages.asInstanceOf[js.Any], help = help.asInstanceOf[js.Any], hideGenerator = hideGenerator.asInstanceOf[js.Any], htmlLang = htmlLang.asInstanceOf[js.Any], includeVersion = includeVersion.asInstanceOf[js.Any], includes = includes.asInstanceOf[js.Any], inlineTags = inlineTags.asInstanceOf[js.Any], intentionallyNotExported = intentionallyNotExported.asInstanceOf[js.Any], json = json.asInstanceOf[js.Any], lightHighlightTheme = lightHighlightTheme.asInstanceOf[js.Any], logLevel = logLevel.asInstanceOf[js.Any], logger = logger.asInstanceOf[js.Any], markedOptions = markedOptions.asInstanceOf[js.Any], media = media.asInstanceOf[js.Any], modifierTags = modifierTags.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], out = out.asInstanceOf[js.Any], plugin = plugin.asInstanceOf[js.Any], preserveWatchOutput = preserveWatchOutput.asInstanceOf[js.Any], pretty = pretty.asInstanceOf[js.Any], readme = readme.asInstanceOf[js.Any], requiredToBeDocumented = requiredToBeDocumented.asInstanceOf[js.Any], searchCategoryBoosts = searchCategoryBoosts.asInstanceOf[js.Any], searchGroupBoosts = searchGroupBoosts.asInstanceOf[js.Any], searchInComments = searchInComments.asInstanceOf[js.Any], showConfig = showConfig.asInstanceOf[js.Any], skipErrorChecking = skipErrorChecking.asInstanceOf[js.Any], sort = sort.asInstanceOf[js.Any], theme = theme.asInstanceOf[js.Any], treatWarningsAsErrors = treatWarningsAsErrors.asInstanceOf[js.Any], tsconfig = tsconfig.asInstanceOf[js.Any], validation = validation.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any], visibilityFilters = visibilityFilters.asInstanceOf[js.Any], watch = watch.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeDocOptionValues]
  }
  
  extension [Self <: TypeDocOptionValues](x: Self) {
    
    inline def setBasePath(
      value: (/* import warning: importer.ImportType#apply Failed type conversion: string[any | undefined] */ js.Any) | String | Any
    ): Self = StObject.set(x, "basePath", value.asInstanceOf[js.Any])
    
    inline def setBlockTags(
      value: (/* import warning: importer.ImportType#apply Failed type conversion: std.Array</ * template literal string: @${string} * / string>[any | undefined] */ js.Any) | (js.Array[/* template literal string: @${string} */ String]) | Any
    ): Self = StObject.set(x, "blockTags", value.asInstanceOf[js.Any])
    
    inline def setBlockTagsVarargs(value: (/* template literal string: @${string} */ String)*): Self = StObject.set(x, "blockTags", js.Array(value*))
    
    inline def setCategorizeByGroup(
      value: (/* import warning: importer.ImportType#apply Failed type conversion: boolean[any | undefined] */ js.Any) | Boolean | Any
    ): Self = StObject.set(x, "categorizeByGroup", value.asInstanceOf[js.Any])
    
    inline def setCategoryOrder(
      value: (/* import warning: importer.ImportType#apply Failed type conversion: std.Array<string>[any | undefined] */ js.Any) | js.Array[String] | Any
    ): Self = StObject.set(x, "categoryOrder", value.asInstanceOf[js.Any])
    
    inline def setCategoryOrderVarargs(value: String*): Self = StObject.set(x, "categoryOrder", js.Array(value*))
    
    inline def setCleanOutputDir(
      value: (/* import warning: importer.ImportType#apply Failed type conversion: boolean[any | undefined] */ js.Any) | Boolean | Any
    ): Self = StObject.set(x, "cleanOutputDir", value.asInstanceOf[js.Any])
    
    inline def setCname(
      value: (/* import warning: importer.ImportType#apply Failed type conversion: string[any | undefined] */ js.Any) | String | Any
    ): Self = StObject.set(x, "cname", value.asInstanceOf[js.Any])
    
    inline def setCommentStyle(
      value: (/* import warning: importer.ImportType#apply Failed type conversion: typedoc.anon.All[any | undefined] */ js.Any) | All | Any
    ): Self = StObject.set(x, "commentStyle", value.asInstanceOf[js.Any])
    
    inline def setCompilerOptions(
      value: (/* import warning: importer.ImportType#apply Failed type conversion: unknown[any | undefined] */ js.Any) | Any
    ): Self = StObject.set(x, "compilerOptions", value.asInstanceOf[js.Any])
    
    inline def setCustomCss(
      value: (/* import warning: importer.ImportType#apply Failed type conversion: string[any | undefined] */ js.Any) | String | Any
    ): Self = StObject.set(x, "customCss", value.asInstanceOf[js.Any])
    
    inline def setDarkHighlightTheme(
      value: (/* import warning: importer.ImportType#apply Failed type conversion: shiki.shiki.Theme[any | undefined] */ js.Any) | Theme | Any
    ): Self = StObject.set(x, "darkHighlightTheme", value.asInstanceOf[js.Any])
    
    inline def setDefaultCategory(
      value: (/* import warning: importer.ImportType#apply Failed type conversion: string[any | undefined] */ js.Any) | String | Any
    ): Self = StObject.set(x, "defaultCategory", value.asInstanceOf[js.Any])
    
    inline def setDisableSources(
      value: (/* import warning: importer.ImportType#apply Failed type conversion: boolean[any | undefined] */ js.Any) | Boolean | Any
    ): Self = StObject.set(x, "disableSources", value.asInstanceOf[js.Any])
    
    inline def setEmit(
      value: (/* import warning: importer.ImportType#apply Failed type conversion: typedoc.anon.Both[any | undefined] */ js.Any) | Both | Any
    ): Self = StObject.set(x, "emit", value.asInstanceOf[js.Any])
    
    inline def setEntryPointStrategy(
      value: (/* import warning: importer.ImportType#apply Failed type conversion: typedoc.anon.Expand[any | undefined] */ js.Any) | Expand | Any
    ): Self = StObject.set(x, "entryPointStrategy", value.asInstanceOf[js.Any])
    
    inline def setEntryPoints(
      value: (/* import warning: importer.ImportType#apply Failed type conversion: std.Array<string>[any | undefined] */ js.Any) | js.Array[String] | Any
    ): Self = StObject.set(x, "entryPoints", value.asInstanceOf[js.Any])
    
    inline def setEntryPointsVarargs(value: String*): Self = StObject.set(x, "entryPoints", js.Array(value*))
    
    inline def setExclude(
      value: (/* import warning: importer.ImportType#apply Failed type conversion: std.Array<string>[any | undefined] */ js.Any) | js.Array[String] | Any
    ): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
    
    inline def setExcludeExternals(
      value: (/* import warning: importer.ImportType#apply Failed type conversion: boolean[any | undefined] */ js.Any) | Boolean | Any
    ): Self = StObject.set(x, "excludeExternals", value.asInstanceOf[js.Any])
    
    inline def setExcludeInternal(
      value: (/* import warning: importer.ImportType#apply Failed type conversion: boolean[any | undefined] */ js.Any) | Boolean | Any
    ): Self = StObject.set(x, "excludeInternal", value.asInstanceOf[js.Any])
    
    inline def setExcludeNotDocumented(
      value: (/* import warning: importer.ImportType#apply Failed type conversion: boolean[any | undefined] */ js.Any) | Boolean | Any
    ): Self = StObject.set(x, "excludeNotDocumented", value.asInstanceOf[js.Any])
    
    inline def setExcludePrivate(
      value: (/* import warning: importer.ImportType#apply Failed type conversion: boolean[any | undefined] */ js.Any) | Boolean | Any
    ): Self = StObject.set(x, "excludePrivate", value.asInstanceOf[js.Any])
    
    inline def setExcludeProtected(
      value: (/* import warning: importer.ImportType#apply Failed type conversion: boolean[any | undefined] */ js.Any) | Boolean | Any
    ): Self = StObject.set(x, "excludeProtected", value.asInstanceOf[js.Any])
    
    inline def setExcludeTags(
      value: (/* import warning: importer.ImportType#apply Failed type conversion: std.Array</ * template literal string: @${string} * / string>[any | undefined] */ js.Any) | (js.Array[/* template literal string: @${string} */ String]) | Any
    ): Self = StObject.set(x, "excludeTags", value.asInstanceOf[js.Any])
    
    inline def setExcludeTagsVarargs(value: (/* template literal string: @${string} */ String)*): Self = StObject.set(x, "excludeTags", js.Array(value*))
    
    inline def setExcludeVarargs(value: String*): Self = StObject.set(x, "exclude", js.Array(value*))
    
    inline def setExternalPattern(
      value: (/* import warning: importer.ImportType#apply Failed type conversion: std.Array<string>[any | undefined] */ js.Any) | js.Array[String] | Any
    ): Self = StObject.set(x, "externalPattern", value.asInstanceOf[js.Any])
    
    inline def setExternalPatternVarargs(value: String*): Self = StObject.set(x, "externalPattern", js.Array(value*))
    
    inline def setExternalSymbolLinkMappings(
      value: (/* import warning: importer.ImportType#apply Failed type conversion: typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<std.Record<string, std.Record<string, string>>>[any | undefined] */ js.Any) | (ManuallyValidatedOption[Record[String, Record[String, String]]]) | Any
    ): Self = StObject.set(x, "externalSymbolLinkMappings", value.asInstanceOf[js.Any])
    
    inline def setGaID(
      value: (/* import warning: importer.ImportType#apply Failed type conversion: string[any | undefined] */ js.Any) | String | Any
    ): Self = StObject.set(x, "gaID", value.asInstanceOf[js.Any])
    
    inline def setGitRemote(
      value: (/* import warning: importer.ImportType#apply Failed type conversion: string[any | undefined] */ js.Any) | String | Any
    ): Self = StObject.set(x, "gitRemote", value.asInstanceOf[js.Any])
    
    inline def setGitRevision(
      value: (/* import warning: importer.ImportType#apply Failed type conversion: string[any | undefined] */ js.Any) | String | Any
    ): Self = StObject.set(x, "gitRevision", value.asInstanceOf[js.Any])
    
    inline def setGithubPages(
      value: (/* import warning: importer.ImportType#apply Failed type conversion: boolean[any | undefined] */ js.Any) | Boolean | Any
    ): Self = StObject.set(x, "githubPages", value.asInstanceOf[js.Any])
    
    inline def setHelp(
      value: (/* import warning: importer.ImportType#apply Failed type conversion: boolean[any | undefined] */ js.Any) | Boolean | Any
    ): Self = StObject.set(x, "help", value.asInstanceOf[js.Any])
    
    inline def setHideGenerator(
      value: (/* import warning: importer.ImportType#apply Failed type conversion: boolean[any | undefined] */ js.Any) | Boolean | Any
    ): Self = StObject.set(x, "hideGenerator", value.asInstanceOf[js.Any])
    
    inline def setHtmlLang(
      value: (/* import warning: importer.ImportType#apply Failed type conversion: string[any | undefined] */ js.Any) | String | Any
    ): Self = StObject.set(x, "htmlLang", value.asInstanceOf[js.Any])
    
    inline def setIncludeVersion(
      value: (/* import warning: importer.ImportType#apply Failed type conversion: boolean[any | undefined] */ js.Any) | Boolean | Any
    ): Self = StObject.set(x, "includeVersion", value.asInstanceOf[js.Any])
    
    inline def setIncludes(
      value: (/* import warning: importer.ImportType#apply Failed type conversion: string[any | undefined] */ js.Any) | String | Any
    ): Self = StObject.set(x, "includes", value.asInstanceOf[js.Any])
    
    inline def setInlineTags(
      value: (/* import warning: importer.ImportType#apply Failed type conversion: std.Array</ * template literal string: @${string} * / string>[any | undefined] */ js.Any) | (js.Array[/* template literal string: @${string} */ String]) | Any
    ): Self = StObject.set(x, "inlineTags", value.asInstanceOf[js.Any])
    
    inline def setInlineTagsVarargs(value: (/* template literal string: @${string} */ String)*): Self = StObject.set(x, "inlineTags", js.Array(value*))
    
    inline def setIntentionallyNotExported(
      value: (/* import warning: importer.ImportType#apply Failed type conversion: std.Array<string>[any | undefined] */ js.Any) | js.Array[String] | Any
    ): Self = StObject.set(x, "intentionallyNotExported", value.asInstanceOf[js.Any])
    
    inline def setIntentionallyNotExportedVarargs(value: String*): Self = StObject.set(x, "intentionallyNotExported", js.Array(value*))
    
    inline def setJson(
      value: (/* import warning: importer.ImportType#apply Failed type conversion: string[any | undefined] */ js.Any) | String | Any
    ): Self = StObject.set(x, "json", value.asInstanceOf[js.Any])
    
    inline def setLightHighlightTheme(
      value: (/* import warning: importer.ImportType#apply Failed type conversion: shiki.shiki.Theme[any | undefined] */ js.Any) | Theme | Any
    ): Self = StObject.set(x, "lightHighlightTheme", value.asInstanceOf[js.Any])
    
    inline def setLogLevel(
      value: (/* import warning: importer.ImportType#apply Failed type conversion: / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof LogLevel * / any[any | undefined] */ js.Any) | Any
    ): Self = StObject.set(x, "logLevel", value.asInstanceOf[js.Any])
    
    inline def setLogger(
      value: (/* import warning: importer.ImportType#apply Failed type conversion: unknown[any | undefined] */ js.Any) | Any
    ): Self = StObject.set(x, "logger", value.asInstanceOf[js.Any])
    
    inline def setMarkedOptions(
      value: (/* import warning: importer.ImportType#apply Failed type conversion: unknown[any | undefined] */ js.Any) | Any
    ): Self = StObject.set(x, "markedOptions", value.asInstanceOf[js.Any])
    
    inline def setMedia(
      value: (/* import warning: importer.ImportType#apply Failed type conversion: string[any | undefined] */ js.Any) | String | Any
    ): Self = StObject.set(x, "media", value.asInstanceOf[js.Any])
    
    inline def setModifierTags(
      value: (/* import warning: importer.ImportType#apply Failed type conversion: std.Array</ * template literal string: @${string} * / string>[any | undefined] */ js.Any) | (js.Array[/* template literal string: @${string} */ String]) | Any
    ): Self = StObject.set(x, "modifierTags", value.asInstanceOf[js.Any])
    
    inline def setModifierTagsVarargs(value: (/* template literal string: @${string} */ String)*): Self = StObject.set(x, "modifierTags", js.Array(value*))
    
    inline def setName(
      value: (/* import warning: importer.ImportType#apply Failed type conversion: string[any | undefined] */ js.Any) | String | Any
    ): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setOptions(
      value: (/* import warning: importer.ImportType#apply Failed type conversion: string[any | undefined] */ js.Any) | String | Any
    ): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOut(
      value: (/* import warning: importer.ImportType#apply Failed type conversion: string[any | undefined] */ js.Any) | String | Any
    ): Self = StObject.set(x, "out", value.asInstanceOf[js.Any])
    
    inline def setPlugin(
      value: (/* import warning: importer.ImportType#apply Failed type conversion: std.Array<string>[any | undefined] */ js.Any) | js.Array[String] | Any
    ): Self = StObject.set(x, "plugin", value.asInstanceOf[js.Any])
    
    inline def setPluginVarargs(value: String*): Self = StObject.set(x, "plugin", js.Array(value*))
    
    inline def setPreserveWatchOutput(
      value: (/* import warning: importer.ImportType#apply Failed type conversion: boolean[any | undefined] */ js.Any) | Boolean | Any
    ): Self = StObject.set(x, "preserveWatchOutput", value.asInstanceOf[js.Any])
    
    inline def setPretty(
      value: (/* import warning: importer.ImportType#apply Failed type conversion: boolean[any | undefined] */ js.Any) | Boolean | Any
    ): Self = StObject.set(x, "pretty", value.asInstanceOf[js.Any])
    
    inline def setReadme(
      value: (/* import warning: importer.ImportType#apply Failed type conversion: string[any | undefined] */ js.Any) | String | Any
    ): Self = StObject.set(x, "readme", value.asInstanceOf[js.Any])
    
    inline def setRequiredToBeDocumented(
      value: (/* import warning: importer.ImportType#apply Failed type conversion: std.Array<keyof typedoc.anon.TypeofReflectionKind>[any | undefined] */ js.Any) | (js.Array[
          /* keyof typedoc.anon.TypeofReflectionKind */ typings.typedoc.typedocStrings.All | ClassOrInterface | VariableOrProperty | FunctionOrMethod | ClassMember | SomeSignature | SomeModule | SomeType | SomeValue | SomeMember | SomeExport | ExportContainer | Inheritable | ContainsCallSignatures | SignatureContainer
        ]) | Any
    ): Self = StObject.set(x, "requiredToBeDocumented", value.asInstanceOf[js.Any])
    
    inline def setRequiredToBeDocumentedVarargs(
      value: (/* keyof typedoc.anon.TypeofReflectionKind */ typings.typedoc.typedocStrings.All | ClassOrInterface | VariableOrProperty | FunctionOrMethod | ClassMember | SomeSignature | SomeModule | SomeType | SomeValue | SomeMember | SomeExport | ExportContainer | Inheritable | ContainsCallSignatures | SignatureContainer)*
    ): Self = StObject.set(x, "requiredToBeDocumented", js.Array(value*))
    
    inline def setSearchCategoryBoosts(
      value: (/* import warning: importer.ImportType#apply Failed type conversion: typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<std.Record<string, number>>[any | undefined] */ js.Any) | (ManuallyValidatedOption[Record[String, Double]]) | Any
    ): Self = StObject.set(x, "searchCategoryBoosts", value.asInstanceOf[js.Any])
    
    inline def setSearchGroupBoosts(
      value: (/* import warning: importer.ImportType#apply Failed type conversion: typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<std.Record<string, number>>[any | undefined] */ js.Any) | (ManuallyValidatedOption[Record[String, Double]]) | Any
    ): Self = StObject.set(x, "searchGroupBoosts", value.asInstanceOf[js.Any])
    
    inline def setSearchInComments(
      value: (/* import warning: importer.ImportType#apply Failed type conversion: boolean[any | undefined] */ js.Any) | Boolean | Any
    ): Self = StObject.set(x, "searchInComments", value.asInstanceOf[js.Any])
    
    inline def setShowConfig(
      value: (/* import warning: importer.ImportType#apply Failed type conversion: boolean[any | undefined] */ js.Any) | Boolean | Any
    ): Self = StObject.set(x, "showConfig", value.asInstanceOf[js.Any])
    
    inline def setSkipErrorChecking(
      value: (/* import warning: importer.ImportType#apply Failed type conversion: boolean[any | undefined] */ js.Any) | Boolean | Any
    ): Self = StObject.set(x, "skipErrorChecking", value.asInstanceOf[js.Any])
    
    inline def setSort(
      value: (/* import warning: importer.ImportType#apply Failed type conversion: std.Array<typedoc.typedoc/dist/lib/utils/sort.SortStrategy>[any | undefined] */ js.Any) | js.Array[SortStrategy] | Any
    ): Self = StObject.set(x, "sort", value.asInstanceOf[js.Any])
    
    inline def setSortVarargs(value: SortStrategy*): Self = StObject.set(x, "sort", js.Array(value*))
    
    inline def setTheme(
      value: (/* import warning: importer.ImportType#apply Failed type conversion: string[any | undefined] */ js.Any) | String | Any
    ): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    inline def setTreatWarningsAsErrors(
      value: (/* import warning: importer.ImportType#apply Failed type conversion: boolean[any | undefined] */ js.Any) | Boolean | Any
    ): Self = StObject.set(x, "treatWarningsAsErrors", value.asInstanceOf[js.Any])
    
    inline def setTsconfig(
      value: (/* import warning: importer.ImportType#apply Failed type conversion: string[any | undefined] */ js.Any) | String | Any
    ): Self = StObject.set(x, "tsconfig", value.asInstanceOf[js.Any])
    
    inline def setValidation(
      value: (/* import warning: importer.ImportType#apply Failed type conversion: typedoc.typedoc/dist/lib/utils/options/declaration.ValidationOptions[any | undefined] */ js.Any) | ValidationOptions | Any
    ): Self = StObject.set(x, "validation", value.asInstanceOf[js.Any])
    
    inline def setVersion(
      value: (/* import warning: importer.ImportType#apply Failed type conversion: boolean[any | undefined] */ js.Any) | Boolean | Any
    ): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVisibilityFilters(
      value: (/* import warning: importer.ImportType#apply Failed type conversion: typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<typedoc.anon.Dicttag>[any | undefined] */ js.Any) | ManuallyValidatedOption[Dicttag] | Any
    ): Self = StObject.set(x, "visibilityFilters", value.asInstanceOf[js.Any])
    
    inline def setWatch(
      value: (/* import warning: importer.ImportType#apply Failed type conversion: boolean[any | undefined] */ js.Any) | Boolean | Any
    ): Self = StObject.set(x, "watch", value.asInstanceOf[js.Any])
  }
}
