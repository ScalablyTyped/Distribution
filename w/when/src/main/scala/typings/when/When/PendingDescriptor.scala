package typings.when.When

import typings.when.whenStrings.pending
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PendingDescriptor
  extends Snapshot[js.Any] {
  var state: pending
}

object PendingDescriptor {
  @scala.inline
  def apply(state: pending): PendingDescriptor = {
    val __obj = js.Dynamic.literal(state = state.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PendingDescriptor]
  }
}

