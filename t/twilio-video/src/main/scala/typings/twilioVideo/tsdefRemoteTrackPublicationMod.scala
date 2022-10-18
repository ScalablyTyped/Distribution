package typings.twilioVideo

import typings.twilioVideo.tsdefTrackMod.Track.Priority
import typings.twilioVideo.tsdefTrackPublicationMod.TrackPublication
import typings.twilioVideo.tsdefTwilioErrorMod.TwilioError
import typings.twilioVideo.tsdefTypesMod.RemoteTrack
import typings.twilioVideo.twilioVideoStrings.publishPriorityChanged
import typings.twilioVideo.twilioVideoStrings.subscribed
import typings.twilioVideo.twilioVideoStrings.subscriptionFailed
import typings.twilioVideo.twilioVideoStrings.trackSwitchedOff
import typings.twilioVideo.twilioVideoStrings.trackSwitchedOn
import typings.twilioVideo.twilioVideoStrings.unsubscribed
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tsdefRemoteTrackPublicationMod {
  
  @JSImport("twilio-video/tsdef/RemoteTrackPublication", "RemoteTrackPublication")
  @js.native
  open class RemoteTrackPublication () extends TrackPublication {
    
    var isSubscribed: Boolean = js.native
    
    var isTrackEnabled: Boolean = js.native
    
    def on(event: String, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
    @JSName("on")
    def on_publishPriorityChanged(event: publishPriorityChanged, listener: js.Function1[/* priority */ Priority, Unit]): this.type = js.native
    @JSName("on")
    def on_subscribed(event: subscribed, listener: js.Function1[/* track */ RemoteTrack, Unit]): this.type = js.native
    @JSName("on")
    def on_subscriptionFailed(event: subscriptionFailed, listener: js.Function1[/* error */ TwilioError, Unit]): this.type = js.native
    @JSName("on")
    def on_trackSwitchedOff(event: trackSwitchedOff, listener: js.Function1[/* track */ RemoteTrack, Unit]): this.type = js.native
    @JSName("on")
    def on_trackSwitchedOn(event: trackSwitchedOn, listener: js.Function1[/* track */ RemoteTrack, Unit]): this.type = js.native
    @JSName("on")
    def on_unsubscribed(event: unsubscribed, listener: js.Function1[/* track */ RemoteTrack, Unit]): this.type = js.native
    
    var publishPriority: Priority = js.native
    
    var track: RemoteTrack | Null = js.native
  }
}
