package typings.webidl2.mod

import typings.webidl2.webidl2Strings.`callback interface`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CallbackInterfaceType
  extends StObject
     with AbstractContainer
     with IDLRootType {
  
  var inheritance: Null
  
  @JSName("members")
  var members_CallbackInterfaceType: js.Array[IDLCallbackInterfaceMemberType]
  
  @JSName("parent")
  var parent_CallbackInterfaceType: Null
  
  @JSName("type")
  var type_CallbackInterfaceType: `callback interface`
}
object CallbackInterfaceType {
  
  inline def apply(
    extAttrs: js.Array[ExtendedAttribute],
    inheritance: Null,
    members: js.Array[IDLCallbackInterfaceMemberType],
    name: String,
    parent: Null,
    partial: Boolean
  ): CallbackInterfaceType = {
    val __obj = js.Dynamic.literal(extAttrs = extAttrs.asInstanceOf[js.Any], inheritance = inheritance.asInstanceOf[js.Any], members = members.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], partial = partial.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("callback interface")
    __obj.asInstanceOf[CallbackInterfaceType]
  }
  
  extension [Self <: CallbackInterfaceType](x: Self) {
    
    inline def setInheritance(value: Null): Self = StObject.set(x, "inheritance", value.asInstanceOf[js.Any])
    
    inline def setMembers(value: js.Array[IDLCallbackInterfaceMemberType]): Self = StObject.set(x, "members", value.asInstanceOf[js.Any])
    
    inline def setMembersVarargs(value: IDLCallbackInterfaceMemberType*): Self = StObject.set(x, "members", js.Array(value :_*))
    
    inline def setParent(value: Null): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setType(value: `callback interface`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
