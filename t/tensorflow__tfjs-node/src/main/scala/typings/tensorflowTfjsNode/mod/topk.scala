package typings.tensorflowTfjsNode.mod

import typings.tensorflowTfjsCore.anon.Indices
import typings.tensorflowTfjsCore.distTypesMod.TensorLike
import typings.tensorflowTfjsCore.tensorMod.Tensor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-node", "topk")
@js.native
object topk extends js.Object {
  def apply[T /* <: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] */](x: T): Indices[T] = js.native
  def apply[T /* <: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] */](x: T, k: js.UndefOr[scala.Nothing], sorted: Boolean): Indices[T] = js.native
  def apply[T /* <: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] */](x: T, k: Double): Indices[T] = js.native
  def apply[T /* <: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] */](x: T, k: Double, sorted: Boolean): Indices[T] = js.native
  def apply[T /* <: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] */](x: TensorLike): Indices[T] = js.native
  def apply[T /* <: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] */](x: TensorLike, k: js.UndefOr[scala.Nothing], sorted: Boolean): Indices[T] = js.native
  def apply[T /* <: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] */](x: TensorLike, k: Double): Indices[T] = js.native
  def apply[T /* <: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] */](x: TensorLike, k: Double, sorted: Boolean): Indices[T] = js.native
}

