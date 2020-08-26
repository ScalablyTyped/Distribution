package typings.theming.mod

import typings.react.mod.ReactNode
import typings.std.NonNullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ThemeProviderProps[Theme] extends js.Object {
  var children: ReactNode = js.native
  var theme: NonNullable[Theme] | (js.Function1[/* outerTheme */ Theme, NonNullable[Theme]]) = js.native
}

object ThemeProviderProps {
  @scala.inline
  def apply[Theme](theme: NonNullable[Theme] | (js.Function1[/* outerTheme */ Theme, NonNullable[Theme]])): ThemeProviderProps[Theme] = {
    val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThemeProviderProps[Theme]]
  }
  @scala.inline
  implicit class ThemeProviderPropsOps[Self <: ThemeProviderProps[_], Theme] (val x: Self with ThemeProviderProps[Theme]) extends AnyVal {
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
    def setThemeFunction1(value: /* outerTheme */ Theme => NonNullable[Theme]): Self = this.set("theme", js.Any.fromFunction1(value))
    @scala.inline
    def setTheme(value: NonNullable[Theme] | (js.Function1[/* outerTheme */ Theme, NonNullable[Theme]])): Self = this.set("theme", value.asInstanceOf[js.Any])
    @scala.inline
    def setChildren(value: ReactNode): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
  }
  
}

