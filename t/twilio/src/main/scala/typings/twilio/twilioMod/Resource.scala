package typings.twilio.twilioMod

import typings.q.qMod.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Resource extends js.Object {
  @JSName("get")
  var get_Original: RestMethod = js.native
  def get(args: js.Any): Promise[_] = js.native
  def get(args: js.Any, callback: RequestCallback): Promise[_] = js.native
  def get(callback: RequestCallback): Promise[_] = js.native
}

