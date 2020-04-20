package typings.tabris

import typings.tabris.mod.JSXChildren
import typings.tabris.mod.Widget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon2 extends js.Object {
  var children: js.UndefOr[JSXChildren[Widget]] = js.undefined
}

object Anon2 {
  @scala.inline
  def apply(children: JSXChildren[Widget] = null): Anon2 = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon2]
  }
}

