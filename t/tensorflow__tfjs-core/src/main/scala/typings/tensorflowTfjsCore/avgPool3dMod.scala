package typings.tensorflowTfjsCore

import typings.tensorflowTfjsCore.distTypesMod.TensorLike
import typings.tensorflowTfjsCore.tensorMod.Tensor4D
import typings.tensorflowTfjsCore.tensorMod.Tensor5D
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.NCDHW
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.NDHWC
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.ceil
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.floor
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.round
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.same_
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.valid_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/ops/avg_pool_3d", JSImport.Namespace)
@js.native
object avgPool3dMod extends js.Object {
  @js.native
  object avgPool3d extends js.Object {
    def apply[T /* <: Tensor4D | Tensor5D */](
      x: T | TensorLike,
      filterSize: (js.Tuple3[Double, Double, Double]) | Double,
      strides: (js.Tuple3[Double, Double, Double]) | Double,
      pad: valid_ | same_ | Double,
      dimRoundingMode: js.UndefOr[floor | round | ceil],
      dataFormat: js.UndefOr[NDHWC | NCDHW],
      dilations: js.UndefOr[(js.Tuple3[Double, Double, Double]) | Double]
    ): T = js.native
  }
  
}

