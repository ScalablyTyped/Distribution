package typings.webpack.mod

import org.scalablytyped.runtime.Instantiable0
import typings.webpack.webpackBooleans.`false`
import typings.webpack.webpackBooleans.`true`
import typings.webpack.webpackStrings.`use-credentials`
import typings.webpack.webpackStrings.anonymous
import typings.webpack.webpackStrings.module
import typings.webpack.webpackStrings.textSlashjavascript
import typings.webpack.webpackStrings.verbose
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Options affecting the output of the compilation. `output` options tell webpack how to write the compiled files to disk.
  */
trait Output extends StObject {
  
  /**
  	 * Add a container for define/require functions in the AMD module.
  	 */
  var amdContainer: js.UndefOr[String] = js.undefined
  
  /**
  	 * The filename of asset modules as relative path inside the 'output.path' directory.
  	 */
  var assetModuleFilename: js.UndefOr[
    String | (js.Function2[/* pathData */ PathData, /* assetInfo */ js.UndefOr[AssetInfo], String])
  ] = js.undefined
  
  /**
  	 * Enable/disable creating async chunks that are loaded on demand.
  	 */
  var asyncChunks: js.UndefOr[Boolean] = js.undefined
  
  /**
  	 * Add a comment in the UMD wrapper.
  	 */
  var auxiliaryComment: js.UndefOr[String | LibraryCustomUmdCommentObject] = js.undefined
  
  /**
  	 * Add charset attribute for script tag.
  	 */
  var charset: js.UndefOr[Boolean] = js.undefined
  
  /**
  	 * Specifies the filename template of output files of non-initial chunks on disk. You must **not** specify an absolute path here, but the path may contain folders separated by '/'! The specified path is joined with the value of the 'output.path' option to determine the location on disk.
  	 */
  var chunkFilename: js.UndefOr[
    String | (js.Function2[/* pathData */ PathData, /* assetInfo */ js.UndefOr[AssetInfo], String])
  ] = js.undefined
  
  /**
  	 * The format of chunks (formats included by default are 'array-push' (web/WebWorker), 'commonjs' (node.js), 'module' (ESM), but others might be added by plugins).
  	 */
  var chunkFormat: js.UndefOr[String | `false`] = js.undefined
  
  /**
  	 * Number of milliseconds before chunk request expires.
  	 */
  var chunkLoadTimeout: js.UndefOr[Double] = js.undefined
  
  /**
  	 * The method of loading chunks (methods included by default are 'jsonp' (web), 'import' (ESM), 'importScripts' (WebWorker), 'require' (sync node.js), 'async-node' (async node.js), but others might be added by plugins).
  	 */
  var chunkLoading: js.UndefOr[String | `false`] = js.undefined
  
  /**
  	 * The global variable used by webpack for loading of chunks.
  	 */
  var chunkLoadingGlobal: js.UndefOr[String] = js.undefined
  
  /**
  	 * Clean the output directory before emit.
  	 */
  var clean: js.UndefOr[Boolean | CleanOptions] = js.undefined
  
  /**
  	 * Check if to be emitted file already exists and have the same content before writing to output filesystem.
  	 */
  var compareBeforeEmit: js.UndefOr[Boolean] = js.undefined
  
  /**
  	 * This option enables cross-origin loading of chunks.
  	 */
  var crossOriginLoading: js.UndefOr[`false` | anonymous | `use-credentials`] = js.undefined
  
  /**
  	 * Specifies the filename template of non-initial output css files on disk. You must **not** specify an absolute path here, but the path may contain folders separated by '/'! The specified path is joined with the value of the 'output.path' option to determine the location on disk.
  	 */
  var cssChunkFilename: js.UndefOr[
    String | (js.Function2[/* pathData */ PathData, /* assetInfo */ js.UndefOr[AssetInfo], String])
  ] = js.undefined
  
  /**
  	 * Specifies the filename template of output css files on disk. You must **not** specify an absolute path here, but the path may contain folders separated by '/'! The specified path is joined with the value of the 'output.path' option to determine the location on disk.
  	 */
  var cssFilename: js.UndefOr[
    String | (js.Function2[/* pathData */ PathData, /* assetInfo */ js.UndefOr[AssetInfo], String])
  ] = js.undefined
  
  /**
  	 * Similar to `output.devtoolModuleFilenameTemplate`, but used in the case of duplicate module identifiers.
  	 */
  var devtoolFallbackModuleFilenameTemplate: js.UndefOr[String | js.Function] = js.undefined
  
  /**
  	 * Filename template string of function for the sources array in a generated SourceMap.
  	 */
  var devtoolModuleFilenameTemplate: js.UndefOr[String | js.Function] = js.undefined
  
  /**
  	 * Module namespace to use when interpolating filename template string for the sources array in a generated SourceMap. Defaults to `output.library` if not set. It's useful for avoiding runtime collisions in sourcemaps from multiple webpack projects built as libraries.
  	 */
  var devtoolNamespace: js.UndefOr[String] = js.undefined
  
  /**
  	 * List of chunk loading types enabled for use by entry points.
  	 */
  var enabledChunkLoadingTypes: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
  	 * List of library types enabled for use by entry points.
  	 */
  var enabledLibraryTypes: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
  	 * List of wasm loading types enabled for use by entry points.
  	 */
  var enabledWasmLoadingTypes: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
  	 * The abilities of the environment where the webpack generated code should run.
  	 */
  var environment: js.UndefOr[Environment] = js.undefined
  
  /**
  	 * Specifies the filename of output files on disk. You must **not** specify an absolute path here, but the path may contain folders separated by '/'! The specified path is joined with the value of the 'output.path' option to determine the location on disk.
  	 */
  var filename: js.UndefOr[
    String | (js.Function2[/* pathData */ PathData, /* assetInfo */ js.UndefOr[AssetInfo], String])
  ] = js.undefined
  
  /**
  	 * An expression which is used to address the global object/scope in runtime code.
  	 */
  var globalObject: js.UndefOr[String] = js.undefined
  
  /**
  	 * Digest type used for the hash.
  	 */
  var hashDigest: js.UndefOr[String] = js.undefined
  
  /**
  	 * Number of chars which are used for the hash.
  	 */
  var hashDigestLength: js.UndefOr[Double] = js.undefined
  
  /**
  	 * Algorithm used for generation the hash (see node.js crypto package).
  	 */
  var hashFunction: js.UndefOr[String | Instantiable0[Hash]] = js.undefined
  
  /**
  	 * Any string which is added to the hash to salt it.
  	 */
  var hashSalt: js.UndefOr[String] = js.undefined
  
  /**
  	 * The filename of the Hot Update Chunks. They are inside the output.path directory.
  	 */
  var hotUpdateChunkFilename: js.UndefOr[String] = js.undefined
  
  /**
  	 * The global variable used by webpack for loading of hot update chunks.
  	 */
  var hotUpdateGlobal: js.UndefOr[String] = js.undefined
  
  /**
  	 * The filename of the Hot Update Main File. It is inside the 'output.path' directory.
  	 */
  var hotUpdateMainFilename: js.UndefOr[String] = js.undefined
  
  /**
  	 * Ignore warnings in the browser.
  	 */
  var ignoreBrowserWarnings: js.UndefOr[Boolean] = js.undefined
  
  /**
  	 * Wrap javascript code into IIFE's to avoid leaking into global scope.
  	 */
  var iife: js.UndefOr[Boolean] = js.undefined
  
  /**
  	 * The name of the native import() function (can be exchanged for a polyfill).
  	 */
  var importFunctionName: js.UndefOr[String] = js.undefined
  
  /**
  	 * The name of the native import.meta object (can be exchanged for a polyfill).
  	 */
  var importMetaName: js.UndefOr[String] = js.undefined
  
  /**
  	 * Make the output files a library, exporting the exports of the entry point.
  	 */
  var library: js.UndefOr[String | js.Array[String] | LibraryOptions | LibraryCustomUmdObject] = js.undefined
  
  /**
  	 * Specify which export should be exposed as library.
  	 */
  var libraryExport: js.UndefOr[String | js.Array[String]] = js.undefined
  
  /**
  	 * Type of library (types included by default are 'var', 'module', 'assign', 'assign-properties', 'this', 'window', 'self', 'global', 'commonjs', 'commonjs2', 'commonjs-module', 'commonjs-static', 'amd', 'amd-require', 'umd', 'umd2', 'jsonp', 'system', but others might be added by plugins).
  	 */
  var libraryTarget: js.UndefOr[String] = js.undefined
  
  /**
  	 * Output javascript files as module source type.
  	 */
  var module: js.UndefOr[Boolean] = js.undefined
  
  /**
  	 * The output directory as **absolute path** (required).
  	 */
  var path: js.UndefOr[String] = js.undefined
  
  /**
  	 * Include comments with information about the modules.
  	 */
  var pathinfo: js.UndefOr[Boolean | verbose] = js.undefined
  
  /**
  	 * The 'publicPath' specifies the public URL address of the output files when referenced in a browser.
  	 */
  var publicPath: js.UndefOr[
    String | (js.Function2[/* pathData */ PathData, /* assetInfo */ js.UndefOr[AssetInfo], String])
  ] = js.undefined
  
  /**
  	 * This option enables loading async chunks via a custom script type, such as script type="module".
  	 */
  var scriptType: js.UndefOr[`false` | module | textSlashjavascript] = js.undefined
  
  /**
  	 * The filename of the SourceMaps for the JavaScript files. They are inside the 'output.path' directory.
  	 */
  var sourceMapFilename: js.UndefOr[String] = js.undefined
  
  /**
  	 * Prefixes every line of the source in the bundle with this string.
  	 */
  var sourcePrefix: js.UndefOr[String] = js.undefined
  
  /**
  	 * Handles error in module loading correctly at a performance cost. This will handle module error compatible with the EcmaScript Modules spec.
  	 */
  var strictModuleErrorHandling: js.UndefOr[Boolean] = js.undefined
  
  /**
  	 * Handles exceptions in module loading correctly at a performance cost (Deprecated). This will handle module error compatible with the Node.js CommonJS way.
  	 */
  var strictModuleExceptionHandling: js.UndefOr[Boolean] = js.undefined
  
  /**
  	 * Use a Trusted Types policy to create urls for chunks. 'output.uniqueName' is used a default policy name. Passing a string sets a custom policy name.
  	 */
  var trustedTypes: js.UndefOr[String | `true` | TrustedTypes] = js.undefined
  
  /**
  	 * If `output.libraryTarget` is set to umd and `output.library` is set, setting this to true will name the AMD module.
  	 */
  var umdNamedDefine: js.UndefOr[Boolean] = js.undefined
  
  /**
  	 * A unique name of the webpack build to avoid multiple webpack runtimes to conflict when using globals.
  	 */
  var uniqueName: js.UndefOr[String] = js.undefined
  
  /**
  	 * The method of loading WebAssembly Modules (methods included by default are 'fetch' (web/WebWorker), 'async-node' (node.js), but others might be added by plugins).
  	 */
  var wasmLoading: js.UndefOr[String | `false`] = js.undefined
  
  /**
  	 * The filename of WebAssembly modules as relative path inside the 'output.path' directory.
  	 */
  var webassemblyModuleFilename: js.UndefOr[String] = js.undefined
  
  /**
  	 * The method of loading chunks (methods included by default are 'jsonp' (web), 'import' (ESM), 'importScripts' (WebWorker), 'require' (sync node.js), 'async-node' (async node.js), but others might be added by plugins).
  	 */
  var workerChunkLoading: js.UndefOr[String | `false`] = js.undefined
  
  /**
  	 * Worker public path. Much like the public path, this sets the location where the worker script file is intended to be found. If not set, webpack will use the publicPath. Don't set this option unless your worker scripts are located at a different path from your other script files.
  	 */
  var workerPublicPath: js.UndefOr[String] = js.undefined
  
  /**
  	 * The method of loading WebAssembly Modules (methods included by default are 'fetch' (web/WebWorker), 'async-node' (node.js), but others might be added by plugins).
  	 */
  var workerWasmLoading: js.UndefOr[String | `false`] = js.undefined
}
object Output {
  
  inline def apply(): Output = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Output]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Output] (val x: Self) extends AnyVal {
    
    inline def setAmdContainer(value: String): Self = StObject.set(x, "amdContainer", value.asInstanceOf[js.Any])
    
    inline def setAmdContainerUndefined: Self = StObject.set(x, "amdContainer", js.undefined)
    
    inline def setAssetModuleFilename(
      value: String | (js.Function2[/* pathData */ PathData, /* assetInfo */ js.UndefOr[AssetInfo], String])
    ): Self = StObject.set(x, "assetModuleFilename", value.asInstanceOf[js.Any])
    
    inline def setAssetModuleFilenameFunction2(value: (/* pathData */ PathData, /* assetInfo */ js.UndefOr[AssetInfo]) => String): Self = StObject.set(x, "assetModuleFilename", js.Any.fromFunction2(value))
    
    inline def setAssetModuleFilenameUndefined: Self = StObject.set(x, "assetModuleFilename", js.undefined)
    
    inline def setAsyncChunks(value: Boolean): Self = StObject.set(x, "asyncChunks", value.asInstanceOf[js.Any])
    
    inline def setAsyncChunksUndefined: Self = StObject.set(x, "asyncChunks", js.undefined)
    
    inline def setAuxiliaryComment(value: String | LibraryCustomUmdCommentObject): Self = StObject.set(x, "auxiliaryComment", value.asInstanceOf[js.Any])
    
    inline def setAuxiliaryCommentUndefined: Self = StObject.set(x, "auxiliaryComment", js.undefined)
    
    inline def setCharset(value: Boolean): Self = StObject.set(x, "charset", value.asInstanceOf[js.Any])
    
    inline def setCharsetUndefined: Self = StObject.set(x, "charset", js.undefined)
    
    inline def setChunkFilename(
      value: String | (js.Function2[/* pathData */ PathData, /* assetInfo */ js.UndefOr[AssetInfo], String])
    ): Self = StObject.set(x, "chunkFilename", value.asInstanceOf[js.Any])
    
    inline def setChunkFilenameFunction2(value: (/* pathData */ PathData, /* assetInfo */ js.UndefOr[AssetInfo]) => String): Self = StObject.set(x, "chunkFilename", js.Any.fromFunction2(value))
    
    inline def setChunkFilenameUndefined: Self = StObject.set(x, "chunkFilename", js.undefined)
    
    inline def setChunkFormat(value: String | `false`): Self = StObject.set(x, "chunkFormat", value.asInstanceOf[js.Any])
    
    inline def setChunkFormatUndefined: Self = StObject.set(x, "chunkFormat", js.undefined)
    
    inline def setChunkLoadTimeout(value: Double): Self = StObject.set(x, "chunkLoadTimeout", value.asInstanceOf[js.Any])
    
    inline def setChunkLoadTimeoutUndefined: Self = StObject.set(x, "chunkLoadTimeout", js.undefined)
    
    inline def setChunkLoading(value: String | `false`): Self = StObject.set(x, "chunkLoading", value.asInstanceOf[js.Any])
    
    inline def setChunkLoadingGlobal(value: String): Self = StObject.set(x, "chunkLoadingGlobal", value.asInstanceOf[js.Any])
    
    inline def setChunkLoadingGlobalUndefined: Self = StObject.set(x, "chunkLoadingGlobal", js.undefined)
    
    inline def setChunkLoadingUndefined: Self = StObject.set(x, "chunkLoading", js.undefined)
    
    inline def setClean(value: Boolean | CleanOptions): Self = StObject.set(x, "clean", value.asInstanceOf[js.Any])
    
    inline def setCleanUndefined: Self = StObject.set(x, "clean", js.undefined)
    
    inline def setCompareBeforeEmit(value: Boolean): Self = StObject.set(x, "compareBeforeEmit", value.asInstanceOf[js.Any])
    
    inline def setCompareBeforeEmitUndefined: Self = StObject.set(x, "compareBeforeEmit", js.undefined)
    
    inline def setCrossOriginLoading(value: `false` | anonymous | `use-credentials`): Self = StObject.set(x, "crossOriginLoading", value.asInstanceOf[js.Any])
    
    inline def setCrossOriginLoadingUndefined: Self = StObject.set(x, "crossOriginLoading", js.undefined)
    
    inline def setCssChunkFilename(
      value: String | (js.Function2[/* pathData */ PathData, /* assetInfo */ js.UndefOr[AssetInfo], String])
    ): Self = StObject.set(x, "cssChunkFilename", value.asInstanceOf[js.Any])
    
    inline def setCssChunkFilenameFunction2(value: (/* pathData */ PathData, /* assetInfo */ js.UndefOr[AssetInfo]) => String): Self = StObject.set(x, "cssChunkFilename", js.Any.fromFunction2(value))
    
    inline def setCssChunkFilenameUndefined: Self = StObject.set(x, "cssChunkFilename", js.undefined)
    
    inline def setCssFilename(
      value: String | (js.Function2[/* pathData */ PathData, /* assetInfo */ js.UndefOr[AssetInfo], String])
    ): Self = StObject.set(x, "cssFilename", value.asInstanceOf[js.Any])
    
    inline def setCssFilenameFunction2(value: (/* pathData */ PathData, /* assetInfo */ js.UndefOr[AssetInfo]) => String): Self = StObject.set(x, "cssFilename", js.Any.fromFunction2(value))
    
    inline def setCssFilenameUndefined: Self = StObject.set(x, "cssFilename", js.undefined)
    
    inline def setDevtoolFallbackModuleFilenameTemplate(value: String | js.Function): Self = StObject.set(x, "devtoolFallbackModuleFilenameTemplate", value.asInstanceOf[js.Any])
    
    inline def setDevtoolFallbackModuleFilenameTemplateUndefined: Self = StObject.set(x, "devtoolFallbackModuleFilenameTemplate", js.undefined)
    
    inline def setDevtoolModuleFilenameTemplate(value: String | js.Function): Self = StObject.set(x, "devtoolModuleFilenameTemplate", value.asInstanceOf[js.Any])
    
    inline def setDevtoolModuleFilenameTemplateUndefined: Self = StObject.set(x, "devtoolModuleFilenameTemplate", js.undefined)
    
    inline def setDevtoolNamespace(value: String): Self = StObject.set(x, "devtoolNamespace", value.asInstanceOf[js.Any])
    
    inline def setDevtoolNamespaceUndefined: Self = StObject.set(x, "devtoolNamespace", js.undefined)
    
    inline def setEnabledChunkLoadingTypes(value: js.Array[String]): Self = StObject.set(x, "enabledChunkLoadingTypes", value.asInstanceOf[js.Any])
    
    inline def setEnabledChunkLoadingTypesUndefined: Self = StObject.set(x, "enabledChunkLoadingTypes", js.undefined)
    
    inline def setEnabledChunkLoadingTypesVarargs(value: String*): Self = StObject.set(x, "enabledChunkLoadingTypes", js.Array(value*))
    
    inline def setEnabledLibraryTypes(value: js.Array[String]): Self = StObject.set(x, "enabledLibraryTypes", value.asInstanceOf[js.Any])
    
    inline def setEnabledLibraryTypesUndefined: Self = StObject.set(x, "enabledLibraryTypes", js.undefined)
    
    inline def setEnabledLibraryTypesVarargs(value: String*): Self = StObject.set(x, "enabledLibraryTypes", js.Array(value*))
    
    inline def setEnabledWasmLoadingTypes(value: js.Array[String]): Self = StObject.set(x, "enabledWasmLoadingTypes", value.asInstanceOf[js.Any])
    
    inline def setEnabledWasmLoadingTypesUndefined: Self = StObject.set(x, "enabledWasmLoadingTypes", js.undefined)
    
    inline def setEnabledWasmLoadingTypesVarargs(value: String*): Self = StObject.set(x, "enabledWasmLoadingTypes", js.Array(value*))
    
    inline def setEnvironment(value: Environment): Self = StObject.set(x, "environment", value.asInstanceOf[js.Any])
    
    inline def setEnvironmentUndefined: Self = StObject.set(x, "environment", js.undefined)
    
    inline def setFilename(
      value: String | (js.Function2[/* pathData */ PathData, /* assetInfo */ js.UndefOr[AssetInfo], String])
    ): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
    
    inline def setFilenameFunction2(value: (/* pathData */ PathData, /* assetInfo */ js.UndefOr[AssetInfo]) => String): Self = StObject.set(x, "filename", js.Any.fromFunction2(value))
    
    inline def setFilenameUndefined: Self = StObject.set(x, "filename", js.undefined)
    
    inline def setGlobalObject(value: String): Self = StObject.set(x, "globalObject", value.asInstanceOf[js.Any])
    
    inline def setGlobalObjectUndefined: Self = StObject.set(x, "globalObject", js.undefined)
    
    inline def setHashDigest(value: String): Self = StObject.set(x, "hashDigest", value.asInstanceOf[js.Any])
    
    inline def setHashDigestLength(value: Double): Self = StObject.set(x, "hashDigestLength", value.asInstanceOf[js.Any])
    
    inline def setHashDigestLengthUndefined: Self = StObject.set(x, "hashDigestLength", js.undefined)
    
    inline def setHashDigestUndefined: Self = StObject.set(x, "hashDigest", js.undefined)
    
    inline def setHashFunction(value: String | Instantiable0[Hash]): Self = StObject.set(x, "hashFunction", value.asInstanceOf[js.Any])
    
    inline def setHashFunctionUndefined: Self = StObject.set(x, "hashFunction", js.undefined)
    
    inline def setHashSalt(value: String): Self = StObject.set(x, "hashSalt", value.asInstanceOf[js.Any])
    
    inline def setHashSaltUndefined: Self = StObject.set(x, "hashSalt", js.undefined)
    
    inline def setHotUpdateChunkFilename(value: String): Self = StObject.set(x, "hotUpdateChunkFilename", value.asInstanceOf[js.Any])
    
    inline def setHotUpdateChunkFilenameUndefined: Self = StObject.set(x, "hotUpdateChunkFilename", js.undefined)
    
    inline def setHotUpdateGlobal(value: String): Self = StObject.set(x, "hotUpdateGlobal", value.asInstanceOf[js.Any])
    
    inline def setHotUpdateGlobalUndefined: Self = StObject.set(x, "hotUpdateGlobal", js.undefined)
    
    inline def setHotUpdateMainFilename(value: String): Self = StObject.set(x, "hotUpdateMainFilename", value.asInstanceOf[js.Any])
    
    inline def setHotUpdateMainFilenameUndefined: Self = StObject.set(x, "hotUpdateMainFilename", js.undefined)
    
    inline def setIgnoreBrowserWarnings(value: Boolean): Self = StObject.set(x, "ignoreBrowserWarnings", value.asInstanceOf[js.Any])
    
    inline def setIgnoreBrowserWarningsUndefined: Self = StObject.set(x, "ignoreBrowserWarnings", js.undefined)
    
    inline def setIife(value: Boolean): Self = StObject.set(x, "iife", value.asInstanceOf[js.Any])
    
    inline def setIifeUndefined: Self = StObject.set(x, "iife", js.undefined)
    
    inline def setImportFunctionName(value: String): Self = StObject.set(x, "importFunctionName", value.asInstanceOf[js.Any])
    
    inline def setImportFunctionNameUndefined: Self = StObject.set(x, "importFunctionName", js.undefined)
    
    inline def setImportMetaName(value: String): Self = StObject.set(x, "importMetaName", value.asInstanceOf[js.Any])
    
    inline def setImportMetaNameUndefined: Self = StObject.set(x, "importMetaName", js.undefined)
    
    inline def setLibrary(value: String | js.Array[String] | LibraryOptions | LibraryCustomUmdObject): Self = StObject.set(x, "library", value.asInstanceOf[js.Any])
    
    inline def setLibraryExport(value: String | js.Array[String]): Self = StObject.set(x, "libraryExport", value.asInstanceOf[js.Any])
    
    inline def setLibraryExportUndefined: Self = StObject.set(x, "libraryExport", js.undefined)
    
    inline def setLibraryExportVarargs(value: String*): Self = StObject.set(x, "libraryExport", js.Array(value*))
    
    inline def setLibraryTarget(value: String): Self = StObject.set(x, "libraryTarget", value.asInstanceOf[js.Any])
    
    inline def setLibraryTargetUndefined: Self = StObject.set(x, "libraryTarget", js.undefined)
    
    inline def setLibraryUndefined: Self = StObject.set(x, "library", js.undefined)
    
    inline def setLibraryVarargs(value: String*): Self = StObject.set(x, "library", js.Array(value*))
    
    inline def setModule(value: Boolean): Self = StObject.set(x, "module", value.asInstanceOf[js.Any])
    
    inline def setModuleUndefined: Self = StObject.set(x, "module", js.undefined)
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    inline def setPathinfo(value: Boolean | verbose): Self = StObject.set(x, "pathinfo", value.asInstanceOf[js.Any])
    
    inline def setPathinfoUndefined: Self = StObject.set(x, "pathinfo", js.undefined)
    
    inline def setPublicPath(
      value: String | (js.Function2[/* pathData */ PathData, /* assetInfo */ js.UndefOr[AssetInfo], String])
    ): Self = StObject.set(x, "publicPath", value.asInstanceOf[js.Any])
    
    inline def setPublicPathFunction2(value: (/* pathData */ PathData, /* assetInfo */ js.UndefOr[AssetInfo]) => String): Self = StObject.set(x, "publicPath", js.Any.fromFunction2(value))
    
    inline def setPublicPathUndefined: Self = StObject.set(x, "publicPath", js.undefined)
    
    inline def setScriptType(value: `false` | module | textSlashjavascript): Self = StObject.set(x, "scriptType", value.asInstanceOf[js.Any])
    
    inline def setScriptTypeUndefined: Self = StObject.set(x, "scriptType", js.undefined)
    
    inline def setSourceMapFilename(value: String): Self = StObject.set(x, "sourceMapFilename", value.asInstanceOf[js.Any])
    
    inline def setSourceMapFilenameUndefined: Self = StObject.set(x, "sourceMapFilename", js.undefined)
    
    inline def setSourcePrefix(value: String): Self = StObject.set(x, "sourcePrefix", value.asInstanceOf[js.Any])
    
    inline def setSourcePrefixUndefined: Self = StObject.set(x, "sourcePrefix", js.undefined)
    
    inline def setStrictModuleErrorHandling(value: Boolean): Self = StObject.set(x, "strictModuleErrorHandling", value.asInstanceOf[js.Any])
    
    inline def setStrictModuleErrorHandlingUndefined: Self = StObject.set(x, "strictModuleErrorHandling", js.undefined)
    
    inline def setStrictModuleExceptionHandling(value: Boolean): Self = StObject.set(x, "strictModuleExceptionHandling", value.asInstanceOf[js.Any])
    
    inline def setStrictModuleExceptionHandlingUndefined: Self = StObject.set(x, "strictModuleExceptionHandling", js.undefined)
    
    inline def setTrustedTypes(value: String | `true` | TrustedTypes): Self = StObject.set(x, "trustedTypes", value.asInstanceOf[js.Any])
    
    inline def setTrustedTypesUndefined: Self = StObject.set(x, "trustedTypes", js.undefined)
    
    inline def setUmdNamedDefine(value: Boolean): Self = StObject.set(x, "umdNamedDefine", value.asInstanceOf[js.Any])
    
    inline def setUmdNamedDefineUndefined: Self = StObject.set(x, "umdNamedDefine", js.undefined)
    
    inline def setUniqueName(value: String): Self = StObject.set(x, "uniqueName", value.asInstanceOf[js.Any])
    
    inline def setUniqueNameUndefined: Self = StObject.set(x, "uniqueName", js.undefined)
    
    inline def setWasmLoading(value: String | `false`): Self = StObject.set(x, "wasmLoading", value.asInstanceOf[js.Any])
    
    inline def setWasmLoadingUndefined: Self = StObject.set(x, "wasmLoading", js.undefined)
    
    inline def setWebassemblyModuleFilename(value: String): Self = StObject.set(x, "webassemblyModuleFilename", value.asInstanceOf[js.Any])
    
    inline def setWebassemblyModuleFilenameUndefined: Self = StObject.set(x, "webassemblyModuleFilename", js.undefined)
    
    inline def setWorkerChunkLoading(value: String | `false`): Self = StObject.set(x, "workerChunkLoading", value.asInstanceOf[js.Any])
    
    inline def setWorkerChunkLoadingUndefined: Self = StObject.set(x, "workerChunkLoading", js.undefined)
    
    inline def setWorkerPublicPath(value: String): Self = StObject.set(x, "workerPublicPath", value.asInstanceOf[js.Any])
    
    inline def setWorkerPublicPathUndefined: Self = StObject.set(x, "workerPublicPath", js.undefined)
    
    inline def setWorkerWasmLoading(value: String | `false`): Self = StObject.set(x, "workerWasmLoading", value.asInstanceOf[js.Any])
    
    inline def setWorkerWasmLoadingUndefined: Self = StObject.set(x, "workerWasmLoading", js.undefined)
  }
}
