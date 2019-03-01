package typings
package webidl2Lib.webidl2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InterfaceType extends IDLRootType {
  /** A list of extended attributes. */
  var extAttrs: js.Array[ExtendedAttributes]
  /** A string giving the name of an interface this one inherits from, null otherwise. */
  var inheritance: java.lang.String | scala.Null
  /** An array of interface members (attributes, operations, etc.). Empty if there are none. */
  var members: js.Array[IDLInterfaceMemberType]
  /** The name of the interface */
  var name: java.lang.String
  /** A boolean indicating whether it's a partial interface. */
  var partial: scala.Boolean
  var `type`: webidl2Lib.webidl2LibStrings.interface | (webidl2Lib.webidl2LibStrings.`callback interface`)
}

object InterfaceType {
  @scala.inline
  def apply(
    extAttrs: js.Array[ExtendedAttributes],
    members: js.Array[IDLInterfaceMemberType],
    name: java.lang.String,
    partial: scala.Boolean,
    `type`: webidl2Lib.webidl2LibStrings.interface | (webidl2Lib.webidl2LibStrings.`callback interface`),
    inheritance: java.lang.String = null
  ): InterfaceType = {
    val __obj = js.Dynamic.literal(`type` = `type`.asInstanceOf[js.Any])
    __obj.updateDynamic("extAttrs")(extAttrs)
    __obj.updateDynamic("members")(members)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("partial")(partial)
    if (inheritance != null) __obj.updateDynamic("inheritance")(inheritance)
    __obj.asInstanceOf[InterfaceType]
  }
}

