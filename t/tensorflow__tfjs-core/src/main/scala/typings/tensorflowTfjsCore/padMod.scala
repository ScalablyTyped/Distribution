package typings.tensorflowTfjsCore

import typings.tensorflowTfjsCore.distTypesMod.Rank
import typings.tensorflowTfjsCore.distTypesMod.TensorLike
import typings.tensorflowTfjsCore.tensorMod.Tensor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/ops/pad", JSImport.Namespace)
@js.native
object padMod extends js.Object {
  @js.native
  object pad extends js.Object {
    def apply[T /* <: Tensor[Rank] */](x: T, paddings: js.Array[js.Tuple2[Double, Double]]): T = js.native
    def apply[T /* <: Tensor[Rank] */](x: T, paddings: js.Array[js.Tuple2[Double, Double]], constantValue: Double): T = js.native
    def apply[T /* <: Tensor[Rank] */](x: TensorLike, paddings: js.Array[js.Tuple2[Double, Double]]): T = js.native
    def apply[T /* <: Tensor[Rank] */](x: TensorLike, paddings: js.Array[js.Tuple2[Double, Double]], constantValue: Double): T = js.native
  }
  
}

