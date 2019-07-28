package typings.twilioDashVideo.twilioDashVideoMod

import typings.twilioDashVideo.twilioDashVideoMod.TrackNs.Kind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("twilio-video", "RemoteTrackPublication")
@js.native
class RemoteTrackPublication () extends TrackPublication {
  var isSubscribed: Boolean = js.native
  var isTrackEnabled: Boolean = js.native
  var kind: Kind = js.native
  var track: RemoteTrack | Null = js.native
}

