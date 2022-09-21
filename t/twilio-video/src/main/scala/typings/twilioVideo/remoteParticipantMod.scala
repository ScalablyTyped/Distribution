package typings.twilioVideo

import typings.std.Map
import typings.twilioVideo.participantMod.Participant
import typings.twilioVideo.remoteAudioTrackPublicationMod.RemoteAudioTrackPublication
import typings.twilioVideo.remoteDataTrackMod.RemoteDataTrack
import typings.twilioVideo.remoteDataTrackPublicationMod.RemoteDataTrackPublication
import typings.twilioVideo.remoteTrackPublicationMod.RemoteTrackPublication
import typings.twilioVideo.remoteVideoTrackPublicationMod.RemoteVideoTrackPublication
import typings.twilioVideo.trackMod.Track.Priority
import typings.twilioVideo.trackMod.Track.SID
import typings.twilioVideo.twilioErrorMod.TwilioError
import typings.twilioVideo.twilioVideoStrings.trackDisabled
import typings.twilioVideo.twilioVideoStrings.trackEnabled
import typings.twilioVideo.twilioVideoStrings.trackMessage
import typings.twilioVideo.twilioVideoStrings.trackPublishPriorityChanged
import typings.twilioVideo.twilioVideoStrings.trackPublished
import typings.twilioVideo.twilioVideoStrings.trackSubscribed
import typings.twilioVideo.twilioVideoStrings.trackSubscriptionFailed
import typings.twilioVideo.twilioVideoStrings.trackSwitchedOff
import typings.twilioVideo.twilioVideoStrings.trackSwitchedOn
import typings.twilioVideo.twilioVideoStrings.trackUnpublished
import typings.twilioVideo.twilioVideoStrings.trackUnsubscribed
import typings.twilioVideo.typesMod.RemoteTrack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object remoteParticipantMod {
  
  @JSImport("twilio-video/tsdef/RemoteParticipant", "RemoteParticipant")
  @js.native
  open class RemoteParticipant () extends Participant {
    
    @JSName("audioTracks")
    var audioTracks_RemoteParticipant: Map[SID, RemoteAudioTrackPublication] = js.native
    
    @JSName("dataTracks")
    var dataTracks_RemoteParticipant: Map[SID, RemoteDataTrackPublication] = js.native
    
    @JSName("on")
    def on_trackDisabled(event: trackDisabled, listener: js.Function1[/* track */ RemoteTrackPublication, Unit]): this.type = js.native
    @JSName("on")
    def on_trackEnabled(event: trackEnabled, listener: js.Function1[/* track */ RemoteTrackPublication, Unit]): this.type = js.native
    @JSName("on")
    def on_trackMessage(
      event: trackMessage,
      listener: js.Function2[/* data */ String | js.typedarray.ArrayBuffer, /* track */ RemoteDataTrack, Unit]
    ): this.type = js.native
    @JSName("on")
    def on_trackPublishPriorityChanged(
      event: trackPublishPriorityChanged,
      listener: js.Function2[/* priority */ Priority, /* publication */ RemoteTrackPublication, Unit]
    ): this.type = js.native
    @JSName("on")
    def on_trackPublished(event: trackPublished, listener: js.Function1[/* publication */ RemoteTrackPublication, Unit]): this.type = js.native
    @JSName("on")
    def on_trackSubscribed(
      event: trackSubscribed,
      listener: js.Function2[/* track */ RemoteTrack, /* publication */ RemoteTrackPublication, Unit]
    ): this.type = js.native
    @JSName("on")
    def on_trackSubscriptionFailed(
      event: trackSubscriptionFailed,
      listener: js.Function2[/* error */ TwilioError, /* publication */ RemoteTrackPublication, Unit]
    ): this.type = js.native
    @JSName("on")
    def on_trackSwitchedOff(
      event: trackSwitchedOff,
      listener: js.Function2[/* track */ RemoteTrack, /* publication */ RemoteTrackPublication, Unit]
    ): this.type = js.native
    @JSName("on")
    def on_trackSwitchedOn(
      event: trackSwitchedOn,
      listener: js.Function2[/* track */ RemoteTrack, /* publication */ RemoteTrackPublication, Unit]
    ): this.type = js.native
    @JSName("on")
    def on_trackUnpublished(event: trackUnpublished, listener: js.Function1[/* publication */ RemoteTrackPublication, Unit]): this.type = js.native
    @JSName("on")
    def on_trackUnsubscribed(
      event: trackUnsubscribed,
      listener: js.Function2[/* track */ RemoteTrack, /* publication */ RemoteTrackPublication, Unit]
    ): this.type = js.native
    
    @JSName("tracks")
    var tracks_RemoteParticipant: Map[SID, RemoteTrackPublication] = js.native
    
    @JSName("videoTracks")
    var videoTracks_RemoteParticipant: Map[SID, RemoteVideoTrackPublication] = js.native
  }
}
