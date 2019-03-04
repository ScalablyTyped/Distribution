package typings
package webidl2Lib.webidl2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExtendedAttributes extends js.Object {
  /** If the extended attribute takes arguments or if its right-hand side does they are listed here. */
  var arguments: js.Array[Argument]
  /** The extended attribute's name. */
  var name: java.lang.String
  /** If there is a right-hand side, this will capture its type ("identifier" or "identifier-list") and its value. */
  var rhs: ExtendedAttributeRightHandSideIdentifier | ExtendedAttributeRightHandSideIdentifierList | scala.Null
}

object ExtendedAttributes {
  @scala.inline
  def apply(
    arguments: js.Array[Argument],
    name: java.lang.String,
    rhs: ExtendedAttributeRightHandSideIdentifier | ExtendedAttributeRightHandSideIdentifierList = null
  ): ExtendedAttributes = {
    val __obj = js.Dynamic.literal(arguments = arguments, name = name)
    if (rhs != null) __obj.updateDynamic("rhs")(rhs.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtendedAttributes]
  }
}

