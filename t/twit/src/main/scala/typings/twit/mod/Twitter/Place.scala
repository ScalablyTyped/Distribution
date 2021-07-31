package typings.twit.mod.Twitter

import typings.geojson.mod.Point
import typings.geojson.mod.Polygon
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Place extends StObject {
  
  var attributes: PlaceAttribute
  
  var bounding_box: Polygon
  
  var contained_within: js.Array[Place]
  
  var country: String
  
  var country_code: String
  
  var full_name: String
  
  var geometry: Point
  
  var id: String
  
  var name: String
  
  var place_type: String
  
  var url: String
}
object Place {
  
  @scala.inline
  def apply(
    attributes: PlaceAttribute,
    bounding_box: Polygon,
    contained_within: js.Array[Place],
    country: String,
    country_code: String,
    full_name: String,
    geometry: Point,
    id: String,
    name: String,
    place_type: String,
    url: String
  ): Place = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], bounding_box = bounding_box.asInstanceOf[js.Any], contained_within = contained_within.asInstanceOf[js.Any], country = country.asInstanceOf[js.Any], country_code = country_code.asInstanceOf[js.Any], full_name = full_name.asInstanceOf[js.Any], geometry = geometry.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], place_type = place_type.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Place]
  }
  
  @scala.inline
  implicit class PlaceMutableBuilder[Self <: Place] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttributes(value: PlaceAttribute): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBounding_box(value: Polygon): Self = StObject.set(x, "bounding_box", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContained_within(value: js.Array[Place]): Self = StObject.set(x, "contained_within", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContained_withinVarargs(value: Place*): Self = StObject.set(x, "contained_within", js.Array(value :_*))
    
    @scala.inline
    def setCountry(value: String): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountry_code(value: String): Self = StObject.set(x, "country_code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFull_name(value: String): Self = StObject.set(x, "full_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGeometry(value: Point): Self = StObject.set(x, "geometry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlace_type(value: String): Self = StObject.set(x, "place_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
