package typings.systeminformation.systeminformationMod.Systeminformation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GraphicsControllerData extends js.Object {
  var bus: String
  var model: String
  var vendor: String
  var vram: Double
  var vramDynamic: Boolean
}

object GraphicsControllerData {
  @scala.inline
  def apply(bus: String, model: String, vendor: String, vram: Double, vramDynamic: Boolean): GraphicsControllerData = {
    val __obj = js.Dynamic.literal(bus = bus, model = model, vendor = vendor, vram = vram, vramDynamic = vramDynamic)
  
    __obj.asInstanceOf[GraphicsControllerData]
  }
}

