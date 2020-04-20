package typings.tabris

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<std.Pick<this, 'itemText'>> */
trait PartialPickthisitemText extends js.Object {
  var itemText: js.UndefOr[js.Any] = js.undefined
}

object PartialPickthisitemText {
  @scala.inline
  def apply(itemText: js.Any = null): PartialPickthisitemText = {
    val __obj = js.Dynamic.literal()
    if (itemText != null) __obj.updateDynamic("itemText")(itemText.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialPickthisitemText]
  }
}

