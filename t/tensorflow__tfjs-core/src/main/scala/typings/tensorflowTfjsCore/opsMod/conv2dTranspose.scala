package typings.tensorflowTfjsCore.opsMod

import typings.tensorflowTfjsCore.distTypesMod.TensorLike
import typings.tensorflowTfjsCore.tensorMod.Tensor3D
import typings.tensorflowTfjsCore.tensorMod.Tensor4D
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.same_
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.valid_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/ops/ops", "conv2dTranspose")
@js.native
object conv2dTranspose extends js.Object {
  def apply[T /* <: Tensor3D | Tensor4D */](
    x: T | TensorLike,
    filter: Tensor4D | TensorLike,
    outputShape: (js.Tuple4[Double, Double, Double, Double]) | (js.Tuple3[Double, Double, Double]),
    strides: (js.Tuple2[Double, Double]) | Double,
    pad: valid_ | same_ | Double,
    dimRoundingMode: js.UndefOr[
      typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.floor | typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.round | typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.ceil
    ]
  ): T = js.native
}

