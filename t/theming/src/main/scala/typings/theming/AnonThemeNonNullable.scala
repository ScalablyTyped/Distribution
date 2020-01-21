package typings.theming

import typings.std.NonNullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonThemeNonNullable[Theme] extends js.Object {
  var theme: js.UndefOr[NonNullable[Theme]] = js.undefined
}

object AnonThemeNonNullable {
  @scala.inline
  def apply[Theme](theme: NonNullable[Theme] = null): AnonThemeNonNullable[Theme] = {
    val __obj = js.Dynamic.literal()
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonThemeNonNullable[Theme]]
  }
}

