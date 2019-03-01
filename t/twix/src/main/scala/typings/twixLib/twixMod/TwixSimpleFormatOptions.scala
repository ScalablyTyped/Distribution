package typings
package twixLib.twixMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TwixSimpleFormatOptions extends js.Object {
  var allDay: js.UndefOr[java.lang.String] = js.undefined
  var template: js.UndefOr[js.Function2[/* left */ js.Any, /* right */ js.Any, _]] = js.undefined
}

object TwixSimpleFormatOptions {
  @scala.inline
  def apply(
    allDay: java.lang.String = null,
    template: js.Function2[/* left */ js.Any, /* right */ js.Any, _] = null
  ): TwixSimpleFormatOptions = {
    val __obj = js.Dynamic.literal()
    if (allDay != null) __obj.updateDynamic("allDay")(allDay)
    if (template != null) __obj.updateDynamic("template")(template)
    __obj.asInstanceOf[TwixSimpleFormatOptions]
  }
}

