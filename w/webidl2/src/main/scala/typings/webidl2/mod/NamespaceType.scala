package typings.webidl2.mod

import typings.webidl2.webidl2Strings.namespace
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NamespaceType
  extends StObject
     with AbstractContainer
     with IDLRootType {
  
  var inheritance: Null
  
  @JSName("members")
  var members_NamespaceType: js.Array[IDLNamespaceMemberType]
  
  @JSName("parent")
  var parent_NamespaceType: Null
  
  @JSName("type")
  var type_NamespaceType: namespace
}
object NamespaceType {
  
  inline def apply(
    extAttrs: js.Array[ExtendedAttribute],
    inheritance: Null,
    members: js.Array[IDLNamespaceMemberType],
    name: String,
    parent: Null,
    partial: Boolean
  ): NamespaceType = {
    val __obj = js.Dynamic.literal(extAttrs = extAttrs.asInstanceOf[js.Any], inheritance = inheritance.asInstanceOf[js.Any], members = members.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], partial = partial.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("namespace")
    __obj.asInstanceOf[NamespaceType]
  }
  
  extension [Self <: NamespaceType](x: Self) {
    
    inline def setInheritance(value: Null): Self = StObject.set(x, "inheritance", value.asInstanceOf[js.Any])
    
    inline def setMembers(value: js.Array[IDLNamespaceMemberType]): Self = StObject.set(x, "members", value.asInstanceOf[js.Any])
    
    inline def setMembersVarargs(value: IDLNamespaceMemberType*): Self = StObject.set(x, "members", js.Array(value*))
    
    inline def setParent(value: Null): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setType(value: namespace): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
