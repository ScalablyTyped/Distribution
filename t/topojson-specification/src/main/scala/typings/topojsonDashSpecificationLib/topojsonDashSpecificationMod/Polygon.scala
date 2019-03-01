package typings
package topojsonDashSpecificationLib.topojsonDashSpecificationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Polygon[P /* <: Properties */]
  extends GeometryObjectA[P]
     with GeometryObject[P] {
  var arcs: js.Array[ArcIndexes]
  @JSName("type")
  var type_Polygon: topojsonDashSpecificationLib.topojsonDashSpecificationLibStrings.Polygon
}

object Polygon {
  @scala.inline
  def apply[P /* <: Properties */](
    arcs: js.Array[ArcIndexes],
    `type`: topojsonDashSpecificationLib.topojsonDashSpecificationLibStrings.Polygon,
    bbox: geojsonLib.geojsonMod.BBox = null,
    id: scala.Double | java.lang.String = null,
    properties: P = null
  ): Polygon[P] = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("arcs")(arcs)
    if (bbox != null) __obj.updateDynamic("bbox")(bbox.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (properties != null) __obj.updateDynamic("properties")(properties.asInstanceOf[js.Any])
    __obj.asInstanceOf[Polygon[P]]
  }
}

