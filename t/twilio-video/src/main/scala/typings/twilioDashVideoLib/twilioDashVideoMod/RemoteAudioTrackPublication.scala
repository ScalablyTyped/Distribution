package typings
package twilioDashVideoLib.twilioDashVideoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("twilio-video", "RemoteAudioTrackPublication")
@js.native
class RemoteAudioTrackPublication ()
  extends RemoteTrackPublication
     with AudioTrackPublication {
  @JSName("kind")
  var kind_RemoteAudioTrackPublication: twilioDashVideoLib.twilioDashVideoLibStrings.audio = js.native
  @JSName("track")
  var track_RemoteAudioTrackPublication: RemoteAudioTrack | scala.Null = js.native
}

