package typings.styledSystem.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GridTemplateColumnsProps[ThemeType /* <: Theme[TLengthStyledSystem] */, TVal] extends js.Object {
  /**
    * The grid-template-columns CSS property defines the line names and track sizing functions of the grid columns.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/grid-template-columns)
    */
  var gridTemplateColumns: js.UndefOr[ResponsiveValue[TVal, ThemeType]] = js.native
}

object GridTemplateColumnsProps {
  @scala.inline
  def apply[/* <: typings.styledSystem.mod.Theme[typings.styledSystem.mod.TLengthStyledSystem] */ ThemeType, TVal](): GridTemplateColumnsProps[ThemeType, TVal] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GridTemplateColumnsProps[ThemeType, TVal]]
  }
  @scala.inline
  implicit class GridTemplateColumnsPropsOps[Self <: GridTemplateColumnsProps[_, _], /* <: typings.styledSystem.mod.Theme[typings.styledSystem.mod.TLengthStyledSystem] */ ThemeType, TVal] (val x: Self with (GridTemplateColumnsProps[ThemeType, TVal])) extends AnyVal {
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
    def setGridTemplateColumnsVarargs(value: (TVal | Null)*): Self = this.set("gridTemplateColumns", js.Array(value :_*))
    @scala.inline
    def setGridTemplateColumns(value: ResponsiveValue[TVal, ThemeType]): Self = this.set("gridTemplateColumns", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGridTemplateColumns: Self = this.set("gridTemplateColumns", js.undefined)
    @scala.inline
    def setGridTemplateColumnsNull: Self = this.set("gridTemplateColumns", null)
  }
  
}

