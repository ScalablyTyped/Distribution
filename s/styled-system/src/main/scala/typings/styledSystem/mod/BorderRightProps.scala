package typings.styledSystem.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BorderRightProps[ThemeType /* <: Theme[TLengthStyledSystem] */, TVal] extends js.Object {
  /**
    * The border-right CSS property is a shorthand that sets border-right-width, border-right-style,
    * and border-right-color. These properties set an element's right border.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/border-right)
    */
  var borderRight: js.UndefOr[ResponsiveValue[TVal, ThemeType]] = js.undefined
}

object BorderRightProps {
  @scala.inline
  def apply[/* <: typings.styledSystem.mod.Theme[typings.styledSystem.mod.TLengthStyledSystem] */ ThemeType, TVal](borderRight: js.UndefOr[Null | (ResponsiveValue[TVal, ThemeType])] = js.undefined): BorderRightProps[ThemeType, TVal] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(borderRight)) __obj.updateDynamic("borderRight")(borderRight.asInstanceOf[js.Any])
    __obj.asInstanceOf[BorderRightProps[ThemeType, TVal]]
  }
}

