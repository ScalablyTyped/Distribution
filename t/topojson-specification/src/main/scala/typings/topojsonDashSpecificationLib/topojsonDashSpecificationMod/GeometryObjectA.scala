package typings
package topojsonDashSpecificationLib.topojsonDashSpecificationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GeometryObjectA[P /* <: Properties */] extends TopoJSON {
  var id: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var properties: js.UndefOr[P] = js.undefined
  @JSName("type")
  var type_GeometryObjectA: geojsonLib.geojsonMod.GeoJsonGeometryTypes | scala.Null
}

object GeometryObjectA {
  @scala.inline
  def apply[P /* <: Properties */](
    bbox: geojsonLib.geojsonMod.BBox = null,
    id: scala.Double | java.lang.String = null,
    properties: P = null,
    `type`: geojsonLib.geojsonMod.GeoJsonGeometryTypes = null
  ): GeometryObjectA[P] = {
    val __obj = js.Dynamic.literal()
    if (bbox != null) __obj.updateDynamic("bbox")(bbox.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (properties != null) __obj.updateDynamic("properties")(properties.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeometryObjectA[P]]
  }
}

