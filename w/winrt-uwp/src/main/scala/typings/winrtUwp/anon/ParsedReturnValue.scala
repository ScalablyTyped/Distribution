package typings.winrtUwp.anon

import typings.winrtUwp.Windows.Devices.Usb.UsbEndpointDescriptor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParsedReturnValue extends js.Object {
  /** Receives a UsbEndpointDescriptor object. */ var parsed: UsbEndpointDescriptor
  /** True, if the specified UsbDescriptor object is a USB endpoint descriptor. Otherwise, false. */ var returnValue: Boolean
}

object ParsedReturnValue {
  @scala.inline
  def apply(parsed: UsbEndpointDescriptor, returnValue: Boolean): ParsedReturnValue = {
    val __obj = js.Dynamic.literal(parsed = parsed.asInstanceOf[js.Any], returnValue = returnValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParsedReturnValue]
  }
}

