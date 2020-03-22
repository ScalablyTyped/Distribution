package typings.uifabricUtilities

import typings.react.mod.RefObject
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonRootRef extends js.Object {
  var rootRef: js.UndefOr[RefObject[HTMLElement]] = js.undefined
}

object AnonRootRef {
  @scala.inline
  def apply(rootRef: RefObject[HTMLElement] = null): AnonRootRef = {
    val __obj = js.Dynamic.literal()
    if (rootRef != null) __obj.updateDynamic("rootRef")(rootRef.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonRootRef]
  }
}

