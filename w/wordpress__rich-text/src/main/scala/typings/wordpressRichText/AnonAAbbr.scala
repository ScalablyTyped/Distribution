package typings.wordpressRichText

import typings.wordpressRichText.mod.Value
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAAbbr extends js.Object {
  var multilineTag: js.UndefOr[
    /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 120 */ js.Any
  ] = js.undefined
  var value: Value
}

object AnonAAbbr {
  @scala.inline
  def apply(
    value: Value,
    multilineTag: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 120 */ js.Any = null
  ): AnonAAbbr = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    if (multilineTag != null) __obj.updateDynamic("multilineTag")(multilineTag.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAAbbr]
  }
}

