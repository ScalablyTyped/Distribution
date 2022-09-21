package typings.woosmapMap.woosmap.map

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LatLngLiteral extends StObject {
  
  /**
    * Latitude in degrees.
    * Values will be clamped to the range [-90, 90].
    * This means that if the value specified is less than -90, it will be set to -90.
    * And if the value is greater than 90, it will be set to 90.
    */
  var lat: Double
  
  /**
    * Longitude in degrees.
    * Values outside the range [-180, 180] will be wrapped so that they fall within the range.
    * For example, a value of -190 will be converted to 170. A value of 190 will be converted to -170.
    * This reflects the fact that longitudes wrap around the globe.
    */
  var lng: Double
}
object LatLngLiteral {
  
  inline def apply(lat: Double, lng: Double): LatLngLiteral = {
    val __obj = js.Dynamic.literal(lat = lat.asInstanceOf[js.Any], lng = lng.asInstanceOf[js.Any])
    __obj.asInstanceOf[LatLngLiteral]
  }
  
  extension [Self <: LatLngLiteral](x: Self) {
    
    inline def setLat(value: Double): Self = StObject.set(x, "lat", value.asInstanceOf[js.Any])
    
    inline def setLng(value: Double): Self = StObject.set(x, "lng", value.asInstanceOf[js.Any])
  }
}
