package typings.tabris

import typings.tabris.mod.JSXChildren
import typings.tabris.mod.Tab
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon5 extends js.Object {
  var children: js.UndefOr[JSXChildren[Tab]] = js.undefined
}

object Anon5 {
  @scala.inline
  def apply(children: JSXChildren[Tab] = null): Anon5 = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon5]
  }
}

