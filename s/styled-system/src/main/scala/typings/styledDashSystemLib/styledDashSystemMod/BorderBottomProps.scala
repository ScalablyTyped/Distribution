package typings
package styledDashSystemLib.styledDashSystemMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BorderBottomProps[TLength] extends js.Object {
  /**
    * The border-bottom CSS property sets an element's bottom border. It's a shorthand for
    * border-bottom-width, border-bottom-style and border-bottom-color.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/border-bottom)
    */
  var borderBottom: js.UndefOr[ResponsiveValue[csstypeLib.csstypeMod.BorderBottomProperty[TLength]]] = js.undefined
}

object BorderBottomProps {
  @scala.inline
  def apply[TLength](borderBottom: ResponsiveValue[csstypeLib.csstypeMod.BorderBottomProperty[TLength]] = null): BorderBottomProps[TLength] = {
    val __obj = js.Dynamic.literal()
    if (borderBottom != null) __obj.updateDynamic("borderBottom")(borderBottom.asInstanceOf[js.Any])
    __obj.asInstanceOf[BorderBottomProps[TLength]]
  }
}

