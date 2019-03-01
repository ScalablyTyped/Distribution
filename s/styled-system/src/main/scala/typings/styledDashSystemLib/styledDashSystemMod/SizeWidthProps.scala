package typings
package styledDashSystemLib.styledDashSystemMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SizeWidthProps[TLength] extends js.Object {
  var size: js.UndefOr[ResponsiveValue[csstypeLib.csstypeMod.WidthProperty[TLength]]] = js.undefined
}

object SizeWidthProps {
  @scala.inline
  def apply[TLength](size: ResponsiveValue[csstypeLib.csstypeMod.WidthProperty[TLength]] = null): SizeWidthProps[TLength] = {
    val __obj = js.Dynamic.literal()
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[SizeWidthProps[TLength]]
  }
}

