package typings
package twilioDashVideoLib.twilioDashVideoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("twilio-video", "RemoteDataTrackPublication")
@js.native
class RemoteDataTrackPublication ()
  extends RemoteTrackPublication
     with DataTrackPublication {
  @JSName("kind")
  var kind_RemoteDataTrackPublication: twilioDashVideoLib.twilioDashVideoLibStrings.data = js.native
  @JSName("track")
  var track_RemoteDataTrackPublication: RemoteDataTrack | scala.Null = js.native
}

