package typings.wonderDotJs.distEs2015ComponentGeometryGeometryMod

import typings.wonderDotJs.distEs2015StructureFace3Mod.Face3
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GeometryDataType extends js.Object {
  var faces: js.UndefOr[js.Array[Face3]] = js.undefined
  var vertices: js.Array[Double]
}

object GeometryDataType {
  @scala.inline
  def apply(vertices: js.Array[Double], faces: js.Array[Face3] = null): GeometryDataType = {
    val __obj = js.Dynamic.literal(vertices = vertices)
    if (faces != null) __obj.updateDynamic("faces")(faces)
    __obj.asInstanceOf[GeometryDataType]
  }
}

