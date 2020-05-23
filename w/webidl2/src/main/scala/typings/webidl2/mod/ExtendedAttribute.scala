package typings.webidl2.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExtendedAttribute extends js.Object {
  /** If the extended attribute takes arguments or if its right-hand side does they are listed here. */
  var arguments: js.Array[Argument]
  /** The extended attribute's name. */
  var name: String
  /** The container of this extended attribute. */
  var parent: IDLRootType | FieldType | IDLInterfaceMemberType
  /** If there is a right-hand side, this will capture its type and value. */
  var rhs: ExtendedAttributeRightHandSide | Null
}

object ExtendedAttribute {
  @scala.inline
  def apply(
    arguments: js.Array[Argument],
    name: String,
    parent: IDLRootType | FieldType | IDLInterfaceMemberType,
    rhs: ExtendedAttributeRightHandSide = null
  ): ExtendedAttribute = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], rhs = rhs.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtendedAttribute]
  }
}

