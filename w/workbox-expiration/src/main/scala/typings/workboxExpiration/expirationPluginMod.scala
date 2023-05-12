package typings.workboxExpiration

import typings.std.CacheQueryOptions
import typings.workboxCore.typesMod.WorkboxPlugin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object expirationPluginMod {
  
  /**
    * This plugin can be used in a `workbox-strategy` to regularly enforce a
    * limit on the age and / or the number of cached requests.
    *
    * It can only be used with `workbox-strategy` instances that have a
    * [custom `cacheName` property set](/web/tools/workbox/guides/configure-workbox#custom_cache_names_in_strategies).
    * In other words, it can't be used to expire entries in strategy that uses the
    * default runtime cache name.
    *
    * Whenever a cached response is used or updated, this plugin will look
    * at the associated cache and remove any old or extra responses.
    *
    * When using `maxAgeSeconds`, responses may be used *once* after expiring
    * because the expiration clean up will not have occurred until *after* the
    * cached response has been used. If the response has a "Date" header, then
    * a light weight expiration check is performed and the response will not be
    * used immediately.
    *
    * When using `maxEntries`, the entry least-recently requested will be removed
    * from the cache first.
    *
    * @memberof workbox-expiration
    */
  @JSImport("workbox-expiration/ExpirationPlugin", "ExpirationPlugin")
  @js.native
  /**
    * @param {ExpirationPluginOptions} config
    * @param {number} [config.maxEntries] The maximum number of entries to cache.
    * Entries used the least will be removed as the maximum is reached.
    * @param {number} [config.maxAgeSeconds] The maximum age of an entry before
    * it's treated as stale and removed.
    * @param {Object} [config.matchOptions] The [`CacheQueryOptions`](https://developer.mozilla.org/en-US/docs/Web/API/Cache/delete#Parameters)
    * that will be used when calling `delete()` on the cache.
    * @param {boolean} [config.purgeOnQuotaError] Whether to opt this cache in to
    * automatic deletion if the available storage quota has been exceeded.
    */
  open class ExpirationPlugin ()
    extends StObject
       with WorkboxPlugin {
    def this(config: ExpirationPluginOptions) = this()
    
    /* private */ var _cacheExpirations: Any = js.native
    
    /* private */ val _config: Any = js.native
    
    /**
      * A simple helper method to return a CacheExpiration instance for a given
      * cache name.
      *
      * @param {string} cacheName
      * @return {CacheExpiration}
      *
      * @private
      */
    /* private */ var _getCacheExpiration: Any = js.native
    
    /**
      * This method will extract the data header and parse it into a useful
      * value.
      *
      * @param {Response} cachedResponse
      * @return {number|null}
      *
      * @private
      */
    /* private */ var _getDateHeaderTimestamp: Any = js.native
    
    /**
      * @param {Response} cachedResponse
      * @return {boolean}
      *
      * @private
      */
    /* private */ var _isResponseDateFresh: Any = js.native
    
    /* private */ val _maxAgeSeconds: Any = js.native
    
    /**
      * This is a helper method that performs two operations:
      *
      * - Deletes *all* the underlying Cache instances associated with this plugin
      * instance, by calling caches.delete() on your behalf.
      * - Deletes the metadata from IndexedDB used to keep track of expiration
      * details for each Cache instance.
      *
      * When using cache expiration, calling this method is preferable to calling
      * `caches.delete()` directly, since this will ensure that the IndexedDB
      * metadata is also cleanly removed and open IndexedDB instances are deleted.
      *
      * Note that if you're *not* using cache expiration for a given cache, calling
      * `caches.delete()` and passing in the cache's name should be sufficient.
      * There is no Workbox-specific method needed for cleanup in that case.
      */
    def deleteCacheAndMetadata(): js.Promise[Unit] = js.native
  }
  
  trait ExpirationPluginOptions extends StObject {
    
    var matchOptions: js.UndefOr[CacheQueryOptions] = js.undefined
    
    var maxAgeSeconds: js.UndefOr[Double] = js.undefined
    
    var maxEntries: js.UndefOr[Double] = js.undefined
    
    var purgeOnQuotaError: js.UndefOr[Boolean] = js.undefined
  }
  object ExpirationPluginOptions {
    
    inline def apply(): ExpirationPluginOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ExpirationPluginOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ExpirationPluginOptions] (val x: Self) extends AnyVal {
      
      inline def setMatchOptions(value: CacheQueryOptions): Self = StObject.set(x, "matchOptions", value.asInstanceOf[js.Any])
      
      inline def setMatchOptionsUndefined: Self = StObject.set(x, "matchOptions", js.undefined)
      
      inline def setMaxAgeSeconds(value: Double): Self = StObject.set(x, "maxAgeSeconds", value.asInstanceOf[js.Any])
      
      inline def setMaxAgeSecondsUndefined: Self = StObject.set(x, "maxAgeSeconds", js.undefined)
      
      inline def setMaxEntries(value: Double): Self = StObject.set(x, "maxEntries", value.asInstanceOf[js.Any])
      
      inline def setMaxEntriesUndefined: Self = StObject.set(x, "maxEntries", js.undefined)
      
      inline def setPurgeOnQuotaError(value: Boolean): Self = StObject.set(x, "purgeOnQuotaError", value.asInstanceOf[js.Any])
      
      inline def setPurgeOnQuotaErrorUndefined: Self = StObject.set(x, "purgeOnQuotaError", js.undefined)
    }
  }
}
