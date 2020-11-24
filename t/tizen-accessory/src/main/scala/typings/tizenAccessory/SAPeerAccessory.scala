package typings.tizenAccessory

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SAPeerAccessory extends js.Object {
  
  val accessoryId: String = js.native
  
  val deviceAddress: String = js.native
  
  val deviceName: String = js.native
  
  val productId: String = js.native
  
  val transportType: String = js.native
  
  val vendorId: String = js.native
}
object SAPeerAccessory {
  
  @scala.inline
  def apply(
    accessoryId: String,
    deviceAddress: String,
    deviceName: String,
    productId: String,
    transportType: String,
    vendorId: String
  ): SAPeerAccessory = {
    val __obj = js.Dynamic.literal(accessoryId = accessoryId.asInstanceOf[js.Any], deviceAddress = deviceAddress.asInstanceOf[js.Any], deviceName = deviceName.asInstanceOf[js.Any], productId = productId.asInstanceOf[js.Any], transportType = transportType.asInstanceOf[js.Any], vendorId = vendorId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SAPeerAccessory]
  }
  
  @scala.inline
  implicit class SAPeerAccessoryOps[Self <: SAPeerAccessory] (val x: Self) extends AnyVal {
    
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
    def setAccessoryId(value: String): Self = this.set("accessoryId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceAddress(value: String): Self = this.set("deviceAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceName(value: String): Self = this.set("deviceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProductId(value: String): Self = this.set("productId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransportType(value: String): Self = this.set("transportType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVendorId(value: String): Self = this.set("vendorId", value.asInstanceOf[js.Any])
  }
}
