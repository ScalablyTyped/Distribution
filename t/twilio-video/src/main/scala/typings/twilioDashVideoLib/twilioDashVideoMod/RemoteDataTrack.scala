package typings
package twilioDashVideoLib.twilioDashVideoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("twilio-video", "RemoteDataTrack")
@js.native
class RemoteDataTrack () extends Track {
  var isEnabled: scala.Boolean = js.native
  var isSubscribed: scala.Boolean = js.native
  @JSName("kind")
  var kind_RemoteDataTrack: twilioDashVideoLib.twilioDashVideoLibStrings.data = js.native
  var maxPacketLifeTime: scala.Double | scala.Null = js.native
  var maxRetransmits: scala.Double | scala.Null = js.native
  var ordered: scala.Boolean = js.native
  var reliable: scala.Boolean = js.native
  var sid: twilioDashVideoLib.twilioDashVideoMod.TrackNs.SID = js.native
}

