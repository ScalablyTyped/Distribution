package typings.xstyledSystem.mod

import typings.csstype.mod.MarginRightProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MarginRightProps[TLength] extends js.Object {
  val marginRight: js.UndefOr[ResponsiveValue[MarginRightProperty[TLength]]] = js.undefined
  val mr: js.UndefOr[ResponsiveValue[MarginRightProperty[TLength]]] = js.undefined
}

object MarginRightProps {
  @scala.inline
  def apply[TLength](
    marginRight: ResponsiveValue[MarginRightProperty[TLength]] = null,
    mr: ResponsiveValue[MarginRightProperty[TLength]] = null
  ): MarginRightProps[TLength] = {
    val __obj = js.Dynamic.literal()
    if (marginRight != null) __obj.updateDynamic("marginRight")(marginRight.asInstanceOf[js.Any])
    if (mr != null) __obj.updateDynamic("mr")(mr.asInstanceOf[js.Any])
    __obj.asInstanceOf[MarginRightProps[TLength]]
  }
}

