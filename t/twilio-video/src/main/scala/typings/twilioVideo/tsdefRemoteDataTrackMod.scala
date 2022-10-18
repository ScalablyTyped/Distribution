package typings.twilioVideo

import typings.twilioVideo.tsdefTrackMod.Track
import typings.twilioVideo.tsdefTrackMod.Track.Priority
import typings.twilioVideo.tsdefTrackMod.Track.SID
import typings.twilioVideo.tsdefTypesMod.DataTrack
import typings.twilioVideo.tsdefTypesMod.RemoteTrack
import typings.twilioVideo.twilioVideoStrings.data
import typings.twilioVideo.twilioVideoStrings.message
import typings.twilioVideo.twilioVideoStrings.switchedOff
import typings.twilioVideo.twilioVideoStrings.switchedOn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tsdefRemoteDataTrackMod {
  
  @JSImport("twilio-video/tsdef/RemoteDataTrack", "RemoteDataTrack")
  @js.native
  open class RemoteDataTrack ()
    extends Track
       with DataTrack
       with RemoteTrack {
    
    var isEnabled: Boolean = js.native
    
    var isSubscribed: Boolean = js.native
    
    @JSName("kind")
    var kind_RemoteDataTrack: data = js.native
    
    var maxPacketLifeTime: Double | Null = js.native
    
    var maxRetransmits: Double | Null = js.native
    
    def on(event: String, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
    @JSName("on")
    def on_message(
      event: message,
      listener: js.Function2[/* data */ String | js.typedarray.ArrayBuffer, /* track */ this.type, Unit]
    ): this.type = js.native
    @JSName("on")
    def on_switchedOff(event: switchedOff, listener: js.Function1[/* track */ this.type, Unit]): this.type = js.native
    @JSName("on")
    def on_switchedOn(event: switchedOn, listener: js.Function1[/* track */ this.type, Unit]): this.type = js.native
    
    var ordered: Boolean = js.native
    
    var priority: Priority | Null = js.native
    
    var reliable: Boolean = js.native
    
    def setPriority(): this.type = js.native
    def setPriority(priority: Priority): this.type = js.native
    
    var sid: SID = js.native
  }
}
