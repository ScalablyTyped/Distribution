package typings.webidl2.mod

import typings.webidl2.webidl2Strings.`callback interface`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CallbackInterfaceType
  extends AbstractContainer
     with IDLRootType {
  
  var inheritance: Null = js.native
  
  @JSName("members")
  var members_CallbackInterfaceType: js.Array[IDLCallbackInterfaceMemberType] = js.native
  
  @JSName("parent")
  var parent_CallbackInterfaceType: Null = js.native
  
  @JSName("type")
  var type_CallbackInterfaceType: `callback interface` = js.native
}
object CallbackInterfaceType {
  
  @scala.inline
  def apply(
    extAttrs: js.Array[ExtendedAttribute],
    inheritance: Null,
    members: js.Array[IDLCallbackInterfaceMemberType],
    name: String,
    parent: Null,
    partial: Boolean,
    `type`: `callback interface`
  ): CallbackInterfaceType = {
    val __obj = js.Dynamic.literal(extAttrs = extAttrs.asInstanceOf[js.Any], inheritance = inheritance.asInstanceOf[js.Any], members = members.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], partial = partial.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CallbackInterfaceType]
  }
  
  @scala.inline
  implicit class CallbackInterfaceTypeMutableBuilder[Self <: CallbackInterfaceType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInheritance(value: Null): Self = StObject.set(x, "inheritance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMembers(value: js.Array[IDLCallbackInterfaceMemberType]): Self = StObject.set(x, "members", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMembersVarargs(value: IDLCallbackInterfaceMemberType*): Self = StObject.set(x, "members", js.Array(value :_*))
    
    @scala.inline
    def setParent(value: Null): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: `callback interface`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
