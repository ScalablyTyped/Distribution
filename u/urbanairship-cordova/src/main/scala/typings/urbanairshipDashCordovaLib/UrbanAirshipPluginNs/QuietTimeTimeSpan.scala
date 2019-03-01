package typings
package urbanairshipDashCordovaLib.UrbanAirshipPluginNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a timespan during which notifications should be silenced.
  *
  * For example, 10PM - 6AM would be:
  * { startHour: 22, startMinute: 0, endHour: 6, endMinute: 0 }
  */
trait QuietTimeTimeSpan extends js.Object {
  var endHour: scala.Double
  var endMinute: scala.Double
  var startHour: scala.Double
  var startMinute: scala.Double
}

object QuietTimeTimeSpan {
  @scala.inline
  def apply(endHour: scala.Double, endMinute: scala.Double, startHour: scala.Double, startMinute: scala.Double): QuietTimeTimeSpan = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("endHour")(endHour)
    __obj.updateDynamic("endMinute")(endMinute)
    __obj.updateDynamic("startHour")(startHour)
    __obj.updateDynamic("startMinute")(startMinute)
    __obj.asInstanceOf[QuietTimeTimeSpan]
  }
}

