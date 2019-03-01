package typings
package topojsonLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Counties extends js.Object {
  var counties: Anon_Geometries
  var nation: topojsonDashSpecificationLib.topojsonDashSpecificationMod.GeometryCollection[js.Object]
  var states: Anon_Geometries
}

object Anon_Counties {
  @scala.inline
  def apply(
    counties: Anon_Geometries,
    nation: topojsonDashSpecificationLib.topojsonDashSpecificationMod.GeometryCollection[js.Object],
    states: Anon_Geometries
  ): Anon_Counties = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("counties")(counties)
    __obj.updateDynamic("nation")(nation)
    __obj.updateDynamic("states")(states)
    __obj.asInstanceOf[Anon_Counties]
  }
}

