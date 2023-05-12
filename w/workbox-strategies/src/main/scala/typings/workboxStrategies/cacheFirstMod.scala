package typings.workboxStrategies

import typings.workboxStrategies.strategyMod.Strategy
import typings.workboxStrategies.strategyMod.StrategyOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cacheFirstMod {
  
  /**
    * An implementation of a [cache-first](https://developer.chrome.com/docs/workbox/caching-strategies-overview/#cache-first-falling-back-to-network)
    * request strategy.
    *
    * A cache first strategy is useful for assets that have been revisioned,
    * such as URLs like `/styles/example.a8f5f1.css`, since they
    * can be cached for long periods of time.
    *
    * If the network request fails, and there is no cache match, this will throw
    * a `WorkboxError` exception.
    *
    * @extends workbox-strategies.Strategy
    * @memberof workbox-strategies
    */
  @JSImport("workbox-strategies/CacheFirst", "CacheFirst")
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
  open class CacheFirst () extends Strategy {
    def this(options: StrategyOptions) = this()
  }
}
