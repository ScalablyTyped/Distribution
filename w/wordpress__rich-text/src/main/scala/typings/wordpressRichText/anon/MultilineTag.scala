package typings.wordpressRichText.anon

import typings.wordpressRichText.mod.Value
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MultilineTag extends js.Object {
  var multilineTag: js.UndefOr[
    /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 120 */ js.Any
  ] = js.undefined
  var value: Value
}

object MultilineTag {
  @scala.inline
  def apply(
    value: Value,
    multilineTag: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 120 */ js.Any = null
  ): MultilineTag = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    if (multilineTag != null) __obj.updateDynamic("multilineTag")(multilineTag.asInstanceOf[js.Any])
    __obj.asInstanceOf[MultilineTag]
  }
}

