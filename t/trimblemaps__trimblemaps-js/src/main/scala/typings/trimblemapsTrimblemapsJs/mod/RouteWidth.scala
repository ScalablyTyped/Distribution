package typings.trimblemapsTrimblemapsJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RouteWidth extends StObject {
  
  var stops: js.Array[js.Tuple2[Double, Double]]
}
object RouteWidth {
  
  inline def apply(stops: js.Array[js.Tuple2[Double, Double]]): RouteWidth = {
    val __obj = js.Dynamic.literal(stops = stops.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouteWidth]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RouteWidth] (val x: Self) extends AnyVal {
    
    inline def setStops(value: js.Array[js.Tuple2[Double, Double]]): Self = StObject.set(x, "stops", value.asInstanceOf[js.Any])
    
    inline def setStopsVarargs(value: (js.Tuple2[Double, Double])*): Self = StObject.set(x, "stops", js.Array(value*))
  }
}
