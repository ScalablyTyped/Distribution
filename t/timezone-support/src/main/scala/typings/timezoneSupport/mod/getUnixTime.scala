package typings.timezoneSupport.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("timezone-support", "getUnixTime")
@js.native
object getUnixTime extends js.Object {
  def apply(time: Time): Double = js.native
  def apply(time: Time, timeZone: TimeZoneInfo): Double = js.native
}

