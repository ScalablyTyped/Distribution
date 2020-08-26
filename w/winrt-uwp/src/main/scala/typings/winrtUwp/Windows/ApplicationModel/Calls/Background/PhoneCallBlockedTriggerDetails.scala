package typings.winrtUwp.Windows.ApplicationModel.Calls.Background

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Used to provide the details about a call that was just blocked. */
@js.native
trait PhoneCallBlockedTriggerDetails extends js.Object {
  /** Gets the reason why a phone call was blocked. */
  var callBlockedReason: PhoneCallBlockedReason = js.native
  /** Gets the ID of the phone call that was just blocked. */
  var lineId: String = js.native
  /** Gets the phone number of the blocked call. */
  var phoneNumber: String = js.native
}

object PhoneCallBlockedTriggerDetails {
  @scala.inline
  def apply(callBlockedReason: PhoneCallBlockedReason, lineId: String, phoneNumber: String): PhoneCallBlockedTriggerDetails = {
    val __obj = js.Dynamic.literal(callBlockedReason = callBlockedReason.asInstanceOf[js.Any], lineId = lineId.asInstanceOf[js.Any], phoneNumber = phoneNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[PhoneCallBlockedTriggerDetails]
  }
  @scala.inline
  implicit class PhoneCallBlockedTriggerDetailsOps[Self <: PhoneCallBlockedTriggerDetails] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCallBlockedReason(value: PhoneCallBlockedReason): Self = this.set("callBlockedReason", value.asInstanceOf[js.Any])
    @scala.inline
    def setLineId(value: String): Self = this.set("lineId", value.asInstanceOf[js.Any])
    @scala.inline
    def setPhoneNumber(value: String): Self = this.set("phoneNumber", value.asInstanceOf[js.Any])
  }
  
}

