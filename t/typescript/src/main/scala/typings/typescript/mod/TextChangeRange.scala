package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TextChangeRange extends js.Object {
  var newLength: Double = js.native
  var span: TextSpan = js.native
}

object TextChangeRange {
  @scala.inline
  def apply(newLength: Double, span: TextSpan): TextChangeRange = {
    val __obj = js.Dynamic.literal(newLength = newLength.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextChangeRange]
  }
  @scala.inline
  implicit class TextChangeRangeOps[Self <: TextChangeRange] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setNewLength(value: Double): Self = this.set("newLength", value.asInstanceOf[js.Any])
    @scala.inline
    def setSpan(value: TextSpan): Self = this.set("span", value.asInstanceOf[js.Any])
  }
  
}

