package typings.tensorflowTfjsCore

import typings.tensorflowTfjsCore.distTypesMod.Rank
import typings.tensorflowTfjsCore.distTypesMod.TensorLike
import typings.tensorflowTfjsCore.fusedUtilMod.Activation
import typings.tensorflowTfjsCore.tensorMod.Tensor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonA[T /* <: Tensor[Rank] */] extends js.Object {
  var a: T | TensorLike
  var activation: js.UndefOr[Activation] = js.undefined
  var b: T | TensorLike
  var bias: js.UndefOr[Tensor[Rank] | TensorLike] = js.undefined
  var preluActivationWeights: js.UndefOr[Tensor[Rank]] = js.undefined
  var transposeA: js.UndefOr[Boolean] = js.undefined
  var transposeB: js.UndefOr[Boolean] = js.undefined
}

object AnonA {
  @scala.inline
  def apply[T /* <: Tensor[Rank] */](
    a: T | TensorLike,
    b: T | TensorLike,
    activation: Activation = null,
    bias: Tensor[Rank] | TensorLike = null,
    preluActivationWeights: Tensor[Rank] = null,
    transposeA: js.UndefOr[Boolean] = js.undefined,
    transposeB: js.UndefOr[Boolean] = js.undefined
  ): AnonA[T] = {
    val __obj = js.Dynamic.literal(a = a.asInstanceOf[js.Any], b = b.asInstanceOf[js.Any])
    if (activation != null) __obj.updateDynamic("activation")(activation.asInstanceOf[js.Any])
    if (bias != null) __obj.updateDynamic("bias")(bias.asInstanceOf[js.Any])
    if (preluActivationWeights != null) __obj.updateDynamic("preluActivationWeights")(preluActivationWeights.asInstanceOf[js.Any])
    if (!js.isUndefined(transposeA)) __obj.updateDynamic("transposeA")(transposeA.asInstanceOf[js.Any])
    if (!js.isUndefined(transposeB)) __obj.updateDynamic("transposeB")(transposeB.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonA[T]]
  }
}

