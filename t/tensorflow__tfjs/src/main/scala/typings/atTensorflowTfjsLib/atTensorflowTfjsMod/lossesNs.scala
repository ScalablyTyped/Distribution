package typings
package atTensorflowTfjsLib.atTensorflowTfjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs", "losses")
@js.native
object lossesNs extends js.Object {
  @js.native
  object Reduction extends js.Object {
    /* 1 */ val MEAN: atTensorflowTfjsDashCoreLib.distOpsLossUnderscoreOpsMod.Reduction.MEAN with scala.Double = js.native
    /* 0 */ val NONE: atTensorflowTfjsDashCoreLib.distOpsLossUnderscoreOpsMod.Reduction.NONE with scala.Double = js.native
    /* 2 */ val SUM: atTensorflowTfjsDashCoreLib.distOpsLossUnderscoreOpsMod.Reduction.SUM with scala.Double = js.native
    /* 3 */ val SUM_BY_NONZERO_WEIGHTS: atTensorflowTfjsDashCoreLib.distOpsLossUnderscoreOpsMod.Reduction.SUM_BY_NONZERO_WEIGHTS with scala.Double = js.native
    @JSBracketAccess
    def apply(value: scala.Double): js.UndefOr[
        atTensorflowTfjsDashCoreLib.distOpsLossUnderscoreOpsMod.Reduction with scala.Double
      ] = js.native
  }
  
  @js.native
  object absoluteDifference extends js.Object {
    def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */, O /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](labels: T, predictions: T): O = js.native
    def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */, O /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](
      labels: T,
      predictions: T,
      weights: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
    ): O = js.native
    def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */, O /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](
      labels: T,
      predictions: T,
      weights: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank],
      reduction: atTensorflowTfjsDashCoreLib.distOpsLossUnderscoreOpsMod.Reduction
    ): O = js.native
    def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */, O /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](labels: T, predictions: T, weights: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike): O = js.native
    def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */, O /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](
      labels: T,
      predictions: T,
      weights: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
      reduction: atTensorflowTfjsDashCoreLib.distOpsLossUnderscoreOpsMod.Reduction
    ): O = js.native
    def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */, O /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](labels: T, predictions: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike): O = js.native
    def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */, O /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](
      labels: T,
      predictions: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
      weights: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
    ): O = js.native
    def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */, O /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](
      labels: T,
      predictions: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
      weights: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank],
      reduction: atTensorflowTfjsDashCoreLib.distOpsLossUnderscoreOpsMod.Reduction
    ): O = js.native
    def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */, O /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](
      labels: T,
      predictions: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
      weights: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike
    ): O = js.native
    def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */, O /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](
      labels: T,
      predictions: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
      weights: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
      reduction: atTensorflowTfjsDashCoreLib.distOpsLossUnderscoreOpsMod.Reduction
    ): O = js.native
    def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */, O /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](labels: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike, predictions: T): O = js.native
    def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */, O /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](
      labels: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
      predictions: T,
      weights: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
    ): O = js.native
    def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */, O /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](
      labels: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
      predictions: T,
      weights: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank],
      reduction: atTensorflowTfjsDashCoreLib.distOpsLossUnderscoreOpsMod.Reduction
    ): O = js.native
    def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */, O /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](
      labels: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
      predictions: T,
      weights: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike
    ): O = js.native
    def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */, O /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](
      labels: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
      predictions: T,
      weights: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
      reduction: atTensorflowTfjsDashCoreLib.distOpsLossUnderscoreOpsMod.Reduction
    ): O = js.native
    def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */, O /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](
      labels: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
      predictions: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike
    ): O = js.native
    def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */, O /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](
      labels: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
      predictions: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
      weights: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
    ): O = js.native
    def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */, O /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](
      labels: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
      predictions: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
      weights: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank],
      reduction: atTensorflowTfjsDashCoreLib.distOpsLossUnderscoreOpsMod.Reduction
    ): O = js.native
    def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */, O /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](
      labels: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
      predictions: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
      weights: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike
    ): O = js.native
    def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */, O /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](
      labels: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
      predictions: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
      weights: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
      reduction: atTensorflowTfjsDashCoreLib.distOpsLossUnderscoreOpsMod.Reduction
    ): O = js.native
  }
  
  @js.native
  object computeWeightedLoss extends js.Object {
    def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */, O /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](losses: T): O = js.native
    def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */, O /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](
      losses: T,
      weights: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
    ): O = js.native
    def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */, O /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](
      losses: T,
      weights: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank],
      reduction: atTensorflowTfjsDashCoreLib.distOpsLossUnderscoreOpsMod.Reduction
    ): O = js.native
    def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */, O /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](losses: T, weights: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike): O = js.native
    def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */, O /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](
      losses: T,
      weights: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
      reduction: atTensorflowTfjsDashCoreLib.distOpsLossUnderscoreOpsMod.Reduction
    ): O = js.native
    def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */, O /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](losses: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike): O = js.native
    def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */, O /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](
      losses: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
      weights: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
    ): O = js.native
    def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */, O /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](
      losses: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
      weights: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank],
      reduction: atTensorflowTfjsDashCoreLib.distOpsLossUnderscoreOpsMod.Reduction
    ): O = js.native
    def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */, O /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](
      losses: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
      weights: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike
    ): O = js.native
    def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */, O /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](
      losses: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
      weights: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
      reduction: atTensorflowTfjsDashCoreLib.distOpsLossUnderscoreOpsMod.Reduction
    ): O = js.native
  }
  
  @js.native
  object cosineDistance extends js.Object {
    def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */, O /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](labels: T, predictions: T, axis: scala.Double): O = js.native
    def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */, O /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](
      labels: T,
      predictions: T,
      axis: scala.Double,
      weights: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
    ): O = js.native
    def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */, O /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](
      labels: T,
      predictions: T,
      axis: scala.Double,
      weights: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank],
      reduction: atTensorflowTfjsDashCoreLib.distOpsLossUnderscoreOpsMod.Reduction
    ): O = js.native
    def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */, O /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](
      labels: T,
      predictions: T,
      axis: scala.Double,
      weights: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike
    ): O = js.native
    def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */, O /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](
      labels: T,
      predictions: T,
      axis: scala.Double,
      weights: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
      reduction: atTensorflowTfjsDashCoreLib.distOpsLossUnderscoreOpsMod.Reduction
    ): O = js.native
    def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */, O /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](labels: T, predictions: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike, axis: scala.Double): O = js.native
    def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */, O /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](
      labels: T,
      predictions: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
      axis: scala.Double,
      weights: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
    ): O = js.native
    def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */, O /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](
      labels: T,
      predictions: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
      axis: scala.Double,
      weights: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank],
      reduction: atTensorflowTfjsDashCoreLib.distOpsLossUnderscoreOpsMod.Reduction
    ): O = js.native
    def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */, O /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](
      labels: T,
      predictions: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
      axis: scala.Double,
      weights: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike
    ): O = js.native
    def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */, O /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](
      labels: T,
      predictions: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
      axis: scala.Double,
      weights: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
      reduction: atTensorflowTfjsDashCoreLib.distOpsLossUnderscoreOpsMod.Reduction
    ): O = js.native
    def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */, O /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](labels: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike, predictions: T, axis: scala.Double): O = js.native
    def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */, O /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](
      labels: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
      predictions: T,
      axis: scala.Double,
      weights: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
    ): O = js.native
    def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */, O /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](
      labels: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
      predictions: T,
      axis: scala.Double,
      weights: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank],
      reduction: atTensorflowTfjsDashCoreLib.distOpsLossUnderscoreOpsMod.Reduction
    ): O = js.native
    def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */, O /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](
      labels: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
      predictions: T,
      axis: scala.Double,
      weights: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike
    ): O = js.native
    def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */, O /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](
      labels: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
      predictions: T,
      axis: scala.Double,
      weights: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
      reduction: atTensorflowTfjsDashCoreLib.distOpsLossUnderscoreOpsMod.Reduction
    ): O = js.native
    def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */, O /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](
      labels: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
      predictions: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
      axis: scala.Double
    ): O = js.native
    def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */, O /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](
      labels: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
      predictions: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
      axis: scala.Double,
      weights: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
    ): O = js.native
    def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */, O /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](
      labels: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
      predictions: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
      axis: scala.Double,
      weights: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank],
      reduction: atTensorflowTfjsDashCoreLib.distOpsLossUnderscoreOpsMod.Reduction
    ): O = js.native
    def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */, O /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](
      labels: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
      predictions: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
      axis: scala.Double,
      weights: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike
    ): O = js.native
    def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */, O /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](
      labels: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
      predictions: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
      axis: scala.Double,
      weights: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
      reduction: atTensorflowTfjsDashCoreLib.distOpsLossUnderscoreOpsMod.Reduction
    ): O = js.native
  }
  
  @js.native
  object hingeLoss extends js.Object {
    def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */, O /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](labels: T, predictions: T): O = js.native
    def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */, O /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](
      labels: T,
      predictions: T,
      weights: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
    ): O = js.native
    def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */, O /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](
      labels: T,
      predictions: T,
      weights: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank],
      reduction: atTensorflowTfjsDashCoreLib.distOpsLossUnderscoreOpsMod.Reduction
    ): O = js.native
    def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */, O /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](labels: T, predictions: T, weights: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike): O = js.native
    def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */, O /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](
      labels: T,
      predictions: T,
      weights: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
      reduction: atTensorflowTfjsDashCoreLib.distOpsLossUnderscoreOpsMod.Reduction
    ): O = js.native
    def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */, O /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](labels: T, predictions: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike): O = js.native
    def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */, O /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](
      labels: T,
      predictions: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
      weights: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
    ): O = js.native
    def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */, O /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](
      labels: T,
      predictions: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
      weights: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank],
      reduction: atTensorflowTfjsDashCoreLib.distOpsLossUnderscoreOpsMod.Reduction
    ): O = js.native
    def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */, O /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](
      labels: T,
      predictions: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
      weights: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike
    ): O = js.native
    def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */, O /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](
      labels: T,
      predictions: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
      weights: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
      reduction: atTensorflowTfjsDashCoreLib.distOpsLossUnderscoreOpsMod.Reduction
    ): O = js.native
    def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */, O /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](labels: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike, predictions: T): O = js.native
    def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */, O /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](
      labels: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
      predictions: T,
      weights: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
    ): O = js.native
    def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */, O /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](
      labels: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
      predictions: T,
      weights: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank],
      reduction: atTensorflowTfjsDashCoreLib.distOpsLossUnderscoreOpsMod.Reduction
    ): O = js.native
    def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */, O /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](
      labels: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
      predictions: T,
      weights: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike
    ): O = js.native
    def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */, O /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](
      labels: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
      predictions: T,
      weights: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
      reduction: atTensorflowTfjsDashCoreLib.distOpsLossUnderscoreOpsMod.Reduction
    ): O = js.native
    def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */, O /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](
      labels: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
      predictions: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike
    ): O = js.native
    def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */, O /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](
      labels: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
      predictions: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
      weights: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
    ): O = js.native
    def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */, O /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](
      labels: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
      predictions: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
      weights: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank],
      reduction: atTensorflowTfjsDashCoreLib.distOpsLossUnderscoreOpsMod.Reduction
    ): O = js.native
    def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */, O /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](
      labels: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
      predictions: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
      weights: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike
    ): O = js.native
    def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */, O /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](
      labels: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
      predictions: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
      weights: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
      reduction: atTensorflowTfjsDashCoreLib.distOpsLossUnderscoreOpsMod.Reduction
    ): O = js.native
  }
  
  @js.native
  object huberLoss extends js.Object {
    def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */, O /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](labels: T, predictions: T): O = js.native
    def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */, O /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](
      labels: T,
      predictions: T,
      weights: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
    ): O = js.native
    def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */, O /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](
      labels: T,
      predictions: T,
      weights: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank],
      delta: scala.Double
    ): O = js.native
    def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */, O /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](
      labels: T,
      predictions: T,
      weights: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank],
      delta: scala.Double,
      reduction: atTensorflowTfjsDashCoreLib.distOpsLossUnderscoreOpsMod.Reduction
    ): O = js.native
    def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */, O /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](labels: T, predictions: T, weights: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike): O = js.native
    def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */, O /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](
      labels: T,
      predictions: T,
      weights: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
      delta: scala.Double
    ): O = js.native
    def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */, O /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](
      labels: T,
      predictions: T,
      weights: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
      delta: scala.Double,
      reduction: atTensorflowTfjsDashCoreLib.distOpsLossUnderscoreOpsMod.Reduction
    ): O = js.native
    def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */, O /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](labels: T, predictions: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike): O = js.native
    def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */, O /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](
      labels: T,
      predictions: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
      weights: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
    ): O = js.native
    def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */, O /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](
      labels: T,
      predictions: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
      weights: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank],
      delta: scala.Double
    ): O = js.native
    def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */, O /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](
      labels: T,
      predictions: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
      weights: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank],
      delta: scala.Double,
      reduction: atTensorflowTfjsDashCoreLib.distOpsLossUnderscoreOpsMod.Reduction
    ): O = js.native
    def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */, O /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](
      labels: T,
      predictions: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
      weights: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike
    ): O = js.native
    def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */, O /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](
      labels: T,
      predictions: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
      weights: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
      delta: scala.Double
    ): O = js.native
    def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */, O /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](
      labels: T,
      predictions: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
      weights: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
      delta: scala.Double,
      reduction: atTensorflowTfjsDashCoreLib.distOpsLossUnderscoreOpsMod.Reduction
    ): O = js.native
    def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */, O /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](labels: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike, predictions: T): O = js.native
    def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */, O /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](
      labels: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
      predictions: T,
      weights: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
    ): O = js.native
    def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */, O /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](
      labels: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
      predictions: T,
      weights: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank],
      delta: scala.Double
    ): O = js.native
    def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */, O /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](
      labels: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
      predictions: T,
      weights: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank],
      delta: scala.Double,
      reduction: atTensorflowTfjsDashCoreLib.distOpsLossUnderscoreOpsMod.Reduction
    ): O = js.native
    def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */, O /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](
      labels: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
      predictions: T,
      weights: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike
    ): O = js.native
    def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */, O /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](
      labels: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
      predictions: T,
      weights: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
      delta: scala.Double
    ): O = js.native
    def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */, O /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](
      labels: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
      predictions: T,
      weights: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
      delta: scala.Double,
      reduction: atTensorflowTfjsDashCoreLib.distOpsLossUnderscoreOpsMod.Reduction
    ): O = js.native
    def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */, O /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](
      labels: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
      predictions: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike
    ): O = js.native
    def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */, O /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](
      labels: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
      predictions: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
      weights: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
    ): O = js.native
    def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */, O /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](
      labels: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
      predictions: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
      weights: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank],
      delta: scala.Double
    ): O = js.native
    def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */, O /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](
      labels: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
      predictions: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
      weights: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank],
      delta: scala.Double,
      reduction: atTensorflowTfjsDashCoreLib.distOpsLossUnderscoreOpsMod.Reduction
    ): O = js.native
    def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */, O /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](
      labels: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
      predictions: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
      weights: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike
    ): O = js.native
    def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */, O /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](
      labels: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
      predictions: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
      weights: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
      delta: scala.Double
    ): O = js.native
    def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */, O /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](
      labels: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
      predictions: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
      weights: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
      delta: scala.Double,
      reduction: atTensorflowTfjsDashCoreLib.distOpsLossUnderscoreOpsMod.Reduction
    ): O = js.native
  }
  
  @js.native
  object logLoss extends js.Object {
    def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */, O /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](labels: T, predictions: T): O = js.native
    def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */, O /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](
      labels: T,
      predictions: T,
      weights: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
    ): O = js.native
    def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */, O /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](
      labels: T,
      predictions: T,
      weights: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank],
      epsilon: scala.Double
    ): O = js.native
    def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */, O /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](
      labels: T,
      predictions: T,
      weights: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank],
      epsilon: scala.Double,
      reduction: atTensorflowTfjsDashCoreLib.distOpsLossUnderscoreOpsMod.Reduction
    ): O = js.native
    def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */, O /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](labels: T, predictions: T, weights: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike): O = js.native
    def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */, O /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](
      labels: T,
      predictions: T,
      weights: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
      epsilon: scala.Double
    ): O = js.native
    def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */, O /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](
      labels: T,
      predictions: T,
      weights: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
      epsilon: scala.Double,
      reduction: atTensorflowTfjsDashCoreLib.distOpsLossUnderscoreOpsMod.Reduction
    ): O = js.native
    def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */, O /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](labels: T, predictions: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike): O = js.native
    def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */, O /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](
      labels: T,
      predictions: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
      weights: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
    ): O = js.native
    def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */, O /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](
      labels: T,
      predictions: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
      weights: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank],
      epsilon: scala.Double
    ): O = js.native
    def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */, O /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](
      labels: T,
      predictions: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
      weights: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank],
      epsilon: scala.Double,
      reduction: atTensorflowTfjsDashCoreLib.distOpsLossUnderscoreOpsMod.Reduction
    ): O = js.native
    def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */, O /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](
      labels: T,
      predictions: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
      weights: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike
    ): O = js.native
    def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */, O /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](
      labels: T,
      predictions: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
      weights: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
      epsilon: scala.Double
    ): O = js.native
    def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */, O /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](
      labels: T,
      predictions: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
      weights: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
      epsilon: scala.Double,
      reduction: atTensorflowTfjsDashCoreLib.distOpsLossUnderscoreOpsMod.Reduction
    ): O = js.native
    def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */, O /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](labels: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike, predictions: T): O = js.native
    def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */, O /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](
      labels: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
      predictions: T,
      weights: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
    ): O = js.native
    def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */, O /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](
      labels: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
      predictions: T,
      weights: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank],
      epsilon: scala.Double
    ): O = js.native
    def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */, O /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](
      labels: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
      predictions: T,
      weights: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank],
      epsilon: scala.Double,
      reduction: atTensorflowTfjsDashCoreLib.distOpsLossUnderscoreOpsMod.Reduction
    ): O = js.native
    def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */, O /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](
      labels: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
      predictions: T,
      weights: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike
    ): O = js.native
    def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */, O /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](
      labels: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
      predictions: T,
      weights: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
      epsilon: scala.Double
    ): O = js.native
    def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */, O /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](
      labels: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
      predictions: T,
      weights: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
      epsilon: scala.Double,
      reduction: atTensorflowTfjsDashCoreLib.distOpsLossUnderscoreOpsMod.Reduction
    ): O = js.native
    def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */, O /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](
      labels: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
      predictions: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike
    ): O = js.native
    def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */, O /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](
      labels: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
      predictions: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
      weights: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
    ): O = js.native
    def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */, O /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](
      labels: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
      predictions: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
      weights: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank],
      epsilon: scala.Double
    ): O = js.native
    def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */, O /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](
      labels: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
      predictions: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
      weights: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank],
      epsilon: scala.Double,
      reduction: atTensorflowTfjsDashCoreLib.distOpsLossUnderscoreOpsMod.Reduction
    ): O = js.native
    def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */, O /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](
      labels: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
      predictions: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
      weights: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike
    ): O = js.native
    def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */, O /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](
      labels: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
      predictions: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
      weights: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
      epsilon: scala.Double
    ): O = js.native
    def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */, O /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](
      labels: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
      predictions: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
      weights: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
      epsilon: scala.Double,
      reduction: atTensorflowTfjsDashCoreLib.distOpsLossUnderscoreOpsMod.Reduction
    ): O = js.native
  }
  
  @js.native
  object meanSquaredError extends js.Object {
    def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */, O /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](labels: T, predictions: T): O = js.native
    def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */, O /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](
      labels: T,
      predictions: T,
      weights: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
    ): O = js.native
    def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */, O /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](
      labels: T,
      predictions: T,
      weights: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank],
      reduction: atTensorflowTfjsDashCoreLib.distOpsLossUnderscoreOpsMod.Reduction
    ): O = js.native
    def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */, O /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](labels: T, predictions: T, weights: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike): O = js.native
    def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */, O /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](
      labels: T,
      predictions: T,
      weights: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
      reduction: atTensorflowTfjsDashCoreLib.distOpsLossUnderscoreOpsMod.Reduction
    ): O = js.native
    def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */, O /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](labels: T, predictions: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike): O = js.native
    def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */, O /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](
      labels: T,
      predictions: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
      weights: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
    ): O = js.native
    def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */, O /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](
      labels: T,
      predictions: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
      weights: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank],
      reduction: atTensorflowTfjsDashCoreLib.distOpsLossUnderscoreOpsMod.Reduction
    ): O = js.native
    def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */, O /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](
      labels: T,
      predictions: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
      weights: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike
    ): O = js.native
    def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */, O /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](
      labels: T,
      predictions: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
      weights: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
      reduction: atTensorflowTfjsDashCoreLib.distOpsLossUnderscoreOpsMod.Reduction
    ): O = js.native
    def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */, O /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](labels: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike, predictions: T): O = js.native
    def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */, O /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](
      labels: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
      predictions: T,
      weights: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
    ): O = js.native
    def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */, O /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](
      labels: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
      predictions: T,
      weights: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank],
      reduction: atTensorflowTfjsDashCoreLib.distOpsLossUnderscoreOpsMod.Reduction
    ): O = js.native
    def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */, O /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](
      labels: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
      predictions: T,
      weights: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike
    ): O = js.native
    def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */, O /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](
      labels: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
      predictions: T,
      weights: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
      reduction: atTensorflowTfjsDashCoreLib.distOpsLossUnderscoreOpsMod.Reduction
    ): O = js.native
    def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */, O /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](
      labels: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
      predictions: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike
    ): O = js.native
    def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */, O /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](
      labels: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
      predictions: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
      weights: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
    ): O = js.native
    def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */, O /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](
      labels: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
      predictions: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
      weights: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank],
      reduction: atTensorflowTfjsDashCoreLib.distOpsLossUnderscoreOpsMod.Reduction
    ): O = js.native
    def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */, O /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](
      labels: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
      predictions: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
      weights: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike
    ): O = js.native
    def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */, O /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](
      labels: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
      predictions: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
      weights: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
      reduction: atTensorflowTfjsDashCoreLib.distOpsLossUnderscoreOpsMod.Reduction
    ): O = js.native
  }
  
  @js.native
  object sigmoidCrossEntropy extends js.Object {
    def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */, O /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](multiClassLabels: T, logits: T): O = js.native
    def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */, O /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](
      multiClassLabels: T,
      logits: T,
      weights: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
    ): O = js.native
    def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */, O /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](
      multiClassLabels: T,
      logits: T,
      weights: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank],
      labelSmoothing: scala.Double
    ): O = js.native
    def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */, O /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](
      multiClassLabels: T,
      logits: T,
      weights: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank],
      labelSmoothing: scala.Double,
      reduction: atTensorflowTfjsDashCoreLib.distOpsLossUnderscoreOpsMod.Reduction
    ): O = js.native
    def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */, O /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](multiClassLabels: T, logits: T, weights: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike): O = js.native
    def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */, O /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](
      multiClassLabels: T,
      logits: T,
      weights: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
      labelSmoothing: scala.Double
    ): O = js.native
    def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */, O /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](
      multiClassLabels: T,
      logits: T,
      weights: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
      labelSmoothing: scala.Double,
      reduction: atTensorflowTfjsDashCoreLib.distOpsLossUnderscoreOpsMod.Reduction
    ): O = js.native
    def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */, O /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](multiClassLabels: T, logits: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike): O = js.native
    def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */, O /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](
      multiClassLabels: T,
      logits: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
      weights: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
    ): O = js.native
    def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */, O /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](
      multiClassLabels: T,
      logits: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
      weights: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank],
      labelSmoothing: scala.Double
    ): O = js.native
    def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */, O /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](
      multiClassLabels: T,
      logits: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
      weights: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank],
      labelSmoothing: scala.Double,
      reduction: atTensorflowTfjsDashCoreLib.distOpsLossUnderscoreOpsMod.Reduction
    ): O = js.native
    def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */, O /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](
      multiClassLabels: T,
      logits: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
      weights: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike
    ): O = js.native
    def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */, O /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](
      multiClassLabels: T,
      logits: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
      weights: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
      labelSmoothing: scala.Double
    ): O = js.native
    def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */, O /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](
      multiClassLabels: T,
      logits: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
      weights: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
      labelSmoothing: scala.Double,
      reduction: atTensorflowTfjsDashCoreLib.distOpsLossUnderscoreOpsMod.Reduction
    ): O = js.native
    def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */, O /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](multiClassLabels: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike, logits: T): O = js.native
    def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */, O /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](
      multiClassLabels: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
      logits: T,
      weights: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
    ): O = js.native
    def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */, O /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](
      multiClassLabels: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
      logits: T,
      weights: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank],
      labelSmoothing: scala.Double
    ): O = js.native
    def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */, O /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](
      multiClassLabels: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
      logits: T,
      weights: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank],
      labelSmoothing: scala.Double,
      reduction: atTensorflowTfjsDashCoreLib.distOpsLossUnderscoreOpsMod.Reduction
    ): O = js.native
    def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */, O /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](
      multiClassLabels: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
      logits: T,
      weights: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike
    ): O = js.native
    def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */, O /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](
      multiClassLabels: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
      logits: T,
      weights: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
      labelSmoothing: scala.Double
    ): O = js.native
    def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */, O /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](
      multiClassLabels: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
      logits: T,
      weights: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
      labelSmoothing: scala.Double,
      reduction: atTensorflowTfjsDashCoreLib.distOpsLossUnderscoreOpsMod.Reduction
    ): O = js.native
    def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */, O /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](
      multiClassLabels: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
      logits: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike
    ): O = js.native
    def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */, O /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](
      multiClassLabels: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
      logits: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
      weights: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
    ): O = js.native
    def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */, O /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](
      multiClassLabels: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
      logits: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
      weights: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank],
      labelSmoothing: scala.Double
    ): O = js.native
    def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */, O /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](
      multiClassLabels: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
      logits: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
      weights: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank],
      labelSmoothing: scala.Double,
      reduction: atTensorflowTfjsDashCoreLib.distOpsLossUnderscoreOpsMod.Reduction
    ): O = js.native
    def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */, O /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](
      multiClassLabels: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
      logits: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
      weights: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike
    ): O = js.native
    def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */, O /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](
      multiClassLabels: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
      logits: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
      weights: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
      labelSmoothing: scala.Double
    ): O = js.native
    def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */, O /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](
      multiClassLabels: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
      logits: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
      weights: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
      labelSmoothing: scala.Double,
      reduction: atTensorflowTfjsDashCoreLib.distOpsLossUnderscoreOpsMod.Reduction
    ): O = js.native
  }
  
  @js.native
  object softmaxCrossEntropy extends js.Object {
    def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */, O /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](onehotLabels: T, logits: T): O = js.native
    def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */, O /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](
      onehotLabels: T,
      logits: T,
      weights: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
    ): O = js.native
    def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */, O /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](
      onehotLabels: T,
      logits: T,
      weights: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank],
      labelSmoothing: scala.Double
    ): O = js.native
    def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */, O /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](
      onehotLabels: T,
      logits: T,
      weights: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank],
      labelSmoothing: scala.Double,
      reduction: atTensorflowTfjsDashCoreLib.distOpsLossUnderscoreOpsMod.Reduction
    ): O = js.native
    def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */, O /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](onehotLabels: T, logits: T, weights: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike): O = js.native
    def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */, O /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](
      onehotLabels: T,
      logits: T,
      weights: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
      labelSmoothing: scala.Double
    ): O = js.native
    def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */, O /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](
      onehotLabels: T,
      logits: T,
      weights: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
      labelSmoothing: scala.Double,
      reduction: atTensorflowTfjsDashCoreLib.distOpsLossUnderscoreOpsMod.Reduction
    ): O = js.native
    def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */, O /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](onehotLabels: T, logits: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike): O = js.native
    def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */, O /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](
      onehotLabels: T,
      logits: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
      weights: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
    ): O = js.native
    def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */, O /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](
      onehotLabels: T,
      logits: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
      weights: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank],
      labelSmoothing: scala.Double
    ): O = js.native
    def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */, O /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](
      onehotLabels: T,
      logits: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
      weights: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank],
      labelSmoothing: scala.Double,
      reduction: atTensorflowTfjsDashCoreLib.distOpsLossUnderscoreOpsMod.Reduction
    ): O = js.native
    def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */, O /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](
      onehotLabels: T,
      logits: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
      weights: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike
    ): O = js.native
    def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */, O /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](
      onehotLabels: T,
      logits: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
      weights: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
      labelSmoothing: scala.Double
    ): O = js.native
    def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */, O /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](
      onehotLabels: T,
      logits: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
      weights: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
      labelSmoothing: scala.Double,
      reduction: atTensorflowTfjsDashCoreLib.distOpsLossUnderscoreOpsMod.Reduction
    ): O = js.native
    def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */, O /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](onehotLabels: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike, logits: T): O = js.native
    def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */, O /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](
      onehotLabels: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
      logits: T,
      weights: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
    ): O = js.native
    def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */, O /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](
      onehotLabels: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
      logits: T,
      weights: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank],
      labelSmoothing: scala.Double
    ): O = js.native
    def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */, O /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](
      onehotLabels: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
      logits: T,
      weights: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank],
      labelSmoothing: scala.Double,
      reduction: atTensorflowTfjsDashCoreLib.distOpsLossUnderscoreOpsMod.Reduction
    ): O = js.native
    def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */, O /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](
      onehotLabels: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
      logits: T,
      weights: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike
    ): O = js.native
    def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */, O /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](
      onehotLabels: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
      logits: T,
      weights: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
      labelSmoothing: scala.Double
    ): O = js.native
    def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */, O /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](
      onehotLabels: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
      logits: T,
      weights: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
      labelSmoothing: scala.Double,
      reduction: atTensorflowTfjsDashCoreLib.distOpsLossUnderscoreOpsMod.Reduction
    ): O = js.native
    def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */, O /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](
      onehotLabels: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
      logits: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike
    ): O = js.native
    def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */, O /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](
      onehotLabels: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
      logits: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
      weights: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
    ): O = js.native
    def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */, O /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](
      onehotLabels: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
      logits: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
      weights: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank],
      labelSmoothing: scala.Double
    ): O = js.native
    def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */, O /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](
      onehotLabels: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
      logits: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
      weights: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank],
      labelSmoothing: scala.Double,
      reduction: atTensorflowTfjsDashCoreLib.distOpsLossUnderscoreOpsMod.Reduction
    ): O = js.native
    def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */, O /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](
      onehotLabels: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
      logits: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
      weights: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike
    ): O = js.native
    def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */, O /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](
      onehotLabels: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
      logits: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
      weights: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
      labelSmoothing: scala.Double
    ): O = js.native
    def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */, O /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](
      onehotLabels: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
      logits: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
      weights: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
      labelSmoothing: scala.Double,
      reduction: atTensorflowTfjsDashCoreLib.distOpsLossUnderscoreOpsMod.Reduction
    ): O = js.native
  }
  
}

