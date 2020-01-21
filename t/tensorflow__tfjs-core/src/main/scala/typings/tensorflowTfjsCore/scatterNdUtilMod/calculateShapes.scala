package typings.tensorflowTfjsCore.scatterNdUtilMod

import typings.tensorflowTfjsCore.distTypesMod.Rank
import typings.tensorflowTfjsCore.tensorMod.Tensor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/ops/scatter_nd_util", "calculateShapes")
@js.native
object calculateShapes extends js.Object {
  def apply(updates: Tensor[Rank], indices: Tensor[Rank], shape: js.Array[Double]): ScatterShapeInfo = js.native
}

