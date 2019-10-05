package typings.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreMod

import typings.atTensorflowTfjsDashCore.distOpsLossUnderscoreOpsMod.Reduction
import typings.atTensorflowTfjsDashCore.distTypesMod.Rank
import typings.atTensorflowTfjsDashCore.distTypesMod.TensorLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core", "losses")
@js.native
object losses extends js.Object {
  @js.native
  object Reduction extends js.Object {
    /* 1 */ val MEAN: typings.atTensorflowTfjsDashCore.distOpsLossUnderscoreOpsMod.Reduction.MEAN with Double = js.native
    /* 0 */ val NONE: typings.atTensorflowTfjsDashCore.distOpsLossUnderscoreOpsMod.Reduction.NONE with Double = js.native
    /* 2 */ val SUM: typings.atTensorflowTfjsDashCore.distOpsLossUnderscoreOpsMod.Reduction.SUM with Double = js.native
    /* 3 */ val SUM_BY_NONZERO_WEIGHTS: typings.atTensorflowTfjsDashCore.distOpsLossUnderscoreOpsMod.Reduction.SUM_BY_NONZERO_WEIGHTS with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.atTensorflowTfjsDashCore.distOpsLossUnderscoreOpsMod.Reduction with Double
      ] = js.native
  }
  
  @js.native
  object absoluteDifference extends js.Object {
    def apply[T /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */, O /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */](labels: T, predictions: T): O = js.native
    def apply[T /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */, O /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */](labels: T, predictions: T, weights: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank]): O = js.native
    def apply[T /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */, O /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */](
      labels: T,
      predictions: T,
      weights: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank],
      reduction: Reduction
    ): O = js.native
    def apply[T /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */, O /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */](labels: T, predictions: T, weights: TensorLike): O = js.native
    def apply[T /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */, O /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */](labels: T, predictions: T, weights: TensorLike, reduction: Reduction): O = js.native
    def apply[T /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */, O /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */](labels: T, predictions: TensorLike): O = js.native
    def apply[T /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */, O /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */](
      labels: T,
      predictions: TensorLike,
      weights: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank]
    ): O = js.native
    def apply[T /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */, O /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */](
      labels: T,
      predictions: TensorLike,
      weights: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank],
      reduction: Reduction
    ): O = js.native
    def apply[T /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */, O /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */](labels: T, predictions: TensorLike, weights: TensorLike): O = js.native
    def apply[T /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */, O /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */](labels: T, predictions: TensorLike, weights: TensorLike, reduction: Reduction): O = js.native
    def apply[T /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */, O /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */](labels: TensorLike, predictions: T): O = js.native
    def apply[T /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */, O /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */](
      labels: TensorLike,
      predictions: T,
      weights: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank]
    ): O = js.native
    def apply[T /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */, O /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */](
      labels: TensorLike,
      predictions: T,
      weights: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank],
      reduction: Reduction
    ): O = js.native
    def apply[T /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */, O /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */](labels: TensorLike, predictions: T, weights: TensorLike): O = js.native
    def apply[T /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */, O /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */](labels: TensorLike, predictions: T, weights: TensorLike, reduction: Reduction): O = js.native
    def apply[T /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */, O /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */](labels: TensorLike, predictions: TensorLike): O = js.native
    def apply[T /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */, O /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */](
      labels: TensorLike,
      predictions: TensorLike,
      weights: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank]
    ): O = js.native
    def apply[T /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */, O /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */](
      labels: TensorLike,
      predictions: TensorLike,
      weights: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank],
      reduction: Reduction
    ): O = js.native
    def apply[T /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */, O /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */](labels: TensorLike, predictions: TensorLike, weights: TensorLike): O = js.native
    def apply[T /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */, O /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */](labels: TensorLike, predictions: TensorLike, weights: TensorLike, reduction: Reduction): O = js.native
  }
  
  @js.native
  object computeWeightedLoss extends js.Object {
    def apply[T /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */, O /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */](losses: T): O = js.native
    def apply[T /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */, O /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */](losses: T, weights: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank]): O = js.native
    def apply[T /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */, O /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */](
      losses: T,
      weights: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank],
      reduction: Reduction
    ): O = js.native
    def apply[T /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */, O /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */](losses: T, weights: TensorLike): O = js.native
    def apply[T /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */, O /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */](losses: T, weights: TensorLike, reduction: Reduction): O = js.native
    def apply[T /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */, O /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */](losses: TensorLike): O = js.native
    def apply[T /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */, O /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */](losses: TensorLike, weights: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank]): O = js.native
    def apply[T /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */, O /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */](
      losses: TensorLike,
      weights: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank],
      reduction: Reduction
    ): O = js.native
    def apply[T /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */, O /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */](losses: TensorLike, weights: TensorLike): O = js.native
    def apply[T /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */, O /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */](losses: TensorLike, weights: TensorLike, reduction: Reduction): O = js.native
  }
  
  @js.native
  object cosineDistance extends js.Object {
    def apply[T /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */, O /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */](labels: T, predictions: T, axis: Double): O = js.native
    def apply[T /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */, O /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */](
      labels: T,
      predictions: T,
      axis: Double,
      weights: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank]
    ): O = js.native
    def apply[T /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */, O /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */](
      labels: T,
      predictions: T,
      axis: Double,
      weights: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank],
      reduction: Reduction
    ): O = js.native
    def apply[T /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */, O /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */](labels: T, predictions: T, axis: Double, weights: TensorLike): O = js.native
    def apply[T /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */, O /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */](labels: T, predictions: T, axis: Double, weights: TensorLike, reduction: Reduction): O = js.native
    def apply[T /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */, O /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */](labels: T, predictions: TensorLike, axis: Double): O = js.native
    def apply[T /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */, O /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */](
      labels: T,
      predictions: TensorLike,
      axis: Double,
      weights: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank]
    ): O = js.native
    def apply[T /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */, O /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */](
      labels: T,
      predictions: TensorLike,
      axis: Double,
      weights: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank],
      reduction: Reduction
    ): O = js.native
    def apply[T /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */, O /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */](labels: T, predictions: TensorLike, axis: Double, weights: TensorLike): O = js.native
    def apply[T /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */, O /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */](labels: T, predictions: TensorLike, axis: Double, weights: TensorLike, reduction: Reduction): O = js.native
    def apply[T /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */, O /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */](labels: TensorLike, predictions: T, axis: Double): O = js.native
    def apply[T /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */, O /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */](
      labels: TensorLike,
      predictions: T,
      axis: Double,
      weights: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank]
    ): O = js.native
    def apply[T /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */, O /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */](
      labels: TensorLike,
      predictions: T,
      axis: Double,
      weights: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank],
      reduction: Reduction
    ): O = js.native
    def apply[T /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */, O /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */](labels: TensorLike, predictions: T, axis: Double, weights: TensorLike): O = js.native
    def apply[T /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */, O /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */](labels: TensorLike, predictions: T, axis: Double, weights: TensorLike, reduction: Reduction): O = js.native
    def apply[T /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */, O /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */](labels: TensorLike, predictions: TensorLike, axis: Double): O = js.native
    def apply[T /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */, O /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */](
      labels: TensorLike,
      predictions: TensorLike,
      axis: Double,
      weights: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank]
    ): O = js.native
    def apply[T /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */, O /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */](
      labels: TensorLike,
      predictions: TensorLike,
      axis: Double,
      weights: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank],
      reduction: Reduction
    ): O = js.native
    def apply[T /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */, O /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */](labels: TensorLike, predictions: TensorLike, axis: Double, weights: TensorLike): O = js.native
    def apply[T /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */, O /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */](
      labels: TensorLike,
      predictions: TensorLike,
      axis: Double,
      weights: TensorLike,
      reduction: Reduction
    ): O = js.native
  }
  
  @js.native
  object hingeLoss extends js.Object {
    def apply[T /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */, O /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */](labels: T, predictions: T): O = js.native
    def apply[T /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */, O /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */](labels: T, predictions: T, weights: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank]): O = js.native
    def apply[T /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */, O /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */](
      labels: T,
      predictions: T,
      weights: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank],
      reduction: Reduction
    ): O = js.native
    def apply[T /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */, O /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */](labels: T, predictions: T, weights: TensorLike): O = js.native
    def apply[T /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */, O /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */](labels: T, predictions: T, weights: TensorLike, reduction: Reduction): O = js.native
    def apply[T /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */, O /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */](labels: T, predictions: TensorLike): O = js.native
    def apply[T /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */, O /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */](
      labels: T,
      predictions: TensorLike,
      weights: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank]
    ): O = js.native
    def apply[T /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */, O /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */](
      labels: T,
      predictions: TensorLike,
      weights: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank],
      reduction: Reduction
    ): O = js.native
    def apply[T /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */, O /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */](labels: T, predictions: TensorLike, weights: TensorLike): O = js.native
    def apply[T /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */, O /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */](labels: T, predictions: TensorLike, weights: TensorLike, reduction: Reduction): O = js.native
    def apply[T /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */, O /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */](labels: TensorLike, predictions: T): O = js.native
    def apply[T /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */, O /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */](
      labels: TensorLike,
      predictions: T,
      weights: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank]
    ): O = js.native
    def apply[T /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */, O /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */](
      labels: TensorLike,
      predictions: T,
      weights: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank],
      reduction: Reduction
    ): O = js.native
    def apply[T /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */, O /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */](labels: TensorLike, predictions: T, weights: TensorLike): O = js.native
    def apply[T /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */, O /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */](labels: TensorLike, predictions: T, weights: TensorLike, reduction: Reduction): O = js.native
    def apply[T /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */, O /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */](labels: TensorLike, predictions: TensorLike): O = js.native
    def apply[T /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */, O /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */](
      labels: TensorLike,
      predictions: TensorLike,
      weights: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank]
    ): O = js.native
    def apply[T /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */, O /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */](
      labels: TensorLike,
      predictions: TensorLike,
      weights: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank],
      reduction: Reduction
    ): O = js.native
    def apply[T /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */, O /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */](labels: TensorLike, predictions: TensorLike, weights: TensorLike): O = js.native
    def apply[T /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */, O /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */](labels: TensorLike, predictions: TensorLike, weights: TensorLike, reduction: Reduction): O = js.native
  }
  
  @js.native
  object huberLoss extends js.Object {
    def apply[T /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */, O /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */](labels: T, predictions: T): O = js.native
    def apply[T /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */, O /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */](labels: T, predictions: T, weights: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank]): O = js.native
    def apply[T /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */, O /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */](
      labels: T,
      predictions: T,
      weights: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank],
      delta: Double
    ): O = js.native
    def apply[T /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */, O /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */](
      labels: T,
      predictions: T,
      weights: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank],
      delta: Double,
      reduction: Reduction
    ): O = js.native
    def apply[T /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */, O /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */](labels: T, predictions: T, weights: TensorLike): O = js.native
    def apply[T /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */, O /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */](labels: T, predictions: T, weights: TensorLike, delta: Double): O = js.native
    def apply[T /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */, O /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */](labels: T, predictions: T, weights: TensorLike, delta: Double, reduction: Reduction): O = js.native
    def apply[T /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */, O /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */](labels: T, predictions: TensorLike): O = js.native
    def apply[T /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */, O /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */](
      labels: T,
      predictions: TensorLike,
      weights: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank]
    ): O = js.native
    def apply[T /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */, O /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */](
      labels: T,
      predictions: TensorLike,
      weights: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank],
      delta: Double
    ): O = js.native
    def apply[T /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */, O /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */](
      labels: T,
      predictions: TensorLike,
      weights: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank],
      delta: Double,
      reduction: Reduction
    ): O = js.native
    def apply[T /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */, O /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */](labels: T, predictions: TensorLike, weights: TensorLike): O = js.native
    def apply[T /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */, O /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */](labels: T, predictions: TensorLike, weights: TensorLike, delta: Double): O = js.native
    def apply[T /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */, O /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */](labels: T, predictions: TensorLike, weights: TensorLike, delta: Double, reduction: Reduction): O = js.native
    def apply[T /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */, O /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */](labels: TensorLike, predictions: T): O = js.native
    def apply[T /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */, O /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */](
      labels: TensorLike,
      predictions: T,
      weights: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank]
    ): O = js.native
    def apply[T /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */, O /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */](
      labels: TensorLike,
      predictions: T,
      weights: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank],
      delta: Double
    ): O = js.native
    def apply[T /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */, O /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */](
      labels: TensorLike,
      predictions: T,
      weights: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank],
      delta: Double,
      reduction: Reduction
    ): O = js.native
    def apply[T /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */, O /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */](labels: TensorLike, predictions: T, weights: TensorLike): O = js.native
    def apply[T /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */, O /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */](labels: TensorLike, predictions: T, weights: TensorLike, delta: Double): O = js.native
    def apply[T /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */, O /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */](labels: TensorLike, predictions: T, weights: TensorLike, delta: Double, reduction: Reduction): O = js.native
    def apply[T /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */, O /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */](labels: TensorLike, predictions: TensorLike): O = js.native
    def apply[T /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */, O /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */](
      labels: TensorLike,
      predictions: TensorLike,
      weights: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank]
    ): O = js.native
    def apply[T /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */, O /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */](
      labels: TensorLike,
      predictions: TensorLike,
      weights: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank],
      delta: Double
    ): O = js.native
    def apply[T /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */, O /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */](
      labels: TensorLike,
      predictions: TensorLike,
      weights: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank],
      delta: Double,
      reduction: Reduction
    ): O = js.native
    def apply[T /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */, O /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */](labels: TensorLike, predictions: TensorLike, weights: TensorLike): O = js.native
    def apply[T /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */, O /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */](labels: TensorLike, predictions: TensorLike, weights: TensorLike, delta: Double): O = js.native
    def apply[T /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */, O /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */](
      labels: TensorLike,
      predictions: TensorLike,
      weights: TensorLike,
      delta: Double,
      reduction: Reduction
    ): O = js.native
  }
  
  @js.native
  object logLoss extends js.Object {
    def apply[T /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */, O /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */](labels: T, predictions: T): O = js.native
    def apply[T /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */, O /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */](labels: T, predictions: T, weights: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank]): O = js.native
    def apply[T /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */, O /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */](
      labels: T,
      predictions: T,
      weights: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank],
      epsilon: Double
    ): O = js.native
    def apply[T /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */, O /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */](
      labels: T,
      predictions: T,
      weights: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank],
      epsilon: Double,
      reduction: Reduction
    ): O = js.native
    def apply[T /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */, O /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */](labels: T, predictions: T, weights: TensorLike): O = js.native
    def apply[T /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */, O /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */](labels: T, predictions: T, weights: TensorLike, epsilon: Double): O = js.native
    def apply[T /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */, O /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */](labels: T, predictions: T, weights: TensorLike, epsilon: Double, reduction: Reduction): O = js.native
    def apply[T /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */, O /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */](labels: T, predictions: TensorLike): O = js.native
    def apply[T /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */, O /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */](
      labels: T,
      predictions: TensorLike,
      weights: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank]
    ): O = js.native
    def apply[T /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */, O /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */](
      labels: T,
      predictions: TensorLike,
      weights: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank],
      epsilon: Double
    ): O = js.native
    def apply[T /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */, O /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */](
      labels: T,
      predictions: TensorLike,
      weights: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank],
      epsilon: Double,
      reduction: Reduction
    ): O = js.native
    def apply[T /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */, O /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */](labels: T, predictions: TensorLike, weights: TensorLike): O = js.native
    def apply[T /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */, O /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */](labels: T, predictions: TensorLike, weights: TensorLike, epsilon: Double): O = js.native
    def apply[T /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */, O /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */](labels: T, predictions: TensorLike, weights: TensorLike, epsilon: Double, reduction: Reduction): O = js.native
    def apply[T /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */, O /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */](labels: TensorLike, predictions: T): O = js.native
    def apply[T /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */, O /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */](
      labels: TensorLike,
      predictions: T,
      weights: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank]
    ): O = js.native
    def apply[T /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */, O /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */](
      labels: TensorLike,
      predictions: T,
      weights: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank],
      epsilon: Double
    ): O = js.native
    def apply[T /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */, O /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */](
      labels: TensorLike,
      predictions: T,
      weights: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank],
      epsilon: Double,
      reduction: Reduction
    ): O = js.native
    def apply[T /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */, O /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */](labels: TensorLike, predictions: T, weights: TensorLike): O = js.native
    def apply[T /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */, O /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */](labels: TensorLike, predictions: T, weights: TensorLike, epsilon: Double): O = js.native
    def apply[T /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */, O /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */](labels: TensorLike, predictions: T, weights: TensorLike, epsilon: Double, reduction: Reduction): O = js.native
    def apply[T /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */, O /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */](labels: TensorLike, predictions: TensorLike): O = js.native
    def apply[T /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */, O /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */](
      labels: TensorLike,
      predictions: TensorLike,
      weights: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank]
    ): O = js.native
    def apply[T /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */, O /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */](
      labels: TensorLike,
      predictions: TensorLike,
      weights: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank],
      epsilon: Double
    ): O = js.native
    def apply[T /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */, O /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */](
      labels: TensorLike,
      predictions: TensorLike,
      weights: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank],
      epsilon: Double,
      reduction: Reduction
    ): O = js.native
    def apply[T /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */, O /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */](labels: TensorLike, predictions: TensorLike, weights: TensorLike): O = js.native
    def apply[T /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */, O /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */](labels: TensorLike, predictions: TensorLike, weights: TensorLike, epsilon: Double): O = js.native
    def apply[T /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */, O /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */](
      labels: TensorLike,
      predictions: TensorLike,
      weights: TensorLike,
      epsilon: Double,
      reduction: Reduction
    ): O = js.native
  }
  
  @js.native
  object meanSquaredError extends js.Object {
    def apply[T /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */, O /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */](labels: T, predictions: T): O = js.native
    def apply[T /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */, O /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */](labels: T, predictions: T, weights: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank]): O = js.native
    def apply[T /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */, O /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */](
      labels: T,
      predictions: T,
      weights: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank],
      reduction: Reduction
    ): O = js.native
    def apply[T /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */, O /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */](labels: T, predictions: T, weights: TensorLike): O = js.native
    def apply[T /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */, O /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */](labels: T, predictions: T, weights: TensorLike, reduction: Reduction): O = js.native
    def apply[T /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */, O /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */](labels: T, predictions: TensorLike): O = js.native
    def apply[T /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */, O /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */](
      labels: T,
      predictions: TensorLike,
      weights: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank]
    ): O = js.native
    def apply[T /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */, O /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */](
      labels: T,
      predictions: TensorLike,
      weights: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank],
      reduction: Reduction
    ): O = js.native
    def apply[T /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */, O /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */](labels: T, predictions: TensorLike, weights: TensorLike): O = js.native
    def apply[T /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */, O /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */](labels: T, predictions: TensorLike, weights: TensorLike, reduction: Reduction): O = js.native
    def apply[T /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */, O /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */](labels: TensorLike, predictions: T): O = js.native
    def apply[T /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */, O /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */](
      labels: TensorLike,
      predictions: T,
      weights: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank]
    ): O = js.native
    def apply[T /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */, O /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */](
      labels: TensorLike,
      predictions: T,
      weights: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank],
      reduction: Reduction
    ): O = js.native
    def apply[T /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */, O /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */](labels: TensorLike, predictions: T, weights: TensorLike): O = js.native
    def apply[T /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */, O /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */](labels: TensorLike, predictions: T, weights: TensorLike, reduction: Reduction): O = js.native
    def apply[T /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */, O /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */](labels: TensorLike, predictions: TensorLike): O = js.native
    def apply[T /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */, O /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */](
      labels: TensorLike,
      predictions: TensorLike,
      weights: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank]
    ): O = js.native
    def apply[T /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */, O /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */](
      labels: TensorLike,
      predictions: TensorLike,
      weights: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank],
      reduction: Reduction
    ): O = js.native
    def apply[T /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */, O /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */](labels: TensorLike, predictions: TensorLike, weights: TensorLike): O = js.native
    def apply[T /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */, O /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */](labels: TensorLike, predictions: TensorLike, weights: TensorLike, reduction: Reduction): O = js.native
  }
  
  @js.native
  object sigmoidCrossEntropy extends js.Object {
    def apply[T /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */, O /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */](multiClassLabels: T, logits: T): O = js.native
    def apply[T /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */, O /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */](
      multiClassLabels: T,
      logits: T,
      weights: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank]
    ): O = js.native
    def apply[T /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */, O /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */](
      multiClassLabels: T,
      logits: T,
      weights: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank],
      labelSmoothing: Double
    ): O = js.native
    def apply[T /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */, O /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */](
      multiClassLabels: T,
      logits: T,
      weights: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank],
      labelSmoothing: Double,
      reduction: Reduction
    ): O = js.native
    def apply[T /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */, O /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */](multiClassLabels: T, logits: T, weights: TensorLike): O = js.native
    def apply[T /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */, O /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */](multiClassLabels: T, logits: T, weights: TensorLike, labelSmoothing: Double): O = js.native
    def apply[T /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */, O /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */](multiClassLabels: T, logits: T, weights: TensorLike, labelSmoothing: Double, reduction: Reduction): O = js.native
    def apply[T /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */, O /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */](multiClassLabels: T, logits: TensorLike): O = js.native
    def apply[T /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */, O /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */](
      multiClassLabels: T,
      logits: TensorLike,
      weights: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank]
    ): O = js.native
    def apply[T /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */, O /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */](
      multiClassLabels: T,
      logits: TensorLike,
      weights: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank],
      labelSmoothing: Double
    ): O = js.native
    def apply[T /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */, O /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */](
      multiClassLabels: T,
      logits: TensorLike,
      weights: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank],
      labelSmoothing: Double,
      reduction: Reduction
    ): O = js.native
    def apply[T /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */, O /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */](multiClassLabels: T, logits: TensorLike, weights: TensorLike): O = js.native
    def apply[T /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */, O /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */](multiClassLabels: T, logits: TensorLike, weights: TensorLike, labelSmoothing: Double): O = js.native
    def apply[T /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */, O /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */](
      multiClassLabels: T,
      logits: TensorLike,
      weights: TensorLike,
      labelSmoothing: Double,
      reduction: Reduction
    ): O = js.native
    def apply[T /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */, O /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */](multiClassLabels: TensorLike, logits: T): O = js.native
    def apply[T /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */, O /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */](
      multiClassLabels: TensorLike,
      logits: T,
      weights: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank]
    ): O = js.native
    def apply[T /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */, O /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */](
      multiClassLabels: TensorLike,
      logits: T,
      weights: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank],
      labelSmoothing: Double
    ): O = js.native
    def apply[T /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */, O /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */](
      multiClassLabels: TensorLike,
      logits: T,
      weights: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank],
      labelSmoothing: Double,
      reduction: Reduction
    ): O = js.native
    def apply[T /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */, O /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */](multiClassLabels: TensorLike, logits: T, weights: TensorLike): O = js.native
    def apply[T /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */, O /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */](multiClassLabels: TensorLike, logits: T, weights: TensorLike, labelSmoothing: Double): O = js.native
    def apply[T /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */, O /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */](
      multiClassLabels: TensorLike,
      logits: T,
      weights: TensorLike,
      labelSmoothing: Double,
      reduction: Reduction
    ): O = js.native
    def apply[T /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */, O /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */](multiClassLabels: TensorLike, logits: TensorLike): O = js.native
    def apply[T /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */, O /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */](
      multiClassLabels: TensorLike,
      logits: TensorLike,
      weights: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank]
    ): O = js.native
    def apply[T /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */, O /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */](
      multiClassLabels: TensorLike,
      logits: TensorLike,
      weights: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank],
      labelSmoothing: Double
    ): O = js.native
    def apply[T /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */, O /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */](
      multiClassLabels: TensorLike,
      logits: TensorLike,
      weights: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank],
      labelSmoothing: Double,
      reduction: Reduction
    ): O = js.native
    def apply[T /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */, O /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */](multiClassLabels: TensorLike, logits: TensorLike, weights: TensorLike): O = js.native
    def apply[T /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */, O /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */](multiClassLabels: TensorLike, logits: TensorLike, weights: TensorLike, labelSmoothing: Double): O = js.native
    def apply[T /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */, O /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */](
      multiClassLabels: TensorLike,
      logits: TensorLike,
      weights: TensorLike,
      labelSmoothing: Double,
      reduction: Reduction
    ): O = js.native
  }
  
  @js.native
  object softmaxCrossEntropy extends js.Object {
    def apply[T /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */, O /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */](onehotLabels: T, logits: T): O = js.native
    def apply[T /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */, O /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */](onehotLabels: T, logits: T, weights: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank]): O = js.native
    def apply[T /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */, O /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */](
      onehotLabels: T,
      logits: T,
      weights: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank],
      labelSmoothing: Double
    ): O = js.native
    def apply[T /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */, O /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */](
      onehotLabels: T,
      logits: T,
      weights: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank],
      labelSmoothing: Double,
      reduction: Reduction
    ): O = js.native
    def apply[T /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */, O /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */](onehotLabels: T, logits: T, weights: TensorLike): O = js.native
    def apply[T /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */, O /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */](onehotLabels: T, logits: T, weights: TensorLike, labelSmoothing: Double): O = js.native
    def apply[T /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */, O /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */](onehotLabels: T, logits: T, weights: TensorLike, labelSmoothing: Double, reduction: Reduction): O = js.native
    def apply[T /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */, O /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */](onehotLabels: T, logits: TensorLike): O = js.native
    def apply[T /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */, O /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */](
      onehotLabels: T,
      logits: TensorLike,
      weights: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank]
    ): O = js.native
    def apply[T /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */, O /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */](
      onehotLabels: T,
      logits: TensorLike,
      weights: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank],
      labelSmoothing: Double
    ): O = js.native
    def apply[T /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */, O /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */](
      onehotLabels: T,
      logits: TensorLike,
      weights: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank],
      labelSmoothing: Double,
      reduction: Reduction
    ): O = js.native
    def apply[T /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */, O /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */](onehotLabels: T, logits: TensorLike, weights: TensorLike): O = js.native
    def apply[T /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */, O /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */](onehotLabels: T, logits: TensorLike, weights: TensorLike, labelSmoothing: Double): O = js.native
    def apply[T /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */, O /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */](
      onehotLabels: T,
      logits: TensorLike,
      weights: TensorLike,
      labelSmoothing: Double,
      reduction: Reduction
    ): O = js.native
    def apply[T /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */, O /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */](onehotLabels: TensorLike, logits: T): O = js.native
    def apply[T /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */, O /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */](
      onehotLabels: TensorLike,
      logits: T,
      weights: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank]
    ): O = js.native
    def apply[T /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */, O /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */](
      onehotLabels: TensorLike,
      logits: T,
      weights: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank],
      labelSmoothing: Double
    ): O = js.native
    def apply[T /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */, O /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */](
      onehotLabels: TensorLike,
      logits: T,
      weights: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank],
      labelSmoothing: Double,
      reduction: Reduction
    ): O = js.native
    def apply[T /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */, O /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */](onehotLabels: TensorLike, logits: T, weights: TensorLike): O = js.native
    def apply[T /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */, O /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */](onehotLabels: TensorLike, logits: T, weights: TensorLike, labelSmoothing: Double): O = js.native
    def apply[T /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */, O /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */](
      onehotLabels: TensorLike,
      logits: T,
      weights: TensorLike,
      labelSmoothing: Double,
      reduction: Reduction
    ): O = js.native
    def apply[T /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */, O /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */](onehotLabels: TensorLike, logits: TensorLike): O = js.native
    def apply[T /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */, O /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */](
      onehotLabels: TensorLike,
      logits: TensorLike,
      weights: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank]
    ): O = js.native
    def apply[T /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */, O /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */](
      onehotLabels: TensorLike,
      logits: TensorLike,
      weights: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank],
      labelSmoothing: Double
    ): O = js.native
    def apply[T /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */, O /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */](
      onehotLabels: TensorLike,
      logits: TensorLike,
      weights: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank],
      labelSmoothing: Double,
      reduction: Reduction
    ): O = js.native
    def apply[T /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */, O /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */](onehotLabels: TensorLike, logits: TensorLike, weights: TensorLike): O = js.native
    def apply[T /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */, O /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */](onehotLabels: TensorLike, logits: TensorLike, weights: TensorLike, labelSmoothing: Double): O = js.native
    def apply[T /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */, O /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */](
      onehotLabels: TensorLike,
      logits: TensorLike,
      weights: TensorLike,
      labelSmoothing: Double,
      reduction: Reduction
    ): O = js.native
  }
  
}

