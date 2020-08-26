package typings.wordpressBlockEditor.richTextMod.RichText

import typings.react.mod.AllHTMLAttributes
import typings.react.mod.ClassAttributes
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.li
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.p
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ContentProps[T /* <: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 119 */ js.Any */]
  extends AllHTMLAttributes[T]
     with ClassAttributes[T] {
  @JSName("children")
  var children_ContentProps: js.UndefOr[scala.Nothing] = js.native
  var multiline: js.UndefOr[Boolean | p | li] = js.native
  var tagName: js.UndefOr[T] = js.native
  @JSName("value")
  var value_ContentProps: String = js.native
}

object ContentProps {
  @scala.inline
  def apply[/* <: / * import warning: LimitUnionLength.leaveTypeRef Was union type with length 119 * / js.Any */ T](value: String): ContentProps[T] = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentProps[T]]
  }
  @scala.inline
  implicit class ContentPropsOps[Self <: ContentProps[_], /* <: / * import warning: LimitUnionLength.leaveTypeRef Was union type with length 119 * / js.Any */ T] (val x: Self with ContentProps[T]) extends AnyVal {
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
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def setMultiline(value: Boolean | p | li): Self = this.set("multiline", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMultiline: Self = this.set("multiline", js.undefined)
    @scala.inline
    def setTagName(value: T): Self = this.set("tagName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTagName: Self = this.set("tagName", js.undefined)
  }
  
}

