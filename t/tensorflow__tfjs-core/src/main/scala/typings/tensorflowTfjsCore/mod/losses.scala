package typings.tensorflowTfjsCore.mod

import typings.std.Float32Array
import typings.std.Int32Array
import typings.std.Uint8Array
import typings.tensorflowTfjsCore.distTensorMod.Tensor
import typings.tensorflowTfjsCore.distTypesMod.RecursiveArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object losses {
  
  @JSImport("@tensorflow/tfjs-core", "losses")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def absoluteDifference[T /* <: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] */, O /* <: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] */](
    labels: String | Double | Boolean | Uint8Array | Int32Array | Float32Array | (RecursiveArray[
      js.Array[Double] | Boolean | Double | Float32Array | Int32Array | String | Uint8Array
    ]) | js.Array[Uint8Array] | T,
    predictions: String | Double | Boolean | Uint8Array | Int32Array | Float32Array | (RecursiveArray[
      js.Array[Double] | Boolean | Double | Float32Array | Int32Array | String | Uint8Array
    ]) | js.Array[Uint8Array] | T,
    weights: js.UndefOr[
      String | Double | Boolean | Uint8Array | Int32Array | Float32Array | (RecursiveArray[
        js.Array[Double] | Boolean | Double | Float32Array | Int32Array | String | Uint8Array
      ]) | js.Array[Uint8Array] | Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]
    ],
    reduction: js.UndefOr[typings.tensorflowTfjsCore.lossOpsUtilsMod.Reduction]
  ): O = (^.asInstanceOf[js.Dynamic].applyDynamic("absoluteDifference")(labels.asInstanceOf[js.Any], predictions.asInstanceOf[js.Any], weights.asInstanceOf[js.Any], reduction.asInstanceOf[js.Any])).asInstanceOf[O]
  
  @scala.inline
  def computeWeightedLoss[T /* <: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] */, O /* <: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] */](
    losses: String | Double | Boolean | Uint8Array | Int32Array | Float32Array | (RecursiveArray[
      js.Array[Double] | Boolean | Double | Float32Array | Int32Array | String | Uint8Array
    ]) | js.Array[Uint8Array] | T,
    weights: js.UndefOr[
      String | Double | Boolean | Uint8Array | Int32Array | Float32Array | (RecursiveArray[
        js.Array[Double] | Boolean | Double | Float32Array | Int32Array | String | Uint8Array
      ]) | js.Array[Uint8Array] | Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]
    ],
    reduction: js.UndefOr[typings.tensorflowTfjsCore.lossOpsUtilsMod.Reduction]
  ): O = (^.asInstanceOf[js.Dynamic].applyDynamic("computeWeightedLoss")(losses.asInstanceOf[js.Any], weights.asInstanceOf[js.Any], reduction.asInstanceOf[js.Any])).asInstanceOf[O]
  
  @scala.inline
  def cosineDistance[T /* <: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] */, O /* <: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] */](
    labels: String | Double | Boolean | Uint8Array | Int32Array | Float32Array | (RecursiveArray[
      js.Array[Double] | Boolean | Double | Float32Array | Int32Array | String | Uint8Array
    ]) | js.Array[Uint8Array] | T,
    predictions: String | Double | Boolean | Uint8Array | Int32Array | Float32Array | (RecursiveArray[
      js.Array[Double] | Boolean | Double | Float32Array | Int32Array | String | Uint8Array
    ]) | js.Array[Uint8Array] | T,
    axis: Double,
    weights: js.UndefOr[
      String | Double | Boolean | Uint8Array | Int32Array | Float32Array | (RecursiveArray[
        js.Array[Double] | Boolean | Double | Float32Array | Int32Array | String | Uint8Array
      ]) | js.Array[Uint8Array] | Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]
    ],
    reduction: js.UndefOr[typings.tensorflowTfjsCore.lossOpsUtilsMod.Reduction]
  ): O = (^.asInstanceOf[js.Dynamic].applyDynamic("cosineDistance")(labels.asInstanceOf[js.Any], predictions.asInstanceOf[js.Any], axis.asInstanceOf[js.Any], weights.asInstanceOf[js.Any], reduction.asInstanceOf[js.Any])).asInstanceOf[O]
  
  @scala.inline
  def hingeLoss[T /* <: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] */, O /* <: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] */](
    labels: String | Double | Boolean | Uint8Array | Int32Array | Float32Array | (RecursiveArray[
      js.Array[Double] | Boolean | Double | Float32Array | Int32Array | String | Uint8Array
    ]) | js.Array[Uint8Array] | T,
    predictions: String | Double | Boolean | Uint8Array | Int32Array | Float32Array | (RecursiveArray[
      js.Array[Double] | Boolean | Double | Float32Array | Int32Array | String | Uint8Array
    ]) | js.Array[Uint8Array] | T,
    weights: js.UndefOr[
      String | Double | Boolean | Uint8Array | Int32Array | Float32Array | (RecursiveArray[
        js.Array[Double] | Boolean | Double | Float32Array | Int32Array | String | Uint8Array
      ]) | js.Array[Uint8Array] | Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]
    ],
    reduction: js.UndefOr[typings.tensorflowTfjsCore.lossOpsUtilsMod.Reduction]
  ): O = (^.asInstanceOf[js.Dynamic].applyDynamic("hingeLoss")(labels.asInstanceOf[js.Any], predictions.asInstanceOf[js.Any], weights.asInstanceOf[js.Any], reduction.asInstanceOf[js.Any])).asInstanceOf[O]
  
  @scala.inline
  def huberLoss[T /* <: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] */, O /* <: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] */](
    labels: String | Double | Boolean | Uint8Array | Int32Array | Float32Array | (RecursiveArray[
      js.Array[Double] | Boolean | Double | Float32Array | Int32Array | String | Uint8Array
    ]) | js.Array[Uint8Array] | T,
    predictions: String | Double | Boolean | Uint8Array | Int32Array | Float32Array | (RecursiveArray[
      js.Array[Double] | Boolean | Double | Float32Array | Int32Array | String | Uint8Array
    ]) | js.Array[Uint8Array] | T,
    weights: js.UndefOr[
      String | Double | Boolean | Uint8Array | Int32Array | Float32Array | (RecursiveArray[
        js.Array[Double] | Boolean | Double | Float32Array | Int32Array | String | Uint8Array
      ]) | js.Array[Uint8Array] | Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]
    ],
    delta: js.UndefOr[Double],
    reduction: js.UndefOr[typings.tensorflowTfjsCore.lossOpsUtilsMod.Reduction]
  ): O = (^.asInstanceOf[js.Dynamic].applyDynamic("huberLoss")(labels.asInstanceOf[js.Any], predictions.asInstanceOf[js.Any], weights.asInstanceOf[js.Any], delta.asInstanceOf[js.Any], reduction.asInstanceOf[js.Any])).asInstanceOf[O]
  
  @scala.inline
  def logLoss[T /* <: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] */, O /* <: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] */](
    labels: String | Double | Boolean | Uint8Array | Int32Array | Float32Array | (RecursiveArray[
      js.Array[Double] | Boolean | Double | Float32Array | Int32Array | String | Uint8Array
    ]) | js.Array[Uint8Array] | T,
    predictions: String | Double | Boolean | Uint8Array | Int32Array | Float32Array | (RecursiveArray[
      js.Array[Double] | Boolean | Double | Float32Array | Int32Array | String | Uint8Array
    ]) | js.Array[Uint8Array] | T,
    weights: js.UndefOr[
      String | Double | Boolean | Uint8Array | Int32Array | Float32Array | (RecursiveArray[
        js.Array[Double] | Boolean | Double | Float32Array | Int32Array | String | Uint8Array
      ]) | js.Array[Uint8Array] | Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]
    ],
    epsilon: js.UndefOr[Double],
    reduction: js.UndefOr[typings.tensorflowTfjsCore.lossOpsUtilsMod.Reduction]
  ): O = (^.asInstanceOf[js.Dynamic].applyDynamic("logLoss")(labels.asInstanceOf[js.Any], predictions.asInstanceOf[js.Any], weights.asInstanceOf[js.Any], epsilon.asInstanceOf[js.Any], reduction.asInstanceOf[js.Any])).asInstanceOf[O]
  
  @scala.inline
  def meanSquaredError[T /* <: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] */, O /* <: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] */](
    labels: String | Double | Boolean | Uint8Array | Int32Array | Float32Array | (RecursiveArray[
      js.Array[Double] | Boolean | Double | Float32Array | Int32Array | String | Uint8Array
    ]) | js.Array[Uint8Array] | T,
    predictions: String | Double | Boolean | Uint8Array | Int32Array | Float32Array | (RecursiveArray[
      js.Array[Double] | Boolean | Double | Float32Array | Int32Array | String | Uint8Array
    ]) | js.Array[Uint8Array] | T,
    weights: js.UndefOr[
      String | Double | Boolean | Uint8Array | Int32Array | Float32Array | (RecursiveArray[
        js.Array[Double] | Boolean | Double | Float32Array | Int32Array | String | Uint8Array
      ]) | js.Array[Uint8Array] | Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]
    ],
    reduction: js.UndefOr[typings.tensorflowTfjsCore.lossOpsUtilsMod.Reduction]
  ): O = (^.asInstanceOf[js.Dynamic].applyDynamic("meanSquaredError")(labels.asInstanceOf[js.Any], predictions.asInstanceOf[js.Any], weights.asInstanceOf[js.Any], reduction.asInstanceOf[js.Any])).asInstanceOf[O]
  
  @scala.inline
  def sigmoidCrossEntropy[T /* <: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] */, O /* <: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] */](
    multiClassLabels: String | Double | Boolean | Uint8Array | Int32Array | Float32Array | (RecursiveArray[
      js.Array[Double] | Boolean | Double | Float32Array | Int32Array | String | Uint8Array
    ]) | js.Array[Uint8Array] | T,
    logits: String | Double | Boolean | Uint8Array | Int32Array | Float32Array | (RecursiveArray[
      js.Array[Double] | Boolean | Double | Float32Array | Int32Array | String | Uint8Array
    ]) | js.Array[Uint8Array] | T,
    weights: js.UndefOr[
      String | Double | Boolean | Uint8Array | Int32Array | Float32Array | (RecursiveArray[
        js.Array[Double] | Boolean | Double | Float32Array | Int32Array | String | Uint8Array
      ]) | js.Array[Uint8Array] | Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]
    ],
    labelSmoothing: js.UndefOr[Double],
    reduction: js.UndefOr[typings.tensorflowTfjsCore.lossOpsUtilsMod.Reduction]
  ): O = (^.asInstanceOf[js.Dynamic].applyDynamic("sigmoidCrossEntropy")(multiClassLabels.asInstanceOf[js.Any], logits.asInstanceOf[js.Any], weights.asInstanceOf[js.Any], labelSmoothing.asInstanceOf[js.Any], reduction.asInstanceOf[js.Any])).asInstanceOf[O]
  
  @scala.inline
  def softmaxCrossEntropy[T /* <: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] */, O /* <: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] */](
    onehotLabels: String | Double | Boolean | Uint8Array | Int32Array | Float32Array | (RecursiveArray[
      js.Array[Double] | Boolean | Double | Float32Array | Int32Array | String | Uint8Array
    ]) | js.Array[Uint8Array] | T,
    logits: String | Double | Boolean | Uint8Array | Int32Array | Float32Array | (RecursiveArray[
      js.Array[Double] | Boolean | Double | Float32Array | Int32Array | String | Uint8Array
    ]) | js.Array[Uint8Array] | T,
    weights: js.UndefOr[
      String | Double | Boolean | Uint8Array | Int32Array | Float32Array | (RecursiveArray[
        js.Array[Double] | Boolean | Double | Float32Array | Int32Array | String | Uint8Array
      ]) | js.Array[Uint8Array] | Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]
    ],
    labelSmoothing: js.UndefOr[Double],
    reduction: js.UndefOr[typings.tensorflowTfjsCore.lossOpsUtilsMod.Reduction]
  ): O = (^.asInstanceOf[js.Dynamic].applyDynamic("softmaxCrossEntropy")(onehotLabels.asInstanceOf[js.Any], logits.asInstanceOf[js.Any], weights.asInstanceOf[js.Any], labelSmoothing.asInstanceOf[js.Any], reduction.asInstanceOf[js.Any])).asInstanceOf[O]
}
