package typings.tsStructureModel.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BasicType
  extends StObject
     with TypeModel {
  
  var basicName: String
  
  var modulePath: String
  
  var nameSpace: String
  
  var typeArguments: js.Array[TypeModel]
  
  var typeName: String
}
object BasicType {
  
  inline def apply(
    basicName: String,
    modulePath: String,
    nameSpace: String,
    typeArguments: js.Array[TypeModel],
    typeKind: TypeKind,
    typeName: String
  ): BasicType = {
    val __obj = js.Dynamic.literal(basicName = basicName.asInstanceOf[js.Any], modulePath = modulePath.asInstanceOf[js.Any], nameSpace = nameSpace.asInstanceOf[js.Any], typeArguments = typeArguments.asInstanceOf[js.Any], typeKind = typeKind.asInstanceOf[js.Any], typeName = typeName.asInstanceOf[js.Any])
    __obj.asInstanceOf[BasicType]
  }
  
  extension [Self <: BasicType](x: Self) {
    
    inline def setBasicName(value: String): Self = StObject.set(x, "basicName", value.asInstanceOf[js.Any])
    
    inline def setModulePath(value: String): Self = StObject.set(x, "modulePath", value.asInstanceOf[js.Any])
    
    inline def setNameSpace(value: String): Self = StObject.set(x, "nameSpace", value.asInstanceOf[js.Any])
    
    inline def setTypeArguments(value: js.Array[TypeModel]): Self = StObject.set(x, "typeArguments", value.asInstanceOf[js.Any])
    
    inline def setTypeArgumentsVarargs(value: TypeModel*): Self = StObject.set(x, "typeArguments", js.Array(value*))
    
    inline def setTypeName(value: String): Self = StObject.set(x, "typeName", value.asInstanceOf[js.Any])
  }
}
