package typings.atTensorflowTfjsDashCore.distOpsFusedUnderscoreUtilMod

import typings.atTensorflowTfjsDashCore.distTensorMod.Tensor
import typings.atTensorflowTfjsDashCore.distTensorMod.Tensor3D
import typings.atTensorflowTfjsDashCore.distTypesMod.Rank
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
    val __obj = js.Dynamic.literal(a = a, b = b, transposeA = transposeA, transposeB = transposeB)
    if (activation != null) __obj.updateDynamic("activation")(activation)
    if (bias != null) __obj.updateDynamic("bias")(bias)
    if (preluActivationWeights != null) __obj.updateDynamic("preluActivationWeights")(preluActivationWeights)
    __obj.asInstanceOf[FusedBatchMatMulConfig]
  }
}

