package typings.tablesorter.intervalOptionsMod

import typings.tablesorter.numericOptionsMod.NumericOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IntervalOptions extends NumericOptions {
  /**
    * The interval of the control.
    */
  var step: js.UndefOr[Double] = js.undefined
}

object IntervalOptions {
  @scala.inline
  def apply(
    max: js.UndefOr[Double] = js.undefined,
    min: js.UndefOr[Double] = js.undefined,
    step: js.UndefOr[Double] = js.undefined
  ): IntervalOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(max)) __obj.updateDynamic("max")(max.get.asInstanceOf[js.Any])
    if (!js.isUndefined(min)) __obj.updateDynamic("min")(min.get.asInstanceOf[js.Any])
    if (!js.isUndefined(step)) __obj.updateDynamic("step")(step.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IntervalOptions]
  }
}

