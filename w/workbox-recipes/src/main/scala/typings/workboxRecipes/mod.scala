package typings.workboxRecipes

import typings.workboxRecipes.googleFontsCacheMod.GoogleFontCacheOptions
import typings.workboxRecipes.imageCacheMod.ImageCacheOptions
import typings.workboxRecipes.offlineFallbackMod.OfflineFallbackOptions
import typings.workboxRecipes.pageCacheMod.PageCacheOptions
import typings.workboxRecipes.staticResourceCacheMod.StaticResourceOptions
import typings.workboxRecipes.warmStrategyCacheMod.WarmStrategyCacheOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("workbox-recipes", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * An implementation of the [Google fonts]{@link https://developers.google.com/web/tools/workbox/guides/common-recipes#google_fonts} caching recipe
    *
    * @memberof workbox-recipes
    *
    * @param {Object} [options]
    * @param {string} [options.cachePrefix] Cache prefix for caching stylesheets and webfonts. Defaults to google-fonts
    * @param {number} [options.maxAgeSeconds] Maximum age, in seconds, that font entries will be cached for. Defaults to 1 year
    * @param {number} [options.maxEntries] Maximum number of fonts that will be cached. Defaults to 30
    */
  inline def googleFontsCache(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("googleFontsCache")().asInstanceOf[Unit]
  inline def googleFontsCache(options: GoogleFontCacheOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("googleFontsCache")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * An implementation of the [image caching recipe]{@link https://developers.google.com/web/tools/workbox/guides/common-recipes#caching_images}
    *
    * @memberof workbox-recipes
    *
    * @param {Object} [options]
    * @param {string} [options.cacheName] Name for cache. Defaults to images
    * @param {RouteMatchCallback} [options.matchCallback] Workbox callback function to call to match to. Defaults to request.destination === 'image';
    * @param {number} [options.maxAgeSeconds] Maximum age, in seconds, that font entries will be cached for. Defaults to 30 days
    * @param {number} [options.maxEntries] Maximum number of images that will be cached. Defaults to 60
    * @param {WorkboxPlugin[]} [options.plugins] Additional plugins to use for this recipe
    * @param {string[]} [options.warmCache] Paths to call to use to warm this cache
    */
  inline def imageCache(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("imageCache")().asInstanceOf[Unit]
  inline def imageCache(options: ImageCacheOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("imageCache")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * An implementation of the [comprehensive fallbacks recipe]{@link https://developers.google.com/web/tools/workbox/guides/advanced-recipes#comprehensive_fallbacks}. Be sure to include the fallbacks in your precache injection
    *
    * @memberof workbox-recipes
    *
    * @param {Object} [options]
    * @param {string} [options.pageFallback] Precache name to match for pag fallbacks. Defaults to offline.html
    * @param {string} [options.imageFallback] Precache name to match for image fallbacks.
    * @param {string} [options.fontFallback] Precache name to match for font fallbacks.
    */
  inline def offlineFallback(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("offlineFallback")().asInstanceOf[Unit]
  inline def offlineFallback(options: OfflineFallbackOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("offlineFallback")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * An implementation of a page caching recipe with a network timeout
    *
    * @memberof workbox-recipes
    *
    * @param {Object} [options]
    * @param {string} [options.cacheName] Name for cache. Defaults to pages
    * @param {RouteMatchCallback} [options.matchCallback] Workbox callback function to call to match to. Defaults to request.mode === 'navigate';
    * @param {number} [options.networkTimoutSeconds] Maximum amount of time, in seconds, to wait on the network before falling back to cache. Defaults to 3
    * @param {WorkboxPlugin[]} [options.plugins] Additional plugins to use for this recipe
    * @param {string[]} [options.warmCache] Paths to call to use to warm this cache
    */
  inline def pageCache(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("pageCache")().asInstanceOf[Unit]
  inline def pageCache(options: PageCacheOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("pageCache")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * An implementation of the [CSS and JavaScript files recipe]{@link https://developers.google.com/web/tools/workbox/guides/common-recipes#cache_css_and_javascript_files}
    *
    * @memberof workbox-recipes
    *
    * @param {Object} [options]
    * @param {string} [options.cacheName] Name for cache. Defaults to static-resources
    * @param {RouteMatchCallback} [options.matchCallback] Workbox callback function to call to match to. Defaults to request.destination === 'style' || request.destination === 'script' || request.destination === 'worker';
    * @param {WorkboxPlugin[]} [options.plugins] Additional plugins to use for this recipe
    * @param {string[]} [options.warmCache] Paths to call to use to warm this cache
    */
  inline def staticResourceCache(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("staticResourceCache")().asInstanceOf[Unit]
  inline def staticResourceCache(options: StaticResourceOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("staticResourceCache")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * @memberof workbox-recipes
    
    * @param {Object} options
    * @param {string[]} options.urls Paths to warm the strategy's cache with
    * @param {Strategy} options.strategy Strategy to use
    */
  inline def warmStrategyCache(options: WarmStrategyCacheOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("warmStrategyCache")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
