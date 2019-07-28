package typings.atTensorflowTfjsDashCore.distOpsOpsMod

import typings.atTensorflowTfjsDashCore.distTensorMod.Tensor
import typings.atTensorflowTfjsDashCore.distTypesMod.Rank
import typings.atTensorflowTfjsDashCore.distTypesMod.TensorLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/ops/ops", "clipByValue")
@js.native
object clipByValue extends js.Object {
  def apply[T /* <: Tensor[Rank] */](x: T, clipValueMin: Double, clipValueMax: Double): T = js.native
  def apply[T /* <: Tensor[Rank] */](x: TensorLike, clipValueMin: Double, clipValueMax: Double): T = js.native
}

