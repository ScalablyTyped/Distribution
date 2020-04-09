package typings.webidl2.mod

import typings.webidl2.webidl2Strings.attribute
import typings.webidl2.webidl2Strings.static
import typings.webidl2.webidl2Strings.stringifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AttributeMemberType
  extends IDLInterfaceMemberType
     with IDLNamespaceMemberType {
  /** A list of extended attributes. */
  var extAttrs: js.Array[ExtendedAttribute]
  /** An IDL Type for the attribute. */
  var idlType: IDLTypeDescription
  /** True if it's an inherit attribute. */
  var inherit: Boolean
  /** The attribute's name. */
  var name: String
  /** The container of this type. */
  var parent: InterfaceType | InterfaceMixinType | NamespaceType
  /** True if it's a read-only attribute. */
  var readonly: Boolean
  /** Special modifier if exists */
  var special: static | stringifier
  var `type`: attribute
}

object AttributeMemberType {
  @scala.inline
  def apply(
    extAttrs: js.Array[ExtendedAttribute],
    idlType: IDLTypeDescription,
    inherit: Boolean,
    name: String,
    parent: InterfaceType | InterfaceMixinType | NamespaceType,
    readonly: Boolean,
    special: static | stringifier,
    `type`: attribute
  ): AttributeMemberType = {
    val __obj = js.Dynamic.literal(extAttrs = extAttrs.asInstanceOf[js.Any], idlType = idlType.asInstanceOf[js.Any], inherit = inherit.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], readonly = readonly.asInstanceOf[js.Any], special = special.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttributeMemberType]
  }
}

