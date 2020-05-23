package typings.winrtUwp.anon

import typings.winrtUwp.Windows.Devices.Usb.UsbInterfaceDescriptor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParsedUsbInterfaceDescriptor extends js.Object {
  /** Receives a UsbInterfaceDescriptor object. */ var parsed: UsbInterfaceDescriptor
  /** True, if the specified UsbDescriptor object is USB interface descriptor. Otherwise, false. */ var returnValue: Boolean
}

object ParsedUsbInterfaceDescriptor {
  @scala.inline
  def apply(parsed: UsbInterfaceDescriptor, returnValue: Boolean): ParsedUsbInterfaceDescriptor = {
    val __obj = js.Dynamic.literal(parsed = parsed.asInstanceOf[js.Any], returnValue = returnValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParsedUsbInterfaceDescriptor]
  }
}

