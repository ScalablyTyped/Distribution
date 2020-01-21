package typings.tensorflowTfjsCore.fusedUtilMod

import typings.tensorflowTfjsCore.distTypesMod.Rank
import typings.tensorflowTfjsCore.tensorMod.Tensor
import typings.tensorflowTfjsCore.tensorMod.Tensor3D
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FusedBatchMatMulConfig extends js.Object {
  var a: Tensor3D
  var activation: js.UndefOr[Activation] = js.undefined
  var b: Tensor3D
  var bias: js.UndefOr[Tensor[Rank]] = js.undefined
  var preluActivationWeights: js.UndefOr[Tensor[Rank]] = js.undefined
  var transposeA: Boolean
  var transposeB: Boolean
}

object FusedBatchMatMulConfig {
  @scala.inline
  def apply(
    a: Tensor3D,
    b: Tensor3D,
    transposeA: Boolean,
    transposeB: Boolean,
    activation: Activation = null,
    bias: Tensor[Rank] = null,
    preluActivationWeights: Tensor[Rank] = null
  ): FusedBatchMatMulConfig = {
    val __obj = js.Dynamic.literal(a = a.asInstanceOf[js.Any], b = b.asInstanceOf[js.Any], transposeA = transposeA.asInstanceOf[js.Any], transposeB = transposeB.asInstanceOf[js.Any])
    if (activation != null) __obj.updateDynamic("activation")(activation.asInstanceOf[js.Any])
    if (bias != null) __obj.updateDynamic("bias")(bias.asInstanceOf[js.Any])
    if (preluActivationWeights != null) __obj.updateDynamic("preluActivationWeights")(preluActivationWeights.asInstanceOf[js.Any])
    __obj.asInstanceOf[FusedBatchMatMulConfig]
  }
}

