package typings
package winstonLib.libWinstonConfigMod.winstonNs

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
    warning: scala.Double
  ): SyslogConfigSetLevels = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("alert")(alert)
    __obj.updateDynamic("crit")(crit)
    __obj.updateDynamic("debug")(debug)
    __obj.updateDynamic("emerg")(emerg)
    __obj.updateDynamic("error")(error)
    __obj.updateDynamic("info")(info)
    __obj.updateDynamic("notice")(notice)
    __obj.updateDynamic("warning")(warning)
    __obj.asInstanceOf[SyslogConfigSetLevels]
  }
}

