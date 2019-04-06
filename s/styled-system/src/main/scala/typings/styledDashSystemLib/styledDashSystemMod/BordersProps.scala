package typings
package styledDashSystemLib.styledDashSystemMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BordersProps
  extends BorderProps[TLengthStyledSystem]
     with BorderTopProps[TLengthStyledSystem]
     with BorderRightProps[TLengthStyledSystem]
     with BorderBottomProps[TLengthStyledSystem]
     with BorderLeftProps[TLengthStyledSystem]
     with BorderWidthProps[TLengthStyledSystem]
     with BorderColorProps
     with BorderStyleProps
     with BorderRadiusProps[TLengthStyledSystem]

object BordersProps {
  @scala.inline
  def apply(
    border: ResponsiveValue[csstypeLib.csstypeMod.BorderProperty[TLengthStyledSystem]] = null,
    borderBottom: ResponsiveValue[csstypeLib.csstypeMod.BorderBottomProperty[TLengthStyledSystem]] = null,
    borderColor: ResponsiveValue[csstypeLib.csstypeMod.BorderColorProperty] = null,
    borderLeft: ResponsiveValue[csstypeLib.csstypeMod.BorderLeftProperty[TLengthStyledSystem]] = null,
    borderRadius: ResponsiveValue[csstypeLib.csstypeMod.BorderRadiusProperty[TLengthStyledSystem]] = null,
    borderRight: ResponsiveValue[csstypeLib.csstypeMod.BorderRightProperty[TLengthStyledSystem]] = null,
    borderStyle: ResponsiveValue[csstypeLib.csstypeMod.BorderStyleProperty] = null,
    borderTop: ResponsiveValue[csstypeLib.csstypeMod.BorderTopProperty[TLengthStyledSystem]] = null,
    borderWidth: ResponsiveValue[csstypeLib.csstypeMod.BorderWidthProperty[TLengthStyledSystem]] = null
  ): BordersProps = {
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
    __obj.asInstanceOf[BordersProps]
  }
}

