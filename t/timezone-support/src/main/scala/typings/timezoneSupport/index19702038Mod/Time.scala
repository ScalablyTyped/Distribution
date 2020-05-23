package typings.timezoneSupport.index19702038Mod

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
    dayOfWeek: js.UndefOr[Double] = js.undefined,
    epoch: js.UndefOr[Double] = js.undefined,
    milliseconds: js.UndefOr[Double] = js.undefined,
    seconds: js.UndefOr[Double] = js.undefined,
    zone: TimeZoneOffset = null
  ): Time = {
    val __obj = js.Dynamic.literal(day = day.asInstanceOf[js.Any], hours = hours.asInstanceOf[js.Any], minutes = minutes.asInstanceOf[js.Any], month = month.asInstanceOf[js.Any], year = year.asInstanceOf[js.Any])
    if (!js.isUndefined(dayOfWeek)) __obj.updateDynamic("dayOfWeek")(dayOfWeek.get.asInstanceOf[js.Any])
    if (!js.isUndefined(epoch)) __obj.updateDynamic("epoch")(epoch.get.asInstanceOf[js.Any])
    if (!js.isUndefined(milliseconds)) __obj.updateDynamic("milliseconds")(milliseconds.get.asInstanceOf[js.Any])
    if (!js.isUndefined(seconds)) __obj.updateDynamic("seconds")(seconds.get.asInstanceOf[js.Any])
    if (zone != null) __obj.updateDynamic("zone")(zone.asInstanceOf[js.Any])
    __obj.asInstanceOf[Time]
  }
}

