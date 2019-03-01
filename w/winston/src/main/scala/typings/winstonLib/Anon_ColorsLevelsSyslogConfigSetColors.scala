package typings
package winstonLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ColorsLevelsSyslogConfigSetColors extends js.Object {
  var colors: winstonLib.libWinstonConfigMod.winstonNs.SyslogConfigSetColors
  var levels: winstonLib.libWinstonConfigMod.winstonNs.SyslogConfigSetLevels
}

object Anon_ColorsLevelsSyslogConfigSetColors {
  @scala.inline
  def apply(
    colors: winstonLib.libWinstonConfigMod.winstonNs.SyslogConfigSetColors,
    levels: winstonLib.libWinstonConfigMod.winstonNs.SyslogConfigSetLevels
  ): Anon_ColorsLevelsSyslogConfigSetColors = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("colors")(colors)
    __obj.updateDynamic("levels")(levels)
    __obj.asInstanceOf[Anon_ColorsLevelsSyslogConfigSetColors]
  }
}

