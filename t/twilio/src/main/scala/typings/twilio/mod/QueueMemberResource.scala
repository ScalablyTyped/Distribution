package typings.twilio.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait QueueMemberResource
  extends BaseMappedResource[QueueMemberInstance]
     with Resource {
  
  /* InferMemberOverrides */
  override def apply(T0: /* resourceSid */ String): QueueMemberInstance = js.native
  
  var front: QueueMemberInstance = js.native
}
