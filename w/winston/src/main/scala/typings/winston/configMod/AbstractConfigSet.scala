package typings.winston.configMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AbstractConfigSet extends js.Object {
  var colors: AbstractConfigSetColors = js.native
  var levels: AbstractConfigSetLevels = js.native
}

object AbstractConfigSet {
  @scala.inline
  def apply(colors: AbstractConfigSetColors, levels: AbstractConfigSetLevels): AbstractConfigSet = {
    val __obj = js.Dynamic.literal(colors = colors.asInstanceOf[js.Any], levels = levels.asInstanceOf[js.Any])
    __obj.asInstanceOf[AbstractConfigSet]
  }
  @scala.inline
  implicit class AbstractConfigSetOps[Self <: AbstractConfigSet] (val x: Self) extends AnyVal {
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
    def setColors(value: AbstractConfigSetColors): Self = this.set("colors", value.asInstanceOf[js.Any])
    @scala.inline
    def setLevels(value: AbstractConfigSetLevels): Self = this.set("levels", value.asInstanceOf[js.Any])
  }
  
}

