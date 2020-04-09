package typings.webidl2.mod

import typings.webidl2.webidl2Strings.decimal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExtendedAttributeRightHandSideDecimal extends ExtendedAttributeRightHandSide {
  var `type`: decimal
  var value: String
}

object ExtendedAttributeRightHandSideDecimal {
  @scala.inline
  def apply(`type`: decimal, value: String): ExtendedAttributeRightHandSideDecimal = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtendedAttributeRightHandSideDecimal]
  }
}

