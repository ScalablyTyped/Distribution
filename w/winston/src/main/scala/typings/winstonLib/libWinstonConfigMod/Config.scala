package typings
package winstonLib.libWinstonConfigMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Config extends js.Object {
  var allColors: AbstractConfigSetColors
  var cli: winstonLib.Anon_Colors
  var npm: winstonLib.Anon_ColorsLevels
  var syslog: winstonLib.Anon_ColorsLevelsSyslogConfigSetColors
  def addColors(colors: AbstractConfigSetColors): scala.Unit
}

object Config {
  @scala.inline
  def apply(
    addColors: AbstractConfigSetColors => scala.Unit,
    allColors: AbstractConfigSetColors,
    cli: winstonLib.Anon_Colors,
    npm: winstonLib.Anon_ColorsLevels,
    syslog: winstonLib.Anon_ColorsLevelsSyslogConfigSetColors
  ): Config = {
    val __obj = js.Dynamic.literal(addColors = js.Any.fromFunction1(addColors), allColors = allColors, cli = cli, npm = npm, syslog = syslog)
  
    __obj.asInstanceOf[Config]
  }
}

