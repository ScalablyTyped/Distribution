package typings.topojsonDashSpecification.topojsonDashSpecificationMod

import typings.geojson.geojsonMod.BBox
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Point[P /* <: Properties */]
  extends GeometryObjectA[P]
     with GeometryObject[P] {
  var coordinates: Positions
  @JSName("type")
  var type_Point: typings.topojsonDashSpecification.topojsonDashSpecificationStrings.Point
}

object Point {
  @scala.inline
  def apply[P /* <: Properties */](
    coordinates: Positions,
    `type`: typings.topojsonDashSpecification.topojsonDashSpecificationStrings.Point,
    bbox: BBox = null,
    id: Double | String = null,
    properties: P = null
  ): Point[P] = {
    val __obj = js.Dynamic.literal(coordinates = coordinates)
    __obj.updateDynamic("type")(`type`)
    if (bbox != null) __obj.updateDynamic("bbox")(bbox.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (properties != null) __obj.updateDynamic("properties")(properties.asInstanceOf[js.Any])
    __obj.asInstanceOf[Point[P]]
  }
}

