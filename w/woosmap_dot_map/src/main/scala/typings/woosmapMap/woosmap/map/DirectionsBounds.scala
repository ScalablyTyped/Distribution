package typings.woosmapMap.woosmap.map

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DirectionsBounds extends StObject {
  
  var northeast: LatLngLiteral
  
  var southwest: LatLngLiteral
}
object DirectionsBounds {
  
  inline def apply(northeast: LatLngLiteral, southwest: LatLngLiteral): DirectionsBounds = {
    val __obj = js.Dynamic.literal(northeast = northeast.asInstanceOf[js.Any], southwest = southwest.asInstanceOf[js.Any])
    __obj.asInstanceOf[DirectionsBounds]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DirectionsBounds] (val x: Self) extends AnyVal {
    
    inline def setNortheast(value: LatLngLiteral): Self = StObject.set(x, "northeast", value.asInstanceOf[js.Any])
    
    inline def setSouthwest(value: LatLngLiteral): Self = StObject.set(x, "southwest", value.asInstanceOf[js.Any])
  }
}
