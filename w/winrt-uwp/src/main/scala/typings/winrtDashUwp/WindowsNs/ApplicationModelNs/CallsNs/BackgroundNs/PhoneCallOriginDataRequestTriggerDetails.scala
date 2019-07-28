package typings.winrtDashUwp.WindowsNs.ApplicationModelNs.CallsNs.BackgroundNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Used to provide the origin details of the phone call. */
@JSGlobal("Windows.ApplicationModel.Calls.Background.PhoneCallOriginDataRequestTriggerDetails")
@js.native
abstract class PhoneCallOriginDataRequestTriggerDetails () extends js.Object {
  /** Gets the phone number for the origin of the phone call. */
  var phoneNumber: String = js.native
  /** Gets the unique identifier for this phone call. */
  var requestId: String = js.native
}

