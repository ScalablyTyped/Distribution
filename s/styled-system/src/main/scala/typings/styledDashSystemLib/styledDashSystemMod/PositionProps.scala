package typings
package styledDashSystemLib.styledDashSystemMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PositionProps
  extends ZIndexProps
     with TopProps[TLengthStyledSystem]
     with RightProps[TLengthStyledSystem]
     with BottomProps[TLengthStyledSystem]
     with LeftProps[TLengthStyledSystem] {
  /**
    * The position CSS property specifies how an element is positioned in a document.
    * The top, right, bottom, and left properties determine the final location of positioned elements.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/position)
    */
  var position: js.UndefOr[ResponsiveValue[csstypeLib.csstypeMod.PositionProperty]] = js.undefined
}

object PositionProps {
  @scala.inline
  def apply(
    bottom: ResponsiveValue[csstypeLib.csstypeMod.BottomProperty[TLengthStyledSystem]] = null,
    left: ResponsiveValue[csstypeLib.csstypeMod.LeftProperty[TLengthStyledSystem]] = null,
    position: ResponsiveValue[csstypeLib.csstypeMod.PositionProperty] = null,
    right: ResponsiveValue[csstypeLib.csstypeMod.RightProperty[TLengthStyledSystem]] = null,
    top: ResponsiveValue[csstypeLib.csstypeMod.TopProperty[TLengthStyledSystem]] = null,
    zIndex: ResponsiveValue[csstypeLib.csstypeMod.ZIndexProperty] = null
  ): PositionProps = {
    val __obj = js.Dynamic.literal()
    if (bottom != null) __obj.updateDynamic("bottom")(bottom.asInstanceOf[js.Any])
    if (left != null) __obj.updateDynamic("left")(left.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (right != null) __obj.updateDynamic("right")(right.asInstanceOf[js.Any])
    if (top != null) __obj.updateDynamic("top")(top.asInstanceOf[js.Any])
    if (zIndex != null) __obj.updateDynamic("zIndex")(zIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[PositionProps]
  }
}

