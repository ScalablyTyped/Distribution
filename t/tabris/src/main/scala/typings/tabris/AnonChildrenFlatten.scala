package typings.tabris

import typings.tabris.mod.Flatten
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonChildrenFlatten extends js.Object {
  var children: js.UndefOr[Flatten[String | AnonImage]] = js.undefined
}

object AnonChildrenFlatten {
  @scala.inline
  def apply(children: Flatten[String | AnonImage] = null): AnonChildrenFlatten = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonChildrenFlatten]
  }
}

