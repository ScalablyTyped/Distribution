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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HIDDeviceRequestOptions] (val x: Self) extends AnyVal {
    
    inline def setFilters(value: js.Array[HIDDeviceFilter]): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
    
    inline def setFiltersVarargs(value: HIDDeviceFilter*): Self = StObject.set(x, "filters", js.Array(value*))
  }
}
