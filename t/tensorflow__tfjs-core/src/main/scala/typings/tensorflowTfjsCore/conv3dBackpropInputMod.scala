package typings.tensorflowTfjsCore

import typings.tensorflowTfjsCore.distTypesMod.Rank.R4
import typings.tensorflowTfjsCore.distTypesMod.Rank.R5
import typings.tensorflowTfjsCore.tensorMod.Tensor
import typings.tensorflowTfjsCore.tensorMod.Tensor5D
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.same_
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.valid_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/ops/conv3d_backprop_input", JSImport.Namespace)
@js.native
object conv3dBackpropInputMod extends js.Object {
  @js.native
  object conv3DBackpropInput extends js.Object {
    def apply(
      xShape: js.Tuple4[Double, Double, Double, Double],
      dy: Tensor[R4 | R5],
      filter: Tensor5D,
      strides: js.Tuple3[Double, Double, Double],
      pad: same_
    ): Tensor[R4] = js.native
    def apply(
      xShape: js.Tuple4[Double, Double, Double, Double],
      dy: Tensor[R4 | R5],
      filter: Tensor5D,
      strides: js.Tuple3[Double, Double, Double],
      pad: valid_
    ): Tensor[R4] = js.native
    def apply(
      xShape: js.Tuple4[Double, Double, Double, Double],
      dy: Tensor[R4 | R5],
      filter: Tensor5D,
      strides: Double,
      pad: same_
    ): Tensor[R4] = js.native
    def apply(
      xShape: js.Tuple4[Double, Double, Double, Double],
      dy: Tensor[R4 | R5],
      filter: Tensor5D,
      strides: Double,
      pad: valid_
    ): Tensor[R4] = js.native
    def apply(
      xShape: js.Tuple5[Double, Double, Double, Double, Double],
      dy: Tensor[R4 | R5],
      filter: Tensor5D,
      strides: js.Tuple3[Double, Double, Double],
      pad: same_
    ): Tensor[R4] = js.native
    def apply(
      xShape: js.Tuple5[Double, Double, Double, Double, Double],
      dy: Tensor[R4 | R5],
      filter: Tensor5D,
      strides: js.Tuple3[Double, Double, Double],
      pad: valid_
    ): Tensor[R4] = js.native
    def apply(
      xShape: js.Tuple5[Double, Double, Double, Double, Double],
      dy: Tensor[R4 | R5],
      filter: Tensor5D,
      strides: Double,
      pad: same_
    ): Tensor[R4] = js.native
    def apply(
      xShape: js.Tuple5[Double, Double, Double, Double, Double],
      dy: Tensor[R4 | R5],
      filter: Tensor5D,
      strides: Double,
      pad: valid_
    ): Tensor[R4] = js.native
  }
  
}

