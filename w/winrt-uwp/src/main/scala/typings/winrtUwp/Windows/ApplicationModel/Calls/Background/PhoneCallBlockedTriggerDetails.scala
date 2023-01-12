package typings.winrtUwp.Windows.ApplicationModel.Calls.Background

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Used to provide the details about a call that was just blocked. */
trait PhoneCallBlockedTriggerDetails extends StObject {
  
  /** Gets the reason why a phone call was blocked. */
  var callBlockedReason: PhoneCallBlockedReason
  
  /** Gets the ID of the phone call that was just blocked. */
  var lineId: String
  
  /** Gets the phone number of the blocked call. */
  var phoneNumber: String
}
object PhoneCallBlockedTriggerDetails {
  
  inline def apply(callBlockedReason: PhoneCallBlockedReason, lineId: String, phoneNumber: String): PhoneCallBlockedTriggerDetails = {
    val __obj = js.Dynamic.literal(callBlockedReason = callBlockedReason.asInstanceOf[js.Any], lineId = lineId.asInstanceOf[js.Any], phoneNumber = phoneNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[PhoneCallBlockedTriggerDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PhoneCallBlockedTriggerDetails] (val x: Self) extends AnyVal {
    
    inline def setCallBlockedReason(value: PhoneCallBlockedReason): Self = StObject.set(x, "callBlockedReason", value.asInstanceOf[js.Any])
    
    inline def setLineId(value: String): Self = StObject.set(x, "lineId", value.asInstanceOf[js.Any])
    
    inline def setPhoneNumber(value: String): Self = StObject.set(x, "phoneNumber", value.asInstanceOf[js.Any])
  }
}
