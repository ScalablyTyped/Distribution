package typings.webidl2.mod

import typings.webidl2.webidl2Strings.identifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExtendedAttributeRightHandSideIdentifier extends ExtendedAttributeRightHandSide {
  var `type`: identifier
  var value: String
}

object ExtendedAttributeRightHandSideIdentifier {
  @scala.inline
  def apply(`type`: identifier, value: String): ExtendedAttributeRightHandSideIdentifier = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtendedAttributeRightHandSideIdentifier]
  }
}

