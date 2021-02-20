package typings.twilioVideo.mod

import typings.node.eventsMod.EventEmitterOptions
import typings.twilioVideo.twilioVideoStrings.video
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("twilio-video", "RemoteVideoTrackPublication")
@js.native
class RemoteVideoTrackPublication ()
  extends RemoteTrackPublication
     with VideoTrackPublication {
  def this(options: EventEmitterOptions) = this()
  
  @JSName("kind")
  var kind_RemoteVideoTrackPublication: video = js.native
  
  @JSName("track")
  var track_RemoteVideoTrackPublication: RemoteVideoTrack | Null = js.native
}
