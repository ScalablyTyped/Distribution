package typings.vsoNodeApi.interfacesTestInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomTestFieldDefinition extends StObject {
  
  var fieldId: Double
  
  var fieldName: String
  
  var fieldType: CustomTestFieldType
  
  var scope: CustomTestFieldScope
}
object CustomTestFieldDefinition {
  
  inline def apply(fieldId: Double, fieldName: String, fieldType: CustomTestFieldType, scope: CustomTestFieldScope): CustomTestFieldDefinition = {
    val __obj = js.Dynamic.literal(fieldId = fieldId.asInstanceOf[js.Any], fieldName = fieldName.asInstanceOf[js.Any], fieldType = fieldType.asInstanceOf[js.Any], scope = scope.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomTestFieldDefinition]
  }
  
  extension [Self <: CustomTestFieldDefinition](x: Self) {
    
    inline def setFieldId(value: Double): Self = StObject.set(x, "fieldId", value.asInstanceOf[js.Any])
    
    inline def setFieldName(value: String): Self = StObject.set(x, "fieldName", value.asInstanceOf[js.Any])
    
    inline def setFieldType(value: CustomTestFieldType): Self = StObject.set(x, "fieldType", value.asInstanceOf[js.Any])
    
    inline def setScope(value: CustomTestFieldScope): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
  }
}
