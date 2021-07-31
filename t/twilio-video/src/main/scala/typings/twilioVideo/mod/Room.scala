package typings.twilioVideo.mod

import typings.node.eventsMod.EventEmitter
import typings.node.eventsMod.EventEmitterOptions
import typings.std.Map
import typings.twilioVideo.mod.Participant.SID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("twilio-video", "Room")
@js.native
class Room () extends EventEmitter {
  def this(options: EventEmitterOptions) = this()
  
  def disconnect(): Room = js.native
  
  var dominantSpeaker: RemoteParticipant | Null = js.native
  
  def getStats(): js.Promise[js.Array[StatsReport]] = js.native
  
  var isRecording: Boolean = js.native
  
  var localParticipant: LocalParticipant = js.native
  
  var mediaRegion: String = js.native
  
  var name: String = js.native
  
  var participants: Map[SID, RemoteParticipant] = js.native
  
  var sid: typings.twilioVideo.mod.Room.SID = js.native
  
  var state: String = js.native
}
object Room {
  
  type SID = String
}
