package typings
package winstonLib.libWinstonConfigMod.winstonNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SyslogConfigSetColors extends AbstractConfigSetColors {
  var alert: java.lang.String | js.Array[java.lang.String]
  var crit: java.lang.String | js.Array[java.lang.String]
  var debug: java.lang.String | js.Array[java.lang.String]
  var emerg: java.lang.String | js.Array[java.lang.String]
  var error: java.lang.String | js.Array[java.lang.String]
  var info: java.lang.String | js.Array[java.lang.String]
  var notice: java.lang.String | js.Array[java.lang.String]
  var warning: java.lang.String | js.Array[java.lang.String]
}

object SyslogConfigSetColors {
  @scala.inline
  def apply(
    alert: java.lang.String | js.Array[java.lang.String],
    crit: java.lang.String | js.Array[java.lang.String],
    debug: java.lang.String | js.Array[java.lang.String],
    emerg: java.lang.String | js.Array[java.lang.String],
    error: java.lang.String | js.Array[java.lang.String],
    info: java.lang.String | js.Array[java.lang.String],
    notice: java.lang.String | js.Array[java.lang.String],
    warning: java.lang.String | js.Array[java.lang.String]
  ): SyslogConfigSetColors = {
    val __obj = js.Dynamic.literal(alert = alert.asInstanceOf[js.Any], crit = crit.asInstanceOf[js.Any], debug = debug.asInstanceOf[js.Any], emerg = emerg.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], info = info.asInstanceOf[js.Any], notice = notice.asInstanceOf[js.Any], warning = warning.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SyslogConfigSetColors]
  }
}

