package typings.xstyledSystem.mod

import typings.csstype.mod.WidthProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WidthProps[TLength] extends js.Object {
  val width: js.UndefOr[ResponsiveValue[WidthProperty[TLength]]] = js.undefined
}

object WidthProps {
  @scala.inline
  def apply[TLength](width: ResponsiveValue[WidthProperty[TLength]] = null): WidthProps[TLength] = {
    val __obj = js.Dynamic.literal()
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[WidthProps[TLength]]
  }
}

