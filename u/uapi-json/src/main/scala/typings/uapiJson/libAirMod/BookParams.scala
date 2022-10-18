package typings.uapiJson.libAirMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BookParams extends StObject {
  
  var allowWaitlist: Boolean
  
  var deliveryInformation: js.UndefOr[DeliveryInformation] = js.undefined
  
  var overrideContinuityCheck: js.UndefOr[Boolean] = js.undefined
  
  var passengers: BookPassengers
  
  var phone: Phone
  
  var platingCarrier: js.UndefOr[String] = js.undefined
  
  var rule: String
  
  var segments: js.Array[Segment]
  
  var tau: js.UndefOr[String | js.Date | js.Array[Double]] = js.undefined
}
object BookParams {
  
  inline def apply(
    allowWaitlist: Boolean,
    passengers: BookPassengers,
    phone: Phone,
    rule: String,
    segments: js.Array[Segment]
  ): BookParams = {
    val __obj = js.Dynamic.literal(allowWaitlist = allowWaitlist.asInstanceOf[js.Any], passengers = passengers.asInstanceOf[js.Any], phone = phone.asInstanceOf[js.Any], rule = rule.asInstanceOf[js.Any], segments = segments.asInstanceOf[js.Any])
    __obj.asInstanceOf[BookParams]
  }
  
  extension [Self <: BookParams](x: Self) {
    
    inline def setAllowWaitlist(value: Boolean): Self = StObject.set(x, "allowWaitlist", value.asInstanceOf[js.Any])
    
    inline def setDeliveryInformation(value: DeliveryInformation): Self = StObject.set(x, "deliveryInformation", value.asInstanceOf[js.Any])
    
    inline def setDeliveryInformationUndefined: Self = StObject.set(x, "deliveryInformation", js.undefined)
    
    inline def setOverrideContinuityCheck(value: Boolean): Self = StObject.set(x, "overrideContinuityCheck", value.asInstanceOf[js.Any])
    
    inline def setOverrideContinuityCheckUndefined: Self = StObject.set(x, "overrideContinuityCheck", js.undefined)
    
    inline def setPassengers(value: BookPassengers): Self = StObject.set(x, "passengers", value.asInstanceOf[js.Any])
    
    inline def setPhone(value: Phone): Self = StObject.set(x, "phone", value.asInstanceOf[js.Any])
    
    inline def setPlatingCarrier(value: String): Self = StObject.set(x, "platingCarrier", value.asInstanceOf[js.Any])
    
    inline def setPlatingCarrierUndefined: Self = StObject.set(x, "platingCarrier", js.undefined)
    
    inline def setRule(value: String): Self = StObject.set(x, "rule", value.asInstanceOf[js.Any])
    
    inline def setSegments(value: js.Array[Segment]): Self = StObject.set(x, "segments", value.asInstanceOf[js.Any])
    
    inline def setSegmentsVarargs(value: Segment*): Self = StObject.set(x, "segments", js.Array(value*))
    
    inline def setTau(value: String | js.Date | js.Array[Double]): Self = StObject.set(x, "tau", value.asInstanceOf[js.Any])
    
    inline def setTauUndefined: Self = StObject.set(x, "tau", js.undefined)
    
    inline def setTauVarargs(value: Double*): Self = StObject.set(x, "tau", js.Array(value*))
  }
}
