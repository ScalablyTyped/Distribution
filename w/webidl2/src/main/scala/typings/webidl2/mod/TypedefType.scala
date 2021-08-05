package typings.webidl2.mod

import typings.webidl2.webidl2Strings.typedef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypedefType
  extends StObject
     with AbstractBase
     with IDLRootType {
  
  /** An IDL Type describing what typedef's type. */
  var idlType: IDLTypeDescription
  
  /** The typedef's name. */
  var name: String
  
  @JSName("parent")
  var parent_TypedefType: Null
  
  @JSName("type")
  var type_TypedefType: typedef
}
object TypedefType {
  
  inline def apply(extAttrs: js.Array[ExtendedAttribute], idlType: IDLTypeDescription, name: String, parent: Null): TypedefType = {
    val __obj = js.Dynamic.literal(extAttrs = extAttrs.asInstanceOf[js.Any], idlType = idlType.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("typedef")
    __obj.asInstanceOf[TypedefType]
  }
  
  extension [Self <: TypedefType](x: Self) {
    
    inline def setIdlType(value: IDLTypeDescription): Self = StObject.set(x, "idlType", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setParent(value: Null): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setType(value: typedef): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
