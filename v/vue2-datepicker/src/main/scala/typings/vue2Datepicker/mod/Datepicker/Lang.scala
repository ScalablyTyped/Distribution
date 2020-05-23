package typings.vue2Datepicker.mod.Datepicker

import typings.vue2Datepicker.anon.FirstDayOfWeek
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Lang extends js.Object {
  var days: js.UndefOr[js.Array[String]] = js.undefined
  var formatLocale: FirstDayOfWeek
  var monthBeforeYear: Boolean
  var monthFormat: String
  var months: js.UndefOr[js.Array[String]] = js.undefined
  var yearFormat: String
}

object Lang {
  @scala.inline
  def apply(
    formatLocale: FirstDayOfWeek,
    monthBeforeYear: Boolean,
    monthFormat: String,
    yearFormat: String,
    days: js.Array[String] = null,
    months: js.Array[String] = null
  ): Lang = {
    val __obj = js.Dynamic.literal(formatLocale = formatLocale.asInstanceOf[js.Any], monthBeforeYear = monthBeforeYear.asInstanceOf[js.Any], monthFormat = monthFormat.asInstanceOf[js.Any], yearFormat = yearFormat.asInstanceOf[js.Any])
    if (days != null) __obj.updateDynamic("days")(days.asInstanceOf[js.Any])
    if (months != null) __obj.updateDynamic("months")(months.asInstanceOf[js.Any])
    __obj.asInstanceOf[Lang]
  }
}

