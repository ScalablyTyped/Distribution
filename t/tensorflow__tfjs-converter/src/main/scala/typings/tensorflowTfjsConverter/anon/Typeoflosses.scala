package typings.tensorflowTfjsConverter.anon

import typings.tensorflowTfjsCore.distTypesMod.Rank
import typings.tensorflowTfjsCore.distTypesMod.RecursiveArray
import typings.tensorflowTfjsCore.lossOpsUtilsMod.Reduction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Typeoflosses extends StObject {
  
  def absoluteDifference[T /* <: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] */, O /* <: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] */](
    labels: String | Double | Boolean | js.typedarray.Float32Array | js.typedarray.Int32Array | js.typedarray.Uint8Array | (RecursiveArray[
      js.Array[Double] | Boolean | Double | js.typedarray.Float32Array | js.typedarray.Int32Array | String | js.typedarray.Uint8Array
    ]) | js.Array[js.typedarray.Uint8Array] | T,
    predictions: String | Double | Boolean | js.typedarray.Float32Array | js.typedarray.Int32Array | js.typedarray.Uint8Array | (RecursiveArray[
      js.Array[Double] | Boolean | Double | js.typedarray.Float32Array | js.typedarray.Int32Array | String | js.typedarray.Uint8Array
    ]) | js.Array[js.typedarray.Uint8Array] | T,
    weights: js.UndefOr[
      String | Double | Boolean | js.typedarray.Float32Array | js.typedarray.Int32Array | js.typedarray.Uint8Array | (RecursiveArray[
        js.Array[Double] | Boolean | Double | js.typedarray.Float32Array | js.typedarray.Int32Array | String | js.typedarray.Uint8Array
      ]) | js.Array[js.typedarray.Uint8Array] | typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank]
    ],
    reduction: js.UndefOr[Reduction]
  ): O
  
  def computeWeightedLoss[T /* <: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] */, O /* <: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] */](
    losses: String | Double | Boolean | js.typedarray.Float32Array | js.typedarray.Int32Array | js.typedarray.Uint8Array | (RecursiveArray[
      js.Array[Double] | Boolean | Double | js.typedarray.Float32Array | js.typedarray.Int32Array | String | js.typedarray.Uint8Array
    ]) | js.Array[js.typedarray.Uint8Array] | T,
    weights: js.UndefOr[
      String | Double | Boolean | js.typedarray.Float32Array | js.typedarray.Int32Array | js.typedarray.Uint8Array | (RecursiveArray[
        js.Array[Double] | Boolean | Double | js.typedarray.Float32Array | js.typedarray.Int32Array | String | js.typedarray.Uint8Array
      ]) | js.Array[js.typedarray.Uint8Array] | typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank]
    ],
    reduction: js.UndefOr[Reduction]
  ): O
  
  def cosineDistance[T /* <: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] */, O /* <: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] */](
    labels: String | Double | Boolean | js.typedarray.Float32Array | js.typedarray.Int32Array | js.typedarray.Uint8Array | (RecursiveArray[
      js.Array[Double] | Boolean | Double | js.typedarray.Float32Array | js.typedarray.Int32Array | String | js.typedarray.Uint8Array
    ]) | js.Array[js.typedarray.Uint8Array] | T,
    predictions: String | Double | Boolean | js.typedarray.Float32Array | js.typedarray.Int32Array | js.typedarray.Uint8Array | (RecursiveArray[
      js.Array[Double] | Boolean | Double | js.typedarray.Float32Array | js.typedarray.Int32Array | String | js.typedarray.Uint8Array
    ]) | js.Array[js.typedarray.Uint8Array] | T,
    axis: Double,
    weights: js.UndefOr[
      String | Double | Boolean | js.typedarray.Float32Array | js.typedarray.Int32Array | js.typedarray.Uint8Array | (RecursiveArray[
        js.Array[Double] | Boolean | Double | js.typedarray.Float32Array | js.typedarray.Int32Array | String | js.typedarray.Uint8Array
      ]) | js.Array[js.typedarray.Uint8Array] | typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank]
    ],
    reduction: js.UndefOr[Reduction]
  ): O
  
  def hingeLoss[T /* <: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] */, O /* <: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] */](
    labels: String | Double | Boolean | js.typedarray.Float32Array | js.typedarray.Int32Array | js.typedarray.Uint8Array | (RecursiveArray[
      js.Array[Double] | Boolean | Double | js.typedarray.Float32Array | js.typedarray.Int32Array | String | js.typedarray.Uint8Array
    ]) | js.Array[js.typedarray.Uint8Array] | T,
    predictions: String | Double | Boolean | js.typedarray.Float32Array | js.typedarray.Int32Array | js.typedarray.Uint8Array | (RecursiveArray[
      js.Array[Double] | Boolean | Double | js.typedarray.Float32Array | js.typedarray.Int32Array | String | js.typedarray.Uint8Array
    ]) | js.Array[js.typedarray.Uint8Array] | T,
    weights: js.UndefOr[
      String | Double | Boolean | js.typedarray.Float32Array | js.typedarray.Int32Array | js.typedarray.Uint8Array | (RecursiveArray[
        js.Array[Double] | Boolean | Double | js.typedarray.Float32Array | js.typedarray.Int32Array | String | js.typedarray.Uint8Array
      ]) | js.Array[js.typedarray.Uint8Array] | typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank]
    ],
    reduction: js.UndefOr[Reduction]
  ): O
  
  def huberLoss[T /* <: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] */, O /* <: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] */](
    labels: String | Double | Boolean | js.typedarray.Float32Array | js.typedarray.Int32Array | js.typedarray.Uint8Array | (RecursiveArray[
      js.Array[Double] | Boolean | Double | js.typedarray.Float32Array | js.typedarray.Int32Array | String | js.typedarray.Uint8Array
    ]) | js.Array[js.typedarray.Uint8Array] | T,
    predictions: String | Double | Boolean | js.typedarray.Float32Array | js.typedarray.Int32Array | js.typedarray.Uint8Array | (RecursiveArray[
      js.Array[Double] | Boolean | Double | js.typedarray.Float32Array | js.typedarray.Int32Array | String | js.typedarray.Uint8Array
    ]) | js.Array[js.typedarray.Uint8Array] | T,
    weights: js.UndefOr[
      String | Double | Boolean | js.typedarray.Float32Array | js.typedarray.Int32Array | js.typedarray.Uint8Array | (RecursiveArray[
        js.Array[Double] | Boolean | Double | js.typedarray.Float32Array | js.typedarray.Int32Array | String | js.typedarray.Uint8Array
      ]) | js.Array[js.typedarray.Uint8Array] | typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank]
    ],
    delta: js.UndefOr[Double],
    reduction: js.UndefOr[Reduction]
  ): O
  
  def logLoss[T /* <: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] */, O /* <: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] */](
    labels: String | Double | Boolean | js.typedarray.Float32Array | js.typedarray.Int32Array | js.typedarray.Uint8Array | (RecursiveArray[
      js.Array[Double] | Boolean | Double | js.typedarray.Float32Array | js.typedarray.Int32Array | String | js.typedarray.Uint8Array
    ]) | js.Array[js.typedarray.Uint8Array] | T,
    predictions: String | Double | Boolean | js.typedarray.Float32Array | js.typedarray.Int32Array | js.typedarray.Uint8Array | (RecursiveArray[
      js.Array[Double] | Boolean | Double | js.typedarray.Float32Array | js.typedarray.Int32Array | String | js.typedarray.Uint8Array
    ]) | js.Array[js.typedarray.Uint8Array] | T,
    weights: js.UndefOr[
      String | Double | Boolean | js.typedarray.Float32Array | js.typedarray.Int32Array | js.typedarray.Uint8Array | (RecursiveArray[
        js.Array[Double] | Boolean | Double | js.typedarray.Float32Array | js.typedarray.Int32Array | String | js.typedarray.Uint8Array
      ]) | js.Array[js.typedarray.Uint8Array] | typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank]
    ],
    epsilon: js.UndefOr[Double],
    reduction: js.UndefOr[Reduction]
  ): O
  
  def meanSquaredError[T /* <: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] */, O /* <: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] */](
    labels: String | Double | Boolean | js.typedarray.Float32Array | js.typedarray.Int32Array | js.typedarray.Uint8Array | (RecursiveArray[
      js.Array[Double] | Boolean | Double | js.typedarray.Float32Array | js.typedarray.Int32Array | String | js.typedarray.Uint8Array
    ]) | js.Array[js.typedarray.Uint8Array] | T,
    predictions: String | Double | Boolean | js.typedarray.Float32Array | js.typedarray.Int32Array | js.typedarray.Uint8Array | (RecursiveArray[
      js.Array[Double] | Boolean | Double | js.typedarray.Float32Array | js.typedarray.Int32Array | String | js.typedarray.Uint8Array
    ]) | js.Array[js.typedarray.Uint8Array] | T,
    weights: js.UndefOr[
      String | Double | Boolean | js.typedarray.Float32Array | js.typedarray.Int32Array | js.typedarray.Uint8Array | (RecursiveArray[
        js.Array[Double] | Boolean | Double | js.typedarray.Float32Array | js.typedarray.Int32Array | String | js.typedarray.Uint8Array
      ]) | js.Array[js.typedarray.Uint8Array] | typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank]
    ],
    reduction: js.UndefOr[Reduction]
  ): O
  
  def sigmoidCrossEntropy[T /* <: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] */, O /* <: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] */](
    multiClassLabels: String | Double | Boolean | js.typedarray.Float32Array | js.typedarray.Int32Array | js.typedarray.Uint8Array | (RecursiveArray[
      js.Array[Double] | Boolean | Double | js.typedarray.Float32Array | js.typedarray.Int32Array | String | js.typedarray.Uint8Array
    ]) | js.Array[js.typedarray.Uint8Array] | T,
    logits: String | Double | Boolean | js.typedarray.Float32Array | js.typedarray.Int32Array | js.typedarray.Uint8Array | (RecursiveArray[
      js.Array[Double] | Boolean | Double | js.typedarray.Float32Array | js.typedarray.Int32Array | String | js.typedarray.Uint8Array
    ]) | js.Array[js.typedarray.Uint8Array] | T,
    weights: js.UndefOr[
      String | Double | Boolean | js.typedarray.Float32Array | js.typedarray.Int32Array | js.typedarray.Uint8Array | (RecursiveArray[
        js.Array[Double] | Boolean | Double | js.typedarray.Float32Array | js.typedarray.Int32Array | String | js.typedarray.Uint8Array
      ]) | js.Array[js.typedarray.Uint8Array] | typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank]
    ],
    labelSmoothing: js.UndefOr[Double],
    reduction: js.UndefOr[Reduction]
  ): O
  
  def softmaxCrossEntropy[T /* <: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] */, O /* <: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] */](
    onehotLabels: String | Double | Boolean | js.typedarray.Float32Array | js.typedarray.Int32Array | js.typedarray.Uint8Array | (RecursiveArray[
      js.Array[Double] | Boolean | Double | js.typedarray.Float32Array | js.typedarray.Int32Array | String | js.typedarray.Uint8Array
    ]) | js.Array[js.typedarray.Uint8Array] | T,
    logits: String | Double | Boolean | js.typedarray.Float32Array | js.typedarray.Int32Array | js.typedarray.Uint8Array | (RecursiveArray[
      js.Array[Double] | Boolean | Double | js.typedarray.Float32Array | js.typedarray.Int32Array | String | js.typedarray.Uint8Array
    ]) | js.Array[js.typedarray.Uint8Array] | T,
    weights: js.UndefOr[
      String | Double | Boolean | js.typedarray.Float32Array | js.typedarray.Int32Array | js.typedarray.Uint8Array | (RecursiveArray[
        js.Array[Double] | Boolean | Double | js.typedarray.Float32Array | js.typedarray.Int32Array | String | js.typedarray.Uint8Array
      ]) | js.Array[js.typedarray.Uint8Array] | typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank]
    ],
    labelSmoothing: js.UndefOr[Double],
    reduction: js.UndefOr[Reduction]
  ): O
}
object Typeoflosses {
  
  inline def apply(
    absoluteDifference: (String | Double | Boolean | js.typedarray.Float32Array | js.typedarray.Int32Array | js.typedarray.Uint8Array | (RecursiveArray[
      js.Array[Double] | Boolean | Double | js.typedarray.Float32Array | js.typedarray.Int32Array | String | js.typedarray.Uint8Array
    ]) | js.Array[js.typedarray.Uint8Array] | Any, String | Double | Boolean | js.typedarray.Float32Array | js.typedarray.Int32Array | js.typedarray.Uint8Array | (RecursiveArray[
      js.Array[Double] | Boolean | Double | js.typedarray.Float32Array | js.typedarray.Int32Array | String | js.typedarray.Uint8Array
    ]) | js.Array[js.typedarray.Uint8Array] | Any, js.UndefOr[
      String | Double | Boolean | js.typedarray.Float32Array | js.typedarray.Int32Array | js.typedarray.Uint8Array | (RecursiveArray[
        js.Array[Double] | Boolean | Double | js.typedarray.Float32Array | js.typedarray.Int32Array | String | js.typedarray.Uint8Array
      ]) | js.Array[js.typedarray.Uint8Array] | typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank]
    ], js.UndefOr[Reduction]) => Any,
    computeWeightedLoss: (String | Double | Boolean | js.typedarray.Float32Array | js.typedarray.Int32Array | js.typedarray.Uint8Array | (RecursiveArray[
      js.Array[Double] | Boolean | Double | js.typedarray.Float32Array | js.typedarray.Int32Array | String | js.typedarray.Uint8Array
    ]) | js.Array[js.typedarray.Uint8Array] | Any, js.UndefOr[
      String | Double | Boolean | js.typedarray.Float32Array | js.typedarray.Int32Array | js.typedarray.Uint8Array | (RecursiveArray[
        js.Array[Double] | Boolean | Double | js.typedarray.Float32Array | js.typedarray.Int32Array | String | js.typedarray.Uint8Array
      ]) | js.Array[js.typedarray.Uint8Array] | typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank]
    ], js.UndefOr[Reduction]) => Any,
    cosineDistance: (String | Double | Boolean | js.typedarray.Float32Array | js.typedarray.Int32Array | js.typedarray.Uint8Array | (RecursiveArray[
      js.Array[Double] | Boolean | Double | js.typedarray.Float32Array | js.typedarray.Int32Array | String | js.typedarray.Uint8Array
    ]) | js.Array[js.typedarray.Uint8Array] | Any, String | Double | Boolean | js.typedarray.Float32Array | js.typedarray.Int32Array | js.typedarray.Uint8Array | (RecursiveArray[
      js.Array[Double] | Boolean | Double | js.typedarray.Float32Array | js.typedarray.Int32Array | String | js.typedarray.Uint8Array
    ]) | js.Array[js.typedarray.Uint8Array] | Any, Double, js.UndefOr[
      String | Double | Boolean | js.typedarray.Float32Array | js.typedarray.Int32Array | js.typedarray.Uint8Array | (RecursiveArray[
        js.Array[Double] | Boolean | Double | js.typedarray.Float32Array | js.typedarray.Int32Array | String | js.typedarray.Uint8Array
      ]) | js.Array[js.typedarray.Uint8Array] | typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank]
    ], js.UndefOr[Reduction]) => Any,
    hingeLoss: (String | Double | Boolean | js.typedarray.Float32Array | js.typedarray.Int32Array | js.typedarray.Uint8Array | (RecursiveArray[
      js.Array[Double] | Boolean | Double | js.typedarray.Float32Array | js.typedarray.Int32Array | String | js.typedarray.Uint8Array
    ]) | js.Array[js.typedarray.Uint8Array] | Any, String | Double | Boolean | js.typedarray.Float32Array | js.typedarray.Int32Array | js.typedarray.Uint8Array | (RecursiveArray[
      js.Array[Double] | Boolean | Double | js.typedarray.Float32Array | js.typedarray.Int32Array | String | js.typedarray.Uint8Array
    ]) | js.Array[js.typedarray.Uint8Array] | Any, js.UndefOr[
      String | Double | Boolean | js.typedarray.Float32Array | js.typedarray.Int32Array | js.typedarray.Uint8Array | (RecursiveArray[
        js.Array[Double] | Boolean | Double | js.typedarray.Float32Array | js.typedarray.Int32Array | String | js.typedarray.Uint8Array
      ]) | js.Array[js.typedarray.Uint8Array] | typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank]
    ], js.UndefOr[Reduction]) => Any,
    huberLoss: (String | Double | Boolean | js.typedarray.Float32Array | js.typedarray.Int32Array | js.typedarray.Uint8Array | (RecursiveArray[
      js.Array[Double] | Boolean | Double | js.typedarray.Float32Array | js.typedarray.Int32Array | String | js.typedarray.Uint8Array
    ]) | js.Array[js.typedarray.Uint8Array] | Any, String | Double | Boolean | js.typedarray.Float32Array | js.typedarray.Int32Array | js.typedarray.Uint8Array | (RecursiveArray[
      js.Array[Double] | Boolean | Double | js.typedarray.Float32Array | js.typedarray.Int32Array | String | js.typedarray.Uint8Array
    ]) | js.Array[js.typedarray.Uint8Array] | Any, js.UndefOr[
      String | Double | Boolean | js.typedarray.Float32Array | js.typedarray.Int32Array | js.typedarray.Uint8Array | (RecursiveArray[
        js.Array[Double] | Boolean | Double | js.typedarray.Float32Array | js.typedarray.Int32Array | String | js.typedarray.Uint8Array
      ]) | js.Array[js.typedarray.Uint8Array] | typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank]
    ], js.UndefOr[Double], js.UndefOr[Reduction]) => Any,
    logLoss: (String | Double | Boolean | js.typedarray.Float32Array | js.typedarray.Int32Array | js.typedarray.Uint8Array | (RecursiveArray[
      js.Array[Double] | Boolean | Double | js.typedarray.Float32Array | js.typedarray.Int32Array | String | js.typedarray.Uint8Array
    ]) | js.Array[js.typedarray.Uint8Array] | Any, String | Double | Boolean | js.typedarray.Float32Array | js.typedarray.Int32Array | js.typedarray.Uint8Array | (RecursiveArray[
      js.Array[Double] | Boolean | Double | js.typedarray.Float32Array | js.typedarray.Int32Array | String | js.typedarray.Uint8Array
    ]) | js.Array[js.typedarray.Uint8Array] | Any, js.UndefOr[
      String | Double | Boolean | js.typedarray.Float32Array | js.typedarray.Int32Array | js.typedarray.Uint8Array | (RecursiveArray[
        js.Array[Double] | Boolean | Double | js.typedarray.Float32Array | js.typedarray.Int32Array | String | js.typedarray.Uint8Array
      ]) | js.Array[js.typedarray.Uint8Array] | typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank]
    ], js.UndefOr[Double], js.UndefOr[Reduction]) => Any,
    meanSquaredError: (String | Double | Boolean | js.typedarray.Float32Array | js.typedarray.Int32Array | js.typedarray.Uint8Array | (RecursiveArray[
      js.Array[Double] | Boolean | Double | js.typedarray.Float32Array | js.typedarray.Int32Array | String | js.typedarray.Uint8Array
    ]) | js.Array[js.typedarray.Uint8Array] | Any, String | Double | Boolean | js.typedarray.Float32Array | js.typedarray.Int32Array | js.typedarray.Uint8Array | (RecursiveArray[
      js.Array[Double] | Boolean | Double | js.typedarray.Float32Array | js.typedarray.Int32Array | String | js.typedarray.Uint8Array
    ]) | js.Array[js.typedarray.Uint8Array] | Any, js.UndefOr[
      String | Double | Boolean | js.typedarray.Float32Array | js.typedarray.Int32Array | js.typedarray.Uint8Array | (RecursiveArray[
        js.Array[Double] | Boolean | Double | js.typedarray.Float32Array | js.typedarray.Int32Array | String | js.typedarray.Uint8Array
      ]) | js.Array[js.typedarray.Uint8Array] | typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank]
    ], js.UndefOr[Reduction]) => Any,
    sigmoidCrossEntropy: (String | Double | Boolean | js.typedarray.Float32Array | js.typedarray.Int32Array | js.typedarray.Uint8Array | (RecursiveArray[
      js.Array[Double] | Boolean | Double | js.typedarray.Float32Array | js.typedarray.Int32Array | String | js.typedarray.Uint8Array
    ]) | js.Array[js.typedarray.Uint8Array] | Any, String | Double | Boolean | js.typedarray.Float32Array | js.typedarray.Int32Array | js.typedarray.Uint8Array | (RecursiveArray[
      js.Array[Double] | Boolean | Double | js.typedarray.Float32Array | js.typedarray.Int32Array | String | js.typedarray.Uint8Array
    ]) | js.Array[js.typedarray.Uint8Array] | Any, js.UndefOr[
      String | Double | Boolean | js.typedarray.Float32Array | js.typedarray.Int32Array | js.typedarray.Uint8Array | (RecursiveArray[
        js.Array[Double] | Boolean | Double | js.typedarray.Float32Array | js.typedarray.Int32Array | String | js.typedarray.Uint8Array
      ]) | js.Array[js.typedarray.Uint8Array] | typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank]
    ], js.UndefOr[Double], js.UndefOr[Reduction]) => Any,
    softmaxCrossEntropy: (String | Double | Boolean | js.typedarray.Float32Array | js.typedarray.Int32Array | js.typedarray.Uint8Array | (RecursiveArray[
      js.Array[Double] | Boolean | Double | js.typedarray.Float32Array | js.typedarray.Int32Array | String | js.typedarray.Uint8Array
    ]) | js.Array[js.typedarray.Uint8Array] | Any, String | Double | Boolean | js.typedarray.Float32Array | js.typedarray.Int32Array | js.typedarray.Uint8Array | (RecursiveArray[
      js.Array[Double] | Boolean | Double | js.typedarray.Float32Array | js.typedarray.Int32Array | String | js.typedarray.Uint8Array
    ]) | js.Array[js.typedarray.Uint8Array] | Any, js.UndefOr[
      String | Double | Boolean | js.typedarray.Float32Array | js.typedarray.Int32Array | js.typedarray.Uint8Array | (RecursiveArray[
        js.Array[Double] | Boolean | Double | js.typedarray.Float32Array | js.typedarray.Int32Array | String | js.typedarray.Uint8Array
      ]) | js.Array[js.typedarray.Uint8Array] | typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank]
    ], js.UndefOr[Double], js.UndefOr[Reduction]) => Any
  ): Typeoflosses = {
    val __obj = js.Dynamic.literal(absoluteDifference = js.Any.fromFunction4(absoluteDifference), computeWeightedLoss = js.Any.fromFunction3(computeWeightedLoss), cosineDistance = js.Any.fromFunction5(cosineDistance), hingeLoss = js.Any.fromFunction4(hingeLoss), huberLoss = js.Any.fromFunction5(huberLoss), logLoss = js.Any.fromFunction5(logLoss), meanSquaredError = js.Any.fromFunction4(meanSquaredError), sigmoidCrossEntropy = js.Any.fromFunction5(sigmoidCrossEntropy), softmaxCrossEntropy = js.Any.fromFunction5(softmaxCrossEntropy))
    __obj.asInstanceOf[Typeoflosses]
  }
  
  extension [Self <: Typeoflosses](x: Self) {
    
    inline def setAbsoluteDifference(
      value: (String | Double | Boolean | js.typedarray.Float32Array | js.typedarray.Int32Array | js.typedarray.Uint8Array | (RecursiveArray[
          js.Array[Double] | Boolean | Double | js.typedarray.Float32Array | js.typedarray.Int32Array | String | js.typedarray.Uint8Array
        ]) | js.Array[js.typedarray.Uint8Array] | Any, String | Double | Boolean | js.typedarray.Float32Array | js.typedarray.Int32Array | js.typedarray.Uint8Array | (RecursiveArray[
          js.Array[Double] | Boolean | Double | js.typedarray.Float32Array | js.typedarray.Int32Array | String | js.typedarray.Uint8Array
        ]) | js.Array[js.typedarray.Uint8Array] | Any, js.UndefOr[
          String | Double | Boolean | js.typedarray.Float32Array | js.typedarray.Int32Array | js.typedarray.Uint8Array | (RecursiveArray[
            js.Array[Double] | Boolean | Double | js.typedarray.Float32Array | js.typedarray.Int32Array | String | js.typedarray.Uint8Array
          ]) | js.Array[js.typedarray.Uint8Array] | typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank]
        ], js.UndefOr[Reduction]) => Any
    ): Self = StObject.set(x, "absoluteDifference", js.Any.fromFunction4(value))
    
    inline def setComputeWeightedLoss(
      value: (String | Double | Boolean | js.typedarray.Float32Array | js.typedarray.Int32Array | js.typedarray.Uint8Array | (RecursiveArray[
          js.Array[Double] | Boolean | Double | js.typedarray.Float32Array | js.typedarray.Int32Array | String | js.typedarray.Uint8Array
        ]) | js.Array[js.typedarray.Uint8Array] | Any, js.UndefOr[
          String | Double | Boolean | js.typedarray.Float32Array | js.typedarray.Int32Array | js.typedarray.Uint8Array | (RecursiveArray[
            js.Array[Double] | Boolean | Double | js.typedarray.Float32Array | js.typedarray.Int32Array | String | js.typedarray.Uint8Array
          ]) | js.Array[js.typedarray.Uint8Array] | typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank]
        ], js.UndefOr[Reduction]) => Any
    ): Self = StObject.set(x, "computeWeightedLoss", js.Any.fromFunction3(value))
    
    inline def setCosineDistance(
      value: (String | Double | Boolean | js.typedarray.Float32Array | js.typedarray.Int32Array | js.typedarray.Uint8Array | (RecursiveArray[
          js.Array[Double] | Boolean | Double | js.typedarray.Float32Array | js.typedarray.Int32Array | String | js.typedarray.Uint8Array
        ]) | js.Array[js.typedarray.Uint8Array] | Any, String | Double | Boolean | js.typedarray.Float32Array | js.typedarray.Int32Array | js.typedarray.Uint8Array | (RecursiveArray[
          js.Array[Double] | Boolean | Double | js.typedarray.Float32Array | js.typedarray.Int32Array | String | js.typedarray.Uint8Array
        ]) | js.Array[js.typedarray.Uint8Array] | Any, Double, js.UndefOr[
          String | Double | Boolean | js.typedarray.Float32Array | js.typedarray.Int32Array | js.typedarray.Uint8Array | (RecursiveArray[
            js.Array[Double] | Boolean | Double | js.typedarray.Float32Array | js.typedarray.Int32Array | String | js.typedarray.Uint8Array
          ]) | js.Array[js.typedarray.Uint8Array] | typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank]
        ], js.UndefOr[Reduction]) => Any
    ): Self = StObject.set(x, "cosineDistance", js.Any.fromFunction5(value))
    
    inline def setHingeLoss(
      value: (String | Double | Boolean | js.typedarray.Float32Array | js.typedarray.Int32Array | js.typedarray.Uint8Array | (RecursiveArray[
          js.Array[Double] | Boolean | Double | js.typedarray.Float32Array | js.typedarray.Int32Array | String | js.typedarray.Uint8Array
        ]) | js.Array[js.typedarray.Uint8Array] | Any, String | Double | Boolean | js.typedarray.Float32Array | js.typedarray.Int32Array | js.typedarray.Uint8Array | (RecursiveArray[
          js.Array[Double] | Boolean | Double | js.typedarray.Float32Array | js.typedarray.Int32Array | String | js.typedarray.Uint8Array
        ]) | js.Array[js.typedarray.Uint8Array] | Any, js.UndefOr[
          String | Double | Boolean | js.typedarray.Float32Array | js.typedarray.Int32Array | js.typedarray.Uint8Array | (RecursiveArray[
            js.Array[Double] | Boolean | Double | js.typedarray.Float32Array | js.typedarray.Int32Array | String | js.typedarray.Uint8Array
          ]) | js.Array[js.typedarray.Uint8Array] | typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank]
        ], js.UndefOr[Reduction]) => Any
    ): Self = StObject.set(x, "hingeLoss", js.Any.fromFunction4(value))
    
    inline def setHuberLoss(
      value: (String | Double | Boolean | js.typedarray.Float32Array | js.typedarray.Int32Array | js.typedarray.Uint8Array | (RecursiveArray[
          js.Array[Double] | Boolean | Double | js.typedarray.Float32Array | js.typedarray.Int32Array | String | js.typedarray.Uint8Array
        ]) | js.Array[js.typedarray.Uint8Array] | Any, String | Double | Boolean | js.typedarray.Float32Array | js.typedarray.Int32Array | js.typedarray.Uint8Array | (RecursiveArray[
          js.Array[Double] | Boolean | Double | js.typedarray.Float32Array | js.typedarray.Int32Array | String | js.typedarray.Uint8Array
        ]) | js.Array[js.typedarray.Uint8Array] | Any, js.UndefOr[
          String | Double | Boolean | js.typedarray.Float32Array | js.typedarray.Int32Array | js.typedarray.Uint8Array | (RecursiveArray[
            js.Array[Double] | Boolean | Double | js.typedarray.Float32Array | js.typedarray.Int32Array | String | js.typedarray.Uint8Array
          ]) | js.Array[js.typedarray.Uint8Array] | typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank]
        ], js.UndefOr[Double], js.UndefOr[Reduction]) => Any
    ): Self = StObject.set(x, "huberLoss", js.Any.fromFunction5(value))
    
    inline def setLogLoss(
      value: (String | Double | Boolean | js.typedarray.Float32Array | js.typedarray.Int32Array | js.typedarray.Uint8Array | (RecursiveArray[
          js.Array[Double] | Boolean | Double | js.typedarray.Float32Array | js.typedarray.Int32Array | String | js.typedarray.Uint8Array
        ]) | js.Array[js.typedarray.Uint8Array] | Any, String | Double | Boolean | js.typedarray.Float32Array | js.typedarray.Int32Array | js.typedarray.Uint8Array | (RecursiveArray[
          js.Array[Double] | Boolean | Double | js.typedarray.Float32Array | js.typedarray.Int32Array | String | js.typedarray.Uint8Array
        ]) | js.Array[js.typedarray.Uint8Array] | Any, js.UndefOr[
          String | Double | Boolean | js.typedarray.Float32Array | js.typedarray.Int32Array | js.typedarray.Uint8Array | (RecursiveArray[
            js.Array[Double] | Boolean | Double | js.typedarray.Float32Array | js.typedarray.Int32Array | String | js.typedarray.Uint8Array
          ]) | js.Array[js.typedarray.Uint8Array] | typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank]
        ], js.UndefOr[Double], js.UndefOr[Reduction]) => Any
    ): Self = StObject.set(x, "logLoss", js.Any.fromFunction5(value))
    
    inline def setMeanSquaredError(
      value: (String | Double | Boolean | js.typedarray.Float32Array | js.typedarray.Int32Array | js.typedarray.Uint8Array | (RecursiveArray[
          js.Array[Double] | Boolean | Double | js.typedarray.Float32Array | js.typedarray.Int32Array | String | js.typedarray.Uint8Array
        ]) | js.Array[js.typedarray.Uint8Array] | Any, String | Double | Boolean | js.typedarray.Float32Array | js.typedarray.Int32Array | js.typedarray.Uint8Array | (RecursiveArray[
          js.Array[Double] | Boolean | Double | js.typedarray.Float32Array | js.typedarray.Int32Array | String | js.typedarray.Uint8Array
        ]) | js.Array[js.typedarray.Uint8Array] | Any, js.UndefOr[
          String | Double | Boolean | js.typedarray.Float32Array | js.typedarray.Int32Array | js.typedarray.Uint8Array | (RecursiveArray[
            js.Array[Double] | Boolean | Double | js.typedarray.Float32Array | js.typedarray.Int32Array | String | js.typedarray.Uint8Array
          ]) | js.Array[js.typedarray.Uint8Array] | typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank]
        ], js.UndefOr[Reduction]) => Any
    ): Self = StObject.set(x, "meanSquaredError", js.Any.fromFunction4(value))
    
    inline def setSigmoidCrossEntropy(
      value: (String | Double | Boolean | js.typedarray.Float32Array | js.typedarray.Int32Array | js.typedarray.Uint8Array | (RecursiveArray[
          js.Array[Double] | Boolean | Double | js.typedarray.Float32Array | js.typedarray.Int32Array | String | js.typedarray.Uint8Array
        ]) | js.Array[js.typedarray.Uint8Array] | Any, String | Double | Boolean | js.typedarray.Float32Array | js.typedarray.Int32Array | js.typedarray.Uint8Array | (RecursiveArray[
          js.Array[Double] | Boolean | Double | js.typedarray.Float32Array | js.typedarray.Int32Array | String | js.typedarray.Uint8Array
        ]) | js.Array[js.typedarray.Uint8Array] | Any, js.UndefOr[
          String | Double | Boolean | js.typedarray.Float32Array | js.typedarray.Int32Array | js.typedarray.Uint8Array | (RecursiveArray[
            js.Array[Double] | Boolean | Double | js.typedarray.Float32Array | js.typedarray.Int32Array | String | js.typedarray.Uint8Array
          ]) | js.Array[js.typedarray.Uint8Array] | typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank]
        ], js.UndefOr[Double], js.UndefOr[Reduction]) => Any
    ): Self = StObject.set(x, "sigmoidCrossEntropy", js.Any.fromFunction5(value))
    
    inline def setSoftmaxCrossEntropy(
      value: (String | Double | Boolean | js.typedarray.Float32Array | js.typedarray.Int32Array | js.typedarray.Uint8Array | (RecursiveArray[
          js.Array[Double] | Boolean | Double | js.typedarray.Float32Array | js.typedarray.Int32Array | String | js.typedarray.Uint8Array
        ]) | js.Array[js.typedarray.Uint8Array] | Any, String | Double | Boolean | js.typedarray.Float32Array | js.typedarray.Int32Array | js.typedarray.Uint8Array | (RecursiveArray[
          js.Array[Double] | Boolean | Double | js.typedarray.Float32Array | js.typedarray.Int32Array | String | js.typedarray.Uint8Array
        ]) | js.Array[js.typedarray.Uint8Array] | Any, js.UndefOr[
          String | Double | Boolean | js.typedarray.Float32Array | js.typedarray.Int32Array | js.typedarray.Uint8Array | (RecursiveArray[
            js.Array[Double] | Boolean | Double | js.typedarray.Float32Array | js.typedarray.Int32Array | String | js.typedarray.Uint8Array
          ]) | js.Array[js.typedarray.Uint8Array] | typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank]
        ], js.UndefOr[Double], js.UndefOr[Reduction]) => Any
    ): Self = StObject.set(x, "softmaxCrossEntropy", js.Any.fromFunction5(value))
  }
}
