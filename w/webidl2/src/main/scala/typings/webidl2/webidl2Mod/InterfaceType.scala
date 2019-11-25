package typings.webidl2.webidl2Mod

import typings.webidl2.webidl2Strings.`callback interface`
import typings.webidl2.webidl2Strings.interface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InterfaceType extends IDLRootType {
  /** A list of extended attributes. */
  var extAttrs: js.Array[ExtendedAttribute]
  /** A string giving the name of an interface this one inherits from, null otherwise. */
  var inheritance: String | Null
  /** An array of interface members (attributes, operations, etc.). Empty if there are none. */
  var members: js.Array[IDLInterfaceMemberType]
  /** The name of the interface */
  var name: String
  /** A boolean indicating whether it's a partial interface. */
  var partial: Boolean
  var `type`: interface | (`callback interface`)
}

object InterfaceType {
  @scala.inline
  def apply(
    extAttrs: js.Array[ExtendedAttribute],
    members: js.Array[IDLInterfaceMemberType],
    name: String,
    partial: Boolean,
    `type`: interface | (`callback interface`),
    inheritance: String = null
  ): InterfaceType = {
    val __obj = js.Dynamic.literal(extAttrs = extAttrs.asInstanceOf[js.Any], members = members.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], partial = partial.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (inheritance != null) __obj.updateDynamic("inheritance")(inheritance.asInstanceOf[js.Any])
    __obj.asInstanceOf[InterfaceType]
  }
}

