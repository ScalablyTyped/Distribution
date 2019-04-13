package typings
package winstonLib.libWinstonConfigMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SyslogConfigSetLevels extends AbstractConfigSetLevels {
  var alert: scala.Double
  var crit: scala.Double
  var debug: scala.Double
  var emerg: scala.Double
  var error: scala.Double
  var info: scala.Double
  var notice: scala.Double
  var warning: scala.Double
}

object SyslogConfigSetLevels {
  @scala.inline
  def apply(
    alert: scala.Double,
    crit: scala.Double,
    debug: scala.Double,
    emerg: scala.Double,
    error: scala.Double,
    info: scala.Double,
    notice: scala.Double,
    warning: scala.Double,
    StringDictionary: org.scalablytyped.runtime.StringDictionary[scala.Double] = null
  ): SyslogConfigSetLevels = {
    val __obj = js.Dynamic.literal(alert = alert, crit = crit, debug = debug, emerg = emerg, error = error, info = info, notice = notice, warning = warning)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[SyslogConfigSetLevels]
  }
}

