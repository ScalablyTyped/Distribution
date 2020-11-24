package typings.tensorflowTfjsCore.typesMod

import typings.std.RequestInit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LoadOptions extends js.Object {
  
  /**
    * A function used to override the `window.fetch` function.
    */
  var fetchFunc: js.UndefOr[js.Function] = js.native
  
  /**
    * Whether the module or model is to be loaded from TF Hub.
    *
    * Setting this to `true` allows passing a TF-Hub module URL, omitting the
    * standard model file name and the query parameters.
    *
    * Default: `false`.
    */
  var fromTFHub: js.UndefOr[Boolean] = js.native
  
  /**
    * Progress callback.
    */
  var onProgress: js.UndefOr[OnProgressCallback] = js.native
  
  /**
    * RequestInit (options) for HTTP requests.
    *
    * For detailed information on the supported fields, see
    * [https://developer.mozilla.org/en-US/docs/Web/API/Request/Request](
    *     https://developer.mozilla.org/en-US/docs/Web/API/Request/Request)
    */
  var requestInit: js.UndefOr[RequestInit] = js.native
  
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
  var strict: js.UndefOr[Boolean] = js.native
  
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
  var weightPathPrefix: js.UndefOr[String] = js.native
  
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
  var weightUrlConverter: js.UndefOr[js.Function1[/* weightFileName */ String, js.Promise[String]]] = js.native
}
object LoadOptions {
  
  @scala.inline
  def apply(): LoadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LoadOptions]
  }
  
  @scala.inline
  implicit class LoadOptionsOps[Self <: LoadOptions] (val x: Self) extends AnyVal {
    
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
    def setFetchFunc(value: js.Function): Self = this.set("fetchFunc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFetchFunc: Self = this.set("fetchFunc", js.undefined)
    
    @scala.inline
    def setFromTFHub(value: Boolean): Self = this.set("fromTFHub", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFromTFHub: Self = this.set("fromTFHub", js.undefined)
    
    @scala.inline
    def setOnProgress(value: /* fraction */ Double => Unit): Self = this.set("onProgress", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnProgress: Self = this.set("onProgress", js.undefined)
    
    @scala.inline
    def setRequestInit(value: RequestInit): Self = this.set("requestInit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequestInit: Self = this.set("requestInit", js.undefined)
    
    @scala.inline
    def setStrict(value: Boolean): Self = this.set("strict", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStrict: Self = this.set("strict", js.undefined)
    
    @scala.inline
    def setWeightPathPrefix(value: String): Self = this.set("weightPathPrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWeightPathPrefix: Self = this.set("weightPathPrefix", js.undefined)
    
    @scala.inline
    def setWeightUrlConverter(value: /* weightFileName */ String => js.Promise[String]): Self = this.set("weightUrlConverter", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteWeightUrlConverter: Self = this.set("weightUrlConverter", js.undefined)
  }
}
