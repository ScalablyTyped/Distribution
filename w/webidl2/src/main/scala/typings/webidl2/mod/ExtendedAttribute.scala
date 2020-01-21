package typings.webidl2.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExtendedAttribute extends js.Object {
  /** If the extended attribute takes arguments or if its right-hand side does they are listed here. */
  var arguments: js.Array[Argument]
  /** The extended attribute's name. */
  var name: String
  /** If there is a right-hand side, this will capture its type ("identifier" or "identifier-list") and its value. */
  var rhs: ExtendedAttributeRightHandSideIdentifier | ExtendedAttributeRightHandSideIdentifierList | Null
}

object ExtendedAttribute {
  @scala.inline
  def apply(
    arguments: js.Array[Argument],
    name: String,
    rhs: ExtendedAttributeRightHandSideIdentifier | ExtendedAttributeRightHandSideIdentifierList = null
  ): ExtendedAttribute = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (rhs != null) __obj.updateDynamic("rhs")(rhs.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtendedAttribute]
  }
}

