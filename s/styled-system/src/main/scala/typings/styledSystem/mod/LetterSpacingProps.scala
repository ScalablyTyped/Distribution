package typings.styledSystem.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LetterSpacingProps[ThemeType /* <: Theme[TLengthStyledSystem] */, TVal] extends js.Object {
  /**
    * The letter-spacing CSS property sets the spacing behavior between text characters.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/letter-spacing)
    */
  var letterSpacing: js.UndefOr[ResponsiveValue[TVal, ThemeType]] = js.native
}

object LetterSpacingProps {
  @scala.inline
  def apply[/* <: typings.styledSystem.mod.Theme[typings.styledSystem.mod.TLengthStyledSystem] */ ThemeType, TVal](): LetterSpacingProps[ThemeType, TVal] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LetterSpacingProps[ThemeType, TVal]]
  }
  @scala.inline
  implicit class LetterSpacingPropsOps[Self <: LetterSpacingProps[_, _], /* <: typings.styledSystem.mod.Theme[typings.styledSystem.mod.TLengthStyledSystem] */ ThemeType, TVal] (val x: Self with (LetterSpacingProps[ThemeType, TVal])) extends AnyVal {
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
    def setLetterSpacingVarargs(value: (TVal | Null)*): Self = this.set("letterSpacing", js.Array(value :_*))
    @scala.inline
    def setLetterSpacing(value: ResponsiveValue[TVal, ThemeType]): Self = this.set("letterSpacing", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLetterSpacing: Self = this.set("letterSpacing", js.undefined)
    @scala.inline
    def setLetterSpacingNull: Self = this.set("letterSpacing", null)
  }
  
}

