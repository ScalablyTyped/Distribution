package typings.tensorflowTfjsNode.mod

import typings.tensorflowTfjsCore.distTypesMod.TensorLike
import typings.tensorflowTfjsCore.tensorMod.Tensor
import typings.tensorflowTfjsCore.tensorMod.Tensor1D
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-node", "batchNorm")
@js.native
object batchNorm extends js.Object {
  def apply[R /* <: typings.tensorflowTfjsCore.distTypesMod.Rank */](
    x: Tensor[R] | TensorLike,
    mean: Tensor[R] | Tensor1D | TensorLike,
    variance: Tensor[R] | Tensor1D | TensorLike,
    offset: js.UndefOr[Tensor[R] | Tensor1D | TensorLike],
    scale: js.UndefOr[Tensor[R] | Tensor1D | TensorLike],
    varianceEpsilon: js.UndefOr[Double]
  ): Tensor[R] = js.native
}

