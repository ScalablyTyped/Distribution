package typings.vueDashI18n.vueDashI18nMod.VueI18n

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
    val __obj = js.Dynamic.literal(dateTimeFormat = dateTimeFormat, numberFormat = numberFormat)
  
    __obj.asInstanceOf[IntlAvailability]
  }
}

