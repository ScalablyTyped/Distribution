package typings.wordpressRichText.anon

import typings.wordpressRichText.mod.Value
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MultilineTag extends js.Object {
  var multilineTag: js.UndefOr[
    /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 120 */ js.Any
  ] = js.native
  var value: Value = js.native
}

object MultilineTag {
  @scala.inline
  def apply(value: Value): MultilineTag = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[MultilineTag]
  }
  @scala.inline
  implicit class MultilineTagOps[Self <: MultilineTag] (val x: Self) extends AnyVal {
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
    def setValue(value: Value): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def setMultilineTag(value: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 120 */ js.Any): Self = this.set("multilineTag", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMultilineTag: Self = this.set("multilineTag", js.undefined)
  }
  
}

