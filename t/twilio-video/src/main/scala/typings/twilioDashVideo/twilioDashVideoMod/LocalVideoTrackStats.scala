package typings.twilioDashVideo.twilioDashVideoMod

import typings.twilioDashVideo.twilioDashVideoMod.VideoTrack.Dimensions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("twilio-video", "LocalVideoTrackStats")
@js.native
class LocalVideoTrackStats () extends LocalTrackStats {
  var captureDimensions: Dimensions | Null = js.native
  var captureFrameRate: Double | Null = js.native
  var dimensions: Dimensions | Null = js.native
  var frameRate: Double | Null = js.native
}

