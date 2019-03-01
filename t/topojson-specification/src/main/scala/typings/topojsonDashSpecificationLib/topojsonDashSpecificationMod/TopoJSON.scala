package typings
package topojsonDashSpecificationLib.topojsonDashSpecificationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TopoJSON extends js.Object {
  var bbox: js.UndefOr[geojsonLib.geojsonMod.BBox] = js.undefined
  var `type`: topojsonDashSpecificationLib.topojsonDashSpecificationLibStrings.Topology | geojsonLib.geojsonMod.GeoJsonGeometryTypes | scala.Null
}

object TopoJSON {
  @scala.inline
  def apply(
    bbox: geojsonLib.geojsonMod.BBox = null,
    `type`: topojsonDashSpecificationLib.topojsonDashSpecificationLibStrings.Topology | geojsonLib.geojsonMod.GeoJsonGeometryTypes = null
  ): TopoJSON = {
    val __obj = js.Dynamic.literal()
    if (bbox != null) __obj.updateDynamic("bbox")(bbox.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TopoJSON]
  }
}

