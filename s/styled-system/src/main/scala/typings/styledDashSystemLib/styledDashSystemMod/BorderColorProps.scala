package typings
package styledDashSystemLib.styledDashSystemMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BorderColorProps extends js.Object {
  /**
    * The border-color shorthand CSS property sets the color of all sides of an element's border.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/border-color)
    */
  var borderColor: js.UndefOr[ResponsiveValue[csstypeLib.csstypeMod.BorderColorProperty]] = js.undefined
}

object BorderColorProps {
  @scala.inline
  def apply(borderColor: ResponsiveValue[csstypeLib.csstypeMod.BorderColorProperty] = null): BorderColorProps = {
    val __obj = js.Dynamic.literal()
    if (borderColor != null) __obj.updateDynamic("borderColor")(borderColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[BorderColorProps]
  }
}

