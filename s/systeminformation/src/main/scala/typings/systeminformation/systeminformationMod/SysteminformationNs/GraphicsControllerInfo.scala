package typings.systeminformation.systeminformationMod.SysteminformationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GraphicsControllerInfo extends js.Object {
  var bus: String
  var model: String
  var vendor: String
  var vram: Double
  var vramDynamic: Boolean
}

object GraphicsControllerInfo {
  @scala.inline
  def apply(bus: String, model: String, vendor: String, vram: Double, vramDynamic: Boolean): GraphicsControllerInfo = {
    val __obj = js.Dynamic.literal(bus = bus, model = model, vendor = vendor, vram = vram, vramDynamic = vramDynamic)
  
    __obj.asInstanceOf[GraphicsControllerInfo]
  }
}

