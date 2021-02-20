package typings.twilioVideo.mod

import typings.node.eventsMod.EventEmitterOptions
import typings.twilioVideo.twilioVideoStrings.data
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("twilio-video", "RemoteDataTrackPublication")
@js.native
class RemoteDataTrackPublication ()
  extends RemoteTrackPublication
     with DataTrackPublication {
  def this(options: EventEmitterOptions) = this()
  
  @JSName("kind")
  var kind_RemoteDataTrackPublication: data = js.native
  
  @JSName("track")
  var track_RemoteDataTrackPublication: RemoteDataTrack | Null = js.native
}
