package typings
package winstonLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ColorsLevelsSyslogConfigSetColors extends js.Object {
  var colors: winstonLib.libWinstonConfigMod.SyslogConfigSetColors
  var levels: winstonLib.libWinstonConfigMod.SyslogConfigSetLevels
}

object Anon_ColorsLevelsSyslogConfigSetColors {
  @scala.inline
  def apply(
    colors: winstonLib.libWinstonConfigMod.SyslogConfigSetColors,
    levels: winstonLib.libWinstonConfigMod.SyslogConfigSetLevels
  ): Anon_ColorsLevelsSyslogConfigSetColors = {
    val __obj = js.Dynamic.literal(colors = colors, levels = levels)
  
    __obj.asInstanceOf[Anon_ColorsLevelsSyslogConfigSetColors]
  }
}

