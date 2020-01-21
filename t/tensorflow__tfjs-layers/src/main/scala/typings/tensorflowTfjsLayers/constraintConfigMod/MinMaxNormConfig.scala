package typings.tensorflowTfjsLayers.constraintConfigMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MinMaxNormConfig extends js.Object {
  var axis: js.UndefOr[Double] = js.undefined
  var max_value: js.UndefOr[Double] = js.undefined
  var min_value: js.UndefOr[Double] = js.undefined
  var rate: js.UndefOr[Double] = js.undefined
}

object MinMaxNormConfig {
  @scala.inline
  def apply(
    axis: Int | Double = null,
    max_value: Int | Double = null,
    min_value: Int | Double = null,
    rate: Int | Double = null
  ): MinMaxNormConfig = {
    val __obj = js.Dynamic.literal()
    if (axis != null) __obj.updateDynamic("axis")(axis.asInstanceOf[js.Any])
    if (max_value != null) __obj.updateDynamic("max_value")(max_value.asInstanceOf[js.Any])
    if (min_value != null) __obj.updateDynamic("min_value")(min_value.asInstanceOf[js.Any])
    if (rate != null) __obj.updateDynamic("rate")(rate.asInstanceOf[js.Any])
    __obj.asInstanceOf[MinMaxNormConfig]
  }
}

