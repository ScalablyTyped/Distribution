package typings.tensorflowTfjs.mod

import typings.tensorflowTfjsCore.distTypesMod.TensorLike
import typings.tensorflowTfjsCore.tensorMod.Tensor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs", "stack")
@js.native
object stack extends js.Object {
  def apply[T /* <: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] */](tensors: js.Array[T | TensorLike]): Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] = js.native
  def apply[T /* <: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] */](tensors: js.Array[T | TensorLike], axis: Double): Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] = js.native
}

