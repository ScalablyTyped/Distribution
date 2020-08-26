package typings.theming.anon

import typings.std.NonNullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ThemeNonNullable[Theme] extends js.Object {
  var theme: NonNullable[Theme] = js.native
}

object ThemeNonNullable {
  @scala.inline
  def apply[Theme](theme: NonNullable[Theme]): ThemeNonNullable[Theme] = {
    val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThemeNonNullable[Theme]]
  }
  @scala.inline
  implicit class ThemeNonNullableOps[Self <: ThemeNonNullable[_], Theme] (val x: Self with ThemeNonNullable[Theme]) extends AnyVal {
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
    def setTheme(value: NonNullable[Theme]): Self = this.set("theme", value.asInstanceOf[js.Any])
  }
  
}

