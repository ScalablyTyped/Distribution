package typings.workboxWebpackPlugin.mod

import typings.workboxWebpackPlugin.anon.ChannelName
import typings.workboxWebpackPlugin.anon.Headers
import typings.workboxWebpackPlugin.anon.MaxAgeSeconds
import typings.workboxWebpackPlugin.anon.Name
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RuntimeCacheOptions extends js.Object {
  
  /**
    * Configure background sync.
    */
  var backgroundSync: js.UndefOr[Name] = js.native
  
  /**
    * Configure the broadcast cache update plugin.
    */
  var broadcastUpdate: js.UndefOr[ChannelName] = js.native
  
  /**
    * A custom cache name for this route.
    */
  var cacheName: js.UndefOr[String] = js.native
  
  /**
    * Configure which responses are considered cacheable.
    */
  var cacheableResponse: js.UndefOr[Headers] = js.native
  
  /**
    * Custom cache expiration.
    */
  var expiration: js.UndefOr[MaxAgeSeconds] = js.native
  
  /**
    * Used to configure the handler.
    */
  var fetchOptions: js.UndefOr[js.Any] = js.native
  
  /**
    * Used to configure the handler.
    */
  var matchOptions: js.UndefOr[js.Any] = js.native
  
  /**
    * Fall back to the cache after X seconds.
    */
  var networkTimeoutSeconds: js.UndefOr[Double] = js.native
  
  /**
    * Add in any additional plugin logic you need.
    */
  var plugins: js.UndefOr[js.Array[_]] = js.native
}
object RuntimeCacheOptions {
  
  @scala.inline
  def apply(): RuntimeCacheOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RuntimeCacheOptions]
  }
  
  @scala.inline
  implicit class RuntimeCacheOptionsOps[Self <: RuntimeCacheOptions] (val x: Self) extends AnyVal {
    
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
    def setBackgroundSync(value: Name): Self = this.set("backgroundSync", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackgroundSync: Self = this.set("backgroundSync", js.undefined)
    
    @scala.inline
    def setBroadcastUpdate(value: ChannelName): Self = this.set("broadcastUpdate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBroadcastUpdate: Self = this.set("broadcastUpdate", js.undefined)
    
    @scala.inline
    def setCacheName(value: String): Self = this.set("cacheName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCacheName: Self = this.set("cacheName", js.undefined)
    
    @scala.inline
    def setCacheableResponse(value: Headers): Self = this.set("cacheableResponse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCacheableResponse: Self = this.set("cacheableResponse", js.undefined)
    
    @scala.inline
    def setExpiration(value: MaxAgeSeconds): Self = this.set("expiration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpiration: Self = this.set("expiration", js.undefined)
    
    @scala.inline
    def setFetchOptions(value: js.Any): Self = this.set("fetchOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFetchOptions: Self = this.set("fetchOptions", js.undefined)
    
    @scala.inline
    def setMatchOptions(value: js.Any): Self = this.set("matchOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMatchOptions: Self = this.set("matchOptions", js.undefined)
    
    @scala.inline
    def setNetworkTimeoutSeconds(value: Double): Self = this.set("networkTimeoutSeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNetworkTimeoutSeconds: Self = this.set("networkTimeoutSeconds", js.undefined)
    
    @scala.inline
    def setPluginsVarargs(value: js.Any*): Self = this.set("plugins", js.Array(value :_*))
    
    @scala.inline
    def setPlugins(value: js.Array[_]): Self = this.set("plugins", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlugins: Self = this.set("plugins", js.undefined)
  }
}
