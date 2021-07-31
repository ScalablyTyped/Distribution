package typings.twilioVideo.mod

import typings.node.eventsMod.EventEmitterOptions
import typings.twilioVideo.mod.Track.SID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("twilio-video", "RemoteAudioTrack")
@js.native
class RemoteAudioTrack ()
  extends AudioTrack
     with RemoteTrack {
  def this(options: EventEmitterOptions) = this()
  
  var sid: SID = js.native
}
