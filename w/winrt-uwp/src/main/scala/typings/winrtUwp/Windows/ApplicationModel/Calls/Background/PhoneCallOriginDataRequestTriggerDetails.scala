package typings.winrtUwp.Windows.ApplicationModel.Calls.Background

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Used to provide the origin details of the phone call. */
@js.native
trait PhoneCallOriginDataRequestTriggerDetails extends js.Object {
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
  implicit class PhoneCallOriginDataRequestTriggerDetailsOps[Self <: PhoneCallOriginDataRequestTriggerDetails] (val x: Self) extends AnyVal {
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
    def setPhoneNumber(value: String): Self = this.set("phoneNumber", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequestId(value: String): Self = this.set("requestId", value.asInstanceOf[js.Any])
  }
  
}

