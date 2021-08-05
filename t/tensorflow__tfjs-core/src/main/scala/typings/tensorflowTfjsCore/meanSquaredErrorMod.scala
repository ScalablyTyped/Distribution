package typings.tensorflowTfjsCore

import typings.tensorflowTfjsCore.distTensorMod.Tensor
import typings.tensorflowTfjsCore.distTypesMod.Rank
import typings.tensorflowTfjsCore.distTypesMod.TensorLike
import typings.tensorflowTfjsCore.lossOpsUtilsMod.Reduction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object meanSquaredErrorMod {
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/losses/mean_squared_error", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def meanSquaredError[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](labels: T | TensorLike, predictions: T | TensorLike): O = (^.asInstanceOf[js.Dynamic].applyDynamic("meanSquaredError")(labels.asInstanceOf[js.Any], predictions.asInstanceOf[js.Any])).asInstanceOf[O]
  inline def meanSquaredError[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](labels: T | TensorLike, predictions: T | TensorLike, weights: Unit, reduction: Reduction): O = (^.asInstanceOf[js.Dynamic].applyDynamic("meanSquaredError")(labels.asInstanceOf[js.Any], predictions.asInstanceOf[js.Any], weights.asInstanceOf[js.Any], reduction.asInstanceOf[js.Any])).asInstanceOf[O]
  inline def meanSquaredError[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](labels: T | TensorLike, predictions: T | TensorLike, weights: Tensor[Rank]): O = (^.asInstanceOf[js.Dynamic].applyDynamic("meanSquaredError")(labels.asInstanceOf[js.Any], predictions.asInstanceOf[js.Any], weights.asInstanceOf[js.Any])).asInstanceOf[O]
  inline def meanSquaredError[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](labels: T | TensorLike, predictions: T | TensorLike, weights: Tensor[Rank], reduction: Reduction): O = (^.asInstanceOf[js.Dynamic].applyDynamic("meanSquaredError")(labels.asInstanceOf[js.Any], predictions.asInstanceOf[js.Any], weights.asInstanceOf[js.Any], reduction.asInstanceOf[js.Any])).asInstanceOf[O]
  inline def meanSquaredError[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](labels: T | TensorLike, predictions: T | TensorLike, weights: TensorLike): O = (^.asInstanceOf[js.Dynamic].applyDynamic("meanSquaredError")(labels.asInstanceOf[js.Any], predictions.asInstanceOf[js.Any], weights.asInstanceOf[js.Any])).asInstanceOf[O]
  inline def meanSquaredError[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](labels: T | TensorLike, predictions: T | TensorLike, weights: TensorLike, reduction: Reduction): O = (^.asInstanceOf[js.Dynamic].applyDynamic("meanSquaredError")(labels.asInstanceOf[js.Any], predictions.asInstanceOf[js.Any], weights.asInstanceOf[js.Any], reduction.asInstanceOf[js.Any])).asInstanceOf[O]
}
