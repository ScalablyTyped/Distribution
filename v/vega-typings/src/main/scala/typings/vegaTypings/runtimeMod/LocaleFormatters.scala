package typings.vegaTypings.runtimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LocaleFormatters extends js.Object {
  def format(spec: String): NumberFormat = js.native
  def formatFloat(spec: String): NumberFormat = js.native
  def formatPrefix(spec: String, value: Double): NumberFormat = js.native
  def formatSpan(start: Double, stop: Double, count: Double, spec: String): NumberFormat = js.native
  def timeFormat(spec: String): TimeFormat = js.native
  def timeParse(spec: String): TimeParse = js.native
  def utcFormat(spec: String): TimeFormat = js.native
  def utcParse(spec: String): TimeParse = js.native
}

object LocaleFormatters {
  @scala.inline
  def apply(
    format: String => NumberFormat,
    formatFloat: String => NumberFormat,
    formatPrefix: (String, Double) => NumberFormat,
    formatSpan: (Double, Double, Double, String) => NumberFormat,
    timeFormat: String => TimeFormat,
    timeParse: String => TimeParse,
    utcFormat: String => TimeFormat,
    utcParse: String => TimeParse
  ): LocaleFormatters = {
    val __obj = js.Dynamic.literal(format = js.Any.fromFunction1(format), formatFloat = js.Any.fromFunction1(formatFloat), formatPrefix = js.Any.fromFunction2(formatPrefix), formatSpan = js.Any.fromFunction4(formatSpan), timeFormat = js.Any.fromFunction1(timeFormat), timeParse = js.Any.fromFunction1(timeParse), utcFormat = js.Any.fromFunction1(utcFormat), utcParse = js.Any.fromFunction1(utcParse))
    __obj.asInstanceOf[LocaleFormatters]
  }
  @scala.inline
  implicit class LocaleFormattersOps[Self <: LocaleFormatters] (val x: Self) extends AnyVal {
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
    def setFormat(value: String => NumberFormat): Self = this.set("format", js.Any.fromFunction1(value))
    @scala.inline
    def setFormatFloat(value: String => NumberFormat): Self = this.set("formatFloat", js.Any.fromFunction1(value))
    @scala.inline
    def setFormatPrefix(value: (String, Double) => NumberFormat): Self = this.set("formatPrefix", js.Any.fromFunction2(value))
    @scala.inline
    def setFormatSpan(value: (Double, Double, Double, String) => NumberFormat): Self = this.set("formatSpan", js.Any.fromFunction4(value))
    @scala.inline
    def setTimeFormat(value: String => TimeFormat): Self = this.set("timeFormat", js.Any.fromFunction1(value))
    @scala.inline
    def setTimeParse(value: String => TimeParse): Self = this.set("timeParse", js.Any.fromFunction1(value))
    @scala.inline
    def setUtcFormat(value: String => TimeFormat): Self = this.set("utcFormat", js.Any.fromFunction1(value))
    @scala.inline
    def setUtcParse(value: String => TimeParse): Self = this.set("utcParse", js.Any.fromFunction1(value))
  }
  
}

