package typings.webidl2.webidl2Mod

import typings.webidl2.webidl2Strings.attribute
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AttributeMemberType
  extends IDLInterfaceMemberType
     with IDLNamespaceMemberType {
  /** A list of extended attributes. */
  var extAttrs: js.Array[ExtendedAttributes]
  /** An IDL Type for the attribute. */
  var idlType: IDLTypeDescription
  /** True if it's an inherit attribute. */
  var inherit: Boolean
  /** The attribute's name. */
  var name: String
  /** True if it's a read-only attribute. */
  var readonly: Boolean
  /** True if it's a static attribute. */
  var static: Boolean
  /** True if it's a stringifier attribute. */
  var stringifier: Boolean
  var `type`: attribute
}

object AttributeMemberType {
  @scala.inline
  def apply(
    extAttrs: js.Array[ExtendedAttributes],
    idlType: IDLTypeDescription,
    inherit: Boolean,
    name: String,
    readonly: Boolean,
    static: Boolean,
    stringifier: Boolean,
    `type`: attribute
  ): AttributeMemberType = {
    val __obj = js.Dynamic.literal(extAttrs = extAttrs, idlType = idlType, inherit = inherit, name = name, readonly = readonly, static = static, stringifier = stringifier)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[AttributeMemberType]
  }
}

