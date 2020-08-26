package typings.vue2Datepicker.mod.Datepicker

import typings.vue2Datepicker.anon.FirstDayOfWeek
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Lang extends js.Object {
  var days: js.UndefOr[js.Array[String]] = js.native
  var formatLocale: FirstDayOfWeek = js.native
  var monthBeforeYear: Boolean = js.native
  var monthFormat: String = js.native
  var months: js.UndefOr[js.Array[String]] = js.native
  var yearFormat: String = js.native
}

object Lang {
  @scala.inline
  def apply(formatLocale: FirstDayOfWeek, monthBeforeYear: Boolean, monthFormat: String, yearFormat: String): Lang = {
    val __obj = js.Dynamic.literal(formatLocale = formatLocale.asInstanceOf[js.Any], monthBeforeYear = monthBeforeYear.asInstanceOf[js.Any], monthFormat = monthFormat.asInstanceOf[js.Any], yearFormat = yearFormat.asInstanceOf[js.Any])
    __obj.asInstanceOf[Lang]
  }
  @scala.inline
  implicit class LangOps[Self <: Lang] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setFormatLocale(value: FirstDayOfWeek): Self = this.set("formatLocale", value.asInstanceOf[js.Any])
    @scala.inline
    def setMonthBeforeYear(value: Boolean): Self = this.set("monthBeforeYear", value.asInstanceOf[js.Any])
    @scala.inline
    def setMonthFormat(value: String): Self = this.set("monthFormat", value.asInstanceOf[js.Any])
    @scala.inline
    def setYearFormat(value: String): Self = this.set("yearFormat", value.asInstanceOf[js.Any])
    @scala.inline
    def setDaysVarargs(value: String*): Self = this.set("days", js.Array(value :_*))
    @scala.inline
    def setDays(value: js.Array[String]): Self = this.set("days", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDays: Self = this.set("days", js.undefined)
    @scala.inline
    def setMonthsVarargs(value: String*): Self = this.set("months", js.Array(value :_*))
    @scala.inline
    def setMonths(value: js.Array[String]): Self = this.set("months", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMonths: Self = this.set("months", js.undefined)
  }
  
}

