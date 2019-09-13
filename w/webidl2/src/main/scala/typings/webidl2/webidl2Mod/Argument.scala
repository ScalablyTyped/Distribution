package typings.webidl2.webidl2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Argument extends js.Object {
  var default: ValueDescription
  /** A list of extended attributes. */
  var extAttrs: js.Array[ExtendedAttribute]
  /** An IDL Type describing the type of the argument. */
  var idlType: IDLTypeDescription
  /** The argument's name. */
  var name: String
  /** True if the argument is optional. */
  var optional: Boolean
  /** True if the argument is variadic. */
  var variadic: Boolean
}

object Argument {
  @scala.inline
  def apply(
    default: ValueDescription,
    extAttrs: js.Array[ExtendedAttribute],
    idlType: IDLTypeDescription,
    name: String,
    optional: Boolean,
    variadic: Boolean
  ): Argument = {
    val __obj = js.Dynamic.literal(default = default, extAttrs = extAttrs, idlType = idlType, name = name, optional = optional, variadic = variadic)
  
    __obj.asInstanceOf[Argument]
  }
}

