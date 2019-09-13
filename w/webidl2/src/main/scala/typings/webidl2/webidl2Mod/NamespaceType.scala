package typings.webidl2.webidl2Mod

import typings.webidl2.webidl2Strings.namespace
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NamespaceType extends IDLRootType {
  /** A list of extended attributes. */
  var extAttrs: js.Array[ExtendedAttribute]
  /** An array of namespace members (attributes, operations). Empty if there are none. */
  var members: js.Array[IDLNamespaceMemberType]
  /** The enum's name. */
  var name: String
  /** A boolean indicating whether it's a partial namespace. */
  var partial: Boolean
  var `type`: namespace
}

object NamespaceType {
  @scala.inline
  def apply(
    extAttrs: js.Array[ExtendedAttribute],
    members: js.Array[IDLNamespaceMemberType],
    name: String,
    partial: Boolean,
    `type`: namespace
  ): NamespaceType = {
    val __obj = js.Dynamic.literal(extAttrs = extAttrs, members = members, name = name, partial = partial)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[NamespaceType]
  }
}

