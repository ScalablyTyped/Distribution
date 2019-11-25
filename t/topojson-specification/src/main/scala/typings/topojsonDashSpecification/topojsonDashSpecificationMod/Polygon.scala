package typings.topojsonDashSpecification.topojsonDashSpecificationMod

import typings.geojson.geojsonMod.BBox
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Polygon[P /* <: Properties */]
  extends GeometryObjectA[P]
     with GeometryObject[P] {
  var arcs: js.Array[ArcIndexes]
  @JSName("type")
  var type_Polygon: typings.topojsonDashSpecification.topojsonDashSpecificationStrings.Polygon
}

object Polygon {
  @scala.inline
  def apply[P /* <: Properties */](
    arcs: js.Array[ArcIndexes],
    `type`: typings.topojsonDashSpecification.topojsonDashSpecificationStrings.Polygon,
    bbox: BBox = null,
    id: Double | String = null,
    properties: P = null
  ): Polygon[P] = {
    val __obj = js.Dynamic.literal(arcs = arcs.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (bbox != null) __obj.updateDynamic("bbox")(bbox.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (properties != null) __obj.updateDynamic("properties")(properties.asInstanceOf[js.Any])
    __obj.asInstanceOf[Polygon[P]]
  }
}

