package typings
package twilioDashVideoLib.twilioDashVideoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("twilio-video", "LocalParticipant")
@js.native
class LocalParticipant () extends Participant {
  @JSName("audioTracks")
  var audioTracks_LocalParticipant: stdLib.Map[twilioDashVideoLib.twilioDashVideoMod.TrackNs.SID, LocalAudioTrackPublication] = js.native
  @JSName("dataTracks")
  var dataTracks_LocalParticipant: stdLib.Map[twilioDashVideoLib.twilioDashVideoMod.TrackNs.SID, LocalDataTrackPublication] = js.native
  @JSName("tracks")
  var tracks_LocalParticipant: stdLib.Map[twilioDashVideoLib.twilioDashVideoMod.TrackNs.SID, LocalTrackPublication] = js.native
  @JSName("videoTracks")
  var videoTracks_LocalParticipant: stdLib.Map[twilioDashVideoLib.twilioDashVideoMod.TrackNs.SID, LocalVideoTrackPublication] = js.native
  def publishTrack(mediaStreamTrack: stdLib.MediaStreamTrack): js.Promise[LocalTrackPublication] = js.native
  def publishTrack(mediaStreamTrack: stdLib.MediaStreamTrack, options: LocalTrackOptions): js.Promise[LocalTrackPublication] = js.native
  def publishTrack(track: LocalTrack): js.Promise[LocalTrackPublication] = js.native
  def publishTracks(tracks: js.Array[LocalTrack | stdLib.MediaStreamTrack]): js.Promise[js.Array[LocalTrackPublication]] = js.native
  def setParameters(): LocalParticipant = js.native
  def setParameters(encodingParameters: EncodingParameters): LocalParticipant = js.native
  def unpublishTrack(track: LocalTrack): LocalTrackPublication = js.native
  def unpublishTracks(tracks: LocalTrack): js.Array[LocalTrackPublication] = js.native
}

