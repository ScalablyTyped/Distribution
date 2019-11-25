package typings.twit.twitMod.Twitter

import typings.geojson.geojsonMod.Point
import typings.geojson.geojsonMod.Polygon
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Place extends js.Object {
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
}

