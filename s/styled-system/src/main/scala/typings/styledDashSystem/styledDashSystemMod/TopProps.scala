package typings.styledDashSystem.styledDashSystemMod

import typings.csstype.csstypeMod.TopProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TopProps[TLength] extends js.Object {
  /**
    * The top CSS property participates in specifying the vertical position of a
    * positioned element. It has no effect on non-positioned elements.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/top)
    */
  var top: js.UndefOr[ResponsiveValue[TopProperty[TLength]]] = js.undefined
}

object TopProps {
  @scala.inline
  def apply[TLength](top: ResponsiveValue[TopProperty[TLength]] = null): TopProps[TLength] = {
    val __obj = js.Dynamic.literal()
    if (top != null) __obj.updateDynamic("top")(top.asInstanceOf[js.Any])
    __obj.asInstanceOf[TopProps[TLength]]
  }
}

