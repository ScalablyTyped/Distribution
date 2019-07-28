package typings.styledDashSystem.styledDashSystemMod

import typings.csstype.csstypeMod.DisplayProperty
import typings.csstype.csstypeMod.HeightProperty
import typings.csstype.csstypeMod.MaxHeightProperty
import typings.csstype.csstypeMod.MaxWidthProperty
import typings.csstype.csstypeMod.MinHeightProperty
import typings.csstype.csstypeMod.MinWidthProperty
import typings.csstype.csstypeMod.VerticalAlignProperty
import typings.csstype.csstypeMod.WidthProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LayoutProps
  extends WidthProps[TLengthStyledSystem]
     with HeightProps[TLengthStyledSystem]
     with MinWidthProps[TLengthStyledSystem]
     with MinHeightProps[TLengthStyledSystem]
     with MaxWidthProps[TLengthStyledSystem]
     with MaxHeightProps[TLengthStyledSystem]
     with DisplayProps
     with VerticalAlignProps[TLengthStyledSystem]
     with SizeProps[TLengthStyledSystem]

object LayoutProps {
  @scala.inline
  def apply(
    display: ResponsiveValue[DisplayProperty] = null,
    height: ResponsiveValue[HeightProperty[TLengthStyledSystem]] = null,
    maxHeight: ResponsiveValue[MaxHeightProperty[TLengthStyledSystem]] = null,
    maxWidth: ResponsiveValue[MaxWidthProperty[TLengthStyledSystem]] = null,
    minHeight: ResponsiveValue[MinHeightProperty[TLengthStyledSystem]] = null,
    minWidth: ResponsiveValue[MinWidthProperty[TLengthStyledSystem]] = null,
    size: ResponsiveValue[HeightProperty[TLengthStyledSystem]] = null,
    verticalAlign: ResponsiveValue[VerticalAlignProperty[TLengthStyledSystem]] = null,
    width: ResponsiveValue[WidthProperty[TLengthStyledSystem]] = null
  ): LayoutProps = {
    val __obj = js.Dynamic.literal()
    if (display != null) __obj.updateDynamic("display")(display.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (maxHeight != null) __obj.updateDynamic("maxHeight")(maxHeight.asInstanceOf[js.Any])
    if (maxWidth != null) __obj.updateDynamic("maxWidth")(maxWidth.asInstanceOf[js.Any])
    if (minHeight != null) __obj.updateDynamic("minHeight")(minHeight.asInstanceOf[js.Any])
    if (minWidth != null) __obj.updateDynamic("minWidth")(minWidth.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (verticalAlign != null) __obj.updateDynamic("verticalAlign")(verticalAlign.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[LayoutProps]
  }
}

