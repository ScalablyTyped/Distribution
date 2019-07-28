package typings.winston.libWinstonConfigMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SyslogConfigSetColors extends AbstractConfigSetColors {
  var alert: String | js.Array[String]
  var crit: String | js.Array[String]
  var debug: String | js.Array[String]
  var emerg: String | js.Array[String]
  var error: String | js.Array[String]
  var info: String | js.Array[String]
  var notice: String | js.Array[String]
  var warning: String | js.Array[String]
}

object SyslogConfigSetColors {
  @scala.inline
  def apply(
    alert: String | js.Array[String],
    crit: String | js.Array[String],
    debug: String | js.Array[String],
    emerg: String | js.Array[String],
    error: String | js.Array[String],
    info: String | js.Array[String],
    notice: String | js.Array[String],
    warning: String | js.Array[String],
    StringDictionary: StringDictionary[String | js.Array[String]] = null
  ): SyslogConfigSetColors = {
    val __obj = js.Dynamic.literal(alert = alert.asInstanceOf[js.Any], crit = crit.asInstanceOf[js.Any], debug = debug.asInstanceOf[js.Any], emerg = emerg.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], info = info.asInstanceOf[js.Any], notice = notice.asInstanceOf[js.Any], warning = warning.asInstanceOf[js.Any])
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[SyslogConfigSetColors]
  }
}

