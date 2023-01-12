package typings.winrtUwp.Windows.ApplicationModel.Calls.Background

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Used to provide the origin details of the phone call. */
trait PhoneCallOriginDataRequestTriggerDetails extends StObject {
  
  /** Gets the phone number for the origin of the phone call. */
  var phoneNumber: String
  
  /** Gets the unique identifier for this phone call. */
  var requestId: String
}
object PhoneCallOriginDataRequestTriggerDetails {
  
  inline def apply(phoneNumber: String, requestId: String): PhoneCallOriginDataRequestTriggerDetails = {
    val __obj = js.Dynamic.literal(phoneNumber = phoneNumber.asInstanceOf[js.Any], requestId = requestId.asInstanceOf[js.Any])
    __obj.asInstanceOf[PhoneCallOriginDataRequestTriggerDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PhoneCallOriginDataRequestTriggerDetails] (val x: Self) extends AnyVal {
    
    inline def setPhoneNumber(value: String): Self = StObject.set(x, "phoneNumber", value.asInstanceOf[js.Any])
    
    inline def setRequestId(value: String): Self = StObject.set(x, "requestId", value.asInstanceOf[js.Any])
  }
}
