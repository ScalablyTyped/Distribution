package typings.urbanairshipDashCordova.UrbanAirshipPlugin

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
  var endHour: Double
  var endMinute: Double
  var startHour: Double
  var startMinute: Double
}

object QuietTimeTimeSpan {
  @scala.inline
  def apply(endHour: Double, endMinute: Double, startHour: Double, startMinute: Double): QuietTimeTimeSpan = {
    val __obj = js.Dynamic.literal(endHour = endHour, endMinute = endMinute, startHour = startHour, startMinute = startMinute)
  
    __obj.asInstanceOf[QuietTimeTimeSpan]
  }
}

