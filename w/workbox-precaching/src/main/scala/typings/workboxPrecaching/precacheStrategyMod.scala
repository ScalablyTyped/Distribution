package typings.workboxPrecaching

import typings.std.Request
import typings.std.Response
import typings.workboxCore.typesMod.WorkboxPlugin
import typings.workboxStrategies.strategyHandlerMod.StrategyHandler
import typings.workboxStrategies.strategyMod.Strategy
import typings.workboxStrategies.strategyMod.StrategyOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object precacheStrategyMod {
  
  /**
    * A {@link workbox-strategies.Strategy} implementation
    * specifically designed to work with
    * {@link workbox-precaching.PrecacheController}
    * to both cache and fetch precached assets.
    *
    * Note: an instance of this class is created automatically when creating a
    * `PrecacheController`; it's generally not necessary to create this yourself.
    *
    * @extends workbox-strategies.Strategy
    * @memberof workbox-precaching
    */
  @JSImport("workbox-precaching/PrecacheStrategy", "PrecacheStrategy")
  @js.native
  /**
    *
    * @param {Object} [options]
    * @param {string} [options.cacheName] Cache name to store and retrieve
    * requests. Defaults to the cache names provided by
    * {@link workbox-core.cacheNames}.
    * @param {Array<Object>} [options.plugins] {@link https://developers.google.com/web/tools/workbox/guides/using-plugins|Plugins}
    * to use in conjunction with this caching strategy.
    * @param {Object} [options.fetchOptions] Values passed along to the
    * {@link https://developer.mozilla.org/en-US/docs/Web/API/WindowOrWorkerGlobalScope/fetch#Parameters|init}
    * of all fetch() requests made by this strategy.
    * @param {Object} [options.matchOptions] The
    * {@link https://w3c.github.io/ServiceWorker/#dictdef-cachequeryoptions|CacheQueryOptions}
    * for any `cache.match()` or `cache.put()` calls made by this strategy.
    * @param {boolean} [options.fallbackToNetwork=true] Whether to attempt to
    * get the response from the network if there's a precache miss.
    */
  open class PrecacheStrategy () extends Strategy {
    def this(options: PrecacheStrategyOptions) = this()
    
    /* private */ val _fallbackToNetwork: Any = js.native
    
    def _handleFetch(request: Request, handler: StrategyHandler): js.Promise[Response] = js.native
    
    def _handleInstall(request: Request, handler: StrategyHandler): js.Promise[Response] = js.native
    
    /**
      * This method is complex, as there a number of things to account for:
      *
      * The `plugins` array can be set at construction, and/or it might be added to
      * to at any time before the strategy is used.
      *
      * At the time the strategy is used (i.e. during an `install` event), there
      * needs to be at least one plugin that implements `cacheWillUpdate` in the
      * array, other than `copyRedirectedCacheableResponsesPlugin`.
      *
      * - If this method is called and there are no suitable `cacheWillUpdate`
      * plugins, we need to add `defaultPrecacheCacheabilityPlugin`.
      *
      * - If this method is called and there is exactly one `cacheWillUpdate`, then
      * we don't have to do anything (this might be a previously added
      * `defaultPrecacheCacheabilityPlugin`, or it might be a custom plugin).
      *
      * - If this method is called and there is more than one `cacheWillUpdate`,
      * then we need to check if one is `defaultPrecacheCacheabilityPlugin`. If so,
      * we need to remove it. (This situation is unlikely, but it could happen if
      * the strategy is used multiple times, the first without a `cacheWillUpdate`,
      * and then later on after manually adding a custom `cacheWillUpdate`.)
      *
      * See https://github.com/GoogleChrome/workbox/issues/2737 for more context.
      *
      * @private
      */
    def _useDefaultCacheabilityPluginIfNeeded(): Unit = js.native
  }
  object PrecacheStrategy {
    
    /* static member */
    @JSImport("workbox-precaching/PrecacheStrategy", "PrecacheStrategy.copyRedirectedCacheableResponsesPlugin")
    @js.native
    val copyRedirectedCacheableResponsesPlugin: WorkboxPlugin = js.native
    
    /* static member */
    @JSImport("workbox-precaching/PrecacheStrategy", "PrecacheStrategy.defaultPrecacheCacheabilityPlugin")
    @js.native
    val defaultPrecacheCacheabilityPlugin: WorkboxPlugin = js.native
  }
  
  trait PrecacheStrategyOptions
    extends StObject
       with StrategyOptions {
    
    var fallbackToNetwork: js.UndefOr[Boolean] = js.undefined
  }
  object PrecacheStrategyOptions {
    
    inline def apply(): PrecacheStrategyOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PrecacheStrategyOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PrecacheStrategyOptions] (val x: Self) extends AnyVal {
      
      inline def setFallbackToNetwork(value: Boolean): Self = StObject.set(x, "fallbackToNetwork", value.asInstanceOf[js.Any])
      
      inline def setFallbackToNetworkUndefined: Self = StObject.set(x, "fallbackToNetwork", js.undefined)
    }
  }
}
