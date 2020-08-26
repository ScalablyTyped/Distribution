package typings.tlfLog.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NewLevelBefore extends NewLevel {
  var before: String = js.native
}

object NewLevelBefore {
  @scala.inline
  def apply(before: String): NewLevelBefore = {
    val __obj = js.Dynamic.literal(before = before.asInstanceOf[js.Any])
    __obj.asInstanceOf[NewLevelBefore]
  }
  @scala.inline
  implicit class NewLevelBeforeOps[Self <: NewLevelBefore] (val x: Self) extends AnyVal {
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
    def setBefore(value: String): Self = this.set("before", value.asInstanceOf[js.Any])
  }
  
}

