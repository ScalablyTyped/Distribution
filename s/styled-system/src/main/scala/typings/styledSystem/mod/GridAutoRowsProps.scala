package typings.styledSystem.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GridAutoRowsProps[ThemeType /* <: Theme[TLengthStyledSystem] */, TVal] extends js.Object {
  /**
    * The grid-auto-rows CSS property specifies the size of an implicitly-created grid row track.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/grid-auto-rows)
    */
  var gridAutoRows: js.UndefOr[ResponsiveValue[TVal, ThemeType]] = js.undefined
}

object GridAutoRowsProps {
  @scala.inline
  def apply[/* <: typings.styledSystem.mod.Theme[typings.styledSystem.mod.TLengthStyledSystem] */ ThemeType, TVal](gridAutoRows: js.UndefOr[Null | (ResponsiveValue[TVal, ThemeType])] = js.undefined): GridAutoRowsProps[ThemeType, TVal] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(gridAutoRows)) __obj.updateDynamic("gridAutoRows")(gridAutoRows.asInstanceOf[js.Any])
    __obj.asInstanceOf[GridAutoRowsProps[ThemeType, TVal]]
  }
}

