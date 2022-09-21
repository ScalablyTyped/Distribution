package typings.twilioVideo

import typings.events.mod.EventEmitter
import typings.twilioVideo.trackMod.Track.Kind
import typings.twilioVideo.trackMod.Track.SID
import typings.twilioVideo.twilioVideoStrings.trackDisabled
import typings.twilioVideo.twilioVideoStrings.trackEnabled
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object trackPublicationMod {
  
  @JSImport("twilio-video/tsdef/TrackPublication", "TrackPublication")
  @js.native
  open class TrackPublication () extends EventEmitter {
    
    var isEnabled: Boolean = js.native
    
    var kind: Kind = js.native
    
    @JSName("on")
    def on_trackDisabled(event: trackDisabled, listener: js.Function0[Unit]): this.type = js.native
    @JSName("on")
    def on_trackEnabled(event: trackEnabled, listener: js.Function0[Unit]): this.type = js.native
    
    var trackName: String = js.native
    
    var trackSid: SID = js.native
  }
}
