package typings
package atTensorflowTfjsDashCoreLib.distOpsLossUnderscoreOpsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/ops/loss_ops", "logLoss")
@js.native
object logLoss extends js.Object {
  def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */, O /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](labels: T, predictions: T): O = js.native
  def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */, O /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](
    labels: T,
    predictions: T,
    weights: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
  ): O = js.native
  def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */, O /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](
    labels: T,
    predictions: T,
    weights: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank],
    epsilon: scala.Double
  ): O = js.native
  def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */, O /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](
    labels: T,
    predictions: T,
    weights: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank],
    epsilon: scala.Double,
    reduction: atTensorflowTfjsDashCoreLib.distOpsLossUnderscoreOpsMod.Reduction
  ): O = js.native
  def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */, O /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](labels: T, predictions: T, weights: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike): O = js.native
  def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */, O /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](
    labels: T,
    predictions: T,
    weights: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
    epsilon: scala.Double
  ): O = js.native
  def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */, O /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](
    labels: T,
    predictions: T,
    weights: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
    epsilon: scala.Double,
    reduction: atTensorflowTfjsDashCoreLib.distOpsLossUnderscoreOpsMod.Reduction
  ): O = js.native
  def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */, O /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](labels: T, predictions: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike): O = js.native
  def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */, O /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](
    labels: T,
    predictions: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
    weights: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
  ): O = js.native
  def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */, O /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](
    labels: T,
    predictions: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
    weights: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank],
    epsilon: scala.Double
  ): O = js.native
  def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */, O /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](
    labels: T,
    predictions: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
    weights: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank],
    epsilon: scala.Double,
    reduction: atTensorflowTfjsDashCoreLib.distOpsLossUnderscoreOpsMod.Reduction
  ): O = js.native
  def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */, O /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](
    labels: T,
    predictions: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
    weights: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike
  ): O = js.native
  def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */, O /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](
    labels: T,
    predictions: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
    weights: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
    epsilon: scala.Double
  ): O = js.native
  def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */, O /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](
    labels: T,
    predictions: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
    weights: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
    epsilon: scala.Double,
    reduction: atTensorflowTfjsDashCoreLib.distOpsLossUnderscoreOpsMod.Reduction
  ): O = js.native
  def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */, O /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](labels: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike, predictions: T): O = js.native
  def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */, O /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](
    labels: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
    predictions: T,
    weights: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
  ): O = js.native
  def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */, O /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](
    labels: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
    predictions: T,
    weights: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank],
    epsilon: scala.Double
  ): O = js.native
  def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */, O /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](
    labels: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
    predictions: T,
    weights: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank],
    epsilon: scala.Double,
    reduction: atTensorflowTfjsDashCoreLib.distOpsLossUnderscoreOpsMod.Reduction
  ): O = js.native
  def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */, O /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](
    labels: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
    predictions: T,
    weights: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike
  ): O = js.native
  def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */, O /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](
    labels: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
    predictions: T,
    weights: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
    epsilon: scala.Double
  ): O = js.native
  def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */, O /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](
    labels: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
    predictions: T,
    weights: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
    epsilon: scala.Double,
    reduction: atTensorflowTfjsDashCoreLib.distOpsLossUnderscoreOpsMod.Reduction
  ): O = js.native
  def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */, O /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](
    labels: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
    predictions: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike
  ): O = js.native
  def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */, O /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](
    labels: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
    predictions: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
    weights: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
  ): O = js.native
  def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */, O /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](
    labels: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
    predictions: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
    weights: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank],
    epsilon: scala.Double
  ): O = js.native
  def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */, O /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](
    labels: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
    predictions: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
    weights: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank],
    epsilon: scala.Double,
    reduction: atTensorflowTfjsDashCoreLib.distOpsLossUnderscoreOpsMod.Reduction
  ): O = js.native
  def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */, O /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](
    labels: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
    predictions: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
    weights: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike
  ): O = js.native
  def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */, O /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](
    labels: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
    predictions: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
    weights: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
    epsilon: scala.Double
  ): O = js.native
  def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */, O /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](
    labels: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
    predictions: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
    weights: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
    epsilon: scala.Double,
    reduction: atTensorflowTfjsDashCoreLib.distOpsLossUnderscoreOpsMod.Reduction
  ): O = js.native
}

