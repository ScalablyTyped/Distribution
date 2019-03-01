package typings
package yogDashLogLib.yogDashLogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WriteLogConfig extends js.Object {
  var errno: scala.Double
  var escape_msg: scala.Boolean
  var filename_suffix: java.lang.String
}

object WriteLogConfig {
  @scala.inline
  def apply(errno: scala.Double, escape_msg: scala.Boolean, filename_suffix: java.lang.String): WriteLogConfig = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("errno")(errno)
    __obj.updateDynamic("escape_msg")(escape_msg)
    __obj.updateDynamic("filename_suffix")(filename_suffix)
    __obj.asInstanceOf[WriteLogConfig]
  }
}

