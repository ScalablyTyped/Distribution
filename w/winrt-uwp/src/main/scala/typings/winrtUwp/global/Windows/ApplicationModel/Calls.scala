package typings.winrtUwp.global.Windows.ApplicationModel

import typings.winrtUwp.Windows.ApplicationModel.Calls.PhoneCallHistoryEntryRawAddressKind
import typings.winrtUwp.Windows.ApplicationModel.Calls.PhoneCallHistoryStoreAccessType
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Controls multiple aspects of how an application on the phone behaves, including lock-screen interaction, the phone call history, and various telephony options and information. */
object Calls {
  
  /** The classes in Windows.ApplicationModel.Calls.Background are used by device background tasks to handle changes to phone lines, call states, and voice mail counts for the device. */
  object Background {
    
    /** Provides the reason why a phone call was rejected. */
    @JSGlobal("Windows.ApplicationModel.Calls.Background.PhoneCallBlockedReason")
    @js.native
    object PhoneCallBlockedReason extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[
            typings.winrtUwp.Windows.ApplicationModel.Calls.Background.PhoneCallBlockedReason with Double
          ] = js.native
      
      /* 0 */ val inCallBlockingList: typings.winrtUwp.Windows.ApplicationModel.Calls.Background.PhoneCallBlockedReason.inCallBlockingList with Double = js.native
      
      /* 1 */ val privateNumber: typings.winrtUwp.Windows.ApplicationModel.Calls.Background.PhoneCallBlockedReason.privateNumber with Double = js.native
      
      /* 2 */ val unknownNumber: typings.winrtUwp.Windows.ApplicationModel.Calls.Background.PhoneCallBlockedReason.unknownNumber with Double = js.native
    }
    
    /** Used to provide the details about a call that was just blocked. */
    @JSGlobal("Windows.ApplicationModel.Calls.Background.PhoneCallBlockedTriggerDetails")
    @js.native
    abstract class PhoneCallBlockedTriggerDetails ()
      extends typings.winrtUwp.Windows.ApplicationModel.Calls.Background.PhoneCallBlockedTriggerDetails
    
    /** Used to provide the origin details of the phone call. */
    @JSGlobal("Windows.ApplicationModel.Calls.Background.PhoneCallOriginDataRequestTriggerDetails")
    @js.native
    abstract class PhoneCallOriginDataRequestTriggerDetails ()
      extends typings.winrtUwp.Windows.ApplicationModel.Calls.Background.PhoneCallOriginDataRequestTriggerDetails
    
    /** Indicates the type of change for a background phone line change trigger. */
    @JSGlobal("Windows.ApplicationModel.Calls.Background.PhoneLineChangeKind")
    @js.native
    object PhoneLineChangeKind extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[
            typings.winrtUwp.Windows.ApplicationModel.Calls.Background.PhoneLineChangeKind with Double
          ] = js.native
      
      /* 0 */ val added: typings.winrtUwp.Windows.ApplicationModel.Calls.Background.PhoneLineChangeKind.added with Double = js.native
      
      /* 2 */ val propertiesChanged: typings.winrtUwp.Windows.ApplicationModel.Calls.Background.PhoneLineChangeKind.propertiesChanged with Double = js.native
      
      /* 1 */ val removed: typings.winrtUwp.Windows.ApplicationModel.Calls.Background.PhoneLineChangeKind.removed with Double = js.native
    }
    
    /** Used to provide the details about a change to the properties of a phone line. */
    @JSGlobal("Windows.ApplicationModel.Calls.Background.PhoneLineChangedTriggerDetails")
    @js.native
    abstract class PhoneLineChangedTriggerDetails ()
      extends typings.winrtUwp.Windows.ApplicationModel.Calls.Background.PhoneLineChangedTriggerDetails
    
    /** Indicates a set of property flags that are part of a phone line changed trigger. Multiple properties can be set at one time. */
    @JSGlobal("Windows.ApplicationModel.Calls.Background.PhoneLineProperties")
    @js.native
    object PhoneLineProperties extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[
            typings.winrtUwp.Windows.ApplicationModel.Calls.Background.PhoneLineProperties with Double
          ] = js.native
      
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
    }
    
    /** Used to provide the details about a new voice mail message on a phone line. */
    @JSGlobal("Windows.ApplicationModel.Calls.Background.PhoneNewVoicemailMessageTriggerDetails")
    @js.native
    abstract class PhoneNewVoicemailMessageTriggerDetails ()
      extends typings.winrtUwp.Windows.ApplicationModel.Calls.Background.PhoneNewVoicemailMessageTriggerDetails
    
    /** Indicates a type of event for a phone trigger. */
    @JSGlobal("Windows.ApplicationModel.Calls.Background.PhoneTriggerType")
    @js.native
    object PhoneTriggerType extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[
            typings.winrtUwp.Windows.ApplicationModel.Calls.Background.PhoneTriggerType with Double
          ] = js.native
      
      /* 3 */ val airplaneModeDisabledForEmergencyCall: typings.winrtUwp.Windows.ApplicationModel.Calls.Background.PhoneTriggerType.airplaneModeDisabledForEmergencyCall with Double = js.native
      
      /* 5 */ val callBlocked: typings.winrtUwp.Windows.ApplicationModel.Calls.Background.PhoneTriggerType.callBlocked with Double = js.native
      
      /* 1 */ val callHistoryChanged: typings.winrtUwp.Windows.ApplicationModel.Calls.Background.PhoneTriggerType.callHistoryChanged with Double = js.native
      
      /* 4 */ val callOriginDataRequest: typings.winrtUwp.Windows.ApplicationModel.Calls.Background.PhoneTriggerType.callOriginDataRequest with Double = js.native
      
      /* 2 */ val lineChanged: typings.winrtUwp.Windows.ApplicationModel.Calls.Background.PhoneTriggerType.lineChanged with Double = js.native
      
      /* 0 */ val newVoicemailMessage: typings.winrtUwp.Windows.ApplicationModel.Calls.Background.PhoneTriggerType.newVoicemailMessage with Double = js.native
    }
  }
  
  /** The LockScreenCallEndCallDeferral object signals when the app no longer needs to defer the removal of itself from the lock screen. */
  @JSGlobal("Windows.ApplicationModel.Calls.LockScreenCallEndCallDeferral")
  @js.native
  abstract class LockScreenCallEndCallDeferral ()
    extends typings.winrtUwp.Windows.ApplicationModel.Calls.LockScreenCallEndCallDeferral
  
  /** Controls the removal of an app from the lock screen. */
  @JSGlobal("Windows.ApplicationModel.Calls.LockScreenCallEndRequestedEventArgs")
  @js.native
  abstract class LockScreenCallEndRequestedEventArgs ()
    extends typings.winrtUwp.Windows.ApplicationModel.Calls.LockScreenCallEndRequestedEventArgs
  
  /** Handles communication to and from the lock screen. */
  @JSGlobal("Windows.ApplicationModel.Calls.LockScreenCallUI")
  @js.native
  abstract class LockScreenCallUI ()
    extends typings.winrtUwp.Windows.ApplicationModel.Calls.LockScreenCallUI
  
  /** A collection of information about a phone call for the call history. */
  @JSGlobal("Windows.ApplicationModel.Calls.PhoneCallHistoryEntry")
  @js.native
  /** Creates a new PhoneCallHistoryEntry object. */
  class PhoneCallHistoryEntry ()
    extends typings.winrtUwp.Windows.ApplicationModel.Calls.PhoneCallHistoryEntry
  
  /** Address book information for a contact used by PhoneCallHistoryEntry objects. */
  @JSGlobal("Windows.ApplicationModel.Calls.PhoneCallHistoryEntryAddress")
  @js.native
  /** Creates a new empty PhoneCallHistoryEntryAddress object. */
  class PhoneCallHistoryEntryAddress ()
    extends typings.winrtUwp.Windows.ApplicationModel.Calls.PhoneCallHistoryEntryAddress {
    /**
      * Creates a new PhoneCallHistoryEntryAddress object with an initial address.
      * @param rawAddress The address to initiailize to the RawAddress property.
      * @param rawAddressKind The type of address represented by rawAddress.
      */
    def this(rawAddress: String, rawAddressKind: PhoneCallHistoryEntryRawAddressKind) = this()
  }
  
  /** The type of media associated with a call. */
  @JSGlobal("Windows.ApplicationModel.Calls.PhoneCallHistoryEntryMedia")
  @js.native
  object PhoneCallHistoryEntryMedia extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.winrtUwp.Windows.ApplicationModel.Calls.PhoneCallHistoryEntryMedia with Double
      ] = js.native
    
    /* 0 */ val audio: typings.winrtUwp.Windows.ApplicationModel.Calls.PhoneCallHistoryEntryMedia.audio with Double = js.native
    
    /* 1 */ val video: typings.winrtUwp.Windows.ApplicationModel.Calls.PhoneCallHistoryEntryMedia.video with Double = js.native
  }
  
  /** The level of read access provided to other applications. */
  @JSGlobal("Windows.ApplicationModel.Calls.PhoneCallHistoryEntryOtherAppReadAccess")
  @js.native
  object PhoneCallHistoryEntryOtherAppReadAccess extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.winrtUwp.Windows.ApplicationModel.Calls.PhoneCallHistoryEntryOtherAppReadAccess with Double
      ] = js.native
    
    /* 0 */ val full: typings.winrtUwp.Windows.ApplicationModel.Calls.PhoneCallHistoryEntryOtherAppReadAccess.full with Double = js.native
    
    /* 1 */ val systemOnly: typings.winrtUwp.Windows.ApplicationModel.Calls.PhoneCallHistoryEntryOtherAppReadAccess.systemOnly with Double = js.native
  }
  
  /** A filter used to retrieve call entries based on the contained media. */
  @JSGlobal("Windows.ApplicationModel.Calls.PhoneCallHistoryEntryQueryDesiredMedia")
  @js.native
  object PhoneCallHistoryEntryQueryDesiredMedia extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.winrtUwp.Windows.ApplicationModel.Calls.PhoneCallHistoryEntryQueryDesiredMedia with Double
      ] = js.native
    
    /* 3 */ val all: typings.winrtUwp.Windows.ApplicationModel.Calls.PhoneCallHistoryEntryQueryDesiredMedia.all with Double = js.native
    
    /* 1 */ val audio: typings.winrtUwp.Windows.ApplicationModel.Calls.PhoneCallHistoryEntryQueryDesiredMedia.audio with Double = js.native
    
    /* 0 */ val none: typings.winrtUwp.Windows.ApplicationModel.Calls.PhoneCallHistoryEntryQueryDesiredMedia.none with Double = js.native
    
    /* 2 */ val video: typings.winrtUwp.Windows.ApplicationModel.Calls.PhoneCallHistoryEntryQueryDesiredMedia.video with Double = js.native
  }
  
  /** Options for querying the phone call entries. */
  @JSGlobal("Windows.ApplicationModel.Calls.PhoneCallHistoryEntryQueryOptions")
  @js.native
  /** Creates a new PhoneCallHistoryEntryQueryOptions object. */
  class PhoneCallHistoryEntryQueryOptions ()
    extends typings.winrtUwp.Windows.ApplicationModel.Calls.PhoneCallHistoryEntryQueryOptions
  
  /** The type of address used by the PhoneCallHistoryEntryAddress . */
  @JSGlobal("Windows.ApplicationModel.Calls.PhoneCallHistoryEntryRawAddressKind")
  @js.native
  object PhoneCallHistoryEntryRawAddressKind extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.winrtUwp.Windows.ApplicationModel.Calls.PhoneCallHistoryEntryRawAddressKind with Double
      ] = js.native
    
    /* 1 */ val custom: typings.winrtUwp.Windows.ApplicationModel.Calls.PhoneCallHistoryEntryRawAddressKind.custom with Double = js.native
    
    /* 0 */ val phoneNumber: typings.winrtUwp.Windows.ApplicationModel.Calls.PhoneCallHistoryEntryRawAddressKind.phoneNumber with Double = js.native
  }
  
  /** Enables the calling app to read through the phone call history entries. */
  @JSGlobal("Windows.ApplicationModel.Calls.PhoneCallHistoryEntryReader")
  @js.native
  abstract class PhoneCallHistoryEntryReader ()
    extends typings.winrtUwp.Windows.ApplicationModel.Calls.PhoneCallHistoryEntryReader
  
  /** Provides APIs for the application to get access to the PhoneCallHistoryStore . */
  @JSGlobal("Windows.ApplicationModel.Calls.PhoneCallHistoryManager")
  @js.native
  abstract class PhoneCallHistoryManager ()
    extends typings.winrtUwp.Windows.ApplicationModel.Calls.PhoneCallHistoryManager
  object PhoneCallHistoryManager {
    
    /**
      * Requests the PhoneCallHistoryStore associated with the calling application.
      * @param accessType The type of access requested for the PhoneCallHistoryStore object.
      * @return An asynchronous operation that returns a PhoneCallHistoryStore object on successful completion.
      */
    /* static member */
    @JSGlobal("Windows.ApplicationModel.Calls.PhoneCallHistoryManager.requestStoreAsync")
    @js.native
    def requestStoreAsync(accessType: PhoneCallHistoryStoreAccessType): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.ApplicationModel.Calls.PhoneCallHistoryStore] = js.native
  }
  
  /** The type of identifier that the PhoneCallHistoryEntry.SourceId refers to. */
  @JSGlobal("Windows.ApplicationModel.Calls.PhoneCallHistorySourceIdKind")
  @js.native
  object PhoneCallHistorySourceIdKind extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.winrtUwp.Windows.ApplicationModel.Calls.PhoneCallHistorySourceIdKind with Double
      ] = js.native
    
    /* 0 */ val cellularPhoneLineId: typings.winrtUwp.Windows.ApplicationModel.Calls.PhoneCallHistorySourceIdKind.cellularPhoneLineId with Double = js.native
    
    /* 1 */ val packageFamilyName: typings.winrtUwp.Windows.ApplicationModel.Calls.PhoneCallHistorySourceIdKind.packageFamilyName with Double = js.native
  }
  
  /** A collection of phone call history entries. */
  @JSGlobal("Windows.ApplicationModel.Calls.PhoneCallHistoryStore")
  @js.native
  abstract class PhoneCallHistoryStore ()
    extends typings.winrtUwp.Windows.ApplicationModel.Calls.PhoneCallHistoryStore
  
  /** The type of store you want to retrieve. */
  @JSGlobal("Windows.ApplicationModel.Calls.PhoneCallHistoryStoreAccessType")
  @js.native
  object PhoneCallHistoryStoreAccessType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.winrtUwp.Windows.ApplicationModel.Calls.PhoneCallHistoryStoreAccessType with Double
      ] = js.native
    
    /* 1 */ val allEntriesLimitedReadWrite: typings.winrtUwp.Windows.ApplicationModel.Calls.PhoneCallHistoryStoreAccessType.allEntriesLimitedReadWrite with Double = js.native
    
    /* 2 */ val allEntriesReadWrite: typings.winrtUwp.Windows.ApplicationModel.Calls.PhoneCallHistoryStoreAccessType.allEntriesReadWrite with Double = js.native
    
    /* 0 */ val appEntriesReadWrite: typings.winrtUwp.Windows.ApplicationModel.Calls.PhoneCallHistoryStoreAccessType.appEntriesReadWrite with Double = js.native
  }
}
