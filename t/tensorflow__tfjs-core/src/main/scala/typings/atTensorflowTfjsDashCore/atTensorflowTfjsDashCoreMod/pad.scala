package typings.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreMod

import typings.atTensorflowTfjsDashCore.distTypesMod.Rank
import typings.atTensorflowTfjsDashCore.distTypesMod.TensorLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core", "pad")
@js.native
object pad extends js.Object {
  def apply[T /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */](x: T, paddings: js.Array[js.Tuple2[Double, Double]]): T = js.native
  def apply[T /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */](x: T, paddings: js.Array[js.Tuple2[Double, Double]], constantValue: Double): T = js.native
  def apply[T /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */](x: TensorLike, paddings: js.Array[js.Tuple2[Double, Double]]): T = js.native
  def apply[T /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */](x: TensorLike, paddings: js.Array[js.Tuple2[Double, Double]], constantValue: Double): T = js.native
}

