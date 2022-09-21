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
import typings.typedoc.typedocStrings.`@$LeftcurlybracketstringRightcurlybracket`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeDocOptionMap extends StObject {
  
  var basePath: String
  
  var blockTags: js.Array[`@$LeftcurlybracketstringRightcurlybracket`]
  
  var categorizeByGroup: Boolean
  
  var categoryOrder: js.Array[String]
  
  var cleanOutputDir: Boolean
  
  var cname: String
  
  var commentStyle: All
  
  var compilerOptions: Any
  
  var customCss: String
  
  var darkHighlightTheme: Theme
  
  var defaultCategory: String
  
  var disableSources: Boolean
  
  var emit: Both
  
  var entryPointStrategy: Expand
  
  var entryPoints: js.Array[String]
  
  var exclude: js.Array[String]
  
  var excludeExternals: Boolean
  
  var excludeInternal: Boolean
  
  var excludeNotDocumented: Boolean
  
  var excludePrivate: Boolean
  
  var excludeProtected: Boolean
  
  var excludeTags: js.Array[`@$LeftcurlybracketstringRightcurlybracket`]
  
  var externalPattern: js.Array[String]
  
  var externalSymbolLinkMappings: ManuallyValidatedOption[Record[String, Record[String, String]]]
  
  var gaID: String
  
  var gitRemote: String
  
  var gitRevision: String
  
  var githubPages: Boolean
  
  var help: Boolean
  
  var hideGenerator: Boolean
  
  var htmlLang: String
  
  var includeVersion: Boolean
  
  var includes: String
  
  var inlineTags: js.Array[`@$LeftcurlybracketstringRightcurlybracket`]
  
  var intentionallyNotExported: js.Array[String]
  
  var json: String
  
  var lightHighlightTheme: Theme
  
  var logLevel: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof LogLevel */ Any
  
  var logger: Any
  
  var markedOptions: Any
  
  var media: String
  
  var modifierTags: js.Array[`@$LeftcurlybracketstringRightcurlybracket`]
  
  var name: String
  
  var options: String
  
  var out: String
  
  var plugin: js.Array[String]
  
  var preserveWatchOutput: Boolean
  
  var pretty: Boolean
  
  var readme: String
  
  var requiredToBeDocumented: js.Array[
    /* keyof typedoc.anon.TypeofReflectionKind */ typings.typedoc.typedocStrings.All | ClassOrInterface | VariableOrProperty | FunctionOrMethod | ClassMember | SomeSignature | SomeModule | SomeType | SomeValue | SomeMember | SomeExport | ExportContainer | Inheritable | ContainsCallSignatures | SignatureContainer
  ]
  
  var searchCategoryBoosts: ManuallyValidatedOption[Record[String, Double]]
  
  var searchGroupBoosts: ManuallyValidatedOption[Record[String, Double]]
  
  var searchInComments: Boolean
  
  var showConfig: Boolean
  
  var skipErrorChecking: Boolean
  
  var sort: js.Array[SortStrategy]
  
  var theme: String
  
  var treatWarningsAsErrors: Boolean
  
  var tsconfig: String
  
  var validation: ValidationOptions
  
  var version: Boolean
  
  var visibilityFilters: ManuallyValidatedOption[Dicttag]
  
  var watch: Boolean
}
object TypeDocOptionMap {
  
  inline def apply(
    basePath: String,
    blockTags: js.Array[`@$LeftcurlybracketstringRightcurlybracket`],
    categorizeByGroup: Boolean,
    categoryOrder: js.Array[String],
    cleanOutputDir: Boolean,
    cname: String,
    commentStyle: All,
    compilerOptions: Any,
    customCss: String,
    darkHighlightTheme: Theme,
    defaultCategory: String,
    disableSources: Boolean,
    emit: Both,
    entryPointStrategy: Expand,
    entryPoints: js.Array[String],
    exclude: js.Array[String],
    excludeExternals: Boolean,
    excludeInternal: Boolean,
    excludeNotDocumented: Boolean,
    excludePrivate: Boolean,
    excludeProtected: Boolean,
    excludeTags: js.Array[`@$LeftcurlybracketstringRightcurlybracket`],
    externalPattern: js.Array[String],
    externalSymbolLinkMappings: ManuallyValidatedOption[Record[String, Record[String, String]]],
    gaID: String,
    gitRemote: String,
    gitRevision: String,
    githubPages: Boolean,
    help: Boolean,
    hideGenerator: Boolean,
    htmlLang: String,
    includeVersion: Boolean,
    includes: String,
    inlineTags: js.Array[`@$LeftcurlybracketstringRightcurlybracket`],
    intentionallyNotExported: js.Array[String],
    json: String,
    lightHighlightTheme: Theme,
    logLevel: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof LogLevel */ Any,
    logger: Any,
    markedOptions: Any,
    media: String,
    modifierTags: js.Array[`@$LeftcurlybracketstringRightcurlybracket`],
    name: String,
    options: String,
    out: String,
    plugin: js.Array[String],
    preserveWatchOutput: Boolean,
    pretty: Boolean,
    readme: String,
    requiredToBeDocumented: js.Array[
      /* keyof typedoc.anon.TypeofReflectionKind */ typings.typedoc.typedocStrings.All | ClassOrInterface | VariableOrProperty | FunctionOrMethod | ClassMember | SomeSignature | SomeModule | SomeType | SomeValue | SomeMember | SomeExport | ExportContainer | Inheritable | ContainsCallSignatures | SignatureContainer
    ],
    searchCategoryBoosts: ManuallyValidatedOption[Record[String, Double]],
    searchGroupBoosts: ManuallyValidatedOption[Record[String, Double]],
    searchInComments: Boolean,
    showConfig: Boolean,
    skipErrorChecking: Boolean,
    sort: js.Array[SortStrategy],
    theme: String,
    treatWarningsAsErrors: Boolean,
    tsconfig: String,
    validation: ValidationOptions,
    version: Boolean,
    visibilityFilters: ManuallyValidatedOption[Dicttag],
    watch: Boolean
  ): TypeDocOptionMap = {
    val __obj = js.Dynamic.literal(basePath = basePath.asInstanceOf[js.Any], blockTags = blockTags.asInstanceOf[js.Any], categorizeByGroup = categorizeByGroup.asInstanceOf[js.Any], categoryOrder = categoryOrder.asInstanceOf[js.Any], cleanOutputDir = cleanOutputDir.asInstanceOf[js.Any], cname = cname.asInstanceOf[js.Any], commentStyle = commentStyle.asInstanceOf[js.Any], compilerOptions = compilerOptions.asInstanceOf[js.Any], customCss = customCss.asInstanceOf[js.Any], darkHighlightTheme = darkHighlightTheme.asInstanceOf[js.Any], defaultCategory = defaultCategory.asInstanceOf[js.Any], disableSources = disableSources.asInstanceOf[js.Any], emit = emit.asInstanceOf[js.Any], entryPointStrategy = entryPointStrategy.asInstanceOf[js.Any], entryPoints = entryPoints.asInstanceOf[js.Any], exclude = exclude.asInstanceOf[js.Any], excludeExternals = excludeExternals.asInstanceOf[js.Any], excludeInternal = excludeInternal.asInstanceOf[js.Any], excludeNotDocumented = excludeNotDocumented.asInstanceOf[js.Any], excludePrivate = excludePrivate.asInstanceOf[js.Any], excludeProtected = excludeProtected.asInstanceOf[js.Any], excludeTags = excludeTags.asInstanceOf[js.Any], externalPattern = externalPattern.asInstanceOf[js.Any], externalSymbolLinkMappings = externalSymbolLinkMappings.asInstanceOf[js.Any], gaID = gaID.asInstanceOf[js.Any], gitRemote = gitRemote.asInstanceOf[js.Any], gitRevision = gitRevision.asInstanceOf[js.Any], githubPages = githubPages.asInstanceOf[js.Any], help = help.asInstanceOf[js.Any], hideGenerator = hideGenerator.asInstanceOf[js.Any], htmlLang = htmlLang.asInstanceOf[js.Any], includeVersion = includeVersion.asInstanceOf[js.Any], includes = includes.asInstanceOf[js.Any], inlineTags = inlineTags.asInstanceOf[js.Any], intentionallyNotExported = intentionallyNotExported.asInstanceOf[js.Any], json = json.asInstanceOf[js.Any], lightHighlightTheme = lightHighlightTheme.asInstanceOf[js.Any], logLevel = logLevel.asInstanceOf[js.Any], logger = logger.asInstanceOf[js.Any], markedOptions = markedOptions.asInstanceOf[js.Any], media = media.asInstanceOf[js.Any], modifierTags = modifierTags.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], out = out.asInstanceOf[js.Any], plugin = plugin.asInstanceOf[js.Any], preserveWatchOutput = preserveWatchOutput.asInstanceOf[js.Any], pretty = pretty.asInstanceOf[js.Any], readme = readme.asInstanceOf[js.Any], requiredToBeDocumented = requiredToBeDocumented.asInstanceOf[js.Any], searchCategoryBoosts = searchCategoryBoosts.asInstanceOf[js.Any], searchGroupBoosts = searchGroupBoosts.asInstanceOf[js.Any], searchInComments = searchInComments.asInstanceOf[js.Any], showConfig = showConfig.asInstanceOf[js.Any], skipErrorChecking = skipErrorChecking.asInstanceOf[js.Any], sort = sort.asInstanceOf[js.Any], theme = theme.asInstanceOf[js.Any], treatWarningsAsErrors = treatWarningsAsErrors.asInstanceOf[js.Any], tsconfig = tsconfig.asInstanceOf[js.Any], validation = validation.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any], visibilityFilters = visibilityFilters.asInstanceOf[js.Any], watch = watch.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeDocOptionMap]
  }
  
  extension [Self <: TypeDocOptionMap](x: Self) {
    
    inline def setBasePath(value: String): Self = StObject.set(x, "basePath", value.asInstanceOf[js.Any])
    
    inline def setBlockTags(value: js.Array[`@$LeftcurlybracketstringRightcurlybracket`]): Self = StObject.set(x, "blockTags", value.asInstanceOf[js.Any])
    
    inline def setBlockTagsVarargs(value: `@$LeftcurlybracketstringRightcurlybracket`*): Self = StObject.set(x, "blockTags", js.Array(value*))
    
    inline def setCategorizeByGroup(value: Boolean): Self = StObject.set(x, "categorizeByGroup", value.asInstanceOf[js.Any])
    
    inline def setCategoryOrder(value: js.Array[String]): Self = StObject.set(x, "categoryOrder", value.asInstanceOf[js.Any])
    
    inline def setCategoryOrderVarargs(value: String*): Self = StObject.set(x, "categoryOrder", js.Array(value*))
    
    inline def setCleanOutputDir(value: Boolean): Self = StObject.set(x, "cleanOutputDir", value.asInstanceOf[js.Any])
    
    inline def setCname(value: String): Self = StObject.set(x, "cname", value.asInstanceOf[js.Any])
    
    inline def setCommentStyle(value: All): Self = StObject.set(x, "commentStyle", value.asInstanceOf[js.Any])
    
    inline def setCompilerOptions(value: Any): Self = StObject.set(x, "compilerOptions", value.asInstanceOf[js.Any])
    
    inline def setCustomCss(value: String): Self = StObject.set(x, "customCss", value.asInstanceOf[js.Any])
    
    inline def setDarkHighlightTheme(value: Theme): Self = StObject.set(x, "darkHighlightTheme", value.asInstanceOf[js.Any])
    
    inline def setDefaultCategory(value: String): Self = StObject.set(x, "defaultCategory", value.asInstanceOf[js.Any])
    
    inline def setDisableSources(value: Boolean): Self = StObject.set(x, "disableSources", value.asInstanceOf[js.Any])
    
    inline def setEmit(value: Both): Self = StObject.set(x, "emit", value.asInstanceOf[js.Any])
    
    inline def setEntryPointStrategy(value: Expand): Self = StObject.set(x, "entryPointStrategy", value.asInstanceOf[js.Any])
    
    inline def setEntryPoints(value: js.Array[String]): Self = StObject.set(x, "entryPoints", value.asInstanceOf[js.Any])
    
    inline def setEntryPointsVarargs(value: String*): Self = StObject.set(x, "entryPoints", js.Array(value*))
    
    inline def setExclude(value: js.Array[String]): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
    
    inline def setExcludeExternals(value: Boolean): Self = StObject.set(x, "excludeExternals", value.asInstanceOf[js.Any])
    
    inline def setExcludeInternal(value: Boolean): Self = StObject.set(x, "excludeInternal", value.asInstanceOf[js.Any])
    
    inline def setExcludeNotDocumented(value: Boolean): Self = StObject.set(x, "excludeNotDocumented", value.asInstanceOf[js.Any])
    
    inline def setExcludePrivate(value: Boolean): Self = StObject.set(x, "excludePrivate", value.asInstanceOf[js.Any])
    
    inline def setExcludeProtected(value: Boolean): Self = StObject.set(x, "excludeProtected", value.asInstanceOf[js.Any])
    
    inline def setExcludeTags(value: js.Array[`@$LeftcurlybracketstringRightcurlybracket`]): Self = StObject.set(x, "excludeTags", value.asInstanceOf[js.Any])
    
    inline def setExcludeTagsVarargs(value: `@$LeftcurlybracketstringRightcurlybracket`*): Self = StObject.set(x, "excludeTags", js.Array(value*))
    
    inline def setExcludeVarargs(value: String*): Self = StObject.set(x, "exclude", js.Array(value*))
    
    inline def setExternalPattern(value: js.Array[String]): Self = StObject.set(x, "externalPattern", value.asInstanceOf[js.Any])
    
    inline def setExternalPatternVarargs(value: String*): Self = StObject.set(x, "externalPattern", js.Array(value*))
    
    inline def setExternalSymbolLinkMappings(value: ManuallyValidatedOption[Record[String, Record[String, String]]]): Self = StObject.set(x, "externalSymbolLinkMappings", value.asInstanceOf[js.Any])
    
    inline def setGaID(value: String): Self = StObject.set(x, "gaID", value.asInstanceOf[js.Any])
    
    inline def setGitRemote(value: String): Self = StObject.set(x, "gitRemote", value.asInstanceOf[js.Any])
    
    inline def setGitRevision(value: String): Self = StObject.set(x, "gitRevision", value.asInstanceOf[js.Any])
    
    inline def setGithubPages(value: Boolean): Self = StObject.set(x, "githubPages", value.asInstanceOf[js.Any])
    
    inline def setHelp(value: Boolean): Self = StObject.set(x, "help", value.asInstanceOf[js.Any])
    
    inline def setHideGenerator(value: Boolean): Self = StObject.set(x, "hideGenerator", value.asInstanceOf[js.Any])
    
    inline def setHtmlLang(value: String): Self = StObject.set(x, "htmlLang", value.asInstanceOf[js.Any])
    
    inline def setIncludeVersion(value: Boolean): Self = StObject.set(x, "includeVersion", value.asInstanceOf[js.Any])
    
    inline def setIncludes(value: String): Self = StObject.set(x, "includes", value.asInstanceOf[js.Any])
    
    inline def setInlineTags(value: js.Array[`@$LeftcurlybracketstringRightcurlybracket`]): Self = StObject.set(x, "inlineTags", value.asInstanceOf[js.Any])
    
    inline def setInlineTagsVarargs(value: `@$LeftcurlybracketstringRightcurlybracket`*): Self = StObject.set(x, "inlineTags", js.Array(value*))
    
    inline def setIntentionallyNotExported(value: js.Array[String]): Self = StObject.set(x, "intentionallyNotExported", value.asInstanceOf[js.Any])
    
    inline def setIntentionallyNotExportedVarargs(value: String*): Self = StObject.set(x, "intentionallyNotExported", js.Array(value*))
    
    inline def setJson(value: String): Self = StObject.set(x, "json", value.asInstanceOf[js.Any])
    
    inline def setLightHighlightTheme(value: Theme): Self = StObject.set(x, "lightHighlightTheme", value.asInstanceOf[js.Any])
    
    inline def setLogLevel(value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof LogLevel */ Any): Self = StObject.set(x, "logLevel", value.asInstanceOf[js.Any])
    
    inline def setLogger(value: Any): Self = StObject.set(x, "logger", value.asInstanceOf[js.Any])
    
    inline def setMarkedOptions(value: Any): Self = StObject.set(x, "markedOptions", value.asInstanceOf[js.Any])
    
    inline def setMedia(value: String): Self = StObject.set(x, "media", value.asInstanceOf[js.Any])
    
    inline def setModifierTags(value: js.Array[`@$LeftcurlybracketstringRightcurlybracket`]): Self = StObject.set(x, "modifierTags", value.asInstanceOf[js.Any])
    
    inline def setModifierTagsVarargs(value: `@$LeftcurlybracketstringRightcurlybracket`*): Self = StObject.set(x, "modifierTags", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setOptions(value: String): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOut(value: String): Self = StObject.set(x, "out", value.asInstanceOf[js.Any])
    
    inline def setPlugin(value: js.Array[String]): Self = StObject.set(x, "plugin", value.asInstanceOf[js.Any])
    
    inline def setPluginVarargs(value: String*): Self = StObject.set(x, "plugin", js.Array(value*))
    
    inline def setPreserveWatchOutput(value: Boolean): Self = StObject.set(x, "preserveWatchOutput", value.asInstanceOf[js.Any])
    
    inline def setPretty(value: Boolean): Self = StObject.set(x, "pretty", value.asInstanceOf[js.Any])
    
    inline def setReadme(value: String): Self = StObject.set(x, "readme", value.asInstanceOf[js.Any])
    
    inline def setRequiredToBeDocumented(
      value: js.Array[
          /* keyof typedoc.anon.TypeofReflectionKind */ typings.typedoc.typedocStrings.All | ClassOrInterface | VariableOrProperty | FunctionOrMethod | ClassMember | SomeSignature | SomeModule | SomeType | SomeValue | SomeMember | SomeExport | ExportContainer | Inheritable | ContainsCallSignatures | SignatureContainer
        ]
    ): Self = StObject.set(x, "requiredToBeDocumented", value.asInstanceOf[js.Any])
    
    inline def setRequiredToBeDocumentedVarargs(
      value: (/* keyof typedoc.anon.TypeofReflectionKind */ typings.typedoc.typedocStrings.All | ClassOrInterface | VariableOrProperty | FunctionOrMethod | ClassMember | SomeSignature | SomeModule | SomeType | SomeValue | SomeMember | SomeExport | ExportContainer | Inheritable | ContainsCallSignatures | SignatureContainer)*
    ): Self = StObject.set(x, "requiredToBeDocumented", js.Array(value*))
    
    inline def setSearchCategoryBoosts(value: ManuallyValidatedOption[Record[String, Double]]): Self = StObject.set(x, "searchCategoryBoosts", value.asInstanceOf[js.Any])
    
    inline def setSearchGroupBoosts(value: ManuallyValidatedOption[Record[String, Double]]): Self = StObject.set(x, "searchGroupBoosts", value.asInstanceOf[js.Any])
    
    inline def setSearchInComments(value: Boolean): Self = StObject.set(x, "searchInComments", value.asInstanceOf[js.Any])
    
    inline def setShowConfig(value: Boolean): Self = StObject.set(x, "showConfig", value.asInstanceOf[js.Any])
    
    inline def setSkipErrorChecking(value: Boolean): Self = StObject.set(x, "skipErrorChecking", value.asInstanceOf[js.Any])
    
    inline def setSort(value: js.Array[SortStrategy]): Self = StObject.set(x, "sort", value.asInstanceOf[js.Any])
    
    inline def setSortVarargs(value: SortStrategy*): Self = StObject.set(x, "sort", js.Array(value*))
    
    inline def setTheme(value: String): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    inline def setTreatWarningsAsErrors(value: Boolean): Self = StObject.set(x, "treatWarningsAsErrors", value.asInstanceOf[js.Any])
    
    inline def setTsconfig(value: String): Self = StObject.set(x, "tsconfig", value.asInstanceOf[js.Any])
    
    inline def setValidation(value: ValidationOptions): Self = StObject.set(x, "validation", value.asInstanceOf[js.Any])
    
    inline def setVersion(value: Boolean): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVisibilityFilters(value: ManuallyValidatedOption[Dicttag]): Self = StObject.set(x, "visibilityFilters", value.asInstanceOf[js.Any])
    
    inline def setWatch(value: Boolean): Self = StObject.set(x, "watch", value.asInstanceOf[js.Any])
  }
}
