package typings.webidl2.mod

import typings.webidl2.webidl2Strings.`string-list`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExtendedAttributeRightHandSideStringList extends ExtendedAttributeRightHandSideList {
  var `type`: `string-list`
  var value: js.Array[ExtendedAttributeRightHandSideString]
}

object ExtendedAttributeRightHandSideStringList {
  @scala.inline
  def apply(`type`: `string-list`, value: js.Array[ExtendedAttributeRightHandSideString]): ExtendedAttributeRightHandSideStringList = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtendedAttributeRightHandSideStringList]
  }
}

