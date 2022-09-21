package typings.yandexMaps.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ISuggestOptions extends StObject {
  
  /**
    * A rectangular area on the map, where the object being searched for is presumably located. Must be set as an array, such as [[30, 40], [50, 50]].
    */
  var boundedBy: js.UndefOr[js.Array[js.Array[Double]]] = js.undefined
  
  /**
    * Search suggestion provider. You can use the 'yandex#map' built-in search suggestion provider for map objects, or specify your own.
    */
  var provider: js.UndefOr[ISuggestProvider | String] = js.undefined
  
  /**
    * Maximum number of results to be returned.
    */
  var results: js.UndefOr[Double] = js.undefined
}
object ISuggestOptions {
  
  inline def apply(): ISuggestOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ISuggestOptions]
  }
  
  extension [Self <: ISuggestOptions](x: Self) {
    
    inline def setBoundedBy(value: js.Array[js.Array[Double]]): Self = StObject.set(x, "boundedBy", value.asInstanceOf[js.Any])
    
    inline def setBoundedByUndefined: Self = StObject.set(x, "boundedBy", js.undefined)
    
    inline def setBoundedByVarargs(value: js.Array[Double]*): Self = StObject.set(x, "boundedBy", js.Array(value*))
    
    inline def setProvider(value: ISuggestProvider | String): Self = StObject.set(x, "provider", value.asInstanceOf[js.Any])
    
    inline def setProviderUndefined: Self = StObject.set(x, "provider", js.undefined)
    
    inline def setResults(value: Double): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
    
    inline def setResultsUndefined: Self = StObject.set(x, "results", js.undefined)
  }
}
