package typings.styledSystem.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BorderTopProps[ThemeType /* <: Theme[TLengthStyledSystem] */, TVal] extends js.Object {
  /**
    * The border-top CSS property is a shorthand that sets the values of border-top-width, border-top-style,
    * and border-top-color. These properties describe an element's top border.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/border-top)
    */
  var borderTop: js.UndefOr[ResponsiveValue[TVal, ThemeType]] = js.undefined
}

object BorderTopProps {
  @scala.inline
  def apply[ThemeType, TVal](borderTop: js.UndefOr[Null | (ResponsiveValue[TVal, ThemeType])] = js.undefined): BorderTopProps[ThemeType, TVal] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(borderTop)) __obj.updateDynamic("borderTop")(borderTop.asInstanceOf[js.Any])
    __obj.asInstanceOf[BorderTopProps[ThemeType, TVal]]
  }
}

