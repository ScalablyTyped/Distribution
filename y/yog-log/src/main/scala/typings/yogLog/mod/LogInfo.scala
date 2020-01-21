package typings.yogLog.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LogInfo extends js.Object {
  var msg: String
}

object LogInfo {
  @scala.inline
  def apply(msg: String): LogInfo = {
    val __obj = js.Dynamic.literal(msg = msg.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[LogInfo]
  }
}

