package typings
package styledDashSystemLib.styledDashSystemMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BorderRightProps[TLength] extends js.Object {
  /**
    * The border-right CSS property is a shorthand that sets border-right-width, border-right-style,
    * and border-right-color. These properties set an element's right border.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/border-right)
    */
  var borderRight: js.UndefOr[ResponsiveValue[csstypeLib.csstypeMod.BorderRightProperty[TLength]]] = js.undefined
}

object BorderRightProps {
  @scala.inline
  def apply[TLength](borderRight: ResponsiveValue[csstypeLib.csstypeMod.BorderRightProperty[TLength]] = null): BorderRightProps[TLength] = {
    val __obj = js.Dynamic.literal()
    if (borderRight != null) __obj.updateDynamic("borderRight")(borderRight.asInstanceOf[js.Any])
    __obj.asInstanceOf[BorderRightProps[TLength]]
  }
}

