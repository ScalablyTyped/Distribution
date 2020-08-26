package typings.styledSystem.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GridTemplateRowsProps[ThemeType /* <: Theme[TLengthStyledSystem] */, TVal] extends js.Object {
  /**
    * The grid-template-rows CSS property defines the line names and track sizing functions of the grid rows.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/row-template-rows)
    */
  var gridTemplateRows: js.UndefOr[ResponsiveValue[TVal, ThemeType]] = js.native
}

object GridTemplateRowsProps {
  @scala.inline
  def apply[/* <: typings.styledSystem.mod.Theme[typings.styledSystem.mod.TLengthStyledSystem] */ ThemeType, TVal](): GridTemplateRowsProps[ThemeType, TVal] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GridTemplateRowsProps[ThemeType, TVal]]
  }
  @scala.inline
  implicit class GridTemplateRowsPropsOps[Self <: GridTemplateRowsProps[_, _], /* <: typings.styledSystem.mod.Theme[typings.styledSystem.mod.TLengthStyledSystem] */ ThemeType, TVal] (val x: Self with (GridTemplateRowsProps[ThemeType, TVal])) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setGridTemplateRowsVarargs(value: (TVal | Null)*): Self = this.set("gridTemplateRows", js.Array(value :_*))
    @scala.inline
    def setGridTemplateRows(value: ResponsiveValue[TVal, ThemeType]): Self = this.set("gridTemplateRows", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGridTemplateRows: Self = this.set("gridTemplateRows", js.undefined)
    @scala.inline
    def setGridTemplateRowsNull: Self = this.set("gridTemplateRows", null)
  }
  
}

