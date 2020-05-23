package typings.winrtUwp.Windows.ApplicationModel.Calls.Background

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Used to provide the details about a call that was just blocked. */
trait PhoneCallBlockedTriggerDetails extends js.Object {
  /** Gets the reason why a phone call was blocked. */
  var callBlockedReason: PhoneCallBlockedReason
  /** Gets the ID of the phone call that was just blocked. */
  var lineId: String
  /** Gets the phone number of the blocked call. */
  var phoneNumber: String
}

object PhoneCallBlockedTriggerDetails {
  @scala.inline
  def apply(callBlockedReason: PhoneCallBlockedReason, lineId: String, phoneNumber: String): PhoneCallBlockedTriggerDetails = {
    val __obj = js.Dynamic.literal(callBlockedReason = callBlockedReason.asInstanceOf[js.Any], lineId = lineId.asInstanceOf[js.Any], phoneNumber = phoneNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[PhoneCallBlockedTriggerDetails]
  }
}

