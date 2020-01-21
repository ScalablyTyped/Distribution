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
    max: Int | Double = null,
    min: Int | Double = null,
    step: Int | Double = null
  ): RangeOptions = {
    val __obj = js.Dynamic.literal()
    if (allText != null) __obj.updateDynamic("allText")(allText.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (step != null) __obj.updateDynamic("step")(step.asInstanceOf[js.Any])
    __obj.asInstanceOf[RangeOptions]
  }
}

