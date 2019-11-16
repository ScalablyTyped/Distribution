package typings.atXstyledSystem.atXstyledSystemMod

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

trait BordersProps
  extends BorderProps[StyledSystemLength]
     with BorderTopProps[StyledSystemLength]
     with BorderTopColorProps
     with BorderRightProps[StyledSystemLength]
     with BorderRightColorProps
     with BorderBottomProps[StyledSystemLength]
     with BorderBottomColorProps
     with BorderLeftProps[StyledSystemLength]
     with BorderLeftColorProps
     with BorderColorProps
     with BorderWidthProps[StyledSystemLength]
     with BorderStyleProps
     with BorderRadiusProps[StyledSystemLength]

object BordersProps {
  @scala.inline
  def apply(
    border: ResponsiveValue[BorderProperty[StyledSystemLength]] = null,
    borderBottom: ResponsiveValue[BorderBottomProperty[StyledSystemLength]] = null,
    borderBottomColor: ResponsiveValue[BorderColorProperty] = null,
    borderColor: ResponsiveValue[BorderColorProperty] = null,
    borderLeft: ResponsiveValue[BorderLeftProperty[StyledSystemLength]] = null,
    borderLeftColor: ResponsiveValue[BorderColorProperty] = null,
    borderRadius: ResponsiveValue[BorderRadiusProperty[StyledSystemLength]] = null,
    borderRight: ResponsiveValue[BorderRightProperty[StyledSystemLength]] = null,
    borderRightColor: ResponsiveValue[BorderColorProperty] = null,
    borderStyle: ResponsiveValue[BorderStyleProperty | Double] = null,
    borderTop: ResponsiveValue[BorderTopProperty[StyledSystemLength]] = null,
    borderTopColor: ResponsiveValue[BorderColorProperty] = null,
    borderWidth: ResponsiveValue[BorderWidthProperty[StyledSystemLength]] = null
  ): BordersProps = {
    val __obj = js.Dynamic.literal()
    if (border != null) __obj.updateDynamic("border")(border.asInstanceOf[js.Any])
    if (borderBottom != null) __obj.updateDynamic("borderBottom")(borderBottom.asInstanceOf[js.Any])
    if (borderBottomColor != null) __obj.updateDynamic("borderBottomColor")(borderBottomColor.asInstanceOf[js.Any])
    if (borderColor != null) __obj.updateDynamic("borderColor")(borderColor.asInstanceOf[js.Any])
    if (borderLeft != null) __obj.updateDynamic("borderLeft")(borderLeft.asInstanceOf[js.Any])
    if (borderLeftColor != null) __obj.updateDynamic("borderLeftColor")(borderLeftColor.asInstanceOf[js.Any])
    if (borderRadius != null) __obj.updateDynamic("borderRadius")(borderRadius.asInstanceOf[js.Any])
    if (borderRight != null) __obj.updateDynamic("borderRight")(borderRight.asInstanceOf[js.Any])
    if (borderRightColor != null) __obj.updateDynamic("borderRightColor")(borderRightColor.asInstanceOf[js.Any])
    if (borderStyle != null) __obj.updateDynamic("borderStyle")(borderStyle.asInstanceOf[js.Any])
    if (borderTop != null) __obj.updateDynamic("borderTop")(borderTop.asInstanceOf[js.Any])
    if (borderTopColor != null) __obj.updateDynamic("borderTopColor")(borderTopColor.asInstanceOf[js.Any])
    if (borderWidth != null) __obj.updateDynamic("borderWidth")(borderWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[BordersProps]
  }
}

