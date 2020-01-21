package typings.twilio.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QueueMemberResource
  extends BaseMappedResource[QueueMemberInstance]
     with Resource {
  var front: QueueMemberInstance = js.native
  /* InferMemberOverrides */
  override def apply(T0: /* resourceSid */ String): QueueMemberInstance = js.native
}

