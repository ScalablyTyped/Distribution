package typings.ultraStrftime.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Locale extends js.Object {
  var AM: String = js.native
  var PM: String = js.native
  var am: String = js.native
  var days: js.Array[String] = js.native
  var formats: LocaleFormats = js.native
  var months: js.Array[String] = js.native
  var pm: String = js.native
  var shortDays: js.Array[String] = js.native
  var shortMonths: js.Array[String] = js.native
}

object Locale {
  @scala.inline
  def apply(
    AM: String,
    PM: String,
    am: String,
    days: js.Array[String],
    formats: LocaleFormats,
    months: js.Array[String],
    pm: String,
    shortDays: js.Array[String],
    shortMonths: js.Array[String]
  ): Locale = {
    val __obj = js.Dynamic.literal(AM = AM.asInstanceOf[js.Any], PM = PM.asInstanceOf[js.Any], am = am.asInstanceOf[js.Any], days = days.asInstanceOf[js.Any], formats = formats.asInstanceOf[js.Any], months = months.asInstanceOf[js.Any], pm = pm.asInstanceOf[js.Any], shortDays = shortDays.asInstanceOf[js.Any], shortMonths = shortMonths.asInstanceOf[js.Any])
    __obj.asInstanceOf[Locale]
  }
  @scala.inline
  implicit class LocaleOps[Self <: Locale] (val x: Self) extends AnyVal {
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
    def setAM(value: String): Self = this.set("AM", value.asInstanceOf[js.Any])
    @scala.inline
    def setPM(value: String): Self = this.set("PM", value.asInstanceOf[js.Any])
    @scala.inline
    def setDaysVarargs(value: String*): Self = this.set("days", js.Array(value :_*))
    @scala.inline
    def setDays(value: js.Array[String]): Self = this.set("days", value.asInstanceOf[js.Any])
    @scala.inline
    def setFormats(value: LocaleFormats): Self = this.set("formats", value.asInstanceOf[js.Any])
    @scala.inline
    def setMonthsVarargs(value: String*): Self = this.set("months", js.Array(value :_*))
    @scala.inline
    def setMonths(value: js.Array[String]): Self = this.set("months", value.asInstanceOf[js.Any])
    @scala.inline
    def setShortDaysVarargs(value: String*): Self = this.set("shortDays", js.Array(value :_*))
    @scala.inline
    def setShortDays(value: js.Array[String]): Self = this.set("shortDays", value.asInstanceOf[js.Any])
    @scala.inline
    def setShortMonthsVarargs(value: String*): Self = this.set("shortMonths", js.Array(value :_*))
    @scala.inline
    def setShortMonths(value: js.Array[String]): Self = this.set("shortMonths", value.asInstanceOf[js.Any])
  }
  
}

