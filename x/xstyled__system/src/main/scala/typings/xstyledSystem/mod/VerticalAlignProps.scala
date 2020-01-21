package typings.xstyledSystem.mod

import typings.csstype.mod.VerticalAlignProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VerticalAlignProps[TLength] extends js.Object {
  val verticalAlign: js.UndefOr[ResponsiveValue[VerticalAlignProperty[TLength]]] = js.undefined
}

object VerticalAlignProps {
  @scala.inline
  def apply[TLength](verticalAlign: ResponsiveValue[VerticalAlignProperty[TLength]] = null): VerticalAlignProps[TLength] = {
    val __obj = js.Dynamic.literal()
    if (verticalAlign != null) __obj.updateDynamic("verticalAlign")(verticalAlign.asInstanceOf[js.Any])
    __obj.asInstanceOf[VerticalAlignProps[TLength]]
  }
}

