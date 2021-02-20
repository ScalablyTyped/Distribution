package typings.w3cWebUsb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait USBDeviceFilter extends StObject {
  
  var classCode: js.UndefOr[Double] = js.native
  
  var productId: js.UndefOr[Double] = js.native
  
  var protocolCode: js.UndefOr[Double] = js.native
  
  var serialNumber: js.UndefOr[String] = js.native
  
  var subclassCode: js.UndefOr[Double] = js.native
  
  var vendorId: js.UndefOr[Double] = js.native
}
object USBDeviceFilter {
  
  @scala.inline
  def apply(): USBDeviceFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[USBDeviceFilter]
  }
  
  @scala.inline
  implicit class USBDeviceFilterMutableBuilder[Self <: USBDeviceFilter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClassCode(value: Double): Self = StObject.set(x, "classCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassCodeUndefined: Self = StObject.set(x, "classCode", js.undefined)
    
    @scala.inline
    def setProductId(value: Double): Self = StObject.set(x, "productId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProductIdUndefined: Self = StObject.set(x, "productId", js.undefined)
    
    @scala.inline
    def setProtocolCode(value: Double): Self = StObject.set(x, "protocolCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProtocolCodeUndefined: Self = StObject.set(x, "protocolCode", js.undefined)
    
    @scala.inline
    def setSerialNumber(value: String): Self = StObject.set(x, "serialNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSerialNumberUndefined: Self = StObject.set(x, "serialNumber", js.undefined)
    
    @scala.inline
    def setSubclassCode(value: Double): Self = StObject.set(x, "subclassCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubclassCodeUndefined: Self = StObject.set(x, "subclassCode", js.undefined)
    
    @scala.inline
    def setVendorId(value: Double): Self = StObject.set(x, "vendorId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVendorIdUndefined: Self = StObject.set(x, "vendorId", js.undefined)
  }
}
