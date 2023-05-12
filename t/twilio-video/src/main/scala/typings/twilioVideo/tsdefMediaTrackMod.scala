package typings.twilioVideo

import typings.std.HTMLMediaElement
import typings.std.MediaStreamTrack
import typings.twilioVideo.tsdefTrackMod.Track
import typings.twilioVideo.twilioVideoStrings.disabled
import typings.twilioVideo.twilioVideoStrings.enabled
import typings.twilioVideo.twilioVideoStrings.started
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tsdefMediaTrackMod {
  
  @JSImport("twilio-video/tsdef/MediaTrack", "MediaTrack")
  @js.native
  open class MediaTrack () extends Track {
    
    def attach(): HTMLMediaElement = js.native
    def attach(element: String): HTMLMediaElement = js.native
    def attach(element: HTMLMediaElement): HTMLMediaElement = js.native
    
    def detach(): js.Array[HTMLMediaElement] = js.native
    def detach(element: String): HTMLMediaElement = js.native
    def detach(element: HTMLMediaElement): HTMLMediaElement = js.native
    
    var isEnabled: Boolean = js.native
    
    var isStarted: Boolean = js.native
    
    var mediaStreamTrack: MediaStreamTrack = js.native
    
    def on(event: String, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
    @JSName("on")
    def on_disabled(event: disabled, listener: js.Function1[/* track */ this.type, Unit]): this.type = js.native
    @JSName("on")
    def on_enabled(event: enabled, listener: js.Function1[/* track */ this.type, Unit]): this.type = js.native
    @JSName("on")
    def on_started(event: started, listener: js.Function1[/* track */ this.type, Unit]): this.type = js.native
  }
}
