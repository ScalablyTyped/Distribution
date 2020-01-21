package typings.twilio.mod

import typings.q.mod.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PostableResource extends Resource {
  @JSName("post")
  var post_Original: RestMethod = js.native
  def post(args: js.Any): Promise[_] = js.native
  def post(args: js.Any, callback: RequestCallback): Promise[_] = js.native
  def post(callback: RequestCallback): Promise[_] = js.native
}

