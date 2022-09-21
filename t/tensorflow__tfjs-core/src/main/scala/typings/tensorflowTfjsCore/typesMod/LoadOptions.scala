package typings.tensorflowTfjsCore.typesMod

import typings.std.RequestInit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LoadOptions extends StObject {
  
  /**
    * A function used to override the `window.fetch` function.
    */
  var fetchFunc: js.UndefOr[js.Function] = js.undefined
  
  /**
    * Whether the module or model is to be loaded from TF Hub.
    *
    * Setting this to `true` allows passing a TF-Hub module URL, omitting the
    * standard model file name and the query parameters.
    *
    * Default: `false`.
    */
  var fromTFHub: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Progress callback.
    */
  var onProgress: js.UndefOr[OnProgressCallback] = js.undefined
  
  /**
    * RequestInit (options) for HTTP requests.
    *
    * For detailed information on the supported fields, see
    * [https://developer.mozilla.org/en-US/docs/Web/API/Request/Request](
    *     https://developer.mozilla.org/en-US/docs/Web/API/Request/Request)
    */
  var requestInit: js.UndefOr[RequestInit] = js.undefined
  
  /**
    * Strict loading model: whether extraneous weights or missing
    * weights should trigger an `Error`.
    *
    * If `true`, require that the provided weights exactly match those
    * required by the layers. `false` means that both extra weights
    * and missing weights will be silently ignored.
    *
    * Default: `true`.
    */
  var strict: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Path prefix for weight files, by default this is calculated from the
    * path of the model JSON file.
    *
    * For instance, if the path to the model JSON file is
    * `http://localhost/foo/model.json`, then the default path prefix will be
    * `http://localhost/foo/`. If a weight file has the path value
    * `group1-shard1of2` in the weight manifest, then the weight file will be
    * loaded from `http://localhost/foo/group1-shard1of2` by default. However,
    * if you provide a `weightPathPrefix` value of
    * `http://localhost/foo/alt-weights`, then the weight file will be loaded
    * from the path `http://localhost/foo/alt-weights/group1-shard1of2` instead.
    */
  var weightPathPrefix: js.UndefOr[String] = js.undefined
  
  /**
    * An async function to convert weight file name to URL. The weight file
    * names are stored in model.json's weightsManifest.paths field. By default we
    * consider weight files are colocated with the model.json file. For example:
    *     model.json URL: https://www.google.com/models/1/model.json
    *     group1-shard1of1.bin url:
    *        https://www.google.com/models/1/group1-shard1of1.bin
    *
    * With this func you can convert the weight file name to any URL.
    */
  var weightUrlConverter: js.UndefOr[js.Function1[/* weightFileName */ String, js.Promise[String]]] = js.undefined
}
object LoadOptions {
  
  inline def apply(): LoadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LoadOptions]
  }
  
  extension [Self <: LoadOptions](x: Self) {
    
    inline def setFetchFunc(value: js.Function): Self = StObject.set(x, "fetchFunc", value.asInstanceOf[js.Any])
    
    inline def setFetchFuncUndefined: Self = StObject.set(x, "fetchFunc", js.undefined)
    
    inline def setFromTFHub(value: Boolean): Self = StObject.set(x, "fromTFHub", value.asInstanceOf[js.Any])
    
    inline def setFromTFHubUndefined: Self = StObject.set(x, "fromTFHub", js.undefined)
    
    inline def setOnProgress(value: /* fraction */ Double => Unit): Self = StObject.set(x, "onProgress", js.Any.fromFunction1(value))
    
    inline def setOnProgressUndefined: Self = StObject.set(x, "onProgress", js.undefined)
    
    inline def setRequestInit(value: RequestInit): Self = StObject.set(x, "requestInit", value.asInstanceOf[js.Any])
    
    inline def setRequestInitUndefined: Self = StObject.set(x, "requestInit", js.undefined)
    
    inline def setStrict(value: Boolean): Self = StObject.set(x, "strict", value.asInstanceOf[js.Any])
    
    inline def setStrictUndefined: Self = StObject.set(x, "strict", js.undefined)
    
    inline def setWeightPathPrefix(value: String): Self = StObject.set(x, "weightPathPrefix", value.asInstanceOf[js.Any])
    
    inline def setWeightPathPrefixUndefined: Self = StObject.set(x, "weightPathPrefix", js.undefined)
    
    inline def setWeightUrlConverter(value: /* weightFileName */ String => js.Promise[String]): Self = StObject.set(x, "weightUrlConverter", js.Any.fromFunction1(value))
    
    inline def setWeightUrlConverterUndefined: Self = StObject.set(x, "weightUrlConverter", js.undefined)
  }
}
