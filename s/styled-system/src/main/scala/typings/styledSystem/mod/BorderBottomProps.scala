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
  def apply[/* <: typings.styledSystem.mod.Theme[typings.styledSystem.mod.TLengthStyledSystem] */ ThemeType, TVal](borderBottom: js.UndefOr[Null | (ResponsiveValue[TVal, ThemeType])] = js.undefined): BorderBottomProps[ThemeType, TVal] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(borderBottom)) __obj.updateDynamic("borderBottom")(borderBottom.asInstanceOf[js.Any])
    __obj.asInstanceOf[BorderBottomProps[ThemeType, TVal]]
  }
}

