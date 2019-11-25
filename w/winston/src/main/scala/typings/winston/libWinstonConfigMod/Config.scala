package typings.winston.libWinstonConfigMod

import typings.winston.Anon_Colors
import typings.winston.Anon_ColorsLevels
import typings.winston.Anon_ColorsLevelsSyslogConfigSetColors
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Config extends js.Object {
  var allColors: AbstractConfigSetColors
  var cli: Anon_Colors
  var npm: Anon_ColorsLevels
  var syslog: Anon_ColorsLevelsSyslogConfigSetColors
  def addColors(colors: AbstractConfigSetColors): Unit
}

object Config {
  @scala.inline
  def apply(
    addColors: AbstractConfigSetColors => Unit,
    allColors: AbstractConfigSetColors,
    cli: Anon_Colors,
    npm: Anon_ColorsLevels,
    syslog: Anon_ColorsLevelsSyslogConfigSetColors
  ): Config = {
    val __obj = js.Dynamic.literal(addColors = js.Any.fromFunction1(addColors), allColors = allColors.asInstanceOf[js.Any], cli = cli.asInstanceOf[js.Any], npm = npm.asInstanceOf[js.Any], syslog = syslog.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Config]
  }
}

