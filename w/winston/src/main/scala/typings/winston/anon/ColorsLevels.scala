package typings.winston.anon

import typings.winston.configMod.SyslogConfigSetColors
import typings.winston.configMod.SyslogConfigSetLevels
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ColorsLevels extends js.Object {
  var colors: SyslogConfigSetColors = js.native
  var levels: SyslogConfigSetLevels = js.native
}

object ColorsLevels {
  @scala.inline
  def apply(colors: SyslogConfigSetColors, levels: SyslogConfigSetLevels): ColorsLevels = {
    val __obj = js.Dynamic.literal(colors = colors.asInstanceOf[js.Any], levels = levels.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColorsLevels]
  }
  @scala.inline
  implicit class ColorsLevelsOps[Self <: ColorsLevels] (val x: Self) extends AnyVal {
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
    def setColors(value: SyslogConfigSetColors): Self = this.set("colors", value.asInstanceOf[js.Any])
    @scala.inline
    def setLevels(value: SyslogConfigSetLevels): Self = this.set("levels", value.asInstanceOf[js.Any])
  }
  
}

