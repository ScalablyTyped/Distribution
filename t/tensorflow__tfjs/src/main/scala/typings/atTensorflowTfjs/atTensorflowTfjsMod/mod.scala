package typings.atTensorflowTfjs.atTensorflowTfjsMod

import typings.atTensorflowTfjsDashCore.distTypesMod.Rank
import typings.atTensorflowTfjsDashCore.distTypesMod.TensorLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs", "mod")
@js.native
object mod extends js.Object {
  def apply[T /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */](
    a: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank],
    b: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank]
  ): T = js.native
  def apply[T /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */](a: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank], b: TensorLike): T = js.native
  def apply[T /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */](a: TensorLike, b: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank]): T = js.native
  def apply[T /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */](a: TensorLike, b: TensorLike): T = js.native
}

