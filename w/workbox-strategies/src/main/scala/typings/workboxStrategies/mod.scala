package typings.workboxStrategies

import typings.workboxCore.typesMod.HandlerCallbackOptions
import typings.workboxStrategies.networkFirstMod.NetworkFirstOptions
import typings.workboxStrategies.networkOnlyMod.NetworkOnlyOptions
import typings.workboxStrategies.strategyMod.StrategyOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
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
  @JSImport("workbox-strategies", "CacheFirst")
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
  open class CacheFirst ()
    extends typings.workboxStrategies.cacheFirstMod.CacheFirst {
    def this(options: StrategyOptions) = this()
  }
  
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
  @JSImport("workbox-strategies", "CacheOnly")
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
  open class CacheOnly ()
    extends typings.workboxStrategies.cacheOnlyMod.CacheOnly {
    def this(options: StrategyOptions) = this()
  }
  
  /**
    * An implementation of a
    * [network first](https://developer.chrome.com/docs/workbox/caching-strategies-overview/#network-first-falling-back-to-cache)
    * request strategy.
    *
    * By default, this strategy will cache responses with a 200 status code as
    * well as [opaque responses](https://developer.chrome.com/docs/workbox/caching-resources-during-runtime/#opaque-responses).
    * Opaque responses are are cross-origin requests where the response doesn't
    * support [CORS](https://enable-cors.org/).
    *
    * If the network request fails, and there is no cache match, this will throw
    * a `WorkboxError` exception.
    *
    * @extends workbox-strategies.Strategy
    * @memberof workbox-strategies
    */
  @JSImport("workbox-strategies", "NetworkFirst")
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
    * @param {number} [options.networkTimeoutSeconds] If set, any network requests
    * that fail to respond within the timeout will fallback to the cache.
    *
    * This option can be used to combat
    * "[lie-fi]{@link https://developers.google.com/web/fundamentals/performance/poor-connectivity/#lie-fi}"
    * scenarios.
    */
  open class NetworkFirst ()
    extends typings.workboxStrategies.networkFirstMod.NetworkFirst {
    def this(options: NetworkFirstOptions) = this()
  }
  
  /**
    * An implementation of a
    * [network-only](https://developer.chrome.com/docs/workbox/caching-strategies-overview/#network-only)
    * request strategy.
    *
    * This class is useful if you want to take advantage of any
    * [Workbox plugins](https://developer.chrome.com/docs/workbox/using-plugins/).
    *
    * If the network request fails, this will throw a `WorkboxError` exception.
    *
    * @extends workbox-strategies.Strategy
    * @memberof workbox-strategies
    */
  @JSImport("workbox-strategies", "NetworkOnly")
  @js.native
  /**
    * @param {Object} [options]
    * @param {Array<Object>} [options.plugins] [Plugins]{@link https://developers.google.com/web/tools/workbox/guides/using-plugins}
    * to use in conjunction with this caching strategy.
    * @param {Object} [options.fetchOptions] Values passed along to the
    * [`init`](https://developer.mozilla.org/en-US/docs/Web/API/WindowOrWorkerGlobalScope/fetch#Parameters)
    * of [non-navigation](https://github.com/GoogleChrome/workbox/issues/1796)
    * `fetch()` requests made by this strategy.
    * @param {number} [options.networkTimeoutSeconds] If set, any network requests
    * that fail to respond within the timeout will result in a network error.
    */
  open class NetworkOnly ()
    extends typings.workboxStrategies.networkOnlyMod.NetworkOnly {
    def this(options: NetworkOnlyOptions) = this()
  }
  
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
  @JSImport("workbox-strategies", "StaleWhileRevalidate")
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
  open class StaleWhileRevalidate ()
    extends typings.workboxStrategies.staleWhileRevalidateMod.StaleWhileRevalidate {
    def this(options: StrategyOptions) = this()
  }
  
  /**
    * An abstract base class that all other strategy classes must extend from:
    *
    * @memberof workbox-strategies
    */
  /* note: abstract class */ @JSImport("workbox-strategies", "Strategy")
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
  open class Strategy ()
    extends typings.workboxStrategies.strategyMod.Strategy {
    def this(options: StrategyOptions) = this()
  }
  
  /**
    * A class created every time a Strategy instance instance calls
    * {@link workbox-strategies.Strategy~handle} or
    * {@link workbox-strategies.Strategy~handleAll} that wraps all fetch and
    * cache actions around plugin callbacks and keeps track of when the strategy
    * is "done" (i.e. all added `event.waitUntil()` promises have resolved).
    *
    * @memberof workbox-strategies
    */
  @JSImport("workbox-strategies", "StrategyHandler")
  @js.native
  open class StrategyHandler protected ()
    extends typings.workboxStrategies.strategyHandlerMod.StrategyHandler {
    /**
      * Creates a new instance associated with the passed strategy and event
      * that's handling the request.
      *
      * The constructor also initializes the state that will be passed to each of
      * the plugins handling this request.
      *
      * @param {workbox-strategies.Strategy} strategy
      * @param {Object} options
      * @param {Request|string} options.request A request to run this strategy for.
      * @param {ExtendableEvent} options.event The event associated with the
      *     request.
      * @param {URL} [options.url]
      * @param {*} [options.params] The return value from the
      *     {@link workbox-routing~matchCallback} (if applicable).
      */
    def this(strategy: typings.workboxStrategies.strategyMod.Strategy, options: HandlerCallbackOptions) = this()
  }
  
  object global {
    
    trait FetchEvent extends StObject {
      
      val preloadResponse: js.Promise[Any]
    }
    object FetchEvent {
      
      inline def apply(preloadResponse: js.Promise[Any]): FetchEvent = {
        val __obj = js.Dynamic.literal(preloadResponse = preloadResponse.asInstanceOf[js.Any])
        __obj.asInstanceOf[FetchEvent]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: FetchEvent] (val x: Self) extends AnyVal {
        
        inline def setPreloadResponse(value: js.Promise[Any]): Self = StObject.set(x, "preloadResponse", value.asInstanceOf[js.Any])
      }
    }
  }
}
