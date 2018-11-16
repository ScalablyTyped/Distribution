package typings
package twilioDashVideoLib.twilioDashVideoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("twilio-video", "LocalTrackPublication")
@js.native
class LocalTrackPublication () extends TrackPublication {
  var isTrackEnabled: scala.Boolean = js.native
  var kind: twilioDashVideoLib.twilioDashVideoMod.TrackNs.Kind = js.native
  var track: LocalTrack = js.native
  def unpublish(): LocalTrackPublication = js.native
}

