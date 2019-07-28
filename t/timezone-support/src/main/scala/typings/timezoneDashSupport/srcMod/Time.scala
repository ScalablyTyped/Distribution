package typings.timezoneDashSupport.srcMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Time extends js.Object {
  var day: Double
  var dayOfWeek: js.UndefOr[Double] = js.undefined
  var epoch: js.UndefOr[Double] = js.undefined
  var hours: Double
  var milliseconds: js.UndefOr[Double] = js.undefined
  var minutes: Double
  var month: Double
  var seconds: js.UndefOr[Double] = js.undefined
  var year: Double
  var zone: js.UndefOr[TimeZoneOffset] = js.undefined
}

object Time {
  @scala.inline
  def apply(
    day: Double,
    hours: Double,
    minutes: Double,
    month: Double,
    year: Double,
    dayOfWeek: Int | Double = null,
    epoch: Int | Double = null,
    milliseconds: Int | Double = null,
    seconds: Int | Double = null,
    zone: TimeZoneOffset = null
  ): Time = {
    val __obj = js.Dynamic.literal(day = day, hours = hours, minutes = minutes, month = month, year = year)
    if (dayOfWeek != null) __obj.updateDynamic("dayOfWeek")(dayOfWeek.asInstanceOf[js.Any])
    if (epoch != null) __obj.updateDynamic("epoch")(epoch.asInstanceOf[js.Any])
    if (milliseconds != null) __obj.updateDynamic("milliseconds")(milliseconds.asInstanceOf[js.Any])
    if (seconds != null) __obj.updateDynamic("seconds")(seconds.asInstanceOf[js.Any])
    if (zone != null) __obj.updateDynamic("zone")(zone)
    __obj.asInstanceOf[Time]
  }
}

