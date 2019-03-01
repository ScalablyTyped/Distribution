package typings
package topojsonDashSpecificationLib.topojsonDashSpecificationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MultiLineString[P /* <: Properties */]
  extends GeometryObjectA[P]
     with GeometryObject[P] {
  var arcs: js.Array[ArcIndexes]
  @JSName("type")
  var type_MultiLineString: topojsonDashSpecificationLib.topojsonDashSpecificationLibStrings.MultiLineString
}

object MultiLineString {
  @scala.inline
  def apply[P /* <: Properties */](
    arcs: js.Array[ArcIndexes],
    `type`: topojsonDashSpecificationLib.topojsonDashSpecificationLibStrings.MultiLineString,
    bbox: geojsonLib.geojsonMod.BBox = null,
    id: scala.Double | java.lang.String = null,
    properties: P = null
  ): MultiLineString[P] = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("arcs")(arcs)
    if (bbox != null) __obj.updateDynamic("bbox")(bbox.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (properties != null) __obj.updateDynamic("properties")(properties.asInstanceOf[js.Any])
    __obj.asInstanceOf[MultiLineString[P]]
  }
}

