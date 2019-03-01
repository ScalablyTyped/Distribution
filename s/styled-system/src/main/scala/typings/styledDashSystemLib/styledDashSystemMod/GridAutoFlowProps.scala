package typings
package styledDashSystemLib.styledDashSystemMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GridAutoFlowProps extends js.Object {
  /**
    * The grid-auto-flow CSS property controls how the auto-placement algorithm works, specifying exactly
    * how auto-placed items get flowed into the grid.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/grid-auto-flow)
    */
  var gridAutoFlow: js.UndefOr[ResponsiveValue[csstypeLib.csstypeMod.GridAutoFlowProperty]] = js.undefined
}

object GridAutoFlowProps {
  @scala.inline
  def apply(gridAutoFlow: ResponsiveValue[csstypeLib.csstypeMod.GridAutoFlowProperty] = null): GridAutoFlowProps = {
    val __obj = js.Dynamic.literal()
    if (gridAutoFlow != null) __obj.updateDynamic("gridAutoFlow")(gridAutoFlow.asInstanceOf[js.Any])
    __obj.asInstanceOf[GridAutoFlowProps]
  }
}

