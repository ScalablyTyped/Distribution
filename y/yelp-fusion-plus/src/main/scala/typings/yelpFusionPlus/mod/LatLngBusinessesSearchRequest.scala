package typings.yelpFusionPlus.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LatLngBusinessesSearchRequest
  extends StObject
     with BusinessesSearchRequest {
  
  var latitude: Double
  
  var longitude: Double
}
object LatLngBusinessesSearchRequest {
  
  inline def apply(latitude: Double, longitude: Double): LatLngBusinessesSearchRequest = {
    val __obj = js.Dynamic.literal(latitude = latitude.asInstanceOf[js.Any], longitude = longitude.asInstanceOf[js.Any])
    __obj.asInstanceOf[LatLngBusinessesSearchRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LatLngBusinessesSearchRequest] (val x: Self) extends AnyVal {
    
    inline def setLatitude(value: Double): Self = StObject.set(x, "latitude", value.asInstanceOf[js.Any])
    
    inline def setLongitude(value: Double): Self = StObject.set(x, "longitude", value.asInstanceOf[js.Any])
  }
}
