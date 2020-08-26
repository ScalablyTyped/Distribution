package typings.styledSystem.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BackgroundColorProps[ThemeType /* <: Theme[TLengthStyledSystem] */, TVal] extends js.Object {
  var backgroundColor: js.UndefOr[ResponsiveValue[TVal, ThemeType]] = js.native
  /**
    * The color utility parses a component's `color` and `bg` props and converts them into CSS declarations.
    * By default the raw value of the prop is returned.
    *
    * Color palettes can be configured with the ThemeProvider to use keys as prop values, with support for dot notation.
    * Array values are converted into responsive values.
    *
    * [MDN Reference](https://developer.mozilla.org/en-US/docs/Web/CSS/background-color)
    */
  var bg: js.UndefOr[ResponsiveValue[TVal, ThemeType]] = js.native
}

object BackgroundColorProps {
  @scala.inline
  def apply[/* <: typings.styledSystem.mod.Theme[typings.styledSystem.mod.TLengthStyledSystem] */ ThemeType, TVal](): BackgroundColorProps[ThemeType, TVal] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BackgroundColorProps[ThemeType, TVal]]
  }
  @scala.inline
  implicit class BackgroundColorPropsOps[Self <: BackgroundColorProps[_, _], /* <: typings.styledSystem.mod.Theme[typings.styledSystem.mod.TLengthStyledSystem] */ ThemeType, TVal] (val x: Self with (BackgroundColorProps[ThemeType, TVal])) extends AnyVal {
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
    def setBackgroundColorVarargs(value: (TVal | Null)*): Self = this.set("backgroundColor", js.Array(value :_*))
    @scala.inline
    def setBackgroundColor(value: ResponsiveValue[TVal, ThemeType]): Self = this.set("backgroundColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackgroundColor: Self = this.set("backgroundColor", js.undefined)
    @scala.inline
    def setBackgroundColorNull: Self = this.set("backgroundColor", null)
    @scala.inline
    def setBgVarargs(value: (TVal | Null)*): Self = this.set("bg", js.Array(value :_*))
    @scala.inline
    def setBg(value: ResponsiveValue[TVal, ThemeType]): Self = this.set("bg", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBg: Self = this.set("bg", js.undefined)
    @scala.inline
    def setBgNull: Self = this.set("bg", null)
  }
  
}

