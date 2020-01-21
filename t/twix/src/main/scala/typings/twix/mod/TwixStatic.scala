package typings.twix.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TwixStatic extends js.Object {
  var formatTemplate: js.UndefOr[js.Function2[/* left */ js.Any, /* right */ js.Any, _]] = js.undefined
}

object TwixStatic {
  @scala.inline
  def apply(formatTemplate: (/* left */ js.Any, /* right */ js.Any) => _ = null): TwixStatic = {
    val __obj = js.Dynamic.literal()
    if (formatTemplate != null) __obj.updateDynamic("formatTemplate")(js.Any.fromFunction2(formatTemplate))
    __obj.asInstanceOf[TwixStatic]
  }
}

