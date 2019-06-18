package typings
package atWordpressRichDashTextLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AAbbr extends js.Object {
  var multilineTag: js.UndefOr[
    /* import warning: LimitUnionLength.enterTypeRef Was union type with length 120 */ js.Any
  ] = js.undefined
  var value: atWordpressRichDashTextLib.atWordpressRichDashTextMod.Value
}

object Anon_AAbbr {
  @scala.inline
  def apply(
    value: atWordpressRichDashTextLib.atWordpressRichDashTextMod.Value,
    multilineTag: /* import warning: LimitUnionLength.enterTypeRef Was union type with length 120 */ js.Any = null
  ): Anon_AAbbr = {
    val __obj = js.Dynamic.literal(value = value)
    if (multilineTag != null) __obj.updateDynamic("multilineTag")(multilineTag)
    __obj.asInstanceOf[Anon_AAbbr]
  }
}

