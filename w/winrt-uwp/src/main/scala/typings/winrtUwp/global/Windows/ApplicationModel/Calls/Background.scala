package typings.winrtUwp.global.Windows.ApplicationModel.Calls

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The classes in Windows.ApplicationModel.Calls.Background are used by device background tasks to handle changes to phone lines, call states, and voice mail counts for the device. */
@JSGlobal("Windows.ApplicationModel.Calls.Background")
@js.native
object Background extends js.Object {
  /** Used to provide the details about a call that was just blocked. */
  @js.native
  abstract class PhoneCallBlockedTriggerDetails ()
    extends typings.winrtUwp.Windows.ApplicationModel.Calls.Background.PhoneCallBlockedTriggerDetails
  
  /** Used to provide the origin details of the phone call. */
  @js.native
  abstract class PhoneCallOriginDataRequestTriggerDetails ()
    extends typings.winrtUwp.Windows.ApplicationModel.Calls.Background.PhoneCallOriginDataRequestTriggerDetails
  
  /** Used to provide the details about a change to the properties of a phone line. */
  @js.native
  abstract class PhoneLineChangedTriggerDetails ()
    extends typings.winrtUwp.Windows.ApplicationModel.Calls.Background.PhoneLineChangedTriggerDetails
  
  /** Used to provide the details about a new voice mail message on a phone line. */
  @js.native
  abstract class PhoneNewVoicemailMessageTriggerDetails ()
    extends typings.winrtUwp.Windows.ApplicationModel.Calls.Background.PhoneNewVoicemailMessageTriggerDetails
  
  /** Provides the reason why a phone call was rejected. */
  @js.native
  object PhoneCallBlockedReason extends js.Object {
    /* 0 */ val inCallBlockingList: typings.winrtUwp.Windows.ApplicationModel.Calls.Background.PhoneCallBlockedReason.inCallBlockingList with Double = js.native
    /* 1 */ val privateNumber: typings.winrtUwp.Windows.ApplicationModel.Calls.Background.PhoneCallBlockedReason.privateNumber with Double = js.native
    /* 2 */ val unknownNumber: typings.winrtUwp.Windows.ApplicationModel.Calls.Background.PhoneCallBlockedReason.unknownNumber with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.winrtUwp.Windows.ApplicationModel.Calls.Background.PhoneCallBlockedReason with Double
      ] = js.native
  }
  
  /** Indicates the type of change for a background phone line change trigger. */
  @js.native
  object PhoneLineChangeKind extends js.Object {
    /* 0 */ val added: typings.winrtUwp.Windows.ApplicationModel.Calls.Background.PhoneLineChangeKind.added with Double = js.native
    /* 2 */ val propertiesChanged: typings.winrtUwp.Windows.ApplicationModel.Calls.Background.PhoneLineChangeKind.propertiesChanged with Double = js.native
    /* 1 */ val removed: typings.winrtUwp.Windows.ApplicationModel.Calls.Background.PhoneLineChangeKind.removed with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.winrtUwp.Windows.ApplicationModel.Calls.Background.PhoneLineChangeKind with Double
      ] = js.native
  }
  
  /** Indicates a set of property flags that are part of a phone line changed trigger. Multiple properties can be set at one time. */
  @js.native
  object PhoneLineProperties extends js.Object {
    /* 1 */ val brandingOptions: typings.winrtUwp.Windows.ApplicationModel.Calls.Background.PhoneLineProperties.brandingOptions with Double = js.native
    /* 2 */ val canDial: typings.winrtUwp.Windows.ApplicationModel.Calls.Background.PhoneLineProperties.canDial with Double = js.native
    /* 3 */ val cellularDetails: typings.winrtUwp.Windows.ApplicationModel.Calls.Background.PhoneLineProperties.cellularDetails with Double = js.native
    /* 4 */ val displayColor: typings.winrtUwp.Windows.ApplicationModel.Calls.Background.PhoneLineProperties.displayColor with Double = js.native
    /* 5 */ val displayName: typings.winrtUwp.Windows.ApplicationModel.Calls.Background.PhoneLineProperties.displayName with Double = js.native
    /* 6 */ val networkName: typings.winrtUwp.Windows.ApplicationModel.Calls.Background.PhoneLineProperties.networkName with Double = js.native
    /* 7 */ val networkState: typings.winrtUwp.Windows.ApplicationModel.Calls.Background.PhoneLineProperties.networkState with Double = js.native
    /* 0 */ val none: typings.winrtUwp.Windows.ApplicationModel.Calls.Background.PhoneLineProperties.none with Double = js.native
    /* 8 */ val transport: typings.winrtUwp.Windows.ApplicationModel.Calls.Background.PhoneLineProperties.transport with Double = js.native
    /* 9 */ val voicemail: typings.winrtUwp.Windows.ApplicationModel.Calls.Background.PhoneLineProperties.voicemail with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.winrtUwp.Windows.ApplicationModel.Calls.Background.PhoneLineProperties with Double
      ] = js.native
  }
  
  /** Indicates a type of event for a phone trigger. */
  @js.native
  object PhoneTriggerType extends js.Object {
    /* 3 */ val airplaneModeDisabledForEmergencyCall: typings.winrtUwp.Windows.ApplicationModel.Calls.Background.PhoneTriggerType.airplaneModeDisabledForEmergencyCall with Double = js.native
    /* 5 */ val callBlocked: typings.winrtUwp.Windows.ApplicationModel.Calls.Background.PhoneTriggerType.callBlocked with Double = js.native
    /* 1 */ val callHistoryChanged: typings.winrtUwp.Windows.ApplicationModel.Calls.Background.PhoneTriggerType.callHistoryChanged with Double = js.native
    /* 4 */ val callOriginDataRequest: typings.winrtUwp.Windows.ApplicationModel.Calls.Background.PhoneTriggerType.callOriginDataRequest with Double = js.native
    /* 2 */ val lineChanged: typings.winrtUwp.Windows.ApplicationModel.Calls.Background.PhoneTriggerType.lineChanged with Double = js.native
    /* 0 */ val newVoicemailMessage: typings.winrtUwp.Windows.ApplicationModel.Calls.Background.PhoneTriggerType.newVoicemailMessage with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.winrtUwp.Windows.ApplicationModel.Calls.Background.PhoneTriggerType with Double
      ] = js.native
  }
  
}

