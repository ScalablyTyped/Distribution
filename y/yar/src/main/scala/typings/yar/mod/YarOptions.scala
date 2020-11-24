package typings.yar.mod

import typings.hapi.mod.CachePolicyOptions
import typings.yar.anon.ClearInvalid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait YarOptions extends js.Object {
  
  /**
    * hapi cache options which includes (among other options):
    */
  var cache: js.UndefOr[CachePolicyOptions[_]] = js.native
  
  /**
    * the configuration for cookie-specific features:
    */
  var cookieOptions: ClearInvalid = js.native
  
  /**
    * will cause yar to throw an exception if trying to persist to cache when the cache is unavailable.
    * Setting this to false will allow applications using yar to run uninterrupted if the cache is not ready (however sessions will not be saving).
    * Defaults to true.
    */
  var errorOnCacheNotReady: js.UndefOr[Boolean] = js.native
  
  /**
    * maximum cookie size before using server-side storage.
    * Defaults to 1K. Set to zero to always use server-side storage.
    */
  var maxCookieSize: js.UndefOr[Double] = js.native
  
  /**
    * Determines the name of the cookie used to store session information.
    * Defaults to session.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * determines whether to store empty session before they've been modified.
    * Defaults to true.
    */
  var storeBlank: js.UndefOr[Boolean] = js.native
}
object YarOptions {
  
  @scala.inline
  def apply(cookieOptions: ClearInvalid): YarOptions = {
    val __obj = js.Dynamic.literal(cookieOptions = cookieOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[YarOptions]
  }
  
  @scala.inline
  implicit class YarOptionsOps[Self <: YarOptions] (val x: Self) extends AnyVal {
    
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
    def setCookieOptions(value: ClearInvalid): Self = this.set("cookieOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCache(value: CachePolicyOptions[_]): Self = this.set("cache", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCache: Self = this.set("cache", js.undefined)
    
    @scala.inline
    def setErrorOnCacheNotReady(value: Boolean): Self = this.set("errorOnCacheNotReady", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErrorOnCacheNotReady: Self = this.set("errorOnCacheNotReady", js.undefined)
    
    @scala.inline
    def setMaxCookieSize(value: Double): Self = this.set("maxCookieSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxCookieSize: Self = this.set("maxCookieSize", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setStoreBlank(value: Boolean): Self = this.set("storeBlank", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStoreBlank: Self = this.set("storeBlank", js.undefined)
  }
}
