package typings.w3cWebUsb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait USBEndpoint extends js.Object {
  
  val direction: USBDirection = js.native
  
  val endpointNumber: Double = js.native
  
  val packetSize: Double = js.native
  
  val `type`: USBEndpointType = js.native
}
object USBEndpoint {
  
  @scala.inline
  def apply(direction: USBDirection, endpointNumber: Double, packetSize: Double, `type`: USBEndpointType): USBEndpoint = {
    val __obj = js.Dynamic.literal(direction = direction.asInstanceOf[js.Any], endpointNumber = endpointNumber.asInstanceOf[js.Any], packetSize = packetSize.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[USBEndpoint]
  }
  
  @scala.inline
  implicit class USBEndpointOps[Self <: USBEndpoint] (val x: Self) extends AnyVal {
    
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
    def setDirection(value: USBDirection): Self = this.set("direction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndpointNumber(value: Double): Self = this.set("endpointNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPacketSize(value: Double): Self = this.set("packetSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: USBEndpointType): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
