package typings.atTensorflowTfjsDashNode.atTensorflowTfjsDashNodeMod

import typings.atTensorflowTfjsDashCore.distTypesMod.Rank
import typings.atTensorflowTfjsDashCore.distTypesMod.TensorLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-node", "cumsum")
@js.native
object cumsum extends js.Object {
  def apply[T /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */](x: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank]): T = js.native
  def apply[T /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */](x: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank], axis: Double): T = js.native
  def apply[T /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */](x: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank], axis: Double, exclusive: Boolean): T = js.native
  def apply[T /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */](
    x: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank],
    axis: Double,
    exclusive: Boolean,
    reverse: Boolean
  ): T = js.native
  def apply[T /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */](x: TensorLike): T = js.native
  def apply[T /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */](x: TensorLike, axis: Double): T = js.native
  def apply[T /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */](x: TensorLike, axis: Double, exclusive: Boolean): T = js.native
  def apply[T /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */](x: TensorLike, axis: Double, exclusive: Boolean, reverse: Boolean): T = js.native
}

