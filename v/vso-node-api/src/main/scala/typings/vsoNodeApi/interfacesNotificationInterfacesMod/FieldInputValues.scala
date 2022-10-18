package typings.vsoNodeApi.interfacesNotificationInterfacesMod

import typings.vsoNodeApi.interfacesCommonFormInputInterfacesMod.InputValue
import typings.vsoNodeApi.interfacesCommonFormInputInterfacesMod.InputValues
import typings.vsoNodeApi.interfacesCommonFormInputInterfacesMod.InputValuesError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FieldInputValues
  extends StObject
     with InputValues {
  
  var operators: js.Array[Double]
}
object FieldInputValues {
  
  inline def apply(
    defaultValue: String,
    error: InputValuesError,
    inputId: String,
    isDisabled: Boolean,
    isLimitedToPossibleValues: Boolean,
    isReadOnly: Boolean,
    operators: js.Array[Double],
    possibleValues: js.Array[InputValue]
  ): FieldInputValues = {
    val __obj = js.Dynamic.literal(defaultValue = defaultValue.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], inputId = inputId.asInstanceOf[js.Any], isDisabled = isDisabled.asInstanceOf[js.Any], isLimitedToPossibleValues = isLimitedToPossibleValues.asInstanceOf[js.Any], isReadOnly = isReadOnly.asInstanceOf[js.Any], operators = operators.asInstanceOf[js.Any], possibleValues = possibleValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[FieldInputValues]
  }
  
  extension [Self <: FieldInputValues](x: Self) {
    
    inline def setOperators(value: js.Array[Double]): Self = StObject.set(x, "operators", value.asInstanceOf[js.Any])
    
    inline def setOperatorsVarargs(value: Double*): Self = StObject.set(x, "operators", js.Array(value*))
  }
}
