package typings
package webidl2Lib.webidl2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OperationMemberType
  extends IDLInterfaceMemberType
     with IDLNamespaceMemberType {
  /** An array of arguments for the operation. */
  var arguments: js.Array[Argument]
  /** True if a deleter operation. */
  var deleter: scala.Boolean
  /** A list of extended attributes. */
  var extAttrs: js.Array[ExtendedAttributes]
  /** True if a getter operation. */
  var getter: scala.Boolean
  /** An IDL Type of what the operation returns. If a stringifier, may be absent. */
  var idlType: IDLTypeDescription | scala.Null
  /** The name of the operation. If a stringifier, may be null. */
  var name: java.lang.String | scala.Null
  /** True if a setter operation. */
  var setter: scala.Boolean
  /** True if a static operation. */
  var static: scala.Boolean
  /** True if a stringifier operation. */
  var stringifier: scala.Boolean
  var `type`: webidl2Lib.webidl2LibStrings.operation
}

object OperationMemberType {
  @scala.inline
  def apply(
    arguments: js.Array[Argument],
    deleter: scala.Boolean,
    extAttrs: js.Array[ExtendedAttributes],
    getter: scala.Boolean,
    setter: scala.Boolean,
    static: scala.Boolean,
    stringifier: scala.Boolean,
    `type`: webidl2Lib.webidl2LibStrings.operation,
    idlType: IDLTypeDescription = null,
    name: java.lang.String = null
  ): OperationMemberType = {
    val __obj = js.Dynamic.literal(arguments = arguments, deleter = deleter, extAttrs = extAttrs, getter = getter, setter = setter, static = static, stringifier = stringifier)
    __obj.updateDynamic("type")(`type`)
    if (idlType != null) __obj.updateDynamic("idlType")(idlType)
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[OperationMemberType]
  }
}

