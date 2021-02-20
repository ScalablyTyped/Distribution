package typings.workboxExpiration

import typings.std.Response
import typings.workboxCore.workboxPluginMod.CacheDidUpdateCallback
import typings.workboxCore.workboxPluginMod.CacheDidUpdateCallbackParam
import typings.workboxCore.workboxPluginMod.CachedResponseWillBeUsedCallback
import typings.workboxCore.workboxPluginMod.CachedResponseWillBeUsedCallbackParam
import typings.workboxCore.workboxPluginMod.WorkboxPlugin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pluginMod {
  
  @JSImport("workbox-expiration/Plugin", "Plugin")
  @js.native
  class Plugin () extends WorkboxPlugin {
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
  
  @js.native
  trait ExpirationPluginConfig extends StObject {
    
    var maxAgeSeconds: js.UndefOr[Double] = js.native
    
    var maxEntries: js.UndefOr[Double] = js.native
    
    var purgeOnQuotaError: js.UndefOr[Boolean] = js.native
  }
  object ExpirationPluginConfig {
    
    @scala.inline
    def apply(): ExpirationPluginConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ExpirationPluginConfig]
    }
    
    @scala.inline
    implicit class ExpirationPluginConfigMutableBuilder[Self <: ExpirationPluginConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMaxAgeSeconds(value: Double): Self = StObject.set(x, "maxAgeSeconds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxAgeSecondsUndefined: Self = StObject.set(x, "maxAgeSeconds", js.undefined)
      
      @scala.inline
      def setMaxEntries(value: Double): Self = StObject.set(x, "maxEntries", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxEntriesUndefined: Self = StObject.set(x, "maxEntries", js.undefined)
      
      @scala.inline
      def setPurgeOnQuotaError(value: Boolean): Self = StObject.set(x, "purgeOnQuotaError", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPurgeOnQuotaErrorUndefined: Self = StObject.set(x, "purgeOnQuotaError", js.undefined)
    }
  }
}
