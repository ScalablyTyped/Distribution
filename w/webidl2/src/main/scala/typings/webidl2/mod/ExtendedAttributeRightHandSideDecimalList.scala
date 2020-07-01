package typings.webidl2.mod

import typings.webidl2.webidl2Strings.`decimal-list`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExtendedAttributeRightHandSideDecimalList extends ExtendedAttributeRightHandSideList {
  var `type`: `decimal-list`
  var value: js.Array[ExtendedAttributeRightHandSideDecimal]
}

object ExtendedAttributeRightHandSideDecimalList {
  @scala.inline
  def apply(`type`: `decimal-list`, value: js.Array[ExtendedAttributeRightHandSideDecimal]): ExtendedAttributeRightHandSideDecimalList = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtendedAttributeRightHandSideDecimalList]
  }
}

