package typings
package vueDashI18nLib.vueDashI18nMod.VueI18nNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FormattedNumberPart extends js.Object {
  var `type`: FormattedNumberPartType
  var value: java.lang.String
}

object FormattedNumberPart {
  @scala.inline
  def apply(`type`: FormattedNumberPartType, value: java.lang.String): FormattedNumberPart = {
    val __obj = js.Dynamic.literal(value = value)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[FormattedNumberPart]
  }
}

