package typings
package styledDashSystemLib.styledDashSystemMod

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
    display: ResponsiveValue[csstypeLib.csstypeMod.DisplayProperty] = null,
    height: ResponsiveValue[csstypeLib.csstypeMod.HeightProperty[TLengthStyledSystem]] = null,
    maxHeight: ResponsiveValue[csstypeLib.csstypeMod.MaxHeightProperty[TLengthStyledSystem]] = null,
    maxWidth: ResponsiveValue[csstypeLib.csstypeMod.MaxWidthProperty[TLengthStyledSystem]] = null,
    minHeight: ResponsiveValue[csstypeLib.csstypeMod.MinHeightProperty[TLengthStyledSystem]] = null,
    minWidth: ResponsiveValue[csstypeLib.csstypeMod.MinWidthProperty[TLengthStyledSystem]] = null,
    size: ResponsiveValue[csstypeLib.csstypeMod.HeightProperty[TLengthStyledSystem]] = null,
    verticalAlign: ResponsiveValue[csstypeLib.csstypeMod.VerticalAlignProperty[TLengthStyledSystem]] = null,
    width: ResponsiveValue[csstypeLib.csstypeMod.WidthProperty[TLengthStyledSystem]] = null
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

