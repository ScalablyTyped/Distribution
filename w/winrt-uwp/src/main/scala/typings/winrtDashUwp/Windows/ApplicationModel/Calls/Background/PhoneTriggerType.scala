package typings.winrtDashUwp.Windows.ApplicationModel.Calls.Background

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
  sealed trait airplaneModeDisabledForEmergencyCall extends PhoneTriggerType
  
  /** The call was blocked. */
  @js.native
  sealed trait callBlocked extends PhoneTriggerType
  
  /** The call history has changed. */
  @js.native
  sealed trait callHistoryChanged extends PhoneTriggerType
  
  /** A request was made for the origin of the phone call. */
  @js.native
  sealed trait callOriginDataRequest extends PhoneTriggerType
  
  /** The PhoneLineProperties have changed. */
  @js.native
  sealed trait lineChanged extends PhoneTriggerType
  
  /** The system received a new voice mail message or the voice mail count went to 0. */
  @js.native
  sealed trait newVoicemailMessage extends PhoneTriggerType
  
  /* 3 */ val airplaneModeDisabledForEmergencyCall: typings.winrtDashUwp.Windows.ApplicationModel.Calls.Background.PhoneTriggerType.airplaneModeDisabledForEmergencyCall with Double = js.native
  /* 5 */ val callBlocked: typings.winrtDashUwp.Windows.ApplicationModel.Calls.Background.PhoneTriggerType.callBlocked with Double = js.native
  /* 1 */ val callHistoryChanged: typings.winrtDashUwp.Windows.ApplicationModel.Calls.Background.PhoneTriggerType.callHistoryChanged with Double = js.native
  /* 4 */ val callOriginDataRequest: typings.winrtDashUwp.Windows.ApplicationModel.Calls.Background.PhoneTriggerType.callOriginDataRequest with Double = js.native
  /* 2 */ val lineChanged: typings.winrtDashUwp.Windows.ApplicationModel.Calls.Background.PhoneTriggerType.lineChanged with Double = js.native
  /* 0 */ val newVoicemailMessage: typings.winrtDashUwp.Windows.ApplicationModel.Calls.Background.PhoneTriggerType.newVoicemailMessage with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PhoneTriggerType with Double] = js.native
}

