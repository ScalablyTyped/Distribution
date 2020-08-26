package typings.winston.configMod

import typings.winston.anon.Colors
import typings.winston.anon.ColorsLevels
import typings.winston.anon.Levels
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Config extends js.Object {
  var allColors: AbstractConfigSetColors = js.native
  var cli: Colors = js.native
  var npm: Levels = js.native
  var syslog: ColorsLevels = js.native
  def addColors(colors: AbstractConfigSetColors): Unit = js.native
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
  @scala.inline
  implicit class ConfigOps[Self <: Config] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAddColors(value: AbstractConfigSetColors => Unit): Self = this.set("addColors", js.Any.fromFunction1(value))
    @scala.inline
    def setAllColors(value: AbstractConfigSetColors): Self = this.set("allColors", value.asInstanceOf[js.Any])
    @scala.inline
    def setCli(value: Colors): Self = this.set("cli", value.asInstanceOf[js.Any])
    @scala.inline
    def setNpm(value: Levels): Self = this.set("npm", value.asInstanceOf[js.Any])
    @scala.inline
    def setSyslog(value: ColorsLevels): Self = this.set("syslog", value.asInstanceOf[js.Any])
  }
  
}

