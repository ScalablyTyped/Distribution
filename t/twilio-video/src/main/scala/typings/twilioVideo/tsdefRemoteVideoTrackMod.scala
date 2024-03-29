package typings.twilioVideo

import typings.twilioVideo.tsdefTrackMod.Track.Priority
import typings.twilioVideo.tsdefTrackMod.Track.SID
import typings.twilioVideo.tsdefTypesMod.RemoteTrack
import typings.twilioVideo.tsdefVideoTrackMod.VideoTrack
import typings.twilioVideo.tsdefVideoTrackMod.VideoTrack.Dimensions
import typings.twilioVideo.twilioVideoStrings.dimensionsChanged
import typings.twilioVideo.twilioVideoStrings.stopped
import typings.twilioVideo.twilioVideoStrings.switchedOff
import typings.twilioVideo.twilioVideoStrings.switchedOn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tsdefRemoteVideoTrackMod {
  
  @JSImport("twilio-video/tsdef/RemoteVideoTrack", "RemoteVideoTrack")
  @js.native
  open class RemoteVideoTrack ()
    extends VideoTrack
       with RemoteTrack {
    
    var isSwitchedOff: Boolean = js.native
    
    @JSName("on")
    def on_dimensionsChanged(event: dimensionsChanged, listener: js.Function1[/* track */ this.type, Unit]): this.type = js.native
    @JSName("on")
    def on_stopped(event: stopped, listener: js.Function1[/* track */ this.type, Unit]): this.type = js.native
    @JSName("on")
    def on_switchedOff(event: switchedOff, listener: js.Function1[/* track */ this.type, Unit]): this.type = js.native
    @JSName("on")
    def on_switchedOn(event: switchedOn, listener: js.Function1[/* track */ this.type, Unit]): this.type = js.native
    
    var priority: Priority | Null = js.native
    
    def setContentPreferences(content: VideoContentPreferences): this.type = js.native
    
    def setPriority(): this.type = js.native
    def setPriority(priority: Priority): this.type = js.native
    
    var sid: SID = js.native
    
    def switchOff(): this.type = js.native
    
    def switchOn(): this.type = js.native
  }
  
  trait VideoContentPreferences extends StObject {
    
    var renderDimensions: js.UndefOr[Dimensions] = js.undefined
  }
  object VideoContentPreferences {
    
    inline def apply(): VideoContentPreferences = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[VideoContentPreferences]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: VideoContentPreferences] (val x: Self) extends AnyVal {
      
      inline def setRenderDimensions(value: Dimensions): Self = StObject.set(x, "renderDimensions", value.asInstanceOf[js.Any])
      
      inline def setRenderDimensionsUndefined: Self = StObject.set(x, "renderDimensions", js.undefined)
    }
  }
}
