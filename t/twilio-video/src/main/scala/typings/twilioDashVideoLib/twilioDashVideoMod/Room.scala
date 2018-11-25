package typings
package twilioDashVideoLib.twilioDashVideoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("twilio-video", "Room")
@js.native
class Room ()
  extends eventsLib.eventsMod.EventEmitter {
  var dominantSpeaker: RemoteParticipant | scala.Null = js.native
  var isRecording: scala.Boolean = js.native
  var localParticipant: LocalParticipant = js.native
  var name: java.lang.String = js.native
  var participants: stdLib.Map[twilioDashVideoLib.twilioDashVideoMod.ParticipantNs.SID, RemoteParticipant] = js.native
  var sid: twilioDashVideoLib.twilioDashVideoMod.RoomNs.SID = js.native
  var state: java.lang.String = js.native
  def disconnect(): Room = js.native
  def getStats(): stdLib.Promise[js.Array[StatsReport]] = js.native
}

