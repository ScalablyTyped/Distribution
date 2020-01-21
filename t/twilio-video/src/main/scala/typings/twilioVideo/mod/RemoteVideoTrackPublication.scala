package typings.twilioVideo.mod

import typings.twilioVideo.twilioVideoStrings.video
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("twilio-video", "RemoteVideoTrackPublication")
@js.native
class RemoteVideoTrackPublication ()
  extends RemoteTrackPublication
     with VideoTrackPublication {
  @JSName("kind")
  var kind_RemoteVideoTrackPublication: video = js.native
  @JSName("track")
  var track_RemoteVideoTrackPublication: RemoteVideoTrack | Null = js.native
}

