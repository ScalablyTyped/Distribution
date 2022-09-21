package typings.w3cWebHid

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HIDDeviceFilter extends StObject {
  
  var productId: js.UndefOr[Double] = js.undefined
  
  var usage: js.UndefOr[Double] = js.undefined
  
  var usagePage: js.UndefOr[Double] = js.undefined
  
  var vendorId: js.UndefOr[Double] = js.undefined
}
object HIDDeviceFilter {
  
  inline def apply(): HIDDeviceFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HIDDeviceFilter]
  }
  
  extension [Self <: HIDDeviceFilter](x: Self) {
    
    inline def setProductId(value: Double): Self = StObject.set(x, "productId", value.asInstanceOf[js.Any])
    
    inline def setProductIdUndefined: Self = StObject.set(x, "productId", js.undefined)
    
    inline def setUsage(value: Double): Self = StObject.set(x, "usage", value.asInstanceOf[js.Any])
    
    inline def setUsagePage(value: Double): Self = StObject.set(x, "usagePage", value.asInstanceOf[js.Any])
    
    inline def setUsagePageUndefined: Self = StObject.set(x, "usagePage", js.undefined)
    
    inline def setUsageUndefined: Self = StObject.set(x, "usage", js.undefined)
    
    inline def setVendorId(value: Double): Self = StObject.set(x, "vendorId", value.asInstanceOf[js.Any])
    
    inline def setVendorIdUndefined: Self = StObject.set(x, "vendorId", js.undefined)
  }
}
