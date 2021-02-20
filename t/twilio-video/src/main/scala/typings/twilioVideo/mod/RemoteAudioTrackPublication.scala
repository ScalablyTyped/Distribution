package typings.twilioVideo.mod

import typings.node.eventsMod.EventEmitterOptions
import typings.twilioVideo.twilioVideoStrings.audio
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("twilio-video", "RemoteAudioTrackPublication")
@js.native
class RemoteAudioTrackPublication ()
  extends RemoteTrackPublication
     with AudioTrackPublication {
  def this(options: EventEmitterOptions) = this()
  
  @JSName("kind")
  var kind_RemoteAudioTrackPublication: audio = js.native
  
  @JSName("track")
  var track_RemoteAudioTrackPublication: RemoteAudioTrack | Null = js.native
}
