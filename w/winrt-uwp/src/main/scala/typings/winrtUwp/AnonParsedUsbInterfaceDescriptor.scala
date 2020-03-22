package typings.winrtUwp

import typings.winrtUwp.Windows.Devices.Usb.UsbInterfaceDescriptor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonParsedUsbInterfaceDescriptor extends js.Object {
  /** Receives a UsbInterfaceDescriptor object. */ var parsed: UsbInterfaceDescriptor
  /** True, if the specified UsbDescriptor object is USB interface descriptor. Otherwise, false. */ var returnValue: Boolean
}

object AnonParsedUsbInterfaceDescriptor {
  @scala.inline
  def apply(parsed: UsbInterfaceDescriptor, returnValue: Boolean): AnonParsedUsbInterfaceDescriptor = {
    val __obj = js.Dynamic.literal(parsed = parsed.asInstanceOf[js.Any], returnValue = returnValue.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonParsedUsbInterfaceDescriptor]
  }
}

