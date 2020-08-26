package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SelectionRange extends js.Object {
  var parent: js.UndefOr[SelectionRange] = js.native
  var textSpan: TextSpan = js.native
}

object SelectionRange {
  @scala.inline
  def apply(textSpan: TextSpan): SelectionRange = {
    val __obj = js.Dynamic.literal(textSpan = textSpan.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectionRange]
  }
  @scala.inline
  implicit class SelectionRangeOps[Self <: SelectionRange] (val x: Self) extends AnyVal {
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
    def setTextSpan(value: TextSpan): Self = this.set("textSpan", value.asInstanceOf[js.Any])
    @scala.inline
    def setParent(value: SelectionRange): Self = this.set("parent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParent: Self = this.set("parent", js.undefined)
  }
  
}

