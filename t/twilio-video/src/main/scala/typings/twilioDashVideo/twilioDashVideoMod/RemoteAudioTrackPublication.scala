package typings.twilioDashVideo.twilioDashVideoMod

import typings.twilioDashVideo.twilioDashVideoStrings.audio
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("twilio-video", "RemoteAudioTrackPublication")
@js.native
class RemoteAudioTrackPublication ()
  extends RemoteTrackPublication
     with AudioTrackPublication {
  @JSName("kind")
  var kind_RemoteAudioTrackPublication: audio = js.native
  @JSName("track")
  var track_RemoteAudioTrackPublication: RemoteAudioTrack | Null = js.native
}

