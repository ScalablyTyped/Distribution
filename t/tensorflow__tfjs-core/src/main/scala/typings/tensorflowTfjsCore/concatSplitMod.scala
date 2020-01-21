package typings.tensorflowTfjsCore

import typings.tensorflowTfjsCore.distTypesMod.Rank
import typings.tensorflowTfjsCore.distTypesMod.TensorLike
import typings.tensorflowTfjsCore.tensorMod.Tensor
import typings.tensorflowTfjsCore.tensorMod.Tensor1D
import typings.tensorflowTfjsCore.tensorMod.Tensor2D
import typings.tensorflowTfjsCore.tensorMod.Tensor3D
import typings.tensorflowTfjsCore.tensorMod.Tensor4D
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/ops/concat_split", JSImport.Namespace)
@js.native
object concatSplitMod extends js.Object {
  val concat1d: js.Function1[/* tensors */ js.Array[Tensor1D | TensorLike], Tensor1D] = js.native
  val concat2d: js.Function2[/* tensors */ js.Array[Tensor2D | TensorLike], /* axis */ Double, Tensor2D] = js.native
  val concat3d: js.Function2[/* tensors */ js.Array[Tensor3D | TensorLike], /* axis */ Double, Tensor3D] = js.native
  val concat4d: js.Function2[/* tensors */ js.Array[Tensor4D | TensorLike], /* axis */ Double, Tensor4D] = js.native
  @js.native
  object concat extends js.Object {
    def apply[T /* <: Tensor[Rank] */](tensors: js.Array[T | TensorLike]): T = js.native
    def apply[T /* <: Tensor[Rank] */](tensors: js.Array[T | TensorLike], axis: Double): T = js.native
  }
  
  @js.native
  object split extends js.Object {
    def apply[T /* <: Tensor[Rank] */](x: T, numOrSizeSplits: js.Array[Double]): js.Array[T] = js.native
    def apply[T /* <: Tensor[Rank] */](x: T, numOrSizeSplits: js.Array[Double], axis: Double): js.Array[T] = js.native
    def apply[T /* <: Tensor[Rank] */](x: T, numOrSizeSplits: Double): js.Array[T] = js.native
    def apply[T /* <: Tensor[Rank] */](x: T, numOrSizeSplits: Double, axis: Double): js.Array[T] = js.native
    def apply[T /* <: Tensor[Rank] */](x: TensorLike, numOrSizeSplits: js.Array[Double]): js.Array[T] = js.native
    def apply[T /* <: Tensor[Rank] */](x: TensorLike, numOrSizeSplits: js.Array[Double], axis: Double): js.Array[T] = js.native
    def apply[T /* <: Tensor[Rank] */](x: TensorLike, numOrSizeSplits: Double): js.Array[T] = js.native
    def apply[T /* <: Tensor[Rank] */](x: TensorLike, numOrSizeSplits: Double, axis: Double): js.Array[T] = js.native
  }
  
}

