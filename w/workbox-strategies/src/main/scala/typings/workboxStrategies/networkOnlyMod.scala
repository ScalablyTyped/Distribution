package typings.workboxStrategies

import typings.std.RequestInit
import typings.workboxCore.typesMod.WorkboxPlugin
import typings.workboxStrategies.strategyMod.Strategy
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object networkOnlyMod {
  
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
  @JSImport("workbox-strategies/NetworkOnly", "NetworkOnly")
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
  open class NetworkOnly () extends Strategy {
    def this(options: NetworkOnlyOptions) = this()
    
    /* private */ val _networkTimeoutSeconds: Any = js.native
  }
  
  /* Inlined parent std.Omit<workbox-strategies.workbox-strategies/Strategy.StrategyOptions, 'cacheName' | 'matchOptions'> */
  trait NetworkOnlyOptions extends StObject {
    
    var fetchOptions: js.UndefOr[RequestInit] = js.undefined
    
    var networkTimeoutSeconds: js.UndefOr[Double] = js.undefined
    
    var plugins: js.UndefOr[js.Array[WorkboxPlugin]] = js.undefined
  }
  object NetworkOnlyOptions {
    
    inline def apply(): NetworkOnlyOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NetworkOnlyOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: NetworkOnlyOptions] (val x: Self) extends AnyVal {
      
      inline def setFetchOptions(value: RequestInit): Self = StObject.set(x, "fetchOptions", value.asInstanceOf[js.Any])
      
      inline def setFetchOptionsUndefined: Self = StObject.set(x, "fetchOptions", js.undefined)
      
      inline def setNetworkTimeoutSeconds(value: Double): Self = StObject.set(x, "networkTimeoutSeconds", value.asInstanceOf[js.Any])
      
      inline def setNetworkTimeoutSecondsUndefined: Self = StObject.set(x, "networkTimeoutSeconds", js.undefined)
      
      inline def setPlugins(value: js.Array[WorkboxPlugin]): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
      
      inline def setPluginsUndefined: Self = StObject.set(x, "plugins", js.undefined)
      
      inline def setPluginsVarargs(value: WorkboxPlugin*): Self = StObject.set(x, "plugins", js.Array(value*))
    }
  }
}
