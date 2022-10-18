package typings.yandexMaps.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BoundedBy extends StObject {
  
  var boundedBy: js.UndefOr[js.Array[js.Array[Double]]] = js.undefined
  
  var results: js.UndefOr[Double] = js.undefined
  
  var skip: js.UndefOr[Double] = js.undefined
  
  var strictBounds: js.UndefOr[Boolean] = js.undefined
}
object BoundedBy {
  
  inline def apply(): BoundedBy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BoundedBy]
  }
  
  extension [Self <: BoundedBy](x: Self) {
    
    inline def setBoundedBy(value: js.Array[js.Array[Double]]): Self = StObject.set(x, "boundedBy", value.asInstanceOf[js.Any])
    
    inline def setBoundedByUndefined: Self = StObject.set(x, "boundedBy", js.undefined)
    
    inline def setBoundedByVarargs(value: js.Array[Double]*): Self = StObject.set(x, "boundedBy", js.Array(value*))
    
    inline def setResults(value: Double): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
    
    inline def setResultsUndefined: Self = StObject.set(x, "results", js.undefined)
    
    inline def setSkip(value: Double): Self = StObject.set(x, "skip", value.asInstanceOf[js.Any])
    
    inline def setSkipUndefined: Self = StObject.set(x, "skip", js.undefined)
    
    inline def setStrictBounds(value: Boolean): Self = StObject.set(x, "strictBounds", value.asInstanceOf[js.Any])
    
    inline def setStrictBoundsUndefined: Self = StObject.set(x, "strictBounds", js.undefined)
  }
}
