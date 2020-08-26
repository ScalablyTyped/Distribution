package typings.tensorflowTfjsCore

import typings.tensorflowTfjsCore.distTypesMod.Rank
import typings.tensorflowTfjsCore.distTypesMod.TensorLike
import typings.tensorflowTfjsCore.tensorMod.Tensor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/ops/real", JSImport.Namespace)
@js.native
object realMod extends js.Object {
  @js.native
  object real extends js.Object {
    def apply[T /* <: Tensor[Rank] */](input: T): T = js.native
    def apply[T /* <: Tensor[Rank] */](input: TensorLike): T = js.native
  }
  
}

