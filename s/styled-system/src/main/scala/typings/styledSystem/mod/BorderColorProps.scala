package typings.styledSystem.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BorderColorProps[ThemeType /* <: Theme[TLengthStyledSystem] */, TVal] extends js.Object {
  /**
    * The border-bottom-color CSS property sets the color of an element's bottom border. It can also be set with the shorthand CSS properties border-color or border-bottom.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/border-bottom-color)
    */
  var borderBottomColor: js.UndefOr[ResponsiveValue[TVal, ThemeType]] = js.undefined
  /**
    * The border-color shorthand CSS property sets the color of all sides of an element's border.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/border-color)
    */
  var borderColor: js.UndefOr[ResponsiveValue[TVal, ThemeType]] = js.undefined
  /**
    * The border-left-color CSS property sets the color of an element's left border. It can also be set with the shorthand CSS properties border-color or border-left.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/border-left-color)
    */
  var borderLeftColor: js.UndefOr[ResponsiveValue[TVal, ThemeType]] = js.undefined
  /**
    * The border-right-color CSS property sets the color of an element's right border. It can also be set with the shorthand CSS properties border-color or border-right.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/border-right-color)
    */
  var borderRightColor: js.UndefOr[ResponsiveValue[TVal, ThemeType]] = js.undefined
  /**
    * The border-top-color CSS property sets the color of an element's top border. It can also be set with the shorthand CSS properties border-color or border-top.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/border-top-color)
    */
  var borderTopColor: js.UndefOr[ResponsiveValue[TVal, ThemeType]] = js.undefined
}

object BorderColorProps {
  @scala.inline
  def apply[ThemeType, TVal](
    borderBottomColor: js.UndefOr[Null | (ResponsiveValue[TVal, ThemeType])] = js.undefined,
    borderColor: js.UndefOr[Null | (ResponsiveValue[TVal, ThemeType])] = js.undefined,
    borderLeftColor: js.UndefOr[Null | (ResponsiveValue[TVal, ThemeType])] = js.undefined,
    borderRightColor: js.UndefOr[Null | (ResponsiveValue[TVal, ThemeType])] = js.undefined,
    borderTopColor: js.UndefOr[Null | (ResponsiveValue[TVal, ThemeType])] = js.undefined
  ): BorderColorProps[ThemeType, TVal] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(borderBottomColor)) __obj.updateDynamic("borderBottomColor")(borderBottomColor.asInstanceOf[js.Any])
    if (!js.isUndefined(borderColor)) __obj.updateDynamic("borderColor")(borderColor.asInstanceOf[js.Any])
    if (!js.isUndefined(borderLeftColor)) __obj.updateDynamic("borderLeftColor")(borderLeftColor.asInstanceOf[js.Any])
    if (!js.isUndefined(borderRightColor)) __obj.updateDynamic("borderRightColor")(borderRightColor.asInstanceOf[js.Any])
    if (!js.isUndefined(borderTopColor)) __obj.updateDynamic("borderTopColor")(borderTopColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[BorderColorProps[ThemeType, TVal]]
  }
}

