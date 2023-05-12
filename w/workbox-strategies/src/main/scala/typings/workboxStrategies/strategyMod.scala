package typings.workboxStrategies

import typings.std.CacheQueryOptions
import typings.std.Request
import typings.std.RequestInit
import typings.std.Response
import typings.workboxCore.typesMod.HandlerCallbackOptions
import typings.workboxCore.typesMod.RouteHandlerCallback
import typings.workboxCore.typesMod.RouteHandlerCallbackOptions
import typings.workboxCore.typesMod.RouteHandlerObject
import typings.workboxCore.typesMod.WorkboxPlugin
import typings.workboxStrategies.mod.global.FetchEvent
import typings.workboxStrategies.strategyHandlerMod.StrategyHandler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object strategyMod {
  
  /**
    * An abstract base class that all other strategy classes must extend from:
    *
    * @memberof workbox-strategies
    */
  /* note: abstract class */ @JSImport("workbox-strategies/Strategy", "Strategy")
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
    extends StObject
       with RouteHandlerObject {
    def this(options: StrategyOptions) = this()
    
    def _awaitComplete(
      responseDone: js.Promise[Response],
      handler: StrategyHandler,
      request: Request,
      event: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ExtendableEvent */ Any
    ): js.Promise[Unit] = js.native
    
    def _getResponse(
      handler: StrategyHandler,
      request: Request,
      event: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ExtendableEvent */ Any
    ): js.Promise[Response] = js.native
    
    /* protected */ def _handle(request: Request, handler: StrategyHandler): js.Promise[js.UndefOr[Response]] = js.native
    
    var cacheName: String = js.native
    
    var fetchOptions: js.UndefOr[RequestInit] = js.native
    
    def handle(options: HandlerCallbackOptions): js.Promise[Response] = js.native
    /* CompleteClass */
    override def handle(options: RouteHandlerCallbackOptions): js.Promise[Response] = js.native
    /**
      * Perform a request strategy and returns a `Promise` that will resolve with
      * a `Response`, invoking all relevant plugin callbacks.
      *
      * When a strategy instance is registered with a Workbox
      * {@link workbox-routing.Route}, this method is automatically
      * called when the route matches.
      *
      * Alternatively, this method can be used in a standalone `FetchEvent`
      * listener by passing it to `event.respondWith()`.
      *
      * @param {FetchEvent|Object} options A `FetchEvent` or an object with the
      *     properties listed below.
      * @param {Request|string} options.request A request to run this strategy for.
      * @param {ExtendableEvent} options.event The event associated with the
      *     request.
      * @param {URL} [options.url]
      * @param {*} [options.params]
      */
    def handle(options: FetchEvent): js.Promise[Response] = js.native
    
    def handleAll(options: HandlerCallbackOptions): js.Tuple2[js.Promise[Response], js.Promise[Unit]] = js.native
    /**
      * Similar to {@link workbox-strategies.Strategy~handle}, but
      * instead of just returning a `Promise` that resolves to a `Response` it
      * it will return an tuple of `[response, done]` promises, where the former
      * (`response`) is equivalent to what `handle()` returns, and the latter is a
      * Promise that will resolve once any promises that were added to
      * `event.waitUntil()` as part of performing the strategy have completed.
      *
      * You can await the `done` promise to ensure any extra work performed by
      * the strategy (usually caching responses) completes successfully.
      *
      * @param {FetchEvent|Object} options A `FetchEvent` or an object with the
      *     properties listed below.
      * @param {Request|string} options.request A request to run this strategy for.
      * @param {ExtendableEvent} options.event The event associated with the
      *     request.
      * @param {URL} [options.url]
      * @param {*} [options.params]
      * @return {Array<Promise>} A tuple of [response, done]
      *     promises that can be used to determine when the response resolves as
      *     well as when the handler has completed all its work.
      */
    def handleAll(options: FetchEvent): js.Tuple2[js.Promise[Response], js.Promise[Unit]] = js.native
    
    /* CompleteClass */
    @JSName("handle")
    var handle_Original: RouteHandlerCallback = js.native
    
    var matchOptions: js.UndefOr[CacheQueryOptions] = js.native
    
    var plugins: js.Array[WorkboxPlugin] = js.native
  }
  
  trait StrategyOptions extends StObject {
    
    var cacheName: js.UndefOr[String] = js.undefined
    
    var fetchOptions: js.UndefOr[RequestInit] = js.undefined
    
    var matchOptions: js.UndefOr[CacheQueryOptions] = js.undefined
    
    var plugins: js.UndefOr[js.Array[WorkboxPlugin]] = js.undefined
  }
  object StrategyOptions {
    
    inline def apply(): StrategyOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StrategyOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: StrategyOptions] (val x: Self) extends AnyVal {
      
      inline def setCacheName(value: String): Self = StObject.set(x, "cacheName", value.asInstanceOf[js.Any])
      
      inline def setCacheNameUndefined: Self = StObject.set(x, "cacheName", js.undefined)
      
      inline def setFetchOptions(value: RequestInit): Self = StObject.set(x, "fetchOptions", value.asInstanceOf[js.Any])
      
      inline def setFetchOptionsUndefined: Self = StObject.set(x, "fetchOptions", js.undefined)
      
      inline def setMatchOptions(value: CacheQueryOptions): Self = StObject.set(x, "matchOptions", value.asInstanceOf[js.Any])
      
      inline def setMatchOptionsUndefined: Self = StObject.set(x, "matchOptions", js.undefined)
      
      inline def setPlugins(value: js.Array[WorkboxPlugin]): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
      
      inline def setPluginsUndefined: Self = StObject.set(x, "plugins", js.undefined)
      
      inline def setPluginsVarargs(value: WorkboxPlugin*): Self = StObject.set(x, "plugins", js.Array(value*))
    }
  }
}
