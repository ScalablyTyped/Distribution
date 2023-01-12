package typings.w3cWebUsb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait USBDeviceFilter extends StObject {
  
  var classCode: js.UndefOr[Double] = js.undefined
  
  var productId: js.UndefOr[Double] = js.undefined
  
  var protocolCode: js.UndefOr[Double] = js.undefined
  
  var serialNumber: js.UndefOr[String] = js.undefined
  
  var subclassCode: js.UndefOr[Double] = js.undefined
  
  var vendorId: js.UndefOr[Double] = js.undefined
}
object USBDeviceFilter {
  
  inline def apply(): USBDeviceFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[USBDeviceFilter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: USBDeviceFilter] (val x: Self) extends AnyVal {
    
    inline def setClassCode(value: Double): Self = StObject.set(x, "classCode", value.asInstanceOf[js.Any])
    
    inline def setClassCodeUndefined: Self = StObject.set(x, "classCode", js.undefined)
    
    inline def setProductId(value: Double): Self = StObject.set(x, "productId", value.asInstanceOf[js.Any])
    
    inline def setProductIdUndefined: Self = StObject.set(x, "productId", js.undefined)
    
    inline def setProtocolCode(value: Double): Self = StObject.set(x, "protocolCode", value.asInstanceOf[js.Any])
    
    inline def setProtocolCodeUndefined: Self = StObject.set(x, "protocolCode", js.undefined)
    
    inline def setSerialNumber(value: String): Self = StObject.set(x, "serialNumber", value.asInstanceOf[js.Any])
    
    inline def setSerialNumberUndefined: Self = StObject.set(x, "serialNumber", js.undefined)
    
    inline def setSubclassCode(value: Double): Self = StObject.set(x, "subclassCode", value.asInstanceOf[js.Any])
    
    inline def setSubclassCodeUndefined: Self = StObject.set(x, "subclassCode", js.undefined)
    
    inline def setVendorId(value: Double): Self = StObject.set(x, "vendorId", value.asInstanceOf[js.Any])
    
    inline def setVendorIdUndefined: Self = StObject.set(x, "vendorId", js.undefined)
  }
}
