package typings.styledSystem.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LeftProps[ThemeType /* <: Theme[TLengthStyledSystem] */, TVal] extends js.Object {
  /**
    * The left CSS property participates in specifying the horizontal position
    * of a positioned element. It has no effect on non-positioned elements.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/left)
    */
  var left: js.UndefOr[ResponsiveValue[TVal, ThemeType]] = js.native
}

object LeftProps {
  @scala.inline
  def apply[/* <: typings.styledSystem.mod.Theme[typings.styledSystem.mod.TLengthStyledSystem] */ ThemeType, TVal](): LeftProps[ThemeType, TVal] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LeftProps[ThemeType, TVal]]
  }
  @scala.inline
  implicit class LeftPropsOps[Self <: LeftProps[_, _], /* <: typings.styledSystem.mod.Theme[typings.styledSystem.mod.TLengthStyledSystem] */ ThemeType, TVal] (val x: Self with (LeftProps[ThemeType, TVal])) extends AnyVal {
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
    def setLeftVarargs(value: (TVal | Null)*): Self = this.set("left", js.Array(value :_*))
    @scala.inline
    def setLeft(value: ResponsiveValue[TVal, ThemeType]): Self = this.set("left", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLeft: Self = this.set("left", js.undefined)
    @scala.inline
    def setLeftNull: Self = this.set("left", null)
  }
  
}

