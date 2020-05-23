package typings.wordpressDate.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Locale extends js.Object {
  var locale: String
  var meridiem: AM
  var months: js.Array[String]
  var monthsShort: js.Array[String]
  var relative: Future
  var weekdays: js.Array[String]
  var weekdaysShort: js.Array[String]
}

object Locale {
  @scala.inline
  def apply(
    locale: String,
    meridiem: AM,
    months: js.Array[String],
    monthsShort: js.Array[String],
    relative: Future,
    weekdays: js.Array[String],
    weekdaysShort: js.Array[String]
  ): Locale = {
    val __obj = js.Dynamic.literal(locale = locale.asInstanceOf[js.Any], meridiem = meridiem.asInstanceOf[js.Any], months = months.asInstanceOf[js.Any], monthsShort = monthsShort.asInstanceOf[js.Any], relative = relative.asInstanceOf[js.Any], weekdays = weekdays.asInstanceOf[js.Any], weekdaysShort = weekdaysShort.asInstanceOf[js.Any])
    __obj.asInstanceOf[Locale]
  }
}

