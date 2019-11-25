package typings.winston.libWinstonConfigMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AbstractConfigSet extends js.Object {
  var colors: AbstractConfigSetColors
  var levels: AbstractConfigSetLevels
}

object AbstractConfigSet {
  @scala.inline
  def apply(colors: AbstractConfigSetColors, levels: AbstractConfigSetLevels): AbstractConfigSet = {
    val __obj = js.Dynamic.literal(colors = colors.asInstanceOf[js.Any], levels = levels.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AbstractConfigSet]
  }
}

