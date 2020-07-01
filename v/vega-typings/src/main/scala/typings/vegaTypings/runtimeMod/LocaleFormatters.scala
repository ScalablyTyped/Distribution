package typings.vegaTypings.runtimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocaleFormatters extends js.Object {
  def format(spec: String): NumberFormat
  def formatFloat(spec: String): NumberFormat
  def formatPrefix(spec: String, value: Double): NumberFormat
  def formatSpan(start: Double, stop: Double, count: Double, spec: String): NumberFormat
  def timeFormat(spec: String): TimeFormat
  def timeParse(spec: String): TimeParse
  def utcFormat(spec: String): TimeFormat
  def utcParse(spec: String): TimeParse
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
}

