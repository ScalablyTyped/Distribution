package typings
package styledDashSystemLib.styledDashSystemMod

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
  var border: js.UndefOr[ResponsiveValue[csstypeLib.csstypeMod.BorderProperty[TLength]]] = js.undefined
  var borderX: js.UndefOr[ResponsiveValue[csstypeLib.csstypeMod.BorderProperty[TLength]]] = js.undefined
  var borderY: js.UndefOr[ResponsiveValue[csstypeLib.csstypeMod.BorderProperty[TLength]]] = js.undefined
}

object BorderProps {
  @scala.inline
  def apply[TLength](
    border: ResponsiveValue[csstypeLib.csstypeMod.BorderProperty[TLength]] = null,
    borderBottom: ResponsiveValue[csstypeLib.csstypeMod.BorderBottomProperty[TLengthStyledSystem]] = null,
    borderColor: ResponsiveValue[csstypeLib.csstypeMod.BorderColorProperty] = null,
    borderLeft: ResponsiveValue[csstypeLib.csstypeMod.BorderLeftProperty[TLengthStyledSystem]] = null,
    borderRadius: ResponsiveValue[csstypeLib.csstypeMod.BorderRadiusProperty[TLengthStyledSystem]] = null,
    borderRight: ResponsiveValue[csstypeLib.csstypeMod.BorderRightProperty[TLengthStyledSystem]] = null,
    borderStyle: ResponsiveValue[csstypeLib.csstypeMod.BorderStyleProperty] = null,
    borderTop: ResponsiveValue[csstypeLib.csstypeMod.BorderTopProperty[TLengthStyledSystem]] = null,
    borderWidth: ResponsiveValue[csstypeLib.csstypeMod.BorderWidthProperty[TLengthStyledSystem]] = null,
    borderX: ResponsiveValue[csstypeLib.csstypeMod.BorderProperty[TLength]] = null,
    borderY: ResponsiveValue[csstypeLib.csstypeMod.BorderProperty[TLength]] = null
  ): BorderProps[TLength] = {
    val __obj = js.Dynamic.literal()
    if (border != null) __obj.updateDynamic("border")(border.asInstanceOf[js.Any])
    if (borderBottom != null) __obj.updateDynamic("borderBottom")(borderBottom.asInstanceOf[js.Any])
    if (borderColor != null) __obj.updateDynamic("borderColor")(borderColor.asInstanceOf[js.Any])
    if (borderLeft != null) __obj.updateDynamic("borderLeft")(borderLeft.asInstanceOf[js.Any])
    if (borderRadius != null) __obj.updateDynamic("borderRadius")(borderRadius.asInstanceOf[js.Any])
    if (borderRight != null) __obj.updateDynamic("borderRight")(borderRight.asInstanceOf[js.Any])
    if (borderStyle != null) __obj.updateDynamic("borderStyle")(borderStyle.asInstanceOf[js.Any])
    if (borderTop != null) __obj.updateDynamic("borderTop")(borderTop.asInstanceOf[js.Any])
    if (borderWidth != null) __obj.updateDynamic("borderWidth")(borderWidth.asInstanceOf[js.Any])
    if (borderX != null) __obj.updateDynamic("borderX")(borderX.asInstanceOf[js.Any])
    if (borderY != null) __obj.updateDynamic("borderY")(borderY.asInstanceOf[js.Any])
    __obj.asInstanceOf[BorderProps[TLength]]
  }
}

