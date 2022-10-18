package typings.vsoNodeApi.interfacesNotificationInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import typings.vsoNodeApi.interfacesCommonFormInputInterfacesMod.InputValuesQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FieldValuesQuery
  extends StObject
     with InputValuesQuery {
  
  @JSName("inputValues")
  var inputValues_FieldValuesQuery: js.Array[FieldInputValues]
  
  var scope: String
}
object FieldValuesQuery {
  
  inline def apply(
    currentValues: StringDictionary[String],
    inputValues: js.Array[FieldInputValues],
    resource: Any,
    scope: String
  ): FieldValuesQuery = {
    val __obj = js.Dynamic.literal(currentValues = currentValues.asInstanceOf[js.Any], inputValues = inputValues.asInstanceOf[js.Any], resource = resource.asInstanceOf[js.Any], scope = scope.asInstanceOf[js.Any])
    __obj.asInstanceOf[FieldValuesQuery]
  }
  
  extension [Self <: FieldValuesQuery](x: Self) {
    
    inline def setInputValues(value: js.Array[FieldInputValues]): Self = StObject.set(x, "inputValues", value.asInstanceOf[js.Any])
    
    inline def setInputValuesVarargs(value: FieldInputValues*): Self = StObject.set(x, "inputValues", js.Array(value*))
    
    inline def setScope(value: String): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
  }
}
