package typings.tabris

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<std.Pick<tabris.tabris.Picker, 'itemText'>> */
trait PartialPickPickeritemText extends js.Object {
  var itemText: js.UndefOr[js.Function1[/* index */ Double, String]] = js.undefined
}

object PartialPickPickeritemText {
  @scala.inline
  def apply(itemText: /* index */ Double => String = null): PartialPickPickeritemText = {
    val __obj = js.Dynamic.literal()
    if (itemText != null) __obj.updateDynamic("itemText")(js.Any.fromFunction1(itemText))
    __obj.asInstanceOf[PartialPickPickeritemText]
  }
}

