package typings.winston.libWinstonConfigMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SyslogConfigSetLevels extends AbstractConfigSetLevels {
  var alert: Double
  var crit: Double
  var debug: Double
  var emerg: Double
  var error: Double
  var info: Double
  var notice: Double
  var warning: Double
}

object SyslogConfigSetLevels {
  @scala.inline
  def apply(
    alert: Double,
    crit: Double,
    debug: Double,
    emerg: Double,
    error: Double,
    info: Double,
    notice: Double,
    warning: Double,
    StringDictionary: StringDictionary[Double] = null
  ): SyslogConfigSetLevels = {
    val __obj = js.Dynamic.literal(alert = alert.asInstanceOf[js.Any], crit = crit.asInstanceOf[js.Any], debug = debug.asInstanceOf[js.Any], emerg = emerg.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], info = info.asInstanceOf[js.Any], notice = notice.asInstanceOf[js.Any], warning = warning.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[SyslogConfigSetLevels]
  }
}

