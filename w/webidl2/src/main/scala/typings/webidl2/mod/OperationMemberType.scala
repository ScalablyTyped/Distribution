package typings.webidl2.mod

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
  /** The container of this type. */
  var parent: InterfaceType | InterfaceMixinType | NamespaceType
  /** Special modifier if exists */
  var special: getter | setter | deleter | static | stringifier
  var `type`: operation
}

object OperationMemberType {
  @scala.inline
  def apply(
    arguments: js.Array[Argument],
    extAttrs: js.Array[ExtendedAttribute],
    parent: InterfaceType | InterfaceMixinType | NamespaceType,
    special: getter | setter | deleter | static | stringifier,
    `type`: operation,
    idlType: IDLTypeDescription = null,
    name: String = null
  ): OperationMemberType = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], extAttrs = extAttrs.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], special = special.asInstanceOf[js.Any], idlType = idlType.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[OperationMemberType]
  }
}

