package typings.xstyledSystem.mod

import typings.csstype.mod.RightProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RightProps[TLength] extends js.Object {
  val right: js.UndefOr[ResponsiveValue[RightProperty[TLength]]] = js.undefined
}

object RightProps {
  @scala.inline
  def apply[TLength](right: ResponsiveValue[RightProperty[TLength]] = null): RightProps[TLength] = {
    val __obj = js.Dynamic.literal()
    if (right != null) __obj.updateDynamic("right")(right.asInstanceOf[js.Any])
    __obj.asInstanceOf[RightProps[TLength]]
  }
}

