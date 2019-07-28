package typings.atTensorflowTfjsDashCore.distOpsOpsMod

import typings.atTensorflowTfjsDashCore.distTensorMod.Tensor
import typings.atTensorflowTfjsDashCore.distTypesMod.DataType
import typings.atTensorflowTfjsDashCore.distTypesMod.Rank
import typings.atTensorflowTfjsDashCore.distTypesMod.TensorLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/ops/ops", "cast")
@js.native
object cast extends js.Object {
  def apply[T /* <: Tensor[Rank] */](x: T, dtype: DataType): T = js.native
  def apply[T /* <: Tensor[Rank] */](x: TensorLike, dtype: DataType): T = js.native
}

