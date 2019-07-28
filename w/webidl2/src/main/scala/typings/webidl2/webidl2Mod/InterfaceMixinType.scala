package typings.webidl2.webidl2Mod

import typings.webidl2.webidl2Strings.`interface mixin`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InterfaceMixinType extends IDLRootType {
  /** A list of extended attributes. */
  var extAttrs: js.Array[ExtendedAttributes]
  /** An array of interface members (attributes, operations, etc.). Empty if there are none. */
  var members: js.Array[IDLInterfaceMemberType]
  /** The name of the interface mixin */
  var name: String
  /** A boolean indicating whether it's a partial interface mixin. */
  var partial: Boolean
  var `type`: `interface mixin`
}

object InterfaceMixinType {
  @scala.inline
  def apply(
    extAttrs: js.Array[ExtendedAttributes],
    members: js.Array[IDLInterfaceMemberType],
    name: String,
    partial: Boolean,
    `type`: `interface mixin`
  ): InterfaceMixinType = {
    val __obj = js.Dynamic.literal(extAttrs = extAttrs, members = members, name = name, partial = partial)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[InterfaceMixinType]
  }
}

