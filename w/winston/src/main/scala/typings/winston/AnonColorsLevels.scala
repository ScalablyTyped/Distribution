package typings.winston

import typings.winston.configMod.SyslogConfigSetColors
import typings.winston.configMod.SyslogConfigSetLevels
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonColorsLevels extends js.Object {
  var colors: SyslogConfigSetColors
  var levels: SyslogConfigSetLevels
}

object AnonColorsLevels {
  @scala.inline
  def apply(colors: SyslogConfigSetColors, levels: SyslogConfigSetLevels): AnonColorsLevels = {
    val __obj = js.Dynamic.literal(colors = colors.asInstanceOf[js.Any], levels = levels.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonColorsLevels]
  }
}

