package typings.workboxExpiration

import typings.std.CacheQueryOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cacheExpirationMod {
  
  /**
    * The `CacheExpiration` class allows you define an expiration and / or
    * limit on the number of responses stored in a
    * [`Cache`](https://developer.mozilla.org/en-US/docs/Web/API/Cache).
    *
    * @memberof workbox-expiration
    */
  @JSImport("workbox-expiration/CacheExpiration", "CacheExpiration")
  @js.native
  open class CacheExpiration protected () extends StObject {
    /**
      * To construct a new CacheExpiration instance you must provide at least
      * one of the `config` properties.
      *
      * @param {string} cacheName Name of the cache to apply restrictions to.
      * @param {Object} config
      * @param {number} [config.maxEntries] The maximum number of entries to cache.
      * Entries used the least will be removed as the maximum is reached.
      * @param {number} [config.maxAgeSeconds] The maximum age of an entry before
      * it's treated as stale and removed.
      * @param {Object} [config.matchOptions] The [`CacheQueryOptions`](https://developer.mozilla.org/en-US/docs/Web/API/Cache/delete#Parameters)
      * that will be used when calling `delete()` on the cache.
      */
    def this(cacheName: String) = this()
    def this(cacheName: String, config: CacheExpirationConfig) = this()
    
    /* private */ val _cacheName: Any = js.native
    
    /* private */ var _isRunning: Any = js.native
    
    /* private */ val _matchOptions: Any = js.native
    
    /* private */ val _maxAgeSeconds: Any = js.native
    
    /* private */ val _maxEntries: Any = js.native
    
    /* private */ var _rerunRequested: Any = js.native
    
    /* private */ val _timestampModel: Any = js.native
    
    /**
      * Removes the IndexedDB object store used to keep track of cache expiration
      * metadata.
      */
    def delete(): js.Promise[Unit] = js.native
    
    /**
      * Expires entries for the given cache and given criteria.
      */
    def expireEntries(): js.Promise[Unit] = js.native
    
    /**
      * Can be used to check if a URL has expired or not before it's used.
      *
      * This requires a look up from IndexedDB, so can be slow.
      *
      * Note: This method will not remove the cached entry, call
      * `expireEntries()` to remove indexedDB and Cache entries.
      *
      * @param {string} url
      * @return {boolean}
      */
    def isURLExpired(url: String): js.Promise[Boolean] = js.native
    
    /**
      * Update the timestamp for the given URL. This ensures the when
      * removing entries based on maximum entries, most recently used
      * is accurate or when expiring, the timestamp is up-to-date.
      *
      * @param {string} url
      */
    def updateTimestamp(url: String): js.Promise[Unit] = js.native
  }
  
  trait CacheExpirationConfig extends StObject {
    
    var matchOptions: js.UndefOr[CacheQueryOptions] = js.undefined
    
    var maxAgeSeconds: js.UndefOr[Double] = js.undefined
    
    var maxEntries: js.UndefOr[Double] = js.undefined
  }
  object CacheExpirationConfig {
    
    inline def apply(): CacheExpirationConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CacheExpirationConfig]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CacheExpirationConfig] (val x: Self) extends AnyVal {
      
      inline def setMatchOptions(value: CacheQueryOptions): Self = StObject.set(x, "matchOptions", value.asInstanceOf[js.Any])
      
      inline def setMatchOptionsUndefined: Self = StObject.set(x, "matchOptions", js.undefined)
      
      inline def setMaxAgeSeconds(value: Double): Self = StObject.set(x, "maxAgeSeconds", value.asInstanceOf[js.Any])
      
      inline def setMaxAgeSecondsUndefined: Self = StObject.set(x, "maxAgeSeconds", js.undefined)
      
      inline def setMaxEntries(value: Double): Self = StObject.set(x, "maxEntries", value.asInstanceOf[js.Any])
      
      inline def setMaxEntriesUndefined: Self = StObject.set(x, "maxEntries", js.undefined)
    }
  }
}
