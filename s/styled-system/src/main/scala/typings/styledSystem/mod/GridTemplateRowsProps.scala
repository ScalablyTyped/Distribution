package typings.styledSystem.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GridTemplateRowsProps[ThemeType /* <: Theme[TLengthStyledSystem] */, TVal] extends js.Object {
  /**
    * The grid-template-rows CSS property defines the line names and track sizing functions of the grid rows.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/row-template-rows)
    */
  var gridTemplateRows: js.UndefOr[ResponsiveValue[TVal, ThemeType]] = js.undefined
}

object GridTemplateRowsProps {
  @scala.inline
  def apply[/* <: typings.styledSystem.mod.Theme[typings.styledSystem.mod.TLengthStyledSystem] */ ThemeType, TVal](gridTemplateRows: js.UndefOr[Null | (ResponsiveValue[TVal, ThemeType])] = js.undefined): GridTemplateRowsProps[ThemeType, TVal] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(gridTemplateRows)) __obj.updateDynamic("gridTemplateRows")(gridTemplateRows.asInstanceOf[js.Any])
    __obj.asInstanceOf[GridTemplateRowsProps[ThemeType, TVal]]
  }
}

