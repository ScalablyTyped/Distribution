package typings
package webidl2Lib.webidl2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExtendedAttributeRightHandSideIdentifier extends js.Object {
  var `type`: webidl2Lib.webidl2LibStrings.identifier
  var value: java.lang.String
}

object ExtendedAttributeRightHandSideIdentifier {
  @scala.inline
  def apply(`type`: webidl2Lib.webidl2LibStrings.identifier, value: java.lang.String): ExtendedAttributeRightHandSideIdentifier = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[ExtendedAttributeRightHandSideIdentifier]
  }
}

