package typings
package webidl2Lib.webidl2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConstantMemberType extends IDLInterfaceMemberType {
  /** A list of extended attributes. */
  var extAttrs: js.Array[ExtendedAttributes]
  /** An IDL Type of the constant that represents a simple type, the type name. */
  var idlType: IDLTypeDescription
  /** The name of the constant. */
  var name: java.lang.String
  /** Whether its type is nullable. */
  var nullable: scala.Boolean
  var `type`: webidl2Lib.webidl2LibStrings.const
  /** The constant value */
  var value: ValueDescription
}

object ConstantMemberType {
  @scala.inline
  def apply(
    extAttrs: js.Array[ExtendedAttributes],
    idlType: IDLTypeDescription,
    name: java.lang.String,
    nullable: scala.Boolean,
    `type`: webidl2Lib.webidl2LibStrings.const,
    value: ValueDescription
  ): ConstantMemberType = {
    val __obj = js.Dynamic.literal(extAttrs = extAttrs, idlType = idlType, name = name, nullable = nullable, value = value)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ConstantMemberType]
  }
}

