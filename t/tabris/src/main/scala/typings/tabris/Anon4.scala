package typings.tabris

import typings.tabris.mod.Action
import typings.tabris.mod.JSXChildren
import typings.tabris.mod.Page
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon4 extends js.Object {
  var children: js.UndefOr[JSXChildren[Page | Action]] = js.undefined
}

object Anon4 {
  @scala.inline
  def apply(children: JSXChildren[Page | Action] = null): Anon4 = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon4]
  }
}

