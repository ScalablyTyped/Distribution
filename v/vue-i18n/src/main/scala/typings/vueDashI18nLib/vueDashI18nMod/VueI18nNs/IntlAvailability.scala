package typings
package vueDashI18nLib.vueDashI18nMod.VueI18nNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IntlAvailability extends js.Object {
  var dateTimeFormat: scala.Boolean
  var numberFormat: scala.Boolean
}

object IntlAvailability {
  @scala.inline
  def apply(dateTimeFormat: scala.Boolean, numberFormat: scala.Boolean): IntlAvailability = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("dateTimeFormat")(dateTimeFormat)
    __obj.updateDynamic("numberFormat")(numberFormat)
    __obj.asInstanceOf[IntlAvailability]
  }
}

