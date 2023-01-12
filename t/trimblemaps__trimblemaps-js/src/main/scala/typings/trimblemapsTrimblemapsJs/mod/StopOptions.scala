package typings.trimblemapsTrimblemapsJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StopOptions extends StObject {
  
  var address: js.UndefOr[Address] = js.undefined
  
  var costs: js.UndefOr[StopCost] = js.undefined
  
  var id: js.UndefOr[String] = js.undefined
  
  var isViaPoint: js.UndefOr[Boolean] = js.undefined
  
  var label: js.UndefOr[String] = js.undefined
  
  var lngLat: LngLatLike
}
object StopOptions {
  
  inline def apply(lngLat: LngLatLike): StopOptions = {
    val __obj = js.Dynamic.literal(lngLat = lngLat.asInstanceOf[js.Any])
    __obj.asInstanceOf[StopOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StopOptions] (val x: Self) extends AnyVal {
    
    inline def setAddress(value: Address): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    inline def setAddressUndefined: Self = StObject.set(x, "address", js.undefined)
    
    inline def setCosts(value: StopCost): Self = StObject.set(x, "costs", value.asInstanceOf[js.Any])
    
    inline def setCostsUndefined: Self = StObject.set(x, "costs", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setIsViaPoint(value: Boolean): Self = StObject.set(x, "isViaPoint", value.asInstanceOf[js.Any])
    
    inline def setIsViaPointUndefined: Self = StObject.set(x, "isViaPoint", js.undefined)
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setLngLat(value: LngLatLike): Self = StObject.set(x, "lngLat", value.asInstanceOf[js.Any])
  }
}
