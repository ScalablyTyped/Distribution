package typings.atTensorflowTfjs.atTensorflowTfjsMod

import typings.atTensorflowTfjsDashCore.distTypesMod.Rank
import typings.atTensorflowTfjsDashCore.distTypesMod.TensorLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs", "stack")
@js.native
object stack extends js.Object {
  def apply[T /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */](tensors: js.Array[T | TensorLike]): typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] = js.native
  def apply[T /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */](tensors: js.Array[T | TensorLike], axis: Double): typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] = js.native
}

