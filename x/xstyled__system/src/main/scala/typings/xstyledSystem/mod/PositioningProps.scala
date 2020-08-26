package typings.xstyledSystem.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PositioningProps
  extends PositionProps
     with ZIndexProps
     with TopProps[StyledSystemLength]
     with RightProps[StyledSystemLength]
     with BottomProps[StyledSystemLength]
     with LeftProps[StyledSystemLength]

object PositioningProps {
  @scala.inline
  def apply(): PositioningProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PositioningProps]
  }
}

