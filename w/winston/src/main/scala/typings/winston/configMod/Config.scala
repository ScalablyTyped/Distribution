package typings.winston.configMod

import typings.winston.AnonColors
import typings.winston.AnonColorsLevels
import typings.winston.AnonLevels
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Config extends js.Object {
  var allColors: AbstractConfigSetColors
  var cli: AnonColors
  var npm: AnonLevels
  var syslog: AnonColorsLevels
  def addColors(colors: AbstractConfigSetColors): Unit
}

object Config {
  @scala.inline
  def apply(
    addColors: AbstractConfigSetColors => Unit,
    allColors: AbstractConfigSetColors,
    cli: AnonColors,
    npm: AnonLevels,
    syslog: AnonColorsLevels
  ): Config = {
    val __obj = js.Dynamic.literal(addColors = js.Any.fromFunction1(addColors), allColors = allColors.asInstanceOf[js.Any], cli = cli.asInstanceOf[js.Any], npm = npm.asInstanceOf[js.Any], syslog = syslog.asInstanceOf[js.Any])
    __obj.asInstanceOf[Config]
  }
}

