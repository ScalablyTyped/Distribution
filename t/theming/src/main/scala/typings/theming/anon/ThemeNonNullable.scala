package typings.theming.anon

import typings.std.NonNullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ThemeNonNullable[Theme] extends js.Object {
  var theme: NonNullable[Theme]
}

object ThemeNonNullable {
  @scala.inline
  def apply[Theme](theme: NonNullable[Theme]): ThemeNonNullable[Theme] = {
    val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThemeNonNullable[Theme]]
  }
}

