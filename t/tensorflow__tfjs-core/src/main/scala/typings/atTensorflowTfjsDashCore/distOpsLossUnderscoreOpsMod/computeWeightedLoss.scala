package typings.atTensorflowTfjsDashCore.distOpsLossUnderscoreOpsMod

import typings.atTensorflowTfjsDashCore.distTensorMod.Tensor
import typings.atTensorflowTfjsDashCore.distTypesMod.Rank
import typings.atTensorflowTfjsDashCore.distTypesMod.TensorLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/ops/loss_ops", "computeWeightedLoss")
@js.native
object computeWeightedLoss extends js.Object {
  def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](losses: T): O = js.native
  def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](losses: T, weights: Tensor[Rank]): O = js.native
  def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](losses: T, weights: Tensor[Rank], reduction: Reduction): O = js.native
  def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](losses: T, weights: TensorLike): O = js.native
  def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](losses: T, weights: TensorLike, reduction: Reduction): O = js.native
  def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](losses: TensorLike): O = js.native
  def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](losses: TensorLike, weights: Tensor[Rank]): O = js.native
  def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](losses: TensorLike, weights: Tensor[Rank], reduction: Reduction): O = js.native
  def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](losses: TensorLike, weights: TensorLike): O = js.native
  def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](losses: TensorLike, weights: TensorLike, reduction: Reduction): O = js.native
}

