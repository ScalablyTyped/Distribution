package typings.vexflow.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MatchedString extends js.Object {
  var incrementPos: js.UndefOr[scala.Nothing] = js.native
  var matchedString: js.UndefOr[scala.Nothing] = js.native
  var pos: js.Any = js.native
  var success: Boolean = js.native
}

object MatchedString {
  @scala.inline
  def apply(pos: js.Any, success: Boolean): MatchedString = {
    val __obj = js.Dynamic.literal(pos = pos.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
    __obj.asInstanceOf[MatchedString]
  }
  @scala.inline
  implicit class MatchedStringOps[Self <: MatchedString] (val x: Self) extends AnyVal {
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
    def setPos(value: js.Any): Self = this.set("pos", value.asInstanceOf[js.Any])
    @scala.inline
    def setSuccess(value: Boolean): Self = this.set("success", value.asInstanceOf[js.Any])
  }
  
}

