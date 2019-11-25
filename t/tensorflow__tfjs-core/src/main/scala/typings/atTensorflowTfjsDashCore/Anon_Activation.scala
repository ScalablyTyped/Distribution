package typings.atTensorflowTfjsDashCore

import typings.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreStrings.NCHW
import typings.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreStrings.NHWC
import typings.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreStrings.ceil
import typings.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreStrings.floor
import typings.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreStrings.round
import typings.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreStrings.same_
import typings.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreStrings.valid_
import typings.atTensorflowTfjsDashCore.distOpsFusedUnderscoreUtilMod.Activation
import typings.atTensorflowTfjsDashCore.distTensorMod.Tensor
import typings.atTensorflowTfjsDashCore.distTensorMod.Tensor3D
import typings.atTensorflowTfjsDashCore.distTensorMod.Tensor4D
import typings.atTensorflowTfjsDashCore.distTypesMod.Rank
import typings.atTensorflowTfjsDashCore.distTypesMod.TensorLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Activation[T /* <: Tensor3D | Tensor4D */] extends js.Object {
  var activation: js.UndefOr[Activation] = js.undefined
  var bias: js.UndefOr[Tensor[Rank] | TensorLike] = js.undefined
  var dataFormat: js.UndefOr[NHWC | NCHW] = js.undefined
  var dilations: js.UndefOr[(js.Tuple2[Double, Double]) | Double] = js.undefined
  var dimRoundingMode: js.UndefOr[floor | round | ceil] = js.undefined
  var filter: Tensor4D | TensorLike
  var pad: valid_ | same_ | Double
  var preluActivationWeights: js.UndefOr[Tensor[Rank]] = js.undefined
  var strides: (js.Tuple2[Double, Double]) | Double
  var x: T | TensorLike
}

object Anon_Activation {
  @scala.inline
  def apply[T /* <: Tensor3D | Tensor4D */](
    filter: Tensor4D | TensorLike,
    pad: valid_ | same_ | Double,
    strides: (js.Tuple2[Double, Double]) | Double,
    x: T | TensorLike,
    activation: Activation = null,
    bias: Tensor[Rank] | TensorLike = null,
    dataFormat: NHWC | NCHW = null,
    dilations: (js.Tuple2[Double, Double]) | Double = null,
    dimRoundingMode: floor | round | ceil = null,
    preluActivationWeights: Tensor[Rank] = null
  ): Anon_Activation[T] = {
    val __obj = js.Dynamic.literal(filter = filter.asInstanceOf[js.Any], pad = pad.asInstanceOf[js.Any], strides = strides.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any])
    if (activation != null) __obj.updateDynamic("activation")(activation.asInstanceOf[js.Any])
    if (bias != null) __obj.updateDynamic("bias")(bias.asInstanceOf[js.Any])
    if (dataFormat != null) __obj.updateDynamic("dataFormat")(dataFormat.asInstanceOf[js.Any])
    if (dilations != null) __obj.updateDynamic("dilations")(dilations.asInstanceOf[js.Any])
    if (dimRoundingMode != null) __obj.updateDynamic("dimRoundingMode")(dimRoundingMode.asInstanceOf[js.Any])
    if (preluActivationWeights != null) __obj.updateDynamic("preluActivationWeights")(preluActivationWeights.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Activation[T]]
  }
}

