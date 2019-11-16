package typings.atXstyledSystem.atXstyledSystemMod

import typings.csstype.csstypeMod.GridAutoFlowProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GridAutoFlowProps extends js.Object {
  val gridAutoFlow: js.UndefOr[ResponsiveValue[GridAutoFlowProperty]] = js.undefined
}

object GridAutoFlowProps {
  @scala.inline
  def apply(gridAutoFlow: ResponsiveValue[GridAutoFlowProperty] = null): GridAutoFlowProps = {
    val __obj = js.Dynamic.literal()
    if (gridAutoFlow != null) __obj.updateDynamic("gridAutoFlow")(gridAutoFlow.asInstanceOf[js.Any])
    __obj.asInstanceOf[GridAutoFlowProps]
  }
}

