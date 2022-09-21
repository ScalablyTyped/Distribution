package typings.webpack.mod

import typings.webpack.webpackBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An object with entry point description.
  */
trait EntryDescription extends StObject {
  
  /**
  	 * Enable/disable creating async chunks that are loaded on demand.
  	 */
  var asyncChunks: js.UndefOr[Boolean] = js.undefined
  
  /**
  	 * Base uri for this entry.
  	 */
  var baseUri: js.UndefOr[String] = js.undefined
  
  /**
  	 * The method of loading chunks (methods included by default are 'jsonp' (web), 'import' (ESM), 'importScripts' (WebWorker), 'require' (sync node.js), 'async-node' (async node.js), but others might be added by plugins).
  	 */
  var chunkLoading: js.UndefOr[String | `false`] = js.undefined
  
  /**
  	 * The entrypoints that the current entrypoint depend on. They must be loaded when this entrypoint is loaded.
  	 */
  var dependOn: js.UndefOr[String | js.Array[String]] = js.undefined
  
  /**
  	 * Specifies the filename of the output file on disk. You must **not** specify an absolute path here, but the path may contain folders separated by '/'! The specified path is joined with the value of the 'output.path' option to determine the location on disk.
  	 */
  var filename: js.UndefOr[
    String | (js.Function2[/* pathData */ PathData, /* assetInfo */ js.UndefOr[AssetInfo], String])
  ] = js.undefined
  
  /**
  	 * Module(s) that are loaded upon startup.
  	 */
  var `import`: EntryItem
  
  /**
  	 * Specifies the layer in which modules of this entrypoint are placed.
  	 */
  var layer: js.UndefOr[Null | String] = js.undefined
  
  /**
  	 * Options for library.
  	 */
  var library: js.UndefOr[LibraryOptions] = js.undefined
  
  /**
  	 * The 'publicPath' specifies the public URL address of the output files when referenced in a browser.
  	 */
  var publicPath: js.UndefOr[
    String | (js.Function2[/* pathData */ PathData, /* assetInfo */ js.UndefOr[AssetInfo], String])
  ] = js.undefined
  
  /**
  	 * The name of the runtime chunk. If set a runtime chunk with this name is created or an existing entrypoint is used as runtime.
  	 */
  var runtime: js.UndefOr[String | `false`] = js.undefined
  
  /**
  	 * The method of loading WebAssembly Modules (methods included by default are 'fetch' (web/WebWorker), 'async-node' (node.js), but others might be added by plugins).
  	 */
  var wasmLoading: js.UndefOr[String | `false`] = js.undefined
}
object EntryDescription {
  
  inline def apply(`import`: EntryItem): EntryDescription = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("import")(`import`.asInstanceOf[js.Any])
    __obj.asInstanceOf[EntryDescription]
  }
  
  extension [Self <: EntryDescription](x: Self) {
    
    inline def setAsyncChunks(value: Boolean): Self = StObject.set(x, "asyncChunks", value.asInstanceOf[js.Any])
    
    inline def setAsyncChunksUndefined: Self = StObject.set(x, "asyncChunks", js.undefined)
    
    inline def setBaseUri(value: String): Self = StObject.set(x, "baseUri", value.asInstanceOf[js.Any])
    
    inline def setBaseUriUndefined: Self = StObject.set(x, "baseUri", js.undefined)
    
    inline def setChunkLoading(value: String | `false`): Self = StObject.set(x, "chunkLoading", value.asInstanceOf[js.Any])
    
    inline def setChunkLoadingUndefined: Self = StObject.set(x, "chunkLoading", js.undefined)
    
    inline def setDependOn(value: String | js.Array[String]): Self = StObject.set(x, "dependOn", value.asInstanceOf[js.Any])
    
    inline def setDependOnUndefined: Self = StObject.set(x, "dependOn", js.undefined)
    
    inline def setDependOnVarargs(value: String*): Self = StObject.set(x, "dependOn", js.Array(value*))
    
    inline def setFilename(
      value: String | (js.Function2[/* pathData */ PathData, /* assetInfo */ js.UndefOr[AssetInfo], String])
    ): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
    
    inline def setFilenameFunction2(value: (/* pathData */ PathData, /* assetInfo */ js.UndefOr[AssetInfo]) => String): Self = StObject.set(x, "filename", js.Any.fromFunction2(value))
    
    inline def setFilenameUndefined: Self = StObject.set(x, "filename", js.undefined)
    
    inline def setImport(value: EntryItem): Self = StObject.set(x, "import", value.asInstanceOf[js.Any])
    
    inline def setImportVarargs(value: String*): Self = StObject.set(x, "import", js.Array(value*))
    
    inline def setLayer(value: String): Self = StObject.set(x, "layer", value.asInstanceOf[js.Any])
    
    inline def setLayerNull: Self = StObject.set(x, "layer", null)
    
    inline def setLayerUndefined: Self = StObject.set(x, "layer", js.undefined)
    
    inline def setLibrary(value: LibraryOptions): Self = StObject.set(x, "library", value.asInstanceOf[js.Any])
    
    inline def setLibraryUndefined: Self = StObject.set(x, "library", js.undefined)
    
    inline def setPublicPath(
      value: String | (js.Function2[/* pathData */ PathData, /* assetInfo */ js.UndefOr[AssetInfo], String])
    ): Self = StObject.set(x, "publicPath", value.asInstanceOf[js.Any])
    
    inline def setPublicPathFunction2(value: (/* pathData */ PathData, /* assetInfo */ js.UndefOr[AssetInfo]) => String): Self = StObject.set(x, "publicPath", js.Any.fromFunction2(value))
    
    inline def setPublicPathUndefined: Self = StObject.set(x, "publicPath", js.undefined)
    
    inline def setRuntime(value: String | `false`): Self = StObject.set(x, "runtime", value.asInstanceOf[js.Any])
    
    inline def setRuntimeUndefined: Self = StObject.set(x, "runtime", js.undefined)
    
    inline def setWasmLoading(value: String | `false`): Self = StObject.set(x, "wasmLoading", value.asInstanceOf[js.Any])
    
    inline def setWasmLoadingUndefined: Self = StObject.set(x, "wasmLoading", js.undefined)
  }
}
