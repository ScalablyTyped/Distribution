package typings.webidl2.webidl2Mod

import typings.webidl2.webidl2Strings.deleter
import typings.webidl2.webidl2Strings.getter
import typings.webidl2.webidl2Strings.operation
import typings.webidl2.webidl2Strings.setter
import typings.webidl2.webidl2Strings.static
import typings.webidl2.webidl2Strings.stringifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OperationMemberType
  extends IDLInterfaceMemberType
     with IDLNamespaceMemberType {
  /** An array of arguments for the operation. */
  var arguments: js.Array[Argument]
  /** A list of extended attributes. */
  var extAttrs: js.Array[ExtendedAttribute]
  /** An IDL Type of what the operation returns. If a stringifier, may be absent. */
  var idlType: IDLTypeDescription | Null
  /** The name of the operation. If a stringifier, may be null. */
  var name: String | Null
  /** Special modifier if exists */
  var special: getter | setter | deleter | static | stringifier
  var `type`: operation
}

object OperationMemberType {
  @scala.inline
  def apply(
    arguments: js.Array[Argument],
    extAttrs: js.Array[ExtendedAttribute],
    special: getter | setter | deleter | static | stringifier,
    `type`: operation,
    idlType: IDLTypeDescription = null,
    name: String = null
  ): OperationMemberType = {
    val __obj = js.Dynamic.literal(arguments = arguments, extAttrs = extAttrs, special = special.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`)
    if (idlType != null) __obj.updateDynamic("idlType")(idlType)
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[OperationMemberType]
  }
}

