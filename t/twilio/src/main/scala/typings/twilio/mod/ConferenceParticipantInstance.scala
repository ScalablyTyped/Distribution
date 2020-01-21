package typings.twilio.mod

import typings.q.mod.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConferenceParticipantInstance extends InstanceResource {
  @JSName("kick")
  var kick_Original: RestMethod = js.native
  def kick(args: js.Any): Promise[_] = js.native
  def kick(args: js.Any, callback: RequestCallback): Promise[_] = js.native
  def kick(callback: RequestCallback): Promise[_] = js.native
}

