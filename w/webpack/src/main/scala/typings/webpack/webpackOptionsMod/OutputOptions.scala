package typings.webpack.webpackOptionsMod

import org.scalablytyped.runtime.StringDictionary
import typings.webpack.anon.Amd
import typings.webpack.webpackBooleans.`false`
import typings.webpack.webpackStrings.`amd-require`
import typings.webpack.webpackStrings.`commonjs-module`
import typings.webpack.webpackStrings.`this`
import typings.webpack.webpackStrings.`use-credentials`
import typings.webpack.webpackStrings.`var`
import typings.webpack.webpackStrings.amd
import typings.webpack.webpackStrings.anonymous
import typings.webpack.webpackStrings.assign
import typings.webpack.webpackStrings.commonjs
import typings.webpack.webpackStrings.commonjs2
import typings.webpack.webpackStrings.global
import typings.webpack.webpackStrings.jsonp
import typings.webpack.webpackStrings.module
import typings.webpack.webpackStrings.self
import typings.webpack.webpackStrings.system
import typings.webpack.webpackStrings.textSlashjavascript
import typings.webpack.webpackStrings.umd
import typings.webpack.webpackStrings.umd2
import typings.webpack.webpackStrings.window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OutputOptions extends js.Object {
  
  /**
  	 * Add a comment in the UMD wrapper.
  	 */
  var auxiliaryComment: js.UndefOr[String | Amd] = js.native
  
  /**
  	 * The callback function name used by webpack for loading of chunks in WebWorkers.
  	 */
  var chunkCallbackName: js.UndefOr[String] = js.native
  
  /**
  	 * The filename of non-entry chunks as relative path inside the `output.path` directory.
  	 */
  var chunkFilename: js.UndefOr[String] = js.native
  
  /**
  	 * Number of milliseconds before chunk request expires
  	 */
  var chunkLoadTimeout: js.UndefOr[Double] = js.native
  
  /**
  	 * This option enables cross-origin loading of chunks.
  	 */
  var crossOriginLoading: js.UndefOr[`false` | anonymous | `use-credentials`] = js.native
  
  /**
  	 * Similar to `output.devtoolModuleFilenameTemplate`, but used in the case of duplicate module identifiers.
  	 */
  var devtoolFallbackModuleFilenameTemplate: js.UndefOr[String | js.Function] = js.native
  
  /**
  	 * Enable line to line mapped mode for all/specified modules. Line to line mapped mode uses a simple SourceMap where each line of the generated source is mapped to the same line of the original source. It’s a performance optimization. Only use it if your performance need to be better and you are sure that input lines match which generated lines.
  	 */
  var devtoolLineToLine: js.UndefOr[Boolean | StringDictionary[js.Any]] = js.native
  
  /**
  	 * Filename template string of function for the sources array in a generated SourceMap.
  	 */
  var devtoolModuleFilenameTemplate: js.UndefOr[String | js.Function] = js.native
  
  /**
  	 * Module namespace to use when interpolating filename template string for the sources array in a generated SourceMap. Defaults to `output.library` if not set. It's useful for avoiding runtime collisions in sourcemaps from multiple webpack projects built as libraries.
  	 */
  var devtoolNamespace: js.UndefOr[String] = js.native
  
  /**
  	 * Specifies the name of each output file on disk. You must **not** specify an absolute path here! The `output.path` option determines the location on disk the files are written to, filename is used solely for naming the individual files.
  	 */
  var filename: js.UndefOr[String | js.Function] = js.native
  
  /**
  	 * Use the future version of asset emitting logic, which allows freeing memory of assets after emitting. It could break plugins which assume that assets are still readable after emitting. Will be the new default in the next major version.
  	 */
  var futureEmitAssets: js.UndefOr[Boolean] = js.native
  
  /**
  	 * An expression which is used to address the global object/scope in runtime code
  	 */
  var globalObject: js.UndefOr[String] = js.native
  
  /**
  	 * Digest type used for the hash
  	 */
  var hashDigest: js.UndefOr[String] = js.native
  
  /**
  	 * Number of chars which are used for the hash
  	 */
  var hashDigestLength: js.UndefOr[Double] = js.native
  
  /**
  	 * Algorithm used for generation the hash (see node.js crypto package)
  	 */
  var hashFunction: js.UndefOr[
    String | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_createHash.HashConstructor */ js.Any)
  ] = js.native
  
  /**
  	 * Any string which is added to the hash to salt it
  	 */
  var hashSalt: js.UndefOr[String] = js.native
  
  /**
  	 * The filename of the Hot Update Chunks. They are inside the output.path directory.
  	 */
  var hotUpdateChunkFilename: js.UndefOr[String] = js.native
  
  /**
  	 * The JSONP function used by webpack for async loading of hot update chunks.
  	 */
  var hotUpdateFunction: js.UndefOr[String] = js.native
  
  /**
  	 * The filename of the Hot Update Main File. It is inside the `output.path` directory.
  	 */
  var hotUpdateMainFilename: js.UndefOr[String | js.Function] = js.native
  
  /**
  	 * The JSONP function used by webpack for async loading of chunks.
  	 */
  var jsonpFunction: js.UndefOr[String] = js.native
  
  /**
  	 * This option enables loading async chunks via a custom script type, such as script type="module"
  	 */
  var jsonpScriptType: js.UndefOr[`false` | textSlashjavascript | module] = js.native
  
  /**
  	 * If set, export the bundle as library. `output.library` is the name.
  	 */
  var library: js.UndefOr[String | js.Array[String] | LibraryCustomUmdObject] = js.native
  
  /**
  	 * Specify which export should be exposed as library
  	 */
  var libraryExport: js.UndefOr[String | ArrayOfStringValues] = js.native
  
  /**
  	 * Type of library
  	 */
  var libraryTarget: js.UndefOr[
    `var` | assign | `this` | window | self | global | commonjs | commonjs2 | `commonjs-module` | amd | `amd-require` | umd | umd2 | jsonp | system
  ] = js.native
  
  /**
  	 * The output directory as **absolute path** (required).
  	 */
  var path: js.UndefOr[String] = js.native
  
  /**
  	 * Include comments with information about the modules.
  	 */
  var pathinfo: js.UndefOr[Boolean] = js.native
  
  /**
  	 * The `publicPath` specifies the public URL address of the output files when referenced in a browser.
  	 */
  var publicPath: js.UndefOr[String | js.Function] = js.native
  
  /**
  	 * The filename of the SourceMaps for the JavaScript files. They are inside the `output.path` directory.
  	 */
  var sourceMapFilename: js.UndefOr[String] = js.native
  
  /**
  	 * Prefixes every line of the source in the bundle with this string.
  	 */
  var sourcePrefix: js.UndefOr[String] = js.native
  
  /**
  	 * Handles exceptions in module loading correctly at a performance cost.
  	 */
  var strictModuleExceptionHandling: js.UndefOr[Boolean] = js.native
  
  /**
  	 * If `output.libraryTarget` is set to umd and `output.library` is set, setting this to true will name the AMD module.
  	 */
  var umdNamedDefine: js.UndefOr[Boolean] = js.native
  
  /**
  	 * The filename of WebAssembly modules as relative path inside the `output.path` directory.
  	 */
  var webassemblyModuleFilename: js.UndefOr[String] = js.native
}
object OutputOptions {
  
  @scala.inline
  def apply(): OutputOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OutputOptions]
  }
  
  @scala.inline
  implicit class OutputOptionsOps[Self <: OutputOptions] (val x: Self) extends AnyVal {
    
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
    def setAuxiliaryComment(value: String | Amd): Self = this.set("auxiliaryComment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuxiliaryComment: Self = this.set("auxiliaryComment", js.undefined)
    
    @scala.inline
    def setChunkCallbackName(value: String): Self = this.set("chunkCallbackName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChunkCallbackName: Self = this.set("chunkCallbackName", js.undefined)
    
    @scala.inline
    def setChunkFilename(value: String): Self = this.set("chunkFilename", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChunkFilename: Self = this.set("chunkFilename", js.undefined)
    
    @scala.inline
    def setChunkLoadTimeout(value: Double): Self = this.set("chunkLoadTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChunkLoadTimeout: Self = this.set("chunkLoadTimeout", js.undefined)
    
    @scala.inline
    def setCrossOriginLoading(value: `false` | anonymous | `use-credentials`): Self = this.set("crossOriginLoading", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCrossOriginLoading: Self = this.set("crossOriginLoading", js.undefined)
    
    @scala.inline
    def setDevtoolFallbackModuleFilenameTemplate(value: String | js.Function): Self = this.set("devtoolFallbackModuleFilenameTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDevtoolFallbackModuleFilenameTemplate: Self = this.set("devtoolFallbackModuleFilenameTemplate", js.undefined)
    
    @scala.inline
    def setDevtoolLineToLine(value: Boolean | StringDictionary[js.Any]): Self = this.set("devtoolLineToLine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDevtoolLineToLine: Self = this.set("devtoolLineToLine", js.undefined)
    
    @scala.inline
    def setDevtoolModuleFilenameTemplate(value: String | js.Function): Self = this.set("devtoolModuleFilenameTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDevtoolModuleFilenameTemplate: Self = this.set("devtoolModuleFilenameTemplate", js.undefined)
    
    @scala.inline
    def setDevtoolNamespace(value: String): Self = this.set("devtoolNamespace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDevtoolNamespace: Self = this.set("devtoolNamespace", js.undefined)
    
    @scala.inline
    def setFilename(value: String | js.Function): Self = this.set("filename", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilename: Self = this.set("filename", js.undefined)
    
    @scala.inline
    def setFutureEmitAssets(value: Boolean): Self = this.set("futureEmitAssets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFutureEmitAssets: Self = this.set("futureEmitAssets", js.undefined)
    
    @scala.inline
    def setGlobalObject(value: String): Self = this.set("globalObject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGlobalObject: Self = this.set("globalObject", js.undefined)
    
    @scala.inline
    def setHashDigest(value: String): Self = this.set("hashDigest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHashDigest: Self = this.set("hashDigest", js.undefined)
    
    @scala.inline
    def setHashDigestLength(value: Double): Self = this.set("hashDigestLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHashDigestLength: Self = this.set("hashDigestLength", js.undefined)
    
    @scala.inline
    def setHashFunction(
      value: String | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_createHash.HashConstructor */ js.Any)
    ): Self = this.set("hashFunction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHashFunction: Self = this.set("hashFunction", js.undefined)
    
    @scala.inline
    def setHashSalt(value: String): Self = this.set("hashSalt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHashSalt: Self = this.set("hashSalt", js.undefined)
    
    @scala.inline
    def setHotUpdateChunkFilename(value: String): Self = this.set("hotUpdateChunkFilename", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHotUpdateChunkFilename: Self = this.set("hotUpdateChunkFilename", js.undefined)
    
    @scala.inline
    def setHotUpdateFunction(value: String): Self = this.set("hotUpdateFunction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHotUpdateFunction: Self = this.set("hotUpdateFunction", js.undefined)
    
    @scala.inline
    def setHotUpdateMainFilename(value: String | js.Function): Self = this.set("hotUpdateMainFilename", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHotUpdateMainFilename: Self = this.set("hotUpdateMainFilename", js.undefined)
    
    @scala.inline
    def setJsonpFunction(value: String): Self = this.set("jsonpFunction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJsonpFunction: Self = this.set("jsonpFunction", js.undefined)
    
    @scala.inline
    def setJsonpScriptType(value: `false` | textSlashjavascript | module): Self = this.set("jsonpScriptType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJsonpScriptType: Self = this.set("jsonpScriptType", js.undefined)
    
    @scala.inline
    def setLibraryVarargs(value: String*): Self = this.set("library", js.Array(value :_*))
    
    @scala.inline
    def setLibrary(value: String | js.Array[String] | LibraryCustomUmdObject): Self = this.set("library", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLibrary: Self = this.set("library", js.undefined)
    
    @scala.inline
    def setLibraryExportVarargs(value: String*): Self = this.set("libraryExport", js.Array(value :_*))
    
    @scala.inline
    def setLibraryExport(value: String | ArrayOfStringValues): Self = this.set("libraryExport", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLibraryExport: Self = this.set("libraryExport", js.undefined)
    
    @scala.inline
    def setLibraryTarget(
      value: `var` | assign | `this` | window | self | global | commonjs | commonjs2 | `commonjs-module` | amd | `amd-require` | umd | umd2 | jsonp | system
    ): Self = this.set("libraryTarget", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLibraryTarget: Self = this.set("libraryTarget", js.undefined)
    
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePath: Self = this.set("path", js.undefined)
    
    @scala.inline
    def setPathinfo(value: Boolean): Self = this.set("pathinfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePathinfo: Self = this.set("pathinfo", js.undefined)
    
    @scala.inline
    def setPublicPath(value: String | js.Function): Self = this.set("publicPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePublicPath: Self = this.set("publicPath", js.undefined)
    
    @scala.inline
    def setSourceMapFilename(value: String): Self = this.set("sourceMapFilename", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourceMapFilename: Self = this.set("sourceMapFilename", js.undefined)
    
    @scala.inline
    def setSourcePrefix(value: String): Self = this.set("sourcePrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourcePrefix: Self = this.set("sourcePrefix", js.undefined)
    
    @scala.inline
    def setStrictModuleExceptionHandling(value: Boolean): Self = this.set("strictModuleExceptionHandling", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStrictModuleExceptionHandling: Self = this.set("strictModuleExceptionHandling", js.undefined)
    
    @scala.inline
    def setUmdNamedDefine(value: Boolean): Self = this.set("umdNamedDefine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUmdNamedDefine: Self = this.set("umdNamedDefine", js.undefined)
    
    @scala.inline
    def setWebassemblyModuleFilename(value: String): Self = this.set("webassemblyModuleFilename", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWebassemblyModuleFilename: Self = this.set("webassemblyModuleFilename", js.undefined)
  }
}
