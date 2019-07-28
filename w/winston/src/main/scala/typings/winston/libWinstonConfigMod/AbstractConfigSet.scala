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
    val __obj = js.Dynamic.literal(colors = colors, levels = levels)
  
    __obj.asInstanceOf[AbstractConfigSet]
  }
}

