package typings.tensorflowTfjsCore.mod

import typings.tensorflowTfjsCore.distTypesMod.TensorLike
import typings.tensorflowTfjsCore.tensorMod.Tensor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core", "inTopKAsync")
@js.native
object inTopKAsync extends js.Object {
  def apply[T /* <: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] */, U /* <: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] */](predictions: T, targets: U): js.Promise[U] = js.native
  def apply[T /* <: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] */, U /* <: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] */](predictions: T, targets: U, k: Double): js.Promise[U] = js.native
  def apply[T /* <: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] */, U /* <: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] */](predictions: T, targets: TensorLike): js.Promise[U] = js.native
  def apply[T /* <: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] */, U /* <: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] */](predictions: T, targets: TensorLike, k: Double): js.Promise[U] = js.native
  def apply[T /* <: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] */, U /* <: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] */](predictions: TensorLike, targets: U): js.Promise[U] = js.native
  def apply[T /* <: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] */, U /* <: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] */](predictions: TensorLike, targets: U, k: Double): js.Promise[U] = js.native
  def apply[T /* <: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] */, U /* <: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] */](predictions: TensorLike, targets: TensorLike): js.Promise[U] = js.native
  def apply[T /* <: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] */, U /* <: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] */](predictions: TensorLike, targets: TensorLike, k: Double): js.Promise[U] = js.native
}

