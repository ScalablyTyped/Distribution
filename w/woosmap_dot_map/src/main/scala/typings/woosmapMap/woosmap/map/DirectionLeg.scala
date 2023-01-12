package typings.woosmapMap.woosmap.map

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DirectionLeg extends StObject {
  
  var distance: Distance
  
  var duration: Duration
  
  var end_location: LatLngLiteral
  
  var start_location: LatLngLiteral
}
object DirectionLeg {
  
  inline def apply(distance: Distance, duration: Duration, end_location: LatLngLiteral, start_location: LatLngLiteral): DirectionLeg = {
    val __obj = js.Dynamic.literal(distance = distance.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], end_location = end_location.asInstanceOf[js.Any], start_location = start_location.asInstanceOf[js.Any])
    __obj.asInstanceOf[DirectionLeg]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DirectionLeg] (val x: Self) extends AnyVal {
    
    inline def setDistance(value: Distance): Self = StObject.set(x, "distance", value.asInstanceOf[js.Any])
    
    inline def setDuration(value: Duration): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setEnd_location(value: LatLngLiteral): Self = StObject.set(x, "end_location", value.asInstanceOf[js.Any])
    
    inline def setStart_location(value: LatLngLiteral): Self = StObject.set(x, "start_location", value.asInstanceOf[js.Any])
  }
}
