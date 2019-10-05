package typings.atWordpressRichDashText

import typings.atWordpressRichDashText.atWordpressRichDashTextMod.Value
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AAbbr extends js.Object {
  var multilineTag: js.UndefOr[
    /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 120 */ js.Any
  ] = js.undefined
  var value: Value
}

object Anon_AAbbr {
  @scala.inline
  def apply(
    value: Value,
    multilineTag: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 120 */ js.Any = null
  ): Anon_AAbbr = {
    val __obj = js.Dynamic.literal(value = value)
    if (multilineTag != null) __obj.updateDynamic("multilineTag")(multilineTag)
    __obj.asInstanceOf[Anon_AAbbr]
  }
}

