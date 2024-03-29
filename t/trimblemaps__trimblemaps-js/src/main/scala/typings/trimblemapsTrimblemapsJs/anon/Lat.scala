package typings.trimblemapsTrimblemapsJs.anon

import typings.trimblemapsTrimblemapsJs.mod._LngLatLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Lat
  extends StObject
     with _LngLatLike {
  
  var lat: Double
  
  var lng: Double
}
object Lat {
  
  inline def apply(lat: Double, lng: Double): Lat = {
    val __obj = js.Dynamic.literal(lat = lat.asInstanceOf[js.Any], lng = lng.asInstanceOf[js.Any])
    __obj.asInstanceOf[Lat]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Lat] (val x: Self) extends AnyVal {
    
    inline def setLat(value: Double): Self = StObject.set(x, "lat", value.asInstanceOf[js.Any])
    
    inline def setLng(value: Double): Self = StObject.set(x, "lng", value.asInstanceOf[js.Any])
  }
}
