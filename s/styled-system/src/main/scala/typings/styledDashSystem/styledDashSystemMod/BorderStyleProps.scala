package typings.styledDashSystem.styledDashSystemMod

import typings.csstype.csstypeMod.BorderBottomStyleProperty
import typings.csstype.csstypeMod.BorderLeftStyleProperty
import typings.csstype.csstypeMod.BorderRightStyleProperty
import typings.csstype.csstypeMod.BorderStyleProperty
import typings.csstype.csstypeMod.BorderTopStyleProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BorderStyleProps extends js.Object {
  /**
    * The border-bottom-style CSS property sets the line style of an element's bottom border.
    *
    * [MDN * reference](https://developer.mozilla.org/en-US/docs/Web/CSS/border-bottom-style)
    */
  var borderBottomStyle: js.UndefOr[ResponsiveValue[BorderBottomStyleProperty]] = js.undefined
  /**
    * The border-left-style CSS property sets the line style of an element's left border.
    *
    * [MDN * reference](https://developer.mozilla.org/en-US/docs/Web/CSS/border-left-style)
    */
  var borderLeftStyle: js.UndefOr[ResponsiveValue[BorderLeftStyleProperty]] = js.undefined
  /**
    * The border-right-style CSS property sets the line style of an element's right border.
    *
    * [MDN * reference](https://developer.mozilla.org/en-US/docs/Web/CSS/border-right-style)
    */
  var borderRightStyle: js.UndefOr[ResponsiveValue[BorderRightStyleProperty]] = js.undefined
  /**
    * The border-style shorthand CSS property sets the style of all sides of an element's border.
    *
    * [MDN * reference](https://developer.mozilla.org/en-US/docs/Web/CSS/border-style)
    */
  var borderStyle: js.UndefOr[ResponsiveValue[BorderStyleProperty]] = js.undefined
  /**
    * The border-top-style CSS property sets the line style of an element's top border.
    *
    * [MDN * reference](https://developer.mozilla.org/en-US/docs/Web/CSS/border-top-style)
    */
  var borderTopStyle: js.UndefOr[ResponsiveValue[BorderTopStyleProperty]] = js.undefined
}

object BorderStyleProps {
  @scala.inline
  def apply(
    borderBottomStyle: ResponsiveValue[BorderBottomStyleProperty] = null,
    borderLeftStyle: ResponsiveValue[BorderLeftStyleProperty] = null,
    borderRightStyle: ResponsiveValue[BorderRightStyleProperty] = null,
    borderStyle: ResponsiveValue[BorderStyleProperty] = null,
    borderTopStyle: ResponsiveValue[BorderTopStyleProperty] = null
  ): BorderStyleProps = {
    val __obj = js.Dynamic.literal()
    if (borderBottomStyle != null) __obj.updateDynamic("borderBottomStyle")(borderBottomStyle.asInstanceOf[js.Any])
    if (borderLeftStyle != null) __obj.updateDynamic("borderLeftStyle")(borderLeftStyle.asInstanceOf[js.Any])
    if (borderRightStyle != null) __obj.updateDynamic("borderRightStyle")(borderRightStyle.asInstanceOf[js.Any])
    if (borderStyle != null) __obj.updateDynamic("borderStyle")(borderStyle.asInstanceOf[js.Any])
    if (borderTopStyle != null) __obj.updateDynamic("borderTopStyle")(borderTopStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[BorderStyleProps]
  }
}

