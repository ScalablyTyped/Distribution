package typings.atTensorflowTfjsDashCore.distOpsOpsMod

import typings.atTensorflowTfjsDashCore.distTensorMod.Tensor
import typings.atTensorflowTfjsDashCore.distTypesMod.Rank
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/ops/ops", "powStrict")
@js.native
object powStrict extends js.Object {
  def apply[T /* <: Tensor[Rank] */](base: T, exp: Tensor[Rank]): T = js.native
}

