package typings
package webidl2Lib.webidl2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExtendedAttributeRightHandSideIdentifierList extends js.Object {
  var `type`: webidl2Lib.webidl2LibStrings.`identifier-list`
  var value: js.Array[java.lang.String]
}

object ExtendedAttributeRightHandSideIdentifierList {
  @scala.inline
  def apply(`type`: webidl2Lib.webidl2LibStrings.`identifier-list`, value: js.Array[java.lang.String]): ExtendedAttributeRightHandSideIdentifierList = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[ExtendedAttributeRightHandSideIdentifierList]
  }
}

