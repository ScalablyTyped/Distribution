package typings.topojsonDashSpecification.topojsonDashSpecificationMod

import typings.geojson.geojsonMod.BBox
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MultiLineString[P /* <: Properties */]
  extends GeometryObjectA[P]
     with GeometryObject[P] {
  var arcs: js.Array[ArcIndexes]
  @JSName("type")
  var type_MultiLineString: typings.topojsonDashSpecification.topojsonDashSpecificationStrings.MultiLineString
}

object MultiLineString {
  @scala.inline
  def apply[P /* <: Properties */](
    arcs: js.Array[ArcIndexes],
    `type`: typings.topojsonDashSpecification.topojsonDashSpecificationStrings.MultiLineString,
    bbox: BBox = null,
    id: Double | String = null,
    properties: P = null
  ): MultiLineString[P] = {
    val __obj = js.Dynamic.literal(arcs = arcs.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (bbox != null) __obj.updateDynamic("bbox")(bbox.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (properties != null) __obj.updateDynamic("properties")(properties.asInstanceOf[js.Any])
    __obj.asInstanceOf[MultiLineString[P]]
  }
}

