package typings.atWordpressRichDashText

import typings.std.Element
import typings.std.Range
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_A extends js.Object {
  var element: Element
  var multilineTag: js.UndefOr[
    /* import warning: LimitUnionLength.enterTypeRef Was union type with length 120 */ js.Any
  ] = js.undefined
  var multilineWrapperTags: js.UndefOr[
    js.Array[
      /* import warning: LimitUnionLength.enterTypeRef Was union type with length 119 */ js.Any
    ]
  ] = js.undefined
  var range: js.UndefOr[Range] = js.undefined
}

object Anon_A {
  @scala.inline
  def apply(
    element: Element,
    multilineTag: /* import warning: LimitUnionLength.enterTypeRef Was union type with length 120 */ js.Any = null,
    multilineWrapperTags: js.Array[
      /* import warning: LimitUnionLength.enterTypeRef Was union type with length 119 */ js.Any
    ] = null,
    range: Range = null
  ): Anon_A = {
    val __obj = js.Dynamic.literal(element = element)
    if (multilineTag != null) __obj.updateDynamic("multilineTag")(multilineTag)
    if (multilineWrapperTags != null) __obj.updateDynamic("multilineWrapperTags")(multilineWrapperTags)
    if (range != null) __obj.updateDynamic("range")(range)
    __obj.asInstanceOf[Anon_A]
  }
}

