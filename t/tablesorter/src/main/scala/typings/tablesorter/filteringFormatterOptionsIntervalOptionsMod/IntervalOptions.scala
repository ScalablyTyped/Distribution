package typings.tablesorter.filteringFormatterOptionsIntervalOptionsMod

import typings.tablesorter.filteringFormatterOptionsNumericOptionsMod.NumericOptions
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
  def apply(max: Int | Double = null, min: Int | Double = null, step: Int | Double = null): IntervalOptions = {
    val __obj = js.Dynamic.literal()
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (step != null) __obj.updateDynamic("step")(step.asInstanceOf[js.Any])
    __obj.asInstanceOf[IntervalOptions]
  }
}

