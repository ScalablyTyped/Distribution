package typings.styledDashSystem.styledDashSystemMod

import typings.csstype.csstypeMod.LineHeightProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LineHeightProps[TLength] extends js.Object {
  /**
    * The line-height CSS property sets the amount of space used for lines, such as in text. On block-level elements,
    * it specifies the minimum height of line boxes within the element.
    *
    * On non-replaced inline elements, it specifies the height that is used to calculate line box height.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/line-height)
    */
  var lineHeight: js.UndefOr[ResponsiveValue[LineHeightProperty[TLength]]] = js.undefined
}

object LineHeightProps {
  @scala.inline
  def apply[TLength](lineHeight: ResponsiveValue[LineHeightProperty[TLength]] = null): LineHeightProps[TLength] = {
    val __obj = js.Dynamic.literal()
    if (lineHeight != null) __obj.updateDynamic("lineHeight")(lineHeight.asInstanceOf[js.Any])
    __obj.asInstanceOf[LineHeightProps[TLength]]
  }
}

