package typings.workboxPrecaching

import typings.std.Map
import typings.std.Request
import typings.std.Response
import typings.workboxCore.typesMod.RouteHandlerCallback
import typings.workboxCore.typesMod.WorkboxPlugin
import typings.workboxPrecaching.typesMod.CleanupResult
import typings.workboxPrecaching.typesMod.InstallResult
import typings.workboxPrecaching.typesMod.PrecacheEntry
import typings.workboxStrategies.strategyMod.Strategy
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object precacheControllerMod {
  
  /**
    * Performs efficient precaching of assets.
    *
    * @memberof workbox-precaching
    */
  @JSImport("workbox-precaching/PrecacheController", "PrecacheController")
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
  open class PrecacheController () extends StObject {
    def this(param0: PrecacheControllerOptions) = this()
    
    /* private */ val _cacheKeysToIntegrities: Any = js.native
    
    /* private */ var _installAndActiveListenersAdded: Any = js.native
    
    /* private */ val _strategy: Any = js.native
    
    /* private */ val _urlsToCacheKeys: Any = js.native
    
    /* private */ val _urlsToCacheModes: Any = js.native
    
    /**
      * Deletes assets that are no longer present in the current precache manifest.
      * Call this method from the service worker activate event.
      *
      * Note: this method calls `event.waitUntil()` for you, so you do not need
      * to call it yourself in your event handlers.
      *
      * @param {ExtendableEvent} event
      * @return {Promise<workbox-precaching.CleanupResult>}
      */
    def activate(
      event: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ExtendableEvent */ Any
    ): js.Promise[CleanupResult] = js.native
    
    /**
      * This method will add items to the precache list, removing duplicates
      * and ensuring the information is valid.
      *
      * @param {Array<workbox-precaching.PrecacheController.PrecacheEntry|string>} entries
      *     Array of entries to precache.
      */
    def addToCacheList(entries: js.Array[PrecacheEntry | String]): Unit = js.native
    
    /**
      * Returns a function that looks up `url` in the precache (taking into
      * account revision information), and returns the corresponding `Response`.
      *
      * @param {string} url The precached URL which will be used to lookup the
      * `Response`.
      * @return {workbox-routing~handlerCallback}
      */
    def createHandlerBoundToURL(url: String): RouteHandlerCallback = js.native
    
    /**
      * Returns the cache key used for storing a given URL. If that URL is
      * unversioned, like `/index.html', then the cache key will be the original
      * URL with a search parameter appended to it.
      *
      * @param {string} url A URL whose cache key you want to look up.
      * @return {string} The versioned URL that corresponds to a cache key
      * for the original URL, or undefined if that URL isn't precached.
      */
    def getCacheKeyForURL(url: String): js.UndefOr[String] = js.native
    
    /**
      * Returns a list of all the URLs that have been precached by the current
      * service worker.
      *
      * @return {Array<string>} The precached URLs.
      */
    def getCachedURLs(): js.Array[String] = js.native
    
    /**
      * @param {string} url A cache key whose SRI you want to look up.
      * @return {string} The subresource integrity associated with the cache key,
      * or undefined if it's not set.
      */
    def getIntegrityForCacheKey(cacheKey: String): js.UndefOr[String] = js.native
    
    /**
      * Returns a mapping of a precached URL to the corresponding cache key, taking
      * into account the revision information for the URL.
      *
      * @return {Map<string, string>} A URL to cache key mapping.
      */
    def getURLsToCacheKeys(): Map[String, String] = js.native
    
    /**
      * Precaches new and updated assets. Call this method from the service worker
      * install event.
      *
      * Note: this method calls `event.waitUntil()` for you, so you do not need
      * to call it yourself in your event handlers.
      *
      * @param {ExtendableEvent} event
      * @return {Promise<workbox-precaching.InstallResult>}
      */
    def install(
      event: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ExtendableEvent */ Any
    ): js.Promise[InstallResult] = js.native
    
    /**
      * This acts as a drop-in replacement for
      * [`cache.match()`](https://developer.mozilla.org/en-US/docs/Web/API/Cache/match)
      * with the following differences:
      *
      * - It knows what the name of the precache is, and only checks in that cache.
      * - It allows you to pass in an "original" URL without versioning parameters,
      * and it will automatically look up the correct cache key for the currently
      * active revision of that URL.
      *
      * E.g., `matchPrecache('index.html')` will find the correct precached
      * response for the currently active service worker, even if the actual cache
      * key is `'/index.html?__WB_REVISION__=1234abcd'`.
      *
      * @param {string|Request} request The key (without revisioning parameters)
      * to look up in the precache.
      * @return {Promise<Response|undefined>}
      */
    def matchPrecache(request: String): js.Promise[js.UndefOr[Response]] = js.native
    def matchPrecache(request: Request): js.Promise[js.UndefOr[Response]] = js.native
    
    /**
      * Adds items to the precache list, removing any duplicates and
      * stores the files in the
      * {@link workbox-core.cacheNames|"precache cache"} when the service
      * worker installs.
      *
      * This method can be called multiple times.
      *
      * @param {Array<Object|string>} [entries=[]] Array of entries to precache.
      */
    def precache(entries: js.Array[PrecacheEntry | String]): Unit = js.native
    
    /**
      * @type {workbox-precaching.PrecacheStrategy} The strategy created by this controller and
      * used to cache assets and respond to fetch events.
      */
    def strategy: Strategy = js.native
  }
  
  trait PrecacheControllerOptions extends StObject {
    
    var cacheName: js.UndefOr[String] = js.undefined
    
    var fallbackToNetwork: js.UndefOr[Boolean] = js.undefined
    
    var plugins: js.UndefOr[js.Array[WorkboxPlugin]] = js.undefined
  }
  object PrecacheControllerOptions {
    
    inline def apply(): PrecacheControllerOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PrecacheControllerOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PrecacheControllerOptions] (val x: Self) extends AnyVal {
      
      inline def setCacheName(value: String): Self = StObject.set(x, "cacheName", value.asInstanceOf[js.Any])
      
      inline def setCacheNameUndefined: Self = StObject.set(x, "cacheName", js.undefined)
      
      inline def setFallbackToNetwork(value: Boolean): Self = StObject.set(x, "fallbackToNetwork", value.asInstanceOf[js.Any])
      
      inline def setFallbackToNetworkUndefined: Self = StObject.set(x, "fallbackToNetwork", js.undefined)
      
      inline def setPlugins(value: js.Array[WorkboxPlugin]): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
      
      inline def setPluginsUndefined: Self = StObject.set(x, "plugins", js.undefined)
      
      inline def setPluginsVarargs(value: WorkboxPlugin*): Self = StObject.set(x, "plugins", js.Array(value*))
    }
  }
  
  object global {
    
    trait ServiceWorkerGlobalScope extends StObject {
      
      var __WB_MANIFEST: js.Array[PrecacheEntry | String]
    }
    object ServiceWorkerGlobalScope {
      
      inline def apply(__WB_MANIFEST: js.Array[PrecacheEntry | String]): ServiceWorkerGlobalScope = {
        val __obj = js.Dynamic.literal(__WB_MANIFEST = __WB_MANIFEST.asInstanceOf[js.Any])
        __obj.asInstanceOf[ServiceWorkerGlobalScope]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: ServiceWorkerGlobalScope] (val x: Self) extends AnyVal {
        
        inline def set__WB_MANIFEST(value: js.Array[PrecacheEntry | String]): Self = StObject.set(x, "__WB_MANIFEST", value.asInstanceOf[js.Any])
        
        inline def set__WB_MANIFESTVarargs(value: (PrecacheEntry | String)*): Self = StObject.set(x, "__WB_MANIFEST", js.Array(value*))
      }
    }
  }
}
