package typings.woosmapMap.woosmap.map

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DirectionsWayPoint extends StObject {
  
  /**
    * Waypoint location.
    */
  var location: LatLng | LatLngLiteral
  
  /**
    * If set to `true` the route will be splitted into two legs.
    */
  var stopover: js.UndefOr[Boolean] = js.undefined
}
object DirectionsWayPoint {
  
  inline def apply(location: LatLng | LatLngLiteral): DirectionsWayPoint = {
    val __obj = js.Dynamic.literal(location = location.asInstanceOf[js.Any])
    __obj.asInstanceOf[DirectionsWayPoint]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DirectionsWayPoint] (val x: Self) extends AnyVal {
    
    inline def setLocation(value: LatLng | LatLngLiteral): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setStopover(value: Boolean): Self = StObject.set(x, "stopover", value.asInstanceOf[js.Any])
    
    inline def setStopoverUndefined: Self = StObject.set(x, "stopover", js.undefined)
  }
}
