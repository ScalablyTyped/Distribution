package typings.atTensorflowTfjsDashCore.distOpsLossUnderscoreOpsMod

import typings.atTensorflowTfjsDashCore.distTensorMod.Tensor
import typings.atTensorflowTfjsDashCore.distTypesMod.Rank
import typings.atTensorflowTfjsDashCore.distTypesMod.TensorLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/ops/loss_ops", "cosineDistance")
@js.native
object cosineDistance extends js.Object {
  def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](labels: T, predictions: T, axis: Double): O = js.native
  def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](labels: T, predictions: T, axis: Double, weights: Tensor[Rank]): O = js.native
  def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](labels: T, predictions: T, axis: Double, weights: Tensor[Rank], reduction: Reduction): O = js.native
  def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](labels: T, predictions: T, axis: Double, weights: TensorLike): O = js.native
  def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](labels: T, predictions: T, axis: Double, weights: TensorLike, reduction: Reduction): O = js.native
  def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](labels: T, predictions: TensorLike, axis: Double): O = js.native
  def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](labels: T, predictions: TensorLike, axis: Double, weights: Tensor[Rank]): O = js.native
  def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](labels: T, predictions: TensorLike, axis: Double, weights: Tensor[Rank], reduction: Reduction): O = js.native
  def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](labels: T, predictions: TensorLike, axis: Double, weights: TensorLike): O = js.native
  def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](labels: T, predictions: TensorLike, axis: Double, weights: TensorLike, reduction: Reduction): O = js.native
  def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](labels: TensorLike, predictions: T, axis: Double): O = js.native
  def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](labels: TensorLike, predictions: T, axis: Double, weights: Tensor[Rank]): O = js.native
  def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](labels: TensorLike, predictions: T, axis: Double, weights: Tensor[Rank], reduction: Reduction): O = js.native
  def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](labels: TensorLike, predictions: T, axis: Double, weights: TensorLike): O = js.native
  def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](labels: TensorLike, predictions: T, axis: Double, weights: TensorLike, reduction: Reduction): O = js.native
  def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](labels: TensorLike, predictions: TensorLike, axis: Double): O = js.native
  def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](labels: TensorLike, predictions: TensorLike, axis: Double, weights: Tensor[Rank]): O = js.native
  def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](
    labels: TensorLike,
    predictions: TensorLike,
    axis: Double,
    weights: Tensor[Rank],
    reduction: Reduction
  ): O = js.native
  def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](labels: TensorLike, predictions: TensorLike, axis: Double, weights: TensorLike): O = js.native
  def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](
    labels: TensorLike,
    predictions: TensorLike,
    axis: Double,
    weights: TensorLike,
    reduction: Reduction
  ): O = js.native
}

