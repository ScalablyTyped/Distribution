package typings
package topojsonDashSpecificationLib.topojsonDashSpecificationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LineString[P /* <: Properties */]
  extends GeometryObjectA[P]
     with GeometryObject[P] {
  var arcs: ArcIndexes
  @JSName("type")
  var type_LineString: topojsonDashSpecificationLib.topojsonDashSpecificationLibStrings.LineString
}

object LineString {
  @scala.inline
  def apply[P /* <: Properties */](
    arcs: ArcIndexes,
    `type`: topojsonDashSpecificationLib.topojsonDashSpecificationLibStrings.LineString,
    bbox: geojsonLib.geojsonMod.BBox = null,
    id: scala.Double | java.lang.String = null,
    properties: P = null
  ): LineString[P] = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("arcs")(arcs)
    if (bbox != null) __obj.updateDynamic("bbox")(bbox.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (properties != null) __obj.updateDynamic("properties")(properties.asInstanceOf[js.Any])
    __obj.asInstanceOf[LineString[P]]
  }
}

