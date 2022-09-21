package typings.winrtUwp.global.Windows.ApplicationModel

import typings.winrtUwp.Windows.ApplicationModel.Calls.Background.PhoneCallBlockedReason
import typings.winrtUwp.Windows.ApplicationModel.Calls.Background.PhoneLineChangeKind
import typings.winrtUwp.Windows.ApplicationModel.Calls.Background.PhoneLineProperties
import typings.winrtUwp.Windows.ApplicationModel.Calls.PhoneCallHistoryEntryMedia
import typings.winrtUwp.Windows.ApplicationModel.Calls.PhoneCallHistoryEntryOtherAppReadAccess
import typings.winrtUwp.Windows.ApplicationModel.Calls.PhoneCallHistoryEntryQueryDesiredMedia
import typings.winrtUwp.Windows.ApplicationModel.Calls.PhoneCallHistoryEntryRawAddressKind
import typings.winrtUwp.Windows.ApplicationModel.Calls.PhoneCallHistorySourceIdKind
import typings.winrtUwp.Windows.ApplicationModel.Calls.PhoneCallHistoryStoreAccessType
import typings.winrtUwp.Windows.Foundation.Collections.IVector
import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
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
            typings.winrtUwp.Windows.ApplicationModel.Calls.Background.PhoneCallBlockedReason & Double
          ] = js.native
      
      /* 0 */ val inCallBlockingList: typings.winrtUwp.Windows.ApplicationModel.Calls.Background.PhoneCallBlockedReason.inCallBlockingList & Double = js.native
      
      /* 1 */ val privateNumber: typings.winrtUwp.Windows.ApplicationModel.Calls.Background.PhoneCallBlockedReason.privateNumber & Double = js.native
      
      /* 2 */ val unknownNumber: typings.winrtUwp.Windows.ApplicationModel.Calls.Background.PhoneCallBlockedReason.unknownNumber & Double = js.native
    }
    
    /** Used to provide the details about a call that was just blocked. */
    @JSGlobal("Windows.ApplicationModel.Calls.Background.PhoneCallBlockedTriggerDetails")
    @js.native
    abstract class PhoneCallBlockedTriggerDetails ()
      extends StObject
         with typings.winrtUwp.Windows.ApplicationModel.Calls.Background.PhoneCallBlockedTriggerDetails {
      
      /** Gets the reason why a phone call was blocked. */
      /* CompleteClass */
      var callBlockedReason: PhoneCallBlockedReason = js.native
      
      /** Gets the ID of the phone call that was just blocked. */
      /* CompleteClass */
      var lineId: String = js.native
      
      /** Gets the phone number of the blocked call. */
      /* CompleteClass */
      var phoneNumber: String = js.native
    }
    
    /** Used to provide the origin details of the phone call. */
    @JSGlobal("Windows.ApplicationModel.Calls.Background.PhoneCallOriginDataRequestTriggerDetails")
    @js.native
    abstract class PhoneCallOriginDataRequestTriggerDetails ()
      extends StObject
         with typings.winrtUwp.Windows.ApplicationModel.Calls.Background.PhoneCallOriginDataRequestTriggerDetails {
      
      /** Gets the phone number for the origin of the phone call. */
      /* CompleteClass */
      var phoneNumber: String = js.native
      
      /** Gets the unique identifier for this phone call. */
      /* CompleteClass */
      var requestId: String = js.native
    }
    
    /** Indicates the type of change for a background phone line change trigger. */
    @JSGlobal("Windows.ApplicationModel.Calls.Background.PhoneLineChangeKind")
    @js.native
    object PhoneLineChangeKind extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[
            typings.winrtUwp.Windows.ApplicationModel.Calls.Background.PhoneLineChangeKind & Double
          ] = js.native
      
      /* 0 */ val added: typings.winrtUwp.Windows.ApplicationModel.Calls.Background.PhoneLineChangeKind.added & Double = js.native
      
      /* 2 */ val propertiesChanged: typings.winrtUwp.Windows.ApplicationModel.Calls.Background.PhoneLineChangeKind.propertiesChanged & Double = js.native
      
      /* 1 */ val removed: typings.winrtUwp.Windows.ApplicationModel.Calls.Background.PhoneLineChangeKind.removed & Double = js.native
    }
    
    /** Used to provide the details about a change to the properties of a phone line. */
    @JSGlobal("Windows.ApplicationModel.Calls.Background.PhoneLineChangedTriggerDetails")
    @js.native
    abstract class PhoneLineChangedTriggerDetails ()
      extends StObject
         with typings.winrtUwp.Windows.ApplicationModel.Calls.Background.PhoneLineChangedTriggerDetails {
      
      /** Gets a PhoneLineChangeKind value that indicates if the phone line was added, removed, or changed. */
      /* CompleteClass */
      var changeType: PhoneLineChangeKind = js.native
      
      /**
        * Checks a phone line against a set of flags to see if any of the specified properties of the phone line have changed.
        * @param lineProperty A set of flags which indicate the phone line properties to query for changes.
        * @return Returns true if any of the properties indicated by the lineProperty parameter have changed on the phone line.
        */
      /* CompleteClass */
      override def hasLinePropertyChanged(lineProperty: PhoneLineProperties): Boolean = js.native
      
      /** Gets the ID of the phone line that was added, removed, or changed. */
      /* CompleteClass */
      var lineId: String = js.native
    }
    
    /** Indicates a set of property flags that are part of a phone line changed trigger. Multiple properties can be set at one time. */
    @JSGlobal("Windows.ApplicationModel.Calls.Background.PhoneLineProperties")
    @js.native
    object PhoneLineProperties extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[
            typings.winrtUwp.Windows.ApplicationModel.Calls.Background.PhoneLineProperties & Double
          ] = js.native
      
      /* 1 */ val brandingOptions: typings.winrtUwp.Windows.ApplicationModel.Calls.Background.PhoneLineProperties.brandingOptions & Double = js.native
      
      /* 2 */ val canDial: typings.winrtUwp.Windows.ApplicationModel.Calls.Background.PhoneLineProperties.canDial & Double = js.native
      
      /* 3 */ val cellularDetails: typings.winrtUwp.Windows.ApplicationModel.Calls.Background.PhoneLineProperties.cellularDetails & Double = js.native
      
      /* 4 */ val displayColor: typings.winrtUwp.Windows.ApplicationModel.Calls.Background.PhoneLineProperties.displayColor & Double = js.native
      
      /* 5 */ val displayName: typings.winrtUwp.Windows.ApplicationModel.Calls.Background.PhoneLineProperties.displayName & Double = js.native
      
      /* 6 */ val networkName: typings.winrtUwp.Windows.ApplicationModel.Calls.Background.PhoneLineProperties.networkName & Double = js.native
      
      /* 7 */ val networkState: typings.winrtUwp.Windows.ApplicationModel.Calls.Background.PhoneLineProperties.networkState & Double = js.native
      
      /* 0 */ val none: typings.winrtUwp.Windows.ApplicationModel.Calls.Background.PhoneLineProperties.none & Double = js.native
      
      /* 8 */ val transport: typings.winrtUwp.Windows.ApplicationModel.Calls.Background.PhoneLineProperties.transport & Double = js.native
      
      /* 9 */ val voicemail: typings.winrtUwp.Windows.ApplicationModel.Calls.Background.PhoneLineProperties.voicemail & Double = js.native
    }
    
    /** Used to provide the details about a new voice mail message on a phone line. */
    @JSGlobal("Windows.ApplicationModel.Calls.Background.PhoneNewVoicemailMessageTriggerDetails")
    @js.native
    abstract class PhoneNewVoicemailMessageTriggerDetails ()
      extends StObject
         with typings.winrtUwp.Windows.ApplicationModel.Calls.Background.PhoneNewVoicemailMessageTriggerDetails {
      
      /** Gets the ID of the phone line for which the new voice mail arrived. */
      /* CompleteClass */
      var lineId: String = js.native
      
      /** Gets the optional voice mail changed message set by an operator when they send a voice mail changed SMS. */
      /* CompleteClass */
      var operatorMessage: String = js.native
      
      /** Gets the new count of voice mail messages for the phone line. */
      /* CompleteClass */
      var voicemailCount: Double = js.native
    }
    
    /** Indicates a type of event for a phone trigger. */
    @JSGlobal("Windows.ApplicationModel.Calls.Background.PhoneTriggerType")
    @js.native
    object PhoneTriggerType extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[
            typings.winrtUwp.Windows.ApplicationModel.Calls.Background.PhoneTriggerType & Double
          ] = js.native
      
      /* 3 */ val airplaneModeDisabledForEmergencyCall: typings.winrtUwp.Windows.ApplicationModel.Calls.Background.PhoneTriggerType.airplaneModeDisabledForEmergencyCall & Double = js.native
      
      /* 5 */ val callBlocked: typings.winrtUwp.Windows.ApplicationModel.Calls.Background.PhoneTriggerType.callBlocked & Double = js.native
      
      /* 1 */ val callHistoryChanged: typings.winrtUwp.Windows.ApplicationModel.Calls.Background.PhoneTriggerType.callHistoryChanged & Double = js.native
      
      /* 4 */ val callOriginDataRequest: typings.winrtUwp.Windows.ApplicationModel.Calls.Background.PhoneTriggerType.callOriginDataRequest & Double = js.native
      
      /* 2 */ val lineChanged: typings.winrtUwp.Windows.ApplicationModel.Calls.Background.PhoneTriggerType.lineChanged & Double = js.native
      
      /* 0 */ val newVoicemailMessage: typings.winrtUwp.Windows.ApplicationModel.Calls.Background.PhoneTriggerType.newVoicemailMessage & Double = js.native
    }
  }
  
  /** The LockScreenCallEndCallDeferral object signals when the app no longer needs to defer the removal of itself from the lock screen. */
  @JSGlobal("Windows.ApplicationModel.Calls.LockScreenCallEndCallDeferral")
  @js.native
  abstract class LockScreenCallEndCallDeferral ()
    extends StObject
       with typings.winrtUwp.Windows.ApplicationModel.Calls.LockScreenCallEndCallDeferral {
    
    /** Completes the deferral of the removal of the app from the lock screen, which causes the app to be removed from the lock screen if it hasn't already been removed by other means. */
    /* CompleteClass */
    override def complete(): Unit = js.native
  }
  
  /** Controls the removal of an app from the lock screen. */
  @JSGlobal("Windows.ApplicationModel.Calls.LockScreenCallEndRequestedEventArgs")
  @js.native
  abstract class LockScreenCallEndRequestedEventArgs ()
    extends StObject
       with typings.winrtUwp.Windows.ApplicationModel.Calls.LockScreenCallEndRequestedEventArgs {
    
    /** Gets the deadline by which the app must complete the deferral. */
    /* CompleteClass */
    var deadline: js.Date = js.native
    
    /**
      * Requests to defer the default behavior of removing the app from the lock screen.
      * @return When this method completes, it returns a LockScreenCallEndCallDeferral object that signals when the app no longer needs to defer the removal of itself from the lock screen.
      */
    /* CompleteClass */
    override def getDeferral(): typings.winrtUwp.Windows.ApplicationModel.Calls.LockScreenCallEndCallDeferral = js.native
  }
  
  /** Handles communication to and from the lock screen. */
  @JSGlobal("Windows.ApplicationModel.Calls.LockScreenCallUI")
  @js.native
  abstract class LockScreenCallUI ()
    extends StObject
       with typings.winrtUwp.Windows.ApplicationModel.Calls.LockScreenCallUI
  
  /** A collection of information about a phone call for the call history. */
  @JSGlobal("Windows.ApplicationModel.Calls.PhoneCallHistoryEntry")
  @js.native
  /** Creates a new PhoneCallHistoryEntry object. */
  open class PhoneCallHistoryEntry ()
    extends StObject
       with typings.winrtUwp.Windows.ApplicationModel.Calls.PhoneCallHistoryEntry {
    
    /** Gets or sets the address book information for this phone call. */
    /* CompleteClass */
    var address: typings.winrtUwp.Windows.ApplicationModel.Calls.PhoneCallHistoryEntryAddress = js.native
    
    /** Gets or sets the duration of the call. */
    /* CompleteClass */
    var duration: Double = js.native
    
    /** Gets the unique identifier for this log entry. */
    /* CompleteClass */
    var id: String = js.native
    
    /** Gets or sets a value determining whether the caller ID is blocked for this phone call. */
    /* CompleteClass */
    var isCallerIdBlocked: Boolean = js.native
    
    /** Gets or sets a value that determines whether the call is classified as an emergency. */
    /* CompleteClass */
    var isEmergency: Boolean = js.native
    
    /** Gets or sets whether a call is an incoming call. */
    /* CompleteClass */
    var isIncoming: Boolean = js.native
    
    /** Gets or sets whether a phone call was missed. */
    /* CompleteClass */
    var isMissed: Boolean = js.native
    
    /** Gets or sets whether a call is currently ringing. */
    /* CompleteClass */
    var isRinging: Boolean = js.native
    
    /** Gets or sets a whether a phone call is seen. */
    /* CompleteClass */
    var isSeen: Boolean = js.native
    
    /** Gets or sets whether this entry is suppressed. */
    /* CompleteClass */
    var isSuppressed: Boolean = js.native
    
    /** Gets or sets whether the phone call entry is a voicemail message. */
    /* CompleteClass */
    var isVoicemail: Boolean = js.native
    
    /** Gets or sets the type of media associated with a call. */
    /* CompleteClass */
    var media: PhoneCallHistoryEntryMedia = js.native
    
    /** Gets or sets the level of access provided to other applications. */
    /* CompleteClass */
    var otherAppReadAccess: PhoneCallHistoryEntryOtherAppReadAccess = js.native
    
    /** Gets or sets the remote id for the entry. */
    /* CompleteClass */
    var remoteId: String = js.native
    
    /** Gets the display name for the source of the phone call. */
    /* CompleteClass */
    var sourceDisplayName: String = js.native
    
    /** Gets or sets the identifier for the source of the phone call. */
    /* CompleteClass */
    var sourceId: String = js.native
    
    /** Gets or sets a value that indicates what type of identifier the SourceId is. */
    /* CompleteClass */
    var sourceIdKind: PhoneCallHistorySourceIdKind = js.native
    
    /** Gets or sets the start time for this history entry. */
    /* CompleteClass */
    var startTime: js.Date = js.native
  }
  
  /** Address book information for a contact used by PhoneCallHistoryEntry objects. */
  @JSGlobal("Windows.ApplicationModel.Calls.PhoneCallHistoryEntryAddress")
  @js.native
  /** Creates a new empty PhoneCallHistoryEntryAddress object. */
  open class PhoneCallHistoryEntryAddress ()
    extends StObject
       with typings.winrtUwp.Windows.ApplicationModel.Calls.PhoneCallHistoryEntryAddress {
    /**
      * Creates a new PhoneCallHistoryEntryAddress object with an initial address.
      * @param rawAddress The address to initiailize to the RawAddress property.
      * @param rawAddressKind The type of address represented by rawAddress.
      */
    def this(rawAddress: String, rawAddressKind: PhoneCallHistoryEntryRawAddressKind) = this()
    
    /** Gets or sets the unique identifier for this contact. */
    /* CompleteClass */
    var contactId: String = js.native
    
    /** Get or sets the display name for this entry. */
    /* CompleteClass */
    var displayName: String = js.native
    
    /** Gets or sets the address information for this contact. */
    /* CompleteClass */
    var rawAddress: String = js.native
    
    /** Gets or sets the type of address indicated by RawAddress . */
    /* CompleteClass */
    var rawAddressKind: PhoneCallHistoryEntryRawAddressKind = js.native
  }
  
  /** The type of media associated with a call. */
  @JSGlobal("Windows.ApplicationModel.Calls.PhoneCallHistoryEntryMedia")
  @js.native
  object PhoneCallHistoryEntryMedia extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.winrtUwp.Windows.ApplicationModel.Calls.PhoneCallHistoryEntryMedia & Double
      ] = js.native
    
    /* 0 */ val audio: typings.winrtUwp.Windows.ApplicationModel.Calls.PhoneCallHistoryEntryMedia.audio & Double = js.native
    
    /* 1 */ val video: typings.winrtUwp.Windows.ApplicationModel.Calls.PhoneCallHistoryEntryMedia.video & Double = js.native
  }
  
  /** The level of read access provided to other applications. */
  @JSGlobal("Windows.ApplicationModel.Calls.PhoneCallHistoryEntryOtherAppReadAccess")
  @js.native
  object PhoneCallHistoryEntryOtherAppReadAccess extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.winrtUwp.Windows.ApplicationModel.Calls.PhoneCallHistoryEntryOtherAppReadAccess & Double
      ] = js.native
    
    /* 0 */ val full: typings.winrtUwp.Windows.ApplicationModel.Calls.PhoneCallHistoryEntryOtherAppReadAccess.full & Double = js.native
    
    /* 1 */ val systemOnly: typings.winrtUwp.Windows.ApplicationModel.Calls.PhoneCallHistoryEntryOtherAppReadAccess.systemOnly & Double = js.native
  }
  
  /** A filter used to retrieve call entries based on the contained media. */
  @JSGlobal("Windows.ApplicationModel.Calls.PhoneCallHistoryEntryQueryDesiredMedia")
  @js.native
  object PhoneCallHistoryEntryQueryDesiredMedia extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.winrtUwp.Windows.ApplicationModel.Calls.PhoneCallHistoryEntryQueryDesiredMedia & Double
      ] = js.native
    
    /* 3 */ val all: typings.winrtUwp.Windows.ApplicationModel.Calls.PhoneCallHistoryEntryQueryDesiredMedia.all & Double = js.native
    
    /* 1 */ val audio: typings.winrtUwp.Windows.ApplicationModel.Calls.PhoneCallHistoryEntryQueryDesiredMedia.audio & Double = js.native
    
    /* 0 */ val none: typings.winrtUwp.Windows.ApplicationModel.Calls.PhoneCallHistoryEntryQueryDesiredMedia.none & Double = js.native
    
    /* 2 */ val video: typings.winrtUwp.Windows.ApplicationModel.Calls.PhoneCallHistoryEntryQueryDesiredMedia.video & Double = js.native
  }
  
  /** Options for querying the phone call entries. */
  @JSGlobal("Windows.ApplicationModel.Calls.PhoneCallHistoryEntryQueryOptions")
  @js.native
  /** Creates a new PhoneCallHistoryEntryQueryOptions object. */
  open class PhoneCallHistoryEntryQueryOptions ()
    extends StObject
       with typings.winrtUwp.Windows.ApplicationModel.Calls.PhoneCallHistoryEntryQueryOptions {
    
    /** Gets or sets the query filter based on the type of media. */
    /* CompleteClass */
    var desiredMedia: PhoneCallHistoryEntryQueryDesiredMedia = js.native
    
    /** Get the query filter based on the source ID of the phone call entry. */
    /* CompleteClass */
    var sourceIds: IVector[String] = js.native
  }
  
  /** The type of address used by the PhoneCallHistoryEntryAddress . */
  @JSGlobal("Windows.ApplicationModel.Calls.PhoneCallHistoryEntryRawAddressKind")
  @js.native
  object PhoneCallHistoryEntryRawAddressKind extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.winrtUwp.Windows.ApplicationModel.Calls.PhoneCallHistoryEntryRawAddressKind & Double
      ] = js.native
    
    /* 1 */ val custom: typings.winrtUwp.Windows.ApplicationModel.Calls.PhoneCallHistoryEntryRawAddressKind.custom & Double = js.native
    
    /* 0 */ val phoneNumber: typings.winrtUwp.Windows.ApplicationModel.Calls.PhoneCallHistoryEntryRawAddressKind.phoneNumber & Double = js.native
  }
  
  /** Enables the calling app to read through the phone call history entries. */
  @JSGlobal("Windows.ApplicationModel.Calls.PhoneCallHistoryEntryReader")
  @js.native
  abstract class PhoneCallHistoryEntryReader ()
    extends StObject
       with typings.winrtUwp.Windows.ApplicationModel.Calls.PhoneCallHistoryEntryReader {
    
    /**
      * Returns a list of the PhoneCallHistoryEntry objects.
      * @return An asynchronous operation that returns an IVectorView upon successful completion.
      */
    /* CompleteClass */
    override def readBatchAsync(): IPromiseWithIAsyncOperation[IVectorView[Any]] = js.native
  }
  
  /** Provides APIs for the application to get access to the PhoneCallHistoryStore . */
  @JSGlobal("Windows.ApplicationModel.Calls.PhoneCallHistoryManager")
  @js.native
  abstract class PhoneCallHistoryManager ()
    extends StObject
       with typings.winrtUwp.Windows.ApplicationModel.Calls.PhoneCallHistoryManager
  object PhoneCallHistoryManager {
    
    @JSGlobal("Windows.ApplicationModel.Calls.PhoneCallHistoryManager")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Requests the PhoneCallHistoryStore associated with the calling application.
      * @param accessType The type of access requested for the PhoneCallHistoryStore object.
      * @return An asynchronous operation that returns a PhoneCallHistoryStore object on successful completion.
      */
    /* static member */
    inline def requestStoreAsync(accessType: PhoneCallHistoryStoreAccessType): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.ApplicationModel.Calls.PhoneCallHistoryStore] = ^.asInstanceOf[js.Dynamic].applyDynamic("requestStoreAsync")(accessType.asInstanceOf[js.Any]).asInstanceOf[IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.ApplicationModel.Calls.PhoneCallHistoryStore]]
  }
  
  /** The type of identifier that the PhoneCallHistoryEntry.SourceId refers to. */
  @JSGlobal("Windows.ApplicationModel.Calls.PhoneCallHistorySourceIdKind")
  @js.native
  object PhoneCallHistorySourceIdKind extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.winrtUwp.Windows.ApplicationModel.Calls.PhoneCallHistorySourceIdKind & Double
      ] = js.native
    
    /* 0 */ val cellularPhoneLineId: typings.winrtUwp.Windows.ApplicationModel.Calls.PhoneCallHistorySourceIdKind.cellularPhoneLineId & Double = js.native
    
    /* 1 */ val packageFamilyName: typings.winrtUwp.Windows.ApplicationModel.Calls.PhoneCallHistorySourceIdKind.packageFamilyName & Double = js.native
  }
  
  /** A collection of phone call history entries. */
  @JSGlobal("Windows.ApplicationModel.Calls.PhoneCallHistoryStore")
  @js.native
  abstract class PhoneCallHistoryStore ()
    extends StObject
       with typings.winrtUwp.Windows.ApplicationModel.Calls.PhoneCallHistoryStore
  
  /** The type of store you want to retrieve. */
  @JSGlobal("Windows.ApplicationModel.Calls.PhoneCallHistoryStoreAccessType")
  @js.native
  object PhoneCallHistoryStoreAccessType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.winrtUwp.Windows.ApplicationModel.Calls.PhoneCallHistoryStoreAccessType & Double
      ] = js.native
    
    /* 1 */ val allEntriesLimitedReadWrite: typings.winrtUwp.Windows.ApplicationModel.Calls.PhoneCallHistoryStoreAccessType.allEntriesLimitedReadWrite & Double = js.native
    
    /* 2 */ val allEntriesReadWrite: typings.winrtUwp.Windows.ApplicationModel.Calls.PhoneCallHistoryStoreAccessType.allEntriesReadWrite & Double = js.native
    
    /* 0 */ val appEntriesReadWrite: typings.winrtUwp.Windows.ApplicationModel.Calls.PhoneCallHistoryStoreAccessType.appEntriesReadWrite & Double = js.native
  }
}
