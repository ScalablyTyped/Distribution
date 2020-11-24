package typings.webpack.sourceMapDevToolPluginMod

import typings.webpack.anon.Include
import typings.webpack.webpackBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SourceMapDevToolPluginOptions extends js.Object {
  
  /**
  	 * Appends the given value to the original asset. Usually the #sourceMappingURL comment. [url] is replaced with a URL to the source map file. false disables the appending
  	 */
  var append: js.UndefOr[`false` | Null | String] = js.native
  
  /**
  	 * Indicates whether column mappings should be used (defaults to true)
  	 */
  var columns: js.UndefOr[Boolean] = js.native
  
  /**
  	 * Exclude modules that match the given value from source map generation
  	 */
  var exclude: js.UndefOr[Rules] = js.native
  
  /**
  	 * Generator string or function to create identifiers of modules for the 'sources' array in the SourceMap used only if 'moduleFilenameTemplate' would result in a conflict
  	 */
  var fallbackModuleFilenameTemplate: js.UndefOr[js.Function | String] = js.native
  
  /**
  	 * Path prefix to which the [file] placeholder is relative to
  	 */
  var fileContext: js.UndefOr[String] = js.native
  
  /**
  	 * Defines the output filename of the SourceMap (will be inlined if no value is provided)
  	 */
  var filename: js.UndefOr[`false` | Null | String] = js.native
  
  /**
  	 * Include source maps for module paths that match the given value
  	 */
  var include: js.UndefOr[Rules] = js.native
  
  /**
  	 * (deprecated) try to map original files line to line to generated files
  	 */
  var lineToLine: js.UndefOr[Boolean | Include] = js.native
  
  /**
  	 * Indicates whether SourceMaps from loaders should be used (defaults to true)
  	 */
  var module: js.UndefOr[Boolean] = js.native
  
  /**
  	 * Generator string or function to create identifiers of modules for the 'sources' array in the SourceMap
  	 */
  var moduleFilenameTemplate: js.UndefOr[js.Function | String] = js.native
  
  /**
  	 * Namespace prefix to allow multiple webpack roots in the devtools
  	 */
  var namespace: js.UndefOr[String] = js.native
  
  /**
  	 * Omit the 'sourceContents' array from the SourceMap
  	 */
  var noSources: js.UndefOr[Boolean] = js.native
  
  /**
  	 * Provide a custom public path for the SourceMapping comment
  	 */
  var publicPath: js.UndefOr[String] = js.native
  
  /**
  	 * Provide a custom value for the 'sourceRoot' property in the SourceMap
  	 */
  var sourceRoot: js.UndefOr[String] = js.native
  
  /**
  	 * Include source maps for modules based on their extension (defaults to .js and .css)
  	 */
  var test: js.UndefOr[Rules] = js.native
}
object SourceMapDevToolPluginOptions {
  
  @scala.inline
  def apply(): SourceMapDevToolPluginOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SourceMapDevToolPluginOptions]
  }
  
  @scala.inline
  implicit class SourceMapDevToolPluginOptionsOps[Self <: SourceMapDevToolPluginOptions] (val x: Self) extends AnyVal {
    
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
    def setAppend(value: `false` | String): Self = this.set("append", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAppend: Self = this.set("append", js.undefined)
    
    @scala.inline
    def setAppendNull: Self = this.set("append", null)
    
    @scala.inline
    def setColumns(value: Boolean): Self = this.set("columns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColumns: Self = this.set("columns", js.undefined)
    
    @scala.inline
    def setExcludeVarargs(value: Rule*): Self = this.set("exclude", js.Array(value :_*))
    
    @scala.inline
    def setExclude(value: Rules): Self = this.set("exclude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExclude: Self = this.set("exclude", js.undefined)
    
    @scala.inline
    def setFallbackModuleFilenameTemplate(value: js.Function | String): Self = this.set("fallbackModuleFilenameTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFallbackModuleFilenameTemplate: Self = this.set("fallbackModuleFilenameTemplate", js.undefined)
    
    @scala.inline
    def setFileContext(value: String): Self = this.set("fileContext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFileContext: Self = this.set("fileContext", js.undefined)
    
    @scala.inline
    def setFilename(value: `false` | String): Self = this.set("filename", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilename: Self = this.set("filename", js.undefined)
    
    @scala.inline
    def setFilenameNull: Self = this.set("filename", null)
    
    @scala.inline
    def setIncludeVarargs(value: Rule*): Self = this.set("include", js.Array(value :_*))
    
    @scala.inline
    def setInclude(value: Rules): Self = this.set("include", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInclude: Self = this.set("include", js.undefined)
    
    @scala.inline
    def setLineToLine(value: Boolean | Include): Self = this.set("lineToLine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLineToLine: Self = this.set("lineToLine", js.undefined)
    
    @scala.inline
    def setModule(value: Boolean): Self = this.set("module", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModule: Self = this.set("module", js.undefined)
    
    @scala.inline
    def setModuleFilenameTemplate(value: js.Function | String): Self = this.set("moduleFilenameTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModuleFilenameTemplate: Self = this.set("moduleFilenameTemplate", js.undefined)
    
    @scala.inline
    def setNamespace(value: String): Self = this.set("namespace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNamespace: Self = this.set("namespace", js.undefined)
    
    @scala.inline
    def setNoSources(value: Boolean): Self = this.set("noSources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNoSources: Self = this.set("noSources", js.undefined)
    
    @scala.inline
    def setPublicPath(value: String): Self = this.set("publicPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePublicPath: Self = this.set("publicPath", js.undefined)
    
    @scala.inline
    def setSourceRoot(value: String): Self = this.set("sourceRoot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourceRoot: Self = this.set("sourceRoot", js.undefined)
    
    @scala.inline
    def setTestVarargs(value: Rule*): Self = this.set("test", js.Array(value :_*))
    
    @scala.inline
    def setTest(value: Rules): Self = this.set("test", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTest: Self = this.set("test", js.undefined)
  }
}
