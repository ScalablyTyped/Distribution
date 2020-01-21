package typings.tensorflowTfjsCore

import typings.tensorflowTfjsCore.distTypesMod.Rank
import typings.tensorflowTfjsCore.distTypesMod.TensorLike
import typings.tensorflowTfjsCore.tensorMod.Tensor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/ops/topk", JSImport.Namespace)
@js.native
object topkMod extends js.Object {
  @js.native
  object topk extends js.Object {
    def apply[T /* <: Tensor[Rank] */](x: T): AnonIndices[T] = js.native
    def apply[T /* <: Tensor[Rank] */](x: T, k: Double): AnonIndices[T] = js.native
    def apply[T /* <: Tensor[Rank] */](x: T, k: Double, sorted: Boolean): AnonIndices[T] = js.native
    def apply[T /* <: Tensor[Rank] */](x: TensorLike): AnonIndices[T] = js.native
    def apply[T /* <: Tensor[Rank] */](x: TensorLike, k: Double): AnonIndices[T] = js.native
    def apply[T /* <: Tensor[Rank] */](x: TensorLike, k: Double, sorted: Boolean): AnonIndices[T] = js.native
  }
  
}

