package typings.atTensorflowTfjs.atTensorflowTfjsMod

import typings.atTensorflowTfjsDashCore.distTypesMod.TensorLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs", "squeeze")
@js.native
object squeeze extends js.Object {
  def apply[T /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[typings.atTensorflowTfjsDashCore.distTypesMod.Rank] */](
    x: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[typings.atTensorflowTfjsDashCore.distTypesMod.Rank]
  ): T = js.native
  def apply[T /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[typings.atTensorflowTfjsDashCore.distTypesMod.Rank] */](
    x: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[typings.atTensorflowTfjsDashCore.distTypesMod.Rank],
    axis: js.Array[Double]
  ): T = js.native
  def apply[T /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[typings.atTensorflowTfjsDashCore.distTypesMod.Rank] */](x: TensorLike): T = js.native
  def apply[T /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[typings.atTensorflowTfjsDashCore.distTypesMod.Rank] */](x: TensorLike, axis: js.Array[Double]): T = js.native
}

