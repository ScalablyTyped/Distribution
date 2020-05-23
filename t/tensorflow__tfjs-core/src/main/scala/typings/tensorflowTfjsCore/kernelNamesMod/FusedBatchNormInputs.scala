package typings.tensorflowTfjsCore.kernelNamesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<@tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/kernel_registry.NamedTensorInfoMap, 'x' | 'scale' | 'offset' | 'mean' | 'variance'> */
trait FusedBatchNormInputs extends js.Object {
  var mean: js.UndefOr[js.Any] = js.undefined
  var offset: js.UndefOr[js.Any] = js.undefined
  var scale: js.UndefOr[js.Any] = js.undefined
  var variance: js.UndefOr[js.Any] = js.undefined
  var x: js.UndefOr[js.Any] = js.undefined
}

object FusedBatchNormInputs {
  @scala.inline
  def apply(
    mean: js.Any = null,
    offset: js.Any = null,
    scale: js.Any = null,
    variance: js.Any = null,
    x: js.Any = null
  ): FusedBatchNormInputs = {
    val __obj = js.Dynamic.literal()
    if (mean != null) __obj.updateDynamic("mean")(mean.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (scale != null) __obj.updateDynamic("scale")(scale.asInstanceOf[js.Any])
    if (variance != null) __obj.updateDynamic("variance")(variance.asInstanceOf[js.Any])
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    __obj.asInstanceOf[FusedBatchNormInputs]
  }
}

