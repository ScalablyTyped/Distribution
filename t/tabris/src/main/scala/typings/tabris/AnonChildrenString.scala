package typings.tabris

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonChildrenString extends js.Object {
  var children: js.UndefOr[String] = js.undefined
}

object AnonChildrenString {
  @scala.inline
  def apply(children: String = null): AnonChildrenString = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonChildrenString]
  }
}

