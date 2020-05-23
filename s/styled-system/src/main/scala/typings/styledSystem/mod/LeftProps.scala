package typings.styledSystem.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LeftProps[ThemeType /* <: Theme[TLengthStyledSystem] */, TVal] extends js.Object {
  /**
    * The left CSS property participates in specifying the horizontal position
    * of a positioned element. It has no effect on non-positioned elements.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/left)
    */
  var left: js.UndefOr[ResponsiveValue[TVal, ThemeType]] = js.undefined
}

object LeftProps {
  @scala.inline
  def apply[ThemeType, TVal](left: js.UndefOr[Null | (ResponsiveValue[TVal, ThemeType])] = js.undefined): LeftProps[ThemeType, TVal] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(left)) __obj.updateDynamic("left")(left.asInstanceOf[js.Any])
    __obj.asInstanceOf[LeftProps[ThemeType, TVal]]
  }
}

