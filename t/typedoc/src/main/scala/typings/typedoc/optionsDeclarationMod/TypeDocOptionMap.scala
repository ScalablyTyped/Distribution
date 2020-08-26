package typings.typedoc.optionsDeclarationMod

import typings.typedoc.anon.File
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeDocOptionMap extends js.Object {
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
  implicit class TypeDocOptionMapOps[Self <: TypeDocOptionMap] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCategorizeByGroup(value: Boolean): Self = this.set("categorizeByGroup", value.asInstanceOf[js.Any])
    @scala.inline
    def setCategoryOrderVarargs(value: String*): Self = this.set("categoryOrder", js.Array(value :_*))
    @scala.inline
    def setCategoryOrder(value: js.Array[String]): Self = this.set("categoryOrder", value.asInstanceOf[js.Any])
    @scala.inline
    def setDefaultCategory(value: String): Self = this.set("defaultCategory", value.asInstanceOf[js.Any])
    @scala.inline
    def setDisableOutputCheck(value: Boolean): Self = this.set("disableOutputCheck", value.asInstanceOf[js.Any])
    @scala.inline
    def setDisableSources(value: Boolean): Self = this.set("disableSources", value.asInstanceOf[js.Any])
    @scala.inline
    def setEntryPoint(value: String): Self = this.set("entryPoint", value.asInstanceOf[js.Any])
    @scala.inline
    def setExcludeVarargs(value: String*): Self = this.set("exclude", js.Array(value :_*))
    @scala.inline
    def setExclude(value: js.Array[String]): Self = this.set("exclude", value.asInstanceOf[js.Any])
    @scala.inline
    def setExcludeExternals(value: Boolean): Self = this.set("excludeExternals", value.asInstanceOf[js.Any])
    @scala.inline
    def setExcludeNotDocumented(value: Boolean): Self = this.set("excludeNotDocumented", value.asInstanceOf[js.Any])
    @scala.inline
    def setExcludeNotExported(value: Boolean): Self = this.set("excludeNotExported", value.asInstanceOf[js.Any])
    @scala.inline
    def setExcludePrivate(value: Boolean): Self = this.set("excludePrivate", value.asInstanceOf[js.Any])
    @scala.inline
    def setExcludeProtected(value: Boolean): Self = this.set("excludeProtected", value.asInstanceOf[js.Any])
    @scala.inline
    def setExcludeTagsVarargs(value: String*): Self = this.set("excludeTags", js.Array(value :_*))
    @scala.inline
    def setExcludeTags(value: js.Array[String]): Self = this.set("excludeTags", value.asInstanceOf[js.Any])
    @scala.inline
    def setExternalPatternVarargs(value: String*): Self = this.set("externalPattern", js.Array(value :_*))
    @scala.inline
    def setExternalPattern(value: js.Array[String]): Self = this.set("externalPattern", value.asInstanceOf[js.Any])
    @scala.inline
    def setGaID(value: String): Self = this.set("gaID", value.asInstanceOf[js.Any])
    @scala.inline
    def setGaSite(value: String): Self = this.set("gaSite", value.asInstanceOf[js.Any])
    @scala.inline
    def setGitRemote(value: String): Self = this.set("gitRemote", value.asInstanceOf[js.Any])
    @scala.inline
    def setGitRevision(value: String): Self = this.set("gitRevision", value.asInstanceOf[js.Any])
    @scala.inline
    def setHelp(value: Boolean): Self = this.set("help", value.asInstanceOf[js.Any])
    @scala.inline
    def setHideGenerator(value: Boolean): Self = this.set("hideGenerator", value.asInstanceOf[js.Any])
    @scala.inline
    def setIgnoreCompilerErrors(value: Boolean): Self = this.set("ignoreCompilerErrors", value.asInstanceOf[js.Any])
    @scala.inline
    def setIncludeDeclarations(value: Boolean): Self = this.set("includeDeclarations", value.asInstanceOf[js.Any])
    @scala.inline
    def setIncludeVersion(value: Boolean): Self = this.set("includeVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def setIncludes(value: String): Self = this.set("includes", value.asInstanceOf[js.Any])
    @scala.inline
    def setInputFilesVarargs(value: String*): Self = this.set("inputFiles", js.Array(value :_*))
    @scala.inline
    def setInputFiles(value: js.Array[String]): Self = this.set("inputFiles", value.asInstanceOf[js.Any])
    @scala.inline
    def setJson(value: String): Self = this.set("json", value.asInstanceOf[js.Any])
    @scala.inline
    def setListInvalidSymbolLinks(value: Boolean): Self = this.set("listInvalidSymbolLinks", value.asInstanceOf[js.Any])
    @scala.inline
    def setLogger(value: js.Any): Self = this.set("logger", value.asInstanceOf[js.Any])
    @scala.inline
    def setMedia(value: String): Self = this.set("media", value.asInstanceOf[js.Any])
    @scala.inline
    def setMode(value: File): Self = this.set("mode", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setOptions(value: String): Self = this.set("options", value.asInstanceOf[js.Any])
    @scala.inline
    def setOut(value: String): Self = this.set("out", value.asInstanceOf[js.Any])
    @scala.inline
    def setPluginVarargs(value: String*): Self = this.set("plugin", js.Array(value :_*))
    @scala.inline
    def setPlugin(value: js.Array[String]): Self = this.set("plugin", value.asInstanceOf[js.Any])
    @scala.inline
    def setReadme(value: String): Self = this.set("readme", value.asInstanceOf[js.Any])
    @scala.inline
    def setTheme(value: String): Self = this.set("theme", value.asInstanceOf[js.Any])
    @scala.inline
    def setTocVarargs(value: String*): Self = this.set("toc", js.Array(value :_*))
    @scala.inline
    def setToc(value: js.Array[String]): Self = this.set("toc", value.asInstanceOf[js.Any])
    @scala.inline
    def setTsconfig(value: String): Self = this.set("tsconfig", value.asInstanceOf[js.Any])
    @scala.inline
    def setVersion(value: Boolean): Self = this.set("version", value.asInstanceOf[js.Any])
  }
  
}

