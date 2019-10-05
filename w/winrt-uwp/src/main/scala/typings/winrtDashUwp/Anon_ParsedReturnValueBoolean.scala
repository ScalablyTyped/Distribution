package typings.winrtDashUwp

import typings.winrtDashUwp.Windows.Devices.Usb.UsbInterfaceDescriptor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ParsedReturnValueBoolean extends js.Object {
  /** Receives a UsbInterfaceDescriptor object. */ var parsed: UsbInterfaceDescriptor
  /** True, if the specified UsbDescriptor object is USB interface descriptor. Otherwise, false. */ var returnValue: Boolean
}

object Anon_ParsedReturnValueBoolean {
  @scala.inline
  def apply(parsed: UsbInterfaceDescriptor, returnValue: Boolean): Anon_ParsedReturnValueBoolean = {
    val __obj = js.Dynamic.literal(parsed = parsed, returnValue = returnValue)
  
    __obj.asInstanceOf[Anon_ParsedReturnValueBoolean]
  }
}

