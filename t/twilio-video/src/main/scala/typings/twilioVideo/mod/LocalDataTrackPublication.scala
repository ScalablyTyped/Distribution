package typings.twilioVideo.mod

import typings.twilioVideo.twilioVideoStrings.data
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("twilio-video", "LocalDataTrackPublication")
@js.native
class LocalDataTrackPublication ()
  extends LocalTrackPublication
     with DataTrackPublication {
  
  @JSName("kind")
  var kind_LocalDataTrackPublication: data = js.native
  
  @JSName("track")
  var track_LocalDataTrackPublication: LocalDataTrack = js.native
}
