package typings.styledSystem.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GridGapProps[ThemeType /* <: Theme[TLengthStyledSystem] */, TVal] extends js.Object {
  /**
    * The gap CSS property sets the gaps (gutters) between rows and columns. It is a shorthand for row-gap
    * and column-gap.
    *
    * @deprecated use gap
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/gap)
    */
  var gridGap: js.UndefOr[ResponsiveValue[TVal, ThemeType]] = js.native
}

object GridGapProps {
  @scala.inline
  def apply[/* <: typings.styledSystem.mod.Theme[typings.styledSystem.mod.TLengthStyledSystem] */ ThemeType, TVal](): GridGapProps[ThemeType, TVal] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GridGapProps[ThemeType, TVal]]
  }
  @scala.inline
  implicit class GridGapPropsOps[Self <: GridGapProps[_, _], /* <: typings.styledSystem.mod.Theme[typings.styledSystem.mod.TLengthStyledSystem] */ ThemeType, TVal] (val x: Self with (GridGapProps[ThemeType, TVal])) extends AnyVal {
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
    def setGridGapVarargs(value: (TVal | Null)*): Self = this.set("gridGap", js.Array(value :_*))
    @scala.inline
    def setGridGap(value: ResponsiveValue[TVal, ThemeType]): Self = this.set("gridGap", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGridGap: Self = this.set("gridGap", js.undefined)
    @scala.inline
    def setGridGapNull: Self = this.set("gridGap", null)
  }
  
}

