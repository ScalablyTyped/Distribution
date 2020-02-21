package typings.styledSystem.mod

import typings.csstype.mod.BorderBottomProperty
import typings.csstype.mod.BorderBottomStyleProperty
import typings.csstype.mod.BorderLeftProperty
import typings.csstype.mod.BorderLeftStyleProperty
import typings.csstype.mod.BorderRightProperty
import typings.csstype.mod.BorderRightStyleProperty
import typings.csstype.mod.BorderStyleProperty
import typings.csstype.mod.BorderTopProperty
import typings.csstype.mod.BorderTopStyleProperty
import typings.styledSystem.styledSystemStrings.borderWidths
import typings.styledSystem.styledSystemStrings.colors
import typings.styledSystem.styledSystemStrings.radii
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BorderProps[ThemeType /* <: Theme[TLengthStyledSystem] */, TVal]
  extends BorderWidthProps[ThemeType, ThemeValue[borderWidths, ThemeType, js.Any]]
     with BorderStyleProps[ThemeType]
     with BorderColorProps[ThemeType, ThemeValue[colors, ThemeType, js.Any]]
     with BorderRadiusProps[ThemeType, ThemeValue[radii, ThemeType, js.Any]]
     with BorderTopProps[ThemeType, BorderTopProperty[TLengthStyledSystem]]
     with BorderRightProps[ThemeType, BorderRightProperty[TLengthStyledSystem]]
     with BorderBottomProps[ThemeType, BorderBottomProperty[TLengthStyledSystem]]
     with BorderLeftProps[ThemeType, BorderLeftProperty[TLengthStyledSystem]] {
  /**
    * The border CSS property sets an element's border. It's a shorthand for border-width, border-style,
    * and border-color.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/border)
    */
  var border: js.UndefOr[ResponsiveValue[TVal, ThemeType]] = js.undefined
  var borderX: js.UndefOr[ResponsiveValue[TVal, ThemeType]] = js.undefined
  var borderY: js.UndefOr[ResponsiveValue[TVal, ThemeType]] = js.undefined
}

object BorderProps {
  @scala.inline
  def apply[ThemeType /* <: Theme[TLengthStyledSystem] */, TVal](
    border: ResponsiveValue[TVal, ThemeType] = null,
    borderBottom: ResponsiveValue[BorderBottomProperty[TLengthStyledSystem], ThemeType] = null,
    borderBottomColor: ResponsiveValue[ThemeValue[colors, ThemeType, js.Any], ThemeType] = null,
    borderBottomLeftRadius: ResponsiveValue[ThemeValue[radii, ThemeType, js.Any], ThemeType] = null,
    borderBottomRightRadius: ResponsiveValue[ThemeValue[radii, ThemeType, js.Any], ThemeType] = null,
    borderBottomStyle: ResponsiveValue[BorderBottomStyleProperty, ThemeType] = null,
    borderBottomWidth: ResponsiveValue[ThemeValue[borderWidths, ThemeType, js.Any], ThemeType] = null,
    borderColor: ResponsiveValue[ThemeValue[colors, ThemeType, js.Any], ThemeType] = null,
    borderLeft: ResponsiveValue[BorderLeftProperty[TLengthStyledSystem], ThemeType] = null,
    borderLeftColor: ResponsiveValue[ThemeValue[colors, ThemeType, js.Any], ThemeType] = null,
    borderLeftStyle: ResponsiveValue[BorderLeftStyleProperty, ThemeType] = null,
    borderLeftWidth: ResponsiveValue[ThemeValue[borderWidths, ThemeType, js.Any], ThemeType] = null,
    borderRadius: ResponsiveValue[ThemeValue[radii, ThemeType, js.Any], ThemeType] = null,
    borderRight: ResponsiveValue[BorderRightProperty[TLengthStyledSystem], ThemeType] = null,
    borderRightColor: ResponsiveValue[ThemeValue[colors, ThemeType, js.Any], ThemeType] = null,
    borderRightStyle: ResponsiveValue[BorderRightStyleProperty, ThemeType] = null,
    borderRightWidth: ResponsiveValue[ThemeValue[borderWidths, ThemeType, js.Any], ThemeType] = null,
    borderStyle: ResponsiveValue[BorderStyleProperty, ThemeType] = null,
    borderTop: ResponsiveValue[BorderTopProperty[TLengthStyledSystem], ThemeType] = null,
    borderTopColor: ResponsiveValue[ThemeValue[colors, ThemeType, js.Any], ThemeType] = null,
    borderTopLeftRadius: ResponsiveValue[ThemeValue[radii, ThemeType, js.Any], ThemeType] = null,
    borderTopRightRadius: ResponsiveValue[ThemeValue[radii, ThemeType, js.Any], ThemeType] = null,
    borderTopStyle: ResponsiveValue[BorderTopStyleProperty, ThemeType] = null,
    borderTopWidth: ResponsiveValue[ThemeValue[borderWidths, ThemeType, js.Any], ThemeType] = null,
    borderWidth: ResponsiveValue[ThemeValue[borderWidths, ThemeType, js.Any], ThemeType] = null,
    borderX: ResponsiveValue[TVal, ThemeType] = null,
    borderY: ResponsiveValue[TVal, ThemeType] = null
  ): BorderProps[ThemeType, TVal] = {
    val __obj = js.Dynamic.literal()
    if (border != null) __obj.updateDynamic("border")(border.asInstanceOf[js.Any])
    if (borderBottom != null) __obj.updateDynamic("borderBottom")(borderBottom.asInstanceOf[js.Any])
    if (borderBottomColor != null) __obj.updateDynamic("borderBottomColor")(borderBottomColor.asInstanceOf[js.Any])
    if (borderBottomLeftRadius != null) __obj.updateDynamic("borderBottomLeftRadius")(borderBottomLeftRadius.asInstanceOf[js.Any])
    if (borderBottomRightRadius != null) __obj.updateDynamic("borderBottomRightRadius")(borderBottomRightRadius.asInstanceOf[js.Any])
    if (borderBottomStyle != null) __obj.updateDynamic("borderBottomStyle")(borderBottomStyle.asInstanceOf[js.Any])
    if (borderBottomWidth != null) __obj.updateDynamic("borderBottomWidth")(borderBottomWidth.asInstanceOf[js.Any])
    if (borderColor != null) __obj.updateDynamic("borderColor")(borderColor.asInstanceOf[js.Any])
    if (borderLeft != null) __obj.updateDynamic("borderLeft")(borderLeft.asInstanceOf[js.Any])
    if (borderLeftColor != null) __obj.updateDynamic("borderLeftColor")(borderLeftColor.asInstanceOf[js.Any])
    if (borderLeftStyle != null) __obj.updateDynamic("borderLeftStyle")(borderLeftStyle.asInstanceOf[js.Any])
    if (borderLeftWidth != null) __obj.updateDynamic("borderLeftWidth")(borderLeftWidth.asInstanceOf[js.Any])
    if (borderRadius != null) __obj.updateDynamic("borderRadius")(borderRadius.asInstanceOf[js.Any])
    if (borderRight != null) __obj.updateDynamic("borderRight")(borderRight.asInstanceOf[js.Any])
    if (borderRightColor != null) __obj.updateDynamic("borderRightColor")(borderRightColor.asInstanceOf[js.Any])
    if (borderRightStyle != null) __obj.updateDynamic("borderRightStyle")(borderRightStyle.asInstanceOf[js.Any])
    if (borderRightWidth != null) __obj.updateDynamic("borderRightWidth")(borderRightWidth.asInstanceOf[js.Any])
    if (borderStyle != null) __obj.updateDynamic("borderStyle")(borderStyle.asInstanceOf[js.Any])
    if (borderTop != null) __obj.updateDynamic("borderTop")(borderTop.asInstanceOf[js.Any])
    if (borderTopColor != null) __obj.updateDynamic("borderTopColor")(borderTopColor.asInstanceOf[js.Any])
    if (borderTopLeftRadius != null) __obj.updateDynamic("borderTopLeftRadius")(borderTopLeftRadius.asInstanceOf[js.Any])
    if (borderTopRightRadius != null) __obj.updateDynamic("borderTopRightRadius")(borderTopRightRadius.asInstanceOf[js.Any])
    if (borderTopStyle != null) __obj.updateDynamic("borderTopStyle")(borderTopStyle.asInstanceOf[js.Any])
    if (borderTopWidth != null) __obj.updateDynamic("borderTopWidth")(borderTopWidth.asInstanceOf[js.Any])
    if (borderWidth != null) __obj.updateDynamic("borderWidth")(borderWidth.asInstanceOf[js.Any])
    if (borderX != null) __obj.updateDynamic("borderX")(borderX.asInstanceOf[js.Any])
    if (borderY != null) __obj.updateDynamic("borderY")(borderY.asInstanceOf[js.Any])
    __obj.asInstanceOf[BorderProps[ThemeType, TVal]]
  }
}

