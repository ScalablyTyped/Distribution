package typings
package winrtDashUwpLib.WindowsNs.ApplicationModelNs.CallsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A collection of information about a phone call for the call history. */
@JSGlobal("Windows.ApplicationModel.Calls.PhoneCallHistoryEntry")
@js.native
class PhoneCallHistoryEntry () extends js.Object {
  /** Gets or sets the address book information for this phone call. */
  var address: PhoneCallHistoryEntryAddress = js.native
  /** Gets or sets the duration of the call. */
  var duration: scala.Double = js.native
  /** Gets the unique identifier for this log entry. */
  var id: java.lang.String = js.native
  /** Gets or sets a value determining whether the caller ID is blocked for this phone call. */
  var isCallerIdBlocked: scala.Boolean = js.native
  /** Gets or sets a value that determines whether the call is classified as an emergency. */
  var isEmergency: scala.Boolean = js.native
  /** Gets or sets whether a call is an incoming call. */
  var isIncoming: scala.Boolean = js.native
  /** Gets or sets whether a phone call was missed. */
  var isMissed: scala.Boolean = js.native
  /** Gets or sets whether a call is currently ringing. */
  var isRinging: scala.Boolean = js.native
  /** Gets or sets a whether a phone call is seen. */
  var isSeen: scala.Boolean = js.native
  /** Gets or sets whether this entry is suppressed. */
  var isSuppressed: scala.Boolean = js.native
  /** Gets or sets whether the phone call entry is a voicemail message. */
  var isVoicemail: scala.Boolean = js.native
  /** Gets or sets the type of media associated with a call. */
  var media: PhoneCallHistoryEntryMedia = js.native
  /** Gets or sets the level of access provided to other applications. */
  var otherAppReadAccess: PhoneCallHistoryEntryOtherAppReadAccess = js.native
  /** Gets or sets the remote id for the entry. */
  var remoteId: java.lang.String = js.native
  /** Gets the display name for the source of the phone call. */
  var sourceDisplayName: java.lang.String = js.native
  /** Gets or sets the identifier for the source of the phone call. */
  var sourceId: java.lang.String = js.native
  /** Gets or sets a value that indicates what type of identifier the SourceId is. */
  var sourceIdKind: PhoneCallHistorySourceIdKind = js.native
  /** Gets or sets the start time for this history entry. */
  var startTime: stdLib.Date = js.native
}

