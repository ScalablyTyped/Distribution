package typings.tensorflowTfjsCore

import typings.tensorflowTfjsCore.convUtilMod.ExplicitPadding
import typings.tensorflowTfjsCore.distTypesMod.Rank.R3
import typings.tensorflowTfjsCore.distTypesMod.Rank.R4
import typings.tensorflowTfjsCore.tensorMod.Tensor
import typings.tensorflowTfjsCore.tensorMod.Tensor4D
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.NCHW
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.NHWC
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.ceil
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.floor
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.round
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.same_
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.valid_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/ops/conv2d_backprop_input", JSImport.Namespace)
@js.native
object conv2dBackpropInputMod extends js.Object {
  @js.native
  object conv2DBackpropInput extends js.Object {
    def apply(
      xShape: (js.Tuple3[Double, Double, Double]) | (js.Tuple4[Double, Double, Double, Double]),
      dy: Tensor[R3 | R4],
      filter: Tensor4D,
      strides: Double | (js.Tuple2[Double, Double]),
      pad: Double | ExplicitPadding | same_ | valid_,
      dataFormat: js.UndefOr[NCHW | NHWC],
      dimRoundingMode: js.UndefOr[ceil | floor | round]
    ): Tensor[R3] = js.native
  }
  
}

