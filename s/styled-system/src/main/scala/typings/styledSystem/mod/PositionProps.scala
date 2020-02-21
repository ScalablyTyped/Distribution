package typings.styledSystem.mod

import typings.csstype.mod.BottomProperty
import typings.csstype.mod.LeftProperty
import typings.csstype.mod.PositionProperty
import typings.csstype.mod.RightProperty
import typings.csstype.mod.TopProperty
import typings.csstype.mod.ZIndexProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PositionProps[ThemeType /* <: Theme[TLengthStyledSystem] */]
  extends ZIndexProps[ThemeType]
     with TopProps[ThemeType, TopProperty[TLengthStyledSystem]]
     with RightProps[ThemeType, RightProperty[TLengthStyledSystem]]
     with BottomProps[ThemeType, BottomProperty[TLengthStyledSystem]]
     with LeftProps[ThemeType, LeftProperty[TLengthStyledSystem]] {
  /**
    * The position CSS property specifies how an element is positioned in a document.
    * The top, right, bottom, and left properties determine the final location of positioned elements.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/position)
    */
  var position: js.UndefOr[ResponsiveValue[PositionProperty, ThemeType]] = js.undefined
}

object PositionProps {
  @scala.inline
  def apply[ThemeType /* <: Theme[TLengthStyledSystem] */](
    bottom: ResponsiveValue[BottomProperty[TLengthStyledSystem], ThemeType] = null,
    left: ResponsiveValue[LeftProperty[TLengthStyledSystem], ThemeType] = null,
    position: ResponsiveValue[PositionProperty, ThemeType] = null,
    right: ResponsiveValue[RightProperty[TLengthStyledSystem], ThemeType] = null,
    top: ResponsiveValue[TopProperty[TLengthStyledSystem], ThemeType] = null,
    zIndex: ResponsiveValue[ZIndexProperty, ThemeType] = null
  ): PositionProps[ThemeType] = {
    val __obj = js.Dynamic.literal()
    if (bottom != null) __obj.updateDynamic("bottom")(bottom.asInstanceOf[js.Any])
    if (left != null) __obj.updateDynamic("left")(left.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (right != null) __obj.updateDynamic("right")(right.asInstanceOf[js.Any])
    if (top != null) __obj.updateDynamic("top")(top.asInstanceOf[js.Any])
    if (zIndex != null) __obj.updateDynamic("zIndex")(zIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[PositionProps[ThemeType]]
  }
}

