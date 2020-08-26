package typings.xstyledSystem.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BordersProps
  extends BorderProps[StyledSystemLength]
     with BorderTopProps[StyledSystemLength]
     with BorderTopColorProps
     with BorderRightProps[StyledSystemLength]
     with BorderRightColorProps
     with BorderBottomProps[StyledSystemLength]
     with BorderBottomColorProps
     with BorderLeftProps[StyledSystemLength]
     with BorderLeftColorProps
     with BorderColorProps
     with BorderWidthProps[StyledSystemLength]
     with BorderStyleProps
     with BorderRadiusProps[StyledSystemLength]

object BordersProps {
  @scala.inline
  def apply(): BordersProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BordersProps]
  }
}

