package typings.tensorflowTfjsLayers.executorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExecutionProbe extends js.Object {
  /**
    * Maximum number of tensors that exist during all steps of the
    * execution. Tensor counts are measured at the beginning of every
    * step.
    */
  var maxNumTensors: js.UndefOr[Double] = js.undefined
  /**
    * Minimum number of tensors that exist during all steps of the
    * execution. Tensor counts are measured at the beginning of every
    * step.
    */
  var minNumTensors: js.UndefOr[Double] = js.undefined
}

object ExecutionProbe {
  @scala.inline
  def apply(maxNumTensors: Int | Double = null, minNumTensors: Int | Double = null): ExecutionProbe = {
    val __obj = js.Dynamic.literal()
    if (maxNumTensors != null) __obj.updateDynamic("maxNumTensors")(maxNumTensors.asInstanceOf[js.Any])
    if (minNumTensors != null) __obj.updateDynamic("minNumTensors")(minNumTensors.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExecutionProbe]
  }
}

