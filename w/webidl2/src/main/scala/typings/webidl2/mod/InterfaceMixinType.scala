package typings.webidl2.mod

import typings.webidl2.webidl2Strings.`interface mixin`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InterfaceMixinType
  extends AbstractContainer
     with IDLRootType {
  
  var inheritance: Null = js.native
  
  @JSName("members")
  var members_InterfaceMixinType: js.Array[IDLInterfaceMixinMemberType] = js.native
  
  @JSName("parent")
  var parent_InterfaceMixinType: Null = js.native
  
  @JSName("type")
  var type_InterfaceMixinType: `interface mixin` = js.native
}
object InterfaceMixinType {
  
  @scala.inline
  def apply(
    extAttrs: js.Array[ExtendedAttribute],
    inheritance: Null,
    members: js.Array[IDLInterfaceMixinMemberType],
    name: String,
    parent: Null,
    partial: Boolean,
    `type`: `interface mixin`
  ): InterfaceMixinType = {
    val __obj = js.Dynamic.literal(extAttrs = extAttrs.asInstanceOf[js.Any], inheritance = inheritance.asInstanceOf[js.Any], members = members.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], partial = partial.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[InterfaceMixinType]
  }
  
  @scala.inline
  implicit class InterfaceMixinTypeOps[Self <: InterfaceMixinType] (val x: Self) extends AnyVal {
    
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
    def setInheritance(value: Null): Self = this.set("inheritance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMembersVarargs(value: IDLInterfaceMixinMemberType*): Self = this.set("members", js.Array(value :_*))
    
    @scala.inline
    def setMembers(value: js.Array[IDLInterfaceMixinMemberType]): Self = this.set("members", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: Null): Self = this.set("parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: `interface mixin`): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
