package typings.topojsonDashSpecification.topojsonDashSpecificationMod

import typings.geojson.geojsonMod.BBox
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MultiPoint[P /* <: Properties */]
  extends GeometryObjectA[P]
     with GeometryObject[P] {
  var coordinates: js.Array[Positions]
  @JSName("type")
  var type_MultiPoint: typings.topojsonDashSpecification.topojsonDashSpecificationStrings.MultiPoint
}

object MultiPoint {
  @scala.inline
  def apply[P /* <: Properties */](
    coordinates: js.Array[Positions],
    `type`: typings.topojsonDashSpecification.topojsonDashSpecificationStrings.MultiPoint,
    bbox: BBox = null,
    id: Double | String = null,
    properties: P = null
  ): MultiPoint[P] = {
    val __obj = js.Dynamic.literal(coordinates = coordinates)
    __obj.updateDynamic("type")(`type`)
    if (bbox != null) __obj.updateDynamic("bbox")(bbox.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (properties != null) __obj.updateDynamic("properties")(properties.asInstanceOf[js.Any])
    __obj.asInstanceOf[MultiPoint[P]]
  }
}

