package typings.twilioDashVideo.twilioDashVideoMod

import typings.twilioDashVideo.twilioDashVideoMod.TrackNs.Kind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("twilio-video", "LocalTrackPublication")
@js.native
class LocalTrackPublication () extends TrackPublication {
  var isTrackEnabled: Boolean = js.native
  var kind: Kind = js.native
  var track: LocalTrack = js.native
  def unpublish(): LocalTrackPublication = js.native
}

