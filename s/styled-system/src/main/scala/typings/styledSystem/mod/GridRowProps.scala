package typings.styledSystem.mod

import typings.csstype.mod.GridRowProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GridRowProps[ThemeType /* <: Theme[TLengthStyledSystem] */] extends js.Object {
  /**
    * The grid-row CSS property is a shorthand property for grid-row-start and grid-row-end specifying a grid item’s
    * size and location within the grid row by contributing a line, a span, or nothing (automatic) to its grid
    * placement, thereby specifying the inline-start and inline-end edge of its grid area.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/grid-row)
    */
  var gridRow: js.UndefOr[ResponsiveValue[GridRowProperty, ThemeType]] = js.undefined
}

object GridRowProps {
  @scala.inline
  def apply[ThemeType](gridRow: js.UndefOr[Null | (ResponsiveValue[GridRowProperty, ThemeType])] = js.undefined): GridRowProps[ThemeType] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(gridRow)) __obj.updateDynamic("gridRow")(gridRow.asInstanceOf[js.Any])
    __obj.asInstanceOf[GridRowProps[ThemeType]]
  }
}

