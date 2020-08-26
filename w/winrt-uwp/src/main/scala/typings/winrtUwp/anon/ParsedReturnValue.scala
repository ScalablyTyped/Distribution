package typings.winrtUwp.anon

import typings.winrtUwp.Windows.Devices.Usb.UsbEndpointDescriptor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParsedReturnValue extends js.Object {
  /** Receives a UsbEndpointDescriptor object. */ var parsed: UsbEndpointDescriptor = js.native
  /** True, if the specified UsbDescriptor object is a USB endpoint descriptor. Otherwise, false. */ var returnValue: Boolean = js.native
}

object ParsedReturnValue {
  @scala.inline
  def apply(parsed: UsbEndpointDescriptor, returnValue: Boolean): ParsedReturnValue = {
    val __obj = js.Dynamic.literal(parsed = parsed.asInstanceOf[js.Any], returnValue = returnValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParsedReturnValue]
  }
  @scala.inline
  implicit class ParsedReturnValueOps[Self <: ParsedReturnValue] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setParsed(value: UsbEndpointDescriptor): Self = this.set("parsed", value.asInstanceOf[js.Any])
    @scala.inline
    def setReturnValue(value: Boolean): Self = this.set("returnValue", value.asInstanceOf[js.Any])
  }
  
}

