package typings.tensorflowTfjsCore

import typings.tensorflowTfjsCore.distTypesMod.Rank
import typings.tensorflowTfjsCore.distTypesMod.TensorLike
import typings.tensorflowTfjsCore.tensorMod.Tensor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/ops/add_n", JSImport.Namespace)
@js.native
object addNMod extends js.Object {
  @js.native
  object addN extends js.Object {
    def apply[T /* <: Tensor[Rank] */](tensors: js.Array[T | TensorLike]): T = js.native
  }
  
}

