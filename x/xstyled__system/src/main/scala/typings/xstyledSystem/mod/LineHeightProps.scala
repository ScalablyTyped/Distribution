package typings.xstyledSystem.mod

import typings.csstype.mod.LineHeightProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LineHeightProps[TLength] extends js.Object {
  val lineHeight: js.UndefOr[ResponsiveValue[LineHeightProperty[TLength]]] = js.undefined
}

object LineHeightProps {
  @scala.inline
  def apply[TLength](lineHeight: ResponsiveValue[LineHeightProperty[TLength]] = null): LineHeightProps[TLength] = {
    val __obj = js.Dynamic.literal()
    if (lineHeight != null) __obj.updateDynamic("lineHeight")(lineHeight.asInstanceOf[js.Any])
    __obj.asInstanceOf[LineHeightProps[TLength]]
  }
}

