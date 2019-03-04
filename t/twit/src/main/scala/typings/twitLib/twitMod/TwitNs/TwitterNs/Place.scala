package typings
package twitLib.twitMod.TwitNs.TwitterNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Place extends js.Object {
  var attributes: PlaceAttribute
  var bounding_box: geojsonLib.geojsonMod.Polygon
  var contained_within: js.Array[Place]
  var country: java.lang.String
  var country_code: java.lang.String
  var full_name: java.lang.String
  var geometry: geojsonLib.geojsonMod.Point
  var id: java.lang.String
  var name: java.lang.String
  var place_type: java.lang.String
  var url: java.lang.String
}

object Place {
  @scala.inline
  def apply(
    attributes: PlaceAttribute,
    bounding_box: geojsonLib.geojsonMod.Polygon,
    contained_within: js.Array[Place],
    country: java.lang.String,
    country_code: java.lang.String,
    full_name: java.lang.String,
    geometry: geojsonLib.geojsonMod.Point,
    id: java.lang.String,
    name: java.lang.String,
    place_type: java.lang.String,
    url: java.lang.String
  ): Place = {
    val __obj = js.Dynamic.literal(attributes = attributes, bounding_box = bounding_box, contained_within = contained_within, country = country, country_code = country_code, full_name = full_name, geometry = geometry, id = id, name = name, place_type = place_type, url = url)
  
    __obj.asInstanceOf[Place]
  }
}

