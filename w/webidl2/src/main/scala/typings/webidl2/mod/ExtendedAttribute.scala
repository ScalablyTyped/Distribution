package typings.webidl2.mod

import typings.webidl2.webidl2Strings.`extended-attribute`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExtendedAttribute
  extends StObject
     with AbstractBase {
  
  /** If the extended attribute takes arguments or if its right-hand side does they are listed here. */
  var arguments: js.Array[Argument]
  
  /** The extended attribute's name. */
  var name: String
  
  @JSName("parent")
  var parent_ExtendedAttribute: IDLRootType | FieldType | IDLInterfaceMemberType
  
  /** If there is a right-hand side, this will capture its type and value. */
  var rhs: ExtendedAttributeRightHandSide | Null
  
  @JSName("type")
  var type_ExtendedAttribute: `extended-attribute`
}
object ExtendedAttribute {
  
  inline def apply(
    arguments: js.Array[Argument],
    extAttrs: js.Array[ExtendedAttribute],
    name: String,
    parent: IDLRootType | FieldType | IDLInterfaceMemberType
  ): ExtendedAttribute = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], extAttrs = extAttrs.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], rhs = null)
    __obj.updateDynamic("type")("extended-attribute")
    __obj.asInstanceOf[ExtendedAttribute]
  }
  
  extension [Self <: ExtendedAttribute](x: Self) {
    
    inline def setArguments(value: js.Array[Argument]): Self = StObject.set(x, "arguments", value.asInstanceOf[js.Any])
    
    inline def setArgumentsVarargs(value: Argument*): Self = StObject.set(x, "arguments", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setParent(value: IDLRootType | FieldType | IDLInterfaceMemberType): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setRhs(value: ExtendedAttributeRightHandSide): Self = StObject.set(x, "rhs", value.asInstanceOf[js.Any])
    
    inline def setRhsNull: Self = StObject.set(x, "rhs", null)
    
    inline def setType(value: `extended-attribute`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
