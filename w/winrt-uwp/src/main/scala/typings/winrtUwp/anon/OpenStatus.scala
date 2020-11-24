package typings.winrtUwp.anon

import typings.winrtUwp.Windows.Devices.Gpio.GpioOpenStatus
import typings.winrtUwp.Windows.Devices.Gpio.GpioPin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OpenStatus extends js.Object {
  
  /** An enumeration value that indicates either that the attempt to open the GPIO pin succeeded, or the reason that the attempt to open the GPIO pin failed. */ var openStatus: GpioOpenStatus = js.native
  
  /** The opened GPIO pin if the return value is true; otherwise null. */ var pin: GpioPin = js.native
  
  /** True if the method successfully opened the pin; otherwise false. */ var returnValue: Boolean = js.native
}
object OpenStatus {
  
  @scala.inline
  def apply(openStatus: GpioOpenStatus, pin: GpioPin, returnValue: Boolean): OpenStatus = {
    val __obj = js.Dynamic.literal(openStatus = openStatus.asInstanceOf[js.Any], pin = pin.asInstanceOf[js.Any], returnValue = returnValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpenStatus]
  }
  
  @scala.inline
  implicit class OpenStatusOps[Self <: OpenStatus] (val x: Self) extends AnyVal {
    
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
    def setOpenStatus(value: GpioOpenStatus): Self = this.set("openStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPin(value: GpioPin): Self = this.set("pin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturnValue(value: Boolean): Self = this.set("returnValue", value.asInstanceOf[js.Any])
  }
}
