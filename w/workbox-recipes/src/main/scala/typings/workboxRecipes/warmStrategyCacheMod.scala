package typings.workboxRecipes

import typings.workboxStrategies.strategyMod.Strategy
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object warmStrategyCacheMod {
  
  @JSImport("workbox-recipes/warmStrategyCache", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * @memberof workbox-recipes
    
    * @param {Object} options
    * @param {string[]} options.urls Paths to warm the strategy's cache with
    * @param {Strategy} options.strategy Strategy to use
    */
  inline def warmStrategyCache(options: WarmStrategyCacheOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("warmStrategyCache")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  trait WarmStrategyCacheOptions extends StObject {
    
    var strategy: Strategy
    
    var urls: js.Array[String]
  }
  object WarmStrategyCacheOptions {
    
    inline def apply(strategy: Strategy, urls: js.Array[String]): WarmStrategyCacheOptions = {
      val __obj = js.Dynamic.literal(strategy = strategy.asInstanceOf[js.Any], urls = urls.asInstanceOf[js.Any])
      __obj.asInstanceOf[WarmStrategyCacheOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: WarmStrategyCacheOptions] (val x: Self) extends AnyVal {
      
      inline def setStrategy(value: Strategy): Self = StObject.set(x, "strategy", value.asInstanceOf[js.Any])
      
      inline def setUrls(value: js.Array[String]): Self = StObject.set(x, "urls", value.asInstanceOf[js.Any])
      
      inline def setUrlsVarargs(value: String*): Self = StObject.set(x, "urls", js.Array(value*))
    }
  }
}
