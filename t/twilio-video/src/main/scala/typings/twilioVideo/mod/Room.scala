package typings.twilioVideo.mod

import typings.node.eventsMod.EventEmitter
import typings.std.Map
import typings.twilioVideo.mod.Participant.SID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("twilio-video", "Room")
@js.native
class Room () extends EventEmitter {
  var dominantSpeaker: RemoteParticipant | Null = js.native
  var isRecording: Boolean = js.native
  var localParticipant: LocalParticipant = js.native
  var mediaRegion: String = js.native
  var name: String = js.native
  var participants: Map[SID, RemoteParticipant] = js.native
  var sid: typings.twilioVideo.mod.Room.SID = js.native
  var state: String = js.native
  def disconnect(): Room = js.native
  def getStats(): js.Promise[js.Array[StatsReport]] = js.native
}

@JSImport("twilio-video", "Room")
@js.native
object Room extends js.Object {
  type SID = String
}

