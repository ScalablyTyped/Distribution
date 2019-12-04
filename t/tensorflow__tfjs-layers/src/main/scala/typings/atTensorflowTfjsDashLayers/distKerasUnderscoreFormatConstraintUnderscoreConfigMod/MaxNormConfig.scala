package typings.atTensorflowTfjsDashLayers.distKerasUnderscoreFormatConstraintUnderscoreConfigMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MaxNormConfig extends js.Object {
  var axis: js.UndefOr[Double] = js.undefined
  var max_value: js.UndefOr[Double] = js.undefined
}

object MaxNormConfig {
  @scala.inline
  def apply(axis: Int | Double = null, max_value: Int | Double = null): MaxNormConfig = {
    val __obj = js.Dynamic.literal()
    if (axis != null) __obj.updateDynamic("axis")(axis.asInstanceOf[js.Any])
    if (max_value != null) __obj.updateDynamic("max_value")(max_value.asInstanceOf[js.Any])
    __obj.asInstanceOf[MaxNormConfig]
  }
}

