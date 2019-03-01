package typings
package styledDashSystemLib.styledDashSystemMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BordersProps
  extends BorderTopProps[TLengthStyledSystem]
     with BorderRightProps[TLengthStyledSystem]
     with BorderBottomProps[TLengthStyledSystem]
     with BorderLeftProps[TLengthStyledSystem]

object BordersProps {
  @scala.inline
  def apply(
    borderBottom: ResponsiveValue[csstypeLib.csstypeMod.BorderBottomProperty[TLengthStyledSystem]] = null,
    borderLeft: ResponsiveValue[csstypeLib.csstypeMod.BorderLeftProperty[TLengthStyledSystem]] = null,
    borderRight: ResponsiveValue[csstypeLib.csstypeMod.BorderRightProperty[TLengthStyledSystem]] = null,
    borderTop: ResponsiveValue[csstypeLib.csstypeMod.BorderTopProperty[TLengthStyledSystem]] = null
  ): BordersProps = {
    val __obj = js.Dynamic.literal()
    if (borderBottom != null) __obj.updateDynamic("borderBottom")(borderBottom.asInstanceOf[js.Any])
    if (borderLeft != null) __obj.updateDynamic("borderLeft")(borderLeft.asInstanceOf[js.Any])
    if (borderRight != null) __obj.updateDynamic("borderRight")(borderRight.asInstanceOf[js.Any])
    if (borderTop != null) __obj.updateDynamic("borderTop")(borderTop.asInstanceOf[js.Any])
    __obj.asInstanceOf[BordersProps]
  }
}

