package typings.when.When

import typings.when.whenStrings.rejected
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RejectedDescriptor
  extends Descriptor[js.Any]
     with Snapshot[js.Any] {
  var reason: js.Any
  var state: rejected
}

object RejectedDescriptor {
  @scala.inline
  def apply(reason: js.Any, state: rejected): RejectedDescriptor = {
    val __obj = js.Dynamic.literal(reason = reason, state = state)
  
    __obj.asInstanceOf[RejectedDescriptor]
  }
}

