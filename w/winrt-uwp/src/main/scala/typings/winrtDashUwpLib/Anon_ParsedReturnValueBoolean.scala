package typings
package winrtDashUwpLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ParsedReturnValueBoolean extends js.Object {
  /** Receives a UsbInterfaceDescriptor object. */ var parsed: winrtDashUwpLib.WindowsNs.DevicesNs.UsbNs.UsbInterfaceDescriptor
  /** True, if the specified UsbDescriptor object is USB interface descriptor. Otherwise, false. */ var returnValue: scala.Boolean
}

object Anon_ParsedReturnValueBoolean {
  @scala.inline
  def apply(
    parsed: winrtDashUwpLib.WindowsNs.DevicesNs.UsbNs.UsbInterfaceDescriptor,
    returnValue: scala.Boolean
  ): Anon_ParsedReturnValueBoolean = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("parsed")(parsed)
    __obj.updateDynamic("returnValue")(returnValue)
    __obj.asInstanceOf[Anon_ParsedReturnValueBoolean]
  }
}

