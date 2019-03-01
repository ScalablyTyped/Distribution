package typings
package winstonLib.libWinstonConfigMod.winstonNs

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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("colors")(colors)
    __obj.updateDynamic("levels")(levels)
    __obj.asInstanceOf[AbstractConfigSet]
  }
}

