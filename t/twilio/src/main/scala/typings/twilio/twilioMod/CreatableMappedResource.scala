package typings.twilio.twilioMod

import typings.q.qMod.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreatableMappedResource[T]
  extends BaseMappedResource[T]
     with PostableResource {
  @JSName("create")
  var create_Original: RestMethod = js.native
  /* InferMemberOverrides */
  override def apply(T0: /* resourceSid */ String): T = js.native
  def create(args: js.Any): Promise[_] = js.native
  def create(args: js.Any, callback: RequestCallback): Promise[_] = js.native
  def create(callback: RequestCallback): Promise[_] = js.native
}

