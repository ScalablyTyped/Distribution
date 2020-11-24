package typings.tensorflowTfjsCore

import typings.tensorflowTfjsCore.distTensorMod.Tensor
import typings.tensorflowTfjsCore.distTypesMod.Rank
import typings.tensorflowTfjsCore.distTypesMod.TensorLike
import typings.tensorflowTfjsCore.lossOpsUtilsMod.Reduction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-core/dist/ops/losses/softmax_cross_entropy", JSImport.Namespace)
@js.native
object softmaxCrossEntropyMod extends js.Object {
  
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
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](onehotLabels: T, logits: T, weights: TensorLike): O = js.native
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
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](onehotLabels: T, logits: TensorLike, weights: TensorLike): O = js.native
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
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](onehotLabels: TensorLike, logits: T, weights: TensorLike): O = js.native
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
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](onehotLabels: TensorLike, logits: TensorLike, weights: TensorLike): O = js.native
  }
}
