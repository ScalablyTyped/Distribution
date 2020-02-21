package typings.styledSystem.mod

import typings.csstype.mod.BorderBottomStyleProperty
import typings.csstype.mod.BorderLeftStyleProperty
import typings.csstype.mod.BorderRightStyleProperty
import typings.csstype.mod.BorderStyleProperty
import typings.csstype.mod.BorderTopStyleProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BorderStyleProps[ThemeType /* <: Theme[TLengthStyledSystem] */] extends js.Object {
  /**
    * The border-bottom-style CSS property sets the line style of an element's bottom border.
    *
    * [MDN * reference](https://developer.mozilla.org/en-US/docs/Web/CSS/border-bottom-style)
    */
  var borderBottomStyle: js.UndefOr[ResponsiveValue[BorderBottomStyleProperty, ThemeType]] = js.undefined
  /**
    * The border-left-style CSS property sets the line style of an element's left border.
    *
    * [MDN * reference](https://developer.mozilla.org/en-US/docs/Web/CSS/border-left-style)
    */
  var borderLeftStyle: js.UndefOr[ResponsiveValue[BorderLeftStyleProperty, ThemeType]] = js.undefined
  /**
    * The border-right-style CSS property sets the line style of an element's right border.
    *
    * [MDN * reference](https://developer.mozilla.org/en-US/docs/Web/CSS/border-right-style)
    */
  var borderRightStyle: js.UndefOr[ResponsiveValue[BorderRightStyleProperty, ThemeType]] = js.undefined
  /**
    * The border-style shorthand CSS property sets the style of all sides of an element's border.
    *
    * [MDN * reference](https://developer.mozilla.org/en-US/docs/Web/CSS/border-style)
    */
  var borderStyle: js.UndefOr[ResponsiveValue[BorderStyleProperty, ThemeType]] = js.undefined
  /**
    * The border-top-style CSS property sets the line style of an element's top border.
    *
    * [MDN * reference](https://developer.mozilla.org/en-US/docs/Web/CSS/border-top-style)
    */
  var borderTopStyle: js.UndefOr[ResponsiveValue[BorderTopStyleProperty, ThemeType]] = js.undefined
}

object BorderStyleProps {
  @scala.inline
  def apply[ThemeType /* <: Theme[TLengthStyledSystem] */](
    borderBottomStyle: ResponsiveValue[BorderBottomStyleProperty, ThemeType] = null,
    borderLeftStyle: ResponsiveValue[BorderLeftStyleProperty, ThemeType] = null,
    borderRightStyle: ResponsiveValue[BorderRightStyleProperty, ThemeType] = null,
    borderStyle: ResponsiveValue[BorderStyleProperty, ThemeType] = null,
    borderTopStyle: ResponsiveValue[BorderTopStyleProperty, ThemeType] = null
  ): BorderStyleProps[ThemeType] = {
    val __obj = js.Dynamic.literal()
    if (borderBottomStyle != null) __obj.updateDynamic("borderBottomStyle")(borderBottomStyle.asInstanceOf[js.Any])
    if (borderLeftStyle != null) __obj.updateDynamic("borderLeftStyle")(borderLeftStyle.asInstanceOf[js.Any])
    if (borderRightStyle != null) __obj.updateDynamic("borderRightStyle")(borderRightStyle.asInstanceOf[js.Any])
    if (borderStyle != null) __obj.updateDynamic("borderStyle")(borderStyle.asInstanceOf[js.Any])
    if (borderTopStyle != null) __obj.updateDynamic("borderTopStyle")(borderTopStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[BorderStyleProps[ThemeType]]
  }
}

