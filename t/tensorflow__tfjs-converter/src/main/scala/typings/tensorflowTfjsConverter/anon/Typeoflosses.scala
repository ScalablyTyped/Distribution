package typings.tensorflowTfjsConverter.anon

import typings.tensorflowTfjsCore.distOpsLossOpsUtilsMod.Reduction
import typings.tensorflowTfjsCore.distTypesMod.Rank
import typings.tensorflowTfjsCore.distTypesMod.TensorLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeoflosses extends StObject {
  
  def absoluteDifference[T /* <: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] */, O /* <: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] */](labels: T | TensorLike, predictions: T | TensorLike): O = js.native
  def absoluteDifference[T /* <: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] */, O /* <: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] */](labels: T | TensorLike, predictions: T | TensorLike, weights: Unit, reduction: Reduction): O = js.native
  def absoluteDifference[T /* <: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] */, O /* <: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] */](
    labels: T | TensorLike,
    predictions: T | TensorLike,
    weights: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank]
  ): O = js.native
  def absoluteDifference[T /* <: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] */, O /* <: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] */](
    labels: T | TensorLike,
    predictions: T | TensorLike,
    weights: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank],
    reduction: Reduction
  ): O = js.native
  def absoluteDifference[T /* <: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] */, O /* <: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] */](labels: T | TensorLike, predictions: T | TensorLike, weights: TensorLike): O = js.native
  def absoluteDifference[T /* <: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] */, O /* <: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] */](labels: T | TensorLike, predictions: T | TensorLike, weights: TensorLike, reduction: Reduction): O = js.native
  
  def computeWeightedLoss[T_1 /* <: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] */, O_1 /* <: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] */](losses: T_1 | TensorLike): O_1 = js.native
  def computeWeightedLoss[T_1 /* <: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] */, O_1 /* <: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] */](losses: T_1 | TensorLike, weights: Unit, reduction: Reduction): O_1 = js.native
  def computeWeightedLoss[T_1 /* <: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] */, O_1 /* <: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] */](losses: T_1 | TensorLike, weights: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank]): O_1 = js.native
  def computeWeightedLoss[T_1 /* <: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] */, O_1 /* <: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] */](
    losses: T_1 | TensorLike,
    weights: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank],
    reduction: Reduction
  ): O_1 = js.native
  def computeWeightedLoss[T_1 /* <: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] */, O_1 /* <: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] */](losses: T_1 | TensorLike, weights: TensorLike): O_1 = js.native
  def computeWeightedLoss[T_1 /* <: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] */, O_1 /* <: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] */](losses: T_1 | TensorLike, weights: TensorLike, reduction: Reduction): O_1 = js.native
  
  def cosineDistance[T_2 /* <: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] */, O_2 /* <: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] */](labels: T_2 | TensorLike, predictions: T_2 | TensorLike, axis: Double): O_2 = js.native
  def cosineDistance[T_2 /* <: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] */, O_2 /* <: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] */](
    labels: T_2 | TensorLike,
    predictions: T_2 | TensorLike,
    axis: Double,
    weights: Unit,
    reduction: Reduction
  ): O_2 = js.native
  def cosineDistance[T_2 /* <: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] */, O_2 /* <: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] */](
    labels: T_2 | TensorLike,
    predictions: T_2 | TensorLike,
    axis: Double,
    weights: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank]
  ): O_2 = js.native
  def cosineDistance[T_2 /* <: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] */, O_2 /* <: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] */](
    labels: T_2 | TensorLike,
    predictions: T_2 | TensorLike,
    axis: Double,
    weights: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank],
    reduction: Reduction
  ): O_2 = js.native
  def cosineDistance[T_2 /* <: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] */, O_2 /* <: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] */](labels: T_2 | TensorLike, predictions: T_2 | TensorLike, axis: Double, weights: TensorLike): O_2 = js.native
  def cosineDistance[T_2 /* <: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] */, O_2 /* <: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] */](
    labels: T_2 | TensorLike,
    predictions: T_2 | TensorLike,
    axis: Double,
    weights: TensorLike,
    reduction: Reduction
  ): O_2 = js.native
  
  def hingeLoss[T_3 /* <: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] */, O_3 /* <: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] */](labels: T_3 | TensorLike, predictions: T_3 | TensorLike): O_3 = js.native
  def hingeLoss[T_3 /* <: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] */, O_3 /* <: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] */](labels: T_3 | TensorLike, predictions: T_3 | TensorLike, weights: Unit, reduction: Reduction): O_3 = js.native
  def hingeLoss[T_3 /* <: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] */, O_3 /* <: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] */](
    labels: T_3 | TensorLike,
    predictions: T_3 | TensorLike,
    weights: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank]
  ): O_3 = js.native
  def hingeLoss[T_3 /* <: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] */, O_3 /* <: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] */](
    labels: T_3 | TensorLike,
    predictions: T_3 | TensorLike,
    weights: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank],
    reduction: Reduction
  ): O_3 = js.native
  def hingeLoss[T_3 /* <: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] */, O_3 /* <: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] */](labels: T_3 | TensorLike, predictions: T_3 | TensorLike, weights: TensorLike): O_3 = js.native
  def hingeLoss[T_3 /* <: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] */, O_3 /* <: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] */](labels: T_3 | TensorLike, predictions: T_3 | TensorLike, weights: TensorLike, reduction: Reduction): O_3 = js.native
  
  def huberLoss[T_4 /* <: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] */, O_4 /* <: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] */](labels: T_4 | TensorLike, predictions: T_4 | TensorLike): O_4 = js.native
  def huberLoss[T_4 /* <: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] */, O_4 /* <: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] */](labels: T_4 | TensorLike, predictions: T_4 | TensorLike, weights: Unit, delta: Double): O_4 = js.native
  def huberLoss[T_4 /* <: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] */, O_4 /* <: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] */](
    labels: T_4 | TensorLike,
    predictions: T_4 | TensorLike,
    weights: Unit,
    delta: Double,
    reduction: Reduction
  ): O_4 = js.native
  def huberLoss[T_4 /* <: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] */, O_4 /* <: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] */](
    labels: T_4 | TensorLike,
    predictions: T_4 | TensorLike,
    weights: Unit,
    delta: Unit,
    reduction: Reduction
  ): O_4 = js.native
  def huberLoss[T_4 /* <: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] */, O_4 /* <: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] */](
    labels: T_4 | TensorLike,
    predictions: T_4 | TensorLike,
    weights: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank]
  ): O_4 = js.native
  def huberLoss[T_4 /* <: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] */, O_4 /* <: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] */](
    labels: T_4 | TensorLike,
    predictions: T_4 | TensorLike,
    weights: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank],
    delta: Double
  ): O_4 = js.native
  def huberLoss[T_4 /* <: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] */, O_4 /* <: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] */](
    labels: T_4 | TensorLike,
    predictions: T_4 | TensorLike,
    weights: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank],
    delta: Double,
    reduction: Reduction
  ): O_4 = js.native
  def huberLoss[T_4 /* <: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] */, O_4 /* <: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] */](
    labels: T_4 | TensorLike,
    predictions: T_4 | TensorLike,
    weights: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank],
    delta: Unit,
    reduction: Reduction
  ): O_4 = js.native
  def huberLoss[T_4 /* <: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] */, O_4 /* <: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] */](labels: T_4 | TensorLike, predictions: T_4 | TensorLike, weights: TensorLike): O_4 = js.native
  def huberLoss[T_4 /* <: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] */, O_4 /* <: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] */](labels: T_4 | TensorLike, predictions: T_4 | TensorLike, weights: TensorLike, delta: Double): O_4 = js.native
  def huberLoss[T_4 /* <: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] */, O_4 /* <: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] */](
    labels: T_4 | TensorLike,
    predictions: T_4 | TensorLike,
    weights: TensorLike,
    delta: Double,
    reduction: Reduction
  ): O_4 = js.native
  def huberLoss[T_4 /* <: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] */, O_4 /* <: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] */](
    labels: T_4 | TensorLike,
    predictions: T_4 | TensorLike,
    weights: TensorLike,
    delta: Unit,
    reduction: Reduction
  ): O_4 = js.native
  
  def logLoss[T_5 /* <: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] */, O_5 /* <: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] */](labels: T_5 | TensorLike, predictions: T_5 | TensorLike): O_5 = js.native
  def logLoss[T_5 /* <: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] */, O_5 /* <: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] */](labels: T_5 | TensorLike, predictions: T_5 | TensorLike, weights: Unit, epsilon: Double): O_5 = js.native
  def logLoss[T_5 /* <: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] */, O_5 /* <: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] */](
    labels: T_5 | TensorLike,
    predictions: T_5 | TensorLike,
    weights: Unit,
    epsilon: Double,
    reduction: Reduction
  ): O_5 = js.native
  def logLoss[T_5 /* <: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] */, O_5 /* <: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] */](
    labels: T_5 | TensorLike,
    predictions: T_5 | TensorLike,
    weights: Unit,
    epsilon: Unit,
    reduction: Reduction
  ): O_5 = js.native
  def logLoss[T_5 /* <: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] */, O_5 /* <: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] */](
    labels: T_5 | TensorLike,
    predictions: T_5 | TensorLike,
    weights: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank]
  ): O_5 = js.native
  def logLoss[T_5 /* <: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] */, O_5 /* <: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] */](
    labels: T_5 | TensorLike,
    predictions: T_5 | TensorLike,
    weights: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank],
    epsilon: Double
  ): O_5 = js.native
  def logLoss[T_5 /* <: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] */, O_5 /* <: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] */](
    labels: T_5 | TensorLike,
    predictions: T_5 | TensorLike,
    weights: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank],
    epsilon: Double,
    reduction: Reduction
  ): O_5 = js.native
  def logLoss[T_5 /* <: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] */, O_5 /* <: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] */](
    labels: T_5 | TensorLike,
    predictions: T_5 | TensorLike,
    weights: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank],
    epsilon: Unit,
    reduction: Reduction
  ): O_5 = js.native
  def logLoss[T_5 /* <: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] */, O_5 /* <: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] */](labels: T_5 | TensorLike, predictions: T_5 | TensorLike, weights: TensorLike): O_5 = js.native
  def logLoss[T_5 /* <: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] */, O_5 /* <: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] */](labels: T_5 | TensorLike, predictions: T_5 | TensorLike, weights: TensorLike, epsilon: Double): O_5 = js.native
  def logLoss[T_5 /* <: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] */, O_5 /* <: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] */](
    labels: T_5 | TensorLike,
    predictions: T_5 | TensorLike,
    weights: TensorLike,
    epsilon: Double,
    reduction: Reduction
  ): O_5 = js.native
  def logLoss[T_5 /* <: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] */, O_5 /* <: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] */](
    labels: T_5 | TensorLike,
    predictions: T_5 | TensorLike,
    weights: TensorLike,
    epsilon: Unit,
    reduction: Reduction
  ): O_5 = js.native
  
  def meanSquaredError[T_6 /* <: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] */, O_6 /* <: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] */](labels: T_6 | TensorLike, predictions: T_6 | TensorLike): O_6 = js.native
  def meanSquaredError[T_6 /* <: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] */, O_6 /* <: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] */](labels: T_6 | TensorLike, predictions: T_6 | TensorLike, weights: Unit, reduction: Reduction): O_6 = js.native
  def meanSquaredError[T_6 /* <: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] */, O_6 /* <: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] */](
    labels: T_6 | TensorLike,
    predictions: T_6 | TensorLike,
    weights: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank]
  ): O_6 = js.native
  def meanSquaredError[T_6 /* <: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] */, O_6 /* <: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] */](
    labels: T_6 | TensorLike,
    predictions: T_6 | TensorLike,
    weights: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank],
    reduction: Reduction
  ): O_6 = js.native
  def meanSquaredError[T_6 /* <: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] */, O_6 /* <: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] */](labels: T_6 | TensorLike, predictions: T_6 | TensorLike, weights: TensorLike): O_6 = js.native
  def meanSquaredError[T_6 /* <: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] */, O_6 /* <: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] */](labels: T_6 | TensorLike, predictions: T_6 | TensorLike, weights: TensorLike, reduction: Reduction): O_6 = js.native
  
  def sigmoidCrossEntropy[T_7 /* <: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] */, O_7 /* <: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] */](multiClassLabels: T_7 | TensorLike, logits: T_7 | TensorLike): O_7 = js.native
  def sigmoidCrossEntropy[T_7 /* <: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] */, O_7 /* <: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] */](
    multiClassLabels: T_7 | TensorLike,
    logits: T_7 | TensorLike,
    weights: Unit,
    labelSmoothing: Double
  ): O_7 = js.native
  def sigmoidCrossEntropy[T_7 /* <: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] */, O_7 /* <: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] */](
    multiClassLabels: T_7 | TensorLike,
    logits: T_7 | TensorLike,
    weights: Unit,
    labelSmoothing: Double,
    reduction: Reduction
  ): O_7 = js.native
  def sigmoidCrossEntropy[T_7 /* <: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] */, O_7 /* <: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] */](
    multiClassLabels: T_7 | TensorLike,
    logits: T_7 | TensorLike,
    weights: Unit,
    labelSmoothing: Unit,
    reduction: Reduction
  ): O_7 = js.native
  def sigmoidCrossEntropy[T_7 /* <: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] */, O_7 /* <: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] */](
    multiClassLabels: T_7 | TensorLike,
    logits: T_7 | TensorLike,
    weights: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank]
  ): O_7 = js.native
  def sigmoidCrossEntropy[T_7 /* <: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] */, O_7 /* <: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] */](
    multiClassLabels: T_7 | TensorLike,
    logits: T_7 | TensorLike,
    weights: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank],
    labelSmoothing: Double
  ): O_7 = js.native
  def sigmoidCrossEntropy[T_7 /* <: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] */, O_7 /* <: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] */](
    multiClassLabels: T_7 | TensorLike,
    logits: T_7 | TensorLike,
    weights: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank],
    labelSmoothing: Double,
    reduction: Reduction
  ): O_7 = js.native
  def sigmoidCrossEntropy[T_7 /* <: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] */, O_7 /* <: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] */](
    multiClassLabels: T_7 | TensorLike,
    logits: T_7 | TensorLike,
    weights: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank],
    labelSmoothing: Unit,
    reduction: Reduction
  ): O_7 = js.native
  def sigmoidCrossEntropy[T_7 /* <: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] */, O_7 /* <: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] */](multiClassLabels: T_7 | TensorLike, logits: T_7 | TensorLike, weights: TensorLike): O_7 = js.native
  def sigmoidCrossEntropy[T_7 /* <: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] */, O_7 /* <: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] */](
    multiClassLabels: T_7 | TensorLike,
    logits: T_7 | TensorLike,
    weights: TensorLike,
    labelSmoothing: Double
  ): O_7 = js.native
  def sigmoidCrossEntropy[T_7 /* <: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] */, O_7 /* <: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] */](
    multiClassLabels: T_7 | TensorLike,
    logits: T_7 | TensorLike,
    weights: TensorLike,
    labelSmoothing: Double,
    reduction: Reduction
  ): O_7 = js.native
  def sigmoidCrossEntropy[T_7 /* <: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] */, O_7 /* <: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] */](
    multiClassLabels: T_7 | TensorLike,
    logits: T_7 | TensorLike,
    weights: TensorLike,
    labelSmoothing: Unit,
    reduction: Reduction
  ): O_7 = js.native
  
  def softmaxCrossEntropy[T_8 /* <: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] */, O_8 /* <: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] */](onehotLabels: T_8 | TensorLike, logits: T_8 | TensorLike): O_8 = js.native
  def softmaxCrossEntropy[T_8 /* <: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] */, O_8 /* <: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] */](onehotLabels: T_8 | TensorLike, logits: T_8 | TensorLike, weights: Unit, labelSmoothing: Double): O_8 = js.native
  def softmaxCrossEntropy[T_8 /* <: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] */, O_8 /* <: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] */](
    onehotLabels: T_8 | TensorLike,
    logits: T_8 | TensorLike,
    weights: Unit,
    labelSmoothing: Double,
    reduction: Reduction
  ): O_8 = js.native
  def softmaxCrossEntropy[T_8 /* <: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] */, O_8 /* <: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] */](
    onehotLabels: T_8 | TensorLike,
    logits: T_8 | TensorLike,
    weights: Unit,
    labelSmoothing: Unit,
    reduction: Reduction
  ): O_8 = js.native
  def softmaxCrossEntropy[T_8 /* <: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] */, O_8 /* <: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] */](
    onehotLabels: T_8 | TensorLike,
    logits: T_8 | TensorLike,
    weights: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank]
  ): O_8 = js.native
  def softmaxCrossEntropy[T_8 /* <: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] */, O_8 /* <: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] */](
    onehotLabels: T_8 | TensorLike,
    logits: T_8 | TensorLike,
    weights: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank],
    labelSmoothing: Double
  ): O_8 = js.native
  def softmaxCrossEntropy[T_8 /* <: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] */, O_8 /* <: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] */](
    onehotLabels: T_8 | TensorLike,
    logits: T_8 | TensorLike,
    weights: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank],
    labelSmoothing: Double,
    reduction: Reduction
  ): O_8 = js.native
  def softmaxCrossEntropy[T_8 /* <: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] */, O_8 /* <: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] */](
    onehotLabels: T_8 | TensorLike,
    logits: T_8 | TensorLike,
    weights: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank],
    labelSmoothing: Unit,
    reduction: Reduction
  ): O_8 = js.native
  def softmaxCrossEntropy[T_8 /* <: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] */, O_8 /* <: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] */](onehotLabels: T_8 | TensorLike, logits: T_8 | TensorLike, weights: TensorLike): O_8 = js.native
  def softmaxCrossEntropy[T_8 /* <: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] */, O_8 /* <: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] */](
    onehotLabels: T_8 | TensorLike,
    logits: T_8 | TensorLike,
    weights: TensorLike,
    labelSmoothing: Double
  ): O_8 = js.native
  def softmaxCrossEntropy[T_8 /* <: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] */, O_8 /* <: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] */](
    onehotLabels: T_8 | TensorLike,
    logits: T_8 | TensorLike,
    weights: TensorLike,
    labelSmoothing: Double,
    reduction: Reduction
  ): O_8 = js.native
  def softmaxCrossEntropy[T_8 /* <: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] */, O_8 /* <: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] */](
    onehotLabels: T_8 | TensorLike,
    logits: T_8 | TensorLike,
    weights: TensorLike,
    labelSmoothing: Unit,
    reduction: Reduction
  ): O_8 = js.native
}
