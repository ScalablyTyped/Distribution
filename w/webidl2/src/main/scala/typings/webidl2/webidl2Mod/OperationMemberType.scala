package typings.webidl2.webidl2Mod

import typings.webidl2.webidl2Strings.operation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OperationMemberType
  extends IDLInterfaceMemberType
     with IDLNamespaceMemberType {
  /** An array of arguments for the operation. */
  var arguments: js.Array[Argument]
  /** True if a deleter operation. */
  var deleter: Boolean
  /** A list of extended attributes. */
  var extAttrs: js.Array[ExtendedAttributes]
  /** True if a getter operation. */
  var getter: Boolean
  /** An IDL Type of what the operation returns. If a stringifier, may be absent. */
  var idlType: IDLTypeDescription | Null
  /** The name of the operation. If a stringifier, may be null. */
  var name: String | Null
  /** True if a setter operation. */
  var setter: Boolean
  /** True if a static operation. */
  var static: Boolean
  /** True if a stringifier operation. */
  var stringifier: Boolean
  var `type`: operation
}

object OperationMemberType {
  @scala.inline
  def apply(
    arguments: js.Array[Argument],
    deleter: Boolean,
    extAttrs: js.Array[ExtendedAttributes],
    getter: Boolean,
    setter: Boolean,
    static: Boolean,
    stringifier: Boolean,
    `type`: operation,
    idlType: IDLTypeDescription = null,
    name: String = null
  ): OperationMemberType = {
    val __obj = js.Dynamic.literal(arguments = arguments, deleter = deleter, extAttrs = extAttrs, getter = getter, setter = setter, static = static, stringifier = stringifier)
    __obj.updateDynamic("type")(`type`)
    if (idlType != null) __obj.updateDynamic("idlType")(idlType)
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[OperationMemberType]
  }
}

