package typings.tensorflowTfjsCore.opsMod

import typings.tensorflowTfjsCore.distTypesMod.Rank
import typings.tensorflowTfjsCore.distTypesMod.TensorLike
import typings.tensorflowTfjsCore.lossOpsMod.Reduction
import typings.tensorflowTfjsCore.tensorMod.Tensor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/ops/ops", "losses")
@js.native
object losses extends js.Object {
  @js.native
  object Reduction extends js.Object {
    /* 1 */ val MEAN: typings.tensorflowTfjsCore.lossOpsMod.Reduction.MEAN with Double = js.native
    /* 0 */ val NONE: typings.tensorflowTfjsCore.lossOpsMod.Reduction.NONE with Double = js.native
    /* 2 */ val SUM: typings.tensorflowTfjsCore.lossOpsMod.Reduction.SUM with Double = js.native
    /* 3 */ val SUM_BY_NONZERO_WEIGHTS: typings.tensorflowTfjsCore.lossOpsMod.Reduction.SUM_BY_NONZERO_WEIGHTS with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.tensorflowTfjsCore.lossOpsMod.Reduction with Double] = js.native
  }
  
  @js.native
  object absoluteDifference extends js.Object {
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](labels: T, predictions: T): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](labels: T, predictions: T, weights: TensorLike): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](labels: T, predictions: T, weights: TensorLike, reduction: Reduction): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](labels: T, predictions: T, weights: Tensor[Rank]): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](labels: T, predictions: T, weights: Tensor[Rank], reduction: Reduction): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](labels: T, predictions: TensorLike): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](labels: T, predictions: TensorLike, weights: TensorLike): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](labels: T, predictions: TensorLike, weights: TensorLike, reduction: Reduction): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](labels: T, predictions: TensorLike, weights: Tensor[Rank]): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](labels: T, predictions: TensorLike, weights: Tensor[Rank], reduction: Reduction): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](labels: TensorLike, predictions: T): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](labels: TensorLike, predictions: T, weights: TensorLike): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](labels: TensorLike, predictions: T, weights: TensorLike, reduction: Reduction): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](labels: TensorLike, predictions: T, weights: Tensor[Rank]): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](labels: TensorLike, predictions: T, weights: Tensor[Rank], reduction: Reduction): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](labels: TensorLike, predictions: TensorLike): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](labels: TensorLike, predictions: TensorLike, weights: TensorLike): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](labels: TensorLike, predictions: TensorLike, weights: TensorLike, reduction: Reduction): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](labels: TensorLike, predictions: TensorLike, weights: Tensor[Rank]): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](labels: TensorLike, predictions: TensorLike, weights: Tensor[Rank], reduction: Reduction): O = js.native
  }
  
  @js.native
  object computeWeightedLoss extends js.Object {
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](losses: T): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](losses: T, weights: TensorLike): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](losses: T, weights: TensorLike, reduction: Reduction): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](losses: T, weights: Tensor[Rank]): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](losses: T, weights: Tensor[Rank], reduction: Reduction): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](losses: TensorLike): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](losses: TensorLike, weights: TensorLike): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](losses: TensorLike, weights: TensorLike, reduction: Reduction): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](losses: TensorLike, weights: Tensor[Rank]): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](losses: TensorLike, weights: Tensor[Rank], reduction: Reduction): O = js.native
  }
  
  @js.native
  object cosineDistance extends js.Object {
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](labels: T, predictions: T, axis: Double): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](labels: T, predictions: T, axis: Double, weights: TensorLike): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](labels: T, predictions: T, axis: Double, weights: TensorLike, reduction: Reduction): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](labels: T, predictions: T, axis: Double, weights: Tensor[Rank]): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](labels: T, predictions: T, axis: Double, weights: Tensor[Rank], reduction: Reduction): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](labels: T, predictions: TensorLike, axis: Double): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](labels: T, predictions: TensorLike, axis: Double, weights: TensorLike): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](labels: T, predictions: TensorLike, axis: Double, weights: TensorLike, reduction: Reduction): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](labels: T, predictions: TensorLike, axis: Double, weights: Tensor[Rank]): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](labels: T, predictions: TensorLike, axis: Double, weights: Tensor[Rank], reduction: Reduction): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](labels: TensorLike, predictions: T, axis: Double): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](labels: TensorLike, predictions: T, axis: Double, weights: TensorLike): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](labels: TensorLike, predictions: T, axis: Double, weights: TensorLike, reduction: Reduction): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](labels: TensorLike, predictions: T, axis: Double, weights: Tensor[Rank]): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](labels: TensorLike, predictions: T, axis: Double, weights: Tensor[Rank], reduction: Reduction): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](labels: TensorLike, predictions: TensorLike, axis: Double): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](labels: TensorLike, predictions: TensorLike, axis: Double, weights: TensorLike): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](
      labels: TensorLike,
      predictions: TensorLike,
      axis: Double,
      weights: TensorLike,
      reduction: Reduction
    ): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](labels: TensorLike, predictions: TensorLike, axis: Double, weights: Tensor[Rank]): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](
      labels: TensorLike,
      predictions: TensorLike,
      axis: Double,
      weights: Tensor[Rank],
      reduction: Reduction
    ): O = js.native
  }
  
  @js.native
  object hingeLoss extends js.Object {
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](labels: T, predictions: T): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](labels: T, predictions: T, weights: TensorLike): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](labels: T, predictions: T, weights: TensorLike, reduction: Reduction): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](labels: T, predictions: T, weights: Tensor[Rank]): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](labels: T, predictions: T, weights: Tensor[Rank], reduction: Reduction): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](labels: T, predictions: TensorLike): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](labels: T, predictions: TensorLike, weights: TensorLike): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](labels: T, predictions: TensorLike, weights: TensorLike, reduction: Reduction): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](labels: T, predictions: TensorLike, weights: Tensor[Rank]): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](labels: T, predictions: TensorLike, weights: Tensor[Rank], reduction: Reduction): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](labels: TensorLike, predictions: T): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](labels: TensorLike, predictions: T, weights: TensorLike): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](labels: TensorLike, predictions: T, weights: TensorLike, reduction: Reduction): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](labels: TensorLike, predictions: T, weights: Tensor[Rank]): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](labels: TensorLike, predictions: T, weights: Tensor[Rank], reduction: Reduction): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](labels: TensorLike, predictions: TensorLike): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](labels: TensorLike, predictions: TensorLike, weights: TensorLike): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](labels: TensorLike, predictions: TensorLike, weights: TensorLike, reduction: Reduction): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](labels: TensorLike, predictions: TensorLike, weights: Tensor[Rank]): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](labels: TensorLike, predictions: TensorLike, weights: Tensor[Rank], reduction: Reduction): O = js.native
  }
  
  @js.native
  object huberLoss extends js.Object {
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](labels: T, predictions: T): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](labels: T, predictions: T, weights: TensorLike): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](labels: T, predictions: T, weights: TensorLike, delta: Double): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](labels: T, predictions: T, weights: TensorLike, delta: Double, reduction: Reduction): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](labels: T, predictions: T, weights: Tensor[Rank]): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](labels: T, predictions: T, weights: Tensor[Rank], delta: Double): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](labels: T, predictions: T, weights: Tensor[Rank], delta: Double, reduction: Reduction): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](labels: T, predictions: TensorLike): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](labels: T, predictions: TensorLike, weights: TensorLike): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](labels: T, predictions: TensorLike, weights: TensorLike, delta: Double): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](labels: T, predictions: TensorLike, weights: TensorLike, delta: Double, reduction: Reduction): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](labels: T, predictions: TensorLike, weights: Tensor[Rank]): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](labels: T, predictions: TensorLike, weights: Tensor[Rank], delta: Double): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](labels: T, predictions: TensorLike, weights: Tensor[Rank], delta: Double, reduction: Reduction): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](labels: TensorLike, predictions: T): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](labels: TensorLike, predictions: T, weights: TensorLike): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](labels: TensorLike, predictions: T, weights: TensorLike, delta: Double): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](labels: TensorLike, predictions: T, weights: TensorLike, delta: Double, reduction: Reduction): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](labels: TensorLike, predictions: T, weights: Tensor[Rank]): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](labels: TensorLike, predictions: T, weights: Tensor[Rank], delta: Double): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](labels: TensorLike, predictions: T, weights: Tensor[Rank], delta: Double, reduction: Reduction): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](labels: TensorLike, predictions: TensorLike): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](labels: TensorLike, predictions: TensorLike, weights: TensorLike): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](labels: TensorLike, predictions: TensorLike, weights: TensorLike, delta: Double): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](
      labels: TensorLike,
      predictions: TensorLike,
      weights: TensorLike,
      delta: Double,
      reduction: Reduction
    ): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](labels: TensorLike, predictions: TensorLike, weights: Tensor[Rank]): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](labels: TensorLike, predictions: TensorLike, weights: Tensor[Rank], delta: Double): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](
      labels: TensorLike,
      predictions: TensorLike,
      weights: Tensor[Rank],
      delta: Double,
      reduction: Reduction
    ): O = js.native
  }
  
  @js.native
  object logLoss extends js.Object {
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](labels: T, predictions: T): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](labels: T, predictions: T, weights: TensorLike): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](labels: T, predictions: T, weights: TensorLike, epsilon: Double): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](labels: T, predictions: T, weights: TensorLike, epsilon: Double, reduction: Reduction): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](labels: T, predictions: T, weights: Tensor[Rank]): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](labels: T, predictions: T, weights: Tensor[Rank], epsilon: Double): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](labels: T, predictions: T, weights: Tensor[Rank], epsilon: Double, reduction: Reduction): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](labels: T, predictions: TensorLike): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](labels: T, predictions: TensorLike, weights: TensorLike): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](labels: T, predictions: TensorLike, weights: TensorLike, epsilon: Double): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](labels: T, predictions: TensorLike, weights: TensorLike, epsilon: Double, reduction: Reduction): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](labels: T, predictions: TensorLike, weights: Tensor[Rank]): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](labels: T, predictions: TensorLike, weights: Tensor[Rank], epsilon: Double): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](labels: T, predictions: TensorLike, weights: Tensor[Rank], epsilon: Double, reduction: Reduction): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](labels: TensorLike, predictions: T): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](labels: TensorLike, predictions: T, weights: TensorLike): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](labels: TensorLike, predictions: T, weights: TensorLike, epsilon: Double): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](labels: TensorLike, predictions: T, weights: TensorLike, epsilon: Double, reduction: Reduction): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](labels: TensorLike, predictions: T, weights: Tensor[Rank]): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](labels: TensorLike, predictions: T, weights: Tensor[Rank], epsilon: Double): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](labels: TensorLike, predictions: T, weights: Tensor[Rank], epsilon: Double, reduction: Reduction): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](labels: TensorLike, predictions: TensorLike): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](labels: TensorLike, predictions: TensorLike, weights: TensorLike): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](labels: TensorLike, predictions: TensorLike, weights: TensorLike, epsilon: Double): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](
      labels: TensorLike,
      predictions: TensorLike,
      weights: TensorLike,
      epsilon: Double,
      reduction: Reduction
    ): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](labels: TensorLike, predictions: TensorLike, weights: Tensor[Rank]): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](labels: TensorLike, predictions: TensorLike, weights: Tensor[Rank], epsilon: Double): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](
      labels: TensorLike,
      predictions: TensorLike,
      weights: Tensor[Rank],
      epsilon: Double,
      reduction: Reduction
    ): O = js.native
  }
  
  @js.native
  object meanSquaredError extends js.Object {
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](labels: T, predictions: T): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](labels: T, predictions: T, weights: TensorLike): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](labels: T, predictions: T, weights: TensorLike, reduction: Reduction): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](labels: T, predictions: T, weights: Tensor[Rank]): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](labels: T, predictions: T, weights: Tensor[Rank], reduction: Reduction): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](labels: T, predictions: TensorLike): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](labels: T, predictions: TensorLike, weights: TensorLike): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](labels: T, predictions: TensorLike, weights: TensorLike, reduction: Reduction): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](labels: T, predictions: TensorLike, weights: Tensor[Rank]): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](labels: T, predictions: TensorLike, weights: Tensor[Rank], reduction: Reduction): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](labels: TensorLike, predictions: T): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](labels: TensorLike, predictions: T, weights: TensorLike): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](labels: TensorLike, predictions: T, weights: TensorLike, reduction: Reduction): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](labels: TensorLike, predictions: T, weights: Tensor[Rank]): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](labels: TensorLike, predictions: T, weights: Tensor[Rank], reduction: Reduction): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](labels: TensorLike, predictions: TensorLike): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](labels: TensorLike, predictions: TensorLike, weights: TensorLike): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](labels: TensorLike, predictions: TensorLike, weights: TensorLike, reduction: Reduction): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](labels: TensorLike, predictions: TensorLike, weights: Tensor[Rank]): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](labels: TensorLike, predictions: TensorLike, weights: Tensor[Rank], reduction: Reduction): O = js.native
  }
  
  @js.native
  object sigmoidCrossEntropy extends js.Object {
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](multiClassLabels: T, logits: T): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](multiClassLabels: T, logits: T, weights: TensorLike): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](multiClassLabels: T, logits: T, weights: TensorLike, labelSmoothing: Double): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](multiClassLabels: T, logits: T, weights: TensorLike, labelSmoothing: Double, reduction: Reduction): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](multiClassLabels: T, logits: T, weights: Tensor[Rank]): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](multiClassLabels: T, logits: T, weights: Tensor[Rank], labelSmoothing: Double): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](
      multiClassLabels: T,
      logits: T,
      weights: Tensor[Rank],
      labelSmoothing: Double,
      reduction: Reduction
    ): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](multiClassLabels: T, logits: TensorLike): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](multiClassLabels: T, logits: TensorLike, weights: TensorLike): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](multiClassLabels: T, logits: TensorLike, weights: TensorLike, labelSmoothing: Double): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](
      multiClassLabels: T,
      logits: TensorLike,
      weights: TensorLike,
      labelSmoothing: Double,
      reduction: Reduction
    ): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](multiClassLabels: T, logits: TensorLike, weights: Tensor[Rank]): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](multiClassLabels: T, logits: TensorLike, weights: Tensor[Rank], labelSmoothing: Double): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](
      multiClassLabels: T,
      logits: TensorLike,
      weights: Tensor[Rank],
      labelSmoothing: Double,
      reduction: Reduction
    ): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](multiClassLabels: TensorLike, logits: T): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](multiClassLabels: TensorLike, logits: T, weights: TensorLike): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](multiClassLabels: TensorLike, logits: T, weights: TensorLike, labelSmoothing: Double): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](
      multiClassLabels: TensorLike,
      logits: T,
      weights: TensorLike,
      labelSmoothing: Double,
      reduction: Reduction
    ): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](multiClassLabels: TensorLike, logits: T, weights: Tensor[Rank]): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](multiClassLabels: TensorLike, logits: T, weights: Tensor[Rank], labelSmoothing: Double): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](
      multiClassLabels: TensorLike,
      logits: T,
      weights: Tensor[Rank],
      labelSmoothing: Double,
      reduction: Reduction
    ): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](multiClassLabels: TensorLike, logits: TensorLike): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](multiClassLabels: TensorLike, logits: TensorLike, weights: TensorLike): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](multiClassLabels: TensorLike, logits: TensorLike, weights: TensorLike, labelSmoothing: Double): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](
      multiClassLabels: TensorLike,
      logits: TensorLike,
      weights: TensorLike,
      labelSmoothing: Double,
      reduction: Reduction
    ): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](multiClassLabels: TensorLike, logits: TensorLike, weights: Tensor[Rank]): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](multiClassLabels: TensorLike, logits: TensorLike, weights: Tensor[Rank], labelSmoothing: Double): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](
      multiClassLabels: TensorLike,
      logits: TensorLike,
      weights: Tensor[Rank],
      labelSmoothing: Double,
      reduction: Reduction
    ): O = js.native
  }
  
  @js.native
  object softmaxCrossEntropy extends js.Object {
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](onehotLabels: T, logits: T): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](onehotLabels: T, logits: T, weights: TensorLike): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](onehotLabels: T, logits: T, weights: TensorLike, labelSmoothing: Double): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](onehotLabels: T, logits: T, weights: TensorLike, labelSmoothing: Double, reduction: Reduction): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](onehotLabels: T, logits: T, weights: Tensor[Rank]): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](onehotLabels: T, logits: T, weights: Tensor[Rank], labelSmoothing: Double): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](onehotLabels: T, logits: T, weights: Tensor[Rank], labelSmoothing: Double, reduction: Reduction): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](onehotLabels: T, logits: TensorLike): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](onehotLabels: T, logits: TensorLike, weights: TensorLike): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](onehotLabels: T, logits: TensorLike, weights: TensorLike, labelSmoothing: Double): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](
      onehotLabels: T,
      logits: TensorLike,
      weights: TensorLike,
      labelSmoothing: Double,
      reduction: Reduction
    ): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](onehotLabels: T, logits: TensorLike, weights: Tensor[Rank]): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](onehotLabels: T, logits: TensorLike, weights: Tensor[Rank], labelSmoothing: Double): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](
      onehotLabels: T,
      logits: TensorLike,
      weights: Tensor[Rank],
      labelSmoothing: Double,
      reduction: Reduction
    ): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](onehotLabels: TensorLike, logits: T): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](onehotLabels: TensorLike, logits: T, weights: TensorLike): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](onehotLabels: TensorLike, logits: T, weights: TensorLike, labelSmoothing: Double): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](
      onehotLabels: TensorLike,
      logits: T,
      weights: TensorLike,
      labelSmoothing: Double,
      reduction: Reduction
    ): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](onehotLabels: TensorLike, logits: T, weights: Tensor[Rank]): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](onehotLabels: TensorLike, logits: T, weights: Tensor[Rank], labelSmoothing: Double): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](
      onehotLabels: TensorLike,
      logits: T,
      weights: Tensor[Rank],
      labelSmoothing: Double,
      reduction: Reduction
    ): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](onehotLabels: TensorLike, logits: TensorLike): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](onehotLabels: TensorLike, logits: TensorLike, weights: TensorLike): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](onehotLabels: TensorLike, logits: TensorLike, weights: TensorLike, labelSmoothing: Double): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](
      onehotLabels: TensorLike,
      logits: TensorLike,
      weights: TensorLike,
      labelSmoothing: Double,
      reduction: Reduction
    ): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](onehotLabels: TensorLike, logits: TensorLike, weights: Tensor[Rank]): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](onehotLabels: TensorLike, logits: TensorLike, weights: Tensor[Rank], labelSmoothing: Double): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](
      onehotLabels: TensorLike,
      logits: TensorLike,
      weights: Tensor[Rank],
      labelSmoothing: Double,
      reduction: Reduction
    ): O = js.native
  }
  
}

