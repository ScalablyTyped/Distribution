package typings
package winrtLib.WindowsNs.GlobalizationNs.DateTimeFormattingNs

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
    val __obj = js.Dynamic.literal(longDate = longDate, longTime = longTime, shortDate = shortDate, shortTime = shortTime)
  
    __obj.asInstanceOf[IDateTimeFormatterStatics]
  }
}

