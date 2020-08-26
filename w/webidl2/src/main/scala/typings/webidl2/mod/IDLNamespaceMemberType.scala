package typings.webidl2.mod

import typings.webidl2.webidl2Strings.attribute
import typings.webidl2.webidl2Strings.deleter
import typings.webidl2.webidl2Strings.getter
import typings.webidl2.webidl2Strings.operation
import typings.webidl2.webidl2Strings.setter
import typings.webidl2.webidl2Strings.static
import typings.webidl2.webidl2Strings.stringifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.webidl2.mod.OperationMemberType
  - typings.webidl2.mod.AttributeMemberType
*/
trait IDLNamespaceMemberType extends js.Object

object IDLNamespaceMemberType {
  @scala.inline
  def OperationMemberType(
    arguments: js.Array[Argument],
    extAttrs: js.Array[ExtendedAttribute],
    parent: InterfaceType | InterfaceMixinType | NamespaceType,
    special: getter | setter | deleter | static | stringifier,
    `type`: operation
  ): IDLNamespaceMemberType = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], extAttrs = extAttrs.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], special = special.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDLNamespaceMemberType]
  }
  @scala.inline
  def AttributeMemberType(
    extAttrs: js.Array[ExtendedAttribute],
    idlType: IDLTypeDescription,
    inherit: Boolean,
    name: String,
    parent: InterfaceType | InterfaceMixinType | NamespaceType,
    readonly: Boolean,
    special: static | stringifier,
    `type`: attribute
  ): IDLNamespaceMemberType = {
    val __obj = js.Dynamic.literal(extAttrs = extAttrs.asInstanceOf[js.Any], idlType = idlType.asInstanceOf[js.Any], inherit = inherit.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], readonly = readonly.asInstanceOf[js.Any], special = special.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDLNamespaceMemberType]
  }
}

