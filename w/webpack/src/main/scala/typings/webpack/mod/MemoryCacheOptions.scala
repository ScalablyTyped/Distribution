package typings.webpack.mod

import typings.webpack.webpackStrings.memory
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Options object for in-memory caching.
  */
trait MemoryCacheOptions
  extends StObject
     with CacheOptionsNormalized {
  
  /**
  	 * Additionally cache computation of modules that are unchanged and reference only unchanged modules.
  	 */
  var cacheUnaffected: js.UndefOr[Boolean] = js.undefined
  
  /**
  	 * Number of generations unused cache entries stay in memory cache at minimum (1 = may be removed after unused for a single compilation, ..., Infinity: kept forever).
  	 */
  var maxGenerations: js.UndefOr[Double] = js.undefined
  
  /**
  	 * In memory caching.
  	 */
  var `type`: memory
}
object MemoryCacheOptions {
  
  inline def apply(): MemoryCacheOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("memory")
    __obj.asInstanceOf[MemoryCacheOptions]
  }
  
  extension [Self <: MemoryCacheOptions](x: Self) {
    
    inline def setCacheUnaffected(value: Boolean): Self = StObject.set(x, "cacheUnaffected", value.asInstanceOf[js.Any])
    
    inline def setCacheUnaffectedUndefined: Self = StObject.set(x, "cacheUnaffected", js.undefined)
    
    inline def setMaxGenerations(value: Double): Self = StObject.set(x, "maxGenerations", value.asInstanceOf[js.Any])
    
    inline def setMaxGenerationsUndefined: Self = StObject.set(x, "maxGenerations", js.undefined)
    
    inline def setType(value: memory): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
