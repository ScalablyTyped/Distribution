package typings.w3cWebUsb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait USBDeviceRequestOptions extends StObject {
  
  var filters: js.Array[USBDeviceFilter]
}
object USBDeviceRequestOptions {
  
  inline def apply(filters: js.Array[USBDeviceFilter]): USBDeviceRequestOptions = {
    val __obj = js.Dynamic.literal(filters = filters.asInstanceOf[js.Any])
    __obj.asInstanceOf[USBDeviceRequestOptions]
  }
  
  extension [Self <: USBDeviceRequestOptions](x: Self) {
    
    inline def setFilters(value: js.Array[USBDeviceFilter]): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
    
    inline def setFiltersVarargs(value: USBDeviceFilter*): Self = StObject.set(x, "filters", js.Array(value*))
  }
}
