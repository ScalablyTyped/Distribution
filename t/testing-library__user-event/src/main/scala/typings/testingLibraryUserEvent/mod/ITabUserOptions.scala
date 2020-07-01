package typings.testingLibraryUserEvent.mod

import typings.std.Document
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITabUserOptions extends js.Object {
  var focusTrap: js.UndefOr[Document | Element] = js.undefined
  var shift: js.UndefOr[Boolean] = js.undefined
}

object ITabUserOptions {
  @scala.inline
  def apply(focusTrap: Document | Element = null, shift: js.UndefOr[Boolean] = js.undefined): ITabUserOptions = {
    val __obj = js.Dynamic.literal()
    if (focusTrap != null) __obj.updateDynamic("focusTrap")(focusTrap.asInstanceOf[js.Any])
    if (!js.isUndefined(shift)) __obj.updateDynamic("shift")(shift.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITabUserOptions]
  }
}

