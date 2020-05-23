package typings.webidl2.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Argument extends js.Object {
  /** A default value, absent if there is none. */
  var default: ValueDescription | Null
  /** A list of extended attributes. */
  var extAttrs: js.Array[ExtendedAttribute]
  /** An IDL Type describing the type of the argument. */
  var idlType: IDLTypeDescription
  /** The argument's name. */
  var name: String
  /** True if the argument is optional. */
  var optional: Boolean
  /** The container of this type. */
  var parent: CallbackType | ConstructorMemberType | ExtendedAttribute | OperationMemberType
  /** True if the argument is variadic. */
  var variadic: Boolean
}

object Argument {
  @scala.inline
  def apply(
    extAttrs: js.Array[ExtendedAttribute],
    idlType: IDLTypeDescription,
    name: String,
    optional: Boolean,
    parent: CallbackType | ConstructorMemberType | ExtendedAttribute | OperationMemberType,
    variadic: Boolean,
    default: ValueDescription = null
  ): Argument = {
    val __obj = js.Dynamic.literal(extAttrs = extAttrs.asInstanceOf[js.Any], idlType = idlType.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], optional = optional.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], variadic = variadic.asInstanceOf[js.Any], default = default.asInstanceOf[js.Any])
    __obj.asInstanceOf[Argument]
  }
}

