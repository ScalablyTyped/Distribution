package typings.webidl2.webidl2Mod

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
    readonly: Boolean,
    special: static | stringifier,
    `type`: attribute
  ): AttributeMemberType = {
    val __obj = js.Dynamic.literal(extAttrs = extAttrs, idlType = idlType, inherit = inherit, name = name, readonly = readonly, special = special.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[AttributeMemberType]
  }
}

