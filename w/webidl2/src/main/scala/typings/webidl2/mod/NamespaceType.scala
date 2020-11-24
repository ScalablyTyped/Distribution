package typings.webidl2.mod

import typings.webidl2.webidl2Strings.namespace
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NamespaceType
  extends AbstractContainer
     with IDLRootType {
  
  var inheritance: Null = js.native
  
  @JSName("members")
  var members_NamespaceType: js.Array[IDLNamespaceMemberType] = js.native
  
  @JSName("parent")
  var parent_NamespaceType: Null = js.native
  
  @JSName("type")
  var type_NamespaceType: namespace = js.native
}
object NamespaceType {
  
  @scala.inline
  def apply(
    extAttrs: js.Array[ExtendedAttribute],
    inheritance: Null,
    members: js.Array[IDLNamespaceMemberType],
    name: String,
    parent: Null,
    partial: Boolean,
    `type`: namespace
  ): NamespaceType = {
    val __obj = js.Dynamic.literal(extAttrs = extAttrs.asInstanceOf[js.Any], inheritance = inheritance.asInstanceOf[js.Any], members = members.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], partial = partial.asInstanceOf[js.Any])
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
    def setInheritance(value: Null): Self = this.set("inheritance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMembersVarargs(value: IDLNamespaceMemberType*): Self = this.set("members", js.Array(value :_*))
    
    @scala.inline
    def setMembers(value: js.Array[IDLNamespaceMemberType]): Self = this.set("members", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: Null): Self = this.set("parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: namespace): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
