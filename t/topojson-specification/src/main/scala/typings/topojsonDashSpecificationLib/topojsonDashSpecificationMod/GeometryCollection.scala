package typings
package topojsonDashSpecificationLib.topojsonDashSpecificationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GeometryCollection[P /* <: Properties */]
  extends GeometryObjectA[P]
     with GeometryObject[P] {
  var geometries: js.Array[GeometryObject[P]]
  @JSName("type")
  var type_GeometryCollection: topojsonDashSpecificationLib.topojsonDashSpecificationLibStrings.GeometryCollection
}

object GeometryCollection {
  @scala.inline
  def apply[P /* <: Properties */](
    geometries: js.Array[GeometryObject[P]],
    `type`: topojsonDashSpecificationLib.topojsonDashSpecificationLibStrings.GeometryCollection,
    bbox: geojsonLib.geojsonMod.BBox = null,
    id: scala.Double | java.lang.String = null,
    properties: P = null
  ): GeometryCollection[P] = {
    val __obj = js.Dynamic.literal(geometries = geometries)
    __obj.updateDynamic("type")(`type`)
    if (bbox != null) __obj.updateDynamic("bbox")(bbox.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (properties != null) __obj.updateDynamic("properties")(properties.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeometryCollection[P]]
  }
}

