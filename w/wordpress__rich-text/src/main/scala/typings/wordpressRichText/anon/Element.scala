package typings.wordpressRichText.anon

import typings.std.Range
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Element extends js.Object {
  var element: typings.std.Element
  var multilineTag: js.UndefOr[
    /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 120 */ js.Any
  ] = js.undefined
  var multilineWrapperTags: js.UndefOr[
    js.Array[
      /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 119 */ js.Any
    ]
  ] = js.undefined
  var range: js.UndefOr[Range] = js.undefined
}

object Element {
  @scala.inline
  def apply(
    element: typings.std.Element,
    multilineTag: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 120 */ js.Any = null,
    multilineWrapperTags: js.Array[
      /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 119 */ js.Any
    ] = null,
    range: Range = null
  ): Element = {
    val __obj = js.Dynamic.literal(element = element.asInstanceOf[js.Any])
    if (multilineTag != null) __obj.updateDynamic("multilineTag")(multilineTag.asInstanceOf[js.Any])
    if (multilineWrapperTags != null) __obj.updateDynamic("multilineWrapperTags")(multilineWrapperTags.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    __obj.asInstanceOf[Element]
  }
}

