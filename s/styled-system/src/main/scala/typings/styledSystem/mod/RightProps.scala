package typings.styledSystem.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RightProps[ThemeType /* <: Theme[TLengthStyledSystem] */, TVal] extends js.Object {
  /**
    * The right CSS property participates in specifying the horizontal position of a
    * positioned element. It has no effect on non-positioned elements.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/right)
    */
  var right: js.UndefOr[ResponsiveValue[TVal, ThemeType]] = js.native
}

object RightProps {
  @scala.inline
  def apply[/* <: typings.styledSystem.mod.Theme[typings.styledSystem.mod.TLengthStyledSystem] */ ThemeType, TVal](): RightProps[ThemeType, TVal] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RightProps[ThemeType, TVal]]
  }
  @scala.inline
  implicit class RightPropsOps[Self <: RightProps[_, _], /* <: typings.styledSystem.mod.Theme[typings.styledSystem.mod.TLengthStyledSystem] */ ThemeType, TVal] (val x: Self with (RightProps[ThemeType, TVal])) extends AnyVal {
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
    def setRightVarargs(value: (TVal | Null)*): Self = this.set("right", js.Array(value :_*))
    @scala.inline
    def setRight(value: ResponsiveValue[TVal, ThemeType]): Self = this.set("right", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRight: Self = this.set("right", js.undefined)
    @scala.inline
    def setRightNull: Self = this.set("right", null)
  }
  
}

