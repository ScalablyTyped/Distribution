package typings
package winrtDashUwpLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ParsedReturnValue extends js.Object {
  /** Receives a UsbEndpointDescriptor object. */ var parsed: winrtDashUwpLib.WindowsNs.DevicesNs.UsbNs.UsbEndpointDescriptor
  /** True, if the specified UsbDescriptor object is a USB endpoint descriptor. Otherwise, false. */ var returnValue: scala.Boolean
}

object Anon_ParsedReturnValue {
  @scala.inline
  def apply(
    parsed: winrtDashUwpLib.WindowsNs.DevicesNs.UsbNs.UsbEndpointDescriptor,
    returnValue: scala.Boolean
  ): Anon_ParsedReturnValue = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("parsed")(parsed)
    __obj.updateDynamic("returnValue")(returnValue)
    __obj.asInstanceOf[Anon_ParsedReturnValue]
  }
}

