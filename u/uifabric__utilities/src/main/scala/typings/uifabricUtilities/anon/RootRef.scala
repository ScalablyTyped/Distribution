package typings.uifabricUtilities.anon

import typings.react.mod.RefObject
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RootRef extends js.Object {
  var rootRef: js.UndefOr[RefObject[HTMLElement]] = js.undefined
}

object RootRef {
  @scala.inline
  def apply(rootRef: RefObject[HTMLElement] = null): RootRef = {
    val __obj = js.Dynamic.literal()
    if (rootRef != null) __obj.updateDynamic("rootRef")(rootRef.asInstanceOf[js.Any])
    __obj.asInstanceOf[RootRef]
  }
}

