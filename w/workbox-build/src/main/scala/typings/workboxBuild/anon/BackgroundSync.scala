package typings.workboxBuild.anon

import typings.std.CacheQueryOptions
import typings.std.RequestInit
import typings.workboxCacheableResponse.cacheableResponseMod.CacheableResponseOptions
import typings.workboxCore.typesMod.WorkboxPlugin
import typings.workboxExpiration.expirationPluginMod.ExpirationPluginOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BackgroundSync extends StObject {
  
  /**
    * Configuring this will add a
    * {@link workbox-background-sync.BackgroundSyncPlugin} instance to the
    * {@link workbox-strategies} configured in `handler`.
    */
  var backgroundSync: js.UndefOr[Name] = js.undefined
  
  /**
    * Configuring this will add a
    * {@link workbox-broadcast-update.BroadcastUpdatePlugin} instance to the
    * {@link workbox-strategies} configured in `handler`.
    */
  var broadcastUpdate: js.UndefOr[ChannelName] = js.undefined
  
  /**
    * If provided, this will set the `cacheName` property of the
    * {@link workbox-strategies} configured in `handler`.
    */
  var cacheName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Configuring this will add a
    * {@link workbox-cacheable-response.CacheableResponsePlugin} instance to
    * the {@link workbox-strategies} configured in `handler`.
    */
  var cacheableResponse: js.UndefOr[CacheableResponseOptions] = js.undefined
  
  /**
    * Configuring this will add a
    * {@link workbox-expiration.ExpirationPlugin} instance to
    * the {@link workbox-strategies} configured in `handler`.
    */
  var expiration: js.UndefOr[ExpirationPluginOptions] = js.undefined
  
  /**
    * Configuring this will pass along the `fetchOptions` value to
    * the {@link workbox-strategies} configured in `handler`.
    */
  var fetchOptions: js.UndefOr[RequestInit] = js.undefined
  
  /**
    * Configuring this will pass along the `matchOptions` value to
    * the {@link workbox-strategies} configured in `handler`.
    */
  var matchOptions: js.UndefOr[CacheQueryOptions] = js.undefined
  
  /**
    * If provided, this will set the `networkTimeoutSeconds` property of the
    * {@link workbox-strategies} configured in `handler`. Note that only
    * `'NetworkFirst'` and `'NetworkOnly'` support `networkTimeoutSeconds`.
    */
  var networkTimeoutSeconds: js.UndefOr[Double] = js.undefined
  
  /**
    * Configuring this allows the use of one or more Workbox plugins that
    * don't have "shortcut" options (like `expiration` for
    * {@link workbox-expiration.ExpirationPlugin}). The plugins provided here
    * will be added to the {@link workbox-strategies} configured in `handler`.
    */
  var plugins: js.UndefOr[js.Array[WorkboxPlugin]] = js.undefined
  
  /**
    * Configuring this will add a
    * {@link workbox-precaching.PrecacheFallbackPlugin} instance to
    * the {@link workbox-strategies} configured in `handler`.
    */
  var precacheFallback: js.UndefOr[FallbackURL] = js.undefined
  
  /**
    * Enabling this will add a
    * {@link workbox-range-requests.RangeRequestsPlugin} instance to
    * the {@link workbox-strategies} configured in `handler`.
    */
  var rangeRequests: js.UndefOr[Boolean] = js.undefined
}
object BackgroundSync {
  
  inline def apply(): BackgroundSync = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BackgroundSync]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BackgroundSync] (val x: Self) extends AnyVal {
    
    inline def setBackgroundSync(value: Name): Self = StObject.set(x, "backgroundSync", value.asInstanceOf[js.Any])
    
    inline def setBackgroundSyncUndefined: Self = StObject.set(x, "backgroundSync", js.undefined)
    
    inline def setBroadcastUpdate(value: ChannelName): Self = StObject.set(x, "broadcastUpdate", value.asInstanceOf[js.Any])
    
    inline def setBroadcastUpdateUndefined: Self = StObject.set(x, "broadcastUpdate", js.undefined)
    
    inline def setCacheName(value: String): Self = StObject.set(x, "cacheName", value.asInstanceOf[js.Any])
    
    inline def setCacheNameNull: Self = StObject.set(x, "cacheName", null)
    
    inline def setCacheNameUndefined: Self = StObject.set(x, "cacheName", js.undefined)
    
    inline def setCacheableResponse(value: CacheableResponseOptions): Self = StObject.set(x, "cacheableResponse", value.asInstanceOf[js.Any])
    
    inline def setCacheableResponseUndefined: Self = StObject.set(x, "cacheableResponse", js.undefined)
    
    inline def setExpiration(value: ExpirationPluginOptions): Self = StObject.set(x, "expiration", value.asInstanceOf[js.Any])
    
    inline def setExpirationUndefined: Self = StObject.set(x, "expiration", js.undefined)
    
    inline def setFetchOptions(value: RequestInit): Self = StObject.set(x, "fetchOptions", value.asInstanceOf[js.Any])
    
    inline def setFetchOptionsUndefined: Self = StObject.set(x, "fetchOptions", js.undefined)
    
    inline def setMatchOptions(value: CacheQueryOptions): Self = StObject.set(x, "matchOptions", value.asInstanceOf[js.Any])
    
    inline def setMatchOptionsUndefined: Self = StObject.set(x, "matchOptions", js.undefined)
    
    inline def setNetworkTimeoutSeconds(value: Double): Self = StObject.set(x, "networkTimeoutSeconds", value.asInstanceOf[js.Any])
    
    inline def setNetworkTimeoutSecondsUndefined: Self = StObject.set(x, "networkTimeoutSeconds", js.undefined)
    
    inline def setPlugins(value: js.Array[WorkboxPlugin]): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
    
    inline def setPluginsUndefined: Self = StObject.set(x, "plugins", js.undefined)
    
    inline def setPluginsVarargs(value: WorkboxPlugin*): Self = StObject.set(x, "plugins", js.Array(value*))
    
    inline def setPrecacheFallback(value: FallbackURL): Self = StObject.set(x, "precacheFallback", value.asInstanceOf[js.Any])
    
    inline def setPrecacheFallbackUndefined: Self = StObject.set(x, "precacheFallback", js.undefined)
    
    inline def setRangeRequests(value: Boolean): Self = StObject.set(x, "rangeRequests", value.asInstanceOf[js.Any])
    
    inline def setRangeRequestsUndefined: Self = StObject.set(x, "rangeRequests", js.undefined)
  }
}
