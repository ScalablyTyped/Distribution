package typings.twilioVideo.mod

import typings.node.eventsMod.EventEmitter
import typings.node.eventsMod.EventEmitterOptions
import typings.std.Map
import typings.twilioVideo.mod.Participant.Identity
import typings.twilioVideo.mod.Track.SID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("twilio-video", "Participant")
@js.native
class Participant () extends EventEmitter {
  def this(options: EventEmitterOptions) = this()
  
  var audioTracks: Map[SID, AudioTrackPublication] = js.native
  
  var dataTracks: Map[SID, DataTrackPublication] = js.native
  
  var identity: Identity = js.native
  
  var networkQualityLevel: NetworkQualityLevel | Null = js.native
  
  var networkQualityStats: NetworkQualityStats | Null = js.native
  
  var sid: typings.twilioVideo.mod.Participant.SID = js.native
  
  var state: String = js.native
  
  var tracks: Map[SID, TrackPublication] = js.native
  
  var videoTracks: Map[SID, VideoTrackPublication] = js.native
}
object Participant {
  
  type Identity = String
  
  type SID = String
}
