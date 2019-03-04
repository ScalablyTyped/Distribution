package typings
package yogDashLogLib.yogDashLogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LogInfo extends js.Object {
  var msg: java.lang.String
}

object LogInfo {
  @scala.inline
  def apply(msg: java.lang.String): LogInfo = {
    val __obj = js.Dynamic.literal(msg = msg)
  
    __obj.asInstanceOf[LogInfo]
  }
}

