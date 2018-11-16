package typings
package twilioDashVideoLib.twilioDashVideoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("twilio-video", "RemoteTrackPublication")
@js.native
class RemoteTrackPublication () extends TrackPublication {
  var isSubscribed: scala.Boolean = js.native
  var isTrackEnabled: scala.Boolean = js.native
  var kind: twilioDashVideoLib.twilioDashVideoMod.TrackNs.Kind = js.native
  var track: RemoteTrack | scala.Null = js.native
}

