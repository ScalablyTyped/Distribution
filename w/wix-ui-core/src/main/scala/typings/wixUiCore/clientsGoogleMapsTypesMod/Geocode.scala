package typings.wixUiCore.clientsGoogleMapsTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Geocode extends StObject {
  
  var address_components: js.Array[AddressComponent]
  
  var formatted_address: String
  
  var geometry: Geometry
  
  var place_id: String
  
  var types: js.Array[String]
}
object Geocode {
  
  @scala.inline
  def apply(
    address_components: js.Array[AddressComponent],
    formatted_address: String,
    geometry: Geometry,
    place_id: String,
    types: js.Array[String]
  ): Geocode = {
    val __obj = js.Dynamic.literal(address_components = address_components.asInstanceOf[js.Any], formatted_address = formatted_address.asInstanceOf[js.Any], geometry = geometry.asInstanceOf[js.Any], place_id = place_id.asInstanceOf[js.Any], types = types.asInstanceOf[js.Any])
    __obj.asInstanceOf[Geocode]
  }
  
  @scala.inline
  implicit class GeocodeMutableBuilder[Self <: Geocode] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddress_components(value: js.Array[AddressComponent]): Self = StObject.set(x, "address_components", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddress_componentsVarargs(value: AddressComponent*): Self = StObject.set(x, "address_components", js.Array(value :_*))
    
    @scala.inline
    def setFormatted_address(value: String): Self = StObject.set(x, "formatted_address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGeometry(value: Geometry): Self = StObject.set(x, "geometry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlace_id(value: String): Self = StObject.set(x, "place_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypes(value: js.Array[String]): Self = StObject.set(x, "types", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypesVarargs(value: String*): Self = StObject.set(x, "types", js.Array(value :_*))
  }
}
