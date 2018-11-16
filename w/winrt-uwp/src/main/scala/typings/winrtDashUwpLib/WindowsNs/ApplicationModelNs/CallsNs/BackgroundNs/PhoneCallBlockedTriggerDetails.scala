package typings
package winrtDashUwpLib.WindowsNs.ApplicationModelNs.CallsNs.BackgroundNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Used to provide the details about a call that was just blocked. */
@JSGlobal("Windows.ApplicationModel.Calls.Background.PhoneCallBlockedTriggerDetails")
@js.native
abstract class PhoneCallBlockedTriggerDetails () extends js.Object {
  /** Gets the reason why a phone call was blocked. */
  var callBlockedReason: PhoneCallBlockedReason = js.native
  /** Gets the ID of the phone call that was just blocked. */
  var lineId: java.lang.String = js.native
  /** Gets the phone number of the blocked call. */
  var phoneNumber: java.lang.String = js.native
}

