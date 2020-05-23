package typings.winrtUwp.Windows.ApplicationModel.Calls.Background

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Used to provide the origin details of the phone call. */
trait PhoneCallOriginDataRequestTriggerDetails extends js.Object {
  /** Gets the phone number for the origin of the phone call. */
  var phoneNumber: String
  /** Gets the unique identifier for this phone call. */
  var requestId: String
}

object PhoneCallOriginDataRequestTriggerDetails {
  @scala.inline
  def apply(phoneNumber: String, requestId: String): PhoneCallOriginDataRequestTriggerDetails = {
    val __obj = js.Dynamic.literal(phoneNumber = phoneNumber.asInstanceOf[js.Any], requestId = requestId.asInstanceOf[js.Any])
    __obj.asInstanceOf[PhoneCallOriginDataRequestTriggerDetails]
  }
}

