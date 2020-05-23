package typings.titanium

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Dictionary containing `daysOfWeek` and `week`.
  */
trait daysOfTheWeekDictionary extends js.Object {
  /**
    * The day of the week. Values are from 1 to 7, with Sunday being 1.
    */
  var daysOfWeek: js.UndefOr[Double] = js.undefined
  /**
    * The week number of the day of the week.
    * Values range from -53 to 53. A negative value indicates a value from the end of
    * the range. 0 indicates the week number is irrelevant.
    */
  var week: js.UndefOr[Double] = js.undefined
}

object daysOfTheWeekDictionary {
  @scala.inline
  def apply(daysOfWeek: js.UndefOr[Double] = js.undefined, week: js.UndefOr[Double] = js.undefined): daysOfTheWeekDictionary = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(daysOfWeek)) __obj.updateDynamic("daysOfWeek")(daysOfWeek.get.asInstanceOf[js.Any])
    if (!js.isUndefined(week)) __obj.updateDynamic("week")(week.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[daysOfTheWeekDictionary]
  }
}

