package typings.atTensorflowTfjsDashNode.atTensorflowTfjsDashNodeMod

import typings.atTensorflowTfjsDashCore.distTypesMod.TensorLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-node", "expandDims")
@js.native
object expandDims extends js.Object {
  def apply[R2 /* <: typings.atTensorflowTfjsDashCore.distTypesMod.Rank */](
    x: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[typings.atTensorflowTfjsDashCore.distTypesMod.Rank]
  ): typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[R2] = js.native
  def apply[R2 /* <: typings.atTensorflowTfjsDashCore.distTypesMod.Rank */](
    x: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[typings.atTensorflowTfjsDashCore.distTypesMod.Rank],
    axis: Double
  ): typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[R2] = js.native
  def apply[R2 /* <: typings.atTensorflowTfjsDashCore.distTypesMod.Rank */](x: TensorLike): typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[R2] = js.native
  def apply[R2 /* <: typings.atTensorflowTfjsDashCore.distTypesMod.Rank */](x: TensorLike, axis: Double): typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[R2] = js.native
}

