package typings.styledSystem.mod

import typings.csstype.mod.DisplayProperty
import typings.csstype.mod.HeightProperty
import typings.csstype.mod.MaxHeightProperty
import typings.csstype.mod.MaxWidthProperty
import typings.csstype.mod.MinHeightProperty
import typings.csstype.mod.MinWidthProperty
import typings.csstype.mod.OverflowProperty
import typings.csstype.mod.OverflowXProperty
import typings.csstype.mod.OverflowYProperty
import typings.csstype.mod.VerticalAlignProperty
import typings.csstype.mod.WidthProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LayoutProps[ThemeType /* <: Theme[TLengthStyledSystem] */]
  extends WidthProps[ThemeType, WidthProperty[TLengthStyledSystem]]
     with HeightProps[ThemeType, HeightProperty[TLengthStyledSystem]]
     with MinWidthProps[ThemeType, MinWidthProperty[TLengthStyledSystem]]
     with MinHeightProps[ThemeType, MinHeightProperty[TLengthStyledSystem]]
     with MaxWidthProps[ThemeType, MaxWidthProperty[TLengthStyledSystem]]
     with MaxHeightProps[ThemeType, MaxHeightProperty[TLengthStyledSystem]]
     with DisplayProps[ThemeType]
     with VerticalAlignProps[ThemeType, VerticalAlignProperty[TLengthStyledSystem]]
     with SizeProps[ThemeType, HeightProperty[TLengthStyledSystem]]
     with OverflowProps[ThemeType]

object LayoutProps {
  @scala.inline
  def apply[ThemeType /* <: Theme[TLengthStyledSystem] */](
    display: ResponsiveValue[DisplayProperty, ThemeType] = null,
    height: ResponsiveValue[HeightProperty[TLengthStyledSystem], ThemeType] = null,
    maxHeight: ResponsiveValue[MaxHeightProperty[TLengthStyledSystem], ThemeType] = null,
    maxWidth: ResponsiveValue[MaxWidthProperty[TLengthStyledSystem], ThemeType] = null,
    minHeight: ResponsiveValue[MinHeightProperty[TLengthStyledSystem], ThemeType] = null,
    minWidth: ResponsiveValue[MinWidthProperty[TLengthStyledSystem], ThemeType] = null,
    overflow: ResponsiveValue[OverflowProperty, ThemeType] = null,
    overflowX: ResponsiveValue[OverflowXProperty, ThemeType] = null,
    overflowY: ResponsiveValue[OverflowYProperty, ThemeType] = null,
    size: ResponsiveValue[HeightProperty[TLengthStyledSystem], ThemeType] = null,
    verticalAlign: ResponsiveValue[VerticalAlignProperty[TLengthStyledSystem], ThemeType] = null,
    width: ResponsiveValue[WidthProperty[TLengthStyledSystem], ThemeType] = null
  ): LayoutProps[ThemeType] = {
    val __obj = js.Dynamic.literal()
    if (display != null) __obj.updateDynamic("display")(display.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (maxHeight != null) __obj.updateDynamic("maxHeight")(maxHeight.asInstanceOf[js.Any])
    if (maxWidth != null) __obj.updateDynamic("maxWidth")(maxWidth.asInstanceOf[js.Any])
    if (minHeight != null) __obj.updateDynamic("minHeight")(minHeight.asInstanceOf[js.Any])
    if (minWidth != null) __obj.updateDynamic("minWidth")(minWidth.asInstanceOf[js.Any])
    if (overflow != null) __obj.updateDynamic("overflow")(overflow.asInstanceOf[js.Any])
    if (overflowX != null) __obj.updateDynamic("overflowX")(overflowX.asInstanceOf[js.Any])
    if (overflowY != null) __obj.updateDynamic("overflowY")(overflowY.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (verticalAlign != null) __obj.updateDynamic("verticalAlign")(verticalAlign.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[LayoutProps[ThemeType]]
  }
}

