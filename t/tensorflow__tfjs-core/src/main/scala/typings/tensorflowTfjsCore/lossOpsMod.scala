package typings.tensorflowTfjsCore

import org.scalablytyped.runtime.TopLevel
import typings.tensorflowTfjsCore.distTypesMod.Rank
import typings.tensorflowTfjsCore.distTypesMod.TensorLike
import typings.tensorflowTfjsCore.tensorMod.Tensor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/ops/loss_ops", JSImport.Namespace)
@js.native
object lossOpsMod extends js.Object {
  @js.native
  sealed trait Reduction extends js.Object
  
  @js.native
  object Reduction extends js.Object {
    @js.native
    sealed trait MEAN extends Reduction
    
    @js.native
    sealed trait NONE extends Reduction
    
    @js.native
    sealed trait SUM extends Reduction
    
    @js.native
    sealed trait SUM_BY_NONZERO_WEIGHTS extends Reduction
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[Reduction with Double] = js.native
    /* 1 */ @js.native
    object MEAN extends TopLevel[MEAN with Double]
    
    /* 0 */ @js.native
    object NONE extends TopLevel[NONE with Double]
    
    /* 2 */ @js.native
    object SUM extends TopLevel[SUM with Double]
    
    /* 3 */ @js.native
    object SUM_BY_NONZERO_WEIGHTS extends TopLevel[SUM_BY_NONZERO_WEIGHTS with Double]
    
  }
  
  @js.native
  object absoluteDifference extends js.Object {
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](labels: T, predictions: T): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](labels: T, predictions: T, weights: js.UndefOr[TensorLike], reduction: Reduction): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](labels: T, predictions: T, weights: TensorLike): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](labels: T, predictions: T, weights: Tensor[Rank]): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](labels: T, predictions: T, weights: Tensor[Rank], reduction: Reduction): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](labels: T, predictions: TensorLike): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](labels: T, predictions: TensorLike, weights: js.UndefOr[TensorLike], reduction: Reduction): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](labels: T, predictions: TensorLike, weights: TensorLike): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](labels: T, predictions: TensorLike, weights: Tensor[Rank]): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](labels: T, predictions: TensorLike, weights: Tensor[Rank], reduction: Reduction): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](labels: TensorLike, predictions: T): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](labels: TensorLike, predictions: T, weights: js.UndefOr[TensorLike], reduction: Reduction): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](labels: TensorLike, predictions: T, weights: TensorLike): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](labels: TensorLike, predictions: T, weights: Tensor[Rank]): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](labels: TensorLike, predictions: T, weights: Tensor[Rank], reduction: Reduction): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](labels: TensorLike, predictions: TensorLike): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](labels: TensorLike, predictions: TensorLike, weights: js.UndefOr[TensorLike], reduction: Reduction): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](labels: TensorLike, predictions: TensorLike, weights: TensorLike): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](labels: TensorLike, predictions: TensorLike, weights: Tensor[Rank]): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](labels: TensorLike, predictions: TensorLike, weights: Tensor[Rank], reduction: Reduction): O = js.native
  }
  
  @js.native
  object computeWeightedLoss extends js.Object {
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](losses: T): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](losses: T, weights: js.UndefOr[TensorLike], reduction: Reduction): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](losses: T, weights: TensorLike): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](losses: T, weights: Tensor[Rank]): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](losses: T, weights: Tensor[Rank], reduction: Reduction): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](losses: TensorLike): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](losses: TensorLike, weights: js.UndefOr[TensorLike], reduction: Reduction): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](losses: TensorLike, weights: TensorLike): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](losses: TensorLike, weights: Tensor[Rank]): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](losses: TensorLike, weights: Tensor[Rank], reduction: Reduction): O = js.native
  }
  
  @js.native
  object cosineDistance extends js.Object {
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](labels: T, predictions: T, axis: Double): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](labels: T, predictions: T, axis: Double, weights: js.UndefOr[TensorLike], reduction: Reduction): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](labels: T, predictions: T, axis: Double, weights: TensorLike): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](labels: T, predictions: T, axis: Double, weights: Tensor[Rank]): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](labels: T, predictions: T, axis: Double, weights: Tensor[Rank], reduction: Reduction): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](labels: T, predictions: TensorLike, axis: Double): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](
      labels: T,
      predictions: TensorLike,
      axis: Double,
      weights: js.UndefOr[TensorLike],
      reduction: Reduction
    ): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](labels: T, predictions: TensorLike, axis: Double, weights: TensorLike): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](labels: T, predictions: TensorLike, axis: Double, weights: Tensor[Rank]): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](labels: T, predictions: TensorLike, axis: Double, weights: Tensor[Rank], reduction: Reduction): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](labels: TensorLike, predictions: T, axis: Double): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](
      labels: TensorLike,
      predictions: T,
      axis: Double,
      weights: js.UndefOr[TensorLike],
      reduction: Reduction
    ): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](labels: TensorLike, predictions: T, axis: Double, weights: TensorLike): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](labels: TensorLike, predictions: T, axis: Double, weights: Tensor[Rank]): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](labels: TensorLike, predictions: T, axis: Double, weights: Tensor[Rank], reduction: Reduction): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](labels: TensorLike, predictions: TensorLike, axis: Double): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](
      labels: TensorLike,
      predictions: TensorLike,
      axis: Double,
      weights: js.UndefOr[TensorLike],
      reduction: Reduction
    ): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](labels: TensorLike, predictions: TensorLike, axis: Double, weights: TensorLike): O = js.native
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
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](labels: T, predictions: T, weights: js.UndefOr[TensorLike], reduction: Reduction): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](labels: T, predictions: T, weights: TensorLike): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](labels: T, predictions: T, weights: Tensor[Rank]): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](labels: T, predictions: T, weights: Tensor[Rank], reduction: Reduction): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](labels: T, predictions: TensorLike): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](labels: T, predictions: TensorLike, weights: js.UndefOr[TensorLike], reduction: Reduction): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](labels: T, predictions: TensorLike, weights: TensorLike): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](labels: T, predictions: TensorLike, weights: Tensor[Rank]): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](labels: T, predictions: TensorLike, weights: Tensor[Rank], reduction: Reduction): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](labels: TensorLike, predictions: T): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](labels: TensorLike, predictions: T, weights: js.UndefOr[TensorLike], reduction: Reduction): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](labels: TensorLike, predictions: T, weights: TensorLike): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](labels: TensorLike, predictions: T, weights: Tensor[Rank]): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](labels: TensorLike, predictions: T, weights: Tensor[Rank], reduction: Reduction): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](labels: TensorLike, predictions: TensorLike): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](labels: TensorLike, predictions: TensorLike, weights: js.UndefOr[TensorLike], reduction: Reduction): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](labels: TensorLike, predictions: TensorLike, weights: TensorLike): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](labels: TensorLike, predictions: TensorLike, weights: Tensor[Rank]): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](labels: TensorLike, predictions: TensorLike, weights: Tensor[Rank], reduction: Reduction): O = js.native
  }
  
  @js.native
  object huberLoss extends js.Object {
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](labels: T, predictions: T): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](
      labels: T,
      predictions: T,
      weights: js.UndefOr[TensorLike],
      delta: js.UndefOr[scala.Nothing],
      reduction: Reduction
    ): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](labels: T, predictions: T, weights: js.UndefOr[TensorLike], delta: Double): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](labels: T, predictions: T, weights: js.UndefOr[TensorLike], delta: Double, reduction: Reduction): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](labels: T, predictions: T, weights: TensorLike): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](labels: T, predictions: T, weights: Tensor[Rank]): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](
      labels: T,
      predictions: T,
      weights: Tensor[Rank],
      delta: js.UndefOr[scala.Nothing],
      reduction: Reduction
    ): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](labels: T, predictions: T, weights: Tensor[Rank], delta: Double): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](labels: T, predictions: T, weights: Tensor[Rank], delta: Double, reduction: Reduction): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](labels: T, predictions: TensorLike): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](
      labels: T,
      predictions: TensorLike,
      weights: js.UndefOr[TensorLike],
      delta: js.UndefOr[scala.Nothing],
      reduction: Reduction
    ): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](labels: T, predictions: TensorLike, weights: js.UndefOr[TensorLike], delta: Double): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](
      labels: T,
      predictions: TensorLike,
      weights: js.UndefOr[TensorLike],
      delta: Double,
      reduction: Reduction
    ): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](labels: T, predictions: TensorLike, weights: TensorLike): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](labels: T, predictions: TensorLike, weights: Tensor[Rank]): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](
      labels: T,
      predictions: TensorLike,
      weights: Tensor[Rank],
      delta: js.UndefOr[scala.Nothing],
      reduction: Reduction
    ): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](labels: T, predictions: TensorLike, weights: Tensor[Rank], delta: Double): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](labels: T, predictions: TensorLike, weights: Tensor[Rank], delta: Double, reduction: Reduction): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](labels: TensorLike, predictions: T): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](
      labels: TensorLike,
      predictions: T,
      weights: js.UndefOr[TensorLike],
      delta: js.UndefOr[scala.Nothing],
      reduction: Reduction
    ): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](labels: TensorLike, predictions: T, weights: js.UndefOr[TensorLike], delta: Double): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](
      labels: TensorLike,
      predictions: T,
      weights: js.UndefOr[TensorLike],
      delta: Double,
      reduction: Reduction
    ): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](labels: TensorLike, predictions: T, weights: TensorLike): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](labels: TensorLike, predictions: T, weights: Tensor[Rank]): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](
      labels: TensorLike,
      predictions: T,
      weights: Tensor[Rank],
      delta: js.UndefOr[scala.Nothing],
      reduction: Reduction
    ): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](labels: TensorLike, predictions: T, weights: Tensor[Rank], delta: Double): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](labels: TensorLike, predictions: T, weights: Tensor[Rank], delta: Double, reduction: Reduction): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](labels: TensorLike, predictions: TensorLike): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](
      labels: TensorLike,
      predictions: TensorLike,
      weights: js.UndefOr[TensorLike],
      delta: js.UndefOr[scala.Nothing],
      reduction: Reduction
    ): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](labels: TensorLike, predictions: TensorLike, weights: js.UndefOr[TensorLike], delta: Double): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](
      labels: TensorLike,
      predictions: TensorLike,
      weights: js.UndefOr[TensorLike],
      delta: Double,
      reduction: Reduction
    ): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](labels: TensorLike, predictions: TensorLike, weights: TensorLike): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](labels: TensorLike, predictions: TensorLike, weights: Tensor[Rank]): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](
      labels: TensorLike,
      predictions: TensorLike,
      weights: Tensor[Rank],
      delta: js.UndefOr[scala.Nothing],
      reduction: Reduction
    ): O = js.native
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
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](
      labels: T,
      predictions: T,
      weights: js.UndefOr[TensorLike],
      epsilon: js.UndefOr[scala.Nothing],
      reduction: Reduction
    ): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](labels: T, predictions: T, weights: js.UndefOr[TensorLike], epsilon: Double): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](labels: T, predictions: T, weights: js.UndefOr[TensorLike], epsilon: Double, reduction: Reduction): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](labels: T, predictions: T, weights: TensorLike): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](labels: T, predictions: T, weights: Tensor[Rank]): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](
      labels: T,
      predictions: T,
      weights: Tensor[Rank],
      epsilon: js.UndefOr[scala.Nothing],
      reduction: Reduction
    ): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](labels: T, predictions: T, weights: Tensor[Rank], epsilon: Double): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](labels: T, predictions: T, weights: Tensor[Rank], epsilon: Double, reduction: Reduction): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](labels: T, predictions: TensorLike): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](
      labels: T,
      predictions: TensorLike,
      weights: js.UndefOr[TensorLike],
      epsilon: js.UndefOr[scala.Nothing],
      reduction: Reduction
    ): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](labels: T, predictions: TensorLike, weights: js.UndefOr[TensorLike], epsilon: Double): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](
      labels: T,
      predictions: TensorLike,
      weights: js.UndefOr[TensorLike],
      epsilon: Double,
      reduction: Reduction
    ): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](labels: T, predictions: TensorLike, weights: TensorLike): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](labels: T, predictions: TensorLike, weights: Tensor[Rank]): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](
      labels: T,
      predictions: TensorLike,
      weights: Tensor[Rank],
      epsilon: js.UndefOr[scala.Nothing],
      reduction: Reduction
    ): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](labels: T, predictions: TensorLike, weights: Tensor[Rank], epsilon: Double): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](labels: T, predictions: TensorLike, weights: Tensor[Rank], epsilon: Double, reduction: Reduction): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](labels: TensorLike, predictions: T): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](
      labels: TensorLike,
      predictions: T,
      weights: js.UndefOr[TensorLike],
      epsilon: js.UndefOr[scala.Nothing],
      reduction: Reduction
    ): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](labels: TensorLike, predictions: T, weights: js.UndefOr[TensorLike], epsilon: Double): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](
      labels: TensorLike,
      predictions: T,
      weights: js.UndefOr[TensorLike],
      epsilon: Double,
      reduction: Reduction
    ): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](labels: TensorLike, predictions: T, weights: TensorLike): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](labels: TensorLike, predictions: T, weights: Tensor[Rank]): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](
      labels: TensorLike,
      predictions: T,
      weights: Tensor[Rank],
      epsilon: js.UndefOr[scala.Nothing],
      reduction: Reduction
    ): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](labels: TensorLike, predictions: T, weights: Tensor[Rank], epsilon: Double): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](labels: TensorLike, predictions: T, weights: Tensor[Rank], epsilon: Double, reduction: Reduction): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](labels: TensorLike, predictions: TensorLike): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](
      labels: TensorLike,
      predictions: TensorLike,
      weights: js.UndefOr[TensorLike],
      epsilon: js.UndefOr[scala.Nothing],
      reduction: Reduction
    ): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](labels: TensorLike, predictions: TensorLike, weights: js.UndefOr[TensorLike], epsilon: Double): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](
      labels: TensorLike,
      predictions: TensorLike,
      weights: js.UndefOr[TensorLike],
      epsilon: Double,
      reduction: Reduction
    ): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](labels: TensorLike, predictions: TensorLike, weights: TensorLike): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](labels: TensorLike, predictions: TensorLike, weights: Tensor[Rank]): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](
      labels: TensorLike,
      predictions: TensorLike,
      weights: Tensor[Rank],
      epsilon: js.UndefOr[scala.Nothing],
      reduction: Reduction
    ): O = js.native
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
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](labels: T, predictions: T, weights: js.UndefOr[TensorLike], reduction: Reduction): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](labels: T, predictions: T, weights: TensorLike): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](labels: T, predictions: T, weights: Tensor[Rank]): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](labels: T, predictions: T, weights: Tensor[Rank], reduction: Reduction): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](labels: T, predictions: TensorLike): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](labels: T, predictions: TensorLike, weights: js.UndefOr[TensorLike], reduction: Reduction): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](labels: T, predictions: TensorLike, weights: TensorLike): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](labels: T, predictions: TensorLike, weights: Tensor[Rank]): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](labels: T, predictions: TensorLike, weights: Tensor[Rank], reduction: Reduction): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](labels: TensorLike, predictions: T): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](labels: TensorLike, predictions: T, weights: js.UndefOr[TensorLike], reduction: Reduction): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](labels: TensorLike, predictions: T, weights: TensorLike): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](labels: TensorLike, predictions: T, weights: Tensor[Rank]): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](labels: TensorLike, predictions: T, weights: Tensor[Rank], reduction: Reduction): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](labels: TensorLike, predictions: TensorLike): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](labels: TensorLike, predictions: TensorLike, weights: js.UndefOr[TensorLike], reduction: Reduction): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](labels: TensorLike, predictions: TensorLike, weights: TensorLike): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](labels: TensorLike, predictions: TensorLike, weights: Tensor[Rank]): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](labels: TensorLike, predictions: TensorLike, weights: Tensor[Rank], reduction: Reduction): O = js.native
  }
  
  @js.native
  object sigmoidCrossEntropy extends js.Object {
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](multiClassLabels: T, logits: T): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](
      multiClassLabels: T,
      logits: T,
      weights: js.UndefOr[TensorLike],
      labelSmoothing: js.UndefOr[scala.Nothing],
      reduction: Reduction
    ): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](multiClassLabels: T, logits: T, weights: js.UndefOr[TensorLike], labelSmoothing: Double): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](
      multiClassLabels: T,
      logits: T,
      weights: js.UndefOr[TensorLike],
      labelSmoothing: Double,
      reduction: Reduction
    ): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](multiClassLabels: T, logits: T, weights: TensorLike): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](multiClassLabels: T, logits: T, weights: Tensor[Rank]): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](
      multiClassLabels: T,
      logits: T,
      weights: Tensor[Rank],
      labelSmoothing: js.UndefOr[scala.Nothing],
      reduction: Reduction
    ): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](multiClassLabels: T, logits: T, weights: Tensor[Rank], labelSmoothing: Double): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](
      multiClassLabels: T,
      logits: T,
      weights: Tensor[Rank],
      labelSmoothing: Double,
      reduction: Reduction
    ): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](multiClassLabels: T, logits: TensorLike): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](
      multiClassLabels: T,
      logits: TensorLike,
      weights: js.UndefOr[TensorLike],
      labelSmoothing: js.UndefOr[scala.Nothing],
      reduction: Reduction
    ): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](multiClassLabels: T, logits: TensorLike, weights: js.UndefOr[TensorLike], labelSmoothing: Double): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](
      multiClassLabels: T,
      logits: TensorLike,
      weights: js.UndefOr[TensorLike],
      labelSmoothing: Double,
      reduction: Reduction
    ): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](multiClassLabels: T, logits: TensorLike, weights: TensorLike): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](multiClassLabels: T, logits: TensorLike, weights: Tensor[Rank]): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](
      multiClassLabels: T,
      logits: TensorLike,
      weights: Tensor[Rank],
      labelSmoothing: js.UndefOr[scala.Nothing],
      reduction: Reduction
    ): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](multiClassLabels: T, logits: TensorLike, weights: Tensor[Rank], labelSmoothing: Double): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](
      multiClassLabels: T,
      logits: TensorLike,
      weights: Tensor[Rank],
      labelSmoothing: Double,
      reduction: Reduction
    ): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](multiClassLabels: TensorLike, logits: T): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](
      multiClassLabels: TensorLike,
      logits: T,
      weights: js.UndefOr[TensorLike],
      labelSmoothing: js.UndefOr[scala.Nothing],
      reduction: Reduction
    ): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](multiClassLabels: TensorLike, logits: T, weights: js.UndefOr[TensorLike], labelSmoothing: Double): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](
      multiClassLabels: TensorLike,
      logits: T,
      weights: js.UndefOr[TensorLike],
      labelSmoothing: Double,
      reduction: Reduction
    ): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](multiClassLabels: TensorLike, logits: T, weights: TensorLike): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](multiClassLabels: TensorLike, logits: T, weights: Tensor[Rank]): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](
      multiClassLabels: TensorLike,
      logits: T,
      weights: Tensor[Rank],
      labelSmoothing: js.UndefOr[scala.Nothing],
      reduction: Reduction
    ): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](multiClassLabels: TensorLike, logits: T, weights: Tensor[Rank], labelSmoothing: Double): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](
      multiClassLabels: TensorLike,
      logits: T,
      weights: Tensor[Rank],
      labelSmoothing: Double,
      reduction: Reduction
    ): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](multiClassLabels: TensorLike, logits: TensorLike): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](
      multiClassLabels: TensorLike,
      logits: TensorLike,
      weights: js.UndefOr[TensorLike],
      labelSmoothing: js.UndefOr[scala.Nothing],
      reduction: Reduction
    ): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](
      multiClassLabels: TensorLike,
      logits: TensorLike,
      weights: js.UndefOr[TensorLike],
      labelSmoothing: Double
    ): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](
      multiClassLabels: TensorLike,
      logits: TensorLike,
      weights: js.UndefOr[TensorLike],
      labelSmoothing: Double,
      reduction: Reduction
    ): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](multiClassLabels: TensorLike, logits: TensorLike, weights: TensorLike): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](multiClassLabels: TensorLike, logits: TensorLike, weights: Tensor[Rank]): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](
      multiClassLabels: TensorLike,
      logits: TensorLike,
      weights: Tensor[Rank],
      labelSmoothing: js.UndefOr[scala.Nothing],
      reduction: Reduction
    ): O = js.native
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
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](
      onehotLabels: T,
      logits: T,
      weights: js.UndefOr[TensorLike],
      labelSmoothing: js.UndefOr[scala.Nothing],
      reduction: Reduction
    ): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](onehotLabels: T, logits: T, weights: js.UndefOr[TensorLike], labelSmoothing: Double): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](
      onehotLabels: T,
      logits: T,
      weights: js.UndefOr[TensorLike],
      labelSmoothing: Double,
      reduction: Reduction
    ): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](onehotLabels: T, logits: T, weights: TensorLike): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](onehotLabels: T, logits: T, weights: Tensor[Rank]): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](
      onehotLabels: T,
      logits: T,
      weights: Tensor[Rank],
      labelSmoothing: js.UndefOr[scala.Nothing],
      reduction: Reduction
    ): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](onehotLabels: T, logits: T, weights: Tensor[Rank], labelSmoothing: Double): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](onehotLabels: T, logits: T, weights: Tensor[Rank], labelSmoothing: Double, reduction: Reduction): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](onehotLabels: T, logits: TensorLike): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](
      onehotLabels: T,
      logits: TensorLike,
      weights: js.UndefOr[TensorLike],
      labelSmoothing: js.UndefOr[scala.Nothing],
      reduction: Reduction
    ): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](onehotLabels: T, logits: TensorLike, weights: js.UndefOr[TensorLike], labelSmoothing: Double): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](
      onehotLabels: T,
      logits: TensorLike,
      weights: js.UndefOr[TensorLike],
      labelSmoothing: Double,
      reduction: Reduction
    ): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](onehotLabels: T, logits: TensorLike, weights: TensorLike): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](onehotLabels: T, logits: TensorLike, weights: Tensor[Rank]): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](
      onehotLabels: T,
      logits: TensorLike,
      weights: Tensor[Rank],
      labelSmoothing: js.UndefOr[scala.Nothing],
      reduction: Reduction
    ): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](onehotLabels: T, logits: TensorLike, weights: Tensor[Rank], labelSmoothing: Double): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](
      onehotLabels: T,
      logits: TensorLike,
      weights: Tensor[Rank],
      labelSmoothing: Double,
      reduction: Reduction
    ): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](onehotLabels: TensorLike, logits: T): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](
      onehotLabels: TensorLike,
      logits: T,
      weights: js.UndefOr[TensorLike],
      labelSmoothing: js.UndefOr[scala.Nothing],
      reduction: Reduction
    ): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](onehotLabels: TensorLike, logits: T, weights: js.UndefOr[TensorLike], labelSmoothing: Double): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](
      onehotLabels: TensorLike,
      logits: T,
      weights: js.UndefOr[TensorLike],
      labelSmoothing: Double,
      reduction: Reduction
    ): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](onehotLabels: TensorLike, logits: T, weights: TensorLike): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](onehotLabels: TensorLike, logits: T, weights: Tensor[Rank]): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](
      onehotLabels: TensorLike,
      logits: T,
      weights: Tensor[Rank],
      labelSmoothing: js.UndefOr[scala.Nothing],
      reduction: Reduction
    ): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](onehotLabels: TensorLike, logits: T, weights: Tensor[Rank], labelSmoothing: Double): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](
      onehotLabels: TensorLike,
      logits: T,
      weights: Tensor[Rank],
      labelSmoothing: Double,
      reduction: Reduction
    ): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](onehotLabels: TensorLike, logits: TensorLike): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](
      onehotLabels: TensorLike,
      logits: TensorLike,
      weights: js.UndefOr[TensorLike],
      labelSmoothing: js.UndefOr[scala.Nothing],
      reduction: Reduction
    ): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](
      onehotLabels: TensorLike,
      logits: TensorLike,
      weights: js.UndefOr[TensorLike],
      labelSmoothing: Double
    ): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](
      onehotLabels: TensorLike,
      logits: TensorLike,
      weights: js.UndefOr[TensorLike],
      labelSmoothing: Double,
      reduction: Reduction
    ): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](onehotLabels: TensorLike, logits: TensorLike, weights: TensorLike): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](onehotLabels: TensorLike, logits: TensorLike, weights: Tensor[Rank]): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](
      onehotLabels: TensorLike,
      logits: TensorLike,
      weights: Tensor[Rank],
      labelSmoothing: js.UndefOr[scala.Nothing],
      reduction: Reduction
    ): O = js.native
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

