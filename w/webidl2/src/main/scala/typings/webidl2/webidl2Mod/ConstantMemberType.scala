package typings.webidl2.webidl2Mod

import typings.webidl2.webidl2Strings.const
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConstantMemberType extends IDLInterfaceMemberType {
  /** A list of extended attributes. */
  var extAttrs: js.Array[ExtendedAttribute]
  /** An IDL Type of the constant that represents a simple type, the type name. */
  var idlType: IDLTypeDescription
  /** The name of the constant. */
  var name: String
  /** Whether its type is nullable. */
  var nullable: Boolean
  var `type`: const
  /** The constant value */
  var value: ValueDescription
}

object ConstantMemberType {
  @scala.inline
  def apply(
    extAttrs: js.Array[ExtendedAttribute],
    idlType: IDLTypeDescription,
    name: String,
    nullable: Boolean,
    `type`: const,
    value: ValueDescription
  ): ConstantMemberType = {
    val __obj = js.Dynamic.literal(extAttrs = extAttrs, idlType = idlType, name = name, nullable = nullable, value = value)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ConstantMemberType]
  }
}

