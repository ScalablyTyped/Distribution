package typings.styledSystem.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BorderBottomProps[ThemeType /* <: Theme[TLengthStyledSystem] */, TVal] extends js.Object {
  /**
    * The border-bottom CSS property sets an element's bottom border. It's a shorthand for
    * border-bottom-width, border-bottom-style and border-bottom-color.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/border-bottom)
    */
  var borderBottom: js.UndefOr[ResponsiveValue[TVal, ThemeType]] = js.undefined
}

object BorderBottomProps {
  @scala.inline
  def apply[ThemeType /* <: Theme[TLengthStyledSystem] */, TVal](borderBottom: ResponsiveValue[TVal, ThemeType] = null): BorderBottomProps[ThemeType, TVal] = {
    val __obj = js.Dynamic.literal()
    if (borderBottom != null) __obj.updateDynamic("borderBottom")(borderBottom.asInstanceOf[js.Any])
    __obj.asInstanceOf[BorderBottomProps[ThemeType, TVal]]
  }
}

