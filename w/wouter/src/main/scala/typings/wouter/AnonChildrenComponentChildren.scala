package typings.wouter

import typings.preact.mod.ComponentChildren
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonChildrenComponentChildren extends js.Object {
  var children: ComponentChildren
}

object AnonChildrenComponentChildren {
  @scala.inline
  def apply(children: ComponentChildren = null): AnonChildrenComponentChildren = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonChildrenComponentChildren]
  }
}

