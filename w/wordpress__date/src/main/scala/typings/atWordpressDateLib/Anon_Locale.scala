package typings
package atWordpressDateLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Locale extends js.Object {
  var locale: java.lang.String
  var meridiem: Anon_AM
  var months: js.Array[java.lang.String]
  var monthsShort: js.Array[java.lang.String]
  var relative: Anon_Future
  var weekdays: js.Array[java.lang.String]
  var weekdaysShort: js.Array[java.lang.String]
}

object Anon_Locale {
  @scala.inline
  def apply(
    locale: java.lang.String,
    meridiem: Anon_AM,
    months: js.Array[java.lang.String],
    monthsShort: js.Array[java.lang.String],
    relative: Anon_Future,
    weekdays: js.Array[java.lang.String],
    weekdaysShort: js.Array[java.lang.String]
  ): Anon_Locale = {
    val __obj = js.Dynamic.literal(locale = locale, meridiem = meridiem, months = months, monthsShort = monthsShort, relative = relative, weekdays = weekdays, weekdaysShort = weekdaysShort)
  
    __obj.asInstanceOf[Anon_Locale]
  }
}

