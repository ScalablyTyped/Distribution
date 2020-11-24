package typings.typeahead.Bloodhound

import typings.jquery.JQueryAjaxSettings
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Bloodhound only goes to the network when the internal search engine cannot
  * provide a sufficient number of results. In order to prevent an obscene
  * number of requests being made to the remote endpoint, requests are rate-limited.
  */
@js.native
trait RemoteOptions[T] extends js.Object {
  
  /**
    * DEPRECATED: transform the remote response before the Bloodhound instance operates on it.
    * */
  var filter: js.UndefOr[js.Function1[/* response */ T, T]] = js.native
  
  /**
    * A function that provides a hook to allow you to prepare the settings
    * object passed to transport when a request is about to be made.
    * The function signature should be prepare(query, settings), where query
    * is the query #search was called with and settings is the default settings
    * object created internally by the Bloodhound instance. The prepare function
    * should return a settings object. Defaults to the identity function.
    *
    * @param query The query #search was called with.
    * @param settings The default settings object created internally by Bloodhound.
    * @returns A JqueryAjaxSettings object.
    */
  var prepare: js.UndefOr[
    js.Function2[/* query */ String, /* settings */ JQueryAjaxSettings, JQueryAjaxSettings]
  ] = js.native
  
  /**
    * The time interval in milliseconds that will be used by rateLimitBy.
    * Defaults to 300.
    */
  var rateLimitWait: js.UndefOr[Double] = js.native
  
  /**
    * The method used to rate-limit network requests.
    * Can be either debounce or throttle. Defaults to debounce.
    */
  var rateLimitby: js.UndefOr[String] = js.native
  
  /**
    * A function with the signature transform(response) that allows you to
    * transform the remote response before the Bloodhound instance operates on it.
    * Defaults to the identity function.
    *
    * @param response Prefetch response.
    * @returns Transform response.
    */
  var transform: js.UndefOr[js.Function1[/* response */ T, T]] = js.native
  
  /**
    * The URL remote data should be loaded from.
    */
  var url: String = js.native
  
  /**
    * A convenience option for prepare. If set, prepare will be a function
    * that replaces the value of this option in url with the URI encoded query.
    */
  var wildcard: js.UndefOr[String] = js.native
}
object RemoteOptions {
  
  @scala.inline
  def apply[T](url: String): RemoteOptions[T] = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoteOptions[T]]
  }
  
  @scala.inline
  implicit class RemoteOptionsOps[Self <: RemoteOptions[_], T] (val x: Self with RemoteOptions[T]) extends AnyVal {
    
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
    def setFilter(value: /* response */ T => T): Self = this.set("filter", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteFilter: Self = this.set("filter", js.undefined)
    
    @scala.inline
    def setPrepare(value: (/* query */ String, /* settings */ JQueryAjaxSettings) => JQueryAjaxSettings): Self = this.set("prepare", js.Any.fromFunction2(value))
    
    @scala.inline
    def deletePrepare: Self = this.set("prepare", js.undefined)
    
    @scala.inline
    def setRateLimitWait(value: Double): Self = this.set("rateLimitWait", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRateLimitWait: Self = this.set("rateLimitWait", js.undefined)
    
    @scala.inline
    def setRateLimitby(value: String): Self = this.set("rateLimitby", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRateLimitby: Self = this.set("rateLimitby", js.undefined)
    
    @scala.inline
    def setTransform(value: /* response */ T => T): Self = this.set("transform", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteTransform: Self = this.set("transform", js.undefined)
    
    @scala.inline
    def setWildcard(value: String): Self = this.set("wildcard", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWildcard: Self = this.set("wildcard", js.undefined)
  }
}
