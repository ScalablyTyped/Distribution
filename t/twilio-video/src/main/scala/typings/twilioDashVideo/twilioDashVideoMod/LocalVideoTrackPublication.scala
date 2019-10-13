package typings.twilioDashVideo.twilioDashVideoMod

import typings.twilioDashVideo.twilioDashVideoStrings.video
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("twilio-video", "LocalVideoTrackPublication")
@js.native
class LocalVideoTrackPublication ()
  extends LocalTrackPublication
     with VideoTrackPublication {
  @JSName("kind")
  var kind_LocalVideoTrackPublication: video = js.native
  @JSName("track")
  var track_LocalVideoTrackPublication: LocalVideoTrack = js.native
}

