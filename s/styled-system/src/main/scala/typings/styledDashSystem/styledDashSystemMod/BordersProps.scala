package typings.styledDashSystem.styledDashSystemMod

import typings.csstype.csstypeMod.BorderBottomProperty
import typings.csstype.csstypeMod.BorderColorProperty
import typings.csstype.csstypeMod.BorderLeftProperty
import typings.csstype.csstypeMod.BorderProperty
import typings.csstype.csstypeMod.BorderRadiusProperty
import typings.csstype.csstypeMod.BorderRightProperty
import typings.csstype.csstypeMod.BorderStyleProperty
import typings.csstype.csstypeMod.BorderTopProperty
import typings.csstype.csstypeMod.BorderWidthProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BordersProps extends BorderProps[TLengthStyledSystem]

object BordersProps {
  @scala.inline
  def apply(
    border: ResponsiveValue[BorderProperty[TLengthStyledSystem]] = null,
    borderBottom: ResponsiveValue[BorderBottomProperty[TLengthStyledSystem]] = null,
    borderColor: ResponsiveValue[BorderColorProperty] = null,
    borderLeft: ResponsiveValue[BorderLeftProperty[TLengthStyledSystem]] = null,
    borderRadius: ResponsiveValue[BorderRadiusProperty[TLengthStyledSystem]] = null,
    borderRight: ResponsiveValue[BorderRightProperty[TLengthStyledSystem]] = null,
    borderStyle: ResponsiveValue[BorderStyleProperty] = null,
    borderTop: ResponsiveValue[BorderTopProperty[TLengthStyledSystem]] = null,
    borderWidth: ResponsiveValue[BorderWidthProperty[TLengthStyledSystem]] = null,
    borderX: ResponsiveValue[BorderProperty[TLengthStyledSystem]] = null,
    borderY: ResponsiveValue[BorderProperty[TLengthStyledSystem]] = null
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
    if (borderX != null) __obj.updateDynamic("borderX")(borderX.asInstanceOf[js.Any])
    if (borderY != null) __obj.updateDynamic("borderY")(borderY.asInstanceOf[js.Any])
    __obj.asInstanceOf[BordersProps]
  }
}

