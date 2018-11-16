package typings
package webidl2Lib.webidl2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait InterfaceMixinType extends js.Object {
  /** A list of extended attributes. */
  var extAttrs: js.Array[ExtendedAttributes]
  /** An array of interface members (attributes, operations, etc.). Empty if there are none. */
  var members: js.Array[IDLInterfaceMemberType]
  /** The name of the interface mixin */
  var name: java.lang.String
  /** A boolean indicating whether it's a partial interface mixin. */
  var partial: scala.Boolean
  var `type`: webidl2Lib.webidl2LibStrings.`interface mixin`
}

