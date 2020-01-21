package typings.twilioVideo.mod

import typings.std.Map
import typings.twilioVideo.mod.Track.SID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("twilio-video", "RemoteParticipant")
@js.native
class RemoteParticipant () extends Participant {
  @JSName("audioTracks")
  var audioTracks_RemoteParticipant: Map[SID, RemoteAudioTrackPublication] = js.native
  @JSName("dataTracks")
  var dataTracks_RemoteParticipant: Map[SID, RemoteDataTrackPublication] = js.native
  @JSName("tracks")
  var tracks_RemoteParticipant: Map[SID, RemoteTrackPublication] = js.native
  @JSName("videoTracks")
  var videoTracks_RemoteParticipant: Map[SID, RemoteVideoTrackPublication] = js.native
}

