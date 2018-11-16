package typings
package winrtDashUwpLib.WindowsNs.ApplicationModelNs.CallsNs.BackgroundNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PhoneTriggerType extends js.Object

/** Indicates a type of event for a phone trigger. */
@JSGlobal("Windows.ApplicationModel.Calls.Background.PhoneTriggerType")
@js.native
object PhoneTriggerType extends js.Object {
  /** Airplane mode on a phone line was disabled so the phone could make an emergency call. */
  @js.native
  sealed trait airplaneModeDisabledForEmergencyCall
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.CallsNs.BackgroundNs.PhoneTriggerType
  
  /** The call was blocked. */
  @js.native
  sealed trait callBlocked
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.CallsNs.BackgroundNs.PhoneTriggerType
  
  /** The call history has changed. */
  @js.native
  sealed trait callHistoryChanged
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.CallsNs.BackgroundNs.PhoneTriggerType
  
  /** A request was made for the origin of the phone call. */
  @js.native
  sealed trait callOriginDataRequest
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.CallsNs.BackgroundNs.PhoneTriggerType
  
  /** The PhoneLineProperties have changed. */
  @js.native
  sealed trait lineChanged
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.CallsNs.BackgroundNs.PhoneTriggerType
  
  /** The system received a new voice mail message or the voice mail count went to 0. */
  @js.native
  sealed trait newVoicemailMessage
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.CallsNs.BackgroundNs.PhoneTriggerType
  
  val airplaneModeDisabledForEmergencyCall: airplaneModeDisabledForEmergencyCall with java.lang.String = js.native
  val callBlocked: callBlocked with java.lang.String = js.native
  val callHistoryChanged: callHistoryChanged with java.lang.String = js.native
  val callOriginDataRequest: callOriginDataRequest with java.lang.String = js.native
  val lineChanged: lineChanged with java.lang.String = js.native
  val newVoicemailMessage: newVoicemailMessage with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.ApplicationModelNs.CallsNs.BackgroundNs.PhoneTriggerType with java.lang.String
  ] = js.native
}

