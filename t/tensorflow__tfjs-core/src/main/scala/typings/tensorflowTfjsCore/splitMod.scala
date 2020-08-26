package typings.tensorflowTfjsCore

import typings.tensorflowTfjsCore.distTypesMod.Rank
import typings.tensorflowTfjsCore.distTypesMod.TensorLike
import typings.tensorflowTfjsCore.tensorMod.Tensor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/ops/split", JSImport.Namespace)
@js.native
object splitMod extends js.Object {
  @js.native
  object split extends js.Object {
    def apply[T /* <: Tensor[Rank] */](x: TensorLike, numOrSizeSplits: js.Array[Double]): js.Array[T] = js.native
    def apply[T /* <: Tensor[Rank] */](x: TensorLike, numOrSizeSplits: js.Array[Double], axis: Double): js.Array[T] = js.native
    def apply[T /* <: Tensor[Rank] */](x: TensorLike, numOrSizeSplits: Double): js.Array[T] = js.native
    def apply[T /* <: Tensor[Rank] */](x: TensorLike, numOrSizeSplits: Double, axis: Double): js.Array[T] = js.native
    def apply[T /* <: Tensor[Rank] */](x: Tensor[Rank], numOrSizeSplits: js.Array[Double]): js.Array[T] = js.native
    def apply[T /* <: Tensor[Rank] */](x: Tensor[Rank], numOrSizeSplits: js.Array[Double], axis: Double): js.Array[T] = js.native
    def apply[T /* <: Tensor[Rank] */](x: Tensor[Rank], numOrSizeSplits: Double): js.Array[T] = js.native
    def apply[T /* <: Tensor[Rank] */](x: Tensor[Rank], numOrSizeSplits: Double, axis: Double): js.Array[T] = js.native
  }
  
}

