package typings.yogLog.mod

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
    val __obj = js.Dynamic.literal(errno = errno.asInstanceOf[js.Any], escape_msg = escape_msg.asInstanceOf[js.Any], filename_suffix = filename_suffix.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[WriteLogConfig]
  }
}

