package typings.winrtDashUwp.WindowsNs.ApplicationModelNs.CallsNs

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A collection of information about a phone call for the call history. */
@JSGlobal("Windows.ApplicationModel.Calls.PhoneCallHistoryEntry")
@js.native
/** Creates a new PhoneCallHistoryEntry object. */
class PhoneCallHistoryEntry () extends js.Object {
  /** Gets or sets the address book information for this phone call. */
  var address: PhoneCallHistoryEntryAddress = js.native
  /** Gets or sets the duration of the call. */
  var duration: Double = js.native
  /** Gets the unique identifier for this log entry. */
  var id: String = js.native
  /** Gets or sets a value determining whether the caller ID is blocked for this phone call. */
  var isCallerIdBlocked: Boolean = js.native
  /** Gets or sets a value that determines whether the call is classified as an emergency. */
  var isEmergency: Boolean = js.native
  /** Gets or sets whether a call is an incoming call. */
  var isIncoming: Boolean = js.native
  /** Gets or sets whether a phone call was missed. */
  var isMissed: Boolean = js.native
  /** Gets or sets whether a call is currently ringing. */
  var isRinging: Boolean = js.native
  /** Gets or sets a whether a phone call is seen. */
  var isSeen: Boolean = js.native
  /** Gets or sets whether this entry is suppressed. */
  var isSuppressed: Boolean = js.native
  /** Gets or sets whether the phone call entry is a voicemail message. */
  var isVoicemail: Boolean = js.native
  /** Gets or sets the type of media associated with a call. */
  var media: PhoneCallHistoryEntryMedia = js.native
  /** Gets or sets the level of access provided to other applications. */
  var otherAppReadAccess: PhoneCallHistoryEntryOtherAppReadAccess = js.native
  /** Gets or sets the remote id for the entry. */
  var remoteId: String = js.native
  /** Gets the display name for the source of the phone call. */
  var sourceDisplayName: String = js.native
  /** Gets or sets the identifier for the source of the phone call. */
  var sourceId: String = js.native
  /** Gets or sets a value that indicates what type of identifier the SourceId is. */
  var sourceIdKind: PhoneCallHistorySourceIdKind = js.native
  /** Gets or sets the start time for this history entry. */
  var startTime: Date = js.native
}

