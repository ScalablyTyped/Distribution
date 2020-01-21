package typings.twilioVideo.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("twilio-video", "LocalAudioTrackStats")
@js.native
class LocalAudioTrackStats () extends LocalTrackStats {
  var audioLevel: AudioLevel | Null = js.native
  var jitter: Double | Null = js.native
}

