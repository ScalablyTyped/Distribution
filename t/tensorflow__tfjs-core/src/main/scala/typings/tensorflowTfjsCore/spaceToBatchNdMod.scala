package typings.tensorflowTfjsCore

import typings.tensorflowTfjsCore.distTypesMod.Rank
import typings.tensorflowTfjsCore.distTypesMod.TensorLike
import typings.tensorflowTfjsCore.tensorMod.Tensor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/ops/space_to_batch_nd", JSImport.Namespace)
@js.native
object spaceToBatchNdMod extends js.Object {
  @js.native
  object spaceToBatchND extends js.Object {
    def apply[T /* <: Tensor[Rank] */](x: T, blockShape: js.Array[Double], paddings: js.Array[js.Array[Double]]): T = js.native
    def apply[T /* <: Tensor[Rank] */](x: TensorLike, blockShape: js.Array[Double], paddings: js.Array[js.Array[Double]]): T = js.native
  }
  
}

