package typings.theming

import typings.std.NonNullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ThemeNonNullable[Theme] extends js.Object {
  var theme: js.UndefOr[NonNullable[Theme]] = js.undefined
}

object Anon_ThemeNonNullable {
  @scala.inline
  def apply[Theme](theme: NonNullable[Theme] = null): Anon_ThemeNonNullable[Theme] = {
    val __obj = js.Dynamic.literal()
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ThemeNonNullable[Theme]]
  }
}

