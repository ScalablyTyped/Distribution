package typings
package topojsonLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Geometries extends js.Object {
  var geometries: js.Array[
    topojsonDashSpecificationLib.topojsonDashSpecificationMod.Polygon[js.Object] | topojsonDashSpecificationLib.topojsonDashSpecificationMod.MultiPolygon[js.Object]
  ]
  var `type`: topojsonLib.topojsonLibStrings.GeometryCollection
}

object Anon_Geometries {
  @scala.inline
  def apply(
    geometries: js.Array[
      topojsonDashSpecificationLib.topojsonDashSpecificationMod.Polygon[js.Object] | topojsonDashSpecificationLib.topojsonDashSpecificationMod.MultiPolygon[js.Object]
    ],
    `type`: topojsonLib.topojsonLibStrings.GeometryCollection
  ): Anon_Geometries = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("geometries")(geometries)
    __obj.asInstanceOf[Anon_Geometries]
  }
}

