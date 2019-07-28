package typings.winston

import typings.winston.libWinstonConfigMod.SyslogConfigSetColors
import typings.winston.libWinstonConfigMod.SyslogConfigSetLevels
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ColorsLevelsSyslogConfigSetColors extends js.Object {
  var colors: SyslogConfigSetColors
  var levels: SyslogConfigSetLevels
}

object Anon_ColorsLevelsSyslogConfigSetColors {
  @scala.inline
  def apply(colors: SyslogConfigSetColors, levels: SyslogConfigSetLevels): Anon_ColorsLevelsSyslogConfigSetColors = {
    val __obj = js.Dynamic.literal(colors = colors, levels = levels)
  
    __obj.asInstanceOf[Anon_ColorsLevelsSyslogConfigSetColors]
  }
}

