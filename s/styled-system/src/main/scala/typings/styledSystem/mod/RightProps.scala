package typings.styledSystem.mod

import typings.csstype.mod.RightProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RightProps[TLength] extends js.Object {
  /**
    * The right CSS property participates in specifying the horizontal position of a
    * positioned element. It has no effect on non-positioned elements.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/right)
    */
  var right: js.UndefOr[ResponsiveValue[RightProperty[TLength]]] = js.undefined
}

object RightProps {
  @scala.inline
  def apply[TLength](right: ResponsiveValue[RightProperty[TLength]] = null): RightProps[TLength] = {
    val __obj = js.Dynamic.literal()
    if (right != null) __obj.updateDynamic("right")(right.asInstanceOf[js.Any])
    __obj.asInstanceOf[RightProps[TLength]]
  }
}

