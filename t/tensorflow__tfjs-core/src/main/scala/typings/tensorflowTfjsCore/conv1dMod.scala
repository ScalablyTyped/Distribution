package typings.tensorflowTfjsCore

import typings.tensorflowTfjsCore.convUtilMod.ExplicitPadding
import typings.tensorflowTfjsCore.distTypesMod.TensorLike
import typings.tensorflowTfjsCore.tensorMod.Tensor2D
import typings.tensorflowTfjsCore.tensorMod.Tensor3D
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.NCW
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.NWC
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.ceil
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.floor
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.round
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.same_
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.valid_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/ops/conv1d", JSImport.Namespace)
@js.native
object conv1dMod extends js.Object {
  @js.native
  object conv1d extends js.Object {
    def apply[T /* <: Tensor2D | Tensor3D */](
      x: T | TensorLike,
      filter: Tensor3D | TensorLike,
      stride: Double,
      pad: valid_ | same_ | Double | ExplicitPadding,
      dataFormat: js.UndefOr[NWC | NCW],
      dilation: js.UndefOr[Double],
      dimRoundingMode: js.UndefOr[floor | round | ceil]
    ): T = js.native
  }
  
}

