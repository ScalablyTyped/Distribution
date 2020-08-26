package typings.styledSystem.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GridAutoRowsProps[ThemeType /* <: Theme[TLengthStyledSystem] */, TVal] extends js.Object {
  /**
    * The grid-auto-rows CSS property specifies the size of an implicitly-created grid row track.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/grid-auto-rows)
    */
  var gridAutoRows: js.UndefOr[ResponsiveValue[TVal, ThemeType]] = js.native
}

object GridAutoRowsProps {
  @scala.inline
  def apply[/* <: typings.styledSystem.mod.Theme[typings.styledSystem.mod.TLengthStyledSystem] */ ThemeType, TVal](): GridAutoRowsProps[ThemeType, TVal] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GridAutoRowsProps[ThemeType, TVal]]
  }
  @scala.inline
  implicit class GridAutoRowsPropsOps[Self <: GridAutoRowsProps[_, _], /* <: typings.styledSystem.mod.Theme[typings.styledSystem.mod.TLengthStyledSystem] */ ThemeType, TVal] (val x: Self with (GridAutoRowsProps[ThemeType, TVal])) extends AnyVal {
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
    def setGridAutoRowsVarargs(value: (TVal | Null)*): Self = this.set("gridAutoRows", js.Array(value :_*))
    @scala.inline
    def setGridAutoRows(value: ResponsiveValue[TVal, ThemeType]): Self = this.set("gridAutoRows", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGridAutoRows: Self = this.set("gridAutoRows", js.undefined)
    @scala.inline
    def setGridAutoRowsNull: Self = this.set("gridAutoRows", null)
  }
  
}

