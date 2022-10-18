package typings.twilioVideo

import typings.std.Map
import typings.std.MediaStreamTrack
import typings.twilioVideo.tsdefLocalAudioTrackPublicationMod.LocalAudioTrackPublication
import typings.twilioVideo.tsdefLocalDataTrackPublicationMod.LocalDataTrackPublication
import typings.twilioVideo.tsdefLocalTrackPublicationMod.LocalTrackPublication
import typings.twilioVideo.tsdefLocalVideoTrackPublicationMod.LocalVideoTrackPublication
import typings.twilioVideo.tsdefParticipantMod.Participant
import typings.twilioVideo.tsdefTrackMod.Track.SID
import typings.twilioVideo.tsdefTwilioErrorMod.TwilioError
import typings.twilioVideo.tsdefTypesMod.EncodingParameters
import typings.twilioVideo.tsdefTypesMod.LocalTrack
import typings.twilioVideo.tsdefTypesMod.LocalTrackPublishOptions
import typings.twilioVideo.tsdefTypesMod.MediaStreamTrackPublishOptions
import typings.twilioVideo.tsdefTypesMod.NetworkQualityConfiguration
import typings.twilioVideo.twilioVideoStrings.trackDisabled
import typings.twilioVideo.twilioVideoStrings.trackEnabled
import typings.twilioVideo.twilioVideoStrings.trackPublicationFailed
import typings.twilioVideo.twilioVideoStrings.trackPublished
import typings.twilioVideo.twilioVideoStrings.trackStopped
import typings.twilioVideo.twilioVideoStrings.trackWarning
import typings.twilioVideo.twilioVideoStrings.trackWarningsCleared
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tsdefLocalParticipantMod {
  
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
