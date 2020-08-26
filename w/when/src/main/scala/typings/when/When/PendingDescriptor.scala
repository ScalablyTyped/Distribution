package typings.when.When

import typings.when.whenStrings.pending
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PendingDescriptor
  extends Snapshot[js.Any] {
  var state: pending = js.native
}

object PendingDescriptor {
  @scala.inline
  def apply(state: pending): PendingDescriptor = {
    val __obj = js.Dynamic.literal(state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[PendingDescriptor]
  }
  @scala.inline
  implicit class PendingDescriptorOps[Self <: PendingDescriptor] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setState(value: pending): Self = this.set("state", value.asInstanceOf[js.Any])
  }
  
}

