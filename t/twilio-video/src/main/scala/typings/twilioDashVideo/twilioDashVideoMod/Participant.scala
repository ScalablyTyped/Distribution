package typings.twilioDashVideo.twilioDashVideoMod

import typings.node.eventsMod.EventEmitter
import typings.std.Map
import typings.twilioDashVideo.twilioDashVideoMod.ParticipantNs.Identity
import typings.twilioDashVideo.twilioDashVideoMod.TrackNs.SID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("twilio-video", "Participant")
@js.native
class Participant () extends EventEmitter {
  var audioTracks: Map[SID, AudioTrackPublication] = js.native
  var dataTracks: Map[SID, DataTrackPublication] = js.native
  var identity: Identity = js.native
  var networkQualityLevel: NetworkQualityLevel | Null = js.native
  var sid: typings.twilioDashVideo.twilioDashVideoMod.ParticipantNs.SID = js.native
  var state: String = js.native
  var tracks: Map[SID, TrackPublication] = js.native
  var videoTracks: Map[SID, VideoTrackPublication] = js.native
}

