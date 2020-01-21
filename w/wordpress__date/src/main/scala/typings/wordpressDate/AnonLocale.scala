package typings.wordpressDate

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLocale extends js.Object {
  var locale: String
  var meridiem: AnonAM
  var months: js.Array[String]
  var monthsShort: js.Array[String]
  var relative: AnonFuture
  var weekdays: js.Array[String]
  var weekdaysShort: js.Array[String]
}

object AnonLocale {
  @scala.inline
  def apply(
    locale: String,
    meridiem: AnonAM,
    months: js.Array[String],
    monthsShort: js.Array[String],
    relative: AnonFuture,
    weekdays: js.Array[String],
    weekdaysShort: js.Array[String]
  ): AnonLocale = {
    val __obj = js.Dynamic.literal(locale = locale.asInstanceOf[js.Any], meridiem = meridiem.asInstanceOf[js.Any], months = months.asInstanceOf[js.Any], monthsShort = monthsShort.asInstanceOf[js.Any], relative = relative.asInstanceOf[js.Any], weekdays = weekdays.asInstanceOf[js.Any], weekdaysShort = weekdaysShort.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonLocale]
  }
}

