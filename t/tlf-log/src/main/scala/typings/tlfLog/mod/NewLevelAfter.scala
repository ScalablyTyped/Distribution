package typings.tlfLog.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NewLevelAfter extends NewLevel {
  var after: String = js.native
}

object NewLevelAfter {
  @scala.inline
  def apply(after: String): NewLevelAfter = {
    val __obj = js.Dynamic.literal(after = after.asInstanceOf[js.Any])
    __obj.asInstanceOf[NewLevelAfter]
  }
  @scala.inline
  implicit class NewLevelAfterOps[Self <: NewLevelAfter] (val x: Self) extends AnyVal {
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
    def setAfter(value: String): Self = this.set("after", value.asInstanceOf[js.Any])
  }
  
}

