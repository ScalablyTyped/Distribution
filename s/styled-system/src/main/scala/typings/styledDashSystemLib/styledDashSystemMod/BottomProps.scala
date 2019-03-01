package typings
package styledDashSystemLib.styledDashSystemMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BottomProps[TLength] extends js.Object {
  /**
    * The bottom CSS property participates in specifying the vertical position of a
    * positioned element. It has no effect on non-positioned elements.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/top)
    */
  var bottom: js.UndefOr[ResponsiveValue[csstypeLib.csstypeMod.BottomProperty[TLength]]] = js.undefined
}

object BottomProps {
  @scala.inline
  def apply[TLength](bottom: ResponsiveValue[csstypeLib.csstypeMod.BottomProperty[TLength]] = null): BottomProps[TLength] = {
    val __obj = js.Dynamic.literal()
    if (bottom != null) __obj.updateDynamic("bottom")(bottom.asInstanceOf[js.Any])
    __obj.asInstanceOf[BottomProps[TLength]]
  }
}

