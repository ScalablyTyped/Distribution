package typings.xstyledSystem.mod

import typings.csstype.mod.BorderWidthProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BorderWidthProps[TLength] extends js.Object {
  val borderWidth: js.UndefOr[ResponsiveValue[BorderWidthProperty[TLength]]] = js.undefined
}

object BorderWidthProps {
  @scala.inline
  def apply[TLength](borderWidth: ResponsiveValue[BorderWidthProperty[TLength]] = null): BorderWidthProps[TLength] = {
    val __obj = js.Dynamic.literal()
    if (borderWidth != null) __obj.updateDynamic("borderWidth")(borderWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[BorderWidthProps[TLength]]
  }
}

