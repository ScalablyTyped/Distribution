package typings.tensorflowTfjsCore

import typings.tensorflowTfjsCore.distTypesMod.Rank
import typings.tensorflowTfjsCore.distTypesMod.TensorLike
import typings.tensorflowTfjsCore.tensorMod.Tensor
import typings.tensorflowTfjsCore.tensorMod.Tensor1D
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/ops/batchnorm", JSImport.Namespace)
@js.native
object batchnormMod extends js.Object {
  @js.native
  object batchNorm extends js.Object {
    def apply[R /* <: Rank */](
      x: Tensor[R] | TensorLike,
      mean: Tensor[R] | Tensor1D | TensorLike,
      variance: Tensor[R] | Tensor1D | TensorLike
    ): Tensor[R] = js.native
    def apply[R /* <: Rank */](
      x: Tensor[R] | TensorLike,
      mean: Tensor[R] | Tensor1D | TensorLike,
      variance: Tensor[R] | Tensor1D | TensorLike,
      offset: Tensor[R] | Tensor1D | TensorLike
    ): Tensor[R] = js.native
    def apply[R /* <: Rank */](
      x: Tensor[R] | TensorLike,
      mean: Tensor[R] | Tensor1D | TensorLike,
      variance: Tensor[R] | Tensor1D | TensorLike,
      offset: Tensor[R] | Tensor1D | TensorLike,
      scale: Tensor[R] | Tensor1D | TensorLike
    ): Tensor[R] = js.native
    def apply[R /* <: Rank */](
      x: Tensor[R] | TensorLike,
      mean: Tensor[R] | Tensor1D | TensorLike,
      variance: Tensor[R] | Tensor1D | TensorLike,
      offset: Tensor[R] | Tensor1D | TensorLike,
      scale: Tensor[R] | Tensor1D | TensorLike,
      varianceEpsilon: Double
    ): Tensor[R] = js.native
  }
  
  @js.native
  object batchNormalization extends js.Object {
    def apply[R /* <: Rank */](
      x: Tensor[R] | TensorLike,
      mean: Tensor[R] | Tensor1D | TensorLike,
      variance: Tensor[R] | Tensor1D | TensorLike
    ): Tensor[R] = js.native
    def apply[R /* <: Rank */](
      x: Tensor[R] | TensorLike,
      mean: Tensor[R] | Tensor1D | TensorLike,
      variance: Tensor[R] | Tensor1D | TensorLike,
      varianceEpsilon: Double
    ): Tensor[R] = js.native
    def apply[R /* <: Rank */](
      x: Tensor[R] | TensorLike,
      mean: Tensor[R] | Tensor1D | TensorLike,
      variance: Tensor[R] | Tensor1D | TensorLike,
      varianceEpsilon: Double,
      scale: Tensor[R] | Tensor1D | TensorLike
    ): Tensor[R] = js.native
    def apply[R /* <: Rank */](
      x: Tensor[R] | TensorLike,
      mean: Tensor[R] | Tensor1D | TensorLike,
      variance: Tensor[R] | Tensor1D | TensorLike,
      varianceEpsilon: Double,
      scale: Tensor[R] | Tensor1D | TensorLike,
      offset: Tensor[R] | Tensor1D | TensorLike
    ): Tensor[R] = js.native
  }
  
}

