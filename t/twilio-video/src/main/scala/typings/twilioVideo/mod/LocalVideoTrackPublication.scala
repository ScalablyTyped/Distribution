package typings.twilioVideo.mod

import typings.node.eventsMod.EventEmitterOptions
import typings.twilioVideo.twilioVideoStrings.video
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("twilio-video", "LocalVideoTrackPublication")
@js.native
class LocalVideoTrackPublication ()
  extends LocalTrackPublication
     with VideoTrackPublication {
  def this(options: EventEmitterOptions) = this()
  
  @JSName("kind")
  var kind_LocalVideoTrackPublication: video = js.native
  
  @JSName("track")
  var track_LocalVideoTrackPublication: LocalVideoTrack = js.native
}
