package typings.winrt.Windows.Globalization.DateTimeFormatting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDateTimeFormatterStatics extends js.Object {
  var longDate: DateTimeFormatter
  var longTime: DateTimeFormatter
  var shortDate: DateTimeFormatter
  var shortTime: DateTimeFormatter
}

object IDateTimeFormatterStatics {
  @scala.inline
  def apply(
    longDate: DateTimeFormatter,
    longTime: DateTimeFormatter,
    shortDate: DateTimeFormatter,
    shortTime: DateTimeFormatter
  ): IDateTimeFormatterStatics = {
    val __obj = js.Dynamic.literal(longDate = longDate.asInstanceOf[js.Any], longTime = longTime.asInstanceOf[js.Any], shortDate = shortDate.asInstanceOf[js.Any], shortTime = shortTime.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IDateTimeFormatterStatics]
  }
}

