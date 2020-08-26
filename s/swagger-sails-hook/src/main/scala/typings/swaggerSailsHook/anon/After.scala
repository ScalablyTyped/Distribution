package typings.swaggerSailsHook.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait After extends js.Object {
  /** routes specified in the `after` object will be bound after custom and blueprint routes */
  var after: _empty = js.native
}

object After {
  @scala.inline
  def apply(after: _empty): After = {
    val __obj = js.Dynamic.literal(after = after.asInstanceOf[js.Any])
    __obj.asInstanceOf[After]
  }
  @scala.inline
  implicit class AfterOps[Self <: After] (val x: Self) extends AnyVal {
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
    def setAfter(value: _empty): Self = this.set("after", value.asInstanceOf[js.Any])
  }
  
}

