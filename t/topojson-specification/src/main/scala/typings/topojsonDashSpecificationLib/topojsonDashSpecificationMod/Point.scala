package typings
package topojsonDashSpecificationLib.topojsonDashSpecificationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Point[P /* <: Properties */]
  extends GeometryObjectA[P]
     with GeometryObject[P] {
  var coordinates: Positions
  @JSName("type")
  var type_Point: topojsonDashSpecificationLib.topojsonDashSpecificationLibStrings.Point
}

object Point {
  @scala.inline
  def apply[P /* <: Properties */](
    coordinates: Positions,
    `type`: topojsonDashSpecificationLib.topojsonDashSpecificationLibStrings.Point,
    bbox: geojsonLib.geojsonMod.BBox = null,
    id: scala.Double | java.lang.String = null,
    properties: P = null
  ): Point[P] = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("coordinates")(coordinates)
    if (bbox != null) __obj.updateDynamic("bbox")(bbox.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (properties != null) __obj.updateDynamic("properties")(properties.asInstanceOf[js.Any])
    __obj.asInstanceOf[Point[P]]
  }
}

