package typings.styledSystem.mod

import typings.csstype.mod.BorderBottomColorProperty
import typings.csstype.mod.BorderBottomLeftRadiusProperty
import typings.csstype.mod.BorderBottomProperty
import typings.csstype.mod.BorderBottomRightRadiusProperty
import typings.csstype.mod.BorderBottomStyleProperty
import typings.csstype.mod.BorderBottomWidthProperty
import typings.csstype.mod.BorderColorProperty
import typings.csstype.mod.BorderLeftColorProperty
import typings.csstype.mod.BorderLeftProperty
import typings.csstype.mod.BorderLeftStyleProperty
import typings.csstype.mod.BorderLeftWidthProperty
import typings.csstype.mod.BorderProperty
import typings.csstype.mod.BorderRadiusProperty
import typings.csstype.mod.BorderRightColorProperty
import typings.csstype.mod.BorderRightProperty
import typings.csstype.mod.BorderRightStyleProperty
import typings.csstype.mod.BorderRightWidthProperty
import typings.csstype.mod.BorderStyleProperty
import typings.csstype.mod.BorderTopColorProperty
import typings.csstype.mod.BorderTopLeftRadiusProperty
import typings.csstype.mod.BorderTopProperty
import typings.csstype.mod.BorderTopRightRadiusProperty
import typings.csstype.mod.BorderTopStyleProperty
import typings.csstype.mod.BorderTopWidthProperty
import typings.csstype.mod.BorderWidthProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BorderProps[TLength]
  extends BorderWidthProps[TLengthStyledSystem]
     with BorderStyleProps
     with BorderColorProps
     with BorderRadiusProps[TLengthStyledSystem]
     with BorderTopProps[TLengthStyledSystem]
     with BorderRightProps[TLengthStyledSystem]
     with BorderBottomProps[TLengthStyledSystem]
     with BorderLeftProps[TLengthStyledSystem] {
  /**
    * The border CSS property sets an element's border. It's a shorthand for border-width, border-style,
    * and border-color.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/border)
    */
  var border: js.UndefOr[ResponsiveValue[BorderProperty[TLength]]] = js.undefined
  var borderX: js.UndefOr[ResponsiveValue[BorderProperty[TLength]]] = js.undefined
  var borderY: js.UndefOr[ResponsiveValue[BorderProperty[TLength]]] = js.undefined
}

object BorderProps {
  @scala.inline
  def apply[TLength](
    border: ResponsiveValue[BorderProperty[TLength]] = null,
    borderBottom: ResponsiveValue[BorderBottomProperty[TLengthStyledSystem]] = null,
    borderBottomColor: ResponsiveValue[BorderBottomColorProperty] = null,
    borderBottomLeftRadius: ResponsiveValue[BorderBottomLeftRadiusProperty[TLengthStyledSystem]] = null,
    borderBottomRightRadius: ResponsiveValue[BorderBottomRightRadiusProperty[TLengthStyledSystem]] = null,
    borderBottomStyle: ResponsiveValue[BorderBottomStyleProperty] = null,
    borderBottomWidth: ResponsiveValue[BorderBottomWidthProperty[TLengthStyledSystem]] = null,
    borderColor: ResponsiveValue[BorderColorProperty] = null,
    borderLeft: ResponsiveValue[BorderLeftProperty[TLengthStyledSystem]] = null,
    borderLeftColor: ResponsiveValue[BorderLeftColorProperty] = null,
    borderLeftStyle: ResponsiveValue[BorderLeftStyleProperty] = null,
    borderLeftWidth: ResponsiveValue[BorderLeftWidthProperty[TLengthStyledSystem]] = null,
    borderRadius: ResponsiveValue[BorderRadiusProperty[TLengthStyledSystem]] = null,
    borderRight: ResponsiveValue[BorderRightProperty[TLengthStyledSystem]] = null,
    borderRightColor: ResponsiveValue[BorderRightColorProperty] = null,
    borderRightStyle: ResponsiveValue[BorderRightStyleProperty] = null,
    borderRightWidth: ResponsiveValue[BorderRightWidthProperty[TLengthStyledSystem]] = null,
    borderStyle: ResponsiveValue[BorderStyleProperty] = null,
    borderTop: ResponsiveValue[BorderTopProperty[TLengthStyledSystem]] = null,
    borderTopColor: ResponsiveValue[BorderTopColorProperty] = null,
    borderTopLeftRadius: ResponsiveValue[BorderTopLeftRadiusProperty[TLengthStyledSystem]] = null,
    borderTopRightRadius: ResponsiveValue[BorderTopRightRadiusProperty[TLengthStyledSystem]] = null,
    borderTopStyle: ResponsiveValue[BorderTopStyleProperty] = null,
    borderTopWidth: ResponsiveValue[BorderTopWidthProperty[TLengthStyledSystem]] = null,
    borderWidth: ResponsiveValue[BorderWidthProperty[TLengthStyledSystem]] = null,
    borderX: ResponsiveValue[BorderProperty[TLength]] = null,
    borderY: ResponsiveValue[BorderProperty[TLength]] = null
  ): BorderProps[TLength] = {
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
    __obj.asInstanceOf[BorderProps[TLength]]
  }
}

