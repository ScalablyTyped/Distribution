package typings.typedoc.optionsDeclarationMod

import typings.typedoc.anon.File
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeDocOptionMap extends StObject {
  
  var categorizeByGroup: Boolean = js.native
  
  var categoryOrder: js.Array[String] = js.native
  
  var defaultCategory: String = js.native
  
  var disableOutputCheck: Boolean = js.native
  
  var disableSources: Boolean = js.native
  
  var entryPoint: String = js.native
  
  var exclude: js.Array[String] = js.native
  
  var excludeExternals: Boolean = js.native
  
  var excludeNotDocumented: Boolean = js.native
  
  var excludeNotExported: Boolean = js.native
  
  var excludePrivate: Boolean = js.native
  
  var excludeProtected: Boolean = js.native
  
  var excludeTags: js.Array[String] = js.native
  
  var externalPattern: js.Array[String] = js.native
  
  var gaID: String = js.native
  
  var gaSite: String = js.native
  
  var gitRemote: String = js.native
  
  var gitRevision: String = js.native
  
  var help: Boolean = js.native
  
  var hideGenerator: Boolean = js.native
  
  var ignoreCompilerErrors: Boolean = js.native
  
  var includeDeclarations: Boolean = js.native
  
  var includeVersion: Boolean = js.native
  
  var includes: String = js.native
  
  var inputFiles: js.Array[String] = js.native
  
  var json: String = js.native
  
  var listInvalidSymbolLinks: Boolean = js.native
  
  var logger: js.Any = js.native
  
  var media: String = js.native
  
  var mode: File = js.native
  
  var name: String = js.native
  
  var options: String = js.native
  
  var out: String = js.native
  
  var plugin: js.Array[String] = js.native
  
  var readme: String = js.native
  
  var theme: String = js.native
  
  var toc: js.Array[String] = js.native
  
  var tsconfig: String = js.native
  
  var version: Boolean = js.native
}
object TypeDocOptionMap {
  
  @scala.inline
  def apply(
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
  
  @scala.inline
  implicit class TypeDocOptionMapMutableBuilder[Self <: TypeDocOptionMap] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCategorizeByGroup(value: Boolean): Self = StObject.set(x, "categorizeByGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCategoryOrder(value: js.Array[String]): Self = StObject.set(x, "categoryOrder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCategoryOrderVarargs(value: String*): Self = StObject.set(x, "categoryOrder", js.Array(value :_*))
    
    @scala.inline
    def setDefaultCategory(value: String): Self = StObject.set(x, "defaultCategory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableOutputCheck(value: Boolean): Self = StObject.set(x, "disableOutputCheck", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableSources(value: Boolean): Self = StObject.set(x, "disableSources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntryPoint(value: String): Self = StObject.set(x, "entryPoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExclude(value: js.Array[String]): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExcludeExternals(value: Boolean): Self = StObject.set(x, "excludeExternals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExcludeNotDocumented(value: Boolean): Self = StObject.set(x, "excludeNotDocumented", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExcludeNotExported(value: Boolean): Self = StObject.set(x, "excludeNotExported", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExcludePrivate(value: Boolean): Self = StObject.set(x, "excludePrivate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExcludeProtected(value: Boolean): Self = StObject.set(x, "excludeProtected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExcludeTags(value: js.Array[String]): Self = StObject.set(x, "excludeTags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExcludeTagsVarargs(value: String*): Self = StObject.set(x, "excludeTags", js.Array(value :_*))
    
    @scala.inline
    def setExcludeVarargs(value: String*): Self = StObject.set(x, "exclude", js.Array(value :_*))
    
    @scala.inline
    def setExternalPattern(value: js.Array[String]): Self = StObject.set(x, "externalPattern", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExternalPatternVarargs(value: String*): Self = StObject.set(x, "externalPattern", js.Array(value :_*))
    
    @scala.inline
    def setGaID(value: String): Self = StObject.set(x, "gaID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGaSite(value: String): Self = StObject.set(x, "gaSite", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGitRemote(value: String): Self = StObject.set(x, "gitRemote", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGitRevision(value: String): Self = StObject.set(x, "gitRevision", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHelp(value: Boolean): Self = StObject.set(x, "help", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHideGenerator(value: Boolean): Self = StObject.set(x, "hideGenerator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIgnoreCompilerErrors(value: Boolean): Self = StObject.set(x, "ignoreCompilerErrors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeDeclarations(value: Boolean): Self = StObject.set(x, "includeDeclarations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeVersion(value: Boolean): Self = StObject.set(x, "includeVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludes(value: String): Self = StObject.set(x, "includes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputFiles(value: js.Array[String]): Self = StObject.set(x, "inputFiles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputFilesVarargs(value: String*): Self = StObject.set(x, "inputFiles", js.Array(value :_*))
    
    @scala.inline
    def setJson(value: String): Self = StObject.set(x, "json", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListInvalidSymbolLinks(value: Boolean): Self = StObject.set(x, "listInvalidSymbolLinks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogger(value: js.Any): Self = StObject.set(x, "logger", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMedia(value: String): Self = StObject.set(x, "media", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMode(value: File): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptions(value: String): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOut(value: String): Self = StObject.set(x, "out", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlugin(value: js.Array[String]): Self = StObject.set(x, "plugin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPluginVarargs(value: String*): Self = StObject.set(x, "plugin", js.Array(value :_*))
    
    @scala.inline
    def setReadme(value: String): Self = StObject.set(x, "readme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTheme(value: String): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToc(value: js.Array[String]): Self = StObject.set(x, "toc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTocVarargs(value: String*): Self = StObject.set(x, "toc", js.Array(value :_*))
    
    @scala.inline
    def setTsconfig(value: String): Self = StObject.set(x, "tsconfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersion(value: Boolean): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
