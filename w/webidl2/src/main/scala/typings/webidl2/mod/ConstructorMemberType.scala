package typings.webidl2.mod

import typings.webidl2.webidl2Strings.constructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConstructorMemberType
  extends StObject
     with AbstractBase
     with IDLInterfaceMemberType {
  
  /** An array of arguments for the constructor operation. */
  var arguments: js.Array[Argument]
  
  @JSName("parent")
  var parent_ConstructorMemberType: InterfaceType
  
  @JSName("type")
  var type_ConstructorMemberType: constructor
}
object ConstructorMemberType {
  
  inline def apply(arguments: js.Array[Argument], extAttrs: js.Array[ExtendedAttribute], parent: InterfaceType): ConstructorMemberType = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], extAttrs = extAttrs.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("constructor")
    __obj.asInstanceOf[ConstructorMemberType]
  }
  
  extension [Self <: ConstructorMemberType](x: Self) {
    
    inline def setArguments(value: js.Array[Argument]): Self = StObject.set(x, "arguments", value.asInstanceOf[js.Any])
    
    inline def setArgumentsVarargs(value: Argument*): Self = StObject.set(x, "arguments", js.Array(value*))
    
    inline def setParent(value: InterfaceType): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setType(value: constructor): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
