package typings.styledSystem.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VerticalAlignProps[ThemeType /* <: Theme[TLengthStyledSystem] */, TVal] extends js.Object {
  /**
    * The vertical-align CSS property specifies sets vertical alignment of an inline or table-cell box.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/vertical-align)
    */
  var verticalAlign: js.UndefOr[ResponsiveValue[TVal, ThemeType]] = js.native
}

object VerticalAlignProps {
  @scala.inline
  def apply[/* <: typings.styledSystem.mod.Theme[typings.styledSystem.mod.TLengthStyledSystem] */ ThemeType, TVal](): VerticalAlignProps[ThemeType, TVal] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VerticalAlignProps[ThemeType, TVal]]
  }
  @scala.inline
  implicit class VerticalAlignPropsOps[Self <: VerticalAlignProps[_, _], /* <: typings.styledSystem.mod.Theme[typings.styledSystem.mod.TLengthStyledSystem] */ ThemeType, TVal] (val x: Self with (VerticalAlignProps[ThemeType, TVal])) extends AnyVal {
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
    def setVerticalAlignVarargs(value: (TVal | Null)*): Self = this.set("verticalAlign", js.Array(value :_*))
    @scala.inline
    def setVerticalAlign(value: ResponsiveValue[TVal, ThemeType]): Self = this.set("verticalAlign", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVerticalAlign: Self = this.set("verticalAlign", js.undefined)
    @scala.inline
    def setVerticalAlignNull: Self = this.set("verticalAlign", null)
  }
  
}

