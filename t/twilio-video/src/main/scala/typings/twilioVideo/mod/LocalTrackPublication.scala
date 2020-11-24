package typings.twilioVideo.mod

import typings.twilioVideo.mod.Track.Kind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("twilio-video", "LocalTrackPublication")
@js.native
class LocalTrackPublication () extends TrackPublication {
  
  var isTrackEnabled: Boolean = js.native
  
  var kind: Kind = js.native
  
  var track: LocalTrack = js.native
  
  def unpublish(): LocalTrackPublication = js.native
}
