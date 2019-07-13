package typings
package timezoneDashSupportLib.timezoneDashSupportMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Time extends js.Object {
  var day: scala.Double
  var dayOfWeek: js.UndefOr[scala.Double] = js.undefined
  var epoch: js.UndefOr[scala.Double] = js.undefined
  var hours: scala.Double
  var milliseconds: js.UndefOr[scala.Double] = js.undefined
  var minutes: scala.Double
  var month: scala.Double
  var seconds: js.UndefOr[scala.Double] = js.undefined
  var year: scala.Double
  var zone: js.UndefOr[TimeZoneOffset] = js.undefined
}

object Time {
  @scala.inline
  def apply(
    day: scala.Double,
    hours: scala.Double,
    minutes: scala.Double,
    month: scala.Double,
    year: scala.Double,
    dayOfWeek: scala.Int | scala.Double = null,
    epoch: scala.Int | scala.Double = null,
    milliseconds: scala.Int | scala.Double = null,
    seconds: scala.Int | scala.Double = null,
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

