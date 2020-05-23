package typings.timezonecomplete.periodMod

import typings.timezonecomplete.basicsMod.WeekDay
import typings.timezonecomplete.datetimeMod.DateTime
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WeekTimeOpts extends js.Object {
  /**
    * Desired time (hours 0-23)
    */
  var hour: Double
  /**
    * Desired time (milliseconds 0-999)
    */
  var millisecond: js.UndefOr[Double] = js.undefined
  /**
    * Desired time (minutes 0-59)
    */
  var minute: js.UndefOr[Double] = js.undefined
  /**
    * Timestamp to use as a basis
    */
  var reference: DateTime
  /**
    * Desired time (seconds 0-59)
    */
  var second: js.UndefOr[Double] = js.undefined
  /**
    * Desired day of week
    */
  var weekday: WeekDay
}

object WeekTimeOpts {
  @scala.inline
  def apply(
    hour: Double,
    reference: DateTime,
    weekday: WeekDay,
    millisecond: js.UndefOr[Double] = js.undefined,
    minute: js.UndefOr[Double] = js.undefined,
    second: js.UndefOr[Double] = js.undefined
  ): WeekTimeOpts = {
    val __obj = js.Dynamic.literal(hour = hour.asInstanceOf[js.Any], reference = reference.asInstanceOf[js.Any], weekday = weekday.asInstanceOf[js.Any])
    if (!js.isUndefined(millisecond)) __obj.updateDynamic("millisecond")(millisecond.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minute)) __obj.updateDynamic("minute")(minute.get.asInstanceOf[js.Any])
    if (!js.isUndefined(second)) __obj.updateDynamic("second")(second.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[WeekTimeOpts]
  }
}

