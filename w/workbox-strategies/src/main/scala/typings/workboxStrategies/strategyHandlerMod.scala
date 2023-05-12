package typings.workboxStrategies

import typings.std.Generator
import typings.std.NonNullable
import typings.std.Omit
import typings.std.Request
import typings.std.RequestInfo
import typings.std.Response
import typings.std.URL
import typings.workboxCore.typesMod.CacheDidUpdateCallback
import typings.workboxCore.typesMod.CacheKeyWillBeUsedCallback
import typings.workboxCore.typesMod.CacheWillUpdateCallback
import typings.workboxCore.typesMod.CachedResponseWillBeUsedCallback
import typings.workboxCore.typesMod.FetchDidFailCallback
import typings.workboxCore.typesMod.FetchDidSucceedCallback
import typings.workboxCore.typesMod.HandlerCallbackOptions
import typings.workboxCore.typesMod.HandlerDidCompleteCallback
import typings.workboxCore.typesMod.HandlerDidErrorCallback
import typings.workboxCore.typesMod.HandlerDidRespondCallback
import typings.workboxCore.typesMod.HandlerWillRespondCallback
import typings.workboxCore.typesMod.HandlerWillStartCallback
import typings.workboxCore.typesMod.RequestWillFetchCallback
import typings.workboxStrategies.strategyMod.Strategy
import typings.workboxStrategies.workboxStrategiesStrings.cacheDidUpdate
import typings.workboxStrategies.workboxStrategiesStrings.cacheKeyWillBeUsed
import typings.workboxStrategies.workboxStrategiesStrings.cacheWillUpdate
import typings.workboxStrategies.workboxStrategiesStrings.cachedResponseWillBeUsed
import typings.workboxStrategies.workboxStrategiesStrings.fetchDidFail
import typings.workboxStrategies.workboxStrategiesStrings.fetchDidSucceed
import typings.workboxStrategies.workboxStrategiesStrings.handlerDidComplete
import typings.workboxStrategies.workboxStrategiesStrings.handlerDidError
import typings.workboxStrategies.workboxStrategiesStrings.handlerDidRespond
import typings.workboxStrategies.workboxStrategiesStrings.handlerWillRespond
import typings.workboxStrategies.workboxStrategiesStrings.handlerWillStart
import typings.workboxStrategies.workboxStrategiesStrings.read
import typings.workboxStrategies.workboxStrategiesStrings.requestWillFetch
import typings.workboxStrategies.workboxStrategiesStrings.state
import typings.workboxStrategies.workboxStrategiesStrings.write
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object strategyHandlerMod {
  
  /**
    * A class created every time a Strategy instance instance calls
    * {@link workbox-strategies.Strategy~handle} or
    * {@link workbox-strategies.Strategy~handleAll} that wraps all fetch and
    * cache actions around plugin callbacks and keeps track of when the strategy
    * is "done" (i.e. all added `event.waitUntil()` promises have resolved).
    *
    * @memberof workbox-strategies
    */
  @JSImport("workbox-strategies/StrategyHandler", "StrategyHandler")
  @js.native
  open class StrategyHandler protected () extends StObject {
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
    def this(strategy: Strategy, options: HandlerCallbackOptions) = this()
    
    /* private */ var _cacheKeys: Any = js.native
    
    /**
      * This method will call cacheWillUpdate on the available plugins (or use
      * status === 200) to determine if the Response is safe and valid to cache.
      *
      * @param {Request} options.request
      * @param {Response} options.response
      * @return {Promise<Response|undefined>}
      *
      * @private
      */
    def _ensureResponseSafeToCache(response: Response): js.Promise[js.UndefOr[Response]] = js.native
    
    /* private */ val _extendLifetimePromises: Any = js.native
    
    /* private */ val _handlerDeferred: Any = js.native
    
    /* private */ val _pluginStateMap: Any = js.native
    
    /* private */ val _plugins: Any = js.native
    
    /* private */ val _strategy: Any = js.native
    
    /**
      * Matches a request from the cache (and invokes any applicable plugin
      * callback methods) using the `cacheName`, `matchOptions`, and `plugins`
      * defined on the strategy object.
      *
      * The following plugin lifecycle methods are invoked when using this method:
      * - cacheKeyWillByUsed()
      * - cachedResponseWillByUsed()
      *
      * @param {Request|string} key The Request or URL to use as the cache key.
      * @return {Promise<Response|undefined>} A matching response, if found.
      */
    def cacheMatch(key: RequestInfo): js.Promise[js.UndefOr[Response]] = js.native
    
    /**
      * Puts a request/response pair in the cache (and invokes any applicable
      * plugin callback methods) using the `cacheName` and `plugins` defined on
      * the strategy object.
      *
      * The following plugin lifecycle methods are invoked when using this method:
      * - cacheKeyWillByUsed()
      * - cacheWillUpdate()
      * - cacheDidUpdate()
      *
      * @param {Request|string} key The request or URL to use as the cache key.
      * @param {Response} response The response to cache.
      * @return {Promise<boolean>} `false` if a cacheWillUpdate caused the response
      * not be cached, and `true` otherwise.
      */
    def cachePut(key: RequestInfo, response: Response): js.Promise[Boolean] = js.native
    
    /**
      * Stops running the strategy and immediately resolves any pending
      * `waitUntil()` promises.
      */
    def destroy(): Unit = js.native
    
    /**
      * Returns a promise that resolves once all promises passed to
      * {@link workbox-strategies.StrategyHandler~waitUntil}
      * have settled.
      *
      * Note: any work done after `doneWaiting()` settles should be manually
      * passed to an event's `waitUntil()` method (not this handler's
      * `waitUntil()` method), otherwise the service worker thread my be killed
      * prior to your work completing.
      */
    def doneWaiting(): js.Promise[Unit] = js.native
    
    var event: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ExtendableEvent */ Any = js.native
    
    /**
      * Fetches a given request (and invokes any applicable plugin callback
      * methods) using the `fetchOptions` (for non-navigation requests) and
      * `plugins` defined on the `Strategy` object.
      *
      * The following plugin lifecycle methods are invoked when using this method:
      * - `requestWillFetch()`
      * - `fetchDidSucceed()`
      * - `fetchDidFail()`
      *
      * @param {Request|string} input The URL or request to fetch.
      * @return {Promise<Response>}
      */
    def fetch(input: RequestInfo): js.Promise[Response] = js.native
    
    /**
      * Calls `this.fetch()` and (in the background) runs `this.cachePut()` on
      * the response generated by `this.fetch()`.
      *
      * The call to `this.cachePut()` automatically invokes `this.waitUntil()`,
      * so you do not have to manually call `waitUntil()` on the event.
      *
      * @param {Request|string} input The request or URL to fetch and cache.
      * @return {Promise<Response>}
      */
    def fetchAndCachePut(input: RequestInfo): js.Promise[Response] = js.native
    
    /**
      * Checks the list of plugins for the `cacheKeyWillBeUsed` callback, and
      * executes any of those callbacks found in sequence. The final `Request`
      * object returned by the last plugin is treated as the cache key for cache
      * reads and/or writes. If no `cacheKeyWillBeUsed` plugin callbacks have
      * been registered, the passed request is returned unmodified
      *
      * @param {Request} request
      * @param {string} mode
      * @return {Promise<Request>}
      */
    def getCacheKey(request: Request, mode: read | write): js.Promise[Request] = js.native
    
    /**
      * Returns true if the strategy has at least one plugin with the given
      * callback.
      *
      * @param {string} name The name of the callback to check for.
      * @return {boolean}
      */
    @JSName("hasCallback")
    def hasCallback_cacheDidUpdate(name: cacheDidUpdate): Boolean = js.native
    @JSName("hasCallback")
    def hasCallback_cacheKeyWillBeUsed(name: cacheKeyWillBeUsed): Boolean = js.native
    @JSName("hasCallback")
    def hasCallback_cacheWillUpdate(name: cacheWillUpdate): Boolean = js.native
    @JSName("hasCallback")
    def hasCallback_cachedResponseWillBeUsed(name: cachedResponseWillBeUsed): Boolean = js.native
    @JSName("hasCallback")
    def hasCallback_fetchDidFail(name: fetchDidFail): Boolean = js.native
    @JSName("hasCallback")
    def hasCallback_fetchDidSucceed(name: fetchDidSucceed): Boolean = js.native
    @JSName("hasCallback")
    def hasCallback_handlerDidComplete(name: handlerDidComplete): Boolean = js.native
    @JSName("hasCallback")
    def hasCallback_handlerDidError(name: handlerDidError): Boolean = js.native
    @JSName("hasCallback")
    def hasCallback_handlerDidRespond(name: handlerDidRespond): Boolean = js.native
    @JSName("hasCallback")
    def hasCallback_handlerWillRespond(name: handlerWillRespond): Boolean = js.native
    @JSName("hasCallback")
    def hasCallback_handlerWillStart(name: handlerWillStart): Boolean = js.native
    @JSName("hasCallback")
    def hasCallback_requestWillFetch(name: requestWillFetch): Boolean = js.native
    
    /**
      * Accepts a callback and returns an iterable of matching plugin callbacks,
      * where each callback is wrapped with the current handler state (i.e. when
      * you call each callback, whatever object parameter you pass it will
      * be merged with the plugin's current state).
      *
      * @param {string} name The name fo the callback to run
      * @return {Array<Function>}
      */
    @JSName("iterateCallbacks")
    def iterateCallbacks_cacheDidUpdate(name: cacheDidUpdate): Generator[NonNullable[js.UndefOr[CacheDidUpdateCallback]], Any, Any] = js.native
    @JSName("iterateCallbacks")
    def iterateCallbacks_cacheKeyWillBeUsed(name: cacheKeyWillBeUsed): Generator[NonNullable[js.UndefOr[CacheKeyWillBeUsedCallback]], Any, Any] = js.native
    @JSName("iterateCallbacks")
    def iterateCallbacks_cacheWillUpdate(name: cacheWillUpdate): Generator[NonNullable[js.UndefOr[CacheWillUpdateCallback]], Any, Any] = js.native
    @JSName("iterateCallbacks")
    def iterateCallbacks_cachedResponseWillBeUsed(name: cachedResponseWillBeUsed): Generator[NonNullable[js.UndefOr[CachedResponseWillBeUsedCallback]], Any, Any] = js.native
    @JSName("iterateCallbacks")
    def iterateCallbacks_fetchDidFail(name: fetchDidFail): Generator[NonNullable[js.UndefOr[FetchDidFailCallback]], Any, Any] = js.native
    @JSName("iterateCallbacks")
    def iterateCallbacks_fetchDidSucceed(name: fetchDidSucceed): Generator[NonNullable[js.UndefOr[FetchDidSucceedCallback]], Any, Any] = js.native
    @JSName("iterateCallbacks")
    def iterateCallbacks_handlerDidComplete(name: handlerDidComplete): Generator[NonNullable[js.UndefOr[HandlerDidCompleteCallback]], Any, Any] = js.native
    @JSName("iterateCallbacks")
    def iterateCallbacks_handlerDidError(name: handlerDidError): Generator[NonNullable[js.UndefOr[HandlerDidErrorCallback]], Any, Any] = js.native
    @JSName("iterateCallbacks")
    def iterateCallbacks_handlerDidRespond(name: handlerDidRespond): Generator[NonNullable[js.UndefOr[HandlerDidRespondCallback]], Any, Any] = js.native
    @JSName("iterateCallbacks")
    def iterateCallbacks_handlerWillRespond(name: handlerWillRespond): Generator[NonNullable[js.UndefOr[HandlerWillRespondCallback]], Any, Any] = js.native
    @JSName("iterateCallbacks")
    def iterateCallbacks_handlerWillStart(name: handlerWillStart): Generator[NonNullable[js.UndefOr[HandlerWillStartCallback]], Any, Any] = js.native
    @JSName("iterateCallbacks")
    def iterateCallbacks_requestWillFetch(name: requestWillFetch): Generator[NonNullable[js.UndefOr[RequestWillFetchCallback]], Any, Any] = js.native
    
    var params: js.UndefOr[Any] = js.native
    
    var request: Request = js.native
    
    /**
      * Runs all plugin callbacks matching the given name, in order, passing the
      * given param object (merged ith the current plugin state) as the only
      * argument.
      *
      * Note: since this method runs all plugins, it's not suitable for cases
      * where the return value of a callback needs to be applied prior to calling
      * the next callback. See
      * {@link workbox-strategies.StrategyHandler#iterateCallbacks}
      * below for how to handle that case.
      *
      * @param {string} name The name of the callback to run within each plugin.
      * @param {Object} param The object to pass as the first (and only) param
      *     when executing each callback. This object will be merged with the
      *     current plugin state prior to callback execution.
      */
    @JSName("runCallbacks")
    def runCallbacks_state[C /* <: /* keyof workbox-strategies.anon.NonNullableWorkboxPlugin */ cacheDidUpdate | cachedResponseWillBeUsed | cacheKeyWillBeUsed | cacheWillUpdate | fetchDidFail | fetchDidSucceed | handlerDidComplete | handlerDidError | handlerDidRespond | handlerWillRespond | handlerWillStart | requestWillFetch */](
      name: C,
      param: Omit[
          /* import warning: importer.ImportType#apply Failed type conversion: workbox-core.workbox-core/types.WorkboxPluginCallbackParam[C] */ js.Any, 
          state
        ]
    ): js.Promise[Unit] = js.native
    
    var url: js.UndefOr[URL] = js.native
    
    /**
      * Adds a promise to the
      * [extend lifetime promises]{@link https://w3c.github.io/ServiceWorker/#extendableevent-extend-lifetime-promises}
      * of the event event associated with the request being handled (usually a
      * `FetchEvent`).
      *
      * Note: you can await
      * {@link workbox-strategies.StrategyHandler~doneWaiting}
      * to know when all added promises have settled.
      *
      * @param {Promise} promise A promise to add to the extend lifetime promises
      *     of the event that triggered the request.
      */
    def waitUntil[T](promise: js.Promise[T]): js.Promise[T] = js.native
  }
}
