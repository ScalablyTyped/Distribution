package typings.workboxRecipes

import typings.workboxCore.typesMod.RouteMatchCallback
import typings.workboxCore.typesMod.RouteMatchCallbackOptions
import typings.workboxCore.typesMod.WorkboxPlugin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object imageCacheMod {
  
  @JSImport("workbox-recipes/imageCache", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
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
  
  trait ImageCacheOptions extends StObject {
    
    var cacheName: js.UndefOr[String] = js.undefined
    
    var matchCallback: js.UndefOr[RouteMatchCallback] = js.undefined
    
    var maxAgeSeconds: js.UndefOr[Double] = js.undefined
    
    var maxEntries: js.UndefOr[Double] = js.undefined
    
    var plugins: js.UndefOr[js.Array[WorkboxPlugin]] = js.undefined
    
    var warmCache: js.UndefOr[js.Array[String]] = js.undefined
  }
  object ImageCacheOptions {
    
    inline def apply(): ImageCacheOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ImageCacheOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ImageCacheOptions] (val x: Self) extends AnyVal {
      
      inline def setCacheName(value: String): Self = StObject.set(x, "cacheName", value.asInstanceOf[js.Any])
      
      inline def setCacheNameUndefined: Self = StObject.set(x, "cacheName", js.undefined)
      
      inline def setMatchCallback(value: /* options */ RouteMatchCallbackOptions => Any): Self = StObject.set(x, "matchCallback", js.Any.fromFunction1(value))
      
      inline def setMatchCallbackUndefined: Self = StObject.set(x, "matchCallback", js.undefined)
      
      inline def setMaxAgeSeconds(value: Double): Self = StObject.set(x, "maxAgeSeconds", value.asInstanceOf[js.Any])
      
      inline def setMaxAgeSecondsUndefined: Self = StObject.set(x, "maxAgeSeconds", js.undefined)
      
      inline def setMaxEntries(value: Double): Self = StObject.set(x, "maxEntries", value.asInstanceOf[js.Any])
      
      inline def setMaxEntriesUndefined: Self = StObject.set(x, "maxEntries", js.undefined)
      
      inline def setPlugins(value: js.Array[WorkboxPlugin]): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
      
      inline def setPluginsUndefined: Self = StObject.set(x, "plugins", js.undefined)
      
      inline def setPluginsVarargs(value: WorkboxPlugin*): Self = StObject.set(x, "plugins", js.Array(value*))
      
      inline def setWarmCache(value: js.Array[String]): Self = StObject.set(x, "warmCache", value.asInstanceOf[js.Any])
      
      inline def setWarmCacheUndefined: Self = StObject.set(x, "warmCache", js.undefined)
      
      inline def setWarmCacheVarargs(value: String*): Self = StObject.set(x, "warmCache", js.Array(value*))
    }
  }
}
