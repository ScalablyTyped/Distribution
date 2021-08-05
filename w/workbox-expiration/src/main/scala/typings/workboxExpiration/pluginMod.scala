package typings.workboxExpiration

import typings.std.Response
import typings.workboxCore.workboxPluginMod.CacheDidUpdateCallback
import typings.workboxCore.workboxPluginMod.CacheDidUpdateCallbackParam
import typings.workboxCore.workboxPluginMod.CachedResponseWillBeUsedCallback
import typings.workboxCore.workboxPluginMod.CachedResponseWillBeUsedCallbackParam
import typings.workboxCore.workboxPluginMod.WorkboxPlugin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pluginMod {
  
  @JSImport("workbox-expiration/Plugin", "Plugin")
  @js.native
  class Plugin ()
    extends StObject
       with WorkboxPlugin {
    def this(config: ExpirationPluginConfig) = this()
    
    @JSName("cacheDidUpdate")
    def cacheDidUpdate_MPlugin(param: CacheDidUpdateCallbackParam): js.Promise[Unit] = js.native
    @JSName("cacheDidUpdate")
    var cacheDidUpdate_Original: CacheDidUpdateCallback = js.native
    
    @JSName("cachedResponseWillBeUsed")
    def cachedResponseWillBeUsed_MPlugin(param: CachedResponseWillBeUsedCallbackParam): js.Promise[js.UndefOr[Response]] = js.native
    @JSName("cachedResponseWillBeUsed")
    var cachedResponseWillBeUsed_Original: CachedResponseWillBeUsedCallback = js.native
    
    def deleteCacheAndMetadata(): js.Promise[Unit] = js.native
  }
  
  trait ExpirationPluginConfig extends StObject {
    
    var maxAgeSeconds: js.UndefOr[Double] = js.undefined
    
    var maxEntries: js.UndefOr[Double] = js.undefined
    
    var purgeOnQuotaError: js.UndefOr[Boolean] = js.undefined
  }
  object ExpirationPluginConfig {
    
    inline def apply(): ExpirationPluginConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ExpirationPluginConfig]
    }
    
    extension [Self <: ExpirationPluginConfig](x: Self) {
      
      inline def setMaxAgeSeconds(value: Double): Self = StObject.set(x, "maxAgeSeconds", value.asInstanceOf[js.Any])
      
      inline def setMaxAgeSecondsUndefined: Self = StObject.set(x, "maxAgeSeconds", js.undefined)
      
      inline def setMaxEntries(value: Double): Self = StObject.set(x, "maxEntries", value.asInstanceOf[js.Any])
      
      inline def setMaxEntriesUndefined: Self = StObject.set(x, "maxEntries", js.undefined)
      
      inline def setPurgeOnQuotaError(value: Boolean): Self = StObject.set(x, "purgeOnQuotaError", value.asInstanceOf[js.Any])
      
      inline def setPurgeOnQuotaErrorUndefined: Self = StObject.set(x, "purgeOnQuotaError", js.undefined)
    }
  }
}
