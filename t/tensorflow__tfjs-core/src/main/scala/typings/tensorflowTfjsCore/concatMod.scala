package typings.tensorflowTfjsCore

import typings.tensorflowTfjsCore.distTypesMod.Rank
import typings.tensorflowTfjsCore.distTypesMod.TensorLike
import typings.tensorflowTfjsCore.tensorMod.Tensor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/ops/concat", JSImport.Namespace)
@js.native
object concatMod extends js.Object {
  @js.native
  object concat extends js.Object {
    def apply[T /* <: Tensor[Rank] */](tensors: js.Array[T | TensorLike]): T = js.native
    def apply[T /* <: Tensor[Rank] */](tensors: js.Array[T | TensorLike], axis: Double): T = js.native
  }
  
}

