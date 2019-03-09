package typings
package twilioDashVideoLib.twilioDashVideoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("twilio-video", "Participant")
@js.native
class Participant ()
  extends nodeLib.eventsMod.EventEmitter {
  var audioTracks: nodeLib.Map[twilioDashVideoLib.twilioDashVideoMod.TrackNs.SID, AudioTrackPublication] = js.native
  var dataTracks: nodeLib.Map[twilioDashVideoLib.twilioDashVideoMod.TrackNs.SID, DataTrackPublication] = js.native
  var identity: twilioDashVideoLib.twilioDashVideoMod.ParticipantNs.Identity = js.native
  var networkQualityLevel: NetworkQualityLevel | scala.Null = js.native
  var sid: twilioDashVideoLib.twilioDashVideoMod.ParticipantNs.SID = js.native
  var state: java.lang.String = js.native
  var tracks: nodeLib.Map[twilioDashVideoLib.twilioDashVideoMod.TrackNs.SID, TrackPublication] = js.native
  var videoTracks: nodeLib.Map[twilioDashVideoLib.twilioDashVideoMod.TrackNs.SID, VideoTrackPublication] = js.native
}

