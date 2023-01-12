package typings.woosmapMap.woosmap.map

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DirectionRequest extends StObject {
  
  var destination: LatLng | LatLngLiteral
  
  var origin: LatLng | LatLngLiteral
  
  var provideRouteAlternatives: js.UndefOr[Boolean] = js.undefined
  
  var travelMode: js.UndefOr[String] = js.undefined
  
  var unitSystem: js.UndefOr[String] = js.undefined
  
  var waypoints: js.UndefOr[js.Array[DirectionsWayPoint]] = js.undefined
}
object DirectionRequest {
  
  inline def apply(destination: LatLng | LatLngLiteral, origin: LatLng | LatLngLiteral): DirectionRequest = {
    val __obj = js.Dynamic.literal(destination = destination.asInstanceOf[js.Any], origin = origin.asInstanceOf[js.Any])
    __obj.asInstanceOf[DirectionRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DirectionRequest] (val x: Self) extends AnyVal {
    
    inline def setDestination(value: LatLng | LatLngLiteral): Self = StObject.set(x, "destination", value.asInstanceOf[js.Any])
    
    inline def setOrigin(value: LatLng | LatLngLiteral): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
    
    inline def setProvideRouteAlternatives(value: Boolean): Self = StObject.set(x, "provideRouteAlternatives", value.asInstanceOf[js.Any])
    
    inline def setProvideRouteAlternativesUndefined: Self = StObject.set(x, "provideRouteAlternatives", js.undefined)
    
    inline def setTravelMode(value: String): Self = StObject.set(x, "travelMode", value.asInstanceOf[js.Any])
    
    inline def setTravelModeUndefined: Self = StObject.set(x, "travelMode", js.undefined)
    
    inline def setUnitSystem(value: String): Self = StObject.set(x, "unitSystem", value.asInstanceOf[js.Any])
    
    inline def setUnitSystemUndefined: Self = StObject.set(x, "unitSystem", js.undefined)
    
    inline def setWaypoints(value: js.Array[DirectionsWayPoint]): Self = StObject.set(x, "waypoints", value.asInstanceOf[js.Any])
    
    inline def setWaypointsUndefined: Self = StObject.set(x, "waypoints", js.undefined)
    
    inline def setWaypointsVarargs(value: DirectionsWayPoint*): Self = StObject.set(x, "waypoints", js.Array(value*))
  }
}
