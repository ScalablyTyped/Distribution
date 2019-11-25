package typings.vueDashI18n.vueDashI18nMod.VueI18n

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FormattedNumberPart extends js.Object {
  var `type`: FormattedNumberPartType
  var value: String
}

object FormattedNumberPart {
  @scala.inline
  def apply(`type`: FormattedNumberPartType, value: String): FormattedNumberPart = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormattedNumberPart]
  }
}

