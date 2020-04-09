package typings.webidl2.mod

import typings.webidl2.webidl2Strings.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExtendedAttributeRightHandSideInteger extends ExtendedAttributeRightHandSide {
  var `type`: integer
  var value: String
}

object ExtendedAttributeRightHandSideInteger {
  @scala.inline
  def apply(`type`: integer, value: String): ExtendedAttributeRightHandSideInteger = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtendedAttributeRightHandSideInteger]
  }
}

