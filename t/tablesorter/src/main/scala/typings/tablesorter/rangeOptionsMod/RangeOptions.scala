package typings.tablesorter.rangeOptionsMod

import typings.tablesorter.intervalOptionsMod.IntervalOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RangeOptions extends IntervalOptions {
  /**
    * The text indicating the whole range.
    */
  var allText: js.UndefOr[String] = js.undefined
}

object RangeOptions {
  @scala.inline
  def apply(
    allText: String = null,
    max: js.UndefOr[Double] = js.undefined,
    min: js.UndefOr[Double] = js.undefined,
    step: js.UndefOr[Double] = js.undefined
  ): RangeOptions = {
    val __obj = js.Dynamic.literal()
    if (allText != null) __obj.updateDynamic("allText")(allText.asInstanceOf[js.Any])
    if (!js.isUndefined(max)) __obj.updateDynamic("max")(max.get.asInstanceOf[js.Any])
    if (!js.isUndefined(min)) __obj.updateDynamic("min")(min.get.asInstanceOf[js.Any])
    if (!js.isUndefined(step)) __obj.updateDynamic("step")(step.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[RangeOptions]
  }
}

