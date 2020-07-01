package typings.styledSystem.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BorderLeftProps[ThemeType /* <: Theme[TLengthStyledSystem] */, TVal] extends js.Object {
  /**
    * The border-left CSS property is a shorthand that sets the values of border-left-width,
    * border-left-style, and border-left-color. These properties describe an element's left border.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/border-left)
    */
  var borderLeft: js.UndefOr[ResponsiveValue[TVal, ThemeType]] = js.undefined
}

object BorderLeftProps {
  @scala.inline
  def apply[/* <: typings.styledSystem.mod.Theme[typings.styledSystem.mod.TLengthStyledSystem] */ ThemeType, TVal](borderLeft: js.UndefOr[Null | (ResponsiveValue[TVal, ThemeType])] = js.undefined): BorderLeftProps[ThemeType, TVal] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(borderLeft)) __obj.updateDynamic("borderLeft")(borderLeft.asInstanceOf[js.Any])
    __obj.asInstanceOf[BorderLeftProps[ThemeType, TVal]]
  }
}

