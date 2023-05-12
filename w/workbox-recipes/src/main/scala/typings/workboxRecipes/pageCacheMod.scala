package typings.workboxRecipes

import typings.workboxCore.typesMod.RouteMatchCallback
import typings.workboxCore.typesMod.RouteMatchCallbackOptions
import typings.workboxCore.typesMod.WorkboxPlugin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pageCacheMod {
  
  @JSImport("workbox-recipes/pageCache", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
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
  
  trait PageCacheOptions extends StObject {
    
    var cacheName: js.UndefOr[String] = js.undefined
    
    var matchCallback: js.UndefOr[RouteMatchCallback] = js.undefined
    
    var networkTimeoutSeconds: js.UndefOr[Double] = js.undefined
    
    var plugins: js.UndefOr[js.Array[WorkboxPlugin]] = js.undefined
    
    var warmCache: js.UndefOr[js.Array[String]] = js.undefined
  }
  object PageCacheOptions {
    
    inline def apply(): PageCacheOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PageCacheOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PageCacheOptions] (val x: Self) extends AnyVal {
      
      inline def setCacheName(value: String): Self = StObject.set(x, "cacheName", value.asInstanceOf[js.Any])
      
      inline def setCacheNameUndefined: Self = StObject.set(x, "cacheName", js.undefined)
      
      inline def setMatchCallback(value: /* options */ RouteMatchCallbackOptions => Any): Self = StObject.set(x, "matchCallback", js.Any.fromFunction1(value))
      
      inline def setMatchCallbackUndefined: Self = StObject.set(x, "matchCallback", js.undefined)
      
      inline def setNetworkTimeoutSeconds(value: Double): Self = StObject.set(x, "networkTimeoutSeconds", value.asInstanceOf[js.Any])
      
      inline def setNetworkTimeoutSecondsUndefined: Self = StObject.set(x, "networkTimeoutSeconds", js.undefined)
      
      inline def setPlugins(value: js.Array[WorkboxPlugin]): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
      
      inline def setPluginsUndefined: Self = StObject.set(x, "plugins", js.undefined)
      
      inline def setPluginsVarargs(value: WorkboxPlugin*): Self = StObject.set(x, "plugins", js.Array(value*))
      
      inline def setWarmCache(value: js.Array[String]): Self = StObject.set(x, "warmCache", value.asInstanceOf[js.Any])
      
      inline def setWarmCacheUndefined: Self = StObject.set(x, "warmCache", js.undefined)
      
      inline def setWarmCacheVarargs(value: String*): Self = StObject.set(x, "warmCache", js.Array(value*))
    }
  }
}
