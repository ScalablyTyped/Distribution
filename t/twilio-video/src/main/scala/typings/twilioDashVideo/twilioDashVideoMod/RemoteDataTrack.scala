package typings.twilioDashVideo.twilioDashVideoMod

import typings.twilioDashVideo.twilioDashVideoMod.Track.SID
import typings.twilioDashVideo.twilioDashVideoStrings.data
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("twilio-video", "RemoteDataTrack")
@js.native
class RemoteDataTrack ()
  extends Track
     with DataTrack
     with RemoteTrack {
  var isEnabled: Boolean = js.native
  var isSubscribed: Boolean = js.native
  @JSName("kind")
  var kind_RemoteDataTrack: data = js.native
  var maxPacketLifeTime: Double | Null = js.native
  var maxRetransmits: Double | Null = js.native
  var ordered: Boolean = js.native
  var reliable: Boolean = js.native
  var sid: SID = js.native
}

