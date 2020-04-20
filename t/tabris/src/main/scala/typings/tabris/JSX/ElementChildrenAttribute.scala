package typings.tabris.JSX

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ElementChildrenAttribute extends js.Object {
  var children: js.UndefOr[js.Any] = js.undefined
}

object ElementChildrenAttribute {
  @scala.inline
  def apply(children: js.Any = null): ElementChildrenAttribute = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    __obj.asInstanceOf[ElementChildrenAttribute]
  }
}

