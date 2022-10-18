package typings.tensorflowTfjsNode.mod

import typings.tensorflowTfjsCore.distTensorMod.Tensor
import typings.tensorflowTfjsCore.distTypesMod.TensorLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object losses {
  
  @JSImport("@tensorflow/tfjs-node", "losses")
  @js.native
  val ^ : js.Any = js.native
  
  inline def absoluteDifference[T /* <: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] */, O /* <: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] */](labels: T | TensorLike, predictions: T | TensorLike): O = (^.asInstanceOf[js.Dynamic].applyDynamic("absoluteDifference")(labels.asInstanceOf[js.Any], predictions.asInstanceOf[js.Any])).asInstanceOf[O]
  inline def absoluteDifference[T /* <: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] */, O /* <: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] */](
    labels: T | TensorLike,
    predictions: T | TensorLike,
    weights: Unit,
    reduction: typings.tensorflowTfjsCore.distOpsLossOpsUtilsMod.Reduction
  ): O = (^.asInstanceOf[js.Dynamic].applyDynamic("absoluteDifference")(labels.asInstanceOf[js.Any], predictions.asInstanceOf[js.Any], weights.asInstanceOf[js.Any], reduction.asInstanceOf[js.Any])).asInstanceOf[O]
  inline def absoluteDifference[T /* <: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] */, O /* <: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] */](
    labels: T | TensorLike,
    predictions: T | TensorLike,
    weights: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]
  ): O = (^.asInstanceOf[js.Dynamic].applyDynamic("absoluteDifference")(labels.asInstanceOf[js.Any], predictions.asInstanceOf[js.Any], weights.asInstanceOf[js.Any])).asInstanceOf[O]
  inline def absoluteDifference[T /* <: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] */, O /* <: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] */](
    labels: T | TensorLike,
    predictions: T | TensorLike,
    weights: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank],
    reduction: typings.tensorflowTfjsCore.distOpsLossOpsUtilsMod.Reduction
  ): O = (^.asInstanceOf[js.Dynamic].applyDynamic("absoluteDifference")(labels.asInstanceOf[js.Any], predictions.asInstanceOf[js.Any], weights.asInstanceOf[js.Any], reduction.asInstanceOf[js.Any])).asInstanceOf[O]
  inline def absoluteDifference[T /* <: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] */, O /* <: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] */](labels: T | TensorLike, predictions: T | TensorLike, weights: TensorLike): O = (^.asInstanceOf[js.Dynamic].applyDynamic("absoluteDifference")(labels.asInstanceOf[js.Any], predictions.asInstanceOf[js.Any], weights.asInstanceOf[js.Any])).asInstanceOf[O]
  inline def absoluteDifference[T /* <: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] */, O /* <: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] */](
    labels: T | TensorLike,
    predictions: T | TensorLike,
    weights: TensorLike,
    reduction: typings.tensorflowTfjsCore.distOpsLossOpsUtilsMod.Reduction
  ): O = (^.asInstanceOf[js.Dynamic].applyDynamic("absoluteDifference")(labels.asInstanceOf[js.Any], predictions.asInstanceOf[js.Any], weights.asInstanceOf[js.Any], reduction.asInstanceOf[js.Any])).asInstanceOf[O]
  
  inline def computeWeightedLoss[T_1 /* <: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] */, O_1 /* <: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] */](losses: T_1 | TensorLike): O_1 = ^.asInstanceOf[js.Dynamic].applyDynamic("computeWeightedLoss")(losses.asInstanceOf[js.Any]).asInstanceOf[O_1]
  inline def computeWeightedLoss[T_1 /* <: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] */, O_1 /* <: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] */](
    losses: T_1 | TensorLike,
    weights: Unit,
    reduction: typings.tensorflowTfjsCore.distOpsLossOpsUtilsMod.Reduction
  ): O_1 = (^.asInstanceOf[js.Dynamic].applyDynamic("computeWeightedLoss")(losses.asInstanceOf[js.Any], weights.asInstanceOf[js.Any], reduction.asInstanceOf[js.Any])).asInstanceOf[O_1]
  inline def computeWeightedLoss[T_1 /* <: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] */, O_1 /* <: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] */](losses: T_1 | TensorLike, weights: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]): O_1 = (^.asInstanceOf[js.Dynamic].applyDynamic("computeWeightedLoss")(losses.asInstanceOf[js.Any], weights.asInstanceOf[js.Any])).asInstanceOf[O_1]
  inline def computeWeightedLoss[T_1 /* <: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] */, O_1 /* <: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] */](
    losses: T_1 | TensorLike,
    weights: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank],
    reduction: typings.tensorflowTfjsCore.distOpsLossOpsUtilsMod.Reduction
  ): O_1 = (^.asInstanceOf[js.Dynamic].applyDynamic("computeWeightedLoss")(losses.asInstanceOf[js.Any], weights.asInstanceOf[js.Any], reduction.asInstanceOf[js.Any])).asInstanceOf[O_1]
  inline def computeWeightedLoss[T_1 /* <: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] */, O_1 /* <: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] */](losses: T_1 | TensorLike, weights: TensorLike): O_1 = (^.asInstanceOf[js.Dynamic].applyDynamic("computeWeightedLoss")(losses.asInstanceOf[js.Any], weights.asInstanceOf[js.Any])).asInstanceOf[O_1]
  inline def computeWeightedLoss[T_1 /* <: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] */, O_1 /* <: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] */](
    losses: T_1 | TensorLike,
    weights: TensorLike,
    reduction: typings.tensorflowTfjsCore.distOpsLossOpsUtilsMod.Reduction
  ): O_1 = (^.asInstanceOf[js.Dynamic].applyDynamic("computeWeightedLoss")(losses.asInstanceOf[js.Any], weights.asInstanceOf[js.Any], reduction.asInstanceOf[js.Any])).asInstanceOf[O_1]
  
  inline def cosineDistance[T_2 /* <: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] */, O_2 /* <: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] */](labels: T_2 | TensorLike, predictions: T_2 | TensorLike, axis: Double): O_2 = (^.asInstanceOf[js.Dynamic].applyDynamic("cosineDistance")(labels.asInstanceOf[js.Any], predictions.asInstanceOf[js.Any], axis.asInstanceOf[js.Any])).asInstanceOf[O_2]
  inline def cosineDistance[T_2 /* <: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] */, O_2 /* <: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] */](
    labels: T_2 | TensorLike,
    predictions: T_2 | TensorLike,
    axis: Double,
    weights: Unit,
    reduction: typings.tensorflowTfjsCore.distOpsLossOpsUtilsMod.Reduction
  ): O_2 = (^.asInstanceOf[js.Dynamic].applyDynamic("cosineDistance")(labels.asInstanceOf[js.Any], predictions.asInstanceOf[js.Any], axis.asInstanceOf[js.Any], weights.asInstanceOf[js.Any], reduction.asInstanceOf[js.Any])).asInstanceOf[O_2]
  inline def cosineDistance[T_2 /* <: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] */, O_2 /* <: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] */](
    labels: T_2 | TensorLike,
    predictions: T_2 | TensorLike,
    axis: Double,
    weights: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]
  ): O_2 = (^.asInstanceOf[js.Dynamic].applyDynamic("cosineDistance")(labels.asInstanceOf[js.Any], predictions.asInstanceOf[js.Any], axis.asInstanceOf[js.Any], weights.asInstanceOf[js.Any])).asInstanceOf[O_2]
  inline def cosineDistance[T_2 /* <: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] */, O_2 /* <: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] */](
    labels: T_2 | TensorLike,
    predictions: T_2 | TensorLike,
    axis: Double,
    weights: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank],
    reduction: typings.tensorflowTfjsCore.distOpsLossOpsUtilsMod.Reduction
  ): O_2 = (^.asInstanceOf[js.Dynamic].applyDynamic("cosineDistance")(labels.asInstanceOf[js.Any], predictions.asInstanceOf[js.Any], axis.asInstanceOf[js.Any], weights.asInstanceOf[js.Any], reduction.asInstanceOf[js.Any])).asInstanceOf[O_2]
  inline def cosineDistance[T_2 /* <: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] */, O_2 /* <: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] */](labels: T_2 | TensorLike, predictions: T_2 | TensorLike, axis: Double, weights: TensorLike): O_2 = (^.asInstanceOf[js.Dynamic].applyDynamic("cosineDistance")(labels.asInstanceOf[js.Any], predictions.asInstanceOf[js.Any], axis.asInstanceOf[js.Any], weights.asInstanceOf[js.Any])).asInstanceOf[O_2]
  inline def cosineDistance[T_2 /* <: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] */, O_2 /* <: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] */](
    labels: T_2 | TensorLike,
    predictions: T_2 | TensorLike,
    axis: Double,
    weights: TensorLike,
    reduction: typings.tensorflowTfjsCore.distOpsLossOpsUtilsMod.Reduction
  ): O_2 = (^.asInstanceOf[js.Dynamic].applyDynamic("cosineDistance")(labels.asInstanceOf[js.Any], predictions.asInstanceOf[js.Any], axis.asInstanceOf[js.Any], weights.asInstanceOf[js.Any], reduction.asInstanceOf[js.Any])).asInstanceOf[O_2]
  
  inline def hingeLoss[T_3 /* <: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] */, O_3 /* <: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] */](labels: T_3 | TensorLike, predictions: T_3 | TensorLike): O_3 = (^.asInstanceOf[js.Dynamic].applyDynamic("hingeLoss")(labels.asInstanceOf[js.Any], predictions.asInstanceOf[js.Any])).asInstanceOf[O_3]
  inline def hingeLoss[T_3 /* <: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] */, O_3 /* <: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] */](
    labels: T_3 | TensorLike,
    predictions: T_3 | TensorLike,
    weights: Unit,
    reduction: typings.tensorflowTfjsCore.distOpsLossOpsUtilsMod.Reduction
  ): O_3 = (^.asInstanceOf[js.Dynamic].applyDynamic("hingeLoss")(labels.asInstanceOf[js.Any], predictions.asInstanceOf[js.Any], weights.asInstanceOf[js.Any], reduction.asInstanceOf[js.Any])).asInstanceOf[O_3]
  inline def hingeLoss[T_3 /* <: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] */, O_3 /* <: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] */](
    labels: T_3 | TensorLike,
    predictions: T_3 | TensorLike,
    weights: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]
  ): O_3 = (^.asInstanceOf[js.Dynamic].applyDynamic("hingeLoss")(labels.asInstanceOf[js.Any], predictions.asInstanceOf[js.Any], weights.asInstanceOf[js.Any])).asInstanceOf[O_3]
  inline def hingeLoss[T_3 /* <: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] */, O_3 /* <: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] */](
    labels: T_3 | TensorLike,
    predictions: T_3 | TensorLike,
    weights: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank],
    reduction: typings.tensorflowTfjsCore.distOpsLossOpsUtilsMod.Reduction
  ): O_3 = (^.asInstanceOf[js.Dynamic].applyDynamic("hingeLoss")(labels.asInstanceOf[js.Any], predictions.asInstanceOf[js.Any], weights.asInstanceOf[js.Any], reduction.asInstanceOf[js.Any])).asInstanceOf[O_3]
  inline def hingeLoss[T_3 /* <: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] */, O_3 /* <: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] */](labels: T_3 | TensorLike, predictions: T_3 | TensorLike, weights: TensorLike): O_3 = (^.asInstanceOf[js.Dynamic].applyDynamic("hingeLoss")(labels.asInstanceOf[js.Any], predictions.asInstanceOf[js.Any], weights.asInstanceOf[js.Any])).asInstanceOf[O_3]
  inline def hingeLoss[T_3 /* <: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] */, O_3 /* <: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] */](
    labels: T_3 | TensorLike,
    predictions: T_3 | TensorLike,
    weights: TensorLike,
    reduction: typings.tensorflowTfjsCore.distOpsLossOpsUtilsMod.Reduction
  ): O_3 = (^.asInstanceOf[js.Dynamic].applyDynamic("hingeLoss")(labels.asInstanceOf[js.Any], predictions.asInstanceOf[js.Any], weights.asInstanceOf[js.Any], reduction.asInstanceOf[js.Any])).asInstanceOf[O_3]
  
  inline def huberLoss[T_4 /* <: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] */, O_4 /* <: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] */](labels: T_4 | TensorLike, predictions: T_4 | TensorLike): O_4 = (^.asInstanceOf[js.Dynamic].applyDynamic("huberLoss")(labels.asInstanceOf[js.Any], predictions.asInstanceOf[js.Any])).asInstanceOf[O_4]
  inline def huberLoss[T_4 /* <: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] */, O_4 /* <: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] */](labels: T_4 | TensorLike, predictions: T_4 | TensorLike, weights: Unit, delta: Double): O_4 = (^.asInstanceOf[js.Dynamic].applyDynamic("huberLoss")(labels.asInstanceOf[js.Any], predictions.asInstanceOf[js.Any], weights.asInstanceOf[js.Any], delta.asInstanceOf[js.Any])).asInstanceOf[O_4]
  inline def huberLoss[T_4 /* <: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] */, O_4 /* <: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] */](
    labels: T_4 | TensorLike,
    predictions: T_4 | TensorLike,
    weights: Unit,
    delta: Double,
    reduction: typings.tensorflowTfjsCore.distOpsLossOpsUtilsMod.Reduction
  ): O_4 = (^.asInstanceOf[js.Dynamic].applyDynamic("huberLoss")(labels.asInstanceOf[js.Any], predictions.asInstanceOf[js.Any], weights.asInstanceOf[js.Any], delta.asInstanceOf[js.Any], reduction.asInstanceOf[js.Any])).asInstanceOf[O_4]
  inline def huberLoss[T_4 /* <: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] */, O_4 /* <: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] */](
    labels: T_4 | TensorLike,
    predictions: T_4 | TensorLike,
    weights: Unit,
    delta: Unit,
    reduction: typings.tensorflowTfjsCore.distOpsLossOpsUtilsMod.Reduction
  ): O_4 = (^.asInstanceOf[js.Dynamic].applyDynamic("huberLoss")(labels.asInstanceOf[js.Any], predictions.asInstanceOf[js.Any], weights.asInstanceOf[js.Any], delta.asInstanceOf[js.Any], reduction.asInstanceOf[js.Any])).asInstanceOf[O_4]
  inline def huberLoss[T_4 /* <: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] */, O_4 /* <: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] */](
    labels: T_4 | TensorLike,
    predictions: T_4 | TensorLike,
    weights: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]
  ): O_4 = (^.asInstanceOf[js.Dynamic].applyDynamic("huberLoss")(labels.asInstanceOf[js.Any], predictions.asInstanceOf[js.Any], weights.asInstanceOf[js.Any])).asInstanceOf[O_4]
  inline def huberLoss[T_4 /* <: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] */, O_4 /* <: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] */](
    labels: T_4 | TensorLike,
    predictions: T_4 | TensorLike,
    weights: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank],
    delta: Double
  ): O_4 = (^.asInstanceOf[js.Dynamic].applyDynamic("huberLoss")(labels.asInstanceOf[js.Any], predictions.asInstanceOf[js.Any], weights.asInstanceOf[js.Any], delta.asInstanceOf[js.Any])).asInstanceOf[O_4]
  inline def huberLoss[T_4 /* <: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] */, O_4 /* <: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] */](
    labels: T_4 | TensorLike,
    predictions: T_4 | TensorLike,
    weights: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank],
    delta: Double,
    reduction: typings.tensorflowTfjsCore.distOpsLossOpsUtilsMod.Reduction
  ): O_4 = (^.asInstanceOf[js.Dynamic].applyDynamic("huberLoss")(labels.asInstanceOf[js.Any], predictions.asInstanceOf[js.Any], weights.asInstanceOf[js.Any], delta.asInstanceOf[js.Any], reduction.asInstanceOf[js.Any])).asInstanceOf[O_4]
  inline def huberLoss[T_4 /* <: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] */, O_4 /* <: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] */](
    labels: T_4 | TensorLike,
    predictions: T_4 | TensorLike,
    weights: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank],
    delta: Unit,
    reduction: typings.tensorflowTfjsCore.distOpsLossOpsUtilsMod.Reduction
  ): O_4 = (^.asInstanceOf[js.Dynamic].applyDynamic("huberLoss")(labels.asInstanceOf[js.Any], predictions.asInstanceOf[js.Any], weights.asInstanceOf[js.Any], delta.asInstanceOf[js.Any], reduction.asInstanceOf[js.Any])).asInstanceOf[O_4]
  inline def huberLoss[T_4 /* <: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] */, O_4 /* <: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] */](labels: T_4 | TensorLike, predictions: T_4 | TensorLike, weights: TensorLike): O_4 = (^.asInstanceOf[js.Dynamic].applyDynamic("huberLoss")(labels.asInstanceOf[js.Any], predictions.asInstanceOf[js.Any], weights.asInstanceOf[js.Any])).asInstanceOf[O_4]
  inline def huberLoss[T_4 /* <: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] */, O_4 /* <: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] */](labels: T_4 | TensorLike, predictions: T_4 | TensorLike, weights: TensorLike, delta: Double): O_4 = (^.asInstanceOf[js.Dynamic].applyDynamic("huberLoss")(labels.asInstanceOf[js.Any], predictions.asInstanceOf[js.Any], weights.asInstanceOf[js.Any], delta.asInstanceOf[js.Any])).asInstanceOf[O_4]
  inline def huberLoss[T_4 /* <: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] */, O_4 /* <: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] */](
    labels: T_4 | TensorLike,
    predictions: T_4 | TensorLike,
    weights: TensorLike,
    delta: Double,
    reduction: typings.tensorflowTfjsCore.distOpsLossOpsUtilsMod.Reduction
  ): O_4 = (^.asInstanceOf[js.Dynamic].applyDynamic("huberLoss")(labels.asInstanceOf[js.Any], predictions.asInstanceOf[js.Any], weights.asInstanceOf[js.Any], delta.asInstanceOf[js.Any], reduction.asInstanceOf[js.Any])).asInstanceOf[O_4]
  inline def huberLoss[T_4 /* <: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] */, O_4 /* <: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] */](
    labels: T_4 | TensorLike,
    predictions: T_4 | TensorLike,
    weights: TensorLike,
    delta: Unit,
    reduction: typings.tensorflowTfjsCore.distOpsLossOpsUtilsMod.Reduction
  ): O_4 = (^.asInstanceOf[js.Dynamic].applyDynamic("huberLoss")(labels.asInstanceOf[js.Any], predictions.asInstanceOf[js.Any], weights.asInstanceOf[js.Any], delta.asInstanceOf[js.Any], reduction.asInstanceOf[js.Any])).asInstanceOf[O_4]
  
  inline def logLoss[T_5 /* <: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] */, O_5 /* <: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] */](labels: T_5 | TensorLike, predictions: T_5 | TensorLike): O_5 = (^.asInstanceOf[js.Dynamic].applyDynamic("logLoss")(labels.asInstanceOf[js.Any], predictions.asInstanceOf[js.Any])).asInstanceOf[O_5]
  inline def logLoss[T_5 /* <: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] */, O_5 /* <: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] */](labels: T_5 | TensorLike, predictions: T_5 | TensorLike, weights: Unit, epsilon: Double): O_5 = (^.asInstanceOf[js.Dynamic].applyDynamic("logLoss")(labels.asInstanceOf[js.Any], predictions.asInstanceOf[js.Any], weights.asInstanceOf[js.Any], epsilon.asInstanceOf[js.Any])).asInstanceOf[O_5]
  inline def logLoss[T_5 /* <: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] */, O_5 /* <: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] */](
    labels: T_5 | TensorLike,
    predictions: T_5 | TensorLike,
    weights: Unit,
    epsilon: Double,
    reduction: typings.tensorflowTfjsCore.distOpsLossOpsUtilsMod.Reduction
  ): O_5 = (^.asInstanceOf[js.Dynamic].applyDynamic("logLoss")(labels.asInstanceOf[js.Any], predictions.asInstanceOf[js.Any], weights.asInstanceOf[js.Any], epsilon.asInstanceOf[js.Any], reduction.asInstanceOf[js.Any])).asInstanceOf[O_5]
  inline def logLoss[T_5 /* <: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] */, O_5 /* <: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] */](
    labels: T_5 | TensorLike,
    predictions: T_5 | TensorLike,
    weights: Unit,
    epsilon: Unit,
    reduction: typings.tensorflowTfjsCore.distOpsLossOpsUtilsMod.Reduction
  ): O_5 = (^.asInstanceOf[js.Dynamic].applyDynamic("logLoss")(labels.asInstanceOf[js.Any], predictions.asInstanceOf[js.Any], weights.asInstanceOf[js.Any], epsilon.asInstanceOf[js.Any], reduction.asInstanceOf[js.Any])).asInstanceOf[O_5]
  inline def logLoss[T_5 /* <: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] */, O_5 /* <: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] */](
    labels: T_5 | TensorLike,
    predictions: T_5 | TensorLike,
    weights: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]
  ): O_5 = (^.asInstanceOf[js.Dynamic].applyDynamic("logLoss")(labels.asInstanceOf[js.Any], predictions.asInstanceOf[js.Any], weights.asInstanceOf[js.Any])).asInstanceOf[O_5]
  inline def logLoss[T_5 /* <: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] */, O_5 /* <: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] */](
    labels: T_5 | TensorLike,
    predictions: T_5 | TensorLike,
    weights: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank],
    epsilon: Double
  ): O_5 = (^.asInstanceOf[js.Dynamic].applyDynamic("logLoss")(labels.asInstanceOf[js.Any], predictions.asInstanceOf[js.Any], weights.asInstanceOf[js.Any], epsilon.asInstanceOf[js.Any])).asInstanceOf[O_5]
  inline def logLoss[T_5 /* <: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] */, O_5 /* <: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] */](
    labels: T_5 | TensorLike,
    predictions: T_5 | TensorLike,
    weights: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank],
    epsilon: Double,
    reduction: typings.tensorflowTfjsCore.distOpsLossOpsUtilsMod.Reduction
  ): O_5 = (^.asInstanceOf[js.Dynamic].applyDynamic("logLoss")(labels.asInstanceOf[js.Any], predictions.asInstanceOf[js.Any], weights.asInstanceOf[js.Any], epsilon.asInstanceOf[js.Any], reduction.asInstanceOf[js.Any])).asInstanceOf[O_5]
  inline def logLoss[T_5 /* <: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] */, O_5 /* <: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] */](
    labels: T_5 | TensorLike,
    predictions: T_5 | TensorLike,
    weights: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank],
    epsilon: Unit,
    reduction: typings.tensorflowTfjsCore.distOpsLossOpsUtilsMod.Reduction
  ): O_5 = (^.asInstanceOf[js.Dynamic].applyDynamic("logLoss")(labels.asInstanceOf[js.Any], predictions.asInstanceOf[js.Any], weights.asInstanceOf[js.Any], epsilon.asInstanceOf[js.Any], reduction.asInstanceOf[js.Any])).asInstanceOf[O_5]
  inline def logLoss[T_5 /* <: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] */, O_5 /* <: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] */](labels: T_5 | TensorLike, predictions: T_5 | TensorLike, weights: TensorLike): O_5 = (^.asInstanceOf[js.Dynamic].applyDynamic("logLoss")(labels.asInstanceOf[js.Any], predictions.asInstanceOf[js.Any], weights.asInstanceOf[js.Any])).asInstanceOf[O_5]
  inline def logLoss[T_5 /* <: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] */, O_5 /* <: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] */](labels: T_5 | TensorLike, predictions: T_5 | TensorLike, weights: TensorLike, epsilon: Double): O_5 = (^.asInstanceOf[js.Dynamic].applyDynamic("logLoss")(labels.asInstanceOf[js.Any], predictions.asInstanceOf[js.Any], weights.asInstanceOf[js.Any], epsilon.asInstanceOf[js.Any])).asInstanceOf[O_5]
  inline def logLoss[T_5 /* <: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] */, O_5 /* <: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] */](
    labels: T_5 | TensorLike,
    predictions: T_5 | TensorLike,
    weights: TensorLike,
    epsilon: Double,
    reduction: typings.tensorflowTfjsCore.distOpsLossOpsUtilsMod.Reduction
  ): O_5 = (^.asInstanceOf[js.Dynamic].applyDynamic("logLoss")(labels.asInstanceOf[js.Any], predictions.asInstanceOf[js.Any], weights.asInstanceOf[js.Any], epsilon.asInstanceOf[js.Any], reduction.asInstanceOf[js.Any])).asInstanceOf[O_5]
  inline def logLoss[T_5 /* <: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] */, O_5 /* <: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] */](
    labels: T_5 | TensorLike,
    predictions: T_5 | TensorLike,
    weights: TensorLike,
    epsilon: Unit,
    reduction: typings.tensorflowTfjsCore.distOpsLossOpsUtilsMod.Reduction
  ): O_5 = (^.asInstanceOf[js.Dynamic].applyDynamic("logLoss")(labels.asInstanceOf[js.Any], predictions.asInstanceOf[js.Any], weights.asInstanceOf[js.Any], epsilon.asInstanceOf[js.Any], reduction.asInstanceOf[js.Any])).asInstanceOf[O_5]
  
  inline def meanSquaredError[T_6 /* <: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] */, O_6 /* <: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] */](labels: T_6 | TensorLike, predictions: T_6 | TensorLike): O_6 = (^.asInstanceOf[js.Dynamic].applyDynamic("meanSquaredError")(labels.asInstanceOf[js.Any], predictions.asInstanceOf[js.Any])).asInstanceOf[O_6]
  inline def meanSquaredError[T_6 /* <: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] */, O_6 /* <: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] */](
    labels: T_6 | TensorLike,
    predictions: T_6 | TensorLike,
    weights: Unit,
    reduction: typings.tensorflowTfjsCore.distOpsLossOpsUtilsMod.Reduction
  ): O_6 = (^.asInstanceOf[js.Dynamic].applyDynamic("meanSquaredError")(labels.asInstanceOf[js.Any], predictions.asInstanceOf[js.Any], weights.asInstanceOf[js.Any], reduction.asInstanceOf[js.Any])).asInstanceOf[O_6]
  inline def meanSquaredError[T_6 /* <: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] */, O_6 /* <: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] */](
    labels: T_6 | TensorLike,
    predictions: T_6 | TensorLike,
    weights: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]
  ): O_6 = (^.asInstanceOf[js.Dynamic].applyDynamic("meanSquaredError")(labels.asInstanceOf[js.Any], predictions.asInstanceOf[js.Any], weights.asInstanceOf[js.Any])).asInstanceOf[O_6]
  inline def meanSquaredError[T_6 /* <: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] */, O_6 /* <: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] */](
    labels: T_6 | TensorLike,
    predictions: T_6 | TensorLike,
    weights: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank],
    reduction: typings.tensorflowTfjsCore.distOpsLossOpsUtilsMod.Reduction
  ): O_6 = (^.asInstanceOf[js.Dynamic].applyDynamic("meanSquaredError")(labels.asInstanceOf[js.Any], predictions.asInstanceOf[js.Any], weights.asInstanceOf[js.Any], reduction.asInstanceOf[js.Any])).asInstanceOf[O_6]
  inline def meanSquaredError[T_6 /* <: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] */, O_6 /* <: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] */](labels: T_6 | TensorLike, predictions: T_6 | TensorLike, weights: TensorLike): O_6 = (^.asInstanceOf[js.Dynamic].applyDynamic("meanSquaredError")(labels.asInstanceOf[js.Any], predictions.asInstanceOf[js.Any], weights.asInstanceOf[js.Any])).asInstanceOf[O_6]
  inline def meanSquaredError[T_6 /* <: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] */, O_6 /* <: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] */](
    labels: T_6 | TensorLike,
    predictions: T_6 | TensorLike,
    weights: TensorLike,
    reduction: typings.tensorflowTfjsCore.distOpsLossOpsUtilsMod.Reduction
  ): O_6 = (^.asInstanceOf[js.Dynamic].applyDynamic("meanSquaredError")(labels.asInstanceOf[js.Any], predictions.asInstanceOf[js.Any], weights.asInstanceOf[js.Any], reduction.asInstanceOf[js.Any])).asInstanceOf[O_6]
  
  inline def sigmoidCrossEntropy[T_7 /* <: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] */, O_7 /* <: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] */](multiClassLabels: T_7 | TensorLike, logits: T_7 | TensorLike): O_7 = (^.asInstanceOf[js.Dynamic].applyDynamic("sigmoidCrossEntropy")(multiClassLabels.asInstanceOf[js.Any], logits.asInstanceOf[js.Any])).asInstanceOf[O_7]
  inline def sigmoidCrossEntropy[T_7 /* <: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] */, O_7 /* <: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] */](
    multiClassLabels: T_7 | TensorLike,
    logits: T_7 | TensorLike,
    weights: Unit,
    labelSmoothing: Double
  ): O_7 = (^.asInstanceOf[js.Dynamic].applyDynamic("sigmoidCrossEntropy")(multiClassLabels.asInstanceOf[js.Any], logits.asInstanceOf[js.Any], weights.asInstanceOf[js.Any], labelSmoothing.asInstanceOf[js.Any])).asInstanceOf[O_7]
  inline def sigmoidCrossEntropy[T_7 /* <: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] */, O_7 /* <: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] */](
    multiClassLabels: T_7 | TensorLike,
    logits: T_7 | TensorLike,
    weights: Unit,
    labelSmoothing: Double,
    reduction: typings.tensorflowTfjsCore.distOpsLossOpsUtilsMod.Reduction
  ): O_7 = (^.asInstanceOf[js.Dynamic].applyDynamic("sigmoidCrossEntropy")(multiClassLabels.asInstanceOf[js.Any], logits.asInstanceOf[js.Any], weights.asInstanceOf[js.Any], labelSmoothing.asInstanceOf[js.Any], reduction.asInstanceOf[js.Any])).asInstanceOf[O_7]
  inline def sigmoidCrossEntropy[T_7 /* <: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] */, O_7 /* <: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] */](
    multiClassLabels: T_7 | TensorLike,
    logits: T_7 | TensorLike,
    weights: Unit,
    labelSmoothing: Unit,
    reduction: typings.tensorflowTfjsCore.distOpsLossOpsUtilsMod.Reduction
  ): O_7 = (^.asInstanceOf[js.Dynamic].applyDynamic("sigmoidCrossEntropy")(multiClassLabels.asInstanceOf[js.Any], logits.asInstanceOf[js.Any], weights.asInstanceOf[js.Any], labelSmoothing.asInstanceOf[js.Any], reduction.asInstanceOf[js.Any])).asInstanceOf[O_7]
  inline def sigmoidCrossEntropy[T_7 /* <: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] */, O_7 /* <: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] */](
    multiClassLabels: T_7 | TensorLike,
    logits: T_7 | TensorLike,
    weights: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]
  ): O_7 = (^.asInstanceOf[js.Dynamic].applyDynamic("sigmoidCrossEntropy")(multiClassLabels.asInstanceOf[js.Any], logits.asInstanceOf[js.Any], weights.asInstanceOf[js.Any])).asInstanceOf[O_7]
  inline def sigmoidCrossEntropy[T_7 /* <: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] */, O_7 /* <: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] */](
    multiClassLabels: T_7 | TensorLike,
    logits: T_7 | TensorLike,
    weights: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank],
    labelSmoothing: Double
  ): O_7 = (^.asInstanceOf[js.Dynamic].applyDynamic("sigmoidCrossEntropy")(multiClassLabels.asInstanceOf[js.Any], logits.asInstanceOf[js.Any], weights.asInstanceOf[js.Any], labelSmoothing.asInstanceOf[js.Any])).asInstanceOf[O_7]
  inline def sigmoidCrossEntropy[T_7 /* <: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] */, O_7 /* <: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] */](
    multiClassLabels: T_7 | TensorLike,
    logits: T_7 | TensorLike,
    weights: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank],
    labelSmoothing: Double,
    reduction: typings.tensorflowTfjsCore.distOpsLossOpsUtilsMod.Reduction
  ): O_7 = (^.asInstanceOf[js.Dynamic].applyDynamic("sigmoidCrossEntropy")(multiClassLabels.asInstanceOf[js.Any], logits.asInstanceOf[js.Any], weights.asInstanceOf[js.Any], labelSmoothing.asInstanceOf[js.Any], reduction.asInstanceOf[js.Any])).asInstanceOf[O_7]
  inline def sigmoidCrossEntropy[T_7 /* <: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] */, O_7 /* <: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] */](
    multiClassLabels: T_7 | TensorLike,
    logits: T_7 | TensorLike,
    weights: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank],
    labelSmoothing: Unit,
    reduction: typings.tensorflowTfjsCore.distOpsLossOpsUtilsMod.Reduction
  ): O_7 = (^.asInstanceOf[js.Dynamic].applyDynamic("sigmoidCrossEntropy")(multiClassLabels.asInstanceOf[js.Any], logits.asInstanceOf[js.Any], weights.asInstanceOf[js.Any], labelSmoothing.asInstanceOf[js.Any], reduction.asInstanceOf[js.Any])).asInstanceOf[O_7]
  inline def sigmoidCrossEntropy[T_7 /* <: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] */, O_7 /* <: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] */](multiClassLabels: T_7 | TensorLike, logits: T_7 | TensorLike, weights: TensorLike): O_7 = (^.asInstanceOf[js.Dynamic].applyDynamic("sigmoidCrossEntropy")(multiClassLabels.asInstanceOf[js.Any], logits.asInstanceOf[js.Any], weights.asInstanceOf[js.Any])).asInstanceOf[O_7]
  inline def sigmoidCrossEntropy[T_7 /* <: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] */, O_7 /* <: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] */](
    multiClassLabels: T_7 | TensorLike,
    logits: T_7 | TensorLike,
    weights: TensorLike,
    labelSmoothing: Double
  ): O_7 = (^.asInstanceOf[js.Dynamic].applyDynamic("sigmoidCrossEntropy")(multiClassLabels.asInstanceOf[js.Any], logits.asInstanceOf[js.Any], weights.asInstanceOf[js.Any], labelSmoothing.asInstanceOf[js.Any])).asInstanceOf[O_7]
  inline def sigmoidCrossEntropy[T_7 /* <: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] */, O_7 /* <: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] */](
    multiClassLabels: T_7 | TensorLike,
    logits: T_7 | TensorLike,
    weights: TensorLike,
    labelSmoothing: Double,
    reduction: typings.tensorflowTfjsCore.distOpsLossOpsUtilsMod.Reduction
  ): O_7 = (^.asInstanceOf[js.Dynamic].applyDynamic("sigmoidCrossEntropy")(multiClassLabels.asInstanceOf[js.Any], logits.asInstanceOf[js.Any], weights.asInstanceOf[js.Any], labelSmoothing.asInstanceOf[js.Any], reduction.asInstanceOf[js.Any])).asInstanceOf[O_7]
  inline def sigmoidCrossEntropy[T_7 /* <: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] */, O_7 /* <: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] */](
    multiClassLabels: T_7 | TensorLike,
    logits: T_7 | TensorLike,
    weights: TensorLike,
    labelSmoothing: Unit,
    reduction: typings.tensorflowTfjsCore.distOpsLossOpsUtilsMod.Reduction
  ): O_7 = (^.asInstanceOf[js.Dynamic].applyDynamic("sigmoidCrossEntropy")(multiClassLabels.asInstanceOf[js.Any], logits.asInstanceOf[js.Any], weights.asInstanceOf[js.Any], labelSmoothing.asInstanceOf[js.Any], reduction.asInstanceOf[js.Any])).asInstanceOf[O_7]
  
  inline def softmaxCrossEntropy[T_8 /* <: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] */, O_8 /* <: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] */](onehotLabels: T_8 | TensorLike, logits: T_8 | TensorLike): O_8 = (^.asInstanceOf[js.Dynamic].applyDynamic("softmaxCrossEntropy")(onehotLabels.asInstanceOf[js.Any], logits.asInstanceOf[js.Any])).asInstanceOf[O_8]
  inline def softmaxCrossEntropy[T_8 /* <: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] */, O_8 /* <: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] */](onehotLabels: T_8 | TensorLike, logits: T_8 | TensorLike, weights: Unit, labelSmoothing: Double): O_8 = (^.asInstanceOf[js.Dynamic].applyDynamic("softmaxCrossEntropy")(onehotLabels.asInstanceOf[js.Any], logits.asInstanceOf[js.Any], weights.asInstanceOf[js.Any], labelSmoothing.asInstanceOf[js.Any])).asInstanceOf[O_8]
  inline def softmaxCrossEntropy[T_8 /* <: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] */, O_8 /* <: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] */](
    onehotLabels: T_8 | TensorLike,
    logits: T_8 | TensorLike,
    weights: Unit,
    labelSmoothing: Double,
    reduction: typings.tensorflowTfjsCore.distOpsLossOpsUtilsMod.Reduction
  ): O_8 = (^.asInstanceOf[js.Dynamic].applyDynamic("softmaxCrossEntropy")(onehotLabels.asInstanceOf[js.Any], logits.asInstanceOf[js.Any], weights.asInstanceOf[js.Any], labelSmoothing.asInstanceOf[js.Any], reduction.asInstanceOf[js.Any])).asInstanceOf[O_8]
  inline def softmaxCrossEntropy[T_8 /* <: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] */, O_8 /* <: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] */](
    onehotLabels: T_8 | TensorLike,
    logits: T_8 | TensorLike,
    weights: Unit,
    labelSmoothing: Unit,
    reduction: typings.tensorflowTfjsCore.distOpsLossOpsUtilsMod.Reduction
  ): O_8 = (^.asInstanceOf[js.Dynamic].applyDynamic("softmaxCrossEntropy")(onehotLabels.asInstanceOf[js.Any], logits.asInstanceOf[js.Any], weights.asInstanceOf[js.Any], labelSmoothing.asInstanceOf[js.Any], reduction.asInstanceOf[js.Any])).asInstanceOf[O_8]
  inline def softmaxCrossEntropy[T_8 /* <: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] */, O_8 /* <: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] */](
    onehotLabels: T_8 | TensorLike,
    logits: T_8 | TensorLike,
    weights: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]
  ): O_8 = (^.asInstanceOf[js.Dynamic].applyDynamic("softmaxCrossEntropy")(onehotLabels.asInstanceOf[js.Any], logits.asInstanceOf[js.Any], weights.asInstanceOf[js.Any])).asInstanceOf[O_8]
  inline def softmaxCrossEntropy[T_8 /* <: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] */, O_8 /* <: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] */](
    onehotLabels: T_8 | TensorLike,
    logits: T_8 | TensorLike,
    weights: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank],
    labelSmoothing: Double
  ): O_8 = (^.asInstanceOf[js.Dynamic].applyDynamic("softmaxCrossEntropy")(onehotLabels.asInstanceOf[js.Any], logits.asInstanceOf[js.Any], weights.asInstanceOf[js.Any], labelSmoothing.asInstanceOf[js.Any])).asInstanceOf[O_8]
  inline def softmaxCrossEntropy[T_8 /* <: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] */, O_8 /* <: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] */](
    onehotLabels: T_8 | TensorLike,
    logits: T_8 | TensorLike,
    weights: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank],
    labelSmoothing: Double,
    reduction: typings.tensorflowTfjsCore.distOpsLossOpsUtilsMod.Reduction
  ): O_8 = (^.asInstanceOf[js.Dynamic].applyDynamic("softmaxCrossEntropy")(onehotLabels.asInstanceOf[js.Any], logits.asInstanceOf[js.Any], weights.asInstanceOf[js.Any], labelSmoothing.asInstanceOf[js.Any], reduction.asInstanceOf[js.Any])).asInstanceOf[O_8]
  inline def softmaxCrossEntropy[T_8 /* <: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] */, O_8 /* <: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] */](
    onehotLabels: T_8 | TensorLike,
    logits: T_8 | TensorLike,
    weights: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank],
    labelSmoothing: Unit,
    reduction: typings.tensorflowTfjsCore.distOpsLossOpsUtilsMod.Reduction
  ): O_8 = (^.asInstanceOf[js.Dynamic].applyDynamic("softmaxCrossEntropy")(onehotLabels.asInstanceOf[js.Any], logits.asInstanceOf[js.Any], weights.asInstanceOf[js.Any], labelSmoothing.asInstanceOf[js.Any], reduction.asInstanceOf[js.Any])).asInstanceOf[O_8]
  inline def softmaxCrossEntropy[T_8 /* <: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] */, O_8 /* <: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] */](onehotLabels: T_8 | TensorLike, logits: T_8 | TensorLike, weights: TensorLike): O_8 = (^.asInstanceOf[js.Dynamic].applyDynamic("softmaxCrossEntropy")(onehotLabels.asInstanceOf[js.Any], logits.asInstanceOf[js.Any], weights.asInstanceOf[js.Any])).asInstanceOf[O_8]
  inline def softmaxCrossEntropy[T_8 /* <: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] */, O_8 /* <: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] */](
    onehotLabels: T_8 | TensorLike,
    logits: T_8 | TensorLike,
    weights: TensorLike,
    labelSmoothing: Double
  ): O_8 = (^.asInstanceOf[js.Dynamic].applyDynamic("softmaxCrossEntropy")(onehotLabels.asInstanceOf[js.Any], logits.asInstanceOf[js.Any], weights.asInstanceOf[js.Any], labelSmoothing.asInstanceOf[js.Any])).asInstanceOf[O_8]
  inline def softmaxCrossEntropy[T_8 /* <: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] */, O_8 /* <: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] */](
    onehotLabels: T_8 | TensorLike,
    logits: T_8 | TensorLike,
    weights: TensorLike,
    labelSmoothing: Double,
    reduction: typings.tensorflowTfjsCore.distOpsLossOpsUtilsMod.Reduction
  ): O_8 = (^.asInstanceOf[js.Dynamic].applyDynamic("softmaxCrossEntropy")(onehotLabels.asInstanceOf[js.Any], logits.asInstanceOf[js.Any], weights.asInstanceOf[js.Any], labelSmoothing.asInstanceOf[js.Any], reduction.asInstanceOf[js.Any])).asInstanceOf[O_8]
  inline def softmaxCrossEntropy[T_8 /* <: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] */, O_8 /* <: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] */](
    onehotLabels: T_8 | TensorLike,
    logits: T_8 | TensorLike,
    weights: TensorLike,
    labelSmoothing: Unit,
    reduction: typings.tensorflowTfjsCore.distOpsLossOpsUtilsMod.Reduction
  ): O_8 = (^.asInstanceOf[js.Dynamic].applyDynamic("softmaxCrossEntropy")(onehotLabels.asInstanceOf[js.Any], logits.asInstanceOf[js.Any], weights.asInstanceOf[js.Any], labelSmoothing.asInstanceOf[js.Any], reduction.asInstanceOf[js.Any])).asInstanceOf[O_8]
}
