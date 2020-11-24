package typings.twilioVideo.mod

import typings.twilioVideo.twilioVideoStrings.audio
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("twilio-video", "RemoteAudioTrackPublication")
@js.native
class RemoteAudioTrackPublication ()
  extends RemoteTrackPublication
     with AudioTrackPublication {
  
  @JSName("kind")
  var kind_RemoteAudioTrackPublication: audio = js.native
  
  @JSName("track")
  var track_RemoteAudioTrackPublication: RemoteAudioTrack | Null = js.native
}
