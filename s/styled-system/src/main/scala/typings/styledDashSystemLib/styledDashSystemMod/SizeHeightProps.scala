package typings
package styledDashSystemLib.styledDashSystemMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SizeHeightProps[TLength] extends js.Object {
  var size: js.UndefOr[ResponsiveValue[csstypeLib.csstypeMod.HeightProperty[TLength]]] = js.undefined
}

object SizeHeightProps {
  @scala.inline
  def apply[TLength](size: ResponsiveValue[csstypeLib.csstypeMod.HeightProperty[TLength]] = null): SizeHeightProps[TLength] = {
    val __obj = js.Dynamic.literal()
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[SizeHeightProps[TLength]]
  }
}

