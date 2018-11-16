package typings
package twilioDashVideoLib.twilioDashVideoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("twilio-video", "TrackStats")
@js.native
class TrackStats () extends js.Object {
  var codec: java.lang.String | scala.Null = js.native
  var packetsLost: scala.Double | scala.Null = js.native
  var ssrc: java.lang.String = js.native
  var timestamp: scala.Double = js.native
  var trackId: twilioDashVideoLib.twilioDashVideoMod.TrackNs.ID = js.native
  var trackSid: twilioDashVideoLib.twilioDashVideoMod.TrackNs.SID = js.native
}

