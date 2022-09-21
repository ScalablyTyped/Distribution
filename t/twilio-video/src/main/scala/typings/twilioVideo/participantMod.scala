package typings.twilioVideo

import typings.events.mod.EventEmitter
import typings.std.Map
import typings.twilioVideo.participantMod.Participant.Identity
import typings.twilioVideo.trackMod.Track
import typings.twilioVideo.trackMod.Track.SID
import typings.twilioVideo.trackPublicationMod.TrackPublication
import typings.twilioVideo.twilioVideoStrings.disconnected
import typings.twilioVideo.twilioVideoStrings.networkQualityLevelChanged
import typings.twilioVideo.twilioVideoStrings.reconnected
import typings.twilioVideo.twilioVideoStrings.reconnecting
import typings.twilioVideo.twilioVideoStrings.trackDimensionsChanged
import typings.twilioVideo.twilioVideoStrings.trackStarted
import typings.twilioVideo.typesMod.AudioTrackPublication
import typings.twilioVideo.typesMod.DataTrackPublication
import typings.twilioVideo.typesMod.NetworkQualityLevel
import typings.twilioVideo.typesMod.NetworkQualityStats
import typings.twilioVideo.typesMod.VideoTrackPublication
import typings.twilioVideo.videoTrackMod.VideoTrack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object participantMod {
  
  @JSImport("twilio-video/tsdef/Participant", "Participant")
  @js.native
  open class Participant () extends EventEmitter {
    
    var audioTracks: Map[SID, AudioTrackPublication] = js.native
    
    var dataTracks: Map[SID, DataTrackPublication] = js.native
    
    var identity: Identity = js.native
    
    var networkQualityLevel: NetworkQualityLevel | Null = js.native
    
    var networkQualityStats: NetworkQualityStats | Null = js.native
    
    def on(event: String, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
    @JSName("on")
    def on_disconnected(event: disconnected, listener: js.Function1[/* participant */ this.type, Unit]): this.type = js.native
    @JSName("on")
    def on_networkQualityLevelChanged(
      event: networkQualityLevelChanged,
      listener: js.Function2[
          /* networkQualityLevel */ NetworkQualityLevel, 
          /* networkQualityStats */ NetworkQualityStats, 
          Unit
        ]
    ): this.type = js.native
    @JSName("on")
    def on_reconnected(event: reconnected, listener: js.Function1[/* participant */ this.type, Unit]): this.type = js.native
    @JSName("on")
    def on_reconnecting(event: reconnecting, listener: js.Function1[/* participant */ this.type, Unit]): this.type = js.native
    @JSName("on")
    def on_trackDimensionsChanged(event: trackDimensionsChanged, listener: js.Function1[/* track */ VideoTrack, Unit]): this.type = js.native
    @JSName("on")
    def on_trackStarted(event: trackStarted, listener: js.Function1[/* track */ Track, Unit]): this.type = js.native
    
    var sid: typings.twilioVideo.participantMod.Participant.SID = js.native
    
    var state: String = js.native
    
    var tracks: Map[SID, TrackPublication] = js.native
    
    var videoTracks: Map[SID, VideoTrackPublication] = js.native
  }
  object Participant {
    
    type Identity = String
    
    type SID = String
  }
}
