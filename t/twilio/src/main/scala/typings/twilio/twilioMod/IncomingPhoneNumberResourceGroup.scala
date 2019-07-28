package typings.twilio.twilioMod

import typings.q.qMod.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IncomingPhoneNumberResourceGroup extends PostableResource {
  @JSName("create")
  var create_Original: RestMethod = js.native
  def create(args: js.Any): Promise[_] = js.native
  def create(args: js.Any, callback: RequestCallback): Promise[_] = js.native
  def create(callback: RequestCallback): Promise[_] = js.native
}

