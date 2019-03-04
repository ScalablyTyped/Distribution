package typings
package winrtDashUwpLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Parsed extends js.Object {
  /** Receives a UsbConfigurationDescriptor object. */ var parsed: winrtDashUwpLib.WindowsNs.DevicesNs.UsbNs.UsbConfigurationDescriptor
  /** True, if a UsbConfigurationDescriptor object was found in the specified UsbDescriptor object. Otherwise, false. */ var returnValue: scala.Boolean
}

object Anon_Parsed {
  @scala.inline
  def apply(
    parsed: winrtDashUwpLib.WindowsNs.DevicesNs.UsbNs.UsbConfigurationDescriptor,
    returnValue: scala.Boolean
  ): Anon_Parsed = {
    val __obj = js.Dynamic.literal(parsed = parsed, returnValue = returnValue)
  
    __obj.asInstanceOf[Anon_Parsed]
  }
}

