package typings.tensorflowTfjsCore

import typings.tensorflowTfjsCore.distOpsLossOpsUtilsMod.Reduction
import typings.tensorflowTfjsCore.distTensorMod.Tensor
import typings.tensorflowTfjsCore.distTypesMod.Rank
import typings.tensorflowTfjsCore.distTypesMod.TensorLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distOpsLossesCosineDistanceMod {
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/losses/cosine_distance", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def cosineDistance[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](labels: T | TensorLike, predictions: T | TensorLike, axis: Double): O = (^.asInstanceOf[js.Dynamic].applyDynamic("cosineDistance")(labels.asInstanceOf[js.Any], predictions.asInstanceOf[js.Any], axis.asInstanceOf[js.Any])).asInstanceOf[O]
  inline def cosineDistance[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](
    labels: T | TensorLike,
    predictions: T | TensorLike,
    axis: Double,
    weights: Unit,
    reduction: Reduction
  ): O = (^.asInstanceOf[js.Dynamic].applyDynamic("cosineDistance")(labels.asInstanceOf[js.Any], predictions.asInstanceOf[js.Any], axis.asInstanceOf[js.Any], weights.asInstanceOf[js.Any], reduction.asInstanceOf[js.Any])).asInstanceOf[O]
  inline def cosineDistance[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](labels: T | TensorLike, predictions: T | TensorLike, axis: Double, weights: Tensor[Rank]): O = (^.asInstanceOf[js.Dynamic].applyDynamic("cosineDistance")(labels.asInstanceOf[js.Any], predictions.asInstanceOf[js.Any], axis.asInstanceOf[js.Any], weights.asInstanceOf[js.Any])).asInstanceOf[O]
  inline def cosineDistance[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](
    labels: T | TensorLike,
    predictions: T | TensorLike,
    axis: Double,
    weights: Tensor[Rank],
    reduction: Reduction
  ): O = (^.asInstanceOf[js.Dynamic].applyDynamic("cosineDistance")(labels.asInstanceOf[js.Any], predictions.asInstanceOf[js.Any], axis.asInstanceOf[js.Any], weights.asInstanceOf[js.Any], reduction.asInstanceOf[js.Any])).asInstanceOf[O]
  inline def cosineDistance[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](labels: T | TensorLike, predictions: T | TensorLike, axis: Double, weights: TensorLike): O = (^.asInstanceOf[js.Dynamic].applyDynamic("cosineDistance")(labels.asInstanceOf[js.Any], predictions.asInstanceOf[js.Any], axis.asInstanceOf[js.Any], weights.asInstanceOf[js.Any])).asInstanceOf[O]
  inline def cosineDistance[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](
    labels: T | TensorLike,
    predictions: T | TensorLike,
    axis: Double,
    weights: TensorLike,
    reduction: Reduction
  ): O = (^.asInstanceOf[js.Dynamic].applyDynamic("cosineDistance")(labels.asInstanceOf[js.Any], predictions.asInstanceOf[js.Any], axis.asInstanceOf[js.Any], weights.asInstanceOf[js.Any], reduction.asInstanceOf[js.Any])).asInstanceOf[O]
}
