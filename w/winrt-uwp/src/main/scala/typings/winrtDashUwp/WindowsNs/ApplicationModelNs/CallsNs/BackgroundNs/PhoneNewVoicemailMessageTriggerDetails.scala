package typings.winrtDashUwp.WindowsNs.ApplicationModelNs.CallsNs.BackgroundNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Used to provide the details about a new voice mail message on a phone line. */
@JSGlobal("Windows.ApplicationModel.Calls.Background.PhoneNewVoicemailMessageTriggerDetails")
@js.native
abstract class PhoneNewVoicemailMessageTriggerDetails () extends js.Object {
  /** Gets the ID of the phone line for which the new voice mail arrived. */
  var lineId: String = js.native
  /** Gets the optional voice mail changed message set by an operator when they send a voice mail changed SMS. */
  var operatorMessage: String = js.native
  /** Gets the new count of voice mail messages for the phone line. */
  var voicemailCount: Double = js.native
}

