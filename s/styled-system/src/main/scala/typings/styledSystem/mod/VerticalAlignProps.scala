package typings.styledSystem.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VerticalAlignProps[ThemeType /* <: Theme[TLengthStyledSystem] */, TVal] extends js.Object {
  /**
    * The vertical-align CSS property specifies sets vertical alignment of an inline or table-cell box.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/vertical-align)
    */
  var verticalAlign: js.UndefOr[ResponsiveValue[TVal, ThemeType]] = js.undefined
}

object VerticalAlignProps {
  @scala.inline
  def apply[ThemeType, TVal](verticalAlign: js.UndefOr[Null | (ResponsiveValue[TVal, ThemeType])] = js.undefined): VerticalAlignProps[ThemeType, TVal] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(verticalAlign)) __obj.updateDynamic("verticalAlign")(verticalAlign.asInstanceOf[js.Any])
    __obj.asInstanceOf[VerticalAlignProps[ThemeType, TVal]]
  }
}

