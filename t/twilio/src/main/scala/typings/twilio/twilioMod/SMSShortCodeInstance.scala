package typings.twilio.twilioMod

import typings.q.qMod.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SMSShortCodeInstance extends PostableResource {
  @JSName("update")
  var update_Original: RestMethod = js.native
  def update(args: js.Any): Promise[_] = js.native
  def update(args: js.Any, callback: RequestCallback): Promise[_] = js.native
  def update(callback: RequestCallback): Promise[_] = js.native
}

