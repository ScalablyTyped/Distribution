package typings.twilio.mod

import typings.q.mod.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AvailablePhoneNumberResourceGroup extends ListableResource {
  @JSName("search")
  var search_Original: RestMethod = js.native
  def search(args: js.Any): Promise[_] = js.native
  def search(args: js.Any, callback: RequestCallback): Promise[_] = js.native
  def search(callback: RequestCallback): Promise[_] = js.native
}

