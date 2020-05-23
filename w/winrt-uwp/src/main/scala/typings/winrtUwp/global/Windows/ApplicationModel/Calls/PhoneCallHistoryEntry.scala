package typings.winrtUwp.global.Windows.ApplicationModel.Calls

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A collection of information about a phone call for the call history. */
@JSGlobal("Windows.ApplicationModel.Calls.PhoneCallHistoryEntry")
@js.native
/** Creates a new PhoneCallHistoryEntry object. */
class PhoneCallHistoryEntry ()
  extends typings.winrtUwp.Windows.ApplicationModel.Calls.PhoneCallHistoryEntry {
  /** Gets or sets the address book information for this phone call. */
  /* CompleteClass */
  override var address: typings.winrtUwp.Windows.ApplicationModel.Calls.PhoneCallHistoryEntryAddress = js.native
  /** Gets or sets the duration of the call. */
  /* CompleteClass */
  override var duration: Double = js.native
  /** Gets the unique identifier for this log entry. */
  /* CompleteClass */
  override var id: String = js.native
  /** Gets or sets a value determining whether the caller ID is blocked for this phone call. */
  /* CompleteClass */
  override var isCallerIdBlocked: Boolean = js.native
  /** Gets or sets a value that determines whether the call is classified as an emergency. */
  /* CompleteClass */
  override var isEmergency: Boolean = js.native
  /** Gets or sets whether a call is an incoming call. */
  /* CompleteClass */
  override var isIncoming: Boolean = js.native
  /** Gets or sets whether a phone call was missed. */
  /* CompleteClass */
  override var isMissed: Boolean = js.native
  /** Gets or sets whether a call is currently ringing. */
  /* CompleteClass */
  override var isRinging: Boolean = js.native
  /** Gets or sets a whether a phone call is seen. */
  /* CompleteClass */
  override var isSeen: Boolean = js.native
  /** Gets or sets whether this entry is suppressed. */
  /* CompleteClass */
  override var isSuppressed: Boolean = js.native
  /** Gets or sets whether the phone call entry is a voicemail message. */
  /* CompleteClass */
  override var isVoicemail: Boolean = js.native
  /** Gets or sets the type of media associated with a call. */
  /* CompleteClass */
  override var media: typings.winrtUwp.Windows.ApplicationModel.Calls.PhoneCallHistoryEntryMedia = js.native
  /** Gets or sets the level of access provided to other applications. */
  /* CompleteClass */
  override var otherAppReadAccess: typings.winrtUwp.Windows.ApplicationModel.Calls.PhoneCallHistoryEntryOtherAppReadAccess = js.native
  /** Gets or sets the remote id for the entry. */
  /* CompleteClass */
  override var remoteId: String = js.native
  /** Gets the display name for the source of the phone call. */
  /* CompleteClass */
  override var sourceDisplayName: String = js.native
  /** Gets or sets the identifier for the source of the phone call. */
  /* CompleteClass */
  override var sourceId: String = js.native
  /** Gets or sets a value that indicates what type of identifier the SourceId is. */
  /* CompleteClass */
  override var sourceIdKind: typings.winrtUwp.Windows.ApplicationModel.Calls.PhoneCallHistorySourceIdKind = js.native
  /** Gets or sets the start time for this history entry. */
  /* CompleteClass */
  override var startTime: Date = js.native
}

