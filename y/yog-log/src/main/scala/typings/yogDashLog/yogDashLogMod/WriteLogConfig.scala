package typings.yogDashLog.yogDashLogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WriteLogConfig extends js.Object {
  var errno: Double
  var escape_msg: Boolean
  var filename_suffix: String
}

object WriteLogConfig {
  @scala.inline
  def apply(errno: Double, escape_msg: Boolean, filename_suffix: String): WriteLogConfig = {
    val __obj = js.Dynamic.literal(errno = errno, escape_msg = escape_msg, filename_suffix = filename_suffix)
  
    __obj.asInstanceOf[WriteLogConfig]
  }
}

