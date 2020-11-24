package typings.twilioVideo.mod

import typings.twilioVideo.mod.Track.Kind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("twilio-video", "RemoteTrackPublication")
@js.native
class RemoteTrackPublication () extends TrackPublication {
  
  var isSubscribed: Boolean = js.native
  
  var isTrackEnabled: Boolean = js.native
  
  var kind: Kind = js.native
  
  var track: RemoteTrack | Null = js.native
}
