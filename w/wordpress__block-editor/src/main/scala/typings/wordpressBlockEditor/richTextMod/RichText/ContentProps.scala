package typings.wordpressBlockEditor.richTextMod.RichText

import typings.react.mod.AllHTMLAttributes
import typings.react.mod.ClassAttributes
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.li
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.p
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContentProps[T /* <: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 119 */ js.Any */]
  extends AllHTMLAttributes[T]
     with ClassAttributes[T] {
  var multiline: js.UndefOr[Boolean | p | li] = js.undefined
  var tagName: js.UndefOr[T] = js.undefined
  @JSName("value")
  var value_ContentProps: String
}

object ContentProps {
  @scala.inline
  def apply[T](
    value: String,
    AllHTMLAttributes: AllHTMLAttributes[T] = null,
    ClassAttributes: ClassAttributes[T] = null,
    multiline: Boolean | p | li = null,
    tagName: T = null
  ): ContentProps[T] = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    if (AllHTMLAttributes != null) js.Dynamic.global.Object.assign(__obj, AllHTMLAttributes)
    if (ClassAttributes != null) js.Dynamic.global.Object.assign(__obj, ClassAttributes)
    if (multiline != null) __obj.updateDynamic("multiline")(multiline.asInstanceOf[js.Any])
    if (tagName != null) __obj.updateDynamic("tagName")(tagName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentProps[T]]
  }
}

