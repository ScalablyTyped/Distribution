package typings.tensorflowTfjsCore

import typings.tensorflowTfjsCore.distOpsLossOpsUtilsMod.Reduction
import typings.tensorflowTfjsCore.distTensorMod.Tensor
import typings.tensorflowTfjsCore.distTypesMod.Rank
import typings.tensorflowTfjsCore.distTypesMod.TensorLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distOpsLossesComputeWeightedLossMod {
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/losses/compute_weighted_loss", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def computeWeightedLoss[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](losses: T | TensorLike): O = ^.asInstanceOf[js.Dynamic].applyDynamic("computeWeightedLoss")(losses.asInstanceOf[js.Any]).asInstanceOf[O]
  inline def computeWeightedLoss[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](losses: T | TensorLike, weights: Unit, reduction: Reduction): O = (^.asInstanceOf[js.Dynamic].applyDynamic("computeWeightedLoss")(losses.asInstanceOf[js.Any], weights.asInstanceOf[js.Any], reduction.asInstanceOf[js.Any])).asInstanceOf[O]
  inline def computeWeightedLoss[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](losses: T | TensorLike, weights: Tensor[Rank]): O = (^.asInstanceOf[js.Dynamic].applyDynamic("computeWeightedLoss")(losses.asInstanceOf[js.Any], weights.asInstanceOf[js.Any])).asInstanceOf[O]
  inline def computeWeightedLoss[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](losses: T | TensorLike, weights: Tensor[Rank], reduction: Reduction): O = (^.asInstanceOf[js.Dynamic].applyDynamic("computeWeightedLoss")(losses.asInstanceOf[js.Any], weights.asInstanceOf[js.Any], reduction.asInstanceOf[js.Any])).asInstanceOf[O]
  inline def computeWeightedLoss[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](losses: T | TensorLike, weights: TensorLike): O = (^.asInstanceOf[js.Dynamic].applyDynamic("computeWeightedLoss")(losses.asInstanceOf[js.Any], weights.asInstanceOf[js.Any])).asInstanceOf[O]
  inline def computeWeightedLoss[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](losses: T | TensorLike, weights: TensorLike, reduction: Reduction): O = (^.asInstanceOf[js.Dynamic].applyDynamic("computeWeightedLoss")(losses.asInstanceOf[js.Any], weights.asInstanceOf[js.Any], reduction.asInstanceOf[js.Any])).asInstanceOf[O]
}
