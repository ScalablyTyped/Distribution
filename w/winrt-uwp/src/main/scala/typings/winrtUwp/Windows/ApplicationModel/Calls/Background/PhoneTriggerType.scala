package typings.winrtUwp.Windows.ApplicationModel.Calls.Background

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PhoneTriggerType extends StObject
/** Indicates a type of event for a phone trigger. */
@JSGlobal("Windows.ApplicationModel.Calls.Background.PhoneTriggerType")
@js.native
object PhoneTriggerType extends StObject {
  
  /** Airplane mode on a phone line was disabled so the phone could make an emergency call. */
  @js.native
  sealed trait airplaneModeDisabledForEmergencyCall
    extends StObject
       with PhoneTriggerType
  
  /** The call was blocked. */
  @js.native
  sealed trait callBlocked
    extends StObject
       with PhoneTriggerType
  
  /** The call history has changed. */
  @js.native
  sealed trait callHistoryChanged
    extends StObject
       with PhoneTriggerType
  
  /** A request was made for the origin of the phone call. */
  @js.native
  sealed trait callOriginDataRequest
    extends StObject
       with PhoneTriggerType
  
  /** The PhoneLineProperties have changed. */
  @js.native
  sealed trait lineChanged
    extends StObject
       with PhoneTriggerType
  
  /** The system received a new voice mail message or the voice mail count went to 0. */
  @js.native
  sealed trait newVoicemailMessage
    extends StObject
       with PhoneTriggerType
}
