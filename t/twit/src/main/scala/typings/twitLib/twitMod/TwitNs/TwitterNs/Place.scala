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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("attributes")(attributes)
    __obj.updateDynamic("bounding_box")(bounding_box)
    __obj.updateDynamic("contained_within")(contained_within)
    __obj.updateDynamic("country")(country)
    __obj.updateDynamic("country_code")(country_code)
    __obj.updateDynamic("full_name")(full_name)
    __obj.updateDynamic("geometry")(geometry)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("place_type")(place_type)
    __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[Place]
  }
}

