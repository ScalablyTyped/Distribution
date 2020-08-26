package typings.tensorflowTfjsCore.mod

import typings.tensorflowTfjsCore.convUtilMod.ExplicitPadding
import typings.tensorflowTfjsCore.distTypesMod.TensorLike
import typings.tensorflowTfjsCore.tensorMod.Tensor3D
import typings.tensorflowTfjsCore.tensorMod.Tensor4D
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.NCHW
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.NHWC
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.same_
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.valid_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core", "conv2d")
@js.native
object conv2d extends js.Object {
  def apply[T /* <: Tensor3D | Tensor4D */](
    x: T | TensorLike,
    filter: Tensor4D | TensorLike,
    strides: (js.Tuple2[Double, Double]) | Double,
    pad: valid_ | same_ | Double | ExplicitPadding,
    dataFormat: js.UndefOr[NHWC | NCHW],
    dilations: js.UndefOr[(js.Tuple2[Double, Double]) | Double],
    dimRoundingMode: js.UndefOr[
      typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.floor | typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.round | typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.ceil
    ]
  ): T = js.native
}

