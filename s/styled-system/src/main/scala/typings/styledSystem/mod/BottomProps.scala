package typings.styledSystem.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BottomProps[ThemeType /* <: Theme[TLengthStyledSystem] */, TVal] extends js.Object {
  /**
    * The bottom CSS property participates in specifying the vertical position of a
    * positioned element. It has no effect on non-positioned elements.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/top)
    */
  var bottom: js.UndefOr[ResponsiveValue[TVal, ThemeType]] = js.undefined
}

object BottomProps {
  @scala.inline
  def apply[ThemeType, TVal](bottom: js.UndefOr[Null | (ResponsiveValue[TVal, ThemeType])] = js.undefined): BottomProps[ThemeType, TVal] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(bottom)) __obj.updateDynamic("bottom")(bottom.asInstanceOf[js.Any])
    __obj.asInstanceOf[BottomProps[ThemeType, TVal]]
  }
}

