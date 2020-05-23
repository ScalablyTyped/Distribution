package typings.winrtUwp.anon

import typings.winrtUwp.Windows.Devices.Gpio.GpioOpenStatus
import typings.winrtUwp.Windows.Devices.Gpio.GpioPin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OpenStatus extends js.Object {
  /** An enumeration value that indicates either that the attempt to open the GPIO pin succeeded, or the reason that the attempt to open the GPIO pin failed. */ var openStatus: GpioOpenStatus
  /** The opened GPIO pin if the return value is true; otherwise null. */ var pin: GpioPin
  /** True if the method successfully opened the pin; otherwise false. */ var returnValue: Boolean
}

object OpenStatus {
  @scala.inline
  def apply(openStatus: GpioOpenStatus, pin: GpioPin, returnValue: Boolean): OpenStatus = {
    val __obj = js.Dynamic.literal(openStatus = openStatus.asInstanceOf[js.Any], pin = pin.asInstanceOf[js.Any], returnValue = returnValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpenStatus]
  }
}

