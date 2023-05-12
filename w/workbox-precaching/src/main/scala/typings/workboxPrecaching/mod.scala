package typings.workboxPrecaching

import typings.std.Request
import typings.std.Response
import typings.workboxCore.typesMod.RouteHandlerCallback
import typings.workboxCore.typesMod.WorkboxPlugin
import typings.workboxPrecaching.anon.FallbackURL
import typings.workboxPrecaching.precacheControllerMod.PrecacheControllerOptions
import typings.workboxPrecaching.precacheStrategyMod.PrecacheStrategyOptions
import typings.workboxPrecaching.typesMod.PrecacheEntry
import typings.workboxPrecaching.typesMod.PrecacheRouteOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("workbox-precaching", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Performs efficient precaching of assets.
    *
    * @memberof workbox-precaching
    */
  @JSImport("workbox-precaching", "PrecacheController")
  @js.native
  /**
    * Create a new PrecacheController.
    *
    * @param {Object} [options]
    * @param {string} [options.cacheName] The cache to use for precaching.
    * @param {string} [options.plugins] Plugins to use when precaching as well
    * as responding to fetch events for precached assets.
    * @param {boolean} [options.fallbackToNetwork=true] Whether to attempt to
    * get the response from the network if there's a precache miss.
    */
  open class PrecacheController ()
    extends typings.workboxPrecaching.precacheControllerMod.PrecacheController {
    def this(param0: PrecacheControllerOptions) = this()
  }
  
  /**
    * `PrecacheFallbackPlugin` allows you to specify an "offline fallback"
    * response to be used when a given strategy is unable to generate a response.
    *
    * It does this by intercepting the `handlerDidError` plugin callback
    * and returning a precached response, taking the expected revision parameter
    * into account automatically.
    *
    * Unless you explicitly pass in a `PrecacheController` instance to the
    * constructor, the default instance will be used. Generally speaking, most
    * developers will end up using the default.
    *
    * @memberof workbox-precaching
    */
  @JSImport("workbox-precaching", "PrecacheFallbackPlugin")
  @js.native
  open class PrecacheFallbackPlugin protected ()
    extends typings.workboxPrecaching.precacheFallbackPluginMod.PrecacheFallbackPlugin {
    /**
      * Constructs a new PrecacheFallbackPlugin with the associated fallbackURL.
      *
      * @param {Object} config
      * @param {string} config.fallbackURL A precached URL to use as the fallback
      *     if the associated strategy can't generate a response.
      * @param {PrecacheController} [config.precacheController] An optional
      *     PrecacheController instance. If not provided, the default
      *     PrecacheController will be used.
      */
    def this(param0: FallbackURL) = this()
  }
  
  /**
    * A subclass of {@link workbox-routing.Route} that takes a
    * {@link workbox-precaching.PrecacheController}
    * instance and uses it to match incoming requests and handle fetching
    * responses from the precache.
    *
    * @memberof workbox-precaching
    * @extends workbox-routing.Route
    */
  @JSImport("workbox-precaching", "PrecacheRoute")
  @js.native
  open class PrecacheRoute protected ()
    extends typings.workboxPrecaching.precacheRouteMod.PrecacheRoute {
    /**
      * @param {PrecacheController} precacheController A `PrecacheController`
      * instance used to both match requests and respond to fetch events.
      * @param {Object} [options] Options to control how requests are matched
      * against the list of precached URLs.
      * @param {string} [options.directoryIndex=index.html] The `directoryIndex` will
      * check cache entries for a URLs ending with '/' to see if there is a hit when
      * appending the `directoryIndex` value.
      * @param {Array<RegExp>} [options.ignoreURLParametersMatching=[/^utm_/, /^fbclid$/]] An
      * array of regex's to remove search params when looking for a cache match.
      * @param {boolean} [options.cleanURLs=true] The `cleanURLs` option will
      * check the cache for the URL with a `.html` added to the end of the end.
      * @param {workbox-precaching~urlManipulation} [options.urlManipulation]
      * This is a function that should take a URL and return an array of
      * alternative URLs that should be checked for precache matches.
      */
    def this(precacheController: typings.workboxPrecaching.precacheControllerMod.PrecacheController) = this()
    def this(
      precacheController: typings.workboxPrecaching.precacheControllerMod.PrecacheController,
      options: PrecacheRouteOptions
    ) = this()
  }
  
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
  @JSImport("workbox-precaching", "PrecacheStrategy")
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
  open class PrecacheStrategy ()
    extends typings.workboxPrecaching.precacheStrategyMod.PrecacheStrategy {
    def this(options: PrecacheStrategyOptions) = this()
  }
  object PrecacheStrategy {
    
    /* static member */
    @JSImport("workbox-precaching", "PrecacheStrategy.copyRedirectedCacheableResponsesPlugin")
    @js.native
    val copyRedirectedCacheableResponsesPlugin: WorkboxPlugin = js.native
    
    /* static member */
    @JSImport("workbox-precaching", "PrecacheStrategy.defaultPrecacheCacheabilityPlugin")
    @js.native
    val defaultPrecacheCacheabilityPlugin: WorkboxPlugin = js.native
  }
  
  /**
    * Adds plugins to the precaching strategy.
    *
    * @param {Array<Object>} plugins
    *
    * @memberof workbox-precaching
    */
  inline def addPlugins(plugins: js.Array[WorkboxPlugin]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addPlugins")(plugins.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * Add a `fetch` listener to the service worker that will
    * respond to
    * [network requests]{@link https://developer.mozilla.org/en-US/docs/Web/API/Service_Worker_API/Using_Service_Workers#Custom_responses_to_requests}
    * with precached assets.
    *
    * Requests for assets that aren't precached, the `FetchEvent` will not be
    * responded to, allowing the event to fall through to other `fetch` event
    * listeners.
    *
    * @param {Object} [options] See the {@link workbox-precaching.PrecacheRoute}
    * options.
    *
    * @memberof workbox-precaching
    */
  inline def addRoute(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addRoute")().asInstanceOf[Unit]
  inline def addRoute(options: PrecacheRouteOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addRoute")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * Adds an `activate` event listener which will clean up incompatible
    * precaches that were created by older versions of Workbox.
    *
    * @memberof workbox-precaching
    */
  inline def cleanupOutdatedCaches(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("cleanupOutdatedCaches")().asInstanceOf[Unit]
  
  /**
    * Helper function that calls
    * {@link PrecacheController#createHandlerBoundToURL} on the default
    * {@link PrecacheController} instance.
    *
    * If you are creating your own {@link PrecacheController}, then call the
    * {@link PrecacheController#createHandlerBoundToURL} on that instance,
    * instead of using this function.
    *
    * @param {string} url The precached URL which will be used to lookup the
    * `Response`.
    * @param {boolean} [fallbackToNetwork=true] Whether to attempt to get the
    * response from the network if there's a precache miss.
    * @return {workbox-routing~handlerCallback}
    *
    * @memberof workbox-precaching
    */
  inline def createHandlerBoundToURL(url: String): RouteHandlerCallback = ^.asInstanceOf[js.Dynamic].applyDynamic("createHandlerBoundToURL")(url.asInstanceOf[js.Any]).asInstanceOf[RouteHandlerCallback]
  
  /**
    * Takes in a URL, and returns the corresponding URL that could be used to
    * lookup the entry in the precache.
    *
    * If a relative URL is provided, the location of the service worker file will
    * be used as the base.
    *
    * For precached entries without revision information, the cache key will be the
    * same as the original URL.
    *
    * For precached entries with revision information, the cache key will be the
    * original URL with the addition of a query parameter used for keeping track of
    * the revision info.
    *
    * @param {string} url The URL whose cache key to look up.
    * @return {string} The cache key that corresponds to that URL.
    *
    * @memberof workbox-precaching
    */
  inline def getCacheKeyForURL(url: String): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getCacheKeyForURL")(url.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[String]]
  
  /**
    * Helper function that calls
    * {@link PrecacheController#matchPrecache} on the default
    * {@link PrecacheController} instance.
    *
    * If you are creating your own {@link PrecacheController}, then call
    * {@link PrecacheController#matchPrecache} on that instance,
    * instead of using this function.
    *
    * @param {string|Request} request The key (without revisioning parameters)
    * to look up in the precache.
    * @return {Promise<Response|undefined>}
    *
    * @memberof workbox-precaching
    */
  inline def matchPrecache(request: String): js.Promise[js.UndefOr[Response]] = ^.asInstanceOf[js.Dynamic].applyDynamic("matchPrecache")(request.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.UndefOr[Response]]]
  inline def matchPrecache(request: Request): js.Promise[js.UndefOr[Response]] = ^.asInstanceOf[js.Dynamic].applyDynamic("matchPrecache")(request.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.UndefOr[Response]]]
  
  /**
    * Adds items to the precache list, removing any duplicates and
    * stores the files in the
    * {@link workbox-core.cacheNames|"precache cache"} when the service
    * worker installs.
    *
    * This method can be called multiple times.
    *
    * Please note: This method **will not** serve any of the cached files for you.
    * It only precaches files. To respond to a network request you call
    * {@link workbox-precaching.addRoute}.
    *
    * If you have a single array of files to precache, you can just call
    * {@link workbox-precaching.precacheAndRoute}.
    *
    * @param {Array<Object|string>} [entries=[]] Array of entries to precache.
    *
    * @memberof workbox-precaching
    */
  inline def precache(entries: js.Array[PrecacheEntry | String]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("precache")(entries.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * This method will add entries to the precache list and add a route to
    * respond to fetch events.
    *
    * This is a convenience method that will call
    * {@link workbox-precaching.precache} and
    * {@link workbox-precaching.addRoute} in a single call.
    *
    * @param {Array<Object|string>} entries Array of entries to precache.
    * @param {Object} [options] See the
    * {@link workbox-precaching.PrecacheRoute} options.
    *
    * @memberof workbox-precaching
    */
  inline def precacheAndRoute(entries: js.Array[PrecacheEntry | String]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("precacheAndRoute")(entries.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def precacheAndRoute(entries: js.Array[PrecacheEntry | String], options: PrecacheRouteOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("precacheAndRoute")(entries.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
