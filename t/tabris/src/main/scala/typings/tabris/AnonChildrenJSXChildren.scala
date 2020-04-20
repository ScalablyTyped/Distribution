package typings.tabris

import typings.tabris.mod.JSXChildren
import typings.tabris.mod.Widget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonChildrenJSXChildren extends js.Object {
  var children: JSXChildren[Widget]
}

object AnonChildrenJSXChildren {
  @scala.inline
  def apply(children: JSXChildren[Widget] = null): AnonChildrenJSXChildren = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonChildrenJSXChildren]
  }
}

