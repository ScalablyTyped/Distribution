package typings.webidl2.mod

import typings.webidl2.webidl2Strings.deleter
import typings.webidl2.webidl2Strings.getter
import typings.webidl2.webidl2Strings.operation
import typings.webidl2.webidl2Strings.setter
import typings.webidl2.webidl2Strings.static
import typings.webidl2.webidl2Strings.stringifier
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OperationMemberType
  extends StObject
     with AbstractBase
     with IDLCallbackInterfaceMemberType
     with IDLInterfaceMemberType
     with IDLInterfaceMixinMemberType
     with IDLNamespaceMemberType {
  
  /** An array of arguments for the operation. */
  var arguments: js.Array[Argument]
  
  /** An IDL Type of what the operation returns. If a stringifier, may be absent. */
  var idlType: IDLTypeDescription | Null
  
  /** The name of the operation. If a stringifier, may be null. */
  var name: String | Null
  
  @JSName("parent")
  var parent_OperationMemberType: CallbackInterfaceType | InterfaceMixinType | InterfaceType | NamespaceType
  
  /** Special modifier if exists */
  var special: getter | setter | deleter | static | stringifier | Null
  
  @JSName("type")
  var type_OperationMemberType: operation
}
object OperationMemberType {
  
  inline def apply(
    arguments: js.Array[Argument],
    extAttrs: js.Array[ExtendedAttribute],
    parent: CallbackInterfaceType | InterfaceMixinType | InterfaceType | NamespaceType
  ): OperationMemberType = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], extAttrs = extAttrs.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], idlType = null, name = null, special = null)
    __obj.updateDynamic("type")("operation")
    __obj.asInstanceOf[OperationMemberType]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OperationMemberType] (val x: Self) extends AnyVal {
    
    inline def setArguments(value: js.Array[Argument]): Self = StObject.set(x, "arguments", value.asInstanceOf[js.Any])
    
    inline def setArgumentsVarargs(value: Argument*): Self = StObject.set(x, "arguments", js.Array(value*))
    
    inline def setIdlType(value: IDLTypeDescription): Self = StObject.set(x, "idlType", value.asInstanceOf[js.Any])
    
    inline def setIdlTypeNull: Self = StObject.set(x, "idlType", null)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setParent(value: CallbackInterfaceType | InterfaceMixinType | InterfaceType | NamespaceType): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setSpecial(value: getter | setter | deleter | static | stringifier): Self = StObject.set(x, "special", value.asInstanceOf[js.Any])
    
    inline def setSpecialNull: Self = StObject.set(x, "special", null)
    
    inline def setType(value: operation): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
