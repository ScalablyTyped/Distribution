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
    axis: js.UndefOr[Double] = js.undefined,
    max_value: js.UndefOr[Double] = js.undefined,
    min_value: js.UndefOr[Double] = js.undefined,
    rate: js.UndefOr[Double] = js.undefined
  ): MinMaxNormConfig = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(axis)) __obj.updateDynamic("axis")(axis.get.asInstanceOf[js.Any])
    if (!js.isUndefined(max_value)) __obj.updateDynamic("max_value")(max_value.get.asInstanceOf[js.Any])
    if (!js.isUndefined(min_value)) __obj.updateDynamic("min_value")(min_value.get.asInstanceOf[js.Any])
    if (!js.isUndefined(rate)) __obj.updateDynamic("rate")(rate.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[MinMaxNormConfig]
  }
}

