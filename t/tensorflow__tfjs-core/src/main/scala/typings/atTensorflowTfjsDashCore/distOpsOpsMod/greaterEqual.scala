package typings.atTensorflowTfjsDashCore.distOpsOpsMod

import typings.atTensorflowTfjsDashCore.distTensorMod.Tensor
import typings.atTensorflowTfjsDashCore.distTypesMod.Rank
import typings.atTensorflowTfjsDashCore.distTypesMod.TensorLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/ops/ops", "greaterEqual")
@js.native
object greaterEqual extends js.Object {
  def apply[T /* <: Tensor[Rank] */](a: Tensor[Rank], b: Tensor[Rank]): T = js.native
  def apply[T /* <: Tensor[Rank] */](a: Tensor[Rank], b: TensorLike): T = js.native
  def apply[T /* <: Tensor[Rank] */](a: TensorLike, b: Tensor[Rank]): T = js.native
  def apply[T /* <: Tensor[Rank] */](a: TensorLike, b: TensorLike): T = js.native
}

