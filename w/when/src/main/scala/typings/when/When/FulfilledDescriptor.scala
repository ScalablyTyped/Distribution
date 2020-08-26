package typings.when.When

import typings.when.whenStrings.fulfilled
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FulfilledDescriptor[T]
  extends Descriptor[T]
     with Snapshot[T] {
  var state: fulfilled = js.native
  var value: T = js.native
}

object FulfilledDescriptor {
  @scala.inline
  def apply[T](state: fulfilled, value: T): FulfilledDescriptor[T] = {
    val __obj = js.Dynamic.literal(state = state.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[FulfilledDescriptor[T]]
  }
  @scala.inline
  implicit class FulfilledDescriptorOps[Self <: FulfilledDescriptor[_], T] (val x: Self with FulfilledDescriptor[T]) extends AnyVal {
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
    def setState(value: fulfilled): Self = this.set("state", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: T): Self = this.set("value", value.asInstanceOf[js.Any])
  }
  
}

