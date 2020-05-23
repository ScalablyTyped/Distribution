package typings.styledSystem.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TopProps[ThemeType /* <: Theme[TLengthStyledSystem] */, TVal] extends js.Object {
  /**
    * The top CSS property participates in specifying the vertical position of a
    * positioned element. It has no effect on non-positioned elements.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/top)
    */
  var top: js.UndefOr[ResponsiveValue[TVal, ThemeType]] = js.undefined
}

object TopProps {
  @scala.inline
  def apply[ThemeType, TVal](top: js.UndefOr[Null | (ResponsiveValue[TVal, ThemeType])] = js.undefined): TopProps[ThemeType, TVal] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(top)) __obj.updateDynamic("top")(top.asInstanceOf[js.Any])
    __obj.asInstanceOf[TopProps[ThemeType, TVal]]
  }
}

