package typings.webpack.mod

import typings.webpack.webpackBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  name :string | undefined} & std.Omit<webpack.webpack.EntryDescriptionNormalized, 'import'> */
trait EntryOptions extends StObject {
  
  var asyncChunks: js.UndefOr[Boolean] = js.undefined
  
  var baseUri: js.UndefOr[String] = js.undefined
  
  var chunkLoading: js.UndefOr[String | `false`] = js.undefined
  
  var dependOn: js.UndefOr[js.Array[String]] = js.undefined
  
  var filename: js.UndefOr[
    String | (js.Function2[/* pathData */ PathData, /* assetInfo */ js.UndefOr[AssetInfo], String])
  ] = js.undefined
  
  var layer: js.UndefOr[Null | String] = js.undefined
  
  var library: js.UndefOr[LibraryOptions] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var publicPath: js.UndefOr[
    String | (js.Function2[/* pathData */ PathData, /* assetInfo */ js.UndefOr[AssetInfo], String])
  ] = js.undefined
  
  var runtime: js.UndefOr[String | `false`] = js.undefined
  
  var wasmLoading: js.UndefOr[String | `false`] = js.undefined
}
object EntryOptions {
  
  inline def apply(): EntryOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EntryOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EntryOptions] (val x: Self) extends AnyVal {
    
    inline def setAsyncChunks(value: Boolean): Self = StObject.set(x, "asyncChunks", value.asInstanceOf[js.Any])
    
    inline def setAsyncChunksUndefined: Self = StObject.set(x, "asyncChunks", js.undefined)
    
    inline def setBaseUri(value: String): Self = StObject.set(x, "baseUri", value.asInstanceOf[js.Any])
    
    inline def setBaseUriUndefined: Self = StObject.set(x, "baseUri", js.undefined)
    
    inline def setChunkLoading(value: String | `false`): Self = StObject.set(x, "chunkLoading", value.asInstanceOf[js.Any])
    
    inline def setChunkLoadingUndefined: Self = StObject.set(x, "chunkLoading", js.undefined)
    
    inline def setDependOn(value: js.Array[String]): Self = StObject.set(x, "dependOn", value.asInstanceOf[js.Any])
    
    inline def setDependOnUndefined: Self = StObject.set(x, "dependOn", js.undefined)
    
    inline def setDependOnVarargs(value: String*): Self = StObject.set(x, "dependOn", js.Array(value*))
    
    inline def setFilename(
      value: String | (js.Function2[/* pathData */ PathData, /* assetInfo */ js.UndefOr[AssetInfo], String])
    ): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
    
    inline def setFilenameFunction2(value: (/* pathData */ PathData, /* assetInfo */ js.UndefOr[AssetInfo]) => String): Self = StObject.set(x, "filename", js.Any.fromFunction2(value))
    
    inline def setFilenameUndefined: Self = StObject.set(x, "filename", js.undefined)
    
    inline def setLayer(value: String): Self = StObject.set(x, "layer", value.asInstanceOf[js.Any])
    
    inline def setLayerNull: Self = StObject.set(x, "layer", null)
    
    inline def setLayerUndefined: Self = StObject.set(x, "layer", js.undefined)
    
    inline def setLibrary(value: LibraryOptions): Self = StObject.set(x, "library", value.asInstanceOf[js.Any])
    
    inline def setLibraryUndefined: Self = StObject.set(x, "library", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
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
