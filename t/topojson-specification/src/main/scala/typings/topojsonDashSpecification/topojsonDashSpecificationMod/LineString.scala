package typings.topojsonDashSpecification.topojsonDashSpecificationMod

import typings.geojson.geojsonMod.BBox
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LineString[P /* <: Properties */]
  extends GeometryObjectA[P]
     with GeometryObject[P] {
  var arcs: ArcIndexes
  @JSName("type")
  var type_LineString: typings.topojsonDashSpecification.topojsonDashSpecificationStrings.LineString
}

object LineString {
  @scala.inline
  def apply[P /* <: Properties */](
    arcs: ArcIndexes,
    `type`: typings.topojsonDashSpecification.topojsonDashSpecificationStrings.LineString,
    bbox: BBox = null,
    id: Double | String = null,
    properties: P = null
  ): LineString[P] = {
    val __obj = js.Dynamic.literal(arcs = arcs)
    __obj.updateDynamic("type")(`type`)
    if (bbox != null) __obj.updateDynamic("bbox")(bbox.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (properties != null) __obj.updateDynamic("properties")(properties.asInstanceOf[js.Any])
    __obj.asInstanceOf[LineString[P]]
  }
}

