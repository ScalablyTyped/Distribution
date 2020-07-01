package typings.styledSystem.mod

import typings.csstype.mod.GridAutoFlowProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GridAutoFlowProps[ThemeType /* <: Theme[TLengthStyledSystem] */] extends js.Object {
  /**
    * The grid-auto-flow CSS property controls how the auto-placement algorithm works, specifying exactly
    * how auto-placed items get flowed into the grid.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/grid-auto-flow)
    */
  var gridAutoFlow: js.UndefOr[ResponsiveValue[GridAutoFlowProperty, ThemeType]] = js.undefined
}

object GridAutoFlowProps {
  @scala.inline
  def apply[/* <: typings.styledSystem.mod.Theme[typings.styledSystem.mod.TLengthStyledSystem] */ ThemeType](gridAutoFlow: js.UndefOr[Null | (ResponsiveValue[GridAutoFlowProperty, ThemeType])] = js.undefined): GridAutoFlowProps[ThemeType] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(gridAutoFlow)) __obj.updateDynamic("gridAutoFlow")(gridAutoFlow.asInstanceOf[js.Any])
    __obj.asInstanceOf[GridAutoFlowProps[ThemeType]]
  }
}

