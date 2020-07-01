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
  def apply[/* <: typings.styledSystem.mod.Theme[typings.styledSystem.mod.TLengthStyledSystem] */ ThemeType](
    bottom: js.UndefOr[Null | (ResponsiveValue[BottomProperty[TLengthStyledSystem], ThemeType])] = js.undefined,
    left: js.UndefOr[Null | (ResponsiveValue[LeftProperty[TLengthStyledSystem], ThemeType])] = js.undefined,
    position: js.UndefOr[Null | (ResponsiveValue[PositionProperty, ThemeType])] = js.undefined,
    right: js.UndefOr[Null | (ResponsiveValue[RightProperty[TLengthStyledSystem], ThemeType])] = js.undefined,
    top: js.UndefOr[Null | (ResponsiveValue[TopProperty[TLengthStyledSystem], ThemeType])] = js.undefined,
    zIndex: js.UndefOr[Null | (ResponsiveValue[ZIndexProperty, ThemeType])] = js.undefined
  ): PositionProps[ThemeType] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(bottom)) __obj.updateDynamic("bottom")(bottom.asInstanceOf[js.Any])
    if (!js.isUndefined(left)) __obj.updateDynamic("left")(left.asInstanceOf[js.Any])
    if (!js.isUndefined(position)) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (!js.isUndefined(right)) __obj.updateDynamic("right")(right.asInstanceOf[js.Any])
    if (!js.isUndefined(top)) __obj.updateDynamic("top")(top.asInstanceOf[js.Any])
    if (!js.isUndefined(zIndex)) __obj.updateDynamic("zIndex")(zIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[PositionProps[ThemeType]]
  }
}

