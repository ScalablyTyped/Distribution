package typings.xstyledSystem.mod

import typings.csstype.mod.BottomProperty
import typings.csstype.mod.LeftProperty
import typings.csstype.mod.PositionProperty
import typings.csstype.mod.RightProperty
import typings.csstype.mod.TopProperty
import typings.csstype.mod.ZIndexProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PositioningProps
  extends PositionProps
     with ZIndexProps
     with TopProps[StyledSystemLength]
     with RightProps[StyledSystemLength]
     with BottomProps[StyledSystemLength]
     with LeftProps[StyledSystemLength]

object PositioningProps {
  @scala.inline
  def apply(
    bottom: ResponsiveValue[BottomProperty[StyledSystemLength]] = null,
    left: ResponsiveValue[LeftProperty[StyledSystemLength]] = null,
    position: ResponsiveValue[PositionProperty] = null,
    right: ResponsiveValue[RightProperty[StyledSystemLength]] = null,
    top: ResponsiveValue[TopProperty[StyledSystemLength]] = null,
    zIndex: ResponsiveValue[ZIndexProperty | AliasKey] = null
  ): PositioningProps = {
    val __obj = js.Dynamic.literal()
    if (bottom != null) __obj.updateDynamic("bottom")(bottom.asInstanceOf[js.Any])
    if (left != null) __obj.updateDynamic("left")(left.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (right != null) __obj.updateDynamic("right")(right.asInstanceOf[js.Any])
    if (top != null) __obj.updateDynamic("top")(top.asInstanceOf[js.Any])
    if (zIndex != null) __obj.updateDynamic("zIndex")(zIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[PositioningProps]
  }
}

