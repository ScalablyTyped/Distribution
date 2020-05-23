package typings.tensorflowTfjsCore.anon

import typings.tensorflowTfjsCore.distTypesMod.Rank
import typings.tensorflowTfjsCore.distTypesMod.TensorLike
import typings.tensorflowTfjsCore.tensorMod.Tensor
import typings.tensorflowTfjsCore.tensorMod.Tensor3D
import typings.tensorflowTfjsCore.tensorMod.Tensor4D
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.NCHW
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.NHWC
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.ceil
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.floor
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.round
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.same_
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.valid_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Activation[T /* <: Tensor3D | Tensor4D */] extends js.Object {
  var activation: js.UndefOr[typings.tensorflowTfjsCore.fusedUtilMod.Activation] = js.undefined
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

object Activation {
  @scala.inline
  def apply[T](
    filter: Tensor4D | TensorLike,
    pad: valid_ | same_ | Double,
    strides: (js.Tuple2[Double, Double]) | Double,
    x: T | TensorLike,
    activation: typings.tensorflowTfjsCore.fusedUtilMod.Activation = null,
    bias: Tensor[Rank] | TensorLike = null,
    dataFormat: NHWC | NCHW = null,
    dilations: (js.Tuple2[Double, Double]) | Double = null,
    dimRoundingMode: floor | round | ceil = null,
    preluActivationWeights: Tensor[Rank] = null
  ): Activation[T] = {
    val __obj = js.Dynamic.literal(filter = filter.asInstanceOf[js.Any], pad = pad.asInstanceOf[js.Any], strides = strides.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any])
    if (activation != null) __obj.updateDynamic("activation")(activation.asInstanceOf[js.Any])
    if (bias != null) __obj.updateDynamic("bias")(bias.asInstanceOf[js.Any])
    if (dataFormat != null) __obj.updateDynamic("dataFormat")(dataFormat.asInstanceOf[js.Any])
    if (dilations != null) __obj.updateDynamic("dilations")(dilations.asInstanceOf[js.Any])
    if (dimRoundingMode != null) __obj.updateDynamic("dimRoundingMode")(dimRoundingMode.asInstanceOf[js.Any])
    if (preluActivationWeights != null) __obj.updateDynamic("preluActivationWeights")(preluActivationWeights.asInstanceOf[js.Any])
    __obj.asInstanceOf[Activation[T]]
  }
}

