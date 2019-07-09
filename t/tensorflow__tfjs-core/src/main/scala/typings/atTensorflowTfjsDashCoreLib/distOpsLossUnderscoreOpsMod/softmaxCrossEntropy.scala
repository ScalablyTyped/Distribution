package typings
package atTensorflowTfjsDashCoreLib.distOpsLossUnderscoreOpsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/ops/loss_ops", "softmaxCrossEntropy")
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

