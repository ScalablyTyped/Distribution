package typings.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreMod

import typings.atTensorflowTfjsDashCore.distTypesMod.Rank
import typings.atTensorflowTfjsDashCore.distTypesMod.TensorLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core", "expandDims")
@js.native
object expandDims extends js.Object {
  def apply[R2 /* <: Rank */](x: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank]): typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[R2] = js.native
  def apply[R2 /* <: Rank */](x: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank], axis: Double): typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[R2] = js.native
  def apply[R2 /* <: Rank */](x: TensorLike): typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[R2] = js.native
  def apply[R2 /* <: Rank */](x: TensorLike, axis: Double): typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[R2] = js.native
}

