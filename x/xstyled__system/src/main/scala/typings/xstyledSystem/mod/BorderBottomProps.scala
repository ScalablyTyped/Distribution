package typings.xstyledSystem.mod

import typings.csstype.mod.BorderBottomProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BorderBottomProps[TLength] extends js.Object {
  val borderBottom: js.UndefOr[ResponsiveValue[BorderBottomProperty[TLength]]] = js.undefined
}

object BorderBottomProps {
  @scala.inline
  def apply[TLength](borderBottom: ResponsiveValue[BorderBottomProperty[TLength]] = null): BorderBottomProps[TLength] = {
    val __obj = js.Dynamic.literal()
    if (borderBottom != null) __obj.updateDynamic("borderBottom")(borderBottom.asInstanceOf[js.Any])
    __obj.asInstanceOf[BorderBottomProps[TLength]]
  }
}

