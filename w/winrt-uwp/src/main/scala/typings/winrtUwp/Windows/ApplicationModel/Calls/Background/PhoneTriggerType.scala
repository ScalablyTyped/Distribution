package typings.winrtUwp.Windows.ApplicationModel.Calls.Background

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PhoneTriggerType with Double] = js.native
  /* 3 */ @js.native
  object airplaneModeDisabledForEmergencyCall extends TopLevel[airplaneModeDisabledForEmergencyCall with Double]
  
  /* 5 */ @js.native
  object callBlocked extends TopLevel[callBlocked with Double]
  
  /* 1 */ @js.native
  object callHistoryChanged extends TopLevel[callHistoryChanged with Double]
  
  /* 4 */ @js.native
  object callOriginDataRequest extends TopLevel[callOriginDataRequest with Double]
  
  /* 2 */ @js.native
  object lineChanged extends TopLevel[lineChanged with Double]
  
  /* 0 */ @js.native
  object newVoicemailMessage extends TopLevel[newVoicemailMessage with Double]
  
}

