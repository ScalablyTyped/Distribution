package typings.twilioVideo

import typings.std.MediaStreamTrack
import typings.std.MediaTrackConstraints
import typings.twilioVideo.tsdefAudioTrackMod.AudioTrack
import typings.twilioVideo.tsdefLocalTrackOptionsMod.LocalTrackOptions
import typings.twilioVideo.tsdefTrackMod.Track.ID
import typings.twilioVideo.tsdefTypesMod.LocalTrack
import typings.twilioVideo.tsdefTypesMod.NoiseCancellation
import typings.twilioVideo.twilioVideoStrings.stopped
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tsdefLocalAudioTrackMod {
  
  @JSImport("twilio-video/tsdef/LocalAudioTrack", "LocalAudioTrack")
  @js.native
  open class LocalAudioTrack protected ()
    extends AudioTrack
       with LocalTrack {
    def this(mediaStreamTrack: MediaStreamTrack) = this()
    def this(mediaStreamTrack: MediaStreamTrack, options: LocalTrackOptions) = this()
    
    def disable(): this.type = js.native
    
    def enable(): this.type = js.native
    def enable(enabled: Boolean): this.type = js.native
    
    var id: ID = js.native
    
    var isStopped: Boolean = js.native
    
    var noiseCancellation: js.UndefOr[NoiseCancellation] = js.native
    
    @JSName("on")
    def on_stopped(event: stopped, listener: js.Function1[/* track */ this.type, Unit]): this.type = js.native
    
    def restart(): js.Promise[Unit] = js.native
    def restart(constraints: MediaTrackConstraints): js.Promise[Unit] = js.native
    
    def stop(): this.type = js.native
  }
}
