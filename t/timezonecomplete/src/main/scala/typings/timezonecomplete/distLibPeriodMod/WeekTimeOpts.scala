package typings.timezonecomplete.distLibPeriodMod

import typings.timezonecomplete.distLibBasicsMod.WeekDay
import typings.timezonecomplete.distLibDatetimeMod.DateTime
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
    millisecond: Int | Double = null,
    minute: Int | Double = null,
    second: Int | Double = null
  ): WeekTimeOpts = {
    val __obj = js.Dynamic.literal(hour = hour.asInstanceOf[js.Any], reference = reference.asInstanceOf[js.Any], weekday = weekday.asInstanceOf[js.Any])
    if (millisecond != null) __obj.updateDynamic("millisecond")(millisecond.asInstanceOf[js.Any])
    if (minute != null) __obj.updateDynamic("minute")(minute.asInstanceOf[js.Any])
    if (second != null) __obj.updateDynamic("second")(second.asInstanceOf[js.Any])
    __obj.asInstanceOf[WeekTimeOpts]
  }
}

