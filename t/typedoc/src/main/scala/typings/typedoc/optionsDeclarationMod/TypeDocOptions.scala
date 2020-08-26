package typings.typedoc.optionsDeclarationMod

import typings.std.Exclude
import typings.typedoc.anon.File
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {[ K in keyof typedoc.typedoc/dist/lib/utils/options/declaration.TypeDocOptionMap ]: typedoc.typedoc/dist/lib/utils/options/declaration.TypeDocOptionMap[K] extends std.Record<string, infer U>? std.Exclude<U, string> | keyof typedoc.typedoc/dist/lib/utils/options/declaration.TypeDocOptionMap[K] : typedoc.typedoc/dist/lib/utils/options/declaration.TypeDocOptionMap[K]} */
@js.native
trait TypeDocOptions extends js.Object {
  var categorizeByGroup: js.UndefOr[Boolean | (Exclude[_, String]) | js.Any] = js.native
  var categoryOrder: js.UndefOr[js.Array[String] | (Exclude[_, String]) | js.Any] = js.native
  var defaultCategory: js.UndefOr[String | (Exclude[_, String]) | js.Any] = js.native
  var disableOutputCheck: js.UndefOr[Boolean | (Exclude[_, String]) | js.Any] = js.native
  var disableSources: js.UndefOr[Boolean | (Exclude[_, String]) | js.Any] = js.native
  var entryPoint: js.UndefOr[String | (Exclude[_, String]) | js.Any] = js.native
  var exclude: js.UndefOr[js.Array[String] | (Exclude[_, String]) | js.Any] = js.native
  var excludeExternals: js.UndefOr[Boolean | (Exclude[_, String]) | js.Any] = js.native
  var excludeNotDocumented: js.UndefOr[Boolean | (Exclude[_, String]) | js.Any] = js.native
  var excludeNotExported: js.UndefOr[Boolean | (Exclude[_, String]) | js.Any] = js.native
  var excludePrivate: js.UndefOr[Boolean | (Exclude[_, String]) | js.Any] = js.native
  var excludeProtected: js.UndefOr[Boolean | (Exclude[_, String]) | js.Any] = js.native
  var excludeTags: js.UndefOr[js.Array[String] | (Exclude[_, String]) | js.Any] = js.native
  var externalPattern: js.UndefOr[js.Array[String] | (Exclude[_, String]) | js.Any] = js.native
  var gaID: js.UndefOr[String | (Exclude[_, String]) | js.Any] = js.native
  var gaSite: js.UndefOr[String | (Exclude[_, String]) | js.Any] = js.native
  var gitRemote: js.UndefOr[String | (Exclude[_, String]) | js.Any] = js.native
  var gitRevision: js.UndefOr[String | (Exclude[_, String]) | js.Any] = js.native
  var help: js.UndefOr[Boolean | (Exclude[_, String]) | js.Any] = js.native
  var hideGenerator: js.UndefOr[Boolean | (Exclude[_, String]) | js.Any] = js.native
  var ignoreCompilerErrors: js.UndefOr[Boolean | (Exclude[_, String]) | js.Any] = js.native
  var includeDeclarations: js.UndefOr[Boolean | (Exclude[_, String]) | js.Any] = js.native
  var includeVersion: js.UndefOr[Boolean | (Exclude[_, String]) | js.Any] = js.native
  var includes: js.UndefOr[String | (Exclude[_, String]) | js.Any] = js.native
  var inputFiles: js.UndefOr[js.Array[String] | (Exclude[_, String]) | js.Any] = js.native
  var json: js.UndefOr[String | (Exclude[_, String]) | js.Any] = js.native
  var listInvalidSymbolLinks: js.UndefOr[Boolean | (Exclude[_, String]) | js.Any] = js.native
  var logger: js.UndefOr[js.Any | (Exclude[_, String])] = js.native
  var media: js.UndefOr[String | (Exclude[_, String]) | js.Any] = js.native
  var mode: js.UndefOr[File | (Exclude[_, String]) | js.Any] = js.native
  var name: js.UndefOr[String | (Exclude[_, String]) | js.Any] = js.native
  var options: js.UndefOr[String | (Exclude[_, String]) | js.Any] = js.native
  var out: js.UndefOr[String | (Exclude[_, String]) | js.Any] = js.native
  var plugin: js.UndefOr[js.Array[String] | (Exclude[_, String]) | js.Any] = js.native
  var readme: js.UndefOr[String | (Exclude[_, String]) | js.Any] = js.native
  var theme: js.UndefOr[String | (Exclude[_, String]) | js.Any] = js.native
  var toc: js.UndefOr[js.Array[String] | (Exclude[_, String]) | js.Any] = js.native
  var tsconfig: js.UndefOr[String | (Exclude[_, String]) | js.Any] = js.native
  var version: js.UndefOr[Boolean | (Exclude[_, String]) | js.Any] = js.native
}

object TypeDocOptions {
  @scala.inline
  def apply(): TypeDocOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TypeDocOptions]
  }
  @scala.inline
  implicit class TypeDocOptionsOps[Self <: TypeDocOptions] (val x: Self) extends AnyVal {
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
    def setCategorizeByGroup(value: Boolean | (Exclude[_, String]) | js.Any): Self = this.set("categorizeByGroup", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCategorizeByGroup: Self = this.set("categorizeByGroup", js.undefined)
    @scala.inline
    def setCategoryOrderVarargs(value: String*): Self = this.set("categoryOrder", js.Array(value :_*))
    @scala.inline
    def setCategoryOrder(value: js.Array[String] | (Exclude[_, String]) | js.Any): Self = this.set("categoryOrder", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCategoryOrder: Self = this.set("categoryOrder", js.undefined)
    @scala.inline
    def setDefaultCategory(value: String | (Exclude[_, String]) | js.Any): Self = this.set("defaultCategory", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultCategory: Self = this.set("defaultCategory", js.undefined)
    @scala.inline
    def setDisableOutputCheck(value: Boolean | (Exclude[_, String]) | js.Any): Self = this.set("disableOutputCheck", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisableOutputCheck: Self = this.set("disableOutputCheck", js.undefined)
    @scala.inline
    def setDisableSources(value: Boolean | (Exclude[_, String]) | js.Any): Self = this.set("disableSources", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisableSources: Self = this.set("disableSources", js.undefined)
    @scala.inline
    def setEntryPoint(value: String | (Exclude[_, String]) | js.Any): Self = this.set("entryPoint", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEntryPoint: Self = this.set("entryPoint", js.undefined)
    @scala.inline
    def setExcludeVarargs(value: String*): Self = this.set("exclude", js.Array(value :_*))
    @scala.inline
    def setExclude(value: js.Array[String] | (Exclude[_, String]) | js.Any): Self = this.set("exclude", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExclude: Self = this.set("exclude", js.undefined)
    @scala.inline
    def setExcludeExternals(value: Boolean | (Exclude[_, String]) | js.Any): Self = this.set("excludeExternals", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExcludeExternals: Self = this.set("excludeExternals", js.undefined)
    @scala.inline
    def setExcludeNotDocumented(value: Boolean | (Exclude[_, String]) | js.Any): Self = this.set("excludeNotDocumented", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExcludeNotDocumented: Self = this.set("excludeNotDocumented", js.undefined)
    @scala.inline
    def setExcludeNotExported(value: Boolean | (Exclude[_, String]) | js.Any): Self = this.set("excludeNotExported", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExcludeNotExported: Self = this.set("excludeNotExported", js.undefined)
    @scala.inline
    def setExcludePrivate(value: Boolean | (Exclude[_, String]) | js.Any): Self = this.set("excludePrivate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExcludePrivate: Self = this.set("excludePrivate", js.undefined)
    @scala.inline
    def setExcludeProtected(value: Boolean | (Exclude[_, String]) | js.Any): Self = this.set("excludeProtected", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExcludeProtected: Self = this.set("excludeProtected", js.undefined)
    @scala.inline
    def setExcludeTagsVarargs(value: String*): Self = this.set("excludeTags", js.Array(value :_*))
    @scala.inline
    def setExcludeTags(value: js.Array[String] | (Exclude[_, String]) | js.Any): Self = this.set("excludeTags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExcludeTags: Self = this.set("excludeTags", js.undefined)
    @scala.inline
    def setExternalPatternVarargs(value: String*): Self = this.set("externalPattern", js.Array(value :_*))
    @scala.inline
    def setExternalPattern(value: js.Array[String] | (Exclude[_, String]) | js.Any): Self = this.set("externalPattern", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExternalPattern: Self = this.set("externalPattern", js.undefined)
    @scala.inline
    def setGaID(value: String | (Exclude[_, String]) | js.Any): Self = this.set("gaID", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGaID: Self = this.set("gaID", js.undefined)
    @scala.inline
    def setGaSite(value: String | (Exclude[_, String]) | js.Any): Self = this.set("gaSite", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGaSite: Self = this.set("gaSite", js.undefined)
    @scala.inline
    def setGitRemote(value: String | (Exclude[_, String]) | js.Any): Self = this.set("gitRemote", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGitRemote: Self = this.set("gitRemote", js.undefined)
    @scala.inline
    def setGitRevision(value: String | (Exclude[_, String]) | js.Any): Self = this.set("gitRevision", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGitRevision: Self = this.set("gitRevision", js.undefined)
    @scala.inline
    def setHelp(value: Boolean | (Exclude[_, String]) | js.Any): Self = this.set("help", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHelp: Self = this.set("help", js.undefined)
    @scala.inline
    def setHideGenerator(value: Boolean | (Exclude[_, String]) | js.Any): Self = this.set("hideGenerator", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHideGenerator: Self = this.set("hideGenerator", js.undefined)
    @scala.inline
    def setIgnoreCompilerErrors(value: Boolean | (Exclude[_, String]) | js.Any): Self = this.set("ignoreCompilerErrors", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIgnoreCompilerErrors: Self = this.set("ignoreCompilerErrors", js.undefined)
    @scala.inline
    def setIncludeDeclarations(value: Boolean | (Exclude[_, String]) | js.Any): Self = this.set("includeDeclarations", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIncludeDeclarations: Self = this.set("includeDeclarations", js.undefined)
    @scala.inline
    def setIncludeVersion(value: Boolean | (Exclude[_, String]) | js.Any): Self = this.set("includeVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIncludeVersion: Self = this.set("includeVersion", js.undefined)
    @scala.inline
    def setIncludes(value: String | (Exclude[_, String]) | js.Any): Self = this.set("includes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIncludes: Self = this.set("includes", js.undefined)
    @scala.inline
    def setInputFilesVarargs(value: String*): Self = this.set("inputFiles", js.Array(value :_*))
    @scala.inline
    def setInputFiles(value: js.Array[String] | (Exclude[_, String]) | js.Any): Self = this.set("inputFiles", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInputFiles: Self = this.set("inputFiles", js.undefined)
    @scala.inline
    def setJson(value: String | (Exclude[_, String]) | js.Any): Self = this.set("json", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteJson: Self = this.set("json", js.undefined)
    @scala.inline
    def setListInvalidSymbolLinks(value: Boolean | (Exclude[_, String]) | js.Any): Self = this.set("listInvalidSymbolLinks", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteListInvalidSymbolLinks: Self = this.set("listInvalidSymbolLinks", js.undefined)
    @scala.inline
    def setLogger(value: js.Any | (Exclude[_, String])): Self = this.set("logger", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLogger: Self = this.set("logger", js.undefined)
    @scala.inline
    def setMedia(value: String | (Exclude[_, String]) | js.Any): Self = this.set("media", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMedia: Self = this.set("media", js.undefined)
    @scala.inline
    def setMode(value: File | (Exclude[_, String]) | js.Any): Self = this.set("mode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMode: Self = this.set("mode", js.undefined)
    @scala.inline
    def setName(value: String | (Exclude[_, String]) | js.Any): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setOptions(value: String | (Exclude[_, String]) | js.Any): Self = this.set("options", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOptions: Self = this.set("options", js.undefined)
    @scala.inline
    def setOut(value: String | (Exclude[_, String]) | js.Any): Self = this.set("out", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOut: Self = this.set("out", js.undefined)
    @scala.inline
    def setPluginVarargs(value: String*): Self = this.set("plugin", js.Array(value :_*))
    @scala.inline
    def setPlugin(value: js.Array[String] | (Exclude[_, String]) | js.Any): Self = this.set("plugin", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlugin: Self = this.set("plugin", js.undefined)
    @scala.inline
    def setReadme(value: String | (Exclude[_, String]) | js.Any): Self = this.set("readme", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReadme: Self = this.set("readme", js.undefined)
    @scala.inline
    def setTheme(value: String | (Exclude[_, String]) | js.Any): Self = this.set("theme", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTheme: Self = this.set("theme", js.undefined)
    @scala.inline
    def setTocVarargs(value: String*): Self = this.set("toc", js.Array(value :_*))
    @scala.inline
    def setToc(value: js.Array[String] | (Exclude[_, String]) | js.Any): Self = this.set("toc", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteToc: Self = this.set("toc", js.undefined)
    @scala.inline
    def setTsconfig(value: String | (Exclude[_, String]) | js.Any): Self = this.set("tsconfig", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTsconfig: Self = this.set("tsconfig", js.undefined)
    @scala.inline
    def setVersion(value: Boolean | (Exclude[_, String]) | js.Any): Self = this.set("version", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
  }
  
}

