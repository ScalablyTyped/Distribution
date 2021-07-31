package typings.typedoc.anon

import typings.std.Exclude
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<typedoc.typedoc/dist/lib/utils/options/declaration.TypeDocOptions> */
trait PartialTypeDocOptions extends StObject {
  
  var categorizeByGroup: js.UndefOr[Boolean | (Exclude[js.Any, String]) | js.Any] = js.undefined
  
  var categoryOrder: js.UndefOr[js.Array[String] | (Exclude[js.Any, String]) | js.Any] = js.undefined
  
  var defaultCategory: js.UndefOr[String | (Exclude[js.Any, String]) | js.Any] = js.undefined
  
  var disableOutputCheck: js.UndefOr[Boolean | (Exclude[js.Any, String]) | js.Any] = js.undefined
  
  var disableSources: js.UndefOr[Boolean | (Exclude[js.Any, String]) | js.Any] = js.undefined
  
  var entryPoint: js.UndefOr[String | (Exclude[js.Any, String]) | js.Any] = js.undefined
  
  var exclude: js.UndefOr[js.Array[String] | (Exclude[js.Any, String]) | js.Any] = js.undefined
  
  var excludeExternals: js.UndefOr[Boolean | (Exclude[js.Any, String]) | js.Any] = js.undefined
  
  var excludeNotDocumented: js.UndefOr[Boolean | (Exclude[js.Any, String]) | js.Any] = js.undefined
  
  var excludeNotExported: js.UndefOr[Boolean | (Exclude[js.Any, String]) | js.Any] = js.undefined
  
  var excludePrivate: js.UndefOr[Boolean | (Exclude[js.Any, String]) | js.Any] = js.undefined
  
  var excludeProtected: js.UndefOr[Boolean | (Exclude[js.Any, String]) | js.Any] = js.undefined
  
  var excludeTags: js.UndefOr[js.Array[String] | (Exclude[js.Any, String]) | js.Any] = js.undefined
  
  var externalPattern: js.UndefOr[js.Array[String] | (Exclude[js.Any, String]) | js.Any] = js.undefined
  
  var gaID: js.UndefOr[String | (Exclude[js.Any, String]) | js.Any] = js.undefined
  
  var gaSite: js.UndefOr[String | (Exclude[js.Any, String]) | js.Any] = js.undefined
  
  var gitRemote: js.UndefOr[String | (Exclude[js.Any, String]) | js.Any] = js.undefined
  
  var gitRevision: js.UndefOr[String | (Exclude[js.Any, String]) | js.Any] = js.undefined
  
  var help: js.UndefOr[Boolean | (Exclude[js.Any, String]) | js.Any] = js.undefined
  
  var hideGenerator: js.UndefOr[Boolean | (Exclude[js.Any, String]) | js.Any] = js.undefined
  
  var ignoreCompilerErrors: js.UndefOr[Boolean | (Exclude[js.Any, String]) | js.Any] = js.undefined
  
  var includeDeclarations: js.UndefOr[Boolean | (Exclude[js.Any, String]) | js.Any] = js.undefined
  
  var includeVersion: js.UndefOr[Boolean | (Exclude[js.Any, String]) | js.Any] = js.undefined
  
  var includes: js.UndefOr[String | (Exclude[js.Any, String]) | js.Any] = js.undefined
  
  var inputFiles: js.UndefOr[js.Array[String] | (Exclude[js.Any, String]) | js.Any] = js.undefined
  
  var json: js.UndefOr[String | (Exclude[js.Any, String]) | js.Any] = js.undefined
  
  var listInvalidSymbolLinks: js.UndefOr[Boolean | (Exclude[js.Any, String]) | js.Any] = js.undefined
  
  var logger: js.UndefOr[js.Any | (Exclude[js.Any, String])] = js.undefined
  
  var media: js.UndefOr[String | (Exclude[js.Any, String]) | js.Any] = js.undefined
  
  var mode: js.UndefOr[File | (Exclude[js.Any, String]) | js.Any] = js.undefined
  
  var name: js.UndefOr[String | (Exclude[js.Any, String]) | js.Any] = js.undefined
  
  var options: js.UndefOr[String | (Exclude[js.Any, String]) | js.Any] = js.undefined
  
  var out: js.UndefOr[String | (Exclude[js.Any, String]) | js.Any] = js.undefined
  
  var plugin: js.UndefOr[js.Array[String] | (Exclude[js.Any, String]) | js.Any] = js.undefined
  
  var readme: js.UndefOr[String | (Exclude[js.Any, String]) | js.Any] = js.undefined
  
  var theme: js.UndefOr[String | (Exclude[js.Any, String]) | js.Any] = js.undefined
  
  var toc: js.UndefOr[js.Array[String] | (Exclude[js.Any, String]) | js.Any] = js.undefined
  
  var tsconfig: js.UndefOr[String | (Exclude[js.Any, String]) | js.Any] = js.undefined
  
  var version: js.UndefOr[Boolean | (Exclude[js.Any, String]) | js.Any] = js.undefined
}
object PartialTypeDocOptions {
  
  @scala.inline
  def apply(): PartialTypeDocOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialTypeDocOptions]
  }
  
  @scala.inline
  implicit class PartialTypeDocOptionsMutableBuilder[Self <: PartialTypeDocOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCategorizeByGroup(value: Boolean | (Exclude[js.Any, String]) | js.Any): Self = StObject.set(x, "categorizeByGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCategorizeByGroupUndefined: Self = StObject.set(x, "categorizeByGroup", js.undefined)
    
    @scala.inline
    def setCategoryOrder(value: js.Array[String] | (Exclude[js.Any, String]) | js.Any): Self = StObject.set(x, "categoryOrder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCategoryOrderUndefined: Self = StObject.set(x, "categoryOrder", js.undefined)
    
    @scala.inline
    def setCategoryOrderVarargs(value: String*): Self = StObject.set(x, "categoryOrder", js.Array(value :_*))
    
    @scala.inline
    def setDefaultCategory(value: String | (Exclude[js.Any, String]) | js.Any): Self = StObject.set(x, "defaultCategory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultCategoryUndefined: Self = StObject.set(x, "defaultCategory", js.undefined)
    
    @scala.inline
    def setDisableOutputCheck(value: Boolean | (Exclude[js.Any, String]) | js.Any): Self = StObject.set(x, "disableOutputCheck", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableOutputCheckUndefined: Self = StObject.set(x, "disableOutputCheck", js.undefined)
    
    @scala.inline
    def setDisableSources(value: Boolean | (Exclude[js.Any, String]) | js.Any): Self = StObject.set(x, "disableSources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableSourcesUndefined: Self = StObject.set(x, "disableSources", js.undefined)
    
    @scala.inline
    def setEntryPoint(value: String | (Exclude[js.Any, String]) | js.Any): Self = StObject.set(x, "entryPoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntryPointUndefined: Self = StObject.set(x, "entryPoint", js.undefined)
    
    @scala.inline
    def setExclude(value: js.Array[String] | (Exclude[js.Any, String]) | js.Any): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExcludeExternals(value: Boolean | (Exclude[js.Any, String]) | js.Any): Self = StObject.set(x, "excludeExternals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExcludeExternalsUndefined: Self = StObject.set(x, "excludeExternals", js.undefined)
    
    @scala.inline
    def setExcludeNotDocumented(value: Boolean | (Exclude[js.Any, String]) | js.Any): Self = StObject.set(x, "excludeNotDocumented", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExcludeNotDocumentedUndefined: Self = StObject.set(x, "excludeNotDocumented", js.undefined)
    
    @scala.inline
    def setExcludeNotExported(value: Boolean | (Exclude[js.Any, String]) | js.Any): Self = StObject.set(x, "excludeNotExported", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExcludeNotExportedUndefined: Self = StObject.set(x, "excludeNotExported", js.undefined)
    
    @scala.inline
    def setExcludePrivate(value: Boolean | (Exclude[js.Any, String]) | js.Any): Self = StObject.set(x, "excludePrivate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExcludePrivateUndefined: Self = StObject.set(x, "excludePrivate", js.undefined)
    
    @scala.inline
    def setExcludeProtected(value: Boolean | (Exclude[js.Any, String]) | js.Any): Self = StObject.set(x, "excludeProtected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExcludeProtectedUndefined: Self = StObject.set(x, "excludeProtected", js.undefined)
    
    @scala.inline
    def setExcludeTags(value: js.Array[String] | (Exclude[js.Any, String]) | js.Any): Self = StObject.set(x, "excludeTags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExcludeTagsUndefined: Self = StObject.set(x, "excludeTags", js.undefined)
    
    @scala.inline
    def setExcludeTagsVarargs(value: String*): Self = StObject.set(x, "excludeTags", js.Array(value :_*))
    
    @scala.inline
    def setExcludeUndefined: Self = StObject.set(x, "exclude", js.undefined)
    
    @scala.inline
    def setExcludeVarargs(value: String*): Self = StObject.set(x, "exclude", js.Array(value :_*))
    
    @scala.inline
    def setExternalPattern(value: js.Array[String] | (Exclude[js.Any, String]) | js.Any): Self = StObject.set(x, "externalPattern", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExternalPatternUndefined: Self = StObject.set(x, "externalPattern", js.undefined)
    
    @scala.inline
    def setExternalPatternVarargs(value: String*): Self = StObject.set(x, "externalPattern", js.Array(value :_*))
    
    @scala.inline
    def setGaID(value: String | (Exclude[js.Any, String]) | js.Any): Self = StObject.set(x, "gaID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGaIDUndefined: Self = StObject.set(x, "gaID", js.undefined)
    
    @scala.inline
    def setGaSite(value: String | (Exclude[js.Any, String]) | js.Any): Self = StObject.set(x, "gaSite", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGaSiteUndefined: Self = StObject.set(x, "gaSite", js.undefined)
    
    @scala.inline
    def setGitRemote(value: String | (Exclude[js.Any, String]) | js.Any): Self = StObject.set(x, "gitRemote", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGitRemoteUndefined: Self = StObject.set(x, "gitRemote", js.undefined)
    
    @scala.inline
    def setGitRevision(value: String | (Exclude[js.Any, String]) | js.Any): Self = StObject.set(x, "gitRevision", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGitRevisionUndefined: Self = StObject.set(x, "gitRevision", js.undefined)
    
    @scala.inline
    def setHelp(value: Boolean | (Exclude[js.Any, String]) | js.Any): Self = StObject.set(x, "help", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHelpUndefined: Self = StObject.set(x, "help", js.undefined)
    
    @scala.inline
    def setHideGenerator(value: Boolean | (Exclude[js.Any, String]) | js.Any): Self = StObject.set(x, "hideGenerator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHideGeneratorUndefined: Self = StObject.set(x, "hideGenerator", js.undefined)
    
    @scala.inline
    def setIgnoreCompilerErrors(value: Boolean | (Exclude[js.Any, String]) | js.Any): Self = StObject.set(x, "ignoreCompilerErrors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIgnoreCompilerErrorsUndefined: Self = StObject.set(x, "ignoreCompilerErrors", js.undefined)
    
    @scala.inline
    def setIncludeDeclarations(value: Boolean | (Exclude[js.Any, String]) | js.Any): Self = StObject.set(x, "includeDeclarations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeDeclarationsUndefined: Self = StObject.set(x, "includeDeclarations", js.undefined)
    
    @scala.inline
    def setIncludeVersion(value: Boolean | (Exclude[js.Any, String]) | js.Any): Self = StObject.set(x, "includeVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeVersionUndefined: Self = StObject.set(x, "includeVersion", js.undefined)
    
    @scala.inline
    def setIncludes(value: String | (Exclude[js.Any, String]) | js.Any): Self = StObject.set(x, "includes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludesUndefined: Self = StObject.set(x, "includes", js.undefined)
    
    @scala.inline
    def setInputFiles(value: js.Array[String] | (Exclude[js.Any, String]) | js.Any): Self = StObject.set(x, "inputFiles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputFilesUndefined: Self = StObject.set(x, "inputFiles", js.undefined)
    
    @scala.inline
    def setInputFilesVarargs(value: String*): Self = StObject.set(x, "inputFiles", js.Array(value :_*))
    
    @scala.inline
    def setJson(value: String | (Exclude[js.Any, String]) | js.Any): Self = StObject.set(x, "json", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJsonUndefined: Self = StObject.set(x, "json", js.undefined)
    
    @scala.inline
    def setListInvalidSymbolLinks(value: Boolean | (Exclude[js.Any, String]) | js.Any): Self = StObject.set(x, "listInvalidSymbolLinks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListInvalidSymbolLinksUndefined: Self = StObject.set(x, "listInvalidSymbolLinks", js.undefined)
    
    @scala.inline
    def setLogger(value: js.Any | (Exclude[js.Any, String])): Self = StObject.set(x, "logger", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoggerUndefined: Self = StObject.set(x, "logger", js.undefined)
    
    @scala.inline
    def setMedia(value: String | (Exclude[js.Any, String]) | js.Any): Self = StObject.set(x, "media", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMediaUndefined: Self = StObject.set(x, "media", js.undefined)
    
    @scala.inline
    def setMode(value: File | (Exclude[js.Any, String]) | js.Any): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    @scala.inline
    def setName(value: String | (Exclude[js.Any, String]) | js.Any): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setOptions(value: String | (Exclude[js.Any, String]) | js.Any): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    @scala.inline
    def setOut(value: String | (Exclude[js.Any, String]) | js.Any): Self = StObject.set(x, "out", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutUndefined: Self = StObject.set(x, "out", js.undefined)
    
    @scala.inline
    def setPlugin(value: js.Array[String] | (Exclude[js.Any, String]) | js.Any): Self = StObject.set(x, "plugin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPluginUndefined: Self = StObject.set(x, "plugin", js.undefined)
    
    @scala.inline
    def setPluginVarargs(value: String*): Self = StObject.set(x, "plugin", js.Array(value :_*))
    
    @scala.inline
    def setReadme(value: String | (Exclude[js.Any, String]) | js.Any): Self = StObject.set(x, "readme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadmeUndefined: Self = StObject.set(x, "readme", js.undefined)
    
    @scala.inline
    def setTheme(value: String | (Exclude[js.Any, String]) | js.Any): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    
    @scala.inline
    def setToc(value: js.Array[String] | (Exclude[js.Any, String]) | js.Any): Self = StObject.set(x, "toc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTocUndefined: Self = StObject.set(x, "toc", js.undefined)
    
    @scala.inline
    def setTocVarargs(value: String*): Self = StObject.set(x, "toc", js.Array(value :_*))
    
    @scala.inline
    def setTsconfig(value: String | (Exclude[js.Any, String]) | js.Any): Self = StObject.set(x, "tsconfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTsconfigUndefined: Self = StObject.set(x, "tsconfig", js.undefined)
    
    @scala.inline
    def setVersion(value: Boolean | (Exclude[js.Any, String]) | js.Any): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
