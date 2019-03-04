package typings
package threeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Geometry extends js.Object {
  var geometry: threeLib.threeDashCoreMod.Geometry
  var materials: js.UndefOr[js.Array[threeLib.threeDashCoreMod.Material]] = js.undefined
}

object Anon_Geometry {
  @scala.inline
  def apply(
    geometry: threeLib.threeDashCoreMod.Geometry,
    materials: js.Array[threeLib.threeDashCoreMod.Material] = null
  ): Anon_Geometry = {
    val __obj = js.Dynamic.literal(geometry = geometry)
    if (materials != null) __obj.updateDynamic("materials")(materials)
    __obj.asInstanceOf[Anon_Geometry]
  }
}

