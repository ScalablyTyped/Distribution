package typings.systeminformation.mod.Systeminformation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// 1. General
trait TimeData extends js.Object {
  var current: String
  var timezone: String
  var timezoneName: String
  var uptime: String
}

object TimeData {
  @scala.inline
  def apply(current: String, timezone: String, timezoneName: String, uptime: String): TimeData = {
    val __obj = js.Dynamic.literal(current = current.asInstanceOf[js.Any], timezone = timezone.asInstanceOf[js.Any], timezoneName = timezoneName.asInstanceOf[js.Any], uptime = uptime.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimeData]
  }
}

