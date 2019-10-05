package typings.wouter

import typings.preact.srcMod.ComponentChildren
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ChildrenComponentChildren extends js.Object {
  var children: ComponentChildren
}

object Anon_ChildrenComponentChildren {
  @scala.inline
  def apply(children: ComponentChildren = null): Anon_ChildrenComponentChildren = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ChildrenComponentChildren]
  }
}

