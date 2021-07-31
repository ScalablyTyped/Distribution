package typings.tensorflowTfjsCore

import typings.tensorflowTfjsCore.distTensorMod.Tensor
import typings.tensorflowTfjsCore.distTypesMod.Rank
import typings.tensorflowTfjsCore.distTypesMod.TensorLike
import typings.tensorflowTfjsCore.lossOpsUtilsMod.Reduction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object logLossMod {
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/losses/log_loss", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def logLoss[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](labels: T | TensorLike, predictions: T | TensorLike): O = (^.asInstanceOf[js.Dynamic].applyDynamic("logLoss")(labels.asInstanceOf[js.Any], predictions.asInstanceOf[js.Any])).asInstanceOf[O]
  @scala.inline
  def logLoss[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](labels: T | TensorLike, predictions: T | TensorLike, weights: Unit, epsilon: Double): O = (^.asInstanceOf[js.Dynamic].applyDynamic("logLoss")(labels.asInstanceOf[js.Any], predictions.asInstanceOf[js.Any], weights.asInstanceOf[js.Any], epsilon.asInstanceOf[js.Any])).asInstanceOf[O]
  @scala.inline
  def logLoss[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](
    labels: T | TensorLike,
    predictions: T | TensorLike,
    weights: Unit,
    epsilon: Double,
    reduction: Reduction
  ): O = (^.asInstanceOf[js.Dynamic].applyDynamic("logLoss")(labels.asInstanceOf[js.Any], predictions.asInstanceOf[js.Any], weights.asInstanceOf[js.Any], epsilon.asInstanceOf[js.Any], reduction.asInstanceOf[js.Any])).asInstanceOf[O]
  @scala.inline
  def logLoss[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](
    labels: T | TensorLike,
    predictions: T | TensorLike,
    weights: Unit,
    epsilon: Unit,
    reduction: Reduction
  ): O = (^.asInstanceOf[js.Dynamic].applyDynamic("logLoss")(labels.asInstanceOf[js.Any], predictions.asInstanceOf[js.Any], weights.asInstanceOf[js.Any], epsilon.asInstanceOf[js.Any], reduction.asInstanceOf[js.Any])).asInstanceOf[O]
  @scala.inline
  def logLoss[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](labels: T | TensorLike, predictions: T | TensorLike, weights: Tensor[Rank]): O = (^.asInstanceOf[js.Dynamic].applyDynamic("logLoss")(labels.asInstanceOf[js.Any], predictions.asInstanceOf[js.Any], weights.asInstanceOf[js.Any])).asInstanceOf[O]
  @scala.inline
  def logLoss[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](labels: T | TensorLike, predictions: T | TensorLike, weights: Tensor[Rank], epsilon: Double): O = (^.asInstanceOf[js.Dynamic].applyDynamic("logLoss")(labels.asInstanceOf[js.Any], predictions.asInstanceOf[js.Any], weights.asInstanceOf[js.Any], epsilon.asInstanceOf[js.Any])).asInstanceOf[O]
  @scala.inline
  def logLoss[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](
    labels: T | TensorLike,
    predictions: T | TensorLike,
    weights: Tensor[Rank],
    epsilon: Double,
    reduction: Reduction
  ): O = (^.asInstanceOf[js.Dynamic].applyDynamic("logLoss")(labels.asInstanceOf[js.Any], predictions.asInstanceOf[js.Any], weights.asInstanceOf[js.Any], epsilon.asInstanceOf[js.Any], reduction.asInstanceOf[js.Any])).asInstanceOf[O]
  @scala.inline
  def logLoss[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](
    labels: T | TensorLike,
    predictions: T | TensorLike,
    weights: Tensor[Rank],
    epsilon: Unit,
    reduction: Reduction
  ): O = (^.asInstanceOf[js.Dynamic].applyDynamic("logLoss")(labels.asInstanceOf[js.Any], predictions.asInstanceOf[js.Any], weights.asInstanceOf[js.Any], epsilon.asInstanceOf[js.Any], reduction.asInstanceOf[js.Any])).asInstanceOf[O]
  @scala.inline
  def logLoss[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](labels: T | TensorLike, predictions: T | TensorLike, weights: TensorLike): O = (^.asInstanceOf[js.Dynamic].applyDynamic("logLoss")(labels.asInstanceOf[js.Any], predictions.asInstanceOf[js.Any], weights.asInstanceOf[js.Any])).asInstanceOf[O]
  @scala.inline
  def logLoss[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](labels: T | TensorLike, predictions: T | TensorLike, weights: TensorLike, epsilon: Double): O = (^.asInstanceOf[js.Dynamic].applyDynamic("logLoss")(labels.asInstanceOf[js.Any], predictions.asInstanceOf[js.Any], weights.asInstanceOf[js.Any], epsilon.asInstanceOf[js.Any])).asInstanceOf[O]
  @scala.inline
  def logLoss[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](
    labels: T | TensorLike,
    predictions: T | TensorLike,
    weights: TensorLike,
    epsilon: Double,
    reduction: Reduction
  ): O = (^.asInstanceOf[js.Dynamic].applyDynamic("logLoss")(labels.asInstanceOf[js.Any], predictions.asInstanceOf[js.Any], weights.asInstanceOf[js.Any], epsilon.asInstanceOf[js.Any], reduction.asInstanceOf[js.Any])).asInstanceOf[O]
  @scala.inline
  def logLoss[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](
    labels: T | TensorLike,
    predictions: T | TensorLike,
    weights: TensorLike,
    epsilon: Unit,
    reduction: Reduction
  ): O = (^.asInstanceOf[js.Dynamic].applyDynamic("logLoss")(labels.asInstanceOf[js.Any], predictions.asInstanceOf[js.Any], weights.asInstanceOf[js.Any], epsilon.asInstanceOf[js.Any], reduction.asInstanceOf[js.Any])).asInstanceOf[O]
}
