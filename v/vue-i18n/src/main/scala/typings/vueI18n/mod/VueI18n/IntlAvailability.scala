package typings.vueI18n.mod.VueI18n

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IntlAvailability extends js.Object {
  var dateTimeFormat: Boolean
  var numberFormat: Boolean
}

object IntlAvailability {
  @scala.inline
  def apply(dateTimeFormat: Boolean, numberFormat: Boolean): IntlAvailability = {
    val __obj = js.Dynamic.literal(dateTimeFormat = dateTimeFormat.asInstanceOf[js.Any], numberFormat = numberFormat.asInstanceOf[js.Any])
    __obj.asInstanceOf[IntlAvailability]
  }
}

