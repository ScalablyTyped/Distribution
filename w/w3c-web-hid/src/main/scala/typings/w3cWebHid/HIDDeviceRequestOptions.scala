package typings.w3cWebHid

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/*~ https://wicg.github.io/webhid/#hiddevicerequestoptions-dictionary */
trait HIDDeviceRequestOptions extends StObject {
  
  var filters: js.Array[HIDDeviceFilter]
}
object HIDDeviceRequestOptions {
  
  inline def apply(filters: js.Array[HIDDeviceFilter]): HIDDeviceRequestOptions = {
    val __obj = js.Dynamic.literal(filters = filters.asInstanceOf[js.Any])
    __obj.asInstanceOf[HIDDeviceRequestOptions]
  }
  
  extension [Self <: HIDDeviceRequestOptions](x: Self) {
    
    inline def setFilters(value: js.Array[HIDDeviceFilter]): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
    
    inline def setFiltersVarargs(value: HIDDeviceFilter*): Self = StObject.set(x, "filters", js.Array(value*))
  }
}
