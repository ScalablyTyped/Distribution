package typings.styledSystem.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GridRowGapProps[ThemeType /* <: Theme[TLengthStyledSystem] */, TVal] extends js.Object {
  /**
    * The row-gap CSS property sets the size of the gap (gutter) between an element's rows.
    *
    * @deprecated use row-gap
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/row-gap)
    */
  var gridRowGap: js.UndefOr[ResponsiveValue[TVal, ThemeType]] = js.native
}

object GridRowGapProps {
  @scala.inline
  def apply[/* <: typings.styledSystem.mod.Theme[typings.styledSystem.mod.TLengthStyledSystem] */ ThemeType, TVal](): GridRowGapProps[ThemeType, TVal] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GridRowGapProps[ThemeType, TVal]]
  }
  @scala.inline
  implicit class GridRowGapPropsOps[Self <: GridRowGapProps[_, _], /* <: typings.styledSystem.mod.Theme[typings.styledSystem.mod.TLengthStyledSystem] */ ThemeType, TVal] (val x: Self with (GridRowGapProps[ThemeType, TVal])) extends AnyVal {
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
    def setGridRowGapVarargs(value: (TVal | Null)*): Self = this.set("gridRowGap", js.Array(value :_*))
    @scala.inline
    def setGridRowGap(value: ResponsiveValue[TVal, ThemeType]): Self = this.set("gridRowGap", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGridRowGap: Self = this.set("gridRowGap", js.undefined)
    @scala.inline
    def setGridRowGapNull: Self = this.set("gridRowGap", null)
  }
  
}

