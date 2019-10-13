package typings.twilioDashVideo.twilioDashVideoMod

import typings.twilioDashVideo.twilioDashVideoStrings.data
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("twilio-video", "RemoteDataTrackPublication")
@js.native
class RemoteDataTrackPublication ()
  extends RemoteTrackPublication
     with DataTrackPublication {
  @JSName("kind")
  var kind_RemoteDataTrackPublication: data = js.native
  @JSName("track")
  var track_RemoteDataTrackPublication: RemoteDataTrack | Null = js.native
}

