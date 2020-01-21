package typings.winrtUwp

import typings.winrtUwp.Windows.Devices.Usb.UsbConfigurationDescriptor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonParsed extends js.Object {
  /** Receives a UsbConfigurationDescriptor object. */ var parsed: UsbConfigurationDescriptor
  /** True, if a UsbConfigurationDescriptor object was found in the specified UsbDescriptor object. Otherwise, false. */ var returnValue: Boolean
}

object AnonParsed {
  @scala.inline
  def apply(parsed: UsbConfigurationDescriptor, returnValue: Boolean): AnonParsed = {
    val __obj = js.Dynamic.literal(parsed = parsed.asInstanceOf[js.Any], returnValue = returnValue.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonParsed]
  }
}

