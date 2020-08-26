package typings.styledSystem.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GridAutoColumnsProps[ThemeType /* <: Theme[TLengthStyledSystem] */, TVal] extends js.Object {
  /**
    * The grid-auto-columns CSS property specifies the size of an implicitly-created grid column track.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/grid-auto-columns)
    */
  var gridAutoColumns: js.UndefOr[ResponsiveValue[TVal, ThemeType]] = js.native
}

object GridAutoColumnsProps {
  @scala.inline
  def apply[/* <: typings.styledSystem.mod.Theme[typings.styledSystem.mod.TLengthStyledSystem] */ ThemeType, TVal](): GridAutoColumnsProps[ThemeType, TVal] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GridAutoColumnsProps[ThemeType, TVal]]
  }
  @scala.inline
  implicit class GridAutoColumnsPropsOps[Self <: GridAutoColumnsProps[_, _], /* <: typings.styledSystem.mod.Theme[typings.styledSystem.mod.TLengthStyledSystem] */ ThemeType, TVal] (val x: Self with (GridAutoColumnsProps[ThemeType, TVal])) extends AnyVal {
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
    def setGridAutoColumnsVarargs(value: (TVal | Null)*): Self = this.set("gridAutoColumns", js.Array(value :_*))
    @scala.inline
    def setGridAutoColumns(value: ResponsiveValue[TVal, ThemeType]): Self = this.set("gridAutoColumns", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGridAutoColumns: Self = this.set("gridAutoColumns", js.undefined)
    @scala.inline
    def setGridAutoColumnsNull: Self = this.set("gridAutoColumns", null)
  }
  
}

