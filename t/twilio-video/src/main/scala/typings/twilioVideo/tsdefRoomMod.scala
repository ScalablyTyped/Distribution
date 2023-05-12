package typings.twilioVideo

import typings.events.mod.EventEmitter
import typings.std.Map
import typings.twilioVideo.tsdefLocalParticipantMod.LocalParticipant
import typings.twilioVideo.tsdefLocalTrackPublicationMod.LocalTrackPublication
import typings.twilioVideo.tsdefParticipantMod.Participant.SID
import typings.twilioVideo.tsdefRemoteDataTrackMod.RemoteDataTrack
import typings.twilioVideo.tsdefRemoteParticipantMod.RemoteParticipant
import typings.twilioVideo.tsdefRemoteTrackPublicationMod.RemoteTrackPublication
import typings.twilioVideo.tsdefRemoteVideoTrackMod.RemoteVideoTrack
import typings.twilioVideo.tsdefTrackMod.Track.Priority
import typings.twilioVideo.tsdefTwilioErrorMod.TwilioError
import typings.twilioVideo.tsdefTypesMod.RemoteTrack
import typings.twilioVideo.tsdefTypesMod.StatsReport
import typings.twilioVideo.twilioVideoStrings.disconnected
import typings.twilioVideo.twilioVideoStrings.dominantSpeakerChanged
import typings.twilioVideo.twilioVideoStrings.participantConnected
import typings.twilioVideo.twilioVideoStrings.participantDisconnected
import typings.twilioVideo.twilioVideoStrings.participantReconnected
import typings.twilioVideo.twilioVideoStrings.participantReconnecting
import typings.twilioVideo.twilioVideoStrings.reconnected
import typings.twilioVideo.twilioVideoStrings.reconnecting
import typings.twilioVideo.twilioVideoStrings.recordingStarted
import typings.twilioVideo.twilioVideoStrings.recordingStopped
import typings.twilioVideo.twilioVideoStrings.trackDimensionsChanged
import typings.twilioVideo.twilioVideoStrings.trackDisabled
import typings.twilioVideo.twilioVideoStrings.trackEnabled
import typings.twilioVideo.twilioVideoStrings.trackMessage
import typings.twilioVideo.twilioVideoStrings.trackPublishPriorityChanged
import typings.twilioVideo.twilioVideoStrings.trackPublished
import typings.twilioVideo.twilioVideoStrings.trackStarted
import typings.twilioVideo.twilioVideoStrings.trackSubscribed
import typings.twilioVideo.twilioVideoStrings.trackSubscriptionFailed
import typings.twilioVideo.twilioVideoStrings.trackSwitchedOff
import typings.twilioVideo.twilioVideoStrings.trackSwitchedOn
import typings.twilioVideo.twilioVideoStrings.trackUnpublished
import typings.twilioVideo.twilioVideoStrings.trackUnsubscribed
import typings.twilioVideo.twilioVideoStrings.trackWarning
import typings.twilioVideo.twilioVideoStrings.trackWarningsCleared
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tsdefRoomMod {
  
  @JSImport("twilio-video/tsdef/Room", "Room")
  @js.native
  open class Room () extends EventEmitter {
    
    def disconnect(): Room = js.native
    
    var dominantSpeaker: RemoteParticipant | Null = js.native
    
    def getStats(): js.Promise[js.Array[StatsReport]] = js.native
    
    var isRecording: Boolean = js.native
    
    var localParticipant: LocalParticipant = js.native
    
    var mediaRegion: String = js.native
    
    var name: String = js.native
    
    @JSName("on")
    def on_disconnected(event: disconnected, listener: js.Function2[/* room */ this.type, /* error */ TwilioError, Unit]): this.type = js.native
    @JSName("on")
    def on_dominantSpeakerChanged(
      event: dominantSpeakerChanged,
      listener: js.Function1[/* dominantSpeaker */ RemoteParticipant, Unit]
    ): this.type = js.native
    @JSName("on")
    def on_participantConnected(event: participantConnected, listener: js.Function1[/* participant */ RemoteParticipant, Unit]): this.type = js.native
    @JSName("on")
    def on_participantDisconnected(event: participantDisconnected, listener: js.Function1[/* participant */ RemoteParticipant, Unit]): this.type = js.native
    @JSName("on")
    def on_participantReconnected(event: participantReconnected, listener: js.Function1[/* participant */ RemoteParticipant, Unit]): this.type = js.native
    @JSName("on")
    def on_participantReconnecting(event: participantReconnecting, listener: js.Function1[/* participant */ RemoteParticipant, Unit]): this.type = js.native
    @JSName("on")
    def on_reconnected(event: reconnected, listener: js.Function0[Unit]): this.type = js.native
    @JSName("on")
    def on_reconnecting(event: reconnecting, listener: js.Function1[/* error */ TwilioError, Unit]): this.type = js.native
    @JSName("on")
    def on_recordingStarted(event: recordingStarted, listener: js.Function0[Unit]): this.type = js.native
    @JSName("on")
    def on_recordingStopped(event: recordingStopped, listener: js.Function0[Unit]): this.type = js.native
    @JSName("on")
    def on_trackDimensionsChanged(
      event: trackDimensionsChanged,
      listener: js.Function2[/* track */ RemoteVideoTrack, /* participant */ RemoteParticipant, Unit]
    ): this.type = js.native
    @JSName("on")
    def on_trackDisabled(
      event: trackDisabled,
      listener: js.Function2[/* publication */ RemoteTrackPublication, /* participant */ RemoteParticipant, Unit]
    ): this.type = js.native
    @JSName("on")
    def on_trackEnabled(
      event: trackEnabled,
      listener: js.Function2[/* publication */ RemoteTrackPublication, /* participant */ RemoteParticipant, Unit]
    ): this.type = js.native
    @JSName("on")
    def on_trackMessage(
      event: trackMessage,
      listener: js.Function3[
          /* data */ String | js.typedarray.ArrayBuffer, 
          /* track */ RemoteDataTrack, 
          /* participant */ RemoteParticipant, 
          Unit
        ]
    ): this.type = js.native
    @JSName("on")
    def on_trackPublishPriorityChanged(
      event: trackPublishPriorityChanged,
      listener: js.Function3[
          /* priority */ Priority, 
          /* publication */ RemoteTrackPublication, 
          /* participant */ RemoteParticipant, 
          Unit
        ]
    ): this.type = js.native
    @JSName("on")
    def on_trackPublished(
      event: trackPublished,
      listener: js.Function2[/* publication */ RemoteTrackPublication, /* participant */ RemoteParticipant, Unit]
    ): this.type = js.native
    @JSName("on")
    def on_trackStarted(
      event: trackStarted,
      listener: js.Function2[/* track */ RemoteTrack, /* participant */ RemoteParticipant, Unit]
    ): this.type = js.native
    @JSName("on")
    def on_trackSubscribed(
      event: trackSubscribed,
      listener: js.Function3[
          /* track */ RemoteTrack, 
          /* publication */ RemoteTrackPublication, 
          /* participant */ RemoteParticipant, 
          Unit
        ]
    ): this.type = js.native
    @JSName("on")
    def on_trackSubscriptionFailed(
      event: trackSubscriptionFailed,
      listener: js.Function3[
          /* error */ TwilioError, 
          /* publication */ RemoteTrackPublication, 
          /* participant */ RemoteParticipant, 
          Unit
        ]
    ): this.type = js.native
    @JSName("on")
    def on_trackSwitchedOff(
      event: trackSwitchedOff,
      listener: js.Function3[
          /* track */ RemoteTrack, 
          /* publication */ RemoteTrackPublication, 
          /* participant */ RemoteParticipant, 
          Unit
        ]
    ): this.type = js.native
    @JSName("on")
    def on_trackSwitchedOn(
      event: trackSwitchedOn,
      listener: js.Function3[
          /* track */ RemoteTrack, 
          /* publication */ RemoteTrackPublication, 
          /* participant */ RemoteParticipant, 
          Unit
        ]
    ): this.type = js.native
    @JSName("on")
    def on_trackUnpublished(
      event: trackUnpublished,
      listener: js.Function2[/* publication */ RemoteTrackPublication, /* participant */ RemoteParticipant, Unit]
    ): this.type = js.native
    @JSName("on")
    def on_trackUnsubscribed(
      event: trackUnsubscribed,
      listener: js.Function3[
          /* track */ RemoteTrack, 
          /* publication */ RemoteTrackPublication, 
          /* participant */ RemoteParticipant, 
          Unit
        ]
    ): this.type = js.native
    @JSName("on")
    def on_trackWarning(
      event: trackWarning,
      listener: js.Function3[
          /* name */ String, 
          /* publication */ LocalTrackPublication, 
          /* participant */ LocalParticipant, 
          Unit
        ]
    ): this.type = js.native
    @JSName("on")
    def on_trackWarningsCleared(
      event: trackWarningsCleared,
      listener: js.Function2[/* publication */ LocalTrackPublication, /* participant */ LocalParticipant, Unit]
    ): this.type = js.native
    
    var participants: Map[SID, RemoteParticipant] = js.native
    
    def refreshInactiveMedia(): Unit = js.native
    
    var sid: typings.twilioVideo.tsdefRoomMod.Room.SID = js.native
    
    var state: String = js.native
  }
  object Room {
    
    type SID = String
  }
}
