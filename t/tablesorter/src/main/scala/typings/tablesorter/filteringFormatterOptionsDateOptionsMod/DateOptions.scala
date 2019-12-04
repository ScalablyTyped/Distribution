package typings.tablesorter.filteringFormatterOptionsDateOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DateOptions extends js.Object {
  /**
    * A value indicating whether the filter's time-value should be set to the end of the day.
    */
  var endOfDay: js.UndefOr[Boolean] = js.undefined
}

object DateOptions {
  @scala.inline
  def apply(endOfDay: js.UndefOr[Boolean] = js.undefined): DateOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(endOfDay)) __obj.updateDynamic("endOfDay")(endOfDay.asInstanceOf[js.Any])
    __obj.asInstanceOf[DateOptions]
  }
}

