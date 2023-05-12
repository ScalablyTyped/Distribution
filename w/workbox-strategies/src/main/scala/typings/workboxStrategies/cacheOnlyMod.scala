package typings.workboxStrategies

import typings.workboxStrategies.strategyMod.Strategy
import typings.workboxStrategies.strategyMod.StrategyOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cacheOnlyMod {
  
  /**
    * An implementation of a [cache-only](https://developer.chrome.com/docs/workbox/caching-strategies-overview/#cache-only)
    * request strategy.
    *
    * This class is useful if you want to take advantage of any
    * [Workbox plugins](https://developer.chrome.com/docs/workbox/using-plugins/).
    *
    * If there is no cache match, this will throw a `WorkboxError` exception.
    *
    * @extends workbox-strategies.Strategy
    * @memberof workbox-strategies
    */
  @JSImport("workbox-strategies/CacheOnly", "CacheOnly")
  @js.native
  /**
    * Creates a new instance of the strategy and sets all documented option
    * properties as public instance properties.
    *
    * Note: if a custom strategy class extends the base Strategy class and does
    * not need more than these properties, it does not need to define its own
    * constructor.
    *
    * @param {Object} [options]
    * @param {string} [options.cacheName] Cache name to store and retrieve
    * requests. Defaults to the cache names provided by
    * {@link workbox-core.cacheNames}.
    * @param {Array<Object>} [options.plugins] [Plugins]{@link https://developers.google.com/web/tools/workbox/guides/using-plugins}
    * to use in conjunction with this caching strategy.
    * @param {Object} [options.fetchOptions] Values passed along to the
    * [`init`](https://developer.mozilla.org/en-US/docs/Web/API/WindowOrWorkerGlobalScope/fetch#Parameters)
    * of [non-navigation](https://github.com/GoogleChrome/workbox/issues/1796)
    * `fetch()` requests made by this strategy.
    * @param {Object} [options.matchOptions] The
    * [`CacheQueryOptions`]{@link https://w3c.github.io/ServiceWorker/#dictdef-cachequeryoptions}
    * for any `cache.match()` or `cache.put()` calls made by this strategy.
    */
  open class CacheOnly () extends Strategy {
    def this(options: StrategyOptions) = this()
  }
}
