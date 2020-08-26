package typings.xstyledSystem.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FlexboxesProps
  extends DisplayProps
     with AlignItemsProps
     with AlignContentProps
     with JustifyContentProps
     with JustifyItemsProps
     with FlexWrapProps
     with FlexBasisProps[StyledSystemLength]
     with FlexDirectionProps
     with FlexProps[StyledSystemLength]
     with JustifySelfProps
     with AlignSelfProps
     with OrderProps

object FlexboxesProps {
  @scala.inline
  def apply(): FlexboxesProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FlexboxesProps]
  }
}

