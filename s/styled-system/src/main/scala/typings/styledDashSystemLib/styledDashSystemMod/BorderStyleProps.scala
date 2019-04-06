package typings
package styledDashSystemLib.styledDashSystemMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BorderStyleProps extends js.Object {
  /**
    * The border-style shorthand CSS property sets the style of all sides of an element's border.
    *
    * [MDN * reference](https://developer.mozilla.org/en-US/docs/Web/CSS/border-style)
    */
  var borderStyle: js.UndefOr[ResponsiveValue[csstypeLib.csstypeMod.BorderStyleProperty]] = js.undefined
}

object BorderStyleProps {
  @scala.inline
  def apply(borderStyle: ResponsiveValue[csstypeLib.csstypeMod.BorderStyleProperty] = null): BorderStyleProps = {
    val __obj = js.Dynamic.literal()
    if (borderStyle != null) __obj.updateDynamic("borderStyle")(borderStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[BorderStyleProps]
  }
}

