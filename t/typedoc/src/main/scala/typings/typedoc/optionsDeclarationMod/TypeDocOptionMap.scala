package typings.typedoc.optionsDeclarationMod

import typings.typedoc.anon.File
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeDocOptionMap extends StObject {
  
  var categorizeByGroup: Boolean
  
  var categoryOrder: js.Array[String]
  
  var defaultCategory: String
  
  var disableOutputCheck: Boolean
  
  var disableSources: Boolean
  
  var entryPoint: String
  
  var exclude: js.Array[String]
  
  var excludeExternals: Boolean
  
  var excludeNotDocumented: Boolean
  
  var excludeNotExported: Boolean
  
  var excludePrivate: Boolean
  
  var excludeProtected: Boolean
  
  var excludeTags: js.Array[String]
  
  var externalPattern: js.Array[String]
  
  var gaID: String
  
  var gaSite: String
  
  var gitRemote: String
  
  var gitRevision: String
  
  var help: Boolean
  
  var hideGenerator: Boolean
  
  var ignoreCompilerErrors: Boolean
  
  var includeDeclarations: Boolean
  
  var includeVersion: Boolean
  
  var includes: String
  
  var inputFiles: js.Array[String]
  
  var json: String
  
  var listInvalidSymbolLinks: Boolean
  
  var logger: js.Any
  
  var media: String
  
  var mode: File
  
  var name: String
  
  var options: String
  
  var out: String
  
  var plugin: js.Array[String]
  
  var readme: String
  
  var theme: String
  
  var toc: js.Array[String]
  
  var tsconfig: String
  
  var version: Boolean
}
object TypeDocOptionMap {
  
  inline def apply(
    categorizeByGroup: Boolean,
    categoryOrder: js.Array[String],
    defaultCategory: String,
    disableOutputCheck: Boolean,
    disableSources: Boolean,
    entryPoint: String,
    exclude: js.Array[String],
    excludeExternals: Boolean,
    excludeNotDocumented: Boolean,
    excludeNotExported: Boolean,
    excludePrivate: Boolean,
    excludeProtected: Boolean,
    excludeTags: js.Array[String],
    externalPattern: js.Array[String],
    gaID: String,
    gaSite: String,
    gitRemote: String,
    gitRevision: String,
    help: Boolean,
    hideGenerator: Boolean,
    ignoreCompilerErrors: Boolean,
    includeDeclarations: Boolean,
    includeVersion: Boolean,
    includes: String,
    inputFiles: js.Array[String],
    json: String,
    listInvalidSymbolLinks: Boolean,
    logger: js.Any,
    media: String,
    mode: File,
    name: String,
    options: String,
    out: String,
    plugin: js.Array[String],
    readme: String,
    theme: String,
    toc: js.Array[String],
    tsconfig: String,
    version: Boolean
  ): TypeDocOptionMap = {
    val __obj = js.Dynamic.literal(categorizeByGroup = categorizeByGroup.asInstanceOf[js.Any], categoryOrder = categoryOrder.asInstanceOf[js.Any], defaultCategory = defaultCategory.asInstanceOf[js.Any], disableOutputCheck = disableOutputCheck.asInstanceOf[js.Any], disableSources = disableSources.asInstanceOf[js.Any], entryPoint = entryPoint.asInstanceOf[js.Any], exclude = exclude.asInstanceOf[js.Any], excludeExternals = excludeExternals.asInstanceOf[js.Any], excludeNotDocumented = excludeNotDocumented.asInstanceOf[js.Any], excludeNotExported = excludeNotExported.asInstanceOf[js.Any], excludePrivate = excludePrivate.asInstanceOf[js.Any], excludeProtected = excludeProtected.asInstanceOf[js.Any], excludeTags = excludeTags.asInstanceOf[js.Any], externalPattern = externalPattern.asInstanceOf[js.Any], gaID = gaID.asInstanceOf[js.Any], gaSite = gaSite.asInstanceOf[js.Any], gitRemote = gitRemote.asInstanceOf[js.Any], gitRevision = gitRevision.asInstanceOf[js.Any], help = help.asInstanceOf[js.Any], hideGenerator = hideGenerator.asInstanceOf[js.Any], ignoreCompilerErrors = ignoreCompilerErrors.asInstanceOf[js.Any], includeDeclarations = includeDeclarations.asInstanceOf[js.Any], includeVersion = includeVersion.asInstanceOf[js.Any], includes = includes.asInstanceOf[js.Any], inputFiles = inputFiles.asInstanceOf[js.Any], json = json.asInstanceOf[js.Any], listInvalidSymbolLinks = listInvalidSymbolLinks.asInstanceOf[js.Any], logger = logger.asInstanceOf[js.Any], media = media.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], out = out.asInstanceOf[js.Any], plugin = plugin.asInstanceOf[js.Any], readme = readme.asInstanceOf[js.Any], theme = theme.asInstanceOf[js.Any], toc = toc.asInstanceOf[js.Any], tsconfig = tsconfig.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeDocOptionMap]
  }
  
  extension [Self <: TypeDocOptionMap](x: Self) {
    
    inline def setCategorizeByGroup(value: Boolean): Self = StObject.set(x, "categorizeByGroup", value.asInstanceOf[js.Any])
    
    inline def setCategoryOrder(value: js.Array[String]): Self = StObject.set(x, "categoryOrder", value.asInstanceOf[js.Any])
    
    inline def setCategoryOrderVarargs(value: String*): Self = StObject.set(x, "categoryOrder", js.Array(value :_*))
    
    inline def setDefaultCategory(value: String): Self = StObject.set(x, "defaultCategory", value.asInstanceOf[js.Any])
    
    inline def setDisableOutputCheck(value: Boolean): Self = StObject.set(x, "disableOutputCheck", value.asInstanceOf[js.Any])
    
    inline def setDisableSources(value: Boolean): Self = StObject.set(x, "disableSources", value.asInstanceOf[js.Any])
    
    inline def setEntryPoint(value: String): Self = StObject.set(x, "entryPoint", value.asInstanceOf[js.Any])
    
    inline def setExclude(value: js.Array[String]): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
    
    inline def setExcludeExternals(value: Boolean): Self = StObject.set(x, "excludeExternals", value.asInstanceOf[js.Any])
    
    inline def setExcludeNotDocumented(value: Boolean): Self = StObject.set(x, "excludeNotDocumented", value.asInstanceOf[js.Any])
    
    inline def setExcludeNotExported(value: Boolean): Self = StObject.set(x, "excludeNotExported", value.asInstanceOf[js.Any])
    
    inline def setExcludePrivate(value: Boolean): Self = StObject.set(x, "excludePrivate", value.asInstanceOf[js.Any])
    
    inline def setExcludeProtected(value: Boolean): Self = StObject.set(x, "excludeProtected", value.asInstanceOf[js.Any])
    
    inline def setExcludeTags(value: js.Array[String]): Self = StObject.set(x, "excludeTags", value.asInstanceOf[js.Any])
    
    inline def setExcludeTagsVarargs(value: String*): Self = StObject.set(x, "excludeTags", js.Array(value :_*))
    
    inline def setExcludeVarargs(value: String*): Self = StObject.set(x, "exclude", js.Array(value :_*))
    
    inline def setExternalPattern(value: js.Array[String]): Self = StObject.set(x, "externalPattern", value.asInstanceOf[js.Any])
    
    inline def setExternalPatternVarargs(value: String*): Self = StObject.set(x, "externalPattern", js.Array(value :_*))
    
    inline def setGaID(value: String): Self = StObject.set(x, "gaID", value.asInstanceOf[js.Any])
    
    inline def setGaSite(value: String): Self = StObject.set(x, "gaSite", value.asInstanceOf[js.Any])
    
    inline def setGitRemote(value: String): Self = StObject.set(x, "gitRemote", value.asInstanceOf[js.Any])
    
    inline def setGitRevision(value: String): Self = StObject.set(x, "gitRevision", value.asInstanceOf[js.Any])
    
    inline def setHelp(value: Boolean): Self = StObject.set(x, "help", value.asInstanceOf[js.Any])
    
    inline def setHideGenerator(value: Boolean): Self = StObject.set(x, "hideGenerator", value.asInstanceOf[js.Any])
    
    inline def setIgnoreCompilerErrors(value: Boolean): Self = StObject.set(x, "ignoreCompilerErrors", value.asInstanceOf[js.Any])
    
    inline def setIncludeDeclarations(value: Boolean): Self = StObject.set(x, "includeDeclarations", value.asInstanceOf[js.Any])
    
    inline def setIncludeVersion(value: Boolean): Self = StObject.set(x, "includeVersion", value.asInstanceOf[js.Any])
    
    inline def setIncludes(value: String): Self = StObject.set(x, "includes", value.asInstanceOf[js.Any])
    
    inline def setInputFiles(value: js.Array[String]): Self = StObject.set(x, "inputFiles", value.asInstanceOf[js.Any])
    
    inline def setInputFilesVarargs(value: String*): Self = StObject.set(x, "inputFiles", js.Array(value :_*))
    
    inline def setJson(value: String): Self = StObject.set(x, "json", value.asInstanceOf[js.Any])
    
    inline def setListInvalidSymbolLinks(value: Boolean): Self = StObject.set(x, "listInvalidSymbolLinks", value.asInstanceOf[js.Any])
    
    inline def setLogger(value: js.Any): Self = StObject.set(x, "logger", value.asInstanceOf[js.Any])
    
    inline def setMedia(value: String): Self = StObject.set(x, "media", value.asInstanceOf[js.Any])
    
    inline def setMode(value: File): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setOptions(value: String): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOut(value: String): Self = StObject.set(x, "out", value.asInstanceOf[js.Any])
    
    inline def setPlugin(value: js.Array[String]): Self = StObject.set(x, "plugin", value.asInstanceOf[js.Any])
    
    inline def setPluginVarargs(value: String*): Self = StObject.set(x, "plugin", js.Array(value :_*))
    
    inline def setReadme(value: String): Self = StObject.set(x, "readme", value.asInstanceOf[js.Any])
    
    inline def setTheme(value: String): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    inline def setToc(value: js.Array[String]): Self = StObject.set(x, "toc", value.asInstanceOf[js.Any])
    
    inline def setTocVarargs(value: String*): Self = StObject.set(x, "toc", js.Array(value :_*))
    
    inline def setTsconfig(value: String): Self = StObject.set(x, "tsconfig", value.asInstanceOf[js.Any])
    
    inline def setVersion(value: Boolean): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
