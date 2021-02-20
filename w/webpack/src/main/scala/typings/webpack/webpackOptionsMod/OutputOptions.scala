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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OutputOptions extends StObject {
  
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
  implicit class OutputOptionsMutableBuilder[Self <: OutputOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuxiliaryComment(value: String | Amd): Self = StObject.set(x, "auxiliaryComment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuxiliaryCommentUndefined: Self = StObject.set(x, "auxiliaryComment", js.undefined)
    
    @scala.inline
    def setChunkCallbackName(value: String): Self = StObject.set(x, "chunkCallbackName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChunkCallbackNameUndefined: Self = StObject.set(x, "chunkCallbackName", js.undefined)
    
    @scala.inline
    def setChunkFilename(value: String): Self = StObject.set(x, "chunkFilename", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChunkFilenameUndefined: Self = StObject.set(x, "chunkFilename", js.undefined)
    
    @scala.inline
    def setChunkLoadTimeout(value: Double): Self = StObject.set(x, "chunkLoadTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChunkLoadTimeoutUndefined: Self = StObject.set(x, "chunkLoadTimeout", js.undefined)
    
    @scala.inline
    def setCrossOriginLoading(value: `false` | anonymous | `use-credentials`): Self = StObject.set(x, "crossOriginLoading", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCrossOriginLoadingUndefined: Self = StObject.set(x, "crossOriginLoading", js.undefined)
    
    @scala.inline
    def setDevtoolFallbackModuleFilenameTemplate(value: String | js.Function): Self = StObject.set(x, "devtoolFallbackModuleFilenameTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDevtoolFallbackModuleFilenameTemplateUndefined: Self = StObject.set(x, "devtoolFallbackModuleFilenameTemplate", js.undefined)
    
    @scala.inline
    def setDevtoolLineToLine(value: Boolean | StringDictionary[js.Any]): Self = StObject.set(x, "devtoolLineToLine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDevtoolLineToLineUndefined: Self = StObject.set(x, "devtoolLineToLine", js.undefined)
    
    @scala.inline
    def setDevtoolModuleFilenameTemplate(value: String | js.Function): Self = StObject.set(x, "devtoolModuleFilenameTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDevtoolModuleFilenameTemplateUndefined: Self = StObject.set(x, "devtoolModuleFilenameTemplate", js.undefined)
    
    @scala.inline
    def setDevtoolNamespace(value: String): Self = StObject.set(x, "devtoolNamespace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDevtoolNamespaceUndefined: Self = StObject.set(x, "devtoolNamespace", js.undefined)
    
    @scala.inline
    def setFilename(value: String | js.Function): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilenameUndefined: Self = StObject.set(x, "filename", js.undefined)
    
    @scala.inline
    def setFutureEmitAssets(value: Boolean): Self = StObject.set(x, "futureEmitAssets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFutureEmitAssetsUndefined: Self = StObject.set(x, "futureEmitAssets", js.undefined)
    
    @scala.inline
    def setGlobalObject(value: String): Self = StObject.set(x, "globalObject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGlobalObjectUndefined: Self = StObject.set(x, "globalObject", js.undefined)
    
    @scala.inline
    def setHashDigest(value: String): Self = StObject.set(x, "hashDigest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHashDigestLength(value: Double): Self = StObject.set(x, "hashDigestLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHashDigestLengthUndefined: Self = StObject.set(x, "hashDigestLength", js.undefined)
    
    @scala.inline
    def setHashDigestUndefined: Self = StObject.set(x, "hashDigest", js.undefined)
    
    @scala.inline
    def setHashFunction(
      value: String | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_createHash.HashConstructor */ js.Any)
    ): Self = StObject.set(x, "hashFunction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHashFunctionUndefined: Self = StObject.set(x, "hashFunction", js.undefined)
    
    @scala.inline
    def setHashSalt(value: String): Self = StObject.set(x, "hashSalt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHashSaltUndefined: Self = StObject.set(x, "hashSalt", js.undefined)
    
    @scala.inline
    def setHotUpdateChunkFilename(value: String): Self = StObject.set(x, "hotUpdateChunkFilename", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHotUpdateChunkFilenameUndefined: Self = StObject.set(x, "hotUpdateChunkFilename", js.undefined)
    
    @scala.inline
    def setHotUpdateFunction(value: String): Self = StObject.set(x, "hotUpdateFunction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHotUpdateFunctionUndefined: Self = StObject.set(x, "hotUpdateFunction", js.undefined)
    
    @scala.inline
    def setHotUpdateMainFilename(value: String | js.Function): Self = StObject.set(x, "hotUpdateMainFilename", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHotUpdateMainFilenameUndefined: Self = StObject.set(x, "hotUpdateMainFilename", js.undefined)
    
    @scala.inline
    def setJsonpFunction(value: String): Self = StObject.set(x, "jsonpFunction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJsonpFunctionUndefined: Self = StObject.set(x, "jsonpFunction", js.undefined)
    
    @scala.inline
    def setJsonpScriptType(value: `false` | textSlashjavascript | module): Self = StObject.set(x, "jsonpScriptType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJsonpScriptTypeUndefined: Self = StObject.set(x, "jsonpScriptType", js.undefined)
    
    @scala.inline
    def setLibrary(value: String | js.Array[String] | LibraryCustomUmdObject): Self = StObject.set(x, "library", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLibraryExport(value: String | ArrayOfStringValues): Self = StObject.set(x, "libraryExport", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLibraryExportUndefined: Self = StObject.set(x, "libraryExport", js.undefined)
    
    @scala.inline
    def setLibraryExportVarargs(value: String*): Self = StObject.set(x, "libraryExport", js.Array(value :_*))
    
    @scala.inline
    def setLibraryTarget(
      value: `var` | assign | `this` | window | self | global | commonjs | commonjs2 | `commonjs-module` | amd | `amd-require` | umd | umd2 | jsonp | system
    ): Self = StObject.set(x, "libraryTarget", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLibraryTargetUndefined: Self = StObject.set(x, "libraryTarget", js.undefined)
    
    @scala.inline
    def setLibraryUndefined: Self = StObject.set(x, "library", js.undefined)
    
    @scala.inline
    def setLibraryVarargs(value: String*): Self = StObject.set(x, "library", js.Array(value :_*))
    
    @scala.inline
    def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    @scala.inline
    def setPathinfo(value: Boolean): Self = StObject.set(x, "pathinfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathinfoUndefined: Self = StObject.set(x, "pathinfo", js.undefined)
    
    @scala.inline
    def setPublicPath(value: String | js.Function): Self = StObject.set(x, "publicPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublicPathUndefined: Self = StObject.set(x, "publicPath", js.undefined)
    
    @scala.inline
    def setSourceMapFilename(value: String): Self = StObject.set(x, "sourceMapFilename", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceMapFilenameUndefined: Self = StObject.set(x, "sourceMapFilename", js.undefined)
    
    @scala.inline
    def setSourcePrefix(value: String): Self = StObject.set(x, "sourcePrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourcePrefixUndefined: Self = StObject.set(x, "sourcePrefix", js.undefined)
    
    @scala.inline
    def setStrictModuleExceptionHandling(value: Boolean): Self = StObject.set(x, "strictModuleExceptionHandling", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrictModuleExceptionHandlingUndefined: Self = StObject.set(x, "strictModuleExceptionHandling", js.undefined)
    
    @scala.inline
    def setUmdNamedDefine(value: Boolean): Self = StObject.set(x, "umdNamedDefine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUmdNamedDefineUndefined: Self = StObject.set(x, "umdNamedDefine", js.undefined)
    
    @scala.inline
    def setWebassemblyModuleFilename(value: String): Self = StObject.set(x, "webassemblyModuleFilename", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebassemblyModuleFilenameUndefined: Self = StObject.set(x, "webassemblyModuleFilename", js.undefined)
  }
}
