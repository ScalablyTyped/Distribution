package typings.systeminformation.mod.Systeminformation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GraphicsControllerData extends js.Object {
  var bus: String = js.native
  var model: String = js.native
  var vendor: String = js.native
  var vram: Double = js.native
  var vramDynamic: Boolean = js.native
}

object GraphicsControllerData {
  @scala.inline
  def apply(bus: String, model: String, vendor: String, vram: Double, vramDynamic: Boolean): GraphicsControllerData = {
    val __obj = js.Dynamic.literal(bus = bus.asInstanceOf[js.Any], model = model.asInstanceOf[js.Any], vendor = vendor.asInstanceOf[js.Any], vram = vram.asInstanceOf[js.Any], vramDynamic = vramDynamic.asInstanceOf[js.Any])
    __obj.asInstanceOf[GraphicsControllerData]
  }
  @scala.inline
  implicit class GraphicsControllerDataOps[Self <: GraphicsControllerData] (val x: Self) extends AnyVal {
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
    def setBus(value: String): Self = this.set("bus", value.asInstanceOf[js.Any])
    @scala.inline
    def setModel(value: String): Self = this.set("model", value.asInstanceOf[js.Any])
    @scala.inline
    def setVendor(value: String): Self = this.set("vendor", value.asInstanceOf[js.Any])
    @scala.inline
    def setVram(value: Double): Self = this.set("vram", value.asInstanceOf[js.Any])
    @scala.inline
    def setVramDynamic(value: Boolean): Self = this.set("vramDynamic", value.asInstanceOf[js.Any])
  }
  
}

