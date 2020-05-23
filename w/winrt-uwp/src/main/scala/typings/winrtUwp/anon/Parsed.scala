package typings.winrtUwp.anon

import typings.winrtUwp.Windows.Devices.Usb.UsbConfigurationDescriptor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Parsed extends js.Object {
  /** Receives a UsbConfigurationDescriptor object. */ var parsed: UsbConfigurationDescriptor
  /** True, if a UsbConfigurationDescriptor object was found in the specified UsbDescriptor object. Otherwise, false. */ var returnValue: Boolean
}

object Parsed {
  @scala.inline
  def apply(parsed: UsbConfigurationDescriptor, returnValue: Boolean): Parsed = {
    val __obj = js.Dynamic.literal(parsed = parsed.asInstanceOf[js.Any], returnValue = returnValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parsed]
  }
}

