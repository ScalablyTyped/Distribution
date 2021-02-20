package typings.vsoNodeApi.notificationInterfacesMod

import typings.vsoNodeApi.formInputInterfacesMod.InputValue
import typings.vsoNodeApi.formInputInterfacesMod.InputValues
import typings.vsoNodeApi.formInputInterfacesMod.InputValuesError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FieldInputValues extends InputValues {
  
  var operators: js.Array[Double] = js.native
}
object FieldInputValues {
  
  @scala.inline
  def apply(
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
  
  @scala.inline
  implicit class FieldInputValuesMutableBuilder[Self <: FieldInputValues] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOperators(value: js.Array[Double]): Self = StObject.set(x, "operators", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperatorsVarargs(value: Double*): Self = StObject.set(x, "operators", js.Array(value :_*))
  }
}
