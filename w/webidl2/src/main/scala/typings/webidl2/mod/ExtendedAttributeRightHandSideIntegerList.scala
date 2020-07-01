package typings.webidl2.mod

import typings.webidl2.webidl2Strings.`integer-list`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExtendedAttributeRightHandSideIntegerList extends ExtendedAttributeRightHandSideList {
  var `type`: `integer-list`
  var value: js.Array[ExtendedAttributeRightHandSideInteger]
}

object ExtendedAttributeRightHandSideIntegerList {
  @scala.inline
  def apply(`type`: `integer-list`, value: js.Array[ExtendedAttributeRightHandSideInteger]): ExtendedAttributeRightHandSideIntegerList = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtendedAttributeRightHandSideIntegerList]
  }
}

