package typings.theming.anon

import typings.std.NonNullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `0`[Theme] extends js.Object {
  var theme: js.UndefOr[NonNullable[Theme]] = js.undefined
}

object `0` {
  @scala.inline
  def apply[Theme](theme: NonNullable[Theme] = null): `0`[Theme] = {
    val __obj = js.Dynamic.literal()
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[`0`[Theme]]
  }
}

