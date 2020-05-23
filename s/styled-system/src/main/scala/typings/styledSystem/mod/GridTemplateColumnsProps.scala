package typings.styledSystem.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GridTemplateColumnsProps[ThemeType /* <: Theme[TLengthStyledSystem] */, TVal] extends js.Object {
  /**
    * The grid-template-columns CSS property defines the line names and track sizing functions of the grid columns.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/grid-template-columns)
    */
  var gridTemplateColumns: js.UndefOr[ResponsiveValue[TVal, ThemeType]] = js.undefined
}

object GridTemplateColumnsProps {
  @scala.inline
  def apply[ThemeType, TVal](gridTemplateColumns: js.UndefOr[Null | (ResponsiveValue[TVal, ThemeType])] = js.undefined): GridTemplateColumnsProps[ThemeType, TVal] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(gridTemplateColumns)) __obj.updateDynamic("gridTemplateColumns")(gridTemplateColumns.asInstanceOf[js.Any])
    __obj.asInstanceOf[GridTemplateColumnsProps[ThemeType, TVal]]
  }
}

