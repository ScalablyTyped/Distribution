package typings.tabris

import typings.tabris.mod.JSXChildren
import typings.tabris.mod.Widget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon7[WidgetType /* <: Widget */] extends js.Object {
  var children: js.UndefOr[JSXChildren[WidgetType]] = js.undefined
}

object Anon7 {
  @scala.inline
  def apply[WidgetType /* <: Widget */](children: JSXChildren[WidgetType] = null): Anon7[WidgetType] = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon7[WidgetType]]
  }
}

