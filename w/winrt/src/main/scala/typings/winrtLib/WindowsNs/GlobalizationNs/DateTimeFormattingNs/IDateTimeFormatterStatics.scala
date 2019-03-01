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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("longDate")(longDate)
    __obj.updateDynamic("longTime")(longTime)
    __obj.updateDynamic("shortDate")(shortDate)
    __obj.updateDynamic("shortTime")(shortTime)
    __obj.asInstanceOf[IDateTimeFormatterStatics]
  }
}

