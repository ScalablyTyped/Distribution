package typings.atTensorflowTfjsDashCore.distOpsOpsMod

import typings.atTensorflowTfjsDashCore.distTensorMod.Tensor
import typings.atTensorflowTfjsDashCore.distTypesMod.Rank
import typings.atTensorflowTfjsDashCore.distTypesMod.TensorLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/ops/ops", "pow")
@js.native
object pow extends js.Object {
  def apply[T /* <: Tensor[Rank] */](base: T, exp: Tensor[Rank]): T = js.native
  def apply[T /* <: Tensor[Rank] */](base: T, exp: TensorLike): T = js.native
  def apply[T /* <: Tensor[Rank] */](base: TensorLike, exp: Tensor[Rank]): T = js.native
  def apply[T /* <: Tensor[Rank] */](base: TensorLike, exp: TensorLike): T = js.native
}

