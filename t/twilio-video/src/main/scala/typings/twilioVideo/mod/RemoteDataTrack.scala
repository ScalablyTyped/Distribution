package typings.twilioVideo.mod

import typings.node.eventsMod.EventEmitterOptions
import typings.twilioVideo.mod.Track.SID
import typings.twilioVideo.twilioVideoStrings.data
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("twilio-video", "RemoteDataTrack")
@js.native
class RemoteDataTrack ()
  extends Track
     with DataTrack
     with RemoteTrack {
  def this(options: EventEmitterOptions) = this()
  
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
