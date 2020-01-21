package typings.xstyledSystem.mod

import typings.csstype.mod.BorderRightProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BorderRightProps[TLength] extends js.Object {
  val borderRight: js.UndefOr[ResponsiveValue[BorderRightProperty[TLength]]] = js.undefined
}

object BorderRightProps {
  @scala.inline
  def apply[TLength](borderRight: ResponsiveValue[BorderRightProperty[TLength]] = null): BorderRightProps[TLength] = {
    val __obj = js.Dynamic.literal()
    if (borderRight != null) __obj.updateDynamic("borderRight")(borderRight.asInstanceOf[js.Any])
    __obj.asInstanceOf[BorderRightProps[TLength]]
  }
}

