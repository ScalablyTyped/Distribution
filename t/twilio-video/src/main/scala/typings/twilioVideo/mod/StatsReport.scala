package typings.twilioVideo.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("twilio-video", "StatsReport")
@js.native
class StatsReport () extends StObject {
  
  var localAudioTrackStats: js.Array[LocalAudioTrackStats] = js.native
  
  var localVideoTrackStats: js.Array[LocalVideoTrackStats] = js.native
  
  var peerConnectionId: String = js.native
  
  var remoteAudioTrackStats: js.Array[RemoteAudioTrackStats] = js.native
  
  var remoteVideoTrackStats: js.Array[RemoteVideoTrackStats] = js.native
}
