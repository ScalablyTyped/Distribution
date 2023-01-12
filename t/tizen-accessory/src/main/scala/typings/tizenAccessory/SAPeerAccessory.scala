package typings.tizenAccessory

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SAPeerAccessory extends StObject {
  
  val accessoryId: String
  
  val deviceAddress: String
  
  val deviceName: String
  
  val productId: String
  
  val transportType: String
  
  val vendorId: String
}
object SAPeerAccessory {
  
  inline def apply(
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
  implicit open class MutableBuilder[Self <: SAPeerAccessory] (val x: Self) extends AnyVal {
    
    inline def setAccessoryId(value: String): Self = StObject.set(x, "accessoryId", value.asInstanceOf[js.Any])
    
    inline def setDeviceAddress(value: String): Self = StObject.set(x, "deviceAddress", value.asInstanceOf[js.Any])
    
    inline def setDeviceName(value: String): Self = StObject.set(x, "deviceName", value.asInstanceOf[js.Any])
    
    inline def setProductId(value: String): Self = StObject.set(x, "productId", value.asInstanceOf[js.Any])
    
    inline def setTransportType(value: String): Self = StObject.set(x, "transportType", value.asInstanceOf[js.Any])
    
    inline def setVendorId(value: String): Self = StObject.set(x, "vendorId", value.asInstanceOf[js.Any])
  }
}
