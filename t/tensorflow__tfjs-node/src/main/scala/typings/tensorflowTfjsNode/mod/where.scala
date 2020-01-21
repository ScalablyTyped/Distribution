package typings.tensorflowTfjsNode.mod

import typings.tensorflowTfjsCore.distTypesMod.TensorLike
import typings.tensorflowTfjsCore.tensorMod.Tensor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-node", "where")
@js.native
object where extends js.Object {
  def apply[T /* <: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] */](condition: TensorLike, a: T, b: T): T = js.native
  def apply[T /* <: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] */](condition: TensorLike, a: T, b: TensorLike): T = js.native
  def apply[T /* <: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] */](condition: TensorLike, a: TensorLike, b: T): T = js.native
  def apply[T /* <: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] */](condition: TensorLike, a: TensorLike, b: TensorLike): T = js.native
  def apply[T /* <: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] */](condition: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank], a: T, b: T): T = js.native
  def apply[T /* <: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] */](condition: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank], a: T, b: TensorLike): T = js.native
  def apply[T /* <: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] */](condition: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank], a: TensorLike, b: T): T = js.native
  def apply[T /* <: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] */](condition: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank], a: TensorLike, b: TensorLike): T = js.native
}

