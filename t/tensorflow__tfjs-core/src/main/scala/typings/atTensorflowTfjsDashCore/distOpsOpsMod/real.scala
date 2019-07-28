package typings.atTensorflowTfjsDashCore.distOpsOpsMod

import typings.atTensorflowTfjsDashCore.distTensorMod.Tensor
import typings.atTensorflowTfjsDashCore.distTypesMod.Rank
import typings.atTensorflowTfjsDashCore.distTypesMod.TensorLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/ops/ops", "real")
@js.native
object real extends js.Object {
  def apply[T /* <: Tensor[Rank] */](input: T): T = js.native
  def apply[T /* <: Tensor[Rank] */](input: TensorLike): T = js.native
}

