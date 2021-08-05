package typings.wixUiCore.clientsGoogleMapsTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddressOutput extends StObject {
  
  var address: InternalAddress
  
  var googleResult: Geocode | PlaceDetails
  
  var originValue: String
}
object AddressOutput {
  
  inline def apply(address: InternalAddress, googleResult: Geocode | PlaceDetails, originValue: String): AddressOutput = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], googleResult = googleResult.asInstanceOf[js.Any], originValue = originValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddressOutput]
  }
  
  extension [Self <: AddressOutput](x: Self) {
    
    inline def setAddress(value: InternalAddress): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    inline def setGoogleResult(value: Geocode | PlaceDetails): Self = StObject.set(x, "googleResult", value.asInstanceOf[js.Any])
    
    inline def setOriginValue(value: String): Self = StObject.set(x, "originValue", value.asInstanceOf[js.Any])
  }
}
