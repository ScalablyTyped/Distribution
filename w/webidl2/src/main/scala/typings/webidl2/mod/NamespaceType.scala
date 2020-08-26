package typings.webidl2.mod

import typings.webidl2.webidl2Strings.namespace
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NamespaceType extends IDLRootType {
  /** A list of extended attributes. */
  var extAttrs: js.Array[ExtendedAttribute] = js.native
  /** An array of namespace members (attributes, operations). Empty if there are none. */
  var members: js.Array[IDLNamespaceMemberType] = js.native
  /** The enum's name. */
  var name: String = js.native
  /** A boolean indicating whether it's a partial namespace. */
  var partial: Boolean = js.native
  var `type`: namespace = js.native
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
    val __obj = js.Dynamic.literal(extAttrs = extAttrs.asInstanceOf[js.Any], members = members.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], partial = partial.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NamespaceType]
  }
  @scala.inline
  implicit class NamespaceTypeOps[Self <: NamespaceType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setExtAttrsVarargs(value: ExtendedAttribute*): Self = this.set("extAttrs", js.Array(value :_*))
    @scala.inline
    def setExtAttrs(value: js.Array[ExtendedAttribute]): Self = this.set("extAttrs", value.asInstanceOf[js.Any])
    @scala.inline
    def setMembersVarargs(value: IDLNamespaceMemberType*): Self = this.set("members", js.Array(value :_*))
    @scala.inline
    def setMembers(value: js.Array[IDLNamespaceMemberType]): Self = this.set("members", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setPartial(value: Boolean): Self = this.set("partial", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: namespace): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

