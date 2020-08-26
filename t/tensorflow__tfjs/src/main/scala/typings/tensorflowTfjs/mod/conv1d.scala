package typings.tensorflowTfjs.mod

import typings.tensorflowTfjs.tensorflowTfjsStrings.NCW
import typings.tensorflowTfjs.tensorflowTfjsStrings.NWC
import typings.tensorflowTfjs.tensorflowTfjsStrings.same
import typings.tensorflowTfjs.tensorflowTfjsStrings.valid
import typings.tensorflowTfjsCore.convUtilMod.ExplicitPadding
import typings.tensorflowTfjsCore.distTypesMod.TensorLike
import typings.tensorflowTfjsCore.tensorMod.Tensor2D
import typings.tensorflowTfjsCore.tensorMod.Tensor3D
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs", "conv1d")
@js.native
object conv1d extends js.Object {
  def apply[T /* <: Tensor2D | Tensor3D */](
    x: T | TensorLike,
    filter: Tensor3D | TensorLike,
    stride: Double,
    pad: valid | same | Double | ExplicitPadding,
    dataFormat: js.UndefOr[NWC | NCW],
    dilation: js.UndefOr[Double],
    dimRoundingMode: js.UndefOr[
      typings.tensorflowTfjs.tensorflowTfjsStrings.floor | typings.tensorflowTfjs.tensorflowTfjsStrings.round | typings.tensorflowTfjs.tensorflowTfjsStrings.ceil
    ]
  ): T = js.native
}

