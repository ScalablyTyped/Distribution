package typings.tabris

import typings.tabris.mod.JSXChildren
import typings.tabris.mod.Widget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon3[ChildType /* <: Widget */] extends js.Object {
  var children: js.UndefOr[JSXChildren[ChildType]] = js.undefined
}

object Anon3 {
  @scala.inline
  def apply[ChildType /* <: Widget */](children: JSXChildren[ChildType] = null): Anon3[ChildType] = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon3[ChildType]]
  }
}

