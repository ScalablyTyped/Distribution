package typings.wixUiCore.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlaceDetails extends StObject {
  
  var address_components: js.Array[AddressComponent]
  
  var adr_address: String
  
  var formatted_address: String
  
  var geometry: Geometry
  
  var html_attributions: String
  
  var icon: String
  
  var id: String
  
  var name: String
  
  var photos: String
  
  var place_id: String
  
  var reference: String
  
  var scope: String
  
  var types: js.Array[String]
  
  var url: String
  
  var utc_offset: String
}
object PlaceDetails {
  
  inline def apply(
    address_components: js.Array[AddressComponent],
    adr_address: String,
    formatted_address: String,
    geometry: Geometry,
    html_attributions: String,
    icon: String,
    id: String,
    name: String,
    photos: String,
    place_id: String,
    reference: String,
    scope: String,
    types: js.Array[String],
    url: String,
    utc_offset: String
  ): PlaceDetails = {
    val __obj = js.Dynamic.literal(address_components = address_components.asInstanceOf[js.Any], adr_address = adr_address.asInstanceOf[js.Any], formatted_address = formatted_address.asInstanceOf[js.Any], geometry = geometry.asInstanceOf[js.Any], html_attributions = html_attributions.asInstanceOf[js.Any], icon = icon.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], photos = photos.asInstanceOf[js.Any], place_id = place_id.asInstanceOf[js.Any], reference = reference.asInstanceOf[js.Any], scope = scope.asInstanceOf[js.Any], types = types.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], utc_offset = utc_offset.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlaceDetails]
  }
  
  extension [Self <: PlaceDetails](x: Self) {
    
    inline def setAddress_components(value: js.Array[AddressComponent]): Self = StObject.set(x, "address_components", value.asInstanceOf[js.Any])
    
    inline def setAddress_componentsVarargs(value: AddressComponent*): Self = StObject.set(x, "address_components", js.Array(value :_*))
    
    inline def setAdr_address(value: String): Self = StObject.set(x, "adr_address", value.asInstanceOf[js.Any])
    
    inline def setFormatted_address(value: String): Self = StObject.set(x, "formatted_address", value.asInstanceOf[js.Any])
    
    inline def setGeometry(value: Geometry): Self = StObject.set(x, "geometry", value.asInstanceOf[js.Any])
    
    inline def setHtml_attributions(value: String): Self = StObject.set(x, "html_attributions", value.asInstanceOf[js.Any])
    
    inline def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setPhotos(value: String): Self = StObject.set(x, "photos", value.asInstanceOf[js.Any])
    
    inline def setPlace_id(value: String): Self = StObject.set(x, "place_id", value.asInstanceOf[js.Any])
    
    inline def setReference(value: String): Self = StObject.set(x, "reference", value.asInstanceOf[js.Any])
    
    inline def setScope(value: String): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    
    inline def setTypes(value: js.Array[String]): Self = StObject.set(x, "types", value.asInstanceOf[js.Any])
    
    inline def setTypesVarargs(value: String*): Self = StObject.set(x, "types", js.Array(value :_*))
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUtc_offset(value: String): Self = StObject.set(x, "utc_offset", value.asInstanceOf[js.Any])
  }
}
