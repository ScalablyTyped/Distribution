package typings.workboxStrategies

import typings.std.Response
import typings.workboxStrategies.anon.Handler
import typings.workboxStrategies.strategyMod.Strategy
import typings.workboxStrategies.strategyMod.StrategyOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object networkFirstMod {
  
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
  @JSImport("workbox-strategies/NetworkFirst", "NetworkFirst")
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
  open class NetworkFirst () extends Strategy {
    def this(options: NetworkFirstOptions) = this()
    
    /**
      * @param {Object} options
      * @param {number|undefined} options.timeoutId
      * @param {Request} options.request
      * @param {Array} options.logs A reference to the logs Array.
      * @param {Event} options.event
      * @return {Promise<Response>}
      *
      * @private
      */
    def _getNetworkPromise(param0: Handler): js.Promise[js.UndefOr[Response]] = js.native
    
    /**
      * @param {Object} options
      * @param {Request} options.request
      * @param {Array} options.logs A reference to the logs array
      * @param {Event} options.event
      * @return {Promise<Response>}
      *
      * @private
      */
    /* private */ var _getTimeoutPromise: Any = js.native
    
    /* private */ val _networkTimeoutSeconds: Any = js.native
  }
  
  trait NetworkFirstOptions
    extends StObject
       with StrategyOptions {
    
    var networkTimeoutSeconds: js.UndefOr[Double] = js.undefined
  }
  object NetworkFirstOptions {
    
    inline def apply(): NetworkFirstOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NetworkFirstOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: NetworkFirstOptions] (val x: Self) extends AnyVal {
      
      inline def setNetworkTimeoutSeconds(value: Double): Self = StObject.set(x, "networkTimeoutSeconds", value.asInstanceOf[js.Any])
      
      inline def setNetworkTimeoutSecondsUndefined: Self = StObject.set(x, "networkTimeoutSeconds", js.undefined)
    }
  }
}
