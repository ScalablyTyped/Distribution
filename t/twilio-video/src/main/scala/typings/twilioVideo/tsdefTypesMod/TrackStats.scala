package typings.twilioVideo.tsdefTypesMod

import typings.twilioVideo.tsdefTrackMod.Track.ID
import typings.twilioVideo.tsdefTrackMod.Track.SID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("twilio-video/tsdef/types", "TrackStats")
@js.native
open class TrackStats () extends StObject {
  
  var codec: String | Null = js.native
  
  var packetsLost: Double | Null = js.native
  
  var ssrc: String = js.native
  
  var timestamp: Double = js.native
  
  var trackId: ID = js.native
  
  var trackSid: SID = js.native
}
