package typings.twilioVideo.mod

import typings.std.HTMLMediaElement
import typings.std.HTMLVideoElement
import typings.twilioVideo.mod.Track.Priority
import typings.twilioVideo.mod.Track.SID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("twilio-video", "RemoteVideoTrack")
@js.native
class RemoteVideoTrack ()
  extends VideoTrack
     with RemoteTrack {
  
  /* InferMemberOverrides */
  override def attach(): HTMLVideoElement = js.native
  /* InferMemberOverrides */
  override def attach(element: String): HTMLVideoElement = js.native
  /* InferMemberOverrides */
  override def attach(element: HTMLMediaElement): HTMLVideoElement = js.native
  
  /* InferMemberOverrides */
  override def detach(): js.Array[HTMLMediaElement] = js.native
  /* InferMemberOverrides */
  override def detach(element: String): js.Array[HTMLMediaElement] = js.native
  /* InferMemberOverrides */
  override def detach(element: HTMLMediaElement): js.Array[HTMLMediaElement] = js.native
  
  var isSwitchedOff: Boolean = js.native
  
  var priority: Priority | Null = js.native
  
  var sid: SID = js.native
}
