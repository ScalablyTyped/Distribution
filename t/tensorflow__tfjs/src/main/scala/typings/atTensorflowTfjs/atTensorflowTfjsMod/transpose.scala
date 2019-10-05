package typings.atTensorflowTfjs.atTensorflowTfjsMod

import typings.atTensorflowTfjsDashCore.distTypesMod.Rank
import typings.atTensorflowTfjsDashCore.distTypesMod.TensorLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs", "transpose")
@js.native
object transpose extends js.Object {
  def apply[T /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */](x: T): T = js.native
  def apply[T /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */](x: T, perm: js.Array[Double]): T = js.native
  def apply[T /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */](x: TensorLike): T = js.native
  def apply[T /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */](x: TensorLike, perm: js.Array[Double]): T = js.native
}

