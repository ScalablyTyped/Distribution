package typings.twilioVideo

import typings.std.Map
import typings.std.MediaStreamTrack
import typings.twilioVideo.localAudioTrackPublicationMod.LocalAudioTrackPublication
import typings.twilioVideo.localDataTrackPublicationMod.LocalDataTrackPublication
import typings.twilioVideo.localTrackPublicationMod.LocalTrackPublication
import typings.twilioVideo.localVideoTrackPublicationMod.LocalVideoTrackPublication
import typings.twilioVideo.participantMod.Participant
import typings.twilioVideo.trackMod.Track.SID
import typings.twilioVideo.twilioErrorMod.TwilioError
import typings.twilioVideo.twilioVideoStrings.trackDisabled
import typings.twilioVideo.twilioVideoStrings.trackEnabled
import typings.twilioVideo.twilioVideoStrings.trackPublicationFailed
import typings.twilioVideo.twilioVideoStrings.trackPublished
import typings.twilioVideo.twilioVideoStrings.trackStopped
import typings.twilioVideo.twilioVideoStrings.trackWarning
import typings.twilioVideo.twilioVideoStrings.trackWarningsCleared
import typings.twilioVideo.typesMod.EncodingParameters
import typings.twilioVideo.typesMod.LocalTrack
import typings.twilioVideo.typesMod.LocalTrackPublishOptions
import typings.twilioVideo.typesMod.MediaStreamTrackPublishOptions
import typings.twilioVideo.typesMod.NetworkQualityConfiguration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object localParticipantMod {
  
  @JSImport("twilio-video/tsdef/LocalParticipant", "LocalParticipant")
  @js.native
  open class LocalParticipant () extends Participant {
    
    @JSName("audioTracks")
    var audioTracks_LocalParticipant: Map[SID, LocalAudioTrackPublication] = js.native
    
    @JSName("dataTracks")
    var dataTracks_LocalParticipant: Map[SID, LocalDataTrackPublication] = js.native
    
    @JSName("on")
    def on_trackDisabled(event: trackDisabled, listener: js.Function1[/* track */ LocalTrack, Unit]): this.type = js.native
    @JSName("on")
    def on_trackEnabled(event: trackEnabled, listener: js.Function1[/* track */ LocalTrack, Unit]): this.type = js.native
    @JSName("on")
    def on_trackPublicationFailed(
      event: trackPublicationFailed,
      listener: js.Function2[/* error */ TwilioError, /* track */ LocalTrack, Unit]
    ): this.type = js.native
    @JSName("on")
    def on_trackPublished(event: trackPublished, listener: js.Function1[/* publication */ LocalTrackPublication, Unit]): this.type = js.native
    @JSName("on")
    def on_trackStopped(event: trackStopped, listener: js.Function1[/* track */ LocalTrack, Unit]): this.type = js.native
    @JSName("on")
    def on_trackWarning(
      event: trackWarning,
      listener: js.Function2[/* name */ String, /* publication */ LocalTrackPublication, Unit]
    ): this.type = js.native
    @JSName("on")
    def on_trackWarningsCleared(event: trackWarningsCleared, listener: js.Function1[/* publication */ LocalTrackPublication, Unit]): this.type = js.native
    
    def publishTrack(track: MediaStreamTrack): js.Promise[LocalTrackPublication] = js.native
    def publishTrack(track: MediaStreamTrack, options: MediaStreamTrackPublishOptions): js.Promise[LocalTrackPublication] = js.native
    def publishTrack(track: LocalTrack): js.Promise[LocalTrackPublication] = js.native
    def publishTrack(track: LocalTrack, options: LocalTrackPublishOptions): js.Promise[LocalTrackPublication] = js.native
    
    def publishTracks(tracks: js.Array[LocalTrack | MediaStreamTrack]): js.Promise[js.Array[LocalTrackPublication]] = js.native
    
    def setNetworkQualityConfiguration(networkQualityConfiguration: NetworkQualityConfiguration): this.type = js.native
    
    def setParameters(): this.type = js.native
    def setParameters(encodingParameters: EncodingParameters): this.type = js.native
    
    var signalingRegion: String = js.native
    
    @JSName("tracks")
    var tracks_LocalParticipant: Map[SID, LocalTrackPublication] = js.native
    
    def unpublishTrack(track: MediaStreamTrack): LocalTrackPublication | Null = js.native
    def unpublishTrack(track: LocalTrack): LocalTrackPublication | Null = js.native
    
    def unpublishTracks(tracks: js.Array[LocalTrack | MediaStreamTrack]): js.Array[LocalTrackPublication] = js.native
    
    @JSName("videoTracks")
    var videoTracks_LocalParticipant: Map[SID, LocalVideoTrackPublication] = js.native
  }
}
