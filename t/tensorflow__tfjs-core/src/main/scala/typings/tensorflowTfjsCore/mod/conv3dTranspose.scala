package typings.tensorflowTfjsCore.mod

import typings.tensorflowTfjsCore.distTypesMod.TensorLike
import typings.tensorflowTfjsCore.tensorMod.Tensor4D
import typings.tensorflowTfjsCore.tensorMod.Tensor5D
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.same_
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.valid_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core", "conv3dTranspose")
@js.native
object conv3dTranspose extends js.Object {
  def apply[T /* <: Tensor4D | Tensor5D */](
    x: T | TensorLike,
    filter: Tensor5D | TensorLike,
    outputShape: (js.Tuple5[Double, Double, Double, Double, Double]) | (js.Tuple4[Double, Double, Double, Double]),
    strides: (js.Tuple3[Double, Double, Double]) | Double,
    pad: valid_ | same_
  ): T = js.native
}

