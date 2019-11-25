package typings.atWordpressDate

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Locale extends js.Object {
  var locale: String
  var meridiem: Anon_AM
  var months: js.Array[String]
  var monthsShort: js.Array[String]
  var relative: Anon_Future
  var weekdays: js.Array[String]
  var weekdaysShort: js.Array[String]
}

object Anon_Locale {
  @scala.inline
  def apply(
    locale: String,
    meridiem: Anon_AM,
    months: js.Array[String],
    monthsShort: js.Array[String],
    relative: Anon_Future,
    weekdays: js.Array[String],
    weekdaysShort: js.Array[String]
  ): Anon_Locale = {
    val __obj = js.Dynamic.literal(locale = locale.asInstanceOf[js.Any], meridiem = meridiem.asInstanceOf[js.Any], months = months.asInstanceOf[js.Any], monthsShort = monthsShort.asInstanceOf[js.Any], relative = relative.asInstanceOf[js.Any], weekdays = weekdays.asInstanceOf[js.Any], weekdaysShort = weekdaysShort.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Locale]
  }
}

