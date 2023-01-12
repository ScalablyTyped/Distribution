package typings.winrtUwp.Windows.ApplicationModel.Calls

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** A collection of information about a phone call for the call history. */
trait PhoneCallHistoryEntry extends StObject {
  
  /** Gets or sets the address book information for this phone call. */
  var address: PhoneCallHistoryEntryAddress
  
  /** Gets or sets the duration of the call. */
  var duration: Double
  
  /** Gets the unique identifier for this log entry. */
  var id: String
  
  /** Gets or sets a value determining whether the caller ID is blocked for this phone call. */
  var isCallerIdBlocked: Boolean
  
  /** Gets or sets a value that determines whether the call is classified as an emergency. */
  var isEmergency: Boolean
  
  /** Gets or sets whether a call is an incoming call. */
  var isIncoming: Boolean
  
  /** Gets or sets whether a phone call was missed. */
  var isMissed: Boolean
  
  /** Gets or sets whether a call is currently ringing. */
  var isRinging: Boolean
  
  /** Gets or sets a whether a phone call is seen. */
  var isSeen: Boolean
  
  /** Gets or sets whether this entry is suppressed. */
  var isSuppressed: Boolean
  
  /** Gets or sets whether the phone call entry is a voicemail message. */
  var isVoicemail: Boolean
  
  /** Gets or sets the type of media associated with a call. */
  var media: PhoneCallHistoryEntryMedia
  
  /** Gets or sets the level of access provided to other applications. */
  var otherAppReadAccess: PhoneCallHistoryEntryOtherAppReadAccess
  
  /** Gets or sets the remote id for the entry. */
  var remoteId: String
  
  /** Gets the display name for the source of the phone call. */
  var sourceDisplayName: String
  
  /** Gets or sets the identifier for the source of the phone call. */
  var sourceId: String
  
  /** Gets or sets a value that indicates what type of identifier the SourceId is. */
  var sourceIdKind: PhoneCallHistorySourceIdKind
  
  /** Gets or sets the start time for this history entry. */
  var startTime: js.Date
}
object PhoneCallHistoryEntry {
  
  inline def apply(
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
    startTime: js.Date
  ): PhoneCallHistoryEntry = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isCallerIdBlocked = isCallerIdBlocked.asInstanceOf[js.Any], isEmergency = isEmergency.asInstanceOf[js.Any], isIncoming = isIncoming.asInstanceOf[js.Any], isMissed = isMissed.asInstanceOf[js.Any], isRinging = isRinging.asInstanceOf[js.Any], isSeen = isSeen.asInstanceOf[js.Any], isSuppressed = isSuppressed.asInstanceOf[js.Any], isVoicemail = isVoicemail.asInstanceOf[js.Any], media = media.asInstanceOf[js.Any], otherAppReadAccess = otherAppReadAccess.asInstanceOf[js.Any], remoteId = remoteId.asInstanceOf[js.Any], sourceDisplayName = sourceDisplayName.asInstanceOf[js.Any], sourceId = sourceId.asInstanceOf[js.Any], sourceIdKind = sourceIdKind.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[PhoneCallHistoryEntry]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PhoneCallHistoryEntry] (val x: Self) extends AnyVal {
    
    inline def setAddress(value: PhoneCallHistoryEntryAddress): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIsCallerIdBlocked(value: Boolean): Self = StObject.set(x, "isCallerIdBlocked", value.asInstanceOf[js.Any])
    
    inline def setIsEmergency(value: Boolean): Self = StObject.set(x, "isEmergency", value.asInstanceOf[js.Any])
    
    inline def setIsIncoming(value: Boolean): Self = StObject.set(x, "isIncoming", value.asInstanceOf[js.Any])
    
    inline def setIsMissed(value: Boolean): Self = StObject.set(x, "isMissed", value.asInstanceOf[js.Any])
    
    inline def setIsRinging(value: Boolean): Self = StObject.set(x, "isRinging", value.asInstanceOf[js.Any])
    
    inline def setIsSeen(value: Boolean): Self = StObject.set(x, "isSeen", value.asInstanceOf[js.Any])
    
    inline def setIsSuppressed(value: Boolean): Self = StObject.set(x, "isSuppressed", value.asInstanceOf[js.Any])
    
    inline def setIsVoicemail(value: Boolean): Self = StObject.set(x, "isVoicemail", value.asInstanceOf[js.Any])
    
    inline def setMedia(value: PhoneCallHistoryEntryMedia): Self = StObject.set(x, "media", value.asInstanceOf[js.Any])
    
    inline def setOtherAppReadAccess(value: PhoneCallHistoryEntryOtherAppReadAccess): Self = StObject.set(x, "otherAppReadAccess", value.asInstanceOf[js.Any])
    
    inline def setRemoteId(value: String): Self = StObject.set(x, "remoteId", value.asInstanceOf[js.Any])
    
    inline def setSourceDisplayName(value: String): Self = StObject.set(x, "sourceDisplayName", value.asInstanceOf[js.Any])
    
    inline def setSourceId(value: String): Self = StObject.set(x, "sourceId", value.asInstanceOf[js.Any])
    
    inline def setSourceIdKind(value: PhoneCallHistorySourceIdKind): Self = StObject.set(x, "sourceIdKind", value.asInstanceOf[js.Any])
    
    inline def setStartTime(value: js.Date): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
  }
}
