package typings.styledSystem.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BorderWidthProps[ThemeType /* <: Theme[TLengthStyledSystem] */, TVal] extends js.Object {
  /**
    * The border-bottom-width CSS property sets the width of the bottom border of an element.
    *
    * [MDN * reference](https://developer.mozilla.org/en-US/docs/Web/CSS/border-bottom-width)
    */
  var borderBottomWidth: js.UndefOr[ResponsiveValue[TVal, ThemeType]] = js.undefined
  /**
    * The border-left-width CSS property sets the width of the left border of an element.
    *
    * [MDN * reference](https://developer.mozilla.org/en-US/docs/Web/CSS/border-left-width)
    */
  var borderLeftWidth: js.UndefOr[ResponsiveValue[TVal, ThemeType]] = js.undefined
  /**
    * The border-right-width CSS property sets the width of the right border of an element.
    *
    * [MDN * reference](https://developer.mozilla.org/en-US/docs/Web/CSS/border-right-width)
    */
  var borderRightWidth: js.UndefOr[ResponsiveValue[TVal, ThemeType]] = js.undefined
  /**
    * The border-top-width CSS property sets the width of the top border of an element.
    *
    * [MDN * reference](https://developer.mozilla.org/en-US/docs/Web/CSS/border-top-width)
    */
  var borderTopWidth: js.UndefOr[ResponsiveValue[TVal, ThemeType]] = js.undefined
  /**
    * The border-width shorthand CSS property sets the width of all sides of an element's border.
    *
    * [MDN * reference](https://developer.mozilla.org/en-US/docs/Web/CSS/border-width)
    */
  var borderWidth: js.UndefOr[ResponsiveValue[TVal, ThemeType]] = js.undefined
}

object BorderWidthProps {
  @scala.inline
  def apply[ThemeType, TVal](
    borderBottomWidth: js.UndefOr[Null | (ResponsiveValue[TVal, ThemeType])] = js.undefined,
    borderLeftWidth: js.UndefOr[Null | (ResponsiveValue[TVal, ThemeType])] = js.undefined,
    borderRightWidth: js.UndefOr[Null | (ResponsiveValue[TVal, ThemeType])] = js.undefined,
    borderTopWidth: js.UndefOr[Null | (ResponsiveValue[TVal, ThemeType])] = js.undefined,
    borderWidth: js.UndefOr[Null | (ResponsiveValue[TVal, ThemeType])] = js.undefined
  ): BorderWidthProps[ThemeType, TVal] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(borderBottomWidth)) __obj.updateDynamic("borderBottomWidth")(borderBottomWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(borderLeftWidth)) __obj.updateDynamic("borderLeftWidth")(borderLeftWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(borderRightWidth)) __obj.updateDynamic("borderRightWidth")(borderRightWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(borderTopWidth)) __obj.updateDynamic("borderTopWidth")(borderTopWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(borderWidth)) __obj.updateDynamic("borderWidth")(borderWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[BorderWidthProps[ThemeType, TVal]]
  }
}

