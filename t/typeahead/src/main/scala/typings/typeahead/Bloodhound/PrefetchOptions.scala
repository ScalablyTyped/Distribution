package typings.typeahead.Bloodhound

import typings.jquery.JQueryAjaxSettings
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Prefetched data is fetched and processed on initialization. If the browser
  * supports local storage, the processed data will be cached there to prevent
  * additional network requests on subsequent page loads.
  *
  * WARNING: While it's possible to get away with it for smaller data sets,
  * prefetched data isn't meant to contain entire sets of data. Rather, it should
  * act as a first-level cache. Ignoring this warning means you'll run the risk
  * of hitting local storage limits.
  */
@js.native
trait PrefetchOptions[T] extends js.Object {
  
  /**
    * If false, will not attempt to read or write to local storage and
    * will always load prefetch data from url on initialization. Defaults to true.
    */
  var cache: js.UndefOr[Boolean] = js.native
  
  /**
    * The key that data will be stored in local storage under.
    * Defaults to value of url.
    */
  var cacheKey: js.UndefOr[String] = js.native
  
  /**
    * A function that provides a hook to allow you to prepare the settings
    * object passed to transport when a request is about to be made.
    * Defaults to the identity function.
    *
    * @param settings The default settings object created internally by the Bloodhound instance.
    * @returns A settings object.
    */
  var prepare: js.UndefOr[js.Function1[/* settings */ JQueryAjaxSettings, JQueryAjaxSettings]] = js.native
  
  /**
    * A string used for thumbprinting prefetched data. If this doesn't
    * match what's stored in local storage, the data will be refetched.
    */
  var thumbprint: js.UndefOr[String] = js.native
  
  /**
    * A function with the signature transform(response) that allows you to
    * transform the prefetch response before the Bloodhound instance operates
    * on it. Defaults to the identity function.
    *
    * @param response Prefetch response.
    * @returns Transform response.
    */
  var transform: js.UndefOr[js.Function1[/* response */ T, T]] = js.native
  
  /**
    * The time (in milliseconds) the prefetched data should be cached in
    * local storage. Defaults to 86400000 (1 day).
    */
  var ttl: js.UndefOr[Double] = js.native
  
  /**
    * The URL prefetch data should be loaded from.
    */
  var url: String = js.native
}
object PrefetchOptions {
  
  @scala.inline
  def apply[T](url: String): PrefetchOptions[T] = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrefetchOptions[T]]
  }
  
  @scala.inline
  implicit class PrefetchOptionsOps[Self <: PrefetchOptions[_], T] (val x: Self with PrefetchOptions[T]) extends AnyVal {
    
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
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCache(value: Boolean): Self = this.set("cache", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCache: Self = this.set("cache", js.undefined)
    
    @scala.inline
    def setCacheKey(value: String): Self = this.set("cacheKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCacheKey: Self = this.set("cacheKey", js.undefined)
    
    @scala.inline
    def setPrepare(value: /* settings */ JQueryAjaxSettings => JQueryAjaxSettings): Self = this.set("prepare", js.Any.fromFunction1(value))
    
    @scala.inline
    def deletePrepare: Self = this.set("prepare", js.undefined)
    
    @scala.inline
    def setThumbprint(value: String): Self = this.set("thumbprint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThumbprint: Self = this.set("thumbprint", js.undefined)
    
    @scala.inline
    def setTransform(value: /* response */ T => T): Self = this.set("transform", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteTransform: Self = this.set("transform", js.undefined)
    
    @scala.inline
    def setTtl(value: Double): Self = this.set("ttl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTtl: Self = this.set("ttl", js.undefined)
  }
}
