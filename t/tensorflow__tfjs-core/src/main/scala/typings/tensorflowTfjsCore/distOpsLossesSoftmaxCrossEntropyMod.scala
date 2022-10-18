package typings.tensorflowTfjsCore

import typings.tensorflowTfjsCore.distOpsLossOpsUtilsMod.Reduction
import typings.tensorflowTfjsCore.distTensorMod.Tensor
import typings.tensorflowTfjsCore.distTypesMod.Rank
import typings.tensorflowTfjsCore.distTypesMod.TensorLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distOpsLossesSoftmaxCrossEntropyMod {
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/losses/softmax_cross_entropy", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def softmaxCrossEntropy[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](onehotLabels: T | TensorLike, logits: T | TensorLike): O = (^.asInstanceOf[js.Dynamic].applyDynamic("softmaxCrossEntropy")(onehotLabels.asInstanceOf[js.Any], logits.asInstanceOf[js.Any])).asInstanceOf[O]
  inline def softmaxCrossEntropy[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](onehotLabels: T | TensorLike, logits: T | TensorLike, weights: Unit, labelSmoothing: Double): O = (^.asInstanceOf[js.Dynamic].applyDynamic("softmaxCrossEntropy")(onehotLabels.asInstanceOf[js.Any], logits.asInstanceOf[js.Any], weights.asInstanceOf[js.Any], labelSmoothing.asInstanceOf[js.Any])).asInstanceOf[O]
  inline def softmaxCrossEntropy[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](
    onehotLabels: T | TensorLike,
    logits: T | TensorLike,
    weights: Unit,
    labelSmoothing: Double,
    reduction: Reduction
  ): O = (^.asInstanceOf[js.Dynamic].applyDynamic("softmaxCrossEntropy")(onehotLabels.asInstanceOf[js.Any], logits.asInstanceOf[js.Any], weights.asInstanceOf[js.Any], labelSmoothing.asInstanceOf[js.Any], reduction.asInstanceOf[js.Any])).asInstanceOf[O]
  inline def softmaxCrossEntropy[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](
    onehotLabels: T | TensorLike,
    logits: T | TensorLike,
    weights: Unit,
    labelSmoothing: Unit,
    reduction: Reduction
  ): O = (^.asInstanceOf[js.Dynamic].applyDynamic("softmaxCrossEntropy")(onehotLabels.asInstanceOf[js.Any], logits.asInstanceOf[js.Any], weights.asInstanceOf[js.Any], labelSmoothing.asInstanceOf[js.Any], reduction.asInstanceOf[js.Any])).asInstanceOf[O]
  inline def softmaxCrossEntropy[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](onehotLabels: T | TensorLike, logits: T | TensorLike, weights: Tensor[Rank]): O = (^.asInstanceOf[js.Dynamic].applyDynamic("softmaxCrossEntropy")(onehotLabels.asInstanceOf[js.Any], logits.asInstanceOf[js.Any], weights.asInstanceOf[js.Any])).asInstanceOf[O]
  inline def softmaxCrossEntropy[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](
    onehotLabels: T | TensorLike,
    logits: T | TensorLike,
    weights: Tensor[Rank],
    labelSmoothing: Double
  ): O = (^.asInstanceOf[js.Dynamic].applyDynamic("softmaxCrossEntropy")(onehotLabels.asInstanceOf[js.Any], logits.asInstanceOf[js.Any], weights.asInstanceOf[js.Any], labelSmoothing.asInstanceOf[js.Any])).asInstanceOf[O]
  inline def softmaxCrossEntropy[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](
    onehotLabels: T | TensorLike,
    logits: T | TensorLike,
    weights: Tensor[Rank],
    labelSmoothing: Double,
    reduction: Reduction
  ): O = (^.asInstanceOf[js.Dynamic].applyDynamic("softmaxCrossEntropy")(onehotLabels.asInstanceOf[js.Any], logits.asInstanceOf[js.Any], weights.asInstanceOf[js.Any], labelSmoothing.asInstanceOf[js.Any], reduction.asInstanceOf[js.Any])).asInstanceOf[O]
  inline def softmaxCrossEntropy[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](
    onehotLabels: T | TensorLike,
    logits: T | TensorLike,
    weights: Tensor[Rank],
    labelSmoothing: Unit,
    reduction: Reduction
  ): O = (^.asInstanceOf[js.Dynamic].applyDynamic("softmaxCrossEntropy")(onehotLabels.asInstanceOf[js.Any], logits.asInstanceOf[js.Any], weights.asInstanceOf[js.Any], labelSmoothing.asInstanceOf[js.Any], reduction.asInstanceOf[js.Any])).asInstanceOf[O]
  inline def softmaxCrossEntropy[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](onehotLabels: T | TensorLike, logits: T | TensorLike, weights: TensorLike): O = (^.asInstanceOf[js.Dynamic].applyDynamic("softmaxCrossEntropy")(onehotLabels.asInstanceOf[js.Any], logits.asInstanceOf[js.Any], weights.asInstanceOf[js.Any])).asInstanceOf[O]
  inline def softmaxCrossEntropy[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](onehotLabels: T | TensorLike, logits: T | TensorLike, weights: TensorLike, labelSmoothing: Double): O = (^.asInstanceOf[js.Dynamic].applyDynamic("softmaxCrossEntropy")(onehotLabels.asInstanceOf[js.Any], logits.asInstanceOf[js.Any], weights.asInstanceOf[js.Any], labelSmoothing.asInstanceOf[js.Any])).asInstanceOf[O]
  inline def softmaxCrossEntropy[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](
    onehotLabels: T | TensorLike,
    logits: T | TensorLike,
    weights: TensorLike,
    labelSmoothing: Double,
    reduction: Reduction
  ): O = (^.asInstanceOf[js.Dynamic].applyDynamic("softmaxCrossEntropy")(onehotLabels.asInstanceOf[js.Any], logits.asInstanceOf[js.Any], weights.asInstanceOf[js.Any], labelSmoothing.asInstanceOf[js.Any], reduction.asInstanceOf[js.Any])).asInstanceOf[O]
  inline def softmaxCrossEntropy[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](
    onehotLabels: T | TensorLike,
    logits: T | TensorLike,
    weights: TensorLike,
    labelSmoothing: Unit,
    reduction: Reduction
  ): O = (^.asInstanceOf[js.Dynamic].applyDynamic("softmaxCrossEntropy")(onehotLabels.asInstanceOf[js.Any], logits.asInstanceOf[js.Any], weights.asInstanceOf[js.Any], labelSmoothing.asInstanceOf[js.Any], reduction.asInstanceOf[js.Any])).asInstanceOf[O]
}
