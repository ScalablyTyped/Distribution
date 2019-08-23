package typings.atTensorflowTfjsDashCore

import typings.atTensorflowTfjsDashCore.distOpsFusedUnderscoreUtilMod.Activation
import typings.atTensorflowTfjsDashCore.distTensorMod.Tensor
import typings.atTensorflowTfjsDashCore.distTypesMod.Rank
import typings.atTensorflowTfjsDashCore.distTypesMod.TensorLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_A[T /* <: Tensor[Rank] */] extends js.Object {
  var a: T | TensorLike
  var activation: js.UndefOr[Activation] = js.undefined
  var b: T | TensorLike
  var bias: js.UndefOr[Tensor[Rank] | TensorLike] = js.undefined
  var preluActivationWeights: js.UndefOr[Tensor[Rank]] = js.undefined
  var transposeA: js.UndefOr[Boolean] = js.undefined
  var transposeB: js.UndefOr[Boolean] = js.undefined
}

object Anon_A {
  @scala.inline
  def apply[T /* <: Tensor[Rank] */](
    a: T | TensorLike,
    b: T | TensorLike,
    activation: Activation = null,
    bias: Tensor[Rank] | TensorLike = null,
    preluActivationWeights: Tensor[Rank] = null,
    transposeA: js.UndefOr[Boolean] = js.undefined,
    transposeB: js.UndefOr[Boolean] = js.undefined
  ): Anon_A[T] = {
    val __obj = js.Dynamic.literal(a = a.asInstanceOf[js.Any], b = b.asInstanceOf[js.Any])
    if (activation != null) __obj.updateDynamic("activation")(activation)
    if (bias != null) __obj.updateDynamic("bias")(bias.asInstanceOf[js.Any])
    if (preluActivationWeights != null) __obj.updateDynamic("preluActivationWeights")(preluActivationWeights)
    if (!js.isUndefined(transposeA)) __obj.updateDynamic("transposeA")(transposeA)
    if (!js.isUndefined(transposeB)) __obj.updateDynamic("transposeB")(transposeB)
    __obj.asInstanceOf[Anon_A[T]]
  }
}

