package typings.three

import typings.three.srcCoreGeometryMod.Geometry
import typings.three.srcMaterialsMaterialMod.Material
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Geometry extends js.Object {
  var geometry: Geometry
  var materials: js.UndefOr[js.Array[Material]] = js.undefined
}

object Anon_Geometry {
  @scala.inline
  def apply(geometry: Geometry, materials: js.Array[Material] = null): Anon_Geometry = {
    val __obj = js.Dynamic.literal(geometry = geometry)
    if (materials != null) __obj.updateDynamic("materials")(materials)
    __obj.asInstanceOf[Anon_Geometry]
  }
}

