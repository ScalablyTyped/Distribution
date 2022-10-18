package typings.vsoNodeApi.interfacesTestInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomTestField extends StObject {
  
  var fieldName: String
  
  var value: Any
}
object CustomTestField {
  
  inline def apply(fieldName: String, value: Any): CustomTestField = {
    val __obj = js.Dynamic.literal(fieldName = fieldName.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomTestField]
  }
  
  extension [Self <: CustomTestField](x: Self) {
    
    inline def setFieldName(value: String): Self = StObject.set(x, "fieldName", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
