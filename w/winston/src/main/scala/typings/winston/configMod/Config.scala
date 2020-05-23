package typings.winston.configMod

import typings.winston.anon.Colors
import typings.winston.anon.ColorsLevels
import typings.winston.anon.Levels
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Config extends js.Object {
  var allColors: AbstractConfigSetColors
  var cli: Colors
  var npm: Levels
  var syslog: ColorsLevels
  def addColors(colors: AbstractConfigSetColors): Unit
}

object Config {
  @scala.inline
  def apply(
    addColors: AbstractConfigSetColors => Unit,
    allColors: AbstractConfigSetColors,
    cli: Colors,
    npm: Levels,
    syslog: ColorsLevels
  ): Config = {
    val __obj = js.Dynamic.literal(addColors = js.Any.fromFunction1(addColors), allColors = allColors.asInstanceOf[js.Any], cli = cli.asInstanceOf[js.Any], npm = npm.asInstanceOf[js.Any], syslog = syslog.asInstanceOf[js.Any])
    __obj.asInstanceOf[Config]
  }
}

