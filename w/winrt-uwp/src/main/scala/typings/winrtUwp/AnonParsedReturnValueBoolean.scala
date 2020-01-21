package typings.winrtUwp

import typings.winrtUwp.Windows.Devices.Usb.UsbInterfaceDescriptor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonParsedReturnValueBoolean extends js.Object {
  /** Receives a UsbInterfaceDescriptor object. */ var parsed: UsbInterfaceDescriptor
  /** True, if the specified UsbDescriptor object is USB interface descriptor. Otherwise, false. */ var returnValue: Boolean
}

object AnonParsedReturnValueBoolean {
  @scala.inline
  def apply(parsed: UsbInterfaceDescriptor, returnValue: Boolean): AnonParsedReturnValueBoolean = {
    val __obj = js.Dynamic.literal(parsed = parsed.asInstanceOf[js.Any], returnValue = returnValue.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonParsedReturnValueBoolean]
  }
}

