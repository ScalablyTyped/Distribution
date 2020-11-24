package typings.tensorflowTfjsCore.opsForConverterMod

import typings.std.Float32Array
import typings.std.Int32Array
import typings.std.Uint8Array
import typings.tensorflowTfjsCore.distTensorMod.Tensor
import typings.tensorflowTfjsCore.distTypesMod.Rank
import typings.tensorflowTfjsCore.distTypesMod.RecursiveArray
import typings.tensorflowTfjsCore.lossOpsUtilsMod.Reduction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "losses")
@js.native
object losses extends js.Object {
  
  def absoluteDifference[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](
    labels: String | Double | Boolean | Uint8Array | Int32Array | Float32Array | (RecursiveArray[
      js.Array[Double] | Boolean | Double | Float32Array | Int32Array | String | Uint8Array
    ]) | js.Array[Uint8Array] | T,
    predictions: String | Double | Boolean | Uint8Array | Int32Array | Float32Array | (RecursiveArray[
      js.Array[Double] | Boolean | Double | Float32Array | Int32Array | String | Uint8Array
    ]) | js.Array[Uint8Array] | T,
    weights: js.UndefOr[
      String | Double | Boolean | Uint8Array | Int32Array | Float32Array | (RecursiveArray[
        js.Array[Double] | Boolean | Double | Float32Array | Int32Array | String | Uint8Array
      ]) | js.Array[Uint8Array] | Tensor[Rank]
    ],
    reduction: js.UndefOr[Reduction]
  ): O = js.native
  
  def computeWeightedLoss[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](
    losses: String | Double | Boolean | Uint8Array | Int32Array | Float32Array | (RecursiveArray[
      js.Array[Double] | Boolean | Double | Float32Array | Int32Array | String | Uint8Array
    ]) | js.Array[Uint8Array] | T,
    weights: js.UndefOr[
      String | Double | Boolean | Uint8Array | Int32Array | Float32Array | (RecursiveArray[
        js.Array[Double] | Boolean | Double | Float32Array | Int32Array | String | Uint8Array
      ]) | js.Array[Uint8Array] | Tensor[Rank]
    ],
    reduction: js.UndefOr[Reduction]
  ): O = js.native
  
  def cosineDistance[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](
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
      ]) | js.Array[Uint8Array] | Tensor[Rank]
    ],
    reduction: js.UndefOr[Reduction]
  ): O = js.native
  
  def hingeLoss[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](
    labels: String | Double | Boolean | Uint8Array | Int32Array | Float32Array | (RecursiveArray[
      js.Array[Double] | Boolean | Double | Float32Array | Int32Array | String | Uint8Array
    ]) | js.Array[Uint8Array] | T,
    predictions: String | Double | Boolean | Uint8Array | Int32Array | Float32Array | (RecursiveArray[
      js.Array[Double] | Boolean | Double | Float32Array | Int32Array | String | Uint8Array
    ]) | js.Array[Uint8Array] | T,
    weights: js.UndefOr[
      String | Double | Boolean | Uint8Array | Int32Array | Float32Array | (RecursiveArray[
        js.Array[Double] | Boolean | Double | Float32Array | Int32Array | String | Uint8Array
      ]) | js.Array[Uint8Array] | Tensor[Rank]
    ],
    reduction: js.UndefOr[Reduction]
  ): O = js.native
  
  def huberLoss[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](
    labels: String | Double | Boolean | Uint8Array | Int32Array | Float32Array | (RecursiveArray[
      js.Array[Double] | Boolean | Double | Float32Array | Int32Array | String | Uint8Array
    ]) | js.Array[Uint8Array] | T,
    predictions: String | Double | Boolean | Uint8Array | Int32Array | Float32Array | (RecursiveArray[
      js.Array[Double] | Boolean | Double | Float32Array | Int32Array | String | Uint8Array
    ]) | js.Array[Uint8Array] | T,
    weights: js.UndefOr[
      String | Double | Boolean | Uint8Array | Int32Array | Float32Array | (RecursiveArray[
        js.Array[Double] | Boolean | Double | Float32Array | Int32Array | String | Uint8Array
      ]) | js.Array[Uint8Array] | Tensor[Rank]
    ],
    delta: js.UndefOr[Double],
    reduction: js.UndefOr[Reduction]
  ): O = js.native
  
  def logLoss[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](
    labels: String | Double | Boolean | Uint8Array | Int32Array | Float32Array | (RecursiveArray[
      js.Array[Double] | Boolean | Double | Float32Array | Int32Array | String | Uint8Array
    ]) | js.Array[Uint8Array] | T,
    predictions: String | Double | Boolean | Uint8Array | Int32Array | Float32Array | (RecursiveArray[
      js.Array[Double] | Boolean | Double | Float32Array | Int32Array | String | Uint8Array
    ]) | js.Array[Uint8Array] | T,
    weights: js.UndefOr[
      String | Double | Boolean | Uint8Array | Int32Array | Float32Array | (RecursiveArray[
        js.Array[Double] | Boolean | Double | Float32Array | Int32Array | String | Uint8Array
      ]) | js.Array[Uint8Array] | Tensor[Rank]
    ],
    epsilon: js.UndefOr[Double],
    reduction: js.UndefOr[Reduction]
  ): O = js.native
  
  def meanSquaredError[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](
    labels: String | Double | Boolean | Uint8Array | Int32Array | Float32Array | (RecursiveArray[
      js.Array[Double] | Boolean | Double | Float32Array | Int32Array | String | Uint8Array
    ]) | js.Array[Uint8Array] | T,
    predictions: String | Double | Boolean | Uint8Array | Int32Array | Float32Array | (RecursiveArray[
      js.Array[Double] | Boolean | Double | Float32Array | Int32Array | String | Uint8Array
    ]) | js.Array[Uint8Array] | T,
    weights: js.UndefOr[
      String | Double | Boolean | Uint8Array | Int32Array | Float32Array | (RecursiveArray[
        js.Array[Double] | Boolean | Double | Float32Array | Int32Array | String | Uint8Array
      ]) | js.Array[Uint8Array] | Tensor[Rank]
    ],
    reduction: js.UndefOr[Reduction]
  ): O = js.native
  
  def sigmoidCrossEntropy[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](
    multiClassLabels: String | Double | Boolean | Uint8Array | Int32Array | Float32Array | (RecursiveArray[
      js.Array[Double] | Boolean | Double | Float32Array | Int32Array | String | Uint8Array
    ]) | js.Array[Uint8Array] | T,
    logits: String | Double | Boolean | Uint8Array | Int32Array | Float32Array | (RecursiveArray[
      js.Array[Double] | Boolean | Double | Float32Array | Int32Array | String | Uint8Array
    ]) | js.Array[Uint8Array] | T,
    weights: js.UndefOr[
      String | Double | Boolean | Uint8Array | Int32Array | Float32Array | (RecursiveArray[
        js.Array[Double] | Boolean | Double | Float32Array | Int32Array | String | Uint8Array
      ]) | js.Array[Uint8Array] | Tensor[Rank]
    ],
    labelSmoothing: js.UndefOr[Double],
    reduction: js.UndefOr[Reduction]
  ): O = js.native
  
  def softmaxCrossEntropy[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](
    onehotLabels: String | Double | Boolean | Uint8Array | Int32Array | Float32Array | (RecursiveArray[
      js.Array[Double] | Boolean | Double | Float32Array | Int32Array | String | Uint8Array
    ]) | js.Array[Uint8Array] | T,
    logits: String | Double | Boolean | Uint8Array | Int32Array | Float32Array | (RecursiveArray[
      js.Array[Double] | Boolean | Double | Float32Array | Int32Array | String | Uint8Array
    ]) | js.Array[Uint8Array] | T,
    weights: js.UndefOr[
      String | Double | Boolean | Uint8Array | Int32Array | Float32Array | (RecursiveArray[
        js.Array[Double] | Boolean | Double | Float32Array | Int32Array | String | Uint8Array
      ]) | js.Array[Uint8Array] | Tensor[Rank]
    ],
    labelSmoothing: js.UndefOr[Double],
    reduction: js.UndefOr[Reduction]
  ): O = js.native
}
