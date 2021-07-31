package typings.wixUiCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Geocoder extends StObject {
  
  def Geocoder(): js.Any
  
  var GeocoderStatus: OK
  
  def Map(): js.Object
  
  var places: AutocompleteService
}
object Geocoder {
  
  @scala.inline
  def apply(Geocoder: () => js.Any, GeocoderStatus: OK, Map: () => js.Object, places: AutocompleteService): Geocoder = {
    val __obj = js.Dynamic.literal(Geocoder = js.Any.fromFunction0(Geocoder), GeocoderStatus = GeocoderStatus.asInstanceOf[js.Any], Map = js.Any.fromFunction0(Map), places = places.asInstanceOf[js.Any])
    __obj.asInstanceOf[Geocoder]
  }
  
  @scala.inline
  implicit class GeocoderMutableBuilder[Self <: Geocoder] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGeocoder(value: () => js.Any): Self = StObject.set(x, "Geocoder", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGeocoderStatus(value: OK): Self = StObject.set(x, "GeocoderStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMap(value: () => js.Object): Self = StObject.set(x, "Map", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPlaces(value: AutocompleteService): Self = StObject.set(x, "places", value.asInstanceOf[js.Any])
  }
}
