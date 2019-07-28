package typings.systeminformation.systeminformationMod.SysteminformationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimeData extends js.Object {
  var current: String
  var timezone: String
  var timezoneName: String
  var uptime: String
}

object TimeData {
  @scala.inline
  def apply(current: String, timezone: String, timezoneName: String, uptime: String): TimeData = {
    val __obj = js.Dynamic.literal(current = current, timezone = timezone, timezoneName = timezoneName, uptime = uptime)
  
    __obj.asInstanceOf[TimeData]
  }
}

