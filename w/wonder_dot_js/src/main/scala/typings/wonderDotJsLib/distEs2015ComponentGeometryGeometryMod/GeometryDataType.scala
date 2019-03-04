package typings
package wonderDotJsLib.distEs2015ComponentGeometryGeometryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GeometryDataType extends js.Object {
  var faces: js.UndefOr[js.Array[wonderDotJsLib.distEs2015StructureFace3Mod.Face3]] = js.undefined
  var vertices: js.Array[scala.Double]
}

object GeometryDataType {
  @scala.inline
  def apply(
    vertices: js.Array[scala.Double],
    faces: js.Array[wonderDotJsLib.distEs2015StructureFace3Mod.Face3] = null
  ): GeometryDataType = {
    val __obj = js.Dynamic.literal(vertices = vertices)
    if (faces != null) __obj.updateDynamic("faces")(faces)
    __obj.asInstanceOf[GeometryDataType]
  }
}

