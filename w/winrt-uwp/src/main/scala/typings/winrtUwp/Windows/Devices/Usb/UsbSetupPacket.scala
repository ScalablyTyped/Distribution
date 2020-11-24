package typings.winrtUwp.Windows.Devices.Usb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Describes the setup packet for a USB control transfer. For an explanation of the setup packet, see Table 9.2 in the Universal Serial Bus (USB) specification. */
@js.native
trait UsbSetupPacket extends js.Object {
  
  /** Gets or sets the wIndex field in the setup packet of the USB control transfer. */
  var index: Double = js.native
  
  /** Gets the length, in bytes, of the setup packet. */
  var length: Double = js.native
  
  /** Gets or sets the bRequest field in the setup packet of the USB control transfer. */
  var request: Double = js.native
  
  /** Gets or sets the bmRequestType field in the setup packet of the USB control transfer. That field is represented by a UsbControlRequestType object. */
  var requestType: UsbControlRequestType = js.native
  
  /** Gets or sets the wValue field in the setup packet of the USB control transfer. */
  var value: Double = js.native
}
object UsbSetupPacket {
  
  @scala.inline
  def apply(index: Double, length: Double, request: Double, requestType: UsbControlRequestType, value: Double): UsbSetupPacket = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], requestType = requestType.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[UsbSetupPacket]
  }
  
  @scala.inline
  implicit class UsbSetupPacketOps[Self <: UsbSetupPacket] (val x: Self) extends AnyVal {
    
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
    def setIndex(value: Double): Self = this.set("index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLength(value: Double): Self = this.set("length", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: Double): Self = this.set("request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestType(value: UsbControlRequestType): Self = this.set("requestType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: Double): Self = this.set("value", value.asInstanceOf[js.Any])
  }
}
