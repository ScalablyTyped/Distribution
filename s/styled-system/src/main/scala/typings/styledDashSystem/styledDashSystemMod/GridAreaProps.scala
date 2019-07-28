package typings.styledDashSystem.styledDashSystemMod

import typings.csstype.csstypeMod.GridAreaProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GridAreaProps extends js.Object {
  /**
    * The grid-area CSS property is a shorthand property for grid-row-start, grid-column-start, grid-row-end
    * and grid-column-end, specifying a grid item’s size and location within the grid row by contributing a line,
    * a span, or nothing (automatic) to its grid placement, thereby specifying the edges of its grid area.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/grid-area)
    */
  var gridArea: js.UndefOr[ResponsiveValue[GridAreaProperty]] = js.undefined
}

object GridAreaProps {
  @scala.inline
  def apply(gridArea: ResponsiveValue[GridAreaProperty] = null): GridAreaProps = {
    val __obj = js.Dynamic.literal()
    if (gridArea != null) __obj.updateDynamic("gridArea")(gridArea.asInstanceOf[js.Any])
    __obj.asInstanceOf[GridAreaProps]
  }
}

