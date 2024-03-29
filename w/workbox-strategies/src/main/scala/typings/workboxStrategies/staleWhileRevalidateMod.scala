package typings.workboxStrategies

import typings.workboxStrategies.strategyMod.Strategy
import typings.workboxStrategies.strategyMod.StrategyOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object staleWhileRevalidateMod {
  
  /**
    * An implementation of a
    * [stale-while-revalidate](https://developer.chrome.com/docs/workbox/caching-strategies-overview/#stale-while-revalidate)
    * request strategy.
    *
    * Resources are requested from both the cache and the network in parallel.
    * The strategy will respond with the cached version if available, otherwise
    * wait for the network response. The cache is updated with the network response
    * with each successful request.
    *
    * By default, this strategy will cache responses with a 200 status code as
    * well as [opaque responses](https://developer.chrome.com/docs/workbox/caching-resources-during-runtime/#opaque-responses).
    * Opaque responses are cross-origin requests where the response doesn't
    * support [CORS](https://enable-cors.org/).
    *
    * If the network request fails, and there is no cache match, this will throw
    * a `WorkboxError` exception.
    *
    * @extends workbox-strategies.Strategy
    * @memberof workbox-strategies
    */
  @JSImport("workbox-strategies/StaleWhileRevalidate", "StaleWhileRevalidate")
  @js.native
  /**
    * @param {Object} [options]
    * @param {string} [options.cacheName] Cache name to store and retrieve
    * requests. Defaults to cache names provided by
    * {@link workbox-core.cacheNames}.
    * @param {Array<Object>} [options.plugins] [Plugins]{@link https://developers.google.com/web/tools/workbox/guides/using-plugins}
    * to use in conjunction with this caching strategy.
    * @param {Object} [options.fetchOptions] Values passed along to the
    * [`init`](https://developer.mozilla.org/en-US/docs/Web/API/WindowOrWorkerGlobalScope/fetch#Parameters)
    * of [non-navigation](https://github.com/GoogleChrome/workbox/issues/1796)
    * `fetch()` requests made by this strategy.
    * @param {Object} [options.matchOptions] [`CacheQueryOptions`](https://w3c.github.io/ServiceWorker/#dictdef-cachequeryoptions)
    */
  open class StaleWhileRevalidate () extends Strategy {
    def this(options: StrategyOptions) = this()
  }
}
