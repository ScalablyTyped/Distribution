package typings.twilio.mod

import typings.q.mod.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TokenResource extends BaseMappedResource[TokenInstance] {
  @JSName("create")
  var create_Original: RestMethod = js.native
  @JSName("post")
  var post_Original: RestMethod = js.native
  def create(args: js.Any): Promise[_] = js.native
  def create(args: js.Any, callback: RequestCallback): Promise[_] = js.native
  def create(callback: RequestCallback): Promise[_] = js.native
  def post(args: js.Any): Promise[_] = js.native
  def post(args: js.Any, callback: RequestCallback): Promise[_] = js.native
  def post(callback: RequestCallback): Promise[_] = js.native
}

