package typings
package systeminformationLib.systeminformationMod.SysteminformationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GraphicsControllerInfo extends js.Object {
  var bus: java.lang.String
  var model: java.lang.String
  var vendor: java.lang.String
  var vram: scala.Double
  var vramDynamic: scala.Boolean
}

object GraphicsControllerInfo {
  @scala.inline
  def apply(
    bus: java.lang.String,
    model: java.lang.String,
    vendor: java.lang.String,
    vram: scala.Double,
    vramDynamic: scala.Boolean
  ): GraphicsControllerInfo = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("bus")(bus)
    __obj.updateDynamic("model")(model)
    __obj.updateDynamic("vendor")(vendor)
    __obj.updateDynamic("vram")(vram)
    __obj.updateDynamic("vramDynamic")(vramDynamic)
    __obj.asInstanceOf[GraphicsControllerInfo]
  }
}

