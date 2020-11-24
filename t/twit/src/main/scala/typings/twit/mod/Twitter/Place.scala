package typings.twit.mod.Twitter

import typings.geojson.mod.Point
import typings.geojson.mod.Polygon
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Place extends js.Object {
  
  var attributes: PlaceAttribute = js.native
  
  var bounding_box: Polygon = js.native
  
  var contained_within: js.Array[Place] = js.native
  
  var country: String = js.native
  
  var country_code: String = js.native
  
  var full_name: String = js.native
  
  var geometry: Point = js.native
  
  var id: String = js.native
  
  var name: String = js.native
  
  var place_type: String = js.native
  
  var url: String = js.native
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
  implicit class PlaceOps[Self <: Place] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAttributes(value: PlaceAttribute): Self = this.set("attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBounding_box(value: Polygon): Self = this.set("bounding_box", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContained_withinVarargs(value: Place*): Self = this.set("contained_within", js.Array(value :_*))
    
    @scala.inline
    def setContained_within(value: js.Array[Place]): Self = this.set("contained_within", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountry(value: String): Self = this.set("country", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountry_code(value: String): Self = this.set("country_code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFull_name(value: String): Self = this.set("full_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGeometry(value: Point): Self = this.set("geometry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlace_type(value: String): Self = this.set("place_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
  }
}
