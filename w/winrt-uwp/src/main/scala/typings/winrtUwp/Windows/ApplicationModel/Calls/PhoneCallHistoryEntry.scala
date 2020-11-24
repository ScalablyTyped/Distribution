package typings.winrtUwp.Windows.ApplicationModel.Calls

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** A collection of information about a phone call for the call history. */
@js.native
trait PhoneCallHistoryEntry extends js.Object {
  
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
object PhoneCallHistoryEntry {
  
  @scala.inline
  def apply(
    address: PhoneCallHistoryEntryAddress,
    duration: Double,
    id: String,
    isCallerIdBlocked: Boolean,
    isEmergency: Boolean,
    isIncoming: Boolean,
    isMissed: Boolean,
    isRinging: Boolean,
    isSeen: Boolean,
    isSuppressed: Boolean,
    isVoicemail: Boolean,
    media: PhoneCallHistoryEntryMedia,
    otherAppReadAccess: PhoneCallHistoryEntryOtherAppReadAccess,
    remoteId: String,
    sourceDisplayName: String,
    sourceId: String,
    sourceIdKind: PhoneCallHistorySourceIdKind,
    startTime: Date
  ): PhoneCallHistoryEntry = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isCallerIdBlocked = isCallerIdBlocked.asInstanceOf[js.Any], isEmergency = isEmergency.asInstanceOf[js.Any], isIncoming = isIncoming.asInstanceOf[js.Any], isMissed = isMissed.asInstanceOf[js.Any], isRinging = isRinging.asInstanceOf[js.Any], isSeen = isSeen.asInstanceOf[js.Any], isSuppressed = isSuppressed.asInstanceOf[js.Any], isVoicemail = isVoicemail.asInstanceOf[js.Any], media = media.asInstanceOf[js.Any], otherAppReadAccess = otherAppReadAccess.asInstanceOf[js.Any], remoteId = remoteId.asInstanceOf[js.Any], sourceDisplayName = sourceDisplayName.asInstanceOf[js.Any], sourceId = sourceId.asInstanceOf[js.Any], sourceIdKind = sourceIdKind.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[PhoneCallHistoryEntry]
  }
  
  @scala.inline
  implicit class PhoneCallHistoryEntryOps[Self <: PhoneCallHistoryEntry] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAddress(value: PhoneCallHistoryEntryAddress): Self = this.set("address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDuration(value: Double): Self = this.set("duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsCallerIdBlocked(value: Boolean): Self = this.set("isCallerIdBlocked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsEmergency(value: Boolean): Self = this.set("isEmergency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsIncoming(value: Boolean): Self = this.set("isIncoming", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsMissed(value: Boolean): Self = this.set("isMissed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsRinging(value: Boolean): Self = this.set("isRinging", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsSeen(value: Boolean): Self = this.set("isSeen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsSuppressed(value: Boolean): Self = this.set("isSuppressed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsVoicemail(value: Boolean): Self = this.set("isVoicemail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMedia(value: PhoneCallHistoryEntryMedia): Self = this.set("media", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOtherAppReadAccess(value: PhoneCallHistoryEntryOtherAppReadAccess): Self = this.set("otherAppReadAccess", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoteId(value: String): Self = this.set("remoteId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceDisplayName(value: String): Self = this.set("sourceDisplayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceId(value: String): Self = this.set("sourceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceIdKind(value: PhoneCallHistorySourceIdKind): Self = this.set("sourceIdKind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartTime(value: Date): Self = this.set("startTime", value.asInstanceOf[js.Any])
  }
}
