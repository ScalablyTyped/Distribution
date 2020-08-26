package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Previous extends js.Object {
  var none: scala.Double = js.native
  var previous: scala.Double = js.native
  var useRename: scala.Double = js.native
}

object Previous {
  @scala.inline
  def apply(none: scala.Double, previous: scala.Double, useRename: scala.Double): Previous = {
    val __obj = js.Dynamic.literal(none = none.asInstanceOf[js.Any], previous = previous.asInstanceOf[js.Any], useRename = useRename.asInstanceOf[js.Any])
    __obj.asInstanceOf[Previous]
  }
  @scala.inline
  implicit class PreviousOps[Self <: Previous] (val x: Self) extends AnyVal {
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
    def setNone(value: scala.Double): Self = this.set("none", value.asInstanceOf[js.Any])
    @scala.inline
    def setPrevious(value: scala.Double): Self = this.set("previous", value.asInstanceOf[js.Any])
    @scala.inline
    def setUseRename(value: scala.Double): Self = this.set("useRename", value.asInstanceOf[js.Any])
  }
  
}

