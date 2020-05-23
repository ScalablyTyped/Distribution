package typings.tensorflowTfjsLayers.constraintConfigMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MaxNormConfig extends js.Object {
  var axis: js.UndefOr[Double] = js.undefined
  var max_value: js.UndefOr[Double] = js.undefined
}

object MaxNormConfig {
  @scala.inline
  def apply(axis: js.UndefOr[Double] = js.undefined, max_value: js.UndefOr[Double] = js.undefined): MaxNormConfig = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(axis)) __obj.updateDynamic("axis")(axis.get.asInstanceOf[js.Any])
    if (!js.isUndefined(max_value)) __obj.updateDynamic("max_value")(max_value.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[MaxNormConfig]
  }
}

