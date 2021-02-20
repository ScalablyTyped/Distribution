package typings.winrtUwp.Windows.ApplicationModel.Calls.Background

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Used to provide the origin details of the phone call. */
@js.native
trait PhoneCallOriginDataRequestTriggerDetails extends StObject {
  
  /** Gets the phone number for the origin of the phone call. */
  var phoneNumber: String = js.native
  
  /** Gets the unique identifier for this phone call. */
  var requestId: String = js.native
}
object PhoneCallOriginDataRequestTriggerDetails {
  
  @scala.inline
  def apply(phoneNumber: String, requestId: String): PhoneCallOriginDataRequestTriggerDetails = {
    val __obj = js.Dynamic.literal(phoneNumber = phoneNumber.asInstanceOf[js.Any], requestId = requestId.asInstanceOf[js.Any])
    __obj.asInstanceOf[PhoneCallOriginDataRequestTriggerDetails]
  }
  
  @scala.inline
  implicit class PhoneCallOriginDataRequestTriggerDetailsMutableBuilder[Self <: PhoneCallOriginDataRequestTriggerDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPhoneNumber(value: String): Self = StObject.set(x, "phoneNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestId(value: String): Self = StObject.set(x, "requestId", value.asInstanceOf[js.Any])
  }
}
