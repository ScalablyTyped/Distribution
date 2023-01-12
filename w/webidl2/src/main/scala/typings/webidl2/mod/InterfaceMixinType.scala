package typings.webidl2.mod

import typings.webidl2.webidl2Strings.`interface mixin`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InterfaceMixinType
  extends StObject
     with AbstractContainer
     with IDLRootType {
  
  var inheritance: Null
  
  @JSName("members")
  var members_InterfaceMixinType: js.Array[IDLInterfaceMixinMemberType]
  
  @JSName("parent")
  var parent_InterfaceMixinType: Null
  
  @JSName("type")
  var type_InterfaceMixinType: `interface mixin`
}
object InterfaceMixinType {
  
  inline def apply(
    extAttrs: js.Array[ExtendedAttribute],
    inheritance: Null,
    members: js.Array[IDLInterfaceMixinMemberType],
    name: String,
    parent: Null,
    partial: Boolean
  ): InterfaceMixinType = {
    val __obj = js.Dynamic.literal(extAttrs = extAttrs.asInstanceOf[js.Any], inheritance = inheritance.asInstanceOf[js.Any], members = members.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], partial = partial.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("interface mixin")
    __obj.asInstanceOf[InterfaceMixinType]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InterfaceMixinType] (val x: Self) extends AnyVal {
    
    inline def setInheritance(value: Null): Self = StObject.set(x, "inheritance", value.asInstanceOf[js.Any])
    
    inline def setMembers(value: js.Array[IDLInterfaceMixinMemberType]): Self = StObject.set(x, "members", value.asInstanceOf[js.Any])
    
    inline def setMembersVarargs(value: IDLInterfaceMixinMemberType*): Self = StObject.set(x, "members", js.Array(value*))
    
    inline def setParent(value: Null): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setType(value: `interface mixin`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
