package typings.twilioVideo.mod

import typings.node.eventsMod.EventEmitterOptions
import typings.std.Map
import typings.twilioVideo.mod.Track.SID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("twilio-video", "RemoteParticipant")
@js.native
class RemoteParticipant () extends Participant {
  def this(options: EventEmitterOptions) = this()
  
  @JSName("audioTracks")
  var audioTracks_RemoteParticipant: Map[SID, RemoteAudioTrackPublication] = js.native
  
  @JSName("dataTracks")
  var dataTracks_RemoteParticipant: Map[SID, RemoteDataTrackPublication] = js.native
  
  @JSName("tracks")
  var tracks_RemoteParticipant: Map[SID, RemoteTrackPublication] = js.native
  
  @JSName("videoTracks")
  var videoTracks_RemoteParticipant: Map[SID, RemoteVideoTrackPublication] = js.native
}
