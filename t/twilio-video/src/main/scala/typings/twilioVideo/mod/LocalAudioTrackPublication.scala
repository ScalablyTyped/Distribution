package typings.twilioVideo.mod

import typings.node.eventsMod.EventEmitterOptions
import typings.twilioVideo.twilioVideoStrings.audio
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("twilio-video", "LocalAudioTrackPublication")
@js.native
class LocalAudioTrackPublication ()
  extends LocalTrackPublication
     with AudioTrackPublication {
  def this(options: EventEmitterOptions) = this()
  
  @JSName("kind")
  var kind_LocalAudioTrackPublication: audio = js.native
  
  @JSName("track")
  var track_LocalAudioTrackPublication: LocalAudioTrack = js.native
}
