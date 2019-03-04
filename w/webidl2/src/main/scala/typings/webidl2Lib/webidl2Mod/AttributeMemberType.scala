package typings
package webidl2Lib.webidl2Mod

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
  var inherit: scala.Boolean
  /** The attribute's name. */
  var name: java.lang.String
  /** True if it's a read-only attribute. */
  var readonly: scala.Boolean
  /** True if it's a static attribute. */
  var static: scala.Boolean
  /** True if it's a stringifier attribute. */
  var stringifier: scala.Boolean
  var `type`: webidl2Lib.webidl2LibStrings.attribute
}

object AttributeMemberType {
  @scala.inline
  def apply(
    extAttrs: js.Array[ExtendedAttributes],
    idlType: IDLTypeDescription,
    inherit: scala.Boolean,
    name: java.lang.String,
    readonly: scala.Boolean,
    static: scala.Boolean,
    stringifier: scala.Boolean,
    `type`: webidl2Lib.webidl2LibStrings.attribute
  ): AttributeMemberType = {
    val __obj = js.Dynamic.literal(extAttrs = extAttrs, idlType = idlType, inherit = inherit, name = name, readonly = readonly, static = static, stringifier = stringifier)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[AttributeMemberType]
  }
}

