package typings
package twilioDashVideoLib.twilioDashVideoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("twilio-video", "RemoteParticipant")
@js.native
class RemoteParticipant () extends Participant {
  @JSName("audioTracks")
  var audioTracks_RemoteParticipant: nodeLib.Map[twilioDashVideoLib.twilioDashVideoMod.TrackNs.SID, RemoteAudioTrackPublication] = js.native
  @JSName("dataTracks")
  var dataTracks_RemoteParticipant: nodeLib.Map[twilioDashVideoLib.twilioDashVideoMod.TrackNs.SID, RemoteDataTrackPublication] = js.native
  @JSName("tracks")
  var tracks_RemoteParticipant: nodeLib.Map[twilioDashVideoLib.twilioDashVideoMod.TrackNs.SID, RemoteTrackPublication] = js.native
  @JSName("videoTracks")
  var videoTracks_RemoteParticipant: nodeLib.Map[twilioDashVideoLib.twilioDashVideoMod.TrackNs.SID, RemoteVideoTrackPublication] = js.native
}

