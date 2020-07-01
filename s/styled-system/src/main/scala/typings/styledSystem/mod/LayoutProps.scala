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
  def apply[/* <: typings.styledSystem.mod.Theme[typings.styledSystem.mod.TLengthStyledSystem] */ ThemeType](
    display: js.UndefOr[Null | (ResponsiveValue[DisplayProperty, ThemeType])] = js.undefined,
    height: js.UndefOr[Null | (ResponsiveValue[HeightProperty[TLengthStyledSystem], ThemeType])] = js.undefined,
    maxHeight: js.UndefOr[Null | (ResponsiveValue[MaxHeightProperty[TLengthStyledSystem], ThemeType])] = js.undefined,
    maxWidth: js.UndefOr[Null | (ResponsiveValue[MaxWidthProperty[TLengthStyledSystem], ThemeType])] = js.undefined,
    minHeight: js.UndefOr[Null | (ResponsiveValue[MinHeightProperty[TLengthStyledSystem], ThemeType])] = js.undefined,
    minWidth: js.UndefOr[Null | (ResponsiveValue[MinWidthProperty[TLengthStyledSystem], ThemeType])] = js.undefined,
    overflow: js.UndefOr[Null | (ResponsiveValue[OverflowProperty, ThemeType])] = js.undefined,
    overflowX: js.UndefOr[Null | (ResponsiveValue[OverflowXProperty, ThemeType])] = js.undefined,
    overflowY: js.UndefOr[Null | (ResponsiveValue[OverflowYProperty, ThemeType])] = js.undefined,
    size: js.UndefOr[Null | (ResponsiveValue[HeightProperty[TLengthStyledSystem], ThemeType])] = js.undefined,
    verticalAlign: js.UndefOr[Null | (ResponsiveValue[VerticalAlignProperty[TLengthStyledSystem], ThemeType])] = js.undefined,
    width: js.UndefOr[Null | (ResponsiveValue[WidthProperty[TLengthStyledSystem], ThemeType])] = js.undefined
  ): LayoutProps[ThemeType] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(display)) __obj.updateDynamic("display")(display.asInstanceOf[js.Any])
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (!js.isUndefined(maxHeight)) __obj.updateDynamic("maxHeight")(maxHeight.asInstanceOf[js.Any])
    if (!js.isUndefined(maxWidth)) __obj.updateDynamic("maxWidth")(maxWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(minHeight)) __obj.updateDynamic("minHeight")(minHeight.asInstanceOf[js.Any])
    if (!js.isUndefined(minWidth)) __obj.updateDynamic("minWidth")(minWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(overflow)) __obj.updateDynamic("overflow")(overflow.asInstanceOf[js.Any])
    if (!js.isUndefined(overflowX)) __obj.updateDynamic("overflowX")(overflowX.asInstanceOf[js.Any])
    if (!js.isUndefined(overflowY)) __obj.updateDynamic("overflowY")(overflowY.asInstanceOf[js.Any])
    if (!js.isUndefined(size)) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (!js.isUndefined(verticalAlign)) __obj.updateDynamic("verticalAlign")(verticalAlign.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[LayoutProps[ThemeType]]
  }
}

