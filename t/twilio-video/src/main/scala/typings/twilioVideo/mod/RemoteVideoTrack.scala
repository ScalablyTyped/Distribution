package typings.twilioVideo.mod

import typings.node.eventsMod.EventEmitterOptions
import typings.twilioVideo.mod.Track.Priority
import typings.twilioVideo.mod.Track.SID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("twilio-video", "RemoteVideoTrack")
@js.native
class RemoteVideoTrack ()
  extends VideoTrack
     with RemoteTrack {
  def this(options: EventEmitterOptions) = this()
  
  var isSwitchedOff: Boolean = js.native
  
  var priority: Priority | Null = js.native
  
  var sid: SID = js.native
}
