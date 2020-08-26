package typings.webidl2.mod

import typings.webidl2.webidl2Strings.`callback interface`
import typings.webidl2.webidl2Strings.interface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InterfaceType extends IDLRootType {
  /** A list of extended attributes. */
  var extAttrs: js.Array[ExtendedAttribute] = js.native
  /** A string giving the name of an interface this one inherits from, null otherwise. */
  var inheritance: String | Null = js.native
  /** An array of interface members (attributes, operations, etc.). Empty if there are none. */
  var members: js.Array[IDLInterfaceMemberType] = js.native
  /** The name of the interface */
  var name: String = js.native
  /** A boolean indicating whether it's a partial interface. */
  var partial: Boolean = js.native
  var `type`: interface | (`callback interface`) = js.native
}

object InterfaceType {
  @scala.inline
  def apply(
    extAttrs: js.Array[ExtendedAttribute],
    members: js.Array[IDLInterfaceMemberType],
    name: String,
    partial: Boolean,
    `type`: interface | (`callback interface`)
  ): InterfaceType = {
    val __obj = js.Dynamic.literal(extAttrs = extAttrs.asInstanceOf[js.Any], members = members.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], partial = partial.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[InterfaceType]
  }
  @scala.inline
  implicit class InterfaceTypeOps[Self <: InterfaceType] (val x: Self) extends AnyVal {
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
    def setMembersVarargs(value: IDLInterfaceMemberType*): Self = this.set("members", js.Array(value :_*))
    @scala.inline
    def setMembers(value: js.Array[IDLInterfaceMemberType]): Self = this.set("members", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setPartial(value: Boolean): Self = this.set("partial", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: interface | (`callback interface`)): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setInheritance(value: String): Self = this.set("inheritance", value.asInstanceOf[js.Any])
    @scala.inline
    def setInheritanceNull: Self = this.set("inheritance", null)
  }
  
}

