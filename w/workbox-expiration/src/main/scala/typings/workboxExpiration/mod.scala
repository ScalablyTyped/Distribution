package typings.workboxExpiration

import typings.workboxExpiration.cacheExpirationMod.CacheExpirationConfig
import typings.workboxExpiration.expirationPluginMod.ExpirationPluginOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * The `CacheExpiration` class allows you define an expiration and / or
    * limit on the number of responses stored in a
    * [`Cache`](https://developer.mozilla.org/en-US/docs/Web/API/Cache).
    *
    * @memberof workbox-expiration
    */
  @JSImport("workbox-expiration", "CacheExpiration")
  @js.native
  open class CacheExpiration protected ()
    extends typings.workboxExpiration.cacheExpirationMod.CacheExpiration {
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
  }
  
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
  @JSImport("workbox-expiration", "ExpirationPlugin")
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
    extends typings.workboxExpiration.expirationPluginMod.ExpirationPlugin {
    def this(config: ExpirationPluginOptions) = this()
  }
}
