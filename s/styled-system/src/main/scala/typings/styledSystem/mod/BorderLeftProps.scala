package typings.styledSystem.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BorderLeftProps[ThemeType /* <: Theme[TLengthStyledSystem] */, TVal] extends js.Object {
  /**
    * The border-left CSS property is a shorthand that sets the values of border-left-width,
    * border-left-style, and border-left-color. These properties describe an element's left border.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/border-left)
    */
  var borderLeft: js.UndefOr[ResponsiveValue[TVal, ThemeType]] = js.native
}

object BorderLeftProps {
  @scala.inline
  def apply[/* <: typings.styledSystem.mod.Theme[typings.styledSystem.mod.TLengthStyledSystem] */ ThemeType, TVal](): BorderLeftProps[ThemeType, TVal] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BorderLeftProps[ThemeType, TVal]]
  }
  @scala.inline
  implicit class BorderLeftPropsOps[Self <: BorderLeftProps[_, _], /* <: typings.styledSystem.mod.Theme[typings.styledSystem.mod.TLengthStyledSystem] */ ThemeType, TVal] (val x: Self with (BorderLeftProps[ThemeType, TVal])) extends AnyVal {
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
    def setBorderLeftVarargs(value: (TVal | Null)*): Self = this.set("borderLeft", js.Array(value :_*))
    @scala.inline
    def setBorderLeft(value: ResponsiveValue[TVal, ThemeType]): Self = this.set("borderLeft", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorderLeft: Self = this.set("borderLeft", js.undefined)
    @scala.inline
    def setBorderLeftNull: Self = this.set("borderLeft", null)
  }
  
}

