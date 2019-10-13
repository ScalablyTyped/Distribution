package typings.twilioDashVideo.twilioDashVideoMod

import typings.twilioDashVideo.twilioDashVideoMod.Track.SID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("twilio-video", "RemoteAudioTrack")
@js.native
class RemoteAudioTrack ()
  extends AudioTrack
     with RemoteTrack {
  var sid: SID = js.native
}

