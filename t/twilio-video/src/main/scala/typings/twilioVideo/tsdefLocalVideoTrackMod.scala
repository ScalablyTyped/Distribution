package typings.twilioVideo

import typings.std.MediaStreamTrack
import typings.std.MediaTrackConstraints
import typings.twilioVideo.tsdefLocalTrackOptionsMod.LocalTrackOptions
import typings.twilioVideo.tsdefTrackMod.Track.ID
import typings.twilioVideo.tsdefTypesMod.LocalTrack
import typings.twilioVideo.tsdefVideoTrackMod.VideoTrack
import typings.twilioVideo.twilioVideoStrings.dimensionsChanged
import typings.twilioVideo.twilioVideoStrings.muted
import typings.twilioVideo.twilioVideoStrings.stopped
import typings.twilioVideo.twilioVideoStrings.unmuted
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tsdefLocalVideoTrackMod {
  
  @JSImport("twilio-video/tsdef/LocalVideoTrack", "LocalVideoTrack")
  @js.native
  open class LocalVideoTrack protected ()
    extends VideoTrack
       with LocalTrack {
    def this(mediaStreamTrack: MediaStreamTrack) = this()
    def this(mediaStreamTrack: MediaStreamTrack, options: LocalTrackOptions) = this()
    
    def disable(): this.type = js.native
    
    def enable(): this.type = js.native
    def enable(enabled: Boolean): this.type = js.native
    
    var id: ID = js.native
    
    var isMuted: Boolean = js.native
    
    var isStopped: Boolean = js.native
    
    @JSName("on")
    def on_dimensionsChanged(event: dimensionsChanged, listener: js.Function1[/* track */ VideoTrack, Unit]): this.type = js.native
    @JSName("on")
    def on_muted(event: muted, listener: js.Function1[/* track */ this.type, Unit]): this.type = js.native
    @JSName("on")
    def on_stopped(event: stopped, listener: js.Function1[/* track */ this.type, Unit]): this.type = js.native
    @JSName("on")
    def on_unmuted(event: unmuted, listener: js.Function1[/* track */ this.type, Unit]): this.type = js.native
    
    def restart(): js.Promise[Unit] = js.native
    def restart(constraints: MediaTrackConstraints): js.Promise[Unit] = js.native
    
    def stop(): this.type = js.native
  }
}
