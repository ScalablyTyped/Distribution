package typings
package topojsonDashSpecificationLib.topojsonDashSpecificationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MultiPoint[P /* <: Properties */]
  extends GeometryObjectA[P]
     with GeometryObject[P] {
  var coordinates: js.Array[Positions]
  @JSName("type")
  var type_MultiPoint: topojsonDashSpecificationLib.topojsonDashSpecificationLibStrings.MultiPoint
}

object MultiPoint {
  @scala.inline
  def apply[P /* <: Properties */](
    coordinates: js.Array[Positions],
    `type`: topojsonDashSpecificationLib.topojsonDashSpecificationLibStrings.MultiPoint,
    bbox: geojsonLib.geojsonMod.BBox = null,
    id: scala.Double | java.lang.String = null,
    properties: P = null
  ): MultiPoint[P] = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("coordinates")(coordinates)
    if (bbox != null) __obj.updateDynamic("bbox")(bbox.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (properties != null) __obj.updateDynamic("properties")(properties.asInstanceOf[js.Any])
    __obj.asInstanceOf[MultiPoint[P]]
  }
}

