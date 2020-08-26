package typings.tizenCommonWeb.systeminfoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SystemInfoPeripheral extends SystemInfoProperty {
  /**
    * Represents the video out status.
    */
  val isVideoOutputOn: Boolean = js.native
}

object SystemInfoPeripheral {
  @scala.inline
  def apply(isVideoOutputOn: Boolean): SystemInfoPeripheral = {
    val __obj = js.Dynamic.literal(isVideoOutputOn = isVideoOutputOn.asInstanceOf[js.Any])
    __obj.asInstanceOf[SystemInfoPeripheral]
  }
  @scala.inline
  implicit class SystemInfoPeripheralOps[Self <: SystemInfoPeripheral] (val x: Self) extends AnyVal {
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
    def setIsVideoOutputOn(value: Boolean): Self = this.set("isVideoOutputOn", value.asInstanceOf[js.Any])
  }
  
}

